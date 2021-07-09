package io.vertx.saysayX.ms.likes.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;

import io.vertx.saysayX.ms.likes.LikesService;
import io.vertx.saysayX.ms.likes.pojo.LikesBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;
import static jooq.tables.TbLikes.TB_LIKES;



public class JooqLikesServiceImpl extends JooqRepositoryWrapper implements LikesService {
    private final BaseUtils authProviderHelper;
    protected final static Logger logger = LoggerFactory.getLogger(JooqLikesServiceImpl.class);

    public JooqLikesServiceImpl(Vertx vertx, JsonObject config) {
        super(vertx, config);
        authProviderHelper = new BaseUtils(vertx);
    }

    @Override
    public LikesService init(Handler<AsyncResult<Void>> resultHandler) {
        final String uuid = UUID.randomUUID().toString();
        this.retrieveNone(uuid, "select CURRENT_TIMESTAMP")
                .onComplete(resultHandler);
        return this;
    }



    @Override
    public LikesService addLikes(LikesBean Likes, Handler<AsyncResult<Integer>> resultHandler) {
        String cid = "L"+UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_LIKES,
                TB_LIKES.AUTHORID,
                TB_LIKES.AUTHORNAME,
                TB_LIKES.ENTITIES,
                TB_LIKES.LID,
                TB_LIKES.LANG,
                TB_LIKES.POSSIBILITYSENSITIVE,
                TB_LIKES.STORYID,
                TB_LIKES.STATUS
        )
                .values(Likes.getAuthorid(),Likes.getAuthorname(), Likes.getEntities().encode(), cid , Likes.getLang(),
                        Likes.getPossibilitysensitive(), Likes.getStoryid(), Likes.getStatus()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public LikesService retrieveLikes(String id, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl-> dsl.selectFrom(TB_LIKES).where(TB_LIKES.LID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public LikesService retrieveLikesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_LIKES).where(TB_LIKES.AUTHORID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public LikesService retrieveAllStoriesByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_LIKES).where(TB_LIKES.AUTHORID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }


    @Override
    public LikesService retrieveAllStories(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_LIKES))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public LikesService updateLikes(LikesBean Likes, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_LIKES).set(TB_LIKES.STATUS, Likes.getStatus())
        .set(TB_LIKES.ENTITIES, Likes.getEntities().encode())
        .set(TB_LIKES.POSSIBILITYSENSITIVE, Likes.getPossibilitysensitive())
                .where(TB_LIKES.LID.eq(Likes.getCid())))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public LikesService deleteLikes(String id, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.deleteFrom(TB_LIKES)
                .where(TB_LIKES.LID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }
}
