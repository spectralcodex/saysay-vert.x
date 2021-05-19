/*
 * This file is generated by jOOQ.
 */
package jooq.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import jooq.tables.TbStory;
import jooq.tables.interfaces.ITbStory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class TbStoryRecord extends UpdatableRecordImpl<TbStoryRecord> implements VertxPojo, Record18<Long, String, String, String, String, Integer, String, String, OffsetDateTime, Integer, Integer, Integer, String, String, String, String, String, String>, ITbStory {

    private static final long serialVersionUID = -1787196600;

    /**
     * Setter for <code>public.tb_story.id</code>.
     */
    @Override
    public TbStoryRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tb_story.author_id</code>.
     */
    @Override
    public TbStoryRecord setAuthorId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.author_id</code>.
     */
    @Override
    public String getAuthorId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tb_story.entities</code>.
     */
    @Override
    public TbStoryRecord setEntities(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.entities</code>.
     */
    @Override
    public String getEntities() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tb_story.sid</code>.
     */
    @Override
    public TbStoryRecord setSid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.sid</code>.
     */
    @Override
    public String getSid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tb_story.lang</code>.
     */
    @Override
    public TbStoryRecord setLang(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.lang</code>.
     */
    @Override
    public String getLang() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tb_story.possibly_sensitive</code>.
     */
    @Override
    public TbStoryRecord setPossiblySensitive(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.possibly_sensitive</code>.
     */
    @Override
    public Integer getPossiblySensitive() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.tb_story.source</code>.
     */
    @Override
    public TbStoryRecord setSource(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.source</code>.
     */
    @Override
    public String getSource() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.tb_story.story</code>.
     */
    @Override
    public TbStoryRecord setStory(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.story</code>.
     */
    @Override
    public String getStory() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.tb_story.created_at</code>.
     */
    @Override
    public TbStoryRecord setCreatedAt(OffsetDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.created_at</code>.
     */
    @Override
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>public.tb_story.like_count</code>.
     */
    @Override
    public TbStoryRecord setLikeCount(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.like_count</code>.
     */
    @Override
    public Integer getLikeCount() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.tb_story.comment_count</code>.
     */
    @Override
    public TbStoryRecord setCommentCount(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.comment_count</code>.
     */
    @Override
    public Integer getCommentCount() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.tb_story.caution_count</code>.
     */
    @Override
    public TbStoryRecord setCautionCount(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.caution_count</code>.
     */
    @Override
    public Integer getCautionCount() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>public.tb_story.category_name</code>.
     */
    @Override
    public TbStoryRecord setCategoryName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.category_name</code>.
     */
    @Override
    public String getCategoryName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.tb_story.sector_name</code>.
     */
    @Override
    public TbStoryRecord setSectorName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.sector_name</code>.
     */
    @Override
    public String getSectorName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.tb_story.company_id</code>.
     */
    @Override
    public TbStoryRecord setCompanyId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.company_id</code>.
     */
    @Override
    public String getCompanyId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>public.tb_story.sector_id</code>.
     */
    @Override
    public TbStoryRecord setSectorId(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.sector_id</code>.
     */
    @Override
    public String getSectorId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.tb_story.category_id</code>.
     */
    @Override
    public TbStoryRecord setCategoryId(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.category_id</code>.
     */
    @Override
    public String getCategoryId() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.tb_story.author_name</code>.
     */
    @Override
    public TbStoryRecord setAuthorName(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.tb_story.author_name</code>.
     */
    @Override
    public String getAuthorName() {
        return (String) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, String, String, String, String, Integer, String, String, OffsetDateTime, Integer, Integer, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Long, String, String, String, String, Integer, String, String, OffsetDateTime, Integer, Integer, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TbStory.TB_STORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TbStory.TB_STORY.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TbStory.TB_STORY.ENTITIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TbStory.TB_STORY.SID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TbStory.TB_STORY.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TbStory.TB_STORY.POSSIBLY_SENSITIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TbStory.TB_STORY.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TbStory.TB_STORY.STORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field9() {
        return TbStory.TB_STORY.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TbStory.TB_STORY.LIKE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TbStory.TB_STORY.COMMENT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return TbStory.TB_STORY.CAUTION_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TbStory.TB_STORY.CATEGORY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TbStory.TB_STORY.SECTOR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TbStory.TB_STORY.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return TbStory.TB_STORY.SECTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return TbStory.TB_STORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return TbStory.TB_STORY.AUTHOR_NAME;
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
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEntities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPossiblySensitive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getStory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getLikeCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getCommentCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getCautionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCategoryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSectorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getSectorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getAuthorName();
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
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEntities();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLang();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPossiblySensitive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getStory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLikeCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCommentCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getCautionCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCategoryName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSectorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSectorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getAuthorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value2(String value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value3(String value) {
        setEntities(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value4(String value) {
        setSid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value5(String value) {
        setLang(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value6(Integer value) {
        setPossiblySensitive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value7(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value8(String value) {
        setStory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value9(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value10(Integer value) {
        setLikeCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value11(Integer value) {
        setCommentCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value12(Integer value) {
        setCautionCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value13(String value) {
        setCategoryName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value14(String value) {
        setSectorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value15(String value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value16(String value) {
        setSectorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value17(String value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord value18(String value) {
        setAuthorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TbStoryRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, OffsetDateTime value9, Integer value10, Integer value11, Integer value12, String value13, String value14, String value15, String value16, String value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ITbStory from) {
        setId(from.getId());
        setAuthorId(from.getAuthorId());
        setEntities(from.getEntities());
        setSid(from.getSid());
        setLang(from.getLang());
        setPossiblySensitive(from.getPossiblySensitive());
        setSource(from.getSource());
        setStory(from.getStory());
        setCreatedAt(from.getCreatedAt());
        setLikeCount(from.getLikeCount());
        setCommentCount(from.getCommentCount());
        setCautionCount(from.getCautionCount());
        setCategoryName(from.getCategoryName());
        setSectorName(from.getSectorName());
        setCompanyId(from.getCompanyId());
        setSectorId(from.getSectorId());
        setCategoryId(from.getCategoryId());
        setAuthorName(from.getAuthorName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITbStory> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TbStoryRecord
     */
    public TbStoryRecord() {
        super(TbStory.TB_STORY);
    }

    /**
     * Create a detached, initialised TbStoryRecord
     */
    public TbStoryRecord(Long id, String authorId, String entities, String sid, String lang, Integer possiblySensitive, String source, String story, OffsetDateTime createdAt, Integer likeCount, Integer commentCount, Integer cautionCount, String categoryName, String sectorName, String companyId, String sectorId, String categoryId, String authorName) {
        super(TbStory.TB_STORY);

        set(0, id);
        set(1, authorId);
        set(2, entities);
        set(3, sid);
        set(4, lang);
        set(5, possiblySensitive);
        set(6, source);
        set(7, story);
        set(8, createdAt);
        set(9, likeCount);
        set(10, commentCount);
        set(11, cautionCount);
        set(12, categoryName);
        set(13, sectorName);
        set(14, companyId);
        set(15, sectorId);
        set(16, categoryId);
        set(17, authorName);
    }

    public TbStoryRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
