
package io.vertx.saysayX.ms.administration.pojo;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;

import java.time.OffsetTime;

@DataObject(generateConverter = true)
public class CompanyBean {

    private static final long serialVersionUID = 1487555569;

    private Long       id;
    private String     name;
    private String     location;
    private String     phonenumber;
    private String     sectorname;
    private Integer    rating;
    private String     logo;
    private String     backgroundinfo;
    private String     entities;
    private String     cid;
    private String     code;
    private OffsetTime createdat;
    private String     createdby;
    private String     email;
    private String     website;
    private String     otherlinks;
    private String     categoryname;
    private String     sectorid;
    private String     categoryid;
    private Integer     active;

    public CompanyBean() {
    }

    public CompanyBean(JsonObject json) throws DecodeException {
        CompanyBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.name, "name");
        BaseUtils.isNullEmpty(this.location, "location");
        BaseUtils.isNullEmpty(this.phonenumber, "phonenumber");
        BaseUtils.isNullEmpty(this.sectorid, "sectorid");
        BaseUtils.isNullEmpty(this.sectorname, "sectorname");
        BaseUtils.isNullEmpty(this.logo, "logo");
        BaseUtils.isNullEmpty(this.code, "code");
        BaseUtils.isNullEmpty(this.categoryid, "categoryid");
        BaseUtils.isNullEmpty(this.categoryname, "categoryname");
        BaseUtils.isNullEmpty(this.createdby, "createdby");
    }

    public JsonObject toJson() {
        JsonObject json = new JsonObject();
        CompanyBeanConverter.toJson(this, json);
        return json;
    }

    public Long getId() {
        return this.id;
    }

    public CompanyBean setId(Long id) {
        this.id = id;
        return this;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public CompanyBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public CompanyBean setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public CompanyBean setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public String getSectorname() {
        return sectorname;
    }

    public CompanyBean setSectorname(String sectorname) {
        this.sectorname = sectorname;
        return this;
    }

    public Integer getRating() {
        return rating;
    }

    public CompanyBean setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public CompanyBean setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getBackgroundinfo() {
        return backgroundinfo;
    }

    public CompanyBean setBackgroundinfo(String backgroundinfo) {
        this.backgroundinfo = backgroundinfo;
        return this;
    }

    public String getEntities() {
        return entities;
    }

    public CompanyBean setEntities(String entities) {
        this.entities = entities;
        return this;
    }

    public String getCid() {
        return cid;
    }

    public CompanyBean setCid(String cid) {
        this.cid = cid;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CompanyBean setCode(String code) {
        this.code = code;
        return this;
    }

    public OffsetTime getCreatedat() {
        return createdat;
    }

    public CompanyBean setCreatedat(OffsetTime createdat) {
        this.createdat = createdat;
        return this;
    }

    public String getCreatedby() {
        return createdby;
    }

    public CompanyBean setCreatedby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CompanyBean setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public CompanyBean setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getOtherlinks() {
        return otherlinks;
    }

    public CompanyBean setOtherlinks(String otherlinks) {
        this.otherlinks = otherlinks;
        return this;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public CompanyBean setCategoryname(String categoryname) {
        this.categoryname = categoryname;
        return this;
    }

    public String getSectorid() {
        return sectorid;
    }

    public CompanyBean setSectorid(String sectorid) {
        this.sectorid = sectorid;
        return this;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public CompanyBean setCategoryid(String categoryid) {
        this.categoryid = categoryid;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public CompanyBean setActive(Integer active) {
        this.active = active;
        return this;
    }
}
