package io.vertx.saysayX.ms.story.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.story.pojo.StoryBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.story.pojo.StoryBean} original class using Vert.x codegen.
 */
public class StoryBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, StoryBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "authorId":
          if (member.getValue() instanceof String) {
            obj.setAuthorId((String)member.getValue());
          }
          break;
        case "cautionCount":
          if (member.getValue() instanceof Number) {
            obj.setCautionCount(((Number)member.getValue()).intValue());
          }
          break;
        case "commentCount":
          if (member.getValue() instanceof Number) {
            obj.setCommentCount(((Number)member.getValue()).intValue());
          }
          break;
        case "entries":
          if (member.getValue() instanceof JsonObject) {
            obj.setEntries(((JsonObject)member.getValue()).copy());
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
        case "likeCount":
          if (member.getValue() instanceof Number) {
            obj.setLikeCount(((Number)member.getValue()).intValue());
          }
          break;
        case "possiblySensitive":
          if (member.getValue() instanceof Number) {
            obj.setPossiblySensitive(((Number)member.getValue()).intValue());
          }
          break;
        case "source":
          if (member.getValue() instanceof String) {
            obj.setSource((String)member.getValue());
          }
          break;
        case "story":
          if (member.getValue() instanceof String) {
            obj.setStory((String)member.getValue());
          }
          break;
        case "storyId":
          if (member.getValue() instanceof String) {
            obj.setStoryId((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(StoryBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(StoryBean obj, java.util.Map<String, Object> json) {
    if (obj.getAuthorId() != null) {
      json.put("authorId", obj.getAuthorId());
    }
    if (obj.getCautionCount() != null) {
      json.put("cautionCount", obj.getCautionCount());
    }
    if (obj.getCommentCount() != null) {
      json.put("commentCount", obj.getCommentCount());
    }
    if (obj.getEntries() != null) {
      json.put("entries", obj.getEntries());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getLang() != null) {
      json.put("lang", obj.getLang());
    }
    if (obj.getLikeCount() != null) {
      json.put("likeCount", obj.getLikeCount());
    }
    if (obj.getPossiblySensitive() != null) {
      json.put("possiblySensitive", obj.getPossiblySensitive());
    }
    if (obj.getSource() != null) {
      json.put("source", obj.getSource());
    }
    if (obj.getStory() != null) {
      json.put("story", obj.getStory());
    }
    if (obj.getStoryId() != null) {
      json.put("storyId", obj.getStoryId());
    }
  }
}
