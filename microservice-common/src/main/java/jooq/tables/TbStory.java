/*
 * This file is generated by jOOQ.
 */
package jooq.tables;


import java.time.OffsetDateTime;
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

    private static final long serialVersionUID = -940761726;

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
     * The column <code>public.tb_story.author_id</code>.
     */
    public final TableField<TbStoryRecord, String> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>public.tb_story.entities</code>.
     */
    public final TableField<TbStoryRecord, String> ENTITIES = createField("entities", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_story.story_id</code>.
     */
    public final TableField<TbStoryRecord, String> STORY_ID = createField("story_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.lang</code>.
     */
    public final TableField<TbStoryRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>public.tb_story.possibly_sensitive</code>.
     */
    public final TableField<TbStoryRecord, Integer> POSSIBLY_SENSITIVE = createField("possibly_sensitive", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.source</code>.
     */
    public final TableField<TbStoryRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.story</code>.
     */
    public final TableField<TbStoryRecord, String> STORY = createField("story", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.tb_story.created_at</code>.
     */
    public final TableField<TbStoryRecord, OffsetDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.tb_story.like_count</code>.
     */
    public final TableField<TbStoryRecord, Integer> LIKE_COUNT = createField("like_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.comment_count</code>.
     */
    public final TableField<TbStoryRecord, Integer> COMMENT_COUNT = createField("comment_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.caution_count</code>.
     */
    public final TableField<TbStoryRecord, Integer> CAUTION_COUNT = createField("caution_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.tb_story.category</code>.
     */
    public final TableField<TbStoryRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.sector</code>.
     */
    public final TableField<TbStoryRecord, String> SECTOR = createField("sector", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tb_story.company_id</code>.
     */
    public final TableField<TbStoryRecord, String> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

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
        return Arrays.<Index>asList(Indexes.AUTHOR_ID_UQX, Indexes.TB_STORY_PKEY);
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
        return Arrays.<UniqueKey<TbStoryRecord>>asList(Keys.TB_STORY_PKEY, Keys.AUTHOR_ID_UQX);
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
