package io.vertx.saysayX.ms.story.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;
import io.vertx.saysayX.ms.story.StoryService;
import io.vertx.saysayX.ms.story.api.RestStoryApiVerticle;
import io.vertx.saysayX.ms.story.jpojo.Story;
import io.vertx.saysayX.common.config.AuthProviderHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static jooq.tables.TbStory.TB_STORY;
import java.util.List;
import java.util.UUID;


public class JooqStoryServiceImpl extends JooqRepositoryWrapper implements StoryService {
    private final AuthProviderHelper authProviderHelper;
    protected final static Logger logger = LoggerFactory.getLogger(JooqStoryServiceImpl.class);

    public JooqStoryServiceImpl(Vertx vertx, JsonObject config) {
        super(vertx, config);
        authProviderHelper = new AuthProviderHelper(vertx);
    }

    @Override
    public StoryService init(Handler<AsyncResult<Void>> resultHandler) {
        final String uuid = UUID.randomUUID().toString();
        this.retrieveNone(uuid, "select CURRENT_TIMESTAMP")
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService addStory(Story story, Handler<AsyncResult<Integer>> resultHandler) {
        String sid = UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_STORY,
                TB_STORY.AUTHOR_ID, TB_STORY.ENTRIES, TB_STORY.STORY_ID,
                TB_STORY.LANG, TB_STORY.POSSIBLY_SENSITIVE, TB_STORY.SOURCE, TB_STORY.STORY)
                .values(story.getAuthorId(), story.getEntries().encode(), sid , story.getLang(),
                        story.getPossiblySensitive(), story.getSource(), story.getText()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveStory(String id, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.STORY_ID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveStoryByUsername(String username, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public StoryService retrieveAllStoriesByUsername(String username, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        return null;
    }

    @Override
    public StoryService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        return null;
    }

    @Override
    public StoryService updateStory(Story story, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public StoryService deleteStory(String id, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public StoryService deleteAllAccounts(Handler<AsyncResult<Void>> resultHandler) {
        return null;
    }
}
