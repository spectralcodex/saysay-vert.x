package io.vertx.saysayX.ms.comment;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.comment.pojo.CommentBean;

import java.util.List;

@VertxGen
@ProxyGen
public interface CommentService {
    /**
     * The name of the event bus service.
     */
    String SERVICE_NAME = "comment-eb-service";

    /**
     * The address on which the service is published.
     */
    String SERVICE_ADDRESS = "service.comment";

    //Comment Operations
    /**
     * @param resultHandler the result handler will be called as soon as the initialization has been accomplished.
     *                      The jooq.async result indicates whether the operation was successful or not.
     */
    @Fluent
    CommentService init(Handler<AsyncResult<Void>> resultHandler);

    /**
     * Add a Comment to the persistence.
     * @param Comment       a  Comment entity that we want to add
     * @param resultHandler the result handler will be called as soon as the Comment has been added. The jooq.async result
     *                      indicates whether the operation was successful or not.
     */
    @Fluent
    CommentService addComment(CommentBean Comment, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * Retrieve the Comment with certain `id`.
     *
     * @param id            Comment id
     * @param resultHandler the result handler will be called as soon as the Comment has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    CommentService retrieveComment(String id, Handler<AsyncResult<JsonObject>> resultHandler);

    /**
     * Retrieve the Comment account with certain `username`.
     *
     * @param authorId      username
     * @param resultHandler the result handler will be called as soon as the Comment has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    CommentService retrieveCommentByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Retrieve all Comment accounts.
     *
     * @param resultHandler the result handler will be called as soon as the stories have been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    CommentService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    @Fluent
    CommentService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Update Comment account info.
     *
     * @param Comment       a Comment entity that we want to update
     * @param resultHandler the result handler will be called as soon as the account has been added. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    CommentService updateComment(CommentBean Comment, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete a Comment account from the persistence
     *
     * @param id            Comment id
     * @param resultHandler the result handler will be called as soon as the Comment has been removed. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    CommentService deleteComment(String id, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete all stories from the persistence
     *
     * @param resultHandler the result handler will be called as soon as the stories have been removed. The async result indicates
     *                      whether the operation was successful or not.
     */
    /*@Fluent
    CommentService deleteAllAccounts(Handler<AsyncResult<Void>> resultHandler);
    */
}
