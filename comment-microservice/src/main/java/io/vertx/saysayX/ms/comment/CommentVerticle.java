package io.vertx.saysayX.ms.comment;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.saysayX.common.BaseMicroserviceVerticle;
import io.vertx.saysayX.ms.comment.api.CommentRestAPIVerticle;
import io.vertx.saysayX.ms.comment.impl.JooqCommentServiceImpl;
import io.vertx.serviceproxy.ProxyHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentVerticle extends BaseMicroserviceVerticle {
    private final static Logger logger = LoggerFactory.getLogger(CommentVerticle.class);

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();

        // create the service instance
        final CommentService service = new JooqCommentServiceImpl(vertx, config());

        // register the service proxy on event bus NB: must change from ProxyHelper to ServiceBinder
        ProxyHelper.registerService(CommentService.class, vertx, service, service.SERVICE_ADDRESS);

        logger.info("Initializing config::: {}", config());

        //Smuggling the service instance
        //loadConfigsAndRegisterService()
        /*
         * Ping database and-then publish the service in the discovery infrastructure
         */
        pingPersistence(service)
                .compose(databaseOK -> publishEventBusService(CommentService.SERVICE_NAME,
                        CommentService.SERVICE_ADDRESS, databaseOK))
                .compose(servicePublishedOk -> deployRestService(servicePublishedOk))
                .onComplete(startPromise);
    }

    /**
     * Ping the persistence backend to see if its up
     *
     * @param service instance
     * @return service instance to be used in next stage
     */
    private Future<CommentService> pingPersistence(final CommentService service) {
        Promise<Void> initPromise = Promise.promise();
        service.init(initPromise);
        return initPromise.future().map(r -> {
            ///Perform some init db operations here
            return service;
        });
    }

    /**
     * Deploy the Comment microservice
     *
     * @param service instance
     * @return future deployed Verticle
     */
    private Future<Void> deployRestService(CommentService service) {
        Promise<String> promise = Promise.promise();
        vertx.deployVerticle(new CommentRestAPIVerticle(service),
                new DeploymentOptions().setConfig(config()),
                promise);
        return promise.future().map(ret -> null);
    }

}
