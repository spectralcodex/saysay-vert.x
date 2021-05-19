/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.OffsetTime;

import javax.annotation.Generated;

import jooq.tables.TbSector;
import jooq.tables.interfaces.ITbSector;

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
public class TbSectorRecord extends UpdatableRecordImpl<TbSectorRecord> implements VertxPojo, Record6<Long, String, String, String, OffsetTime, String>, ITbSector {

    private static final long serialVersionUID = -1637790670;

    /**
     * Setter for <code>public.tb_sector.id</code>.
     */
    @Override
    public TbSectorRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_sector.sid</code>.
     */
    @Override
    public TbSectorRecord setSid(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.sid</code>.
     */
    @Override
    public String getSid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tb_sector.name</code>.
     */
    @Override
    public TbSectorRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tb_sector.created_by</code>.
     */
    @Override
    public TbSectorRecord setCreatedBy(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.created_by</code>.
     */
    @Override
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tb_sector.created_at</code>.
     */
    @Override
    public TbSectorRecord setCreatedAt(OffsetTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.created_at</code>.
     */
    @Override
    public OffsetTime getCreatedAt() {
        return (OffsetTime) get(4);
    }

    /**
     * Setter for <code>public.tb_sector.description</code>.
     */
    @Override
    public TbSectorRecord setDescription(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_sector.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(5);
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
    public Row6<Long, String, String, String, OffsetTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, String, String, String, OffsetTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbSector.TB_SECTOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbSector.TB_SECTOR.SID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbSector.TB_SECTOR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbSector.TB_SECTOR.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetTime> field5() {
        return TbSector.TB_SECTOR.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TbSector.TB_SECTOR.DESCRIPTION;
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
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetTime component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
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
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetTime value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value2(String value) {
        setSid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value5(OffsetTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSectorRecord values(Long value1, String value2, String value3, String value4, OffsetTime value5, String value6) {
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
    public void from(ITbSector from) {
        setId(from.getId());
        setSid(from.getSid());
        setName(from.getName());
        setCreatedBy(from.getCreatedBy());
        setCreatedAt(from.getCreatedAt());
        setDescription(from.getDescription());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbSector> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbSectorRecord
     */
    public TbSectorRecord() {
        super(TbSector.TB_SECTOR);
    }

    /**
     * Create a detached, initialised TbSectorRecord
     */
    public TbSectorRecord(Long id, String sid, String name, String createdBy, OffsetTime createdAt, String description) {
        super(TbSector.TB_SECTOR);

        set(0, id);
        set(1, sid);
        set(2, name);
        set(3, createdBy);
        set(4, createdAt);
        set(5, description);
    }

    public TbSectorRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
