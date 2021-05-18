/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import jooq.tables.TbUser;
import jooq.tables.interfaces.ITbUser;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TbUserRecord extends UpdatableRecordImpl<TbUserRecord> implements VertxPojo, Record16<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, OffsetDateTime>, ITbUser {

    private static final long serialVersionUID = -1809707306;

    /**
     * Setter for <code>public.tb_user.id</code>.
     */
    @Override
    public TbUserRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_user.role_id</code>.
     */
    @Override
    public TbUserRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.role_id</code>.
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tb_user.first_name</code>.
     */
    @Override
    public TbUserRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tb_user.last_name</code>.
     */
    @Override
    public TbUserRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.last_name</code>.
     */
    @Override
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tb_user.email</code>.
     */
    @Override
    public TbUserRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tb_user.mobile</code>.
     */
    @Override
    public TbUserRecord setMobile(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.mobile</code>.
     */
    @Override
    public String getMobile() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.tb_user.hashed_password</code>.
     */
    @Override
    public TbUserRecord setHashedPassword(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.hashed_password</code>.
     */
    @Override
    public String getHashedPassword() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tb_user.salt</code>.
     */
    @Override
    public TbUserRecord setSalt(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.salt</code>.
     */
    @Override
    public String getSalt() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tb_user.profile_pic</code>.
     */
    @Override
    public TbUserRecord setProfilePic(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.profile_pic</code>.
     */
    @Override
    public String getProfilePic() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.tb_user.background_info</code>.
     */
    @Override
    public TbUserRecord setBackgroundInfo(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.background_info</code>.
     */
    @Override
    public String getBackgroundInfo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.tb_user.website</code>.
     */
    @Override
    public TbUserRecord setWebsite(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.website</code>.
     */
    @Override
    public String getWebsite() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.tb_user.gps_location</code>.
     */
    @Override
    public TbUserRecord setGpsLocation(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.gps_location</code>.
     */
    @Override
    public String getGpsLocation() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.tb_user.dob</code>.
     */
    @Override
    public TbUserRecord setDob(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.dob</code>.
     */
    @Override
    public String getDob() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.tb_user.other_info</code>.
     */
    @Override
    public TbUserRecord setOtherInfo(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.other_info</code>.
     */
    @Override
    public String getOtherInfo() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.tb_user.created_by</code>.
     */
    @Override
    public TbUserRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.created_by</code>.
     */
    @Override
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.tb_user.created_on</code>.
     */
    @Override
    public TbUserRecord setCreatedOn(OffsetDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_user.created_on</code>.
     */
    @Override
    public OffsetDateTime getCreatedOn() {
        return (OffsetDateTime) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, String, String, String, String, String, String, String, String, OffsetDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbUser.TB_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbUser.TB_USER.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbUser.TB_USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbUser.TB_USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbUser.TB_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TbUser.TB_USER.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TbUser.TB_USER.HASHED_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TbUser.TB_USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TbUser.TB_USER.PROFILE_PIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TbUser.TB_USER.BACKGROUND_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TbUser.TB_USER.WEBSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TbUser.TB_USER.GPS_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TbUser.TB_USER.DOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TbUser.TB_USER.OTHER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TbUser.TB_USER.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field16() {
        return TbUser.TB_USER.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getHashedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getProfilePic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getBackgroundInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getGpsLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDob();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getOtherInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component16() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHashedPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getProfilePic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBackgroundInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getGpsLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDob();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getOtherInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value16() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value6(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value7(String value) {
        setHashedPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value8(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value9(String value) {
        setProfilePic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value10(String value) {
        setBackgroundInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value11(String value) {
        setWebsite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value12(String value) {
        setGpsLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value13(String value) {
        setDob(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value14(String value) {
        setOtherInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord value16(OffsetDateTime value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUserRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, OffsetDateTime value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
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
        setRoleId(from.getRoleId());
        setFirstName(from.getFirstName());
        setLastName(from.getLastName());
        setEmail(from.getEmail());
        setMobile(from.getMobile());
        setHashedPassword(from.getHashedPassword());
        setSalt(from.getSalt());
        setProfilePic(from.getProfilePic());
        setBackgroundInfo(from.getBackgroundInfo());
        setWebsite(from.getWebsite());
        setGpsLocation(from.getGpsLocation());
        setDob(from.getDob());
        setOtherInfo(from.getOtherInfo());
        setCreatedBy(from.getCreatedBy());
        setCreatedOn(from.getCreatedOn());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbUser> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbUserRecord
     */
    public TbUserRecord() {
        super(TbUser.TB_USER);
    }

    /**
     * Create a detached, initialised TbUserRecord
     */
    public TbUserRecord(Long id, String roleId, String firstName, String lastName, String email, String mobile, String hashedPassword, String salt, String profilePic, String backgroundInfo, String website, String gpsLocation, String dob, String otherInfo, String createdBy, OffsetDateTime createdOn) {
        super(TbUser.TB_USER);

        set(0, id);
        set(1, roleId);
        set(2, firstName);
        set(3, lastName);
        set(4, email);
        set(5, mobile);
        set(6, hashedPassword);
        set(7, salt);
        set(8, profilePic);
        set(9, backgroundInfo);
        set(10, website);
        set(11, gpsLocation);
        set(12, dob);
        set(13, otherInfo);
        set(14, createdBy);
        set(15, createdOn);
    }

    public TbUserRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
