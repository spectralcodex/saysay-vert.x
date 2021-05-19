package io.vertx.saysayX.ms.administration.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.administration.AdministrationService;
import io.vertx.saysayX.ms.administration.pojo.UserBean;
import io.vertx.saysayX.common.config.BaseUtils;
import io.vertx.saysayX.common.service.JooqRepositoryWrapper;

import java.util.List;
import java.util.UUID;

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

        executor.execute(dsl -> dsl.insertInto(TB_USER,
                TB_USER.FIRST_NAME, TB_USER.LAST_NAME, TB_USER.EMAIL, TB_USER.MOBILE, TB_USER.HASHED_PASSWORD,
                TB_USER.SALT, TB_USER.CREATED_BY)
                .values(user.getFirstName(), user.getLastName(), user.getEmail(), user.getMobile(),
                        hash_password, salt, user.getCreatedBy()))
                .onComplete(resultHandler);
        return this;
    }

    @Override
    public AdministrationService retrieveUserById(String userId, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService retrieveUserByEmail(String email, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService deleteUser(String userId, Handler<AsyncResult<Integer>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService updateUser(String userId, Handler<AsyncResult<Integer>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService retrieveAllUsers(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService addCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService retrieveCompanyById(String companyId, Handler<AsyncResult<JsonObject>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService deleteCompany(String companyId, Handler<AsyncResult<Integer>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService updateCompanyById(String companyId, Handler<AsyncResult<Integer>> resultHandler) {
        return null;
    }

    @Override
    public AdministrationService retrieveCompanyAll(Handler<AsyncResult<List<JsonObject>>> resultHandler) {
        return null;
    }




   /* @Override
    public AdministrationService retrieveUser(String userId, Handler<AsyncResult<JsonObject>> resultHandler) {
        executor.findOneJson(dsl -> dsl.selectFrom(TB_USER).where(TB_USER.ID.eq(Long.valueOf(userId))))
                .onComplete(resultHandler);
        return this;
    }*/


}
