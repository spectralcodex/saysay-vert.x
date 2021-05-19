
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
    private String     phoneNumber;
    private String     sectorName;
    private Integer    rating;
    private String     logo;
    private String     backgroundInfo;
    private String     entities;
    private String     cid;
    private String     code;
    private OffsetTime createdAt;
    private String     createdBy;
    private String     email;
    private String     website;
    private String     otherLinks;
    private String     categoryName;
    private String     sectorId;
    private String     categoryId;

    public CompanyBean() {
    }

    public CompanyBean(JsonObject json) throws DecodeException {
        BaseUtils.isNullEmpty(this.name, "name");
        BaseUtils.isNullEmpty(this.location, "location");
        BaseUtils.isNullEmpty(this.phoneNumber, "phoneNumber");
        BaseUtils.isNullEmpty(this.sectorId, "sectorId");
        BaseUtils.isNullEmpty(this.sectorName, "sectorName");
        BaseUtils.isNullEmpty(this.logo, "logo");
        BaseUtils.isNullEmpty(this.code, "code");
        BaseUtils.isNullEmpty(this.categoryId, "categoryId");
        BaseUtils.isNullEmpty(this.categoryName, "categoryName");
        BaseUtils.isNullEmpty(this.createdBy, "createdBy");
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

    
    public String getName() {
        return this.name;
    }

    
    public CompanyBean setName(String name) {
        this.name = name;
        return this;
    }

    
    public String getLocation() {
        return this.location;
    }

    
    public CompanyBean setLocation(String location) {
        this.location = location;
        return this;
    }

    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    
    public CompanyBean setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    
    public String getSectorName() {
        return this.sectorName;
    }

    
    public CompanyBean setSectorName(String sectorName) {
        this.sectorName = sectorName;
        return this;
    }

    
    public Integer getRating() {
        return this.rating;
    }

    
    public CompanyBean setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    
    public String getLogo() {
        return this.logo;
    }

    
    public CompanyBean setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    
    public String getBackgroundInfo() {
        return this.backgroundInfo;
    }

    
    public CompanyBean setBackgroundInfo(String backgroundInfo) {
        this.backgroundInfo = backgroundInfo;
        return this;
    }

    
    public String getEntities() {
        return this.entities;
    }

    
    public CompanyBean setEntities(String entities) {
        this.entities = entities;
        return this;
    }

    
    public String getCid() {
        return this.cid;
    }

    
    public CompanyBean setCid(String cid) {
        this.cid = cid;
        return this;
    }

    
    public String getCode() {
        return this.code;
    }

    
    public CompanyBean setCode(String code) {
        this.code = code;
        return this;
    }

    
    public OffsetTime getCreatedAt() {
        return this.createdAt;
    }

    
    public CompanyBean setCreatedAt(OffsetTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    
    public String getCreatedBy() {
        return this.createdBy;
    }

    
    public CompanyBean setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    
    public String getEmail() {
        return this.email;
    }

    
    public CompanyBean setEmail(String email) {
        this.email = email;
        return this;
    }

    
    public String getWebsite() {
        return this.website;
    }

    
    public CompanyBean setWebsite(String website) {
        this.website = website;
        return this;
    }

    
    public String getOtherLinks() {
        return this.otherLinks;
    }

    
    public CompanyBean setOtherLinks(String otherLinks) {
        this.otherLinks = otherLinks;
        return this;
    }

    
    public String getCategoryName() {
        return this.categoryName;
    }

    
    public CompanyBean setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    
    public String getSectorId() {
        return this.sectorId;
    }

    
    public CompanyBean setSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    
    public String getCategoryId() {
        return this.categoryId;
    }

    
    public CompanyBean setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
}
