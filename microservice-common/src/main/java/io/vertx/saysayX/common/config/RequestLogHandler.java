package io.vertx.saysayX.common.config;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.LoggerFormat;

@VertxGen
public interface RequestLogHandler extends Handler<RoutingContext> {
  static RequestLogHandler create() {
    return new io.vertx.saysayX.common.config.Slf4jRequestLogger(LoggerFormat.DEFAULT);
  }

  static RequestLogHandler create(LoggerFormat format) {
    return new io.vertx.saysayX.common.config.Slf4jRequestLogger(format);
  }
}
