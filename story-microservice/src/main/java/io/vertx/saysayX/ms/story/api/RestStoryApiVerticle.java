package io.vertx.saysayX.ms.story.api;

import io.vertx.core.Promise;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.saysayX.common.RestAPIVerticle;
import io.vertx.saysayX.ms.story.StoryService;
import io.vertx.saysayX.ms.story.jpojo.Story;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestStoryApiVerticle extends RestAPIVerticle {
    public static final String SERVICE_NAME = "story-rest-api";
    private static final String API_ADD_STORY = "/add";
    private static final String API_RETRIEVE_ALL_STORIES = "/stories";
    private static final String API_RETRIEVE_STORY = "/:id";
    private static final String API_UPDATE_STORY = "/:story";
    private static final String API_DELETE_STORY = "/id";
    private static final String API_DELETE_ALL_STORIES= "/all";
    protected final static Logger logger = LoggerFactory.getLogger(RestStoryApiVerticle.class);

    private final StoryService service;

    public RestStoryApiVerticle(StoryService service){
        this.service = service;
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();
        final Router router = enableRouteLoggingSupport(Router.router(vertx));

        router.post(API_ADD_STORY).handler(this::newStory);
        router.get(API_RETRIEVE_STORY).handler(this::getStory);

        String host = config().getString("story.http.address", "0.0.0.0");
        int port = config().getInteger("story.http.port", 8082);

        createHttpServer(router, host, port)
                .compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port))
                .onComplete(startPromise);
    }

    private void newStory(RoutingContext ctx){
        try {
            //logger.info("{}", ctx.getBodyAsJson());
            Story story = new Story(ctx.getBodyAsJson());
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
        String id = ctx.request().getParam("id");
        logger.info("finding story --> {}", id);
        service.retrieveStory(id, resultHandlerNonEmpty(ctx));

    }
}
