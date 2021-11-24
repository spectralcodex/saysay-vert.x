package io.vertx.saysayX.ms.story;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.story.pojo.StoryBean;

import java.util.List;


/**
 * A service interface managing stories.
 * <p>
 * This service is an event bus service (aka. service proxy)
 * </p>
 *
 * @author Spectral
 */
@VertxGen
@ProxyGen
public interface StoryService {

    /**
     * The name of the event bus service.
     */
    String SERVICE_NAME = "story-eb-service";

    /**
     * The address on which the service is published.
     */
    String SERVICE_ADDRESS = "service.story";

    //Story Operations
    /**
     * @param resultHandler the result handler will be called as soon as the initialization has been accomplished.
     *                      The jooq.async result indicates whether the operation was successful or not.
     */
    @Fluent
    StoryService init(Handler<AsyncResult<Void>> resultHandler);

    /**
     * Add a story to the persistence.
     * @param story       a  Story entity that we want to add
     * @param resultHandler the result handler will be called as soon as the Story has been added. The jooq.async result
     *                      indicates whether the operation was successful or not.
     */
    @Fluent
    StoryService addStory(StoryBean story, Handler<AsyncResult<Integer>> resultHandler);

    /**
     * Retrieve the story with certain `id`.
     *
     * @param id            story id
     * @param resultHandler the result handler will be called as soon as the story has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    StoryService retrieveStory(String id, Handler<AsyncResult<JsonObject>> resultHandler);

    /**
     * Retrieve the story account with certain `username`.
     *
     * @param authorId      username
     * @param resultHandler the result handler will be called as soon as the Story has been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    StoryService retrieveStoryByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Retrieve all story accounts.
     *
     * @param resultHandler the result handler will be called as soon as the stories have been retrieved. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    StoryService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler);

    @Fluent
    StoryService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler);

    /**
     * Update story account info.
     *
     * @param story       a story entity that we want to update
     * @param resultHandler the result handler will be called as soon as the account has been added. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    StoryService updateStory(StoryBean story, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete a story account from the persistence
     *
     * @param id            Story id
     * @param resultHandler the result handler will be called as soon as the story has been removed. The async result indicates
     *                      whether the operation was successful or not.
     */
    @Fluent
    StoryService deleteStory(String id, Handler<AsyncResult<Integer>> resultHandler);


    /**
     * Delete all stories from the persistence
     *
     * @param resultHandler the result handler will be called as soon as the stories have been removed. The async result indicates
     *                      whether the operation was successful or not.
     */

    @Fluent
    StoryService retrieveStoriesByLocation(String location, Handler<AsyncResult<List<JsonObject>>> resultHandler);

}
