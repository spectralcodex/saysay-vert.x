package io.vertx.saysayX.ms.administration;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.administration.pojo.UserBean;

import java.util.List;

/**
 * A service interface managing Users.
 * <p>
 * This service is an event bus service (aka. service proxy)
 * </p>
 *
 * @author Spectral
 */
@VertxGen
@ProxyGen
public interface AdministrationService{
    /**
     * The name of the event bus service.
     */
    String SERVICE_NAME = "administration-eb-service";

    /**
     * The address on which the service is published.
     */
    String SERVICE_ADDRESS = "service.administration";

    //User operations
    /**
     * @param resultHandler the result handler will be called as soon as the initialization has been accomplished.
     *                      The jooq.async result indicates whether the operation was successful or not.
     */

    @Fluent
    AdministrationService initializePersistence(Handler<AsyncResult<Void>> resultHandler);

    /**
     * Add a User to the persistence.
     * @param user       a  User entity that we want to add
     * @param resultHandler the result handler will be called as soon as the User has been added. The jooq.async result
     *                      indicates whether the operation was successful or not.
     */
    @Fluent
    AdministrationService addUser(UserBean user, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * @param userId
     * @param resultHandler
     * @return
     */
    @Fluent
    AdministrationService retrieveUserById(String userId, Handler<AsyncResult<JsonObject>> resultHandler);

    /**
     * @param email
     * @param resultHandler
     * @return
     */
    @Fluent
    AdministrationService retrieveUserByEmail(String email, Handler<AsyncResult<JsonObject>> resultHandler);

    /**
     * @param userId
     * @param resultHandler
     * @return
     */
    @Fluent
    AdministrationService deleteUser(String userId, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * @param userId userId we want to query for
     * @param resultHandler this handler will return as soon as update is complete. The jooq.async result
     *      *                      indicates whether the operation was successful or not.
     * @return
     */
    @Fluent
    AdministrationService updateUser(String userId, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * @param resultHandler for all users
     * @return
     */
    @Fluent
    AdministrationService retrieveAllUsers(Handler<AsyncResult<List<JsonObject>>> resultHandler);

    //services form company below

    /**
     * Add a Company to the persistence.
     * @param companyId
     * @param resultHandler
     * @return
     */
    @Fluent
    AdministrationService addCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler);

    @Fluent
    AdministrationService retrieveCompanyById(String companyId, Handler<AsyncResult<JsonObject>> resultHandler);

    @Fluent
    AdministrationService deleteCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler);

    @Fluent
    AdministrationService updateCompanyById(String companyId, Handler<AsyncResult<Integer>> resultHandler);

    @Fluent
    AdministrationService retrieveCompanyAll(Handler<AsyncResult<List<JsonObject>>> resultHandler);
}
