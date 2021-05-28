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
import jooq.tables.records.TbUserRecord;

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
public class TbUser extends TableImpl<TbUserRecord> {

    private static final long serialVersionUID = 918235960;

    /**
     * The reference instance of <code>public.tb_user</code>
     */
    public static final TbUser TB_USER = new TbUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbUserRecord> getRecordType() {
        return TbUserRecord.class;
    }

    /**
     * The column <code>public.tb_user.id</code>.
     */
    public final TableField<TbUserRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tb_user_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.tb_user.roleid</code>.
     */
    public final TableField<TbUserRecord, String> ROLEID = createField("roleid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_user.firstname</code>.
     */
    public final TableField<TbUserRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_user.lastname</code>.
     */
    public final TableField<TbUserRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_user.email</code>.
     */
    public final TableField<TbUserRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>public.tb_user.mobile</code>.
     */
    public final TableField<TbUserRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.tb_user.hashedpassword</code>.
     */
    public final TableField<TbUserRecord, String> HASHEDPASSWORD = createField("hashedpassword", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.salt</code>.
     */
    public final TableField<TbUserRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.profilepic</code>.
     */
    public final TableField<TbUserRecord, String> PROFILEPIC = createField("profilepic", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.backgroundinfo</code>.
     */
    public final TableField<TbUserRecord, String> BACKGROUNDINFO = createField("backgroundinfo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.website</code>.
     */
    public final TableField<TbUserRecord, String> WEBSITE = createField("website", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.gpslocation</code>.
     */
    public final TableField<TbUserRecord, String> GPSLOCATION = createField("gpslocation", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_user.dob</code>.
     */
    public final TableField<TbUserRecord, String> DOB = createField("dob", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_user.otherinfo</code>.
     */
    public final TableField<TbUserRecord, String> OTHERINFO = createField("otherinfo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_user.createdby</code>.
     */
    public final TableField<TbUserRecord, String> CREATEDBY = createField("createdby", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_user.rolename</code>.
     */
    public final TableField<TbUserRecord, String> ROLENAME = createField("rolename", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_user.uid</code>.
     */
    public final TableField<TbUserRecord, String> UID = createField("uid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_user.active</code>.
     */
    public final TableField<TbUserRecord, Integer> ACTIVE = createField("active", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.tb_user.createdon</code>.
     */
    public final TableField<TbUserRecord, String> CREATEDON = createField("createdon", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.tb_user</code> table reference
     */
    public TbUser() {
        this(DSL.name("tb_user"), null);
    }

    /**
     * Create an aliased <code>public.tb_user</code> table reference
     */
    public TbUser(String alias) {
        this(DSL.name(alias), TB_USER);
    }

    /**
     * Create an aliased <code>public.tb_user</code> table reference
     */
    public TbUser(Name alias) {
        this(alias, TB_USER);
    }

    private TbUser(Name alias, Table<TbUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbUser(Name alias, Table<TbUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TbUser(Table<O> child, ForeignKey<O, TbUserRecord> key) {
        super(child, key, TB_USER);
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
        return Arrays.<Index>asList(Indexes.EMAIL_UQX, Indexes.MOBILE_UQX, Indexes.TB_USER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TbUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_TB_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbUserRecord> getPrimaryKey() {
        return Keys.TB_USER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TbUserRecord>>asList(Keys.TB_USER_PKEY, Keys.EMAIL_UQX, Keys.MOBILE_UQX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUser as(String alias) {
        return new TbUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbUser as(Name alias) {
        return new TbUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TbUser rename(String name) {
        return new TbUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TbUser rename(Name name) {
        return new TbUser(name, null);
    }
}
