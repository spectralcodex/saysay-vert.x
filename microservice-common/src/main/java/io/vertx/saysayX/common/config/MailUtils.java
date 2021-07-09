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
        Promise<MailResult> promise = Promise.promise();
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
                .setSubject(msgConf.getString("subject", "SaySay Verify"))
                .setHtml("");
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

    protected <T> Future<MailResult> mailImages(Vertx vertx, JsonObject msgConfig) {
        Promise<MailResult> promise = Promise.promise();

        MailClient mailClient = MailClient.createShared(vertx, new MailConfig());
        MailMessage email = new MailMessage()
                .setFrom("user@example.com (Sender)")
                .setTo("user@example.com (User Name)")
                .setSubject("Test email")
                .setText("full message is readable as html only")
                .setHtml("visit vert.x <a href=\"http://vertx.io/\"><img src=\"cid:image1@example.com\"></a>");

        MailAttachment attachment = new MailAttachment()
                .setData(vertx.fileSystem().readFileBlocking("logo-white-big.png"))
                .setContentType("image/png")
                .setName("logo-white-big.png")
                .setDisposition("inline")
                .addHeader("Content-ID", "<image1@example.com>");

        List<MailAttachment> list = new ArrayList<>();
        list.add(attachment);
        email.setInlineAttachment(list);

        mailClient.sendMail(email, promise);
        return promise.future();
    }

    protected <T> Future<MailResult> mailHeaders(Vertx vertx, JsonObject msgConfig) {
        Promise<MailResult> promise = Promise.promise();
        MailClient mailClient = MailClient.createShared(vertx, new MailConfig());
        MailMessage email = new MailMessage()
                .setFrom("user1@example.com")
                .setTo(Arrays.asList("user2@example.com", "user3@example.com", "user4@example.com"))
                .addHeader("X-Mailer", "Vert.x Mail-Client 4.1.0")
                .addHeader("Message-ID", "12345@example.com")
                .addHeader("Reply-To", "reply@example.com")
                .addHeader("Received", "by vertx mail service")
                .addHeader("Received", "from [192.168.1.1] by localhost")
                .setText("This message should have a custom Message-ID");

        mailClient.sendMail(email, promise);
        return promise.future();
    }
}