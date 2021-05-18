package io.vertx.saysayX.ms.story.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;
import jooq.tables.pojos.TbStory;

import java.time.OffsetDateTime;

@DataObject(generateConverter = true)
public class StoryBean {

    private Long           id;
    private String         authorId;
    private JsonObject         entries;
    private String         storyId;
    private String         lang;
    private Integer        possiblySensitive;
    private String         source;
    private String         story;
    private OffsetDateTime createdAt;
    private Integer        likeCount;
    private Integer        commentCount;
    private Integer        cautionCount;

    public StoryBean() {
    }


    public StoryBean(JsonObject json) throws DecodeException {
        StoryBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.authorId, "authorId");
        BaseUtils.isNullEmpty(this.story, "story");
        BaseUtils.isNullEmpty(this.entries.encode(), "entries");
        BaseUtils.isNullEmpty(this.lang, "lang");
        BaseUtils.isNullEmpty(this.source, "source");
        BaseUtils.isNullEmpty(this.possiblySensitive, "possiblySensitive");
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        StoryBeanConverter.toJson(this, json);
        return json;
    }
    public Long getId() {
        return id;
    }

    public StoryBean setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthorId() {
        return authorId;
    }

    public StoryBean setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    public JsonObject getEntries() {
        return entries;
    }

    public StoryBean setEntries(JsonObject entries) {
        this.entries = entries;
        return this;
    }

    public String getStoryId() {
        return storyId;
    }

    public StoryBean setStoryId(String storyId) {
        this.storyId = storyId;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public StoryBean setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Integer getPossiblySensitive() {
        return possiblySensitive;
    }

    public StoryBean setPossiblySensitive(Integer possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    public String getSource() {
        return source;
    }

    public StoryBean setSource(String source) {
        this.source = source;
        return this;
    }

    public String getStory() {
        return story;
    }

    public StoryBean setStory(String story) {
        this.story = story;
        return this;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public StoryBean setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }


    public StoryBean setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
        return this;
    }


    public Integer getCautionCount() {
        return this.cautionCount;
    }


    public StoryBean setCautionCount(Integer cautionCount) {
        this.cautionCount = cautionCount;
        return this;
    }

}
