/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import jooq.tables.TbCompany;
import jooq.tables.interfaces.ITbCompany;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class TbCompanyRecord extends UpdatableRecordImpl<TbCompanyRecord> implements VertxPojo, Record20<Long, String, String, String, String, Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String>, ITbCompany {

    private static final long serialVersionUID = 1097805814;

    /**
     * Setter for <code>public.tb_company.id</code>.
     */
    @Override
    public TbCompanyRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_company.name</code>.
     */
    @Override
    public TbCompanyRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tb_company.location</code>.
     */
    @Override
    public TbCompanyRecord setLocation(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.location</code>.
     */
    @Override
    public String getLocation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tb_company.phonenumber</code>.
     */
    @Override
    public TbCompanyRecord setPhonenumber(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.phonenumber</code>.
     */
    @Override
    public String getPhonenumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tb_company.sectorname</code>.
     */
    @Override
    public TbCompanyRecord setSectorname(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.sectorname</code>.
     */
    @Override
    public String getSectorname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tb_company.rating</code>.
     */
    @Override
    public TbCompanyRecord setRating(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.rating</code>.
     */
    @Override
    public Integer getRating() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.tb_company.logo</code>.
     */
    @Override
    public TbCompanyRecord setLogo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.logo</code>.
     */
    @Override
    public String getLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tb_company.backgroundinfo</code>.
     */
    @Override
    public TbCompanyRecord setBackgroundinfo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.backgroundinfo</code>.
     */
    @Override
    public String getBackgroundinfo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tb_company.entities</code>.
     */
    @Override
    public TbCompanyRecord setEntities(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.entities</code>.
     */
    @Override
    public String getEntities() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.tb_company.cid</code>.
     */
    @Override
    public TbCompanyRecord setCid(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.cid</code>.
     */
    @Override
    public String getCid() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.tb_company.code</code>.
     */
    @Override
    public TbCompanyRecord setCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.code</code>.
     */
    @Override
    public String getCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.tb_company.createdby</code>.
     */
    @Override
    public TbCompanyRecord setCreatedby(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.createdby</code>.
     */
    @Override
    public String getCreatedby() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.tb_company.email</code>.
     */
    @Override
    public TbCompanyRecord setEmail(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.tb_company.website</code>.
     */
    @Override
    public TbCompanyRecord setWebsite(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.website</code>.
     */
    @Override
    public String getWebsite() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.tb_company.otherlinks</code>.
     */
    @Override
    public TbCompanyRecord setOtherlinks(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.otherlinks</code>.
     */
    @Override
    public String getOtherlinks() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.tb_company.categoryname</code>.
     */
    @Override
    public TbCompanyRecord setCategoryname(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.categoryname</code>.
     */
    @Override
    public String getCategoryname() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.tb_company.sectorid</code>.
     */
    @Override
    public TbCompanyRecord setSectorid(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.sectorid</code>.
     */
    @Override
    public String getSectorid() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.tb_company.categoryid</code>.
     */
    @Override
    public TbCompanyRecord setCategoryid(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.categoryid</code>.
     */
    @Override
    public String getCategoryid() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.tb_company.active</code>.
     */
    @Override
    public TbCompanyRecord setActive(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.active</code>.
     */
    @Override
    public Integer getActive() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>public.tb_company.createdon</code>.
     */
    @Override
    public TbCompanyRecord setCreatedon(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_company.createdon</code>.
     */
    @Override
    public String getCreatedon() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, String, String, String, String, Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, String, String, String, String, Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbCompany.TB_COMPANY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbCompany.TB_COMPANY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbCompany.TB_COMPANY.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbCompany.TB_COMPANY.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbCompany.TB_COMPANY.SECTORNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TbCompany.TB_COMPANY.RATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TbCompany.TB_COMPANY.LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TbCompany.TB_COMPANY.BACKGROUNDINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TbCompany.TB_COMPANY.ENTITIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TbCompany.TB_COMPANY.CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TbCompany.TB_COMPANY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TbCompany.TB_COMPANY.CREATEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TbCompany.TB_COMPANY.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TbCompany.TB_COMPANY.WEBSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TbCompany.TB_COMPANY.OTHERLINKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TbCompany.TB_COMPANY.CATEGORYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return TbCompany.TB_COMPANY.SECTORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return TbCompany.TB_COMPANY.CATEGORYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return TbCompany.TB_COMPANY.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return TbCompany.TB_COMPANY.CREATEDON;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSectorname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBackgroundinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getEntities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCreatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getOtherlinks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getCategoryname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getSectorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getCategoryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getCreatedon();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSectorname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBackgroundinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEntities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCreatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOtherlinks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCategoryname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSectorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getCategoryid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getCreatedon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value3(String value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value4(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value5(String value) {
        setSectorname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value6(Integer value) {
        setRating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value7(String value) {
        setLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value8(String value) {
        setBackgroundinfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value9(String value) {
        setEntities(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value10(String value) {
        setCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value11(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value12(String value) {
        setCreatedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value13(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value14(String value) {
        setWebsite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value15(String value) {
        setOtherlinks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value16(String value) {
        setCategoryname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value17(String value) {
        setSectorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value18(String value) {
        setCategoryid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value19(Integer value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord value20(String value) {
        setCreatedon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbCompanyRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, Integer value19, String value20) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbCompanyRecord
     */
    public TbCompanyRecord() {
        super(TbCompany.TB_COMPANY);
    }

    /**
     * Create a detached, initialised TbCompanyRecord
     */
    public TbCompanyRecord(Long id, String name, String location, String phonenumber, String sectorname, Integer rating, String logo, String backgroundinfo, String entities, String cid, String code, String createdby, String email, String website, String otherlinks, String categoryname, String sectorid, String categoryid, Integer active, String createdon) {
        super(TbCompany.TB_COMPANY);

        set(0, id);
        set(1, name);
        set(2, location);
        set(3, phonenumber);
        set(4, sectorname);
        set(5, rating);
        set(6, logo);
        set(7, backgroundinfo);
        set(8, entities);
        set(9, cid);
        set(10, code);
        set(11, createdby);
        set(12, email);
        set(13, website);
        set(14, otherlinks);
        set(15, categoryname);
        set(16, sectorid);
        set(17, categoryid);
        set(18, active);
        set(19, createdon);
    }

    public TbCompanyRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}