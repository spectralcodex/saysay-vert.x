/*
 * This file is generated by jOOQ.
 */
package jooq;


import javax.annotation.Generated;

import jooq.tables.TbStory;
import jooq.tables.records.TbStoryRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TbStoryRecord, Long> IDENTITY_TB_STORY = Identities0.IDENTITY_TB_STORY;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TbStoryRecord> TB_STORY_PKEY = UniqueKeys0.TB_STORY_PKEY;
    public static final UniqueKey<TbStoryRecord> AUTHOR_ID_UQX = UniqueKeys0.AUTHOR_ID_UQX;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TbStoryRecord, Long> IDENTITY_TB_STORY = Internal.createIdentity(TbStory.TB_STORY, TbStory.TB_STORY.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TbStoryRecord> TB_STORY_PKEY = Internal.createUniqueKey(TbStory.TB_STORY, "tb_story_pkey", TbStory.TB_STORY.ID);
        public static final UniqueKey<TbStoryRecord> AUTHOR_ID_UQX = Internal.createUniqueKey(TbStory.TB_STORY, "author_id_uqx", TbStory.TB_STORY.AUTHOR_ID);
    }
}
