package io.vertx.saysayX.ms.comment.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;


@DataObject(generateConverter = true)
public class CommentBean {
    private Long id;
    private String authorid;
    private String cid;
    private String storyid;
    private Integer possiblysensitive;
    private String lang;
    private JsonObject entities;
    private String authorname;
    private String createdon;
    private String comment;

    public CommentBean(JsonObject json) {
        CommentBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.authorid, "authorid");
        BaseUtils.isNullEmpty(this.authorname, "authorname");
        BaseUtils.isNullEmpty(this.comment, "comment");
        BaseUtils.isNullEmpty(this.storyid, "storyid");
        BaseUtils.isNullEmpty(this.lang, "lang");
        BaseUtils.isNullEmpty(this.possiblysensitive, "possiblysensitive");
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        CommentBeanConverter.toJson(this, json);
        return json;
    }

    public CommentBean() {

    }

    public Long getId() {
        return this.id;
    }


    public CommentBean setId(Long id) {
        this.id = id;
        return this;
    }


    public String getAuthorid() {
        return this.authorid;
    }


    public CommentBean setAuthorid(String authorid) {
        this.authorid = authorid;
        return this;
    }


    public String getCid() {
        return this.cid;
    }


    public CommentBean setCid(String cid) {
        this.cid = cid;
        return this;
    }


    public String getStoryid() {
        return this.storyid;
    }


    public CommentBean setStoryid(String storyid) {
        this.storyid = storyid;
        return this;
    }


    public Integer getPossiblysensitive() {
        return this.possiblysensitive;
    }


    public CommentBean setPossiblysensitive(Integer possiblysensitive) {
        this.possiblysensitive = possiblysensitive;
        return this;
    }


    public String getLang() {
        return this.lang;
    }


    public CommentBean setLang(String lang) {
        this.lang = lang;
        return this;
    }


    public JsonObject getEntities() {
        return this.entities;
    }


    public CommentBean setEntities(JsonObject entities) {
        this.entities = entities;
        return this;
    }


    public String getAuthorname() {
        return this.authorname;
    }


    public CommentBean setAuthorname(String authorname) {
        this.authorname = authorname;
        return this;
    }


    public String getCreatedon() {
        return this.createdon;
    }


    public CommentBean setCreatedon(String createdon) {
        this.createdon = createdon;
        return this;
    }

    public String getComment() {
        return this.comment;
    }


    public CommentBean setComment(String comment) {
        this.comment = comment;
        return this;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("CommentBean (");

        sb.append(id);
        sb.append(", ").append(authorid);
        sb.append(", ").append(cid);
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
