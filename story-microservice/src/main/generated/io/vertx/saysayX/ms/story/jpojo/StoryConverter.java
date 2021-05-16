package io.vertx.saysayX.ms.story.jpojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.story.jpojo.Story}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.story.jpojo.Story} original class using Vert.x codegen.
 */
public class StoryConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, Story obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "authorId":
          if (member.getValue() instanceof String) {
            obj.setAuthorId((String)member.getValue());
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
        case "storyId":
          if (member.getValue() instanceof String) {
            obj.setStoryId((String)member.getValue());
          }
          break;
        case "text":
          if (member.getValue() instanceof String) {
            obj.setText((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(Story obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(Story obj, java.util.Map<String, Object> json) {
    if (obj.getAuthorId() != null) {
      json.put("authorId", obj.getAuthorId());
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
    if (obj.getPossiblySensitive() != null) {
      json.put("possiblySensitive", obj.getPossiblySensitive());
    }
    if (obj.getSource() != null) {
      json.put("source", obj.getSource());
    }
    if (obj.getStoryId() != null) {
      json.put("storyId", obj.getStoryId());
    }
    if (obj.getText() != null) {
      json.put("text", obj.getText());
    }
  }
}
