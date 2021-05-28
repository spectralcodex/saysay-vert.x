/*
 * This file is generated by jOOQ.
 */
package jooq.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import jooq.tables.interfaces.ITbUser;


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
public class TbUser implements VertxPojo, ITbUser {

    private static final long serialVersionUID = -313203802;

    private Long    id;
    private String  roleid;
    private String  firstname;
    private String  lastname;
    private String  email;
    private String  mobile;
    private String  hashedpassword;
    private String  salt;
    private String  profilepic;
    private String  backgroundinfo;
    private String  website;
    private String  gpslocation;
    private String  dob;
    private String  otherinfo;
    private String  createdby;
    private String  rolename;
    private String  uid;
    private Integer active;
    private String  createdon;

    public TbUser() {}

    public TbUser(ITbUser value) {
        this.id = value.getId();
        this.roleid = value.getRoleid();
        this.firstname = value.getFirstname();
        this.lastname = value.getLastname();
        this.email = value.getEmail();
        this.mobile = value.getMobile();
        this.hashedpassword = value.getHashedpassword();
        this.salt = value.getSalt();
        this.profilepic = value.getProfilepic();
        this.backgroundinfo = value.getBackgroundinfo();
        this.website = value.getWebsite();
        this.gpslocation = value.getGpslocation();
        this.dob = value.getDob();
        this.otherinfo = value.getOtherinfo();
        this.createdby = value.getCreatedby();
        this.rolename = value.getRolename();
        this.uid = value.getUid();
        this.active = value.getActive();
        this.createdon = value.getCreatedon();
    }

    public TbUser(
        Long    id,
        String  roleid,
        String  firstname,
        String  lastname,
        String  email,
        String  mobile,
        String  hashedpassword,
        String  salt,
        String  profilepic,
        String  backgroundinfo,
        String  website,
        String  gpslocation,
        String  dob,
        String  otherinfo,
        String  createdby,
        String  rolename,
        String  uid,
        Integer active,
        String  createdon
    ) {
        this.id = id;
        this.roleid = roleid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.hashedpassword = hashedpassword;
        this.salt = salt;
        this.profilepic = profilepic;
        this.backgroundinfo = backgroundinfo;
        this.website = website;
        this.gpslocation = gpslocation;
        this.dob = dob;
        this.otherinfo = otherinfo;
        this.createdby = createdby;
        this.rolename = rolename;
        this.uid = uid;
        this.active = active;
        this.createdon = createdon;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public TbUser setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getRoleid() {
        return this.roleid;
    }

    @Override
    public TbUser setRoleid(String roleid) {
        this.roleid = roleid;
        return this;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public TbUser setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public TbUser setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public TbUser setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String getMobile() {
        return this.mobile;
    }

    @Override
    public TbUser setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @Override
    public String getHashedpassword() {
        return this.hashedpassword;
    }

    @Override
    public TbUser setHashedpassword(String hashedpassword) {
        this.hashedpassword = hashedpassword;
        return this;
    }

    @Override
    public String getSalt() {
        return this.salt;
    }

    @Override
    public TbUser setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    @Override
    public String getProfilepic() {
        return this.profilepic;
    }

    @Override
    public TbUser setProfilepic(String profilepic) {
        this.profilepic = profilepic;
        return this;
    }

    @Override
    public String getBackgroundinfo() {
        return this.backgroundinfo;
    }

    @Override
    public TbUser setBackgroundinfo(String backgroundinfo) {
        this.backgroundinfo = backgroundinfo;
        return this;
    }

    @Override
    public String getWebsite() {
        return this.website;
    }

    @Override
    public TbUser setWebsite(String website) {
        this.website = website;
        return this;
    }

    @Override
    public String getGpslocation() {
        return this.gpslocation;
    }

    @Override
    public TbUser setGpslocation(String gpslocation) {
        this.gpslocation = gpslocation;
        return this;
    }

    @Override
    public String getDob() {
        return this.dob;
    }

    @Override
    public TbUser setDob(String dob) {
        this.dob = dob;
        return this;
    }

    @Override
    public String getOtherinfo() {
        return this.otherinfo;
    }

    @Override
    public TbUser setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
        return this;
    }

    @Override
    public String getCreatedby() {
        return this.createdby;
    }

    @Override
    public TbUser setCreatedby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    @Override
    public String getRolename() {
        return this.rolename;
    }

    @Override
    public TbUser setRolename(String rolename) {
        this.rolename = rolename;
        return this;
    }

    @Override
    public String getUid() {
        return this.uid;
    }

    @Override
    public TbUser setUid(String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public Integer getActive() {
        return this.active;
    }

    @Override
    public TbUser setActive(Integer active) {
        this.active = active;
        return this;
    }

    @Override
    public String getCreatedon() {
        return this.createdon;
    }

    @Override
    public TbUser setCreatedon(String createdon) {
        this.createdon = createdon;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TbUser (");

        sb.append(id);
        sb.append(", ").append(roleid);
        sb.append(", ").append(firstname);
        sb.append(", ").append(lastname);
        sb.append(", ").append(email);
        sb.append(", ").append(mobile);
        sb.append(", ").append(hashedpassword);
        sb.append(", ").append(salt);
        sb.append(", ").append(profilepic);
        sb.append(", ").append(backgroundinfo);
        sb.append(", ").append(website);
        sb.append(", ").append(gpslocation);
        sb.append(", ").append(dob);
        sb.append(", ").append(otherinfo);
        sb.append(", ").append(createdby);
        sb.append(", ").append(rolename);
        sb.append(", ").append(uid);
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
    public void from(ITbUser from) {
        setId(from.getId());
        setRoleid(from.getRoleid());
        setFirstname(from.getFirstname());
        setLastname(from.getLastname());
        setEmail(from.getEmail());
        setMobile(from.getMobile());
        setHashedpassword(from.getHashedpassword());
        setSalt(from.getSalt());
        setProfilepic(from.getProfilepic());
        setBackgroundinfo(from.getBackgroundinfo());
        setWebsite(from.getWebsite());
        setGpslocation(from.getGpslocation());
        setDob(from.getDob());
        setOtherinfo(from.getOtherinfo());
        setCreatedby(from.getCreatedby());
        setRolename(from.getRolename());
        setUid(from.getUid());
        setActive(from.getActive());
        setCreatedon(from.getCreatedon());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbUser> E into(E into) {
        into.from(this);
        return into;
    }

    public TbUser(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}