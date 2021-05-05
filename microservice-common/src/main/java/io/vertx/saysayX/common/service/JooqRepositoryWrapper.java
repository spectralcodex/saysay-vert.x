package io.vertx.saysayX.common.service;

import io.github.jklingsporn.vertx.jooq.classic.reactivepg.ReactiveClassicGenericQueryExecutor;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

import io.vertx.ext.sql.SQLConnection;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.PoolOptions;
import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Helper and wrapper class for Jooq repository services
 *
 * @author Rubicon
 */

public class JooqRepositoryWrapper {
    private static final Logger logger = LoggerFactory.getLogger(JooqRepositoryWrapper.class);
    protected final ReactiveClassicGenericQueryExecutor executor;
    private final static Configuration DIALECT = new DefaultConfiguration().set(SQLDialect.POSTGRES);
    //Using Postgres connection pooling
    protected final PgPool client;
    protected final PgConnectOptions connectOptions;
    protected final PoolOptions poolOptions;




    public JooqRepositoryWrapper(Vertx vertx, JsonObject config){
       connectOptions = new PgConnectOptions().setPort(5432)
                .setHost(config.getString("PGHOST", "the-host"))
                .setDatabase(config.getString("PGDATABASE", "the-db"))
                .setUser(config.getString("PGUSER", "user"))
                .setPassword(config.getString("PGPASSWORD", "secret"));

        poolOptions = new PoolOptions().setMaxSize(config.getInteger("PGMAXSIZE", 5));

        this.client = PgPool.pool(vertx, connectOptions, poolOptions);
        //this.nonShared = PostgreSQLClient.createNonShared(vertx, config);
        this.executor = new ReactiveClassicGenericQueryExecutor(DIALECT, this.client);
    }

    protected <T> Future<Void> retrieveNone(T t, String sql) {
        return getConnection()
                .compose(pgCon -> {
                    Promise<JsonObject> promise = Promise.promise();
                    pgCon.execute(sql, ar -> {
                        if (ar.succeeded()) {
                            logger.info("Persist OK --> id:" + t);
                            promise.complete();
                        } else {
                            promise.fail(ar.cause());
                        }
                        pgCon.close();
                    });
                    return promise.future().map(r -> null);
                });
    }

    protected Future<SQLConnection> getConnection() {
        Promise<SQLConnection> promise = Promise.promise();
        this.client.getConnection(ar -> promise.complete());
        return promise.future();
    }
}
