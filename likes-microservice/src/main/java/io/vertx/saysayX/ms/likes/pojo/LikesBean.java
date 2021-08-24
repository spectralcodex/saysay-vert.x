package io.vertx.saysayX.ms.likes.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;


@DataObject(generateConverter = true)
public class LikesBean {
    private Long    id;
    private String  authorid;
    private String  lid;
    private String  commentid;
    private String  storyid;
    private Integer possiblysensitive;
    private String  lang;
    private JsonObject  entities;
    private String  authorname;
    private String  createdon;
    private String  status;

    public LikesBean(JsonObject json){
        LikesBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.authorid, "authorid");
        BaseUtils.isNullEmpty(this.authorname, "authorname");
        BaseUtils.isNullEmpty(this.status, "status");
        BaseUtils.isNullEmpty(this.storyid, "storyid");
        BaseUtils.isNullEmpty(this.lang, "lang");
        BaseUtils.isNullEmpty(this.possiblysensitive, "possiblysensitive");
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        LikesBeanConverter.toJson(this, json);
        return json;
    }

    public LikesBean(){

    }


    public Long getId() {
        return this.id;
    }

    
    public LikesBean setId(Long id) {
        this.id = id;
        return this;
    }

    
    public String getAuthorid() {
        return this.authorid;
    }

    
    public LikesBean setAuthorid(String authorid) {
        this.authorid = authorid;
        return this;
    }

    
    public String getLid() {
        return this.lid;
    }

    
    public LikesBean setLid(String lid) {
        this.lid = lid;
        return this;
    }

    
    public String getStoryid() {
        return this.storyid;
    }

    
    public LikesBean setStoryid(String storyid) {
        this.storyid = storyid;
        return this;
    }

    
    public Integer getPossiblysensitive() {
        return this.possiblysensitive;
    }

    
    public LikesBean setPossiblysensitive(Integer possiblysensitive) {
        this.possiblysensitive = possiblysensitive;
        return this;
    }

    
    public String getLang() {
        return this.lang;
    }

    
    public LikesBean setLang(String lang) {
        this.lang = lang;
        return this;
    }

    
    public JsonObject getEntities() {
        return this.entities;
    }

    
    public LikesBean setEntities(JsonObject entities) {
        this.entities = entities;
        return this;
    }

    
    public String getAuthorname() {
        return this.authorname;
    }

    
    public LikesBean setAuthorname(String authorname) {
        this.authorname = authorname;
        return this;
    }

    
    public String getCreatedon() {
        return this.createdon;
    }

    
    public LikesBean setCreatedon(String createdon) {
        this.createdon = createdon;
        return this;
    }

    public String getStatus() {
        return this.status;
    }


    public LikesBean setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LikesBean (");

        sb.append(id);
        sb.append(", ").append(authorid);
        sb.append(", ").append(lid);
        sb.append(", ").append(storyid);
        sb.append(", ").append(possiblysensitive);
        sb.append(", ").append(lang);
        sb.append(", ").append(entities);
        sb.append(", ").append(authorname);
        sb.append(", ").append(createdon);

        sb.append(")");
        return sb.toString();
    }
    
}
