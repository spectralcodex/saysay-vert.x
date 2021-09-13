/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.tables.TbInterest;
import jooq.tables.interfaces.ITbInterest;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TbInterestRecord extends UpdatableRecordImpl<TbInterestRecord> implements VertxPojo, Record6<Long, String, String, String, String, Timestamp>, ITbInterest {

    private static final long serialVersionUID = 1657517153;

    /**
     * Setter for <code>public.tb_interest.id</code>.
     */
    @Override
    public TbInterestRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_interest.iid</code>.
     */
    @Override
    public TbInterestRecord setIid(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.iid</code>.
     */
    @Override
    public String getIid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tb_interest.description</code>.
     */
    @Override
    public TbInterestRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tb_interest.name</code>.
     */
    @Override
    public TbInterestRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tb_interest.createdby</code>.
     */
    @Override
    public TbInterestRecord setCreatedby(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.createdby</code>.
     */
    @Override
    public String getCreatedby() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tb_interest.createdon</code>.
     */
    @Override
    public TbInterestRecord setCreatedon(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_interest.createdon</code>.
     */
    @Override
    public Timestamp getCreatedon() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbInterest.TB_INTEREST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbInterest.TB_INTEREST.IID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbInterest.TB_INTEREST.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbInterest.TB_INTEREST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbInterest.TB_INTEREST.CREATEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TbInterest.TB_INTEREST.CREATEDON;
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
        return getIid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCreatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getIid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value2(String value) {
        setIid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value5(String value) {
        setCreatedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord value6(Timestamp value) {
        setCreatedon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbInterestRecord values(Long value1, String value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITbInterest from) {
        setId(from.getId());
        setIid(from.getIid());
        setDescription(from.getDescription());
        setName(from.getName());
        setCreatedby(from.getCreatedby());
        setCreatedon(from.getCreatedon());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbInterest> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbInterestRecord
     */
    public TbInterestRecord() {
        super(TbInterest.TB_INTEREST);
    }

    /**
     * Create a detached, initialised TbInterestRecord
     */
    public TbInterestRecord(Long id, String iid, String description, String name, String createdby, Timestamp createdon) {
        super(TbInterest.TB_INTEREST);

        set(0, id);
        set(1, iid);
        set(2, description);
        set(3, name);
        set(4, createdby);
        set(5, createdon);
    }

    public TbInterestRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
