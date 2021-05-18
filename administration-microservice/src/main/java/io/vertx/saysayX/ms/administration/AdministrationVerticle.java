package io.vertx.saysayX.ms.administration;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.saysayX.ms.administration.api.AdministrationRestAPIVerticle;
import io.vertx.saysayX.ms.administration.impl.AdministrationImpl;
import io.vertx.saysayX.common.BaseMicroserviceVerticle;
import io.vertx.serviceproxy.ProxyHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdministrationVerticle extends BaseMicroserviceVerticle {
    //private static final long SCAN_PERIOD = 20000L;
    //private final static InputStream CONFIG_IN = AdministrationVerticle.class.getClassLoader().getResourceAsStream(PropertiesCache.getInstance().getProperty("local.config.file"));
    //private static final String PATH = " /administration-microservice/conf/local.json ";
    private final static Logger logger = LoggerFactory.getLogger(AdministrationVerticle.class);

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        super.start();

        // create the service instance
        final AdministrationService service = new AdministrationImpl(vertx, config());

        // register the service proxy on event bus NB: must change from ProxyHelper to ServiceBinder
        ProxyHelper.registerService(AdministrationService.class, vertx, service, service.SERVICE_ADDRESS);

        logger.info("Initializing config::: {}", config());

        //Smuggling the service instance
        //loadConfigsAndRegisterService()
        /*
         * Ping database and-then publish the service in the discovery infrastructure
         */
        pingPersistence(service)
                .compose(databaseOK -> publishEventBusService(AdministrationService.SERVICE_NAME,
                        AdministrationService.SERVICE_ADDRESS, databaseOK))
                .compose(servicePublishedOk -> deployRestService(servicePublishedOk))
                .onComplete(startPromise);
    }

    /**
     * Ping the persistence backend to see if its up
     *
     * @param service instance
     * @return service instance to be used in next stage
     */
    private Future<AdministrationService> pingPersistence(final AdministrationService service) {
        Promise<Void> initPromise = Promise.promise();
        service.initializePersistence(initPromise);
        return initPromise.future().map(r -> {
            ///Perform some init db operations here
            return service;
        });
    }

    /**
     * Deploy the admin microservice
     *
     * @param service instance
     * @return future deployed Verticle
     */
    private Future<Void> deployRestService(AdministrationService service) {
        Promise<String> promise = Promise.promise();
        vertx.deployVerticle(new AdministrationRestAPIVerticle(service),
                new DeploymentOptions().setConfig(config()),
                promise);
        return promise.future().map(ret -> null);
    }


    /**
     * Load configurations, create and register the service for propagation
     *
     * @return service instance to be use in next stage
     */
   /* private Future<AdministrationService> loadConfigsAndRegisterService() throws Exception {
        Promise<JsonObject> initConfigPromise = Promise.promise();

        //get environmental variables using the path provided
        configurationRetriever
                .usingScanPeriod(SCAN_PERIOD)
                .withJsonStore(CONFIG_IN)
                .createConfig(vertx)
                .onComplete(initConfigPromise);
        return initConfigPromise.future().map(conf -> {

            // create the service instance
            final AdministrationService service = new AdministrationImpl(vertx, config().mergeIn(conf));

            // register the service proxy on event bus NB: must change from ProxyHelper to ServiceBinder
            ProxyHelper.registerService(AdministrationService.class, vertx, service, service.SERVICE_ADDRESS);

            logger.info("Initializing config::: {}", config());
            return service;
        });
    }*/
}
