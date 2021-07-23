package io.vertx.saysayX.ms.comment.api;

import io.vertx.core.Promise;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.ms.comment.CommentService;
import io.vertx.saysayX.ms.comment.pojo.CommentBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentRestAPIVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "comment-rest-api";
    
    //comment endpoints
    private static final String API_ADD = "/post";
    private static final String API_RETRIEVE = "/:cid";
    private static final String API_UPDATE = "/:cid";
    private static final String API_DELETE = "/:cid";
    private static final String API_RETRIEVE_ALL_BY_ID= "/get/:authorId";
    private static final String API_RETRIEVE_ALL= "/all/comments";

    protected final static Logger logger = LoggerFactory.getLogger(CommentRestAPIVerticle.class);

    private final CommentService service;
    
    public CommentRestAPIVerticle(CommentService service){
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();
        final Router router = enableRouteLoggingSupport(Router.router(vertx));

        router.post(API_ADD).handler(this::createComment);
        router.get(API_RETRIEVE).handler(this::getComment);
        router.patch(API_UPDATE).handler(this::editComment);
        router.delete(API_DELETE).handler(this::removeComment);
        router.get(API_RETRIEVE_ALL_BY_ID).handler(this::getCommentByAuthorId);
        router.get(API_RETRIEVE_ALL).handler(this::getComments);

        String host = config().getString("comment.http.address", "0.0.0.0");
        int port = config().getInteger("comment.http.port", 8084);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    private void createComment(RoutingContext ctx) {
        try {
            logger.info("{}", ctx.getBodyAsJson());
            CommentBean comment = new CommentBean(ctx.getBodyAsJson());
           /* service.addStory(story, resultHandler(ctx, r -> {
                String result = new JsonObject().put("message", "user_added").encodePrettily();
                ctx.response().setStatusCode(201)
                        .putHeader("content-type", "application/json")
                        .end(result);
            }));*/
            service.addComment(comment, resultHandler(ctx, 201, "user_added"));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void getComment(RoutingContext ctx){
        String cid = ctx.request().getParam("cid");
        logger.info("finding comment --> {}", cid);
        logger.info("{}", new CommentBean().toJson());
        service.retrieveComment(cid, resultHandlerNonEmpty(ctx));

    }

    private void editComment(RoutingContext ctx){
        try{
            CommentBean comment = new CommentBean(ctx.getBodyAsJson());
            comment.setCid(ctx.request().getParam("cid"));
            service.updateComment(comment, resultHandler(ctx, 200));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            badRequest(ctx, e);
        }
    }

    private void getCommentByAuthorId(RoutingContext ctx){
        String authorId = ctx.request().getParam("authorId");
        service.retrieveCommentByAuthorId(authorId, resultHandlerNonEmpty(ctx));
    }

    private void getComments(RoutingContext ctx){
        service.retrieveAllComments(resultHandlerNonEmpty(ctx));
        //notImplemented(ctx);
    }

    private void removeComment(RoutingContext ctx){
        try {
            String sid = ctx.request().getParam("cid");
            service.deleteComment(sid, deleteResultHandler(ctx));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            internalError(ctx, e);
        }
    }
}
