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
package com.cleanwiz.applock.data.UpdateVersionManagerDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.cleanwiz.applock.data.UpdateVersionManafer;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table updateversionmanager.
*/
public class UpdateVersionManaferDao extends AbstractDao<UpdateVersionManafer, Long> {

    public static final String TABLENAME = "updateversionmanager";

    /**
     * Properties of entity UpdateVersionManafer.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Versioncode = new Property(1, Double.class, "versioncode", false, "VERSIONCODE");
        public final static Property Updateurl = new Property(2, String.class, "updateurl", false, "UPDATEURL");
        public final static Property Filesize = new Property(3, String.class, "filesize", false, "FILESIZE");
        public final static Property Intro = new Property(4, String.class, "intro", false, "INTRO");
        public final static Property Checkdate = new Property(5, Long.class, "checkdate", false, "CHECKDATE");
        public final static Property Lasttipdate = new Property(6, Long.class, "lasttipdate", false, "LASTTIPDATE");
    };


    public UpdateVersionManaferDao(DaoConfig config) {
        super(config);
    }
    
    public UpdateVersionManaferDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'updateversionmanager' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'VERSIONCODE' REAL," + // 1: versioncode
                "'UPDATEURL' TEXT," + // 2: updateurl
                "'FILESIZE' TEXT," + // 3: filesize
                "'INTRO' TEXT," + // 4: intro
                "'CHECKDATE' INTEGER," + // 5: checkdate
                "'LASTTIPDATE' INTEGER);"); // 6: lasttipdate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'updateversionmanager'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UpdateVersionManafer entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Double versioncode = entity.getVersioncode();
        if (versioncode != null) {
            stmt.bindDouble(2, versioncode);
        }
 
        String updateurl = entity.getUpdateurl();
        if (updateurl != null) {
            stmt.bindString(3, updateurl);
        }
 
        String filesize = entity.getFilesize();
        if (filesize != null) {
            stmt.bindString(4, filesize);
        }
 
        String intro = entity.getIntro();
        if (intro != null) {
            stmt.bindString(5, intro);
        }
 
        Long checkdate = entity.getCheckdate();
        if (checkdate != null) {
            stmt.bindLong(6, checkdate);
        }
 
        Long lasttipdate = entity.getLasttipdate();
        if (lasttipdate != null) {
            stmt.bindLong(7, lasttipdate);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public UpdateVersionManafer readEntity(Cursor cursor, int offset) {
        UpdateVersionManafer entity = new UpdateVersionManafer( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1), // versioncode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // updateurl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // filesize
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // intro
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // checkdate
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6) // lasttipdate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UpdateVersionManafer entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setVersioncode(cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1));
        entity.setUpdateurl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setFilesize(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIntro(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCheckdate(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setLasttipdate(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UpdateVersionManafer entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UpdateVersionManafer entity) {
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
