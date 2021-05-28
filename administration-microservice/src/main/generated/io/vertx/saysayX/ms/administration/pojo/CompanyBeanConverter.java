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
        case "active":
          if (member.getValue() instanceof Number) {
            obj.setActive(((Number)member.getValue()).intValue());
          }
          break;
        case "backgroundinfo":
          if (member.getValue() instanceof String) {
            obj.setBackgroundinfo((String)member.getValue());
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
        case "createdby":
          if (member.getValue() instanceof String) {
            obj.setCreatedby((String)member.getValue());
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
        case "otherlinks":
          if (member.getValue() instanceof String) {
            obj.setOtherlinks((String)member.getValue());
          }
          break;
        case "phonenumber":
          if (member.getValue() instanceof String) {
            obj.setPhonenumber((String)member.getValue());
          }
          break;
        case "rating":
          if (member.getValue() instanceof Number) {
            obj.setRating(((Number)member.getValue()).intValue());
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
    if (obj.getActive() != null) {
      json.put("active", obj.getActive());
    }
    if (obj.getBackgroundinfo() != null) {
      json.put("backgroundinfo", obj.getBackgroundinfo());
    }
    if (obj.getCategoryid() != null) {
      json.put("categoryid", obj.getCategoryid());
    }
    if (obj.getCategoryname() != null) {
      json.put("categoryname", obj.getCategoryname());
    }
    if (obj.getCid() != null) {
      json.put("cid", obj.getCid());
    }
    if (obj.getCode() != null) {
      json.put("code", obj.getCode());
    }
    if (obj.getCreatedby() != null) {
      json.put("createdby", obj.getCreatedby());
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
    if (obj.getOtherlinks() != null) {
      json.put("otherlinks", obj.getOtherlinks());
    }
    if (obj.getPhonenumber() != null) {
      json.put("phonenumber", obj.getPhonenumber());
    }
    if (obj.getRating() != null) {
      json.put("rating", obj.getRating());
    }
    if (obj.getSectorid() != null) {
      json.put("sectorid", obj.getSectorid());
    }
    if (obj.getSectorname() != null) {
      json.put("sectorname", obj.getSectorname());
    }
    if (obj.getWebsite() != null) {
      json.put("website", obj.getWebsite());
    }
  }
}
