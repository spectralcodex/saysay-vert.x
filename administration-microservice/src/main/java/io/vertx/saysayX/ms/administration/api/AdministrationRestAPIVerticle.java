package io.vertx.saysayX.ms.administration.api;


import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.common.config.MailUtils;
import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.saysayX.ms.administration.pojo.CompanyBean;
import io.vertx.saysayX.ms.administration.pojo.UserBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdministrationRestAPIVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "administration-rest-api";

    //User endpoints
    private static final String API_ADD_USER = "/user";
    private static final String API_RETRIEVE_ALL_USER = "/users";
    private static final String API_RETRIEVE_USER = "/user/:uid";
    private static final String API_UPDATE_USER = "/user/:uid";
    private static final String API_DELETE_USER = "/user/:uid";
    private static final String API_ACTIVATE_USER = "/user/on/:uid";

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
        router.get(API_RETRIEVE_ALL_USER).handler(this::apiRetrieveAllUser);
        router.patch(API_UPDATE_USER).handler(this::apiUpdateUser);
        router.delete(API_DELETE_USER).handler(this::apiDeleteUser);
        router.patch(API_ACTIVATE_USER).handler(this::apiActivateUser);

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
            service.addUser(user, ar -> {
                if (ar.succeeded()) {
                    Integer res = ar.result();
                    MailUtils.mailLocal(vertx, config().put("em.to", user.getEmail()), mailRes -> {
                        if (mailRes.succeeded()) {
                            context.response()
                                    .setStatusCode(201)
                                    .putHeader("Content-type", "application/json")
                                    .end(res == null ? "{}" : new JsonObject().put("msg", res.toString())
                                            .put("mailMsg", mailRes.result()).encodePrettily());
                            //{"messageId":"<msg.1622978709033.vertxmail.0@localhost>","recipients":["lightskinnedwarrior30@gmail.com"]}
                        } else {
                            internalError(context, mailRes.cause());
                            mailRes.cause().printStackTrace();
                        }
                    });
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
        service.activateUser(uid, resultHandler(ctx, 200));
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
        String cid = ctx.request().getParam("cid");
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
}
