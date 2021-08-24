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
        case "createdby":
          if (member.getValue() instanceof String) {
            obj.setCreatedby((String)member.getValue());
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
        case "firstname":
          if (member.getValue() instanceof String) {
            obj.setFirstname((String)member.getValue());
          }
          break;
        case "gpslocation":
          if (member.getValue() instanceof String) {
            obj.setGpslocation((String)member.getValue());
          }
          break;
        case "id":
          if (member.getValue() instanceof Number) {
            obj.setId(((Number)member.getValue()).longValue());
          }
          break;
        case "lastname":
          if (member.getValue() instanceof String) {
            obj.setLastname((String)member.getValue());
          }
          break;
        case "mobile":
          if (member.getValue() instanceof String) {
            obj.setMobile((String)member.getValue());
          }
          break;
        case "otherinfo":
          if (member.getValue() instanceof String) {
            obj.setOtherinfo((String)member.getValue());
          }
          break;
        case "password":
          if (member.getValue() instanceof String) {
            obj.setPassword((String)member.getValue());
          }
          break;
        case "profilepic":
          if (member.getValue() instanceof String) {
            obj.setProfilepic((String)member.getValue());
          }
          break;
        case "roleid":
          if (member.getValue() instanceof String) {
            obj.setRoleid((String)member.getValue());
          }
          break;
        case "rolename":
          if (member.getValue() instanceof String) {
            obj.setRolename((String)member.getValue());
          }
          break;
        case "uid":
          if (member.getValue() instanceof String) {
            obj.setUid((String)member.getValue());
          }
          break;
        case "verificationCode":
          if (member.getValue() instanceof String) {
            obj.setVerificationCode((String)member.getValue());
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
    if (obj.getActive() != null) {
      json.put("active", obj.getActive());
    }
    if (obj.getBackgroundinfo() != null) {
      json.put("backgroundinfo", obj.getBackgroundinfo());
    }
    if (obj.getCreatedby() != null) {
      json.put("createdby", obj.getCreatedby());
    }
    if (obj.getDob() != null) {
      json.put("dob", obj.getDob());
    }
    if (obj.getEmail() != null) {
      json.put("email", obj.getEmail());
    }
    if (obj.getFirstname() != null) {
      json.put("firstname", obj.getFirstname());
    }
    if (obj.getGpslocation() != null) {
      json.put("gpslocation", obj.getGpslocation());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getLastname() != null) {
      json.put("lastname", obj.getLastname());
    }
    if (obj.getMobile() != null) {
      json.put("mobile", obj.getMobile());
    }
    if (obj.getOtherinfo() != null) {
      json.put("otherinfo", obj.getOtherinfo());
    }
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getProfilepic() != null) {
      json.put("profilepic", obj.getProfilepic());
    }
    if (obj.getRoleid() != null) {
      json.put("roleid", obj.getRoleid());
    }
    if (obj.getRolename() != null) {
      json.put("rolename", obj.getRolename());
    }
    if (obj.getUid() != null) {
      json.put("uid", obj.getUid());
    }
    if (obj.getVerificationCode() != null) {
      json.put("verificationCode", obj.getVerificationCode());
    }
    if (obj.getWebsite() != null) {
      json.put("website", obj.getWebsite());
    }
  }
}
