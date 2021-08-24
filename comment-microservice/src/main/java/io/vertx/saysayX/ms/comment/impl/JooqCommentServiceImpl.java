package io.vertx.saysayX.ms.comment.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;

import io.vertx.saysayX.ms.comment.CommentService;
import io.vertx.saysayX.ms.comment.pojo.CommentBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

import static jooq.tables.TbComment.TB_COMMENT;

public class JooqCommentServiceImpl extends JooqRepositoryWrapper implements CommentService {
    private final BaseUtils authProviderHelper;
    protected final static Logger logger = LoggerFactory.getLogger(JooqCommentServiceImpl.class);

    public JooqCommentServiceImpl(Vertx vertx, JsonObject config) {
        super(vertx, config);
        authProviderHelper = new BaseUtils(vertx);
    }

    @Override
    public CommentService init(Handler<AsyncResult<Void>> resultHandler) {
        final String uuid = UUID.randomUUID().toString();
        this.retrieveNone(uuid, "select CURRENT_TIMESTAMP")
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService addComment(CommentBean Comment, Handler<AsyncResult<Integer>> resultHandler) {
        String cid = "C"+UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_COMMENT,
                TB_COMMENT.AUTHORID,
                TB_COMMENT.AUTHORNAME,
                TB_COMMENT.ENTITIES,
                TB_COMMENT.CID,
                TB_COMMENT.LANG,
                TB_COMMENT.POSSIBILITYSENSITIVE,
                TB_COMMENT.STORYID,
                TB_COMMENT.COMMENT
        )
                .values(Comment.getAuthorid(),Comment.getAuthorname(), Comment.getEntities().encode(), cid , Comment.getLang(),
                        Comment.getPossiblysensitive(), Comment.getStoryid(), Comment.getComment()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService retrieveComment(String id, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl-> dsl.selectFrom(TB_COMMENT).where(TB_COMMENT.CID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService retrieveCommentByAuthorId(String authorId, Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_COMMENT).where(TB_COMMENT.AUTHORID.eq(authorId)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService retrieveAllComments(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl-> dsl.selectFrom(TB_COMMENT))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService updateComment(CommentBean Comment, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_COMMENT).set(TB_COMMENT.COMMENT, Comment.getComment())
        .set(TB_COMMENT.ENTITIES, Comment.getEntities().encode())
        .set(TB_COMMENT.POSSIBILITYSENSITIVE, Comment.getPossiblysensitive())
                .where(TB_COMMENT.CID.eq(Comment.getCid())))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public CommentService deleteComment(String id, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.deleteFrom(TB_COMMENT)
                .where(TB_COMMENT.CID.eq(id)))
                .onComplete(resultHandler);
        return this;
    }
}
