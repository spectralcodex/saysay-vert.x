package io.vertx.saysayX.ms.likes;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.likes.pojo.LikesBean;

import java.util.List;

@VertxGen
@ProxyGen
public interface LikesService {
    /**
     * The name of the event bus service.
     */
    String SERVICE_NAME = "Likes-eb-service";

    /**
     * The address on which the service is published.
     */
    String SERVICE_ADDRESS = "service.Likes";

    //Likes Operations
    /**
     * @param resultHandler the result handler will be called as soon as the initialization has been accomplished.
     *                      The jooq.async result indicates whether the operation was successful or not.
     */
    @Fluent
    LikesService init(Handler<AsyncResult<Void>> resultHandler);

    /**
     * Add a Likes to the persistence.
     * @param Likes       a  Likes entity that we want to add
     * @param resultHandler the result handler will be called as soon as the Likes has been added. The jooq.async result
     *                      indicates whether the operation was successful or not.
     */
    @Fluent
    LikesService addLikes(LikesBean Likes, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * Retrieve the Likes with certain `id`.
     *
     * @param id            Likes id
     * @param resultHandler the result handler will be called as soon as the Likes has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    LikesService retrieveLikes(String id, Handler<AsyncResult<JsonObject>> resultHandler);

    /**
     * Retrieve the Likes account with certain `username`.
     *
     * @param authorId      username
     * @param resultHandler the result handler will be called as soon as the Likes has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    LikesService retrieveLikesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Retrieve all Likes accounts.
     *
     * @param resultHandler the result handler will be called as soon as the stories have been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    LikesService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    @Fluent
    LikesService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Update Likes account info.
     *
     * @param Likes       a Likes entity that we want to update
     * @param resultHandler the result handler will be called as soon as the account has been added. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    LikesService updateLikes(LikesBean Likes, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete a Likes account from the persistence
     *
     * @param id            Likes id
     * @param resultHandler the result handler will be called as soon as the Likes has been removed. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    LikesService deleteLikes(String id, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete all stories from the persistence
     *
     * @param resultHandler the result handler will be called as soon as the stories have been removed. The async result indicates
     *                      whether the operation was successful or not.
     */
    /*@Fluent
    LikesService deleteAllAccounts(Handler<AsyncResult<Void>> resultHandler);
    */
}
