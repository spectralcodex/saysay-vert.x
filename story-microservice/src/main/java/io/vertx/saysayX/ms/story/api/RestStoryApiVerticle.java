package io.vertx.saysayX.ms.story.api;

import io.vertx.core.Promise;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.ms.story.StoryService;
import io.vertx.saysayX.ms.story.pojo.StoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestStoryApiVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "story-rest-api";
    private static final String API_ADD = "/post";
    private static final String API_RETRIEVE = "/:sid";
    private static final String API_UPDATE = "/:sid";
    private static final String API_DELETE = "/:sid";
    private static final String API_RETRIEVE_ALL_BY_ID= "/get/:authorId";
    private static final String API_RETRIEVE_ALL= "/all";

    protected final static Logger logger = LoggerFactory.getLogger(RestStoryApiVerticle.class);

    private final StoryService service;
    public RestStoryApiVerticle(StoryService service){
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();
        final Router router = enableRouteLoggingSupport(Router.router(vertx));

        router.post(API_ADD).handler(this::putStory);
        router.get(API_RETRIEVE).handler(this::getStory);
        router.patch(API_UPDATE).handler(this::editStory);
        router.delete(API_DELETE).handler(this::removeStory);
        router.get(API_RETRIEVE_ALL_BY_ID).handler(this::getStoryByAuthorId);
        router.get(API_RETRIEVE_ALL).handler(this::getStoryByAuthorId);

        String host = config().getString("story.http.address", "0.0.0.0");
        int port = config().getInteger("story.http.port", 8082);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    private void putStory(RoutingContext ctx) {
        try {
            logger.info("{}", ctx.getBodyAsJson());
            StoryBean story = new StoryBean(ctx.getBodyAsJson());
           /* service.addStory(story, resultHandler(ctx, r -> {
                String result = new JsonObject().put("message", "user_added").encodePrettily();
                ctx.response().setStatusCode(201)
                        .putHeader("content-type", "application/json")
                        .end(result);
            }));*/
            service.addStory(story, resultHandler(ctx, 201, "user_added"));
        } catch (Exception e) {
            badRequest(ctx, e);
        }
    }

    private void getStory(RoutingContext ctx){
        String sid = ctx.request().getParam("sid");
        logger.info("finding story --> {}", sid);
        logger.info("{}", new StoryBean().toJson());
        service.retrieveStory(sid, resultHandlerNonEmpty(ctx));

    }

    private void editStory(RoutingContext ctx){
        try{
            StoryBean story = new StoryBean(ctx.getBodyAsJson());
            story.setSid(ctx.request().getParam("sid"));
            service.updateStory(story, resultHandler(ctx, 200));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            badRequest(ctx, e);
        }
    }

    private void getStoryByAuthorId(RoutingContext ctx){
        String authorId = ctx.request().getParam("authorId");
        service.retrieveStoryByAuthorId(authorId, resultHandlerNonEmpty(ctx));
    }

    private void getStories(RoutingContext ctx){
        service.retrieveAllStories(resultHandlerNonEmpty(ctx));
        notImplemented(ctx);
    }

    private void removeStory(RoutingContext ctx){
        try {
            String sid = ctx.request().getParam("sid");
            service.deleteStory(sid, deleteResultHandler(ctx));
        } catch (Exception e){
            logger.error("{}", e.getMessage());
            internalError(ctx, e);
        }
    }
}
