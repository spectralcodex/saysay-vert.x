/*
 * This file is generated by jOOQ.
 */
package jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.time.OffsetTime;
import java.util.Collection;

import javax.annotation.Generated;

import jooq.tables.TbCategory;
import jooq.tables.records.TbCategoryRecord;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TbCategoryDao extends AbstractAsyncVertxDAO<TbCategoryRecord, jooq.tables.pojos.TbCategory, Long, Future<List<jooq.tables.pojos.TbCategory>>, Future<jooq.tables.pojos.TbCategory>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TbCategoryRecord,jooq.tables.pojos.TbCategory,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TbCategoryDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(TbCategory.TB_CATEGORY, jooq.tables.pojos.TbCategory.class, new AsyncClassicQueryExecutor<TbCategoryRecord,jooq.tables.pojos.TbCategory,Long>(configuration,delegate,jooq.tables.pojos.TbCategory::new, TbCategory.TB_CATEGORY));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(jooq.tables.pojos.TbCategory object) {
        return object.getId();
    }

    /**
     * Find records that have <code>cid IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCategory>> findManyByCid(Collection<String> values) {
        return findManyByCondition(TbCategory.TB_CATEGORY.CID.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCategory>> findManyByName(Collection<String> values) {
        return findManyByCondition(TbCategory.TB_CATEGORY.NAME.in(values));
    }

    /**
     * Find records that have <code>description IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCategory>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(TbCategory.TB_CATEGORY.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCategory>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(TbCategory.TB_CATEGORY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCategory>> findManyByCreatedAt(Collection<OffsetTime> values) {
        return findManyByCondition(TbCategory.TB_CATEGORY.CREATED_AT.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<TbCategoryRecord,jooq.tables.pojos.TbCategory,Long> queryExecutor(){
        return (AsyncClassicQueryExecutor<TbCategoryRecord,jooq.tables.pojos.TbCategory,Long>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).longValue());
    }
}
