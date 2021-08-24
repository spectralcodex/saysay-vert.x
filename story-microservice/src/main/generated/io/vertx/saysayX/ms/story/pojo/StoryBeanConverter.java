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
        case "categoryid":
          if (member.getValue() instanceof String) {
            obj.setCategoryid((String)member.getValue());
          }
          break;
        case "categoryname":
          if (member.getValue() instanceof String) {
            obj.setCategoryname((String)member.getValue());
          }
          break;
        case "cautioncount":
          if (member.getValue() instanceof Number) {
            obj.setCautioncount(((Number)member.getValue()).intValue());
          }
          break;
        case "commentcount":
          if (member.getValue() instanceof Number) {
            obj.setCommentcount(((Number)member.getValue()).intValue());
          }
          break;
        case "companyid":
          if (member.getValue() instanceof String) {
            obj.setCompanyid((String)member.getValue());
          }
          break;
        case "companyname":
          if (member.getValue() instanceof String) {
            obj.setCompanyname((String)member.getValue());
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
        case "likecount":
          if (member.getValue() instanceof Number) {
            obj.setLikecount(((Number)member.getValue()).intValue());
          }
          break;
        case "possiblysensitive":
          if (member.getValue() instanceof Number) {
            obj.setPossiblysensitive(((Number)member.getValue()).intValue());
          }
          break;
        case "sectorid":
          if (member.getValue() instanceof String) {
            obj.setSectorid((String)member.getValue());
          }
          break;
        case "sectorname":
          if (member.getValue() instanceof String) {
            obj.setSectorname((String)member.getValue());
          }
          break;
        case "sid":
          if (member.getValue() instanceof String) {
            obj.setSid((String)member.getValue());
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
      }
    }
  }

  public static void toJson(StoryBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(StoryBean obj, java.util.Map<String, Object> json) {
    if (obj.getAuthorid() != null) {
      json.put("authorid", obj.getAuthorid());
    }
    if (obj.getAuthorname() != null) {
      json.put("authorname", obj.getAuthorname());
    }
    if (obj.getCategoryid() != null) {
      json.put("categoryid", obj.getCategoryid());
    }
    if (obj.getCategoryname() != null) {
      json.put("categoryname", obj.getCategoryname());
    }
    if (obj.getCautioncount() != null) {
      json.put("cautioncount", obj.getCautioncount());
    }
    if (obj.getCommentcount() != null) {
      json.put("commentcount", obj.getCommentcount());
    }
    if (obj.getCompanyid() != null) {
      json.put("companyid", obj.getCompanyid());
    }
    if (obj.getCompanyname() != null) {
      json.put("companyname", obj.getCompanyname());
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
    if (obj.getLikecount() != null) {
      json.put("likecount", obj.getLikecount());
    }
    if (obj.getPossiblysensitive() != null) {
      json.put("possiblysensitive", obj.getPossiblysensitive());
    }
    if (obj.getSectorid() != null) {
      json.put("sectorid", obj.getSectorid());
    }
    if (obj.getSectorname() != null) {
      json.put("sectorname", obj.getSectorname());
    }
    if (obj.getSid() != null) {
      json.put("sid", obj.getSid());
    }
    if (obj.getSource() != null) {
      json.put("source", obj.getSource());
    }
    if (obj.getStory() != null) {
      json.put("story", obj.getStory());
    }
  }
}
