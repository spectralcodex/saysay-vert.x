package io.vertx.saysayX.ms.comment.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public class RateBean {

    public RateBean() {
    }

    public RateBean(JsonObject json){

    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        //StoryConverter.toJson(this, json);
        return json;
    }
}
