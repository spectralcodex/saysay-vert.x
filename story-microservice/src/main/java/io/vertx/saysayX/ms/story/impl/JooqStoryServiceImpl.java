package io.vertx.saysayX.ms.story.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;
import io.vertx.saysayX.ms.story.StoryService;
import io.vertx.saysayX.common.config.BaseUtils;
import io.vertx.saysayX.ms.story.pojo.StoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static jooq.tables.TbStory.TB_STORY;
import java.util.List;
import java.util.UUID;


public class JooqStoryServiceImpl extends JooqRepositoryWrapper implements StoryService {
    private final BaseUtils authProviderHelper;
    protected final static Logger logger = LoggerFactory.getLogger(JooqStoryServiceImpl.class);

    public JooqStoryServiceImpl(Vertx vertx, JsonObject config) {
        super(vertx, config);
        authProviderHelper = new BaseUtils(vertx);
    }

    @Override
    public StoryService init(Handler<AsyncResult<Void>> resultHandler) {
        final String uuid = UUID.randomUUID().toString();
        this.retrieveNone(uuid, "select CURRENT_TIMESTAMP")
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService addStory(StoryBean story, Handler<AsyncResult<Integer>> resultHandler) {
        String sid = UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_STORY,
                TB_STORY.AUTHOR_ID,
                TB_STORY.AUTHOR_NAME,
                TB_STORY.ENTITIES,
                TB_STORY.SID,
                TB_STORY.LANG,
                TB_STORY.POSSIBLY_SENSITIVE,
                TB_STORY.SOURCE,
                TB_STORY.STORY,
                TB_STORY.CATEGORY_ID,
                TB_STORY.CATEGORY_NAME,
                TB_STORY.SECTOR_ID,
                TB_STORY.SECTOR_NAME,
                TB_STORY.COMPANY_ID
                //TB_STORY.COMPANY_NAME
                )
                .values(story.getAuthorId(),story.getAuthorName(), story.getEntities().encode(), sid , story.getLang(),
                        story.getPossiblySensitive(), story.getSource(), story.getStory(), story.getCategoryId(),story.getCategoryName(),
                        story.getSectorId(),story.getSectorName(), story.getCompanyId()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveStory(String id, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.SID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveStoryByAuthorId(String authorId, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.AUTHOR_ID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.AUTHOR_ID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }


    @Override
    public StoryService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        return null;
    }

    @Override
    public StoryService updateStory(StoryBean story, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_STORY).set(TB_STORY.STORY, story.getStory())
        .set(TB_STORY.SOURCE, story.getSource())
        .set(TB_STORY.ENTITIES, story.getEntities().encode())
        .set(TB_STORY.POSSIBLY_SENSITIVE, story.getPossiblySensitive())
        .set(TB_STORY.CATEGORY_ID, story.getCategoryId())
        .set(TB_STORY.CATEGORY_NAME, story.getCategoryName())
        .set(TB_STORY.SECTOR_ID, story.getSectorId())
        .set(TB_STORY.SECTOR_NAME, story.getSectorName())
        .set(TB_STORY.COMPANY_ID, story.getCompanyId())
        //.set(TB_STORY.COMPANY_NAME, story.getCompanyName())
                .where(TB_STORY.SID.eq(story.getSid())))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService deleteStory(String id, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.deleteFrom(TB_STORY)
                .where(TB_STORY.SID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }


}
