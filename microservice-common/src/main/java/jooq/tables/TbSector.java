/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.Indexes;
import jooq.Keys;
import jooq.Public;
import jooq.tables.records.TbSectorRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TbSector extends TableImpl<TbSectorRecord> {

    private static final long serialVersionUID = 677962378;

    /**
     * The reference instance of <code>public.tb_sector</code>
     */
    public static final TbSector TB_SECTOR = new TbSector();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbSectorRecord> getRecordType() {
        return TbSectorRecord.class;
    }

    /**
     * The column <code>public.tb_sector.id</code>.
     */
    public final TableField<TbSectorRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sector_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.tb_sector.sid</code>.
     */
    public final TableField<TbSectorRecord, String> SID = createField("sid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_sector.name</code>.
     */
    public final TableField<TbSectorRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_sector.createdby</code>.
     */
    public final TableField<TbSectorRecord, String> CREATEDBY = createField("createdby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_sector.description</code>.
     */
    public final TableField<TbSectorRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_sector.createdon</code>.
     */
    public final TableField<TbSectorRecord, String> CREATEDON = createField("createdon", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.tb_sector</code> table reference
     */
    public TbSector() {
        this(DSL.name("tb_sector"), null);
    }

    /**
     * Create an aliased <code>public.tb_sector</code> table reference
     */
    public TbSector(String alias) {
        this(DSL.name(alias), TB_SECTOR);
    }

    /**
     * Create an aliased <code>public.tb_sector</code> table reference
     */
    public TbSector(Name alias) {
        this(alias, TB_SECTOR);
    }

    private TbSector(Name alias, Table<TbSectorRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbSector(Name alias, Table<TbSectorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TbSector(Table<O> child, ForeignKey<O, TbSectorRecord> key) {
        super(child, key, TB_SECTOR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SECTOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TbSectorRecord, Long> getIdentity() {
        return Keys.IDENTITY_TB_SECTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbSectorRecord> getPrimaryKey() {
        return Keys.SECTOR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbSectorRecord>> getKeys() {
        return Arrays.<UniqueKey<TbSectorRecord>>asList(Keys.SECTOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSector as(String alias) {
        return new TbSector(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbSector as(Name alias) {
        return new TbSector(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TbSector rename(String name) {
        return new TbSector(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TbSector rename(Name name) {
        return new TbSector(name, null);
    }
}
