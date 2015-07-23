/*******************************************************************************
 * Copyright (c) 2015 btows.com.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.cleanwiz.applock.data.HideAudioDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cleanwiz.applock.data.HideAudio;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table HideAudio.
*/
public class HideAudioDao extends AbstractDao<HideAudio, Long> {

    public static final String TABLENAME = "HideAudio";

    /**
     * Properties of entity HideAudio.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BeyondGroupId = new Property(1, Integer.class, "beyondGroupId", false, "BEYOND_GROUP_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Album = new Property(3, String.class, "album", false, "ALBUM");
        public final static Property Artist = new Property(4, String.class, "artist", false, "ARTIST");
        public final static Property OldPathUrl = new Property(5, String.class, "oldPathUrl", false, "OLD_PATH_URL");
        public final static Property DisplayName = new Property(6, String.class, "displayName", false, "DISPLAY_NAME");
        public final static Property MimeType = new Property(7, String.class, "mimeType", false, "MIME_TYPE");
        public final static Property Duration = new Property(8, String.class, "duration", false, "DURATION");
        public final static Property NewPathUrl = new Property(9, String.class, "newPathUrl", false, "NEW_PATH_URL");
        public final static Property Size = new Property(10, Long.class, "size", false, "SIZE");
        public final static Property MoveDate = new Property(11, Long.class, "moveDate", false, "MOVE_DATE");
    };


    public HideAudioDao(DaoConfig config) {
        super(config);
    }
    
    public HideAudioDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'HideAudio' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'BEYOND_GROUP_ID' INTEGER," + // 1: beyondGroupId
                "'TITLE' TEXT," + // 2: title
                "'ALBUM' TEXT," + // 3: album
                "'ARTIST' TEXT," + // 4: artist
                "'OLD_PATH_URL' TEXT," + // 5: oldPathUrl
                "'DISPLAY_NAME' TEXT," + // 6: displayName
                "'MIME_TYPE' TEXT," + // 7: mimeType
                "'DURATION' TEXT," + // 8: duration
                "'NEW_PATH_URL' TEXT," + // 9: newPathUrl
                "'SIZE' INTEGER," + // 10: size
                "'MOVE_DATE' INTEGER);"); // 11: moveDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'HideAudio'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HideAudio entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer beyondGroupId = entity.getBeyondGroupId();
        if (beyondGroupId != null) {
            stmt.bindLong(2, beyondGroupId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(4, album);
        }
 
        String artist = entity.getArtist();
        if (artist != null) {
            stmt.bindString(5, artist);
        }
 
        String oldPathUrl = entity.getOldPathUrl();
        if (oldPathUrl != null) {
            stmt.bindString(6, oldPathUrl);
        }
 
        String displayName = entity.getDisplayName();
        if (displayName != null) {
            stmt.bindString(7, displayName);
        }
 
        String mimeType = entity.getMimeType();
        if (mimeType != null) {
            stmt.bindString(8, mimeType);
        }
 
        String duration = entity.getDuration();
        if (duration != null) {
            stmt.bindString(9, duration);
        }
 
        String newPathUrl = entity.getNewPathUrl();
        if (newPathUrl != null) {
            stmt.bindString(10, newPathUrl);
        }
 
        Long size = entity.getSize();
        if (size != null) {
            stmt.bindLong(11, size);
        }
 
        Long moveDate = entity.getMoveDate();
        if (moveDate != null) {
            stmt.bindLong(12, moveDate);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HideAudio readEntity(Cursor cursor, int offset) {
        HideAudio entity = new HideAudio( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // beyondGroupId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // album
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // artist
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // oldPathUrl
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // displayName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // mimeType
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // duration
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // newPathUrl
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10), // size
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11) // moveDate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HideAudio entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBeyondGroupId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAlbum(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setArtist(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setOldPathUrl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDisplayName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setMimeType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDuration(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setNewPathUrl(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSize(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
        entity.setMoveDate(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HideAudio entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HideAudio entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
