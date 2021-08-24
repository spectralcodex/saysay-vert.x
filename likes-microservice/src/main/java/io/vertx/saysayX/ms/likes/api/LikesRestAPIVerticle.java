package io.vertx.saysayX.ms.likes.api;

import io.vertx.core.Promise;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.ms.likes.LikesService;
import io.vertx.saysayX.ms.likes.pojo.LikesBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LikesRestAPIVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "Likes-rest-api";
    
    //Likes endpoints
    private static final String API_ADD = "/post";
    private static final String API_RETRIEVE = "/:lid";
    private static final String API_UPDATE = "/:lid";
    private static final String API_DELETE = "/:lid";
    private static final String API_RETRIEVE_ALL_BY_ID= "/get/:authorId";
    private static final String API_RETRIEVE_ALL= "/all";

    protected final static Logger logger = LoggerFactory.getLogger(LikesRestAPIVerticle.class);

    private final LikesService service;
    
    public LikesRestAPIVerticle(LikesService service){
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();
        final Router router = enableRouteLoggingSupport(Router.router(vertx));
        
        router.post(API_ADD).handler(this::createLikes);
        router.get(API_RETRIEVE).handler(this::getLikes);
        router.patch(API_UPDATE).handler(this::editLikes);
        router.delete(API_DELETE).handler(this::removeLikes);
        router.get(API_RETRIEVE_ALL_BY_ID).handler(this::getLikesByAuthorId);
        router.get(API_RETRIEVE_ALL).handler(this::getAllLikes);
        
        String host = config().getString("likes.http.address", "0.0.0.0");
        int port = config().getInteger("likes.http.port", 8085);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    private void createLikes(RoutingContext ctx) {
        try {
            logger.info("{}", ctx.getBodyAsJson());
            LikesBean Likes = new LikesBean(ctx.getBodyAsJson());
           /* service.addStory(story, resultHandler(ctx, r -> {
                String result = new JsonObject().put("message", "user_added").encodePrettily();
                ctx.response().setStatusCode(201)
                        .putHeader("content-type", "application/json")
                        .end(result);
            }));*/
            service.addLikes(Likes, resultHandler(ctx, 201, "user_added"));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void getLikes(RoutingContext ctx){
        String lid = ctx.request().getParam("lid");
        logger.info("finding Likes --> {}", lid);
        logger.info("{}", new LikesBean().toJson());
        service.retrieveLikes(lid, resultHandlerNonEmpty(ctx));

    }

    private void editLikes(RoutingContext ctx){
        try{
            LikesBean Likes = new LikesBean(ctx.getBodyAsJson());
            Likes.setLid(ctx.request().getParam("cid"));
            service.updateLikes(Likes, resultHandler(ctx, 200));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            badRequest(ctx, e);
        }
    }

    private void getLikesByAuthorId(RoutingContext ctx){
        String authorId = ctx.request().getParam("authorId");
        service.retrieveLikesByAuthorId(authorId, resultHandlerNonEmpty(ctx));
    }

    private void getAllLikes(RoutingContext ctx){
        service.retrieveAllLikes(resultHandlerNonEmpty(ctx));
        //notImplemented(ctx);
    }

    private void removeLikes(RoutingContext ctx){
        try {
            String lid = ctx.request().getParam("lid");
            service.deleteLikes(lid, deleteResultHandler(ctx));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            internalError(ctx, e);
        }
    }
}
