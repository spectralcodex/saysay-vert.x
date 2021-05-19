package io.vertx.saysayX.ms.administration.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.administration.pojo.CompanyBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.administration.pojo.CompanyBean} original class using Vert.x codegen.
 */
public class CompanyBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, CompanyBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "backgroundInfo":
          if (member.getValue() instanceof String) {
            obj.setBackgroundInfo((String)member.getValue());
          }
          break;
        case "categoryId":
          if (member.getValue() instanceof String) {
            obj.setCategoryId((String)member.getValue());
          }
          break;
        case "categoryName":
          if (member.getValue() instanceof String) {
            obj.setCategoryName((String)member.getValue());
          }
          break;
        case "cid":
          if (member.getValue() instanceof String) {
            obj.setCid((String)member.getValue());
          }
          break;
        case "code":
          if (member.getValue() instanceof String) {
            obj.setCode((String)member.getValue());
          }
          break;
        case "createdBy":
          if (member.getValue() instanceof String) {
            obj.setCreatedBy((String)member.getValue());
          }
          break;
        case "email":
          if (member.getValue() instanceof String) {
            obj.setEmail((String)member.getValue());
          }
          break;
        case "entities":
          if (member.getValue() instanceof String) {
            obj.setEntities((String)member.getValue());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).longValue());
          }
          break;
        case "location":
          if (member.getValue() instanceof String) {
            obj.setLocation((String)member.getValue());
          }
          break;
        case "logo":
          if (member.getValue() instanceof String) {
            obj.setLogo((String)member.getValue());
          }
          break;
        case "name":
          if (member.getValue() instanceof String) {
            obj.setName((String)member.getValue());
          }
          break;
        case "otherLinks":
          if (member.getValue() instanceof String) {
            obj.setOtherLinks((String)member.getValue());
          }
          break;
        case "phoneNumber":
          if (member.getValue() instanceof String) {
            obj.setPhoneNumber((String)member.getValue());
          }
          break;
        case "rating":
          if (member.getValue() instanceof Number) {
            obj.setRating(((Number)member.getValue()).intValue());
          }
          break;
        case "sectorId":
          if (member.getValue() instanceof String) {
            obj.setSectorId((String)member.getValue());
          }
          break;
        case "sectorName":
          if (member.getValue() instanceof String) {
            obj.setSectorName((String)member.getValue());
          }
          break;
        case "website":
          if (member.getValue() instanceof String) {
            obj.setWebsite((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(CompanyBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(CompanyBean obj, java.util.Map<String, Object> json) {
    if (obj.getBackgroundInfo() != null) {
      json.put("backgroundInfo", obj.getBackgroundInfo());
    }
    if (obj.getCategoryId() != null) {
      json.put("categoryId", obj.getCategoryId());
    }
    if (obj.getCategoryName() != null) {
      json.put("categoryName", obj.getCategoryName());
    }
    if (obj.getCid() != null) {
      json.put("cid", obj.getCid());
    }
    if (obj.getCode() != null) {
      json.put("code", obj.getCode());
    }
    if (obj.getCreatedBy() != null) {
      json.put("createdBy", obj.getCreatedBy());
    }
    if (obj.getEmail() != null) {
      json.put("email", obj.getEmail());
    }
    if (obj.getEntities() != null) {
      json.put("entities", obj.getEntities());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getLocation() != null) {
      json.put("location", obj.getLocation());
    }
    if (obj.getLogo() != null) {
      json.put("logo", obj.getLogo());
    }
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
    if (obj.getOtherLinks() != null) {
      json.put("otherLinks", obj.getOtherLinks());
    }
    if (obj.getPhoneNumber() != null) {
      json.put("phoneNumber", obj.getPhoneNumber());
    }
    if (obj.getRating() != null) {
      json.put("rating", obj.getRating());
    }
    if (obj.getSectorId() != null) {
      json.put("sectorId", obj.getSectorId());
    }
    if (obj.getSectorName() != null) {
      json.put("sectorName", obj.getSectorName());
    }
    if (obj.getWebsite() != null) {
      json.put("website", obj.getWebsite());
    }
  }
}
