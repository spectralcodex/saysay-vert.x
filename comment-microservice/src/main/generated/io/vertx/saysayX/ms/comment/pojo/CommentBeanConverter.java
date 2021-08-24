package io.vertx.saysayX.ms.comment.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.comment.pojo.CommentBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.comment.pojo.CommentBean} original class using Vert.x codegen.
 */
public class CommentBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CommentBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "authorid":
          if (member.getValue() instanceof String) {
            obj.setAuthorid((String)member.getValue());
          }
          break;
        case "authorname":
          if (member.getValue() instanceof String) {
            obj.setAuthorname((String)member.getValue());
          }
          break;
        case "cid":
          if (member.getValue() instanceof String) {
            obj.setCid((String)member.getValue());
          }
          break;
        case "comment":
          if (member.getValue() instanceof String) {
            obj.setComment((String)member.getValue());
          }
          break;
        case "createdon":
          if (member.getValue() instanceof String) {
            obj.setCreatedon((String)member.getValue());
          }
          break;
        case "entities":
          if (member.getValue() instanceof JsonObject) {
            obj.setEntities(((JsonObject)member.getValue()).copy());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).longValue());
          }
          break;
        case "lang":
          if (member.getValue() instanceof String) {
            obj.setLang((String)member.getValue());
          }
          break;
        case "possiblysensitive":
          if (member.getValue() instanceof Number) {
            obj.setPossiblysensitive(((Number)member.getValue()).intValue());
          }
          break;
        case "storyid":
          if (member.getValue() instanceof String) {
            obj.setStoryid((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(CommentBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(CommentBean obj, java.util.Map<String, Object> json) {
    if (obj.getAuthorid() != null) {
      json.put("authorid", obj.getAuthorid());
    }
    if (obj.getAuthorname() != null) {
      json.put("authorname", obj.getAuthorname());
    }
    if (obj.getCid() != null) {
      json.put("cid", obj.getCid());
    }
    if (obj.getComment() != null) {
      json.put("comment", obj.getComment());
    }
    if (obj.getCreatedon() != null) {
      json.put("createdon", obj.getCreatedon());
    }
    if (obj.getEntities() != null) {
      json.put("entities", obj.getEntities());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getLang() != null) {
      json.put("lang", obj.getLang());
    }
    if (obj.getPossiblysensitive() != null) {
      json.put("possiblysensitive", obj.getPossiblysensitive());
    }
    if (obj.getStoryid() != null) {
      json.put("storyid", obj.getStoryid());
    }
  }
}
