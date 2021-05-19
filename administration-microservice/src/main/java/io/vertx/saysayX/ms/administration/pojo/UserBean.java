package io.vertx.saysayX.ms.administration.pojo;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.saysayX.common.config.BaseUtils;

import java.time.OffsetDateTime;

@DataObject(generateConverter = true)
public class UserBean {
    private Long           id;
    private String         roleId;
    private String         firstName;
    private String         lastName;
    private String         email;
    private String         mobile;
    private String         hashedPassword;
    private String         salt;
    private String         profilePic;
    private String         backgroundInfo;
    private String         website;
    private String         gpsLocation;
    private String         dob;
    private String         otherInfo;
    private String         createdBy;
    private OffsetDateTime createdOn;
    private String         roleName;
    private String         uid;
    
    
    public UserBean(){}

    public UserBean(JsonObject json){
        UserBeanConverter.fromJson(json, this);
        BaseUtils.isNullEmpty(this.roleId, "roleId");
        BaseUtils.isNullEmpty(this.firstName, "firstName");
        BaseUtils.isNullEmpty(this.lastName, "lastName");
        BaseUtils.isNullEmpty(this.mobile, "mobile");
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

    
    public String getRoleId() {
        return this.roleId;
    }

    
    public UserBean setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    
    public String getFirstName() {
        return this.firstName;
    }

    
    public UserBean setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    
    public String getLastName() {
        return this.lastName;
    }

    
    public UserBean setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    
    public String getEmail() {
        return this.email;
    }

    
    public UserBean setEmail(String email) {
        this.email = email;
        return this;
    }

    
    public String getMobile() {
        return this.mobile;
    }

    
    public UserBean setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    
    public UserBean setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
        return this;
    }

    
    public String getSalt() {
        return this.salt;
    }

    
    public UserBean setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    
    public String getProfilePic() {
        return this.profilePic;
    }

    
    public UserBean setProfilePic(String profilePic) {
        this.profilePic = profilePic;
        return this;
    }

    
    public String getBackgroundInfo() {
        return this.backgroundInfo;
    }

    
    public UserBean setBackgroundInfo(String backgroundInfo) {
        this.backgroundInfo = backgroundInfo;
        return this;
    }

    
    public String getWebsite() {
        return this.website;
    }

    
    public UserBean setWebsite(String website) {
        this.website = website;
        return this;
    }

    
    public String getGpsLocation() {
        return this.gpsLocation;
    }

    
    public UserBean setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
        return this;
    }

    
    public String getDob() {
        return this.dob;
    }

    
    public UserBean setDob(String dob) {
        this.dob = dob;
        return this;
    }

    
    public String getOtherInfo() {
        return this.otherInfo;
    }

    
    public UserBean setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
        return this;
    }

    
    public String getCreatedBy() {
        return this.createdBy;
    }

    
    public UserBean setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    
    public UserBean setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    
    public String getRoleName() {
        return this.roleName;
    }

    
    public UserBean setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    
    public String getUid() {
        return this.uid;
    }

    
    public UserBean setUid(String uid) {
        this.uid = uid;
        return this;
    }
}
