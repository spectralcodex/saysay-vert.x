package io.vertx.saysayX.ms.administration.pojo;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.DecodeException;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;

import java.time.OffsetDateTime;

@DataObject(generateConverter = true)
public class UserBean {
    private Long           id;
    private String         roleid;
    private String         firstname;
    private String         lastname;
    private String         email;
    private String         mobile;
    private String         password;
    private String         profilepic;
    private String         backgroundinfo;
    private String         website;
    private String         gpslocation;
    private String         dob;
    private String         otherinfo;
    private String         createdby;
    private OffsetDateTime createdon;
    private String         rolename;
    private String         uid;
    private String         verificationCode;
    private Integer        active;

    
    
    public UserBean(){}

    public UserBean(JsonObject json) throws DecodeException {
        UserBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.roleid, "roleid");
        BaseUtils.isNullEmpty(this.rolename, "rolename");
        BaseUtils.isNullEmpty(this.email, "email");
    }

    public JsonObject toJson(){
        JsonObject json = new JsonObject();
        UserBeanConverter.toJson(this, json);
        return json;
    }
    public Long getId() {
        return this.id;
    }

    
    public UserBean setId(Long id) {
        this.id = id;
        return this;
    }


    public String getRoleid() {
        return roleid;
    }

    public UserBean setRoleid(String roleid) {
        this.roleid = roleid;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public UserBean setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserBean setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserBean setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public UserBean setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserBean setPassword(String password) {
        this.password = password;
        return this;
    }



    public String getProfilepic() {
        return profilepic;
    }

    public UserBean setProfilepic(String profilepic) {
        this.profilepic = profilepic;
        return this;
    }

    public String getBackgroundinfo() {
        return backgroundinfo;
    }

    public UserBean setBackgroundinfo(String backgroundinfo) {
        this.backgroundinfo = backgroundinfo;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public UserBean setWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getGpslocation() {
        return gpslocation;
    }

    public UserBean setGpslocation(String gpslocation) {
        this.gpslocation = gpslocation;
        return this;
    }

    public String getDob() {
        return dob;
    }

    public UserBean setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public UserBean setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
        return this;
    }

    public String getCreatedby() {
        return createdby;
    }

    public UserBean setCreatedby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    public OffsetDateTime getCreatedon() {
        return createdon;
    }

    public UserBean setCreatedon(OffsetDateTime createdon) {
        this.createdon = createdon;
        return this;
    }

    public String getRolename() {
        return rolename;
    }

    public UserBean setRolename(String rolename) {
        this.rolename = rolename;
        return this;
    }

    public String getUid() {
        return uid;
    }

    public UserBean setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public Integer getActive() {
        return active;
    }

    public UserBean setActive(Integer active) {
        this.active = active;
        return this;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public UserBean setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
}
