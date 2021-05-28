/*
 * This file is generated by jOOQ.
 */
package jooq.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.Collection;

import javax.annotation.Generated;

import jooq.tables.TbUser;
import jooq.tables.records.TbUserRecord;

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
public class TbUserDao extends AbstractAsyncVertxDAO<TbUserRecord, jooq.tables.pojos.TbUser, Long, Future<List<jooq.tables.pojos.TbUser>>, Future<jooq.tables.pojos.TbUser>, Future<Integer>, Future<Long>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TbUserRecord,jooq.tables.pojos.TbUser,Long> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TbUserDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(TbUser.TB_USER, jooq.tables.pojos.TbUser.class, new AsyncClassicQueryExecutor<TbUserRecord,jooq.tables.pojos.TbUser,Long>(configuration,delegate,jooq.tables.pojos.TbUser::new, TbUser.TB_USER));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(jooq.tables.pojos.TbUser object) {
        return object.getId();
    }

    /**
     * Find records that have <code>roleid IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByRoleid(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.ROLEID.in(values));
    }

    /**
     * Find records that have <code>firstname IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByFirstname(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.FIRSTNAME.in(values));
    }

    /**
     * Find records that have <code>lastname IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByLastname(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.LASTNAME.in(values));
    }

    /**
     * Find records that have <code>email IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByEmail(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.EMAIL.in(values));
    }

    /**
     * Find records that have <code>mobile IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByMobile(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.MOBILE.in(values));
    }

    /**
     * Find records that have <code>hashedpassword IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByHashedpassword(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.HASHEDPASSWORD.in(values));
    }

    /**
     * Find records that have <code>salt IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyBySalt(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.SALT.in(values));
    }

    /**
     * Find records that have <code>profilepic IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByProfilepic(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.PROFILEPIC.in(values));
    }

    /**
     * Find records that have <code>backgroundinfo IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByBackgroundinfo(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.BACKGROUNDINFO.in(values));
    }

    /**
     * Find records that have <code>website IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByWebsite(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.WEBSITE.in(values));
    }

    /**
     * Find records that have <code>gpslocation IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByGpslocation(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.GPSLOCATION.in(values));
    }

    /**
     * Find records that have <code>dob IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByDob(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.DOB.in(values));
    }

    /**
     * Find records that have <code>otherinfo IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByOtherinfo(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.OTHERINFO.in(values));
    }

    /**
     * Find records that have <code>createdby IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByCreatedby(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.CREATEDBY.in(values));
    }

    /**
     * Find records that have <code>rolename IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByRolename(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.ROLENAME.in(values));
    }

    /**
     * Find records that have <code>uid IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByUid(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.UID.in(values));
    }

    /**
     * Find records that have <code>active IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByActive(Collection<Integer> values) {
        return findManyByCondition(TbUser.TB_USER.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>createdon IN (values)</code> asynchronously
     */
    public Future<List<jooq.tables.pojos.TbUser>> findManyByCreatedon(Collection<String> values) {
        return findManyByCondition(TbUser.TB_USER.CREATEDON.in(values));
    }

    /**
     * Find a unique record that has <code>email = value</code> asynchronously
     */
    public Future<jooq.tables.pojos.TbUser> findOneByEmail(String value) {
        return findOneByCondition(TbUser.TB_USER.EMAIL.eq(value));
    }

    /**
     * Find a unique record that has <code>mobile = value</code> asynchronously
     */
    public Future<jooq.tables.pojos.TbUser> findOneByMobile(String value) {
        return findOneByCondition(TbUser.TB_USER.MOBILE.eq(value));
    }

    @Override
    public AsyncClassicQueryExecutor<TbUserRecord,jooq.tables.pojos.TbUser,Long> queryExecutor(){
        return (AsyncClassicQueryExecutor<TbUserRecord,jooq.tables.pojos.TbUser,Long>) super.queryExecutor();
    }

    @Override
    protected java.util.function.Function<Object,Long> keyConverter(){
        return lastId -> Long.valueOf(((io.vertx.core.json.JsonArray)lastId).getLong(0).longValue());
    }
}