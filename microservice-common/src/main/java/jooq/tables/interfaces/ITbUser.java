/*
 * This file is generated by jOOQ.
 */
package jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;

import javax.annotation.Generated;


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
public interface ITbUser extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.tb_user.id</code>.
     */
    public ITbUser setId(Long value);

    /**
     * Getter for <code>public.tb_user.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>public.tb_user.roleid</code>.
     */
    public ITbUser setRoleid(String value);

    /**
     * Getter for <code>public.tb_user.roleid</code>.
     */
    public String getRoleid();

    /**
     * Setter for <code>public.tb_user.firstname</code>.
     */
    public ITbUser setFirstname(String value);

    /**
     * Getter for <code>public.tb_user.firstname</code>.
     */
    public String getFirstname();

    /**
     * Setter for <code>public.tb_user.lastname</code>.
     */
    public ITbUser setLastname(String value);

    /**
     * Getter for <code>public.tb_user.lastname</code>.
     */
    public String getLastname();

    /**
     * Setter for <code>public.tb_user.email</code>.
     */
    public ITbUser setEmail(String value);

    /**
     * Getter for <code>public.tb_user.email</code>.
     */
    public String getEmail();

    /**
     * Setter for <code>public.tb_user.mobile</code>.
     */
    public ITbUser setMobile(String value);

    /**
     * Getter for <code>public.tb_user.mobile</code>.
     */
    public String getMobile();

    /**
     * Setter for <code>public.tb_user.hashedpassword</code>.
     */
    public ITbUser setHashedpassword(String value);

    /**
     * Getter for <code>public.tb_user.hashedpassword</code>.
     */
    public String getHashedpassword();

    /**
     * Setter for <code>public.tb_user.salt</code>.
     */
    public ITbUser setSalt(String value);

    /**
     * Getter for <code>public.tb_user.salt</code>.
     */
    public String getSalt();

    /**
     * Setter for <code>public.tb_user.profilepic</code>.
     */
    public ITbUser setProfilepic(String value);

    /**
     * Getter for <code>public.tb_user.profilepic</code>.
     */
    public String getProfilepic();

    /**
     * Setter for <code>public.tb_user.backgroundinfo</code>.
     */
    public ITbUser setBackgroundinfo(String value);

    /**
     * Getter for <code>public.tb_user.backgroundinfo</code>.
     */
    public String getBackgroundinfo();

    /**
     * Setter for <code>public.tb_user.website</code>.
     */
    public ITbUser setWebsite(String value);

    /**
     * Getter for <code>public.tb_user.website</code>.
     */
    public String getWebsite();

    /**
     * Setter for <code>public.tb_user.gpslocation</code>.
     */
    public ITbUser setGpslocation(String value);

    /**
     * Getter for <code>public.tb_user.gpslocation</code>.
     */
    public String getGpslocation();

    /**
     * Setter for <code>public.tb_user.dob</code>.
     */
    public ITbUser setDob(String value);

    /**
     * Getter for <code>public.tb_user.dob</code>.
     */
    public String getDob();

    /**
     * Setter for <code>public.tb_user.otherinfo</code>.
     */
    public ITbUser setOtherinfo(String value);

    /**
     * Getter for <code>public.tb_user.otherinfo</code>.
     */
    public String getOtherinfo();

    /**
     * Setter for <code>public.tb_user.createdby</code>.
     */
    public ITbUser setCreatedby(String value);

    /**
     * Getter for <code>public.tb_user.createdby</code>.
     */
    public String getCreatedby();

    /**
     * Setter for <code>public.tb_user.rolename</code>.
     */
    public ITbUser setRolename(String value);

    /**
     * Getter for <code>public.tb_user.rolename</code>.
     */
    public String getRolename();

    /**
     * Setter for <code>public.tb_user.uid</code>.
     */
    public ITbUser setUid(String value);

    /**
     * Getter for <code>public.tb_user.uid</code>.
     */
    public String getUid();

    /**
     * Setter for <code>public.tb_user.active</code>.
     */
    public ITbUser setActive(Integer value);

    /**
     * Getter for <code>public.tb_user.active</code>.
     */
    public Integer getActive();

    /**
     * Setter for <code>public.tb_user.createdon</code>.
     */
    public ITbUser setCreatedon(String value);

    /**
     * Getter for <code>public.tb_user.createdon</code>.
     */
    public String getCreatedon();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITbUser
     */
    public void from(jooq.tables.interfaces.ITbUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITbUser
     */
    public <E extends jooq.tables.interfaces.ITbUser> E into(E into);

    @Override
    public default ITbUser fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getLong("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Long",e);
        }
        try {
            setRoleid(json.getString("roleid"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("roleid","java.lang.String",e);
        }
        try {
            setFirstname(json.getString("firstname"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("firstname","java.lang.String",e);
        }
        try {
            setLastname(json.getString("lastname"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("lastname","java.lang.String",e);
        }
        try {
            setEmail(json.getString("email"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("email","java.lang.String",e);
        }
        try {
            setMobile(json.getString("mobile"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("mobile","java.lang.String",e);
        }
        try {
            setHashedpassword(json.getString("hashedpassword"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("hashedpassword","java.lang.String",e);
        }
        try {
            setSalt(json.getString("salt"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("salt","java.lang.String",e);
        }
        try {
            setProfilepic(json.getString("profilepic"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("profilepic","java.lang.String",e);
        }
        try {
            setBackgroundinfo(json.getString("backgroundinfo"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("backgroundinfo","java.lang.String",e);
        }
        try {
            setWebsite(json.getString("website"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("website","java.lang.String",e);
        }
        try {
            setGpslocation(json.getString("gpslocation"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("gpslocation","java.lang.String",e);
        }
        try {
            setDob(json.getString("dob"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("dob","java.lang.String",e);
        }
        try {
            setOtherinfo(json.getString("otherinfo"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("otherinfo","java.lang.String",e);
        }
        try {
            setCreatedby(json.getString("createdby"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("createdby","java.lang.String",e);
        }
        try {
            setRolename(json.getString("rolename"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("rolename","java.lang.String",e);
        }
        try {
            setUid(json.getString("uid"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("uid","java.lang.String",e);
        }
        try {
            setActive(json.getInteger("active"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("active","java.lang.Integer",e);
        }
        try {
            setCreatedon(json.getString("createdon"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("createdon","java.lang.String",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("roleid",getRoleid());
        json.put("firstname",getFirstname());
        json.put("lastname",getLastname());
        json.put("email",getEmail());
        json.put("mobile",getMobile());
        json.put("hashedpassword",getHashedpassword());
        json.put("salt",getSalt());
        json.put("profilepic",getProfilepic());
        json.put("backgroundinfo",getBackgroundinfo());
        json.put("website",getWebsite());
        json.put("gpslocation",getGpslocation());
        json.put("dob",getDob());
        json.put("otherinfo",getOtherinfo());
        json.put("createdby",getCreatedby());
        json.put("rolename",getRolename());
        json.put("uid",getUid());
        json.put("active",getActive());
        json.put("createdon",getCreatedon());
        return json;
    }

}