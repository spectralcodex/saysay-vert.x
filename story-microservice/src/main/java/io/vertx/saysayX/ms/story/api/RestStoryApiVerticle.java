package io.vertx.saysayX.ms.story.api;

import io.vertx.core.Promise;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.ms.story.StoryService;
import io.vertx.saysayX.ms.story.pojo.StoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestStoryApiVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "story-rest-api";
    private static final String API_ADD_STORY = "/story";
    private static final String API_RETRIEVE_STORY = "/story/:storyId";
    private static final String API_RETRIEVE_STORY_AUTHID = "/:authorId";
    private static final String API_UPDATE_STORY = "/story/:storyId";
    private static final String API_DELETE_STORY = "/story/:storyId";
    private static final String API_RETRIEVE_STORIES= "/story/all/:authorId";
    protected final static Logger logger = LoggerFactory.getLogger(RestStoryApiVerticle.class);

    private final StoryService service;
    public RestStoryApiVerticle(StoryService service){
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();
        final Router router = enableRouteLoggingSupport(Router.router(vertx));

        router.post(API_ADD_STORY).handler(this::putStory);
        router.get(API_RETRIEVE_STORY).handler(this::getStory);
        router.patch(API_UPDATE_STORY).handler(this::editStory);
        router.delete(API_DELETE_STORY).handler(this::removeStory);
        router.get(API_RETRIEVE_STORIES).handler(this::getStoriesByAuthorId);
        router.get(API_RETRIEVE_STORY_AUTHID).handler(this::getStoryByAuthorId);

        String host = config().getString("story.http.address", "0.0.0.0");
        int port = config().getInteger("story.http.port", 8082);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    private void putStory(RoutingContext ctx) {
        try {
            StoryBean story = new StoryBean(ctx.getBodyAsJson());
            service.addStory(story, resultHandler(ctx, r -> {
                String result = new JsonObject().put("message", "user_added").encodePrettily();
                ctx.response().setStatusCode(201)
                        .putHeader("content-type", "application/json")
                        .end(result);
            }));
        } catch (DecodeException e) {
            badRequest(ctx, e);
        }
    }

    private void getStory(RoutingContext ctx){
        String id = ctx.request().getParam("storyId");
        logger.info("finding story --> {}", id);
        service.retrieveStory(id, resultHandlerNonEmpty(ctx));

    }

    private void editStory(RoutingContext ctx){
        try{
            StoryBean story = new StoryBean(ctx.getBodyAsJson());
            story.setStoryId(ctx.request().getParam("storyId"));
            service.updateStory(story, resultHandler(ctx, 200));
        } catch (DecodeException e){
            badRequest(ctx, e);
        }
    }

    private void getStoryByAuthorId(RoutingContext ctx){
        String authorId = ctx.request().getParam("authorId");
        service.retrieveStoryByAuthorId(authorId, resultHandlerNonEmpty(ctx));
    }

    private void getStoriesByAuthorId(RoutingContext ctx){
        //String authorId = ctx.request().getParam("authorId");
        //service.retrieveAllStoriesByAuthorId(authorId, resultHandler(ctx, Json::encodePrettily));
        notImplemented(ctx);
    }

    private void removeStory(RoutingContext ctx){
        String id = ctx.request().getParam("storyId");
        service.deleteStory(id, deleteResultHandler(ctx));
    }
}
