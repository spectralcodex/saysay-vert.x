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
import jooq.tables.records.TbStoryRecord;

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
public class TbStory extends TableImpl<TbStoryRecord> {

    private static final long serialVersionUID = 92642412;

    /**
     * The reference instance of <code>public.tb_story</code>
     */
    public static final TbStory TB_STORY = new TbStory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TbStoryRecord> getRecordType() {
        return TbStoryRecord.class;
    }

    /**
     * The column <code>public.tb_story.id</code>.
     */
    public final TableField<TbStoryRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tb_story_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.tb_story.authorid</code>.
     */
    public final TableField<TbStoryRecord, String> AUTHORID = createField("authorid", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.tb_story.entities</code>.
     */
    public final TableField<TbStoryRecord, String> ENTITIES = createField("entities", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_story.sid</code>.
     */
    public final TableField<TbStoryRecord, String> SID = createField("sid", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.lang</code>.
     */
    public final TableField<TbStoryRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>public.tb_story.possiblysensitive</code>.
     */
    public final TableField<TbStoryRecord, Integer> POSSIBLYSENSITIVE = createField("possiblysensitive", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.source</code>.
     */
    public final TableField<TbStoryRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.story</code>.
     */
    public final TableField<TbStoryRecord, String> STORY = createField("story", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_story.likecount</code>.
     */
    public final TableField<TbStoryRecord, Integer> LIKECOUNT = createField("likecount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.commentcount</code>.
     */
    public final TableField<TbStoryRecord, Integer> COMMENTCOUNT = createField("commentcount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.cautioncount</code>.
     */
    public final TableField<TbStoryRecord, Integer> CAUTIONCOUNT = createField("cautioncount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.categoryname</code>.
     */
    public final TableField<TbStoryRecord, String> CATEGORYNAME = createField("categoryname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.sectorname</code>.
     */
    public final TableField<TbStoryRecord, String> SECTORNAME = createField("sectorname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.companyid</code>.
     */
    public final TableField<TbStoryRecord, String> COMPANYID = createField("companyid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_story.sectorid</code>.
     */
    public final TableField<TbStoryRecord, String> SECTORID = createField("sectorid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_story.categoryid</code>.
     */
    public final TableField<TbStoryRecord, String> CATEGORYID = createField("categoryid", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.tb_story.authorname</code>.
     */
    public final TableField<TbStoryRecord, String> AUTHORNAME = createField("authorname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.companyname</code>.
     */
    public final TableField<TbStoryRecord, String> COMPANYNAME = createField("companyname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.createdon</code>.
     */
    public final TableField<TbStoryRecord, String> CREATEDON = createField("createdon", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.tb_story</code> table reference
     */
    public TbStory() {
        this(DSL.name("tb_story"), null);
    }

    /**
     * Create an aliased <code>public.tb_story</code> table reference
     */
    public TbStory(String alias) {
        this(DSL.name(alias), TB_STORY);
    }

    /**
     * Create an aliased <code>public.tb_story</code> table reference
     */
    public TbStory(Name alias) {
        this(alias, TB_STORY);
    }

    private TbStory(Name alias, Table<TbStoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TbStory(Name alias, Table<TbStoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TbStory(Table<O> child, ForeignKey<O, TbStoryRecord> key) {
        super(child, key, TB_STORY);
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
        return Arrays.<Index>asList(Indexes.SID_UQX, Indexes.TB_STORY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TbStoryRecord, Long> getIdentity() {
        return Keys.IDENTITY_TB_STORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TbStoryRecord> getPrimaryKey() {
        return Keys.TB_STORY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TbStoryRecord>> getKeys() {
        return Arrays.<UniqueKey<TbStoryRecord>>asList(Keys.TB_STORY_PKEY, Keys.SID_UQX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStory as(String alias) {
        return new TbStory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStory as(Name alias) {
        return new TbStory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TbStory rename(String name) {
        return new TbStory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TbStory rename(Name name) {
        return new TbStory(name, null);
    }
}