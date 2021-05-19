package io.vertx.saysayX.ms.story.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;

import java.time.OffsetDateTime;

@DataObject(generateConverter = true)
public class StoryBean {

    private Long           id;
    private String         authorId;
    private JsonObject         entities;
    private String         sid;
    private String         lang;
    private Integer        possiblySensitive;
    private String         source;
    private String         story;
    private OffsetDateTime createdAt;
    private Integer        likeCount;
    private Integer        commentCount;
    private Integer        cautionCount;
    private String         categoryName;
    private String         sectorName;
    private String         companyId;
    private String         sectorId;
    private String         categoryId;
    private String         authorName;
    private String         companyName;

    public StoryBean() {
    }


    public StoryBean(JsonObject json) throws DecodeException {
        StoryBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.authorId, "authorId");
        BaseUtils.isNullEmpty(this.story, "story");
        BaseUtils.isNullEmpty(this.entities.encode(), "entries");
        BaseUtils.isNullEmpty(this.lang, "lang");
        BaseUtils.isNullEmpty(this.source, "source");
        BaseUtils.isNullEmpty(this.possiblySensitive, "possiblySensitive");
        BaseUtils.isNullEmpty(this.categoryId, "categoryId");
        BaseUtils.isNullEmpty(this.categoryName, "categoryName");
        BaseUtils.isNullEmpty(this.sectorId, "sectorId");
        BaseUtils.isNullEmpty(this.sectorName, "sectorName");
        BaseUtils.isNullEmpty(this.companyId, "companyId");
        BaseUtils.isNullEmpty(this.companyName, "companyName");
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        StoryBeanConverter.toJson(this, json);
        return json;
    }

    
    public Long getId() {
        return this.id;
    }

    
    public StoryBean setId(Long id) {
        this.id = id;
        return this;
    }

    
    public String getAuthorId() {
        return this.authorId;
    }

    
    public StoryBean setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    
    public JsonObject getEntities() {
        return this.entities;
    }

    
    public StoryBean setEntities(JsonObject entities) {
        this.entities = entities;
        return this;
    }

    
    public String getSid() {
        return this.sid;
    }

    
    public StoryBean setSid(String sid) {
        this.sid = sid;
        return this;
    }

    
    public String getLang() {
        return this.lang;
    }

    
    public StoryBean setLang(String lang) {
        this.lang = lang;
        return this;
    }

    
    public Integer getPossiblySensitive() {
        return this.possiblySensitive;
    }

    
    public StoryBean setPossiblySensitive(Integer possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
        return this;
    }

    
    public String getSource() {
        return this.source;
    }

    
    public StoryBean setSource(String source) {
        this.source = source;
        return this;
    }

    
    public String getStory() {
        return this.story;
    }

    
    public StoryBean setStory(String story) {
        this.story = story;
        return this;
    }

    
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    
    public StoryBean setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
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

    
    public String getCategoryName() {
        return this.categoryName;
    }

    
    public StoryBean setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    
    public String getSectorName() {
        return this.sectorName;
    }

    
    public StoryBean setSectorName(String sectorName) {
        this.sectorName = sectorName;
        return this;
    }

    
    public String getCompanyId() {
        return this.companyId;
    }

    
    public StoryBean setCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    
    public String getSectorId() {
        return this.sectorId;
    }

    
    public StoryBean setSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    
    public String getCategoryId() {
        return this.categoryId;
    }

    
    public StoryBean setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    
    public String getAuthorName() {
        return this.authorName;
    }

    
    public StoryBean setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public String getCompanyNameName() {
        return this.companyName;
    }


    public StoryBean setCompanyNameName(String companyName) {
        this.companyName = companyName;
        return this;
    }
}
