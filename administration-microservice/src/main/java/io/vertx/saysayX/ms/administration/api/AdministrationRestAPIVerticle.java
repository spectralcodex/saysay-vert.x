package io.vertx.saysayX.ms.administration.api;


import io.vertx.core.Promise;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mail.MailResult;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.common.config.MailUtils;
import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.saysayX.ms.administration.pojo.CompanyBean;
import io.vertx.saysayX.ms.administration.pojo.UserBean;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class AdministrationRestAPIVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "administration-rest-api";

    //User endpoints
    private static final String API_ADD_USER = "/user";
    private static final String API_RETRIEVE_ALL_USER = "/users";
    private static final String API_RETRIEVE_USER = "/user/:uid";
    private static final String API_RETRIEVE_USER_BY_EMAIL = "/user/email/:email";
    private static final String API_UPDATE_USER = "/user/:uid";
    private static final String API_DELETE_USER = "/user/:uid";
    private static final String API_ACTIVATE_USER = "/user/on/:uid";
    private static final String API_VERIFY_USER = "/user/verify/:vid";
    private static final String API_RESEND_VERIFY_CODE = "/user/resend/:uid";

    //Company endpoints
    private static final String API_ADD_COMPANY = "/company";
    private static final String API_RETRIEVE_ALL_COMPANY = "/companies";
    private static final String API_RETRIEVE_COMPANY = "/company/:cid";
    private static final String API_UPDATE_COMPANY = "/company/:cid";
    private static final String API_DELETE_COMPANY = "/company/:cid";
    private static final String API_ACTIVATE_COMPANY = "/company/on/:cid";

    protected final static Logger logger = LoggerFactory.getLogger(AdministrationRestAPIVerticle.class);

    private final AdministrationService service;

    public AdministrationRestAPIVerticle(AdministrationService service) {
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();

        final Router router = enableRouteLoggingSupport(Router.router(vertx));

        //User routes
        router.post(API_ADD_USER).handler(this::apiAddUser);
        router.get(API_RETRIEVE_USER).handler(this::apiRetrieveUser);
        router.get(API_RETRIEVE_USER_BY_EMAIL).handler(this::apiRetrieveUserByEmail);
        router.get(API_RETRIEVE_ALL_USER).handler(this::apiRetrieveAllUser);
        router.patch(API_UPDATE_USER).handler(this::apiUpdateUser);
        router.delete(API_DELETE_USER).handler(this::apiDeleteUser);
        router.patch(API_ACTIVATE_USER).handler(this::apiActivateUser);
        router.patch(API_VERIFY_USER).handler(this::apiVerifyUser);
        router.patch(API_RESEND_VERIFY_CODE).handler(this::resendVerification);

        //Company routes
        router.post(API_ADD_COMPANY).handler(this::apiAddCompany);
        router.get(API_RETRIEVE_COMPANY).handler(this::apiRetrieveCompany);
        router.get(API_RETRIEVE_ALL_COMPANY).handler(this::apiRetrieveAllCompany);
        router.patch(API_UPDATE_COMPANY).handler(this::apiUpdateCompany);
        router.delete(API_DELETE_COMPANY).handler(this::apiDeleteCompany);
        router.delete(API_ACTIVATE_COMPANY).handler(this::apiActivateCompany);

        String host = config().getString("administration.http.address", "0.0.0.0");
        int port = config().getInteger("administration.http.port", 8082);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    //User APIs
    private void apiAddUser(RoutingContext context) {
        try {
            UserBean user = new UserBean(context.getBodyAsJson());
            //service.addUser(user, resultHandler(context, 201, "add"));
            Promise<MailResult> promise = Promise.promise();
            final String verifyCode = RandomStringUtils.randomAlphanumeric(11, 21);
            final String uid = "U" + UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
            user.setVerificationCode(verifyCode);
            user.setUid(uid);
            service.addUserByEmail(user, ar -> {
                if (ar.succeeded()) {
                    Integer res = ar.result();
                    if(res == 1) {
                        MailUtils.mailLocal(vertx, config().put("em.to", user.getEmail()).put("verifyCode", verifyCode),
                                mailRes -> {
                                    if (mailRes.failed()) {
                                        internalError(context, mailRes.cause());
                                        mailRes.cause().printStackTrace();
                                    }
                                });
                        context.response().setStatusCode(201)
                                .putHeader("Content-type", "application/json").end(res == null ? "{}" : new JsonObject().put("msg", res.toString())
                                .put("uid", uid).put("vid", verifyCode).encodePrettily());
                    } else{
                        context.response().setStatusCode(400).putHeader("Content-type", "application/json")
                                .end(new JsonObject().put("msg", res.toString()).encodePrettily());
                    }
                } else {
                    internalError(context, ar.cause());
                    ar.cause().printStackTrace();
                }
            });
        } catch (Exception e) {
            badRequest(context, e);
        }
    }

    private void apiRetrieveUser(RoutingContext context) {
        String uid = context.request().getParam("uid");
        service.retrieveUserById(uid, resultHandlerNonEmpty(context));
    }


    private void apiRetrieveUserByEmail(RoutingContext context) {
        String uid = context.request().getParam("email");
        service.retrieveUserByEmail(uid, resultHandlerNonEmpty(context));
    }

    private void apiRetrieveAllUser(RoutingContext ctx) {
        service.retrieveAllUsers(resultHandlerNonEmpty(ctx));
    }

    private void apiUpdateUser(RoutingContext ctx) {
        try {
            UserBean user = new UserBean(ctx.getBodyAsJson());
            user.setUid(ctx.request().getParam("uid"));
            service.updateUser(user, resultHandler(ctx, 200));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void apiDeleteUser(RoutingContext ctx) {
        String uid = ctx.request().getParam("uid");
        logger.info("{}", new UserBean().toJson());
        service.deleteUser(uid, deleteResultHandler(ctx));
    }

    private void apiActivateUser(RoutingContext ctx) {
        String uid = ctx.request().getParam("uid");
        UserBean user = new UserBean(ctx.getBodyAsJson());
        user.setUid(uid);
        service.activateUserByUid(user, resultHandler(ctx, 200));
    }

    private void apiVerifyUser(RoutingContext ctx) {
        String verifyCode = ctx.request().getParam("vid");
        service.verifyUser(verifyCode, expireResultHandler(ctx, 200));
    }

    //Company APIs
    private void apiAddCompany(RoutingContext ctx) {
        try {
            CompanyBean company = new CompanyBean(ctx.getBodyAsJson());
            service.addCompany(company, resultHandler(ctx, 201, "success"));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void apiRetrieveCompany(RoutingContext ctx) {
        String cid = ctx.request().getParam("cid");
        service.retrieveCompanyById(cid, resultHandlerNonEmpty(ctx));
    }

    private void apiRetrieveAllCompany(RoutingContext ctx) {
        //String cid = ctx.request().getParam("cid");
        service.retrieveAllCompany(resultHandlerNonEmpty(ctx));
    }

    private void apiUpdateCompany(RoutingContext ctx) {
        try {
            CompanyBean company = new CompanyBean(ctx.getBodyAsJson());
            company.setCid(ctx.request().getParam("cid"));
            service.updateCompanyById(company, resultHandler(ctx, 200));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void apiDeleteCompany(RoutingContext ctx) {
        String cid = ctx.request().getParam("cid");
        service.deleteCompany(cid, deleteResultHandler(ctx));
    }

    private void apiActivateCompany(RoutingContext ctx) {
        String cid = ctx.request().getParam("cid");
        service.activateCompany(cid, resultHandler(ctx, 200));
    }

    //Extras
    public void resendVerification(RoutingContext context){
        try {
            UserBean user = new UserBean(context.getBodyAsJson());
            final String verifyCode = RandomStringUtils.randomAlphanumeric(11, 21);
            user.setVerificationCode(verifyCode);
            service.updateUserVerificationCode(user, ar -> {
                if (ar.succeeded()) {
                    Integer res = ar.result();
                    if(res == 1)
                        MailUtils.mailLocal(vertx, config().put("em.to", user.getEmail()).put("verifyCode", verifyCode),
                                mailRes -> {
                                    if(mailRes.failed()){
                                        internalError(context, ar.cause());
                                        mailRes.cause().printStackTrace();
                                    }
                                });
                    context.response().setStatusCode(200)
                            .putHeader("Content-type", "application/json").end(res == null ? "{}" : new JsonObject().put("msg", res.toString()).encodePrettily());
                } else {
                    internalError(context, ar.cause());
                    ar.cause().printStackTrace();
                }
            });
        } catch (Exception e) {
            badRequest(context, e);
        }
    }

}
