package io.vertx.saysayX.common.config;

import io.vertx.core.*;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mail.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MailUtils {
    protected final static Logger logger = LoggerFactory.getLogger(MailUtils.class);

    public static void mailLocal(Vertx vertx, JsonObject msgConf, Handler<AsyncResult<MailResult>> handler) {
        MailClient mailClient = MailClient.createShared(vertx, new MailConfig()
                .setStarttls(StartTLSOptions.REQUIRED)
                .setHostname(msgConf.getString("em.hostname", "smtp.gmail.com"))
                .setUsername(msgConf.getString("em.username", "saysayapp1@gmail.com"))
                .setPassword(msgConf.getString("em.password", "rrcw nkhc edjd crvr"))
                .setAuthMethods("PLAIN")
                .setPort(msgConf.getInteger("em.port", 587)));

        MailMessage email = new MailMessage()
                .setFrom(msgConf.getString("em.username"))
                .setTo(msgConf.getString("em.to"))
                .setSubject(msgConf.getString("em.verification.subject", "The SaySay Team"))
                .setHtml("verify email <a href=\"https://sayworx.com/identity/verification?vid="
                        + msgConf.getString("verifyCode") + "\"><img src=\"cid:image1@example.com\"></a>");
        mailClient.sendMail(email, handler);
    }

    protected <T> Future<MailResult> mailLogin(Vertx vertx, JsonObject msgConf) {
        Promise<MailResult> promise = Promise.promise();

        MailClient mailClient = MailClient.createShared(vertx, new MailConfig()
                .setHostname("localhost")
                .setPort(5870)
                //.setStarttls(StartTLSOptions.REQUIRED)
                .setLogin(LoginOption.REQUIRED)
                .setAuthMethods("PLAIN")
                .setUsername("username")
                .setPassword("password"));

        MailMessage email = new MailMessage()
                .setFrom(msgConf.getString("from"))
                .setTo(msgConf.getString("to"))
                .setSubject(msgConf.getString("subject", ""))
                .setHtml("");
        mailClient.sendMail(email, promise);
        return promise.future();
    }


}