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
        String sid = "S"+UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_STORY,
                TB_STORY.AUTHORID,
                TB_STORY.AUTHORNAME,
                TB_STORY.ENTITIES,
                TB_STORY.SID,
                TB_STORY.LANG,
                TB_STORY.POSSIBLYSENSITIVE,
                TB_STORY.SOURCE,
                TB_STORY.STORY,
                TB_STORY.CATEGORYID,
                TB_STORY.CATEGORYNAME,
                TB_STORY.SECTORID,
                TB_STORY.SECTORNAME,
                TB_STORY.COMPANYID
                //TB_STORY.COMPANY_NAME
                )
                .values(story.getAuthorid(),story.getAuthorname(), story.getEntities().encode(), sid , story.getLang(),
                        story.getPossiblysensitive(), story.getSource(), story.getStory(), story.getCategoryid(),story.getCategoryname(),
                        story.getSectorid(),story.getSectorname(), story.getCompanyid()))
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
    public StoryService retrieveStoryByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.AUTHORID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_STORY).where(TB_STORY.AUTHORID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_STORY))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public StoryService updateStory(StoryBean story, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_STORY).set(TB_STORY.STORY, story.getStory())
        .set(TB_STORY.SOURCE, story.getSource())
        .set(TB_STORY.ENTITIES, story.getEntities().encode())
        .set(TB_STORY.POSSIBLYSENSITIVE, story.getPossiblysensitive())
        .set(TB_STORY.CATEGORYID, story.getCategoryid())
        .set(TB_STORY.CATEGORYNAME, story.getCategoryname())
        .set(TB_STORY.SECTORID, story.getSectorid())
        .set(TB_STORY.SECTORNAME, story.getSectorname())
        .set(TB_STORY.COMPANYID, story.getCompanyid())
        .set(TB_STORY.COMPANYNAME, story.getCompanyname())
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
