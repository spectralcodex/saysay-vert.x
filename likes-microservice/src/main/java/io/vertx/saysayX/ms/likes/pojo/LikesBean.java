package io.vertx.saysayX.ms.likes.pojo;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;


@DataObject(generateConverter = true)
public class LikesBean {

    

    public LikesBean(JsonObject json){

    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        //StoryConverter.toJson(this, json);
        return json;
    }


    private Long    id;
    private String  authorid;
    private String  cid;
    private String  storyid;
    private Integer possibilitysensitive;
    private String  lang;
    private JsonObject  entities;
    private String  authorname;
    private String  createdon;
    private String  status;

   

    public LikesBean(LikesBean value) {
        this.id = value.getId();
        this.authorid = value.getAuthorid();
        this.cid = value.getCid();
        this.storyid = value.getStoryid();
        this.possibilitysensitive = value.getPossibilitysensitive();
        this.lang = value.getLang();
        this.entities = value.getEntities();
        this.authorname = value.getAuthorname();
        this.createdon = value.getCreatedon();
        this.status = value.getStatus();
    }

    public LikesBean(
            Long    id,
            String  authorid,
            String  cid,
            String  storyid,
            Integer possibilitysensitive,
            String  lang,
            JsonObject  entities,
            String  authorname,
            String  createdon,
            String  status
    ) {
        this.id = id;
        this.authorid = authorid;
        this.cid = cid;
        this.storyid = storyid;
        this.possibilitysensitive = possibilitysensitive;
        this.lang = lang;
        this.entities = entities;
        this.authorname = authorname;
        this.createdon = createdon;
        this.status = status;

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

    
    public String getCid() {
        return this.cid;
    }

    
    public LikesBean setCid(String cid) {
        this.cid = cid;
        return this;
    }

    
    public String getStoryid() {
        return this.storyid;
    }

    
    public LikesBean setStoryid(String storyid) {
        this.storyid = storyid;
        return this;
    }

    
    public Integer getPossibilitysensitive() {
        return this.possibilitysensitive;
    }

    
    public LikesBean setPossibilitysensitive(Integer possibilitysensitive) {
        this.possibilitysensitive = possibilitysensitive;
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
        return this.createdon;
    }


    public LikesBean setStatus(String status) {
        this.status = status;
        return this;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder("LikesBean (");

        sb.append(id);
        sb.append(", ").append(authorid);
        sb.append(", ").append(cid);
        sb.append(", ").append(storyid);
        sb.append(", ").append(possibilitysensitive);
        sb.append(", ").append(lang);
        sb.append(", ").append(entities);
        sb.append(", ").append(authorname);
        sb.append(", ").append(createdon);

        sb.append(")");
        return sb.toString();
    }
    
}
