package io.vertx.saysayX.common;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;
import io.vertx.core.http.CookieSameSite;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.RequestLogHandler;
import io.vertx.ext.auth.AuthProvider;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.*;
import io.vertx.ext.web.sstore.ClusteredSessionStore;
import io.vertx.ext.web.sstore.LocalSessionStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

//import io.vertx.core.http.CookieSameSite;
//import io.vertx.core.http.CookieSameSite;


public class RestAPIVerticle extends BaseMicroserviceVerticle {
    private static final Logger logger = LoggerFactory.getLogger(RestAPIVerticle.class);

    /**
     * @param router microservice router
     * @param host   http host
     * @param port   http port
     * @return jooq.async result
     */
    protected Future<Void> createHttpServer(Router router, String host, int port) {
        Promise<HttpServer> httpServerPromise = Promise.promise();
        vertx.createHttpServer()
                .requestHandler(router)
                .listen(port, host, httpServerPromise);
        return httpServerPromise.future().map(r -> null);
    }

    protected Router enableRouteLoggingSupport(Router router) {
        Router route = router;
        // set router options
        route.route().handler(BodyHandler.create().setBodyLimit(10 * 1024 * 1024)); // 10MB max body size
        route.route().handler(ResponseTimeHandler.create()); // add a response header: x-response-time: xyzms
        route.route().handler(TimeoutHandler.create(500)); // request timeout in ms
        route.route().failureHandler(ErrorHandler.create(false)); // no exception details

        // use customized request logger
        // there are three logger format: DEFAULT, SHORT, TINY, see Slf4jRequestLogger.java for details
        // you can make it configurable, e.g. dev using DEFAULT, prod using TINY
        LoggerFormat loggerFormat = LoggerFormat.TINY;
        route.route().handler(RequestLogHandler.create(loggerFormat));

        return route;
    }

    /**
     * @param router router instance
     */
    protected void enableCorsSupport(Router router) {
        Set<String> allowHeaders = new HashSet<>();
        allowHeaders.add("x-requested-with");
        allowHeaders.add("Access-Control-Allow-Origin");
        allowHeaders.add("origin");
        allowHeaders.add("Content-Type");
        allowHeaders.add("accept");

        Set<HttpMethod> allowMethods = new HashSet<>();
        allowMethods.add(HttpMethod.GET);
        allowMethods.add(HttpMethod.PUT);
        allowMethods.add(HttpMethod.OPTIONS);
        allowMethods.add(HttpMethod.POST);
        allowMethods.add(HttpMethod.DELETE);
        allowMethods.add(HttpMethod.PATCH);

        router.route().handler(CorsHandler.create("*")
                .allowedHeaders(allowHeaders)
                .allowedMethods(allowMethods));
    }

    /**
     * Enable local session support for session storage
     *
     * @param router router instance
     */
    protected void enableLocalSession(Router router, AuthProvider authProvider) {
        //router.route().handler(CookieHandler.create()); //deprecated
        router.route().handler(SessionHandler.create(
                LocalSessionStore.create(vertx, "erp.user.session"))
                .setAuthProvider(authProvider)
                .setCookieSameSite(CookieSameSite.STRICT) //help prevent csrf
                .setCookieSecureFlag(true));
    }

    /**
     * Enable clustered session support for session storage
     *
     * @param router Clustered session store
     */
    protected void enableClusteredSession(Router router) {
        //router.route().handler(CookieHandler.create()); deprecated
        router.route().handler(SessionHandler.create(ClusteredSessionStore.create(vertx))
                .setCookieSameSite(CookieSameSite.STRICT)
                .setCookieSecureFlag(true));
    }

    /**
     * Used to validate user login process
     *
     * @param context    routing context from rest
     * @param biConsumer be able to get both results together
     */
    protected void requireLogin(RoutingContext context, BiConsumer<RoutingContext, JsonObject> biConsumer) {
        Optional<JsonObject> principal = Optional.ofNullable(context.request().getHeader("user-principal"))
                .map(JsonObject::new);
        if (principal.isPresent()) {
            biConsumer.accept(context, principal.get());
        } else {
            context.response()
                    .setStatusCode(401)
                    .end(new JsonObject().put("msg", "need_auth").encode());
        }
    }

    //Helper methods for REST API {PUT,GET,POST} calls

    protected <T> Handler<AsyncResult<T>> resultHandler(RoutingContext context, Handler<T> handler) {
        return ar -> {
            if (ar.succeeded()) {
                handler.handle(ar.result());
            } else {
                //logger.error(ar.cause().getMessage());
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }

    protected <T> Handler<AsyncResult<T>> resultHandler(RoutingContext context) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                context.response().putHeader("Content-type", "application/json")
                        .end(res == null ? "{}" : res.toString());
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }

    protected <T> Handler<AsyncResult<T>> resultHandler(RoutingContext context, int status) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                if (res == null)
                    serviceUnavailable(context, "invalid_result");
                else if (res.toString().equals("0")) {
                    notFound(context);
                } else {
                    context.response()
                            .setStatusCode(status == 0 ? 200 : status)
                            .putHeader("Content-type", "application/json")
                            //res must always be > 0
                            .end(new JsonObject().put("msg", res.toString()).encodePrettily());
                    //.end(res == null ? "{}" : new JsonObject().put("msg", res.toString()).encodePrettily());
                }
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };

    }

    protected <T> Handler<AsyncResult<T>> resultHandler(RoutingContext context, int status, String msg) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                context.response()
                        .setStatusCode(status == 0 ? 200 : status)
                        .putHeader("Content-type", "application/json")
                        .end(res == null ? "{}" : new JsonObject().put("msg", res.toString()).encodePrettily());

            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };

    }

    protected <T> Handler<AsyncResult<T>> resultHandler(RoutingContext context, Function<T, String> converter) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                if (res == null) {
                    serviceUnavailable(context, "invalid_result");
                } else {
                    context.response()
                            .putHeader("content-type", "application/json")
                            .end(converter.apply(res));
                }
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();

            }
        };
    }

    protected <T> Handler<AsyncResult<T>> resultHandlerNonEmpty(RoutingContext context, Function<T, String> converter) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                if (res == null) {
                    notFound(context);
                } else {
                    context.response()
                            .putHeader("content-type", "application/json")
                            .end(converter.apply(res));
                }
            } else {
                //logger.error(ar.cause());
                internalError(context, ar.cause());
                ar.cause().printStackTrace();

            }
        };
    }

    protected <T> Handler<AsyncResult<T>> resultHandlerNonEmpty(RoutingContext context) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                //logger.info("RESULT-->" + res);
                if (res == null) {
                    notFound(context);
                } else {
                    context.response()
                            .putHeader("content-type", "application/json")
                            .end(res.toString());
                }
            } else {
                //logger.error(ar.cause());
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }

    protected <T> Handler<AsyncResult<T>> rawResultHandler(RoutingContext context) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                context.response()
                        .end(res == null ? "" : res.toString());
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }


    /**
     * This method generates handler for jooq.async methods in REST APIs.
     * The result is not needed. Only the state of the jooq.async result is required.
     *
     * @param context routing context instance
     * @param result  result content
     * @param status  status code
     * @return generated handler
     */
    protected Handler<AsyncResult<Void>> resultVoidHandler(RoutingContext context, JsonObject result, int status) {
        return ar -> {
            if (ar.succeeded()) {
                context.response()
                        .setStatusCode(status == 0 ? 200 : status)
                        .putHeader("content-type", "application/json")
                        .end(result.encodePrettily());
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }


    protected Handler<AsyncResult<Void>> resultVoidHandler(RoutingContext context, int status) {
        return ar -> {
            if (ar.succeeded()) {
                context.response()
                        .setStatusCode(status == 0 ? 200 : status)
                        .putHeader("content-type", "application/json")
                        .end();
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }

    //Methods for REST DELETE API calls

    /**
     * This method generates handler for jooq.async methods in REST DELETE APIs.
     * Return format in JSON (successful status = 204):
     * <code>
     * {"message": "delete_success"}
     * </code>
     *
     * @param context routing context instance
     * @return generated handler
     */

    protected <T> Handler<AsyncResult<T>> deleteResultHandler(RoutingContext context) {
        return ar -> {
            if (ar.succeeded()) {
                T res = ar.result();
                context.response().setStatusCode(200)
                        .putHeader("content-type", "application/json")
                        .end(res == null ? "{}" : new JsonObject().put("msg", res.toString()).encodePrettily());
            } else {
                internalError(context, ar.cause());
                ar.cause().printStackTrace();
            }
        };
    }


    // helper method dealing with failure

    protected void internalError(RoutingContext context, Throwable ex) {
        context.response().setStatusCode(500)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", ex.getMessage()).encodePrettily());
    }

    protected void notImplemented(RoutingContext context) {
        context.response().setStatusCode(501)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("message", "not_implemented").encodePrettily());
    }

    protected void badGateway(Throwable ex, RoutingContext context) {
        ex.printStackTrace();
        context.response()
                .setStatusCode(502)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", "bad_gateway")
                        //.put("message", ex.getMessage())
                        .encodePrettily());
    }

    protected void serviceUnavailable(RoutingContext context) {
        context.fail(503);
    }

    protected void serviceUnavailable(RoutingContext context, Throwable ex) {
        context.response().setStatusCode(503)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", ex.getMessage()).encodePrettily());
    }

    protected void serviceUnavailable(RoutingContext context, String cause) {
        context.response().setStatusCode(503)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", cause).encodePrettily());
    }

    protected void badRequest(RoutingContext context, Throwable ex) {
        context.response().setStatusCode(400)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", ex.getMessage()).encodePrettily());
    }

    protected void badRequest(RoutingContext context, String msg) {
        context.response().setStatusCode(400)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("error", msg).encodePrettily());
    }

    protected void notFound(RoutingContext context) {
        context.response().setStatusCode(404)
                .putHeader("content-type", "application/json")
                .end(new JsonObject().put("message", "not_found").encodePrettily());
    }
}
