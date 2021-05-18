/*
 * This file is generated by jOOQ.
 */
package jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.time.OffsetTime;
import java.util.Collection;

import javax.annotation.Generated;

import jooq.tables.TbCompany;
import jooq.tables.records.TbCompanyRecord;

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
public class TbCompanyDao extends AbstractAsyncVertxDAO<TbCompanyRecord, jooq.tables.pojos.TbCompany, Long, Future<List<jooq.tables.pojos.TbCompany>>, Future<jooq.tables.pojos.TbCompany>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TbCompanyRecord,jooq.tables.pojos.TbCompany,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TbCompanyDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(TbCompany.TB_COMPANY, jooq.tables.pojos.TbCompany.class, new AsyncClassicQueryExecutor<TbCompanyRecord,jooq.tables.pojos.TbCompany,Long>(configuration,delegate,jooq.tables.pojos.TbCompany::new, TbCompany.TB_COMPANY));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(jooq.tables.pojos.TbCompany object) {
        return object.getId();
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByName(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.NAME.in(values));
    }

    /**
     * Find records that have <code>location IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByLocation(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.LOCATION.in(values));
    }

    /**
     * Find records that have <code>phone_number IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByPhoneNumber(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.PHONE_NUMBER.in(values));
    }

    /**
     * Find records that have <code>sector IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyBySector(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.SECTOR.in(values));
    }

    /**
     * Find records that have <code>rating IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByRating(Collection<Integer> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.RATING.in(values));
    }

    /**
     * Find records that have <code>logo IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByLogo(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.LOGO.in(values));
    }

    /**
     * Find records that have <code>background_info IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByBackgroundInfo(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.BACKGROUND_INFO.in(values));
    }

    /**
     * Find records that have <code>entities IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByEntities(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.ENTITIES.in(values));
    }

    /**
     * Find records that have <code>company_id IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>company_code IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByCompanyCode(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.COMPANY_CODE.in(values));
    }

    /**
     * Find records that have <code>created_at IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByCreatedAt(Collection<OffsetTime> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>created_by IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>email IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByEmail(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.EMAIL.in(values));
    }

    /**
     * Find records that have <code>website IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByWebsite(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.WEBSITE.in(values));
    }

    /**
     * Find records that have <code>other_links IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbCompany>> findManyByOtherLinks(Collection<String> values) {
        return findManyByCondition(TbCompany.TB_COMPANY.OTHER_LINKS.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<TbCompanyRecord,jooq.tables.pojos.TbCompany,Long> queryExecutor(){
        return (AsyncClassicQueryExecutor<TbCompanyRecord,jooq.tables.pojos.TbCompany,Long>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).longValue());
    }
}
