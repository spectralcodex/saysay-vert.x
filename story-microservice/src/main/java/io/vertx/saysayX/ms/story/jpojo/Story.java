package io.vertx.saysayX.ms.story.jpojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.time.OffsetTime;

@DataObject(generateConverter = true)
public class Story {

    private Long id;
    private String authorId;
    private OffsetTime createdAt;
    private JsonObject entries;
    private String storyId;
    private String lang;
    private Integer possiblySensitive;
    private String source;
    private String text;


    public Story(){
        //Empty Constructor
    }

    public Story(JsonObject json) {
        StoryConverter.fromJson(json, this);
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        StoryConverter.toJson(this, json);
        return json;
    }



    public Long getId() {
        return this.id;
    }


    public Story setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthorId() {
        return this.authorId;
    }

    public Story setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }


    public OffsetTime getCreatedAt() {
        return this.createdAt;
    }

    public Story setCreatedAt(OffsetTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public JsonObject getEntries() {
        return this.entries;
    }

    public Story setEntries(JsonObject entries) {
        this.entries = entries;
        return this;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public Story setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }

    public String getLang() {
        return this.lang;
    }

    public Story setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Integer getPossiblySensitive() {
        return this.possiblySensitive;
    }

    public Story setPossiblySensitive(Integer possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    public String getSource() {
        return this.source;
    }

    public Story setSource(String source) {
        this.source = source;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Story setText(String text){
        this.text = text;
        return this;
    }
    public String toString() {
        return this.toJson().encodePrettily();
    }


}
