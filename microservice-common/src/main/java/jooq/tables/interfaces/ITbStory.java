/*
 * This file is generated by jOOQ.
 */
package jooq.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.OffsetDateTime;

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
public interface ITbStory extends VertxPojo, Serializable {

    /**
     * Setter for <code>public.tb_story.id</code>.
     */
    public ITbStory setId(Long value);

    /**
     * Getter for <code>public.tb_story.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>public.tb_story.author_id</code>.
     */
    public ITbStory setAuthorId(String value);

    /**
     * Getter for <code>public.tb_story.author_id</code>.
     */
    public String getAuthorId();

    /**
     * Setter for <code>public.tb_story.entries</code>.
     */
    public ITbStory setEntries(String value);

    /**
     * Getter for <code>public.tb_story.entries</code>.
     */
    public String getEntries();

    /**
     * Setter for <code>public.tb_story.story_id</code>.
     */
    public ITbStory setStoryId(String value);

    /**
     * Getter for <code>public.tb_story.story_id</code>.
     */
    public String getStoryId();

    /**
     * Setter for <code>public.tb_story.lang</code>.
     */
    public ITbStory setLang(String value);

    /**
     * Getter for <code>public.tb_story.lang</code>.
     */
    public String getLang();

    /**
     * Setter for <code>public.tb_story.possibly_sensitive</code>.
     */
    public ITbStory setPossiblySensitive(Integer value);

    /**
     * Getter for <code>public.tb_story.possibly_sensitive</code>.
     */
    public Integer getPossiblySensitive();

    /**
     * Setter for <code>public.tb_story.source</code>.
     */
    public ITbStory setSource(String value);

    /**
     * Getter for <code>public.tb_story.source</code>.
     */
    public String getSource();

    /**
     * Setter for <code>public.tb_story.story</code>.
     */
    public ITbStory setStory(String value);

    /**
     * Getter for <code>public.tb_story.story</code>.
     */
    public String getStory();

    /**
     * Setter for <code>public.tb_story.created_at</code>.
     */
    public ITbStory setCreatedAt(OffsetDateTime value);

    /**
     * Getter for <code>public.tb_story.created_at</code>.
     */
    public OffsetDateTime getCreatedAt();

    /**
     * Setter for <code>public.tb_story.like_count</code>.
     */
    public ITbStory setLikeCount(Integer value);

    /**
     * Getter for <code>public.tb_story.like_count</code>.
     */
    public Integer getLikeCount();

    /**
     * Setter for <code>public.tb_story.comment_count</code>.
     */
    public ITbStory setCommentCount(Integer value);

    /**
     * Getter for <code>public.tb_story.comment_count</code>.
     */
    public Integer getCommentCount();

    /**
     * Setter for <code>public.tb_story.caution_count</code>.
     */
    public ITbStory setCautionCount(Integer value);

    /**
     * Getter for <code>public.tb_story.caution_count</code>.
     */
    public Integer getCautionCount();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ITbStory
     */
    public void from(jooq.tables.interfaces.ITbStory from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ITbStory
     */
    public <E extends jooq.tables.interfaces.ITbStory> E into(E into);

    @Override
    public default ITbStory fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getLong("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Long",e);
        }
        try {
            setAuthorId(json.getString("author_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("author_id","java.lang.String",e);
        }
        try {
            setEntries(json.getString("entries"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("entries","java.lang.String",e);
        }
        try {
            setStoryId(json.getString("story_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("story_id","java.lang.String",e);
        }
        try {
            setLang(json.getString("lang"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("lang","java.lang.String",e);
        }
        try {
            setPossiblySensitive(json.getInteger("possibly_sensitive"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("possibly_sensitive","java.lang.Integer",e);
        }
        try {
            setSource(json.getString("source"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("source","java.lang.String",e);
        }
        try {
            setStory(json.getString("story"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("story","java.lang.String",e);
        }
        try {
            // Omitting unrecognized type java.time.OffsetDateTime for column created_at!
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("created_at","java.time.OffsetDateTime",e);
        }
        try {
            setLikeCount(json.getInteger("like_count"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("like_count","java.lang.Integer",e);
        }
        try {
            setCommentCount(json.getInteger("comment_count"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("comment_count","java.lang.Integer",e);
        }
        try {
            setCautionCount(json.getInteger("caution_count"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("caution_count","java.lang.Integer",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("author_id",getAuthorId());
        json.put("entries",getEntries());
        json.put("story_id",getStoryId());
        json.put("lang",getLang());
        json.put("possibly_sensitive",getPossiblySensitive());
        json.put("source",getSource());
        json.put("story",getStory());
        // Omitting unrecognized type java.time.OffsetDateTime for column created_at!
        json.put("like_count",getLikeCount());
        json.put("comment_count",getCommentCount());
        json.put("caution_count",getCautionCount());
        return json;
    }

}
