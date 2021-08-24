package io.vertx.saysayX.ms.likes.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.likes.pojo.LikesBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.likes.pojo.LikesBean} original class using Vert.x codegen.
 */
public class LikesBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, LikesBean obj) {
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
        case "commentid":
          if (member.getValue() instanceof String) {
            obj.setCommentid((String)member.getValue());
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
        case "lid":
          if (member.getValue() instanceof String) {
            obj.setLid((String)member.getValue());
          }
          break;
        case "possiblysensitive":
          if (member.getValue() instanceof Number) {
            obj.setPossiblysensitive(((Number)member.getValue()).intValue());
          }
          break;
        case "status":
          if (member.getValue() instanceof String) {
            obj.setStatus((String)member.getValue());
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

  public static void toJson(LikesBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(LikesBean obj, java.util.Map<String, Object> json) {
    if (obj.getAuthorid() != null) {
      json.put("authorid", obj.getAuthorid());
    }
    if (obj.getAuthorname() != null) {
      json.put("authorname", obj.getAuthorname());
    }
    if (obj.getCommentid() != null) {
      json.put("commentid", obj.getCommentid());
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
    if (obj.getLid() != null) {
      json.put("lid", obj.getLid());
    }
    if (obj.getPossiblysensitive() != null) {
      json.put("possiblysensitive", obj.getPossiblysensitive());
    }
    if (obj.getStatus() != null) {
      json.put("status", obj.getStatus());
    }
    if (obj.getStoryid() != null) {
      json.put("storyid", obj.getStoryid());
    }
  }
}
