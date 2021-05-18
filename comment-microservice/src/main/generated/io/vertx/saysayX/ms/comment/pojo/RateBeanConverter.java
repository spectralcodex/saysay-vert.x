package io.vertx.saysayX.ms.comment.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.comment.pojo.RateBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.comment.pojo.RateBean} original class using Vert.x codegen.
 */
public class RateBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RateBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
  }

  public static void toJson(RateBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(RateBean obj, java.util.Map<String, Object> json) {
  }
}
