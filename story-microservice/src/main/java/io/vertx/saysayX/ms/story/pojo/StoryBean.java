package io.vertx.saysayX.ms.story.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;

import java.time.OffsetDateTime;

@DataObject(generateConverter = true)
public class StoryBean {

    private Long           id;
    private String         authorid;
    private JsonObject         entities;
    private String         sid;
    private String         lang;
    private Integer        possiblysensitive;
    private String         source;
    private String         story;
    private OffsetDateTime createdat;
    private Integer        likecount;
    private Integer        commentcount;
    private Integer        cautioncount;
    private String         categoryname;
    private String         sectorname;
    private String         companyid;
    private String         sectorid;
    private String         categoryid;
    private String         authorname;
    private String         companyname;

    public StoryBean() {
    }


    public StoryBean(JsonObject json) throws DecodeException {
        StoryBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.authorid, "authorid");
        BaseUtils.isNullEmpty(this.authorname, "authorname");
        BaseUtils.isNullEmpty(this.story, "story");
        /*
         * A story may not have vidoes or images therefore entities not mandatory
        BaseUtils.isNullEmpty(this.entities.encode(), "entities");
         */
        BaseUtils.isNullEmpty(this.categoryid, "categoryid");
        BaseUtils.isNullEmpty(this.categoryname, "categoryname");
        BaseUtils.isNullEmpty(this.sectorid, "sectorid");
        BaseUtils.isNullEmpty(this.sectorname, "sectorname");
        BaseUtils.isNullEmpty(this.companyid, "companyid");
        BaseUtils.isNullEmpty(this.companyname, "companyname");
        BaseUtils.isNullEmpty(this.lang, "lang");
        BaseUtils.isNullEmpty(this.source, "source");
        BaseUtils.isNullEmpty(this.possiblysensitive, "possiblysensitive");
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

    public String getAuthorid() {
        return authorid;
    }

    public StoryBean setAuthorid(String authorid) {
        this.authorid = authorid;
        return this;
    }

    public JsonObject getEntities() {
        return entities;
    }

    public StoryBean setEntities(JsonObject entities) {
        this.entities = entities;
        return this;
    }

    public String getSid() {
        return sid;
    }

    public StoryBean setSid(String sid) {
        this.sid = sid;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public StoryBean setLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Integer getPossiblysensitive() {
        return possiblysensitive;
    }

    public StoryBean setPossiblysensitive(Integer possiblysensitive) {
        this.possiblysensitive = possiblysensitive;
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

    public OffsetDateTime getCreatedat() {
        return createdat;
    }

    public StoryBean setCreatedat(OffsetDateTime createdat) {
        this.createdat = createdat;
        return this;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public StoryBean setLikecount(Integer likecount) {
        this.likecount = likecount;
        return this;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public StoryBean setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
        return this;
    }

    public Integer getCautioncount() {
        return cautioncount;
    }

    public StoryBean setCautioncount(Integer cautioncount) {
        this.cautioncount = cautioncount;
        return this;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public StoryBean setCategoryname(String categoryname) {
        this.categoryname = categoryname;
        return this;
    }

    public String getSectorname() {
        return sectorname;
    }

    public StoryBean setSectorname(String sectorname) {
        this.sectorname = sectorname;
        return this;
    }

    public String getCompanyid() {
        return companyid;
    }

    public StoryBean setCompanyid(String companyid) {
        this.companyid = companyid;
        return this;
    }

    public String getSectorid() {
        return sectorid;
    }

    public StoryBean setSectorid(String sectorid) {
        this.sectorid = sectorid;
        return this;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public StoryBean setCategoryid(String categoryid) {
        this.categoryid = categoryid;
        return this;
    }

    public String getAuthorname() {
        return authorname;
    }

    public StoryBean setAuthorname(String authorname) {
        this.authorname = authorname;
        return this;
    }

    public String getCompanyname() {
        return companyname;
    }

    public StoryBean setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }
}
