package io.vertx.saysayX.ms.administration.impl;

import io.github.jklingsporn.vertx.jooq.shared.internal.QueryResult;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.saysayX.ms.administration.pojo.CompanyBean;
import io.vertx.saysayX.ms.administration.pojo.UserBean;
import io.vertx.saysayX.common.config.BaseUtils;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;
import jooq.tables.pojos.TbUser;
import org.jooq.Record;
import org.jooq.ResultQuery;
import org.jooq.User;

import java.util.List;
import java.util.UUID;

import static jooq.Tables.TB_COMPANY;
import static jooq.Tables.TB_USER;


public class AdministrationImpl extends JooqRepositoryWrapper implements AdministrationService {

    //protected final static Logger logger = LoggerFactory.getLogger(AdministrationImpl.class);
    private BaseUtils authProviderHelper;

    public AdministrationImpl(Vertx vertx, JsonObject config) {
        super(vertx, config);
        authProviderHelper = new BaseUtils(vertx);
    }

    @Override
    public AdministrationService initializePersistence(Handler<AsyncResult<Void>> handler) {
        final String uuid = UUID.randomUUID().toString();
        this.retrieveNone(uuid, "select 1")
                .onComplete(handler);
        return this;
    }

    @Override
    public AdministrationService addUser(UserBean user, Handler<AsyncResult<Integer>> resultHandler) {
        final String salt = authProviderHelper.generateSalt();
        final String generatedPassword = authProviderHelper.generatingRandomAlphanumeric();
        final String hash_password = authProviderHelper.computeHash(generatedPassword, salt);
        String uid = "U" + UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");

        executor.execute(dsl -> dsl.insertInto(TB_USER,

                TB_USER.ROLEID, TB_USER.ROLENAME, TB_USER.FIRSTNAME, TB_USER.LASTNAME,
                TB_USER.EMAIL, TB_USER.MOBILE, TB_USER.HASHEDPASSWORD,
                TB_USER.SALT, TB_USER.PROFILEPIC, TB_USER.BACKGROUNDINFO,
                TB_USER.WEBSITE, TB_USER.GPSLOCATION, TB_USER.DOB,
                TB_USER.OTHERINFO, TB_USER.CREATEDBY,
                TB_USER.UID)
                .values(user.getRoleid(), user.getRolename(), user.getFirstname(), user.getLastname(),
                        user.getEmail(), user.getMobile(), hash_password,
                        salt, user.getProfilepic(), user.getBackgroundinfo(),
                        user.getWebsite(), user.getGpslocation(), user.getDob(),
                        user.getOtherinfo(), user.getCreatedby(), uid))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveUserById(String userId, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(
                dsl -> dsl.selectFrom(TB_USER).where(TB_USER.UID.eq(userId)))
               .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveUserByEmail(String email, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl -> dsl.selectFrom(TB_USER).where(TB_USER.EMAIL.eq(email)))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService deleteUser(String userId, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_USER).set(TB_USER.ACTIVE, 1) //1 means disable
                .where(TB_USER.UID.eq(userId))).onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService activateUser(String userId, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_USER).set(TB_USER.ACTIVE, 0) //1 means disable
                .where(TB_USER.UID.eq(userId))).onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService updateUser(UserBean user, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_USER)
                .set(TB_USER.ROLEID, user.getRoleid())
                .set(TB_USER.FIRSTNAME, user.getFirstname())
                .set(TB_USER.LASTNAME, user.getLastname())
                .set(TB_USER.EMAIL, user.getEmail())
                .set(TB_USER.MOBILE, user.getMobile())
                .set(TB_USER.PROFILEPIC, user.getProfilepic())
                .set(TB_USER.BACKGROUNDINFO, user.getBackgroundinfo())
                .set(TB_USER.WEBSITE, user.getWebsite())
                .set(TB_USER.GPSLOCATION, user.getGpslocation())
                .set(TB_USER.DOB, user.getDob())
                .set(TB_USER.OTHERINFO, user.getOtherinfo())
                .set(TB_USER.CREATEDBY, user.getCreatedby())
                .set(TB_USER.ROLENAME, user.getRolename())
                .where(TB_USER.UID.eq(user.getUid()))).onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveAllUsers(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl -> dsl.selectFrom(TB_USER)).onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService addCompany(CompanyBean company, Handler<AsyncResult<Integer>> resultHandler) {
        String cid = "C" + UUID.randomUUID().toString().replaceAll("[\\s\\-()]", "");
        executor.execute(dsl -> dsl.insertInto(TB_COMPANY,
                TB_COMPANY.NAME, TB_COMPANY.LOCATION, TB_COMPANY.PHONENUMBER,
                TB_COMPANY.SECTORNAME, TB_COMPANY.SECTORID, TB_COMPANY.LOGO,
                TB_COMPANY.BACKGROUNDINFO, TB_COMPANY.ENTITIES, TB_COMPANY.CID,
                TB_COMPANY.CODE, TB_COMPANY.CREATEDBY, TB_COMPANY.EMAIL,
                TB_COMPANY.WEBSITE, TB_COMPANY.OTHERLINKS, TB_COMPANY.CATEGORYID,
                TB_COMPANY.CATEGORYNAME)
                .values(company.getName(), company.getLocation(), company.getPhonenumber(),
                        company.getSectorname(), company.getSectorid(), company.getLogo(),
                        company.getBackgroundinfo(), company.getEntities(), cid,
                        company.getCode(), company.getCreatedby(), company.getEmail(),
                        company.getWebsite(), company.getOtherlinks(), company.getCategoryid(),
                        company.getCategoryname()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveCompanyById(String companyId, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl -> dsl.selectFrom(TB_COMPANY).where(TB_COMPANY.CID.eq(companyId)))
                .onComplete(resultHandler);

        return this;
    }

    @Override
    public AdministrationService deleteCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_COMPANY).set(TB_COMPANY.ACTIVE, 1) //1 means disable
                .where(TB_COMPANY.CID.eq(companyId))).onComplete(resultHandler);

        return this;
    }

    @Override
    public AdministrationService activateCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_COMPANY).set(TB_COMPANY.ACTIVE, 0) //1 means disable
                .where(TB_COMPANY.CID.eq(companyId))).onComplete(resultHandler);

        return this;
    }

    @Override
    public AdministrationService updateCompanyById(CompanyBean company, Handler<AsyncResult<Integer>> resultHandler) {
        executor.execute(dsl -> dsl.update(TB_COMPANY)
                .set(TB_COMPANY.NAME, company.getName())
                .set(TB_COMPANY.LOCATION, company.getLocation())
                .set(TB_COMPANY.PHONENUMBER, company.getPhonenumber())
                .set(TB_COMPANY.SECTORNAME, company.getSectorname())
                .set(TB_COMPANY.SECTORID, company.getSectorid())
                .set(TB_COMPANY.LOGO, company.getLogo())
                .set(TB_COMPANY.BACKGROUNDINFO, company.getBackgroundinfo())
                .set(TB_COMPANY.ENTITIES, company.getEntities())
                .set(TB_COMPANY.CODE, company.getCode())
                .set(TB_COMPANY.CREATEDBY, company.getCreatedby())
                .set(TB_COMPANY.EMAIL, company.getEmail())
                .set(TB_COMPANY.WEBSITE, company.getWebsite())
                .set(TB_COMPANY.OTHERLINKS, company.getOtherlinks())
                .set(TB_COMPANY.CATEGORYID, company.getCategoryid())
                .set(TB_COMPANY.CATEGORYNAME, company.getCategoryname()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveAllCompany(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        executor.findManyJson(dsl -> dsl.selectFrom(TB_COMPANY))
                .onComplete(resultHandler);

        return this;
    }




   /* @Override
    public AdministrationService retrieveUser(String userId, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl -> dsl.selectFrom(TB_USER).where(TB_USER.ID.eq(Long.valueOf(userId))))
                .onComplete(resultHandler);
        return this;
    }*/


}
