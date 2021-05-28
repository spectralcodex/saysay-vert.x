/*
 * This file is generated by jOOQ.
 */
package jooq.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import jooq.tables.interfaces.ITbStory;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TbStory implements VertxPojo, ITbStory {

    private static final long serialVersionUID = -1137644579;

    private Long    id;
    private String  authorid;
    private String  entities;
    private String  sid;
    private String  lang;
    private Integer possiblysensitive;
    private String  source;
    private String  story;
    private Integer likecount;
    private Integer commentcount;
    private Integer cautioncount;
    private String  categoryname;
    private String  sectorname;
    private String  companyid;
    private String  sectorid;
    private String  categoryid;
    private String  authorname;
    private String  companyname;
    private String  createdon;

    public TbStory() {}

    public TbStory(ITbStory value) {
        this.id = value.getId();
        this.authorid = value.getAuthorid();
        this.entities = value.getEntities();
        this.sid = value.getSid();
        this.lang = value.getLang();
        this.possiblysensitive = value.getPossiblysensitive();
        this.source = value.getSource();
        this.story = value.getStory();
        this.likecount = value.getLikecount();
        this.commentcount = value.getCommentcount();
        this.cautioncount = value.getCautioncount();
        this.categoryname = value.getCategoryname();
        this.sectorname = value.getSectorname();
        this.companyid = value.getCompanyid();
        this.sectorid = value.getSectorid();
        this.categoryid = value.getCategoryid();
        this.authorname = value.getAuthorname();
        this.companyname = value.getCompanyname();
        this.createdon = value.getCreatedon();
    }

    public TbStory(
        Long    id,
        String  authorid,
        String  entities,
        String  sid,
        String  lang,
        Integer possiblysensitive,
        String  source,
        String  story,
        Integer likecount,
        Integer commentcount,
        Integer cautioncount,
        String  categoryname,
        String  sectorname,
        String  companyid,
        String  sectorid,
        String  categoryid,
        String  authorname,
        String  companyname,
        String  createdon
    ) {
        this.id = id;
        this.authorid = authorid;
        this.entities = entities;
        this.sid = sid;
        this.lang = lang;
        this.possiblysensitive = possiblysensitive;
        this.source = source;
        this.story = story;
        this.likecount = likecount;
        this.commentcount = commentcount;
        this.cautioncount = cautioncount;
        this.categoryname = categoryname;
        this.sectorname = sectorname;
        this.companyid = companyid;
        this.sectorid = sectorid;
        this.categoryid = categoryid;
        this.authorname = authorname;
        this.companyname = companyname;
        this.createdon = createdon;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public TbStory setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getAuthorid() {
        return this.authorid;
    }

    @Override
    public TbStory setAuthorid(String authorid) {
        this.authorid = authorid;
        return this;
    }

    @Override
    public String getEntities() {
        return this.entities;
    }

    @Override
    public TbStory setEntities(String entities) {
        this.entities = entities;
        return this;
    }

    @Override
    public String getSid() {
        return this.sid;
    }

    @Override
    public TbStory setSid(String sid) {
        this.sid = sid;
        return this;
    }

    @Override
    public String getLang() {
        return this.lang;
    }

    @Override
    public TbStory setLang(String lang) {
        this.lang = lang;
        return this;
    }

    @Override
    public Integer getPossiblysensitive() {
        return this.possiblysensitive;
    }

    @Override
    public TbStory setPossiblysensitive(Integer possiblysensitive) {
        this.possiblysensitive = possiblysensitive;
        return this;
    }

    @Override
    public String getSource() {
        return this.source;
    }

    @Override
    public TbStory setSource(String source) {
        this.source = source;
        return this;
    }

    @Override
    public String getStory() {
        return this.story;
    }

    @Override
    public TbStory setStory(String story) {
        this.story = story;
        return this;
    }

    @Override
    public Integer getLikecount() {
        return this.likecount;
    }

    @Override
    public TbStory setLikecount(Integer likecount) {
        this.likecount = likecount;
        return this;
    }

    @Override
    public Integer getCommentcount() {
        return this.commentcount;
    }

    @Override
    public TbStory setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
        return this;
    }

    @Override
    public Integer getCautioncount() {
        return this.cautioncount;
    }

    @Override
    public TbStory setCautioncount(Integer cautioncount) {
        this.cautioncount = cautioncount;
        return this;
    }

    @Override
    public String getCategoryname() {
        return this.categoryname;
    }

    @Override
    public TbStory setCategoryname(String categoryname) {
        this.categoryname = categoryname;
        return this;
    }

    @Override
    public String getSectorname() {
        return this.sectorname;
    }

    @Override
    public TbStory setSectorname(String sectorname) {
        this.sectorname = sectorname;
        return this;
    }

    @Override
    public String getCompanyid() {
        return this.companyid;
    }

    @Override
    public TbStory setCompanyid(String companyid) {
        this.companyid = companyid;
        return this;
    }

    @Override
    public String getSectorid() {
        return this.sectorid;
    }

    @Override
    public TbStory setSectorid(String sectorid) {
        this.sectorid = sectorid;
        return this;
    }

    @Override
    public String getCategoryid() {
        return this.categoryid;
    }

    @Override
    public TbStory setCategoryid(String categoryid) {
        this.categoryid = categoryid;
        return this;
    }

    @Override
    public String getAuthorname() {
        return this.authorname;
    }

    @Override
    public TbStory setAuthorname(String authorname) {
        this.authorname = authorname;
        return this;
    }

    @Override
    public String getCompanyname() {
        return this.companyname;
    }

    @Override
    public TbStory setCompanyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    @Override
    public String getCreatedon() {
        return this.createdon;
    }

    @Override
    public TbStory setCreatedon(String createdon) {
        this.createdon = createdon;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbStory (");

        sb.append(id);
        sb.append(", ").append(authorid);
        sb.append(", ").append(entities);
        sb.append(", ").append(sid);
        sb.append(", ").append(lang);
        sb.append(", ").append(possiblysensitive);
        sb.append(", ").append(source);
        sb.append(", ").append(story);
        sb.append(", ").append(likecount);
        sb.append(", ").append(commentcount);
        sb.append(", ").append(cautioncount);
        sb.append(", ").append(categoryname);
        sb.append(", ").append(sectorname);
        sb.append(", ").append(companyid);
        sb.append(", ").append(sectorid);
        sb.append(", ").append(categoryid);
        sb.append(", ").append(authorname);
        sb.append(", ").append(companyname);
        sb.append(", ").append(createdon);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITbStory from) {
        setId(from.getId());
        setAuthorid(from.getAuthorid());
        setEntities(from.getEntities());
        setSid(from.getSid());
        setLang(from.getLang());
        setPossiblysensitive(from.getPossiblysensitive());
        setSource(from.getSource());
        setStory(from.getStory());
        setLikecount(from.getLikecount());
        setCommentcount(from.getCommentcount());
        setCautioncount(from.getCautioncount());
        setCategoryname(from.getCategoryname());
        setSectorname(from.getSectorname());
        setCompanyid(from.getCompanyid());
        setSectorid(from.getSectorid());
        setCategoryid(from.getCategoryid());
        setAuthorname(from.getAuthorname());
        setCompanyname(from.getCompanyname());
        setCreatedon(from.getCreatedon());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbStory> E into(E into) {
        into.from(this);
        return into;
    }

    public TbStory(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
