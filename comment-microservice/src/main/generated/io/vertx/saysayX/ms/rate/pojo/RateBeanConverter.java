package io.vertx.saysayX.ms.rate.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.ms.comment.pojo.CommentBean;

/**
 * Converter for {@link CommentBean}.
 * NOTE: This class has been automatically generated from the {@link CommentBean} original class using Vert.x codegen.
 */
public class RateBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CommentBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
      }
    }
  }

  public static void toJson(CommentBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(CommentBean obj, java.util.Map<String, Object> json) {
  }
}
