package io.vertx.saysayX.ms.administration.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.administration.pojo.InterestBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.administration.pojo.InterestBean} original class using Vert.x codegen.
 */
public class InterestBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, InterestBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "createdby":
          if (member.getValue() instanceof String) {
            obj.setCreatedby((String)member.getValue());
          }
          break;
        case "description":
          if (member.getValue() instanceof String) {
            obj.setDescription((String)member.getValue());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).longValue());
          }
          break;
        case "iid":
          if (member.getValue() instanceof String) {
            obj.setIid((String)member.getValue());
          }
          break;
        case "name":
          if (member.getValue() instanceof String) {
            obj.setName((String)member.getValue());
          }
          break;
      }
    }
  }

  public static void toJson(InterestBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(InterestBean obj, java.util.Map<String, Object> json) {
    if (obj.getCreatedby() != null) {
      json.put("createdby", obj.getCreatedby());
    }
    if (obj.getDescription() != null) {
      json.put("description", obj.getDescription());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getIid() != null) {
      json.put("iid", obj.getIid());
    }
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
  }
}
