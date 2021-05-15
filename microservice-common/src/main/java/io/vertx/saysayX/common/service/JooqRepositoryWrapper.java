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
import io.vertx.sqlclient.Row;
import io.vertx.sqlclient.RowSet;
import io.vertx.sqlclient.SqlConnection;
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


    public JooqRepositoryWrapper(Vertx vertx, JsonObject config) {
        connectOptions = new PgConnectOptions().setPort(5432)
                .setHost(config.getString("PGHOST", "the-host"))
                .setDatabase(config.getString("PGDATABASE", "the-db"))
                .setUser(config.getString("PGUSER", "user"))
                .setPassword(config.getString("PGPASSWORD", "passwd"));


        poolOptions = new PoolOptions().setMaxSize(config.getInteger("PGMAXSIZE", 5));

        this.client = PgPool.pool(vertx, connectOptions, poolOptions);
        this.executor = new ReactiveClassicGenericQueryExecutor(DIALECT, this.client);
    }

    protected <T> Future<Void> retrieveNone(T t, String sql) {
        Promise<JsonObject> promise = Promise.promise();
        this.client.getConnection(ar -> {
            if (ar.failed()) {
                promise.fail(ar.cause());
                logger.info("Failure#############################"+ ar.cause());
            } else {
                SqlConnection pgCon = ar.result();
                pgCon.query(sql).execute(res -> {
                    if (res.failed()) {
                        pgCon.close();
                        logger.info("Failure2::::#############################"+ ar.cause());
                        promise.fail(res.cause());
                    } else {
                            logger.info("Persist OKKKK --> id:" + t);
                            logger.info("User: ", res.result());
                            pgCon.close();
                            promise.complete();
                    }
                });
            }

        });
        return promise.future().map(r -> null);
    }
}
