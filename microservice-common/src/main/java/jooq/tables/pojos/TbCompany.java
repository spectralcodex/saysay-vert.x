/*
 * This file is generated by jOOQ.
 */
package jooq.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import jooq.tables.interfaces.ITbCompany;


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
public class TbCompany implements VertxPojo, ITbCompany {

    private static final long serialVersionUID = 196625467;

    private Long    id;
    private String  name;
    private String  location;
    private String  phonenumber;
    private String  sectorname;
    private Integer rating;
    private String  logo;
    private String  backgroundinfo;
    private String  entities;
    private String  cid;
    private String  code;
    private String  createdby;
    private String  email;
    private String  website;
    private String  otherlinks;
    private String  categoryname;
    private String  sectorid;
    private String  categoryid;
    private Integer active;
    private String  createdon;

    public TbCompany() {}

    public TbCompany(ITbCompany value) {
        this.id = value.getId();
        this.name = value.getName();
        this.location = value.getLocation();
        this.phonenumber = value.getPhonenumber();
        this.sectorname = value.getSectorname();
        this.rating = value.getRating();
        this.logo = value.getLogo();
        this.backgroundinfo = value.getBackgroundinfo();
        this.entities = value.getEntities();
        this.cid = value.getCid();
        this.code = value.getCode();
        this.createdby = value.getCreatedby();
        this.email = value.getEmail();
        this.website = value.getWebsite();
        this.otherlinks = value.getOtherlinks();
        this.categoryname = value.getCategoryname();
        this.sectorid = value.getSectorid();
        this.categoryid = value.getCategoryid();
        this.active = value.getActive();
        this.createdon = value.getCreatedon();
    }

    public TbCompany(
        Long    id,
        String  name,
        String  location,
        String  phonenumber,
        String  sectorname,
        Integer rating,
        String  logo,
        String  backgroundinfo,
        String  entities,
        String  cid,
        String  code,
        String  createdby,
        String  email,
        String  website,
        String  otherlinks,
        String  categoryname,
        String  sectorid,
        String  categoryid,
        Integer active,
        String  createdon
    ) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phonenumber = phonenumber;
        this.sectorname = sectorname;
        this.rating = rating;
        this.logo = logo;
        this.backgroundinfo = backgroundinfo;
        this.entities = entities;
        this.cid = cid;
        this.code = code;
        this.createdby = createdby;
        this.email = email;
        this.website = website;
        this.otherlinks = otherlinks;
        this.categoryname = categoryname;
        this.sectorid = sectorid;
        this.categoryid = categoryid;
        this.active = active;
        this.createdon = createdon;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public TbCompany setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TbCompany setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public TbCompany setLocation(String location) {
        this.location = location;
        return this;
    }

    @Override
    public String getPhonenumber() {
        return this.phonenumber;
    }

    @Override
    public TbCompany setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    @Override
    public String getSectorname() {
        return this.sectorname;
    }

    @Override
    public TbCompany setSectorname(String sectorname) {
        this.sectorname = sectorname;
        return this;
    }

    @Override
    public Integer getRating() {
        return this.rating;
    }

    @Override
    public TbCompany setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String getLogo() {
        return this.logo;
    }

    @Override
    public TbCompany setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @Override
    public String getBackgroundinfo() {
        return this.backgroundinfo;
    }

    @Override
    public TbCompany setBackgroundinfo(String backgroundinfo) {
        this.backgroundinfo = backgroundinfo;
        return this;
    }

    @Override
    public String getEntities() {
        return this.entities;
    }

    @Override
    public TbCompany setEntities(String entities) {
        this.entities = entities;
        return this;
    }

    @Override
    public String getCid() {
        return this.cid;
    }

    @Override
    public TbCompany setCid(String cid) {
        this.cid = cid;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public TbCompany setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getCreatedby() {
        return this.createdby;
    }

    @Override
    public TbCompany setCreatedby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public TbCompany setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String getWebsite() {
        return this.website;
    }

    @Override
    public TbCompany setWebsite(String website) {
        this.website = website;
        return this;
    }

    @Override
    public String getOtherlinks() {
        return this.otherlinks;
    }

    @Override
    public TbCompany setOtherlinks(String otherlinks) {
        this.otherlinks = otherlinks;
        return this;
    }

    @Override
    public String getCategoryname() {
        return this.categoryname;
    }

    @Override
    public TbCompany setCategoryname(String categoryname) {
        this.categoryname = categoryname;
        return this;
    }

    @Override
    public String getSectorid() {
        return this.sectorid;
    }

    @Override
    public TbCompany setSectorid(String sectorid) {
        this.sectorid = sectorid;
        return this;
    }

    @Override
    public String getCategoryid() {
        return this.categoryid;
    }

    @Override
    public TbCompany setCategoryid(String categoryid) {
        this.categoryid = categoryid;
        return this;
    }

    @Override
    public Integer getActive() {
        return this.active;
    }

    @Override
    public TbCompany setActive(Integer active) {
        this.active = active;
        return this;
    }

    @Override
    public String getCreatedon() {
        return this.createdon;
    }

    @Override
    public TbCompany setCreatedon(String createdon) {
        this.createdon = createdon;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbCompany (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(location);
        sb.append(", ").append(phonenumber);
        sb.append(", ").append(sectorname);
        sb.append(", ").append(rating);
        sb.append(", ").append(logo);
        sb.append(", ").append(backgroundinfo);
        sb.append(", ").append(entities);
        sb.append(", ").append(cid);
        sb.append(", ").append(code);
        sb.append(", ").append(createdby);
        sb.append(", ").append(email);
        sb.append(", ").append(website);
        sb.append(", ").append(otherlinks);
        sb.append(", ").append(categoryname);
        sb.append(", ").append(sectorid);
        sb.append(", ").append(categoryid);
        sb.append(", ").append(active);
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
    public void from(ITbCompany from) {
        setId(from.getId());
        setName(from.getName());
        setLocation(from.getLocation());
        setPhonenumber(from.getPhonenumber());
        setSectorname(from.getSectorname());
        setRating(from.getRating());
        setLogo(from.getLogo());
        setBackgroundinfo(from.getBackgroundinfo());
        setEntities(from.getEntities());
        setCid(from.getCid());
        setCode(from.getCode());
        setCreatedby(from.getCreatedby());
        setEmail(from.getEmail());
        setWebsite(from.getWebsite());
        setOtherlinks(from.getOtherlinks());
        setCategoryname(from.getCategoryname());
        setSectorid(from.getSectorid());
        setCategoryid(from.getCategoryid());
        setActive(from.getActive());
        setCreatedon(from.getCreatedon());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbCompany> E into(E into) {
        into.from(this);
        return into;
    }

    public TbCompany(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
