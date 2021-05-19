package io.vertx.saysayX.ms.administration.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter for {@link io.vertx.saysayX.ms.administration.pojo.UserBean}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.saysayX.ms.administration.pojo.UserBean} original class using Vert.x codegen.
 */
public class UserBeanConverter {

  public static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, UserBean obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "backgroundInfo":
          if (member.getValue() instanceof String) {
            obj.setBackgroundInfo((String)member.getValue());
          }
          break;
        case "createdBy":
          if (member.getValue() instanceof String) {
            obj.setCreatedBy((String)member.getValue());
          }
          break;
        case "dob":
          if (member.getValue() instanceof String) {
            obj.setDob((String)member.getValue());
          }
          break;
        case "email":
          if (member.getValue() instanceof String) {
            obj.setEmail((String)member.getValue());
          }
          break;
        case "firstName":
          if (member.getValue() instanceof String) {
            obj.setFirstName((String)member.getValue());
          }
          break;
        case "gpsLocation":
          if (member.getValue() instanceof String) {
            obj.setGpsLocation((String)member.getValue());
          }
          break;
        case "hashedPassword":
          if (member.getValue() instanceof String) {
            obj.setHashedPassword((String)member.getValue());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).longValue());
          }
          break;
        case "lastName":
          if (member.getValue() instanceof String) {
            obj.setLastName((String)member.getValue());
          }
          break;
        case "mobile":
          if (member.getValue() instanceof String) {
            obj.setMobile((String)member.getValue());
          }
          break;
        case "otherInfo":
          if (member.getValue() instanceof String) {
            obj.setOtherInfo((String)member.getValue());
          }
          break;
        case "profilePic":
          if (member.getValue() instanceof String) {
            obj.setProfilePic((String)member.getValue());
          }
          break;
        case "roleId":
          if (member.getValue() instanceof String) {
            obj.setRoleId((String)member.getValue());
          }
          break;
        case "roleName":
          if (member.getValue() instanceof String) {
            obj.setRoleName((String)member.getValue());
          }
          break;
        case "salt":
          if (member.getValue() instanceof String) {
            obj.setSalt((String)member.getValue());
          }
          break;
        case "uid":
          if (member.getValue() instanceof String) {
            obj.setUid((String)member.getValue());
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

  public static void toJson(UserBean obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

  public static void toJson(UserBean obj, java.util.Map<String, Object> json) {
    if (obj.getBackgroundInfo() != null) {
      json.put("backgroundInfo", obj.getBackgroundInfo());
    }
    if (obj.getCreatedBy() != null) {
      json.put("createdBy", obj.getCreatedBy());
    }
    if (obj.getDob() != null) {
      json.put("dob", obj.getDob());
    }
    if (obj.getEmail() != null) {
      json.put("email", obj.getEmail());
    }
    if (obj.getFirstName() != null) {
      json.put("firstName", obj.getFirstName());
    }
    if (obj.getGpsLocation() != null) {
      json.put("gpsLocation", obj.getGpsLocation());
    }
    if (obj.getHashedPassword() != null) {
      json.put("hashedPassword", obj.getHashedPassword());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getLastName() != null) {
      json.put("lastName", obj.getLastName());
    }
    if (obj.getMobile() != null) {
      json.put("mobile", obj.getMobile());
    }
    if (obj.getOtherInfo() != null) {
      json.put("otherInfo", obj.getOtherInfo());
    }
    if (obj.getProfilePic() != null) {
      json.put("profilePic", obj.getProfilePic());
    }
    if (obj.getRoleId() != null) {
      json.put("roleId", obj.getRoleId());
    }
    if (obj.getRoleName() != null) {
      json.put("roleName", obj.getRoleName());
    }
    if (obj.getSalt() != null) {
      json.put("salt", obj.getSalt());
    }
    if (obj.getUid() != null) {
      json.put("uid", obj.getUid());
    }
    if (obj.getWebsite() != null) {
      json.put("website", obj.getWebsite());
    }
  }
}
