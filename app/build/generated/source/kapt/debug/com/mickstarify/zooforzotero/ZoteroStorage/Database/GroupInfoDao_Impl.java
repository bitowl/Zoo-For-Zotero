package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupInfoDao_Impl implements GroupInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GroupInfo> __insertionAdapterOfGroupInfo;

  private final EntityDeletionOrUpdateAdapter<GroupInfo> __deletionAdapterOfGroupInfo;

  private final EntityDeletionOrUpdateAdapter<GroupInfo> __updateAdapterOfGroupInfo;

  public GroupInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroupInfo = new EntityInsertionAdapter<GroupInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `GroupInfo` (`id`,`version`,`name`,`description`,`type`,`url`,`libraryEditing`,`libraryReading`,`fileEditing`,`owner`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupInfo value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getVersion());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getLibraryEditing() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLibraryEditing());
        }
        if (value.getLibraryReading() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLibraryReading());
        }
        if (value.getFileEditing() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFileEditing());
        }
        stmt.bindLong(10, value.getOwner());
      }
    };
    this.__deletionAdapterOfGroupInfo = new EntityDeletionOrUpdateAdapter<GroupInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `GroupInfo` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupInfo value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfGroupInfo = new EntityDeletionOrUpdateAdapter<GroupInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `GroupInfo` SET `id` = ?,`version` = ?,`name` = ?,`description` = ?,`type` = ?,`url` = ?,`libraryEditing` = ?,`libraryReading` = ?,`fileEditing` = ?,`owner` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupInfo value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getVersion());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getType());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getLibraryEditing() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLibraryEditing());
        }
        if (value.getLibraryReading() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLibraryReading());
        }
        if (value.getFileEditing() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFileEditing());
        }
        stmt.bindLong(10, value.getOwner());
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public Completable insertGroupInfos(final GroupInfo... groupInfo) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGroupInfo.insert(groupInfo);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void delete(final GroupInfo groupInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfGroupInfo.handle(groupInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateGroupInfos(final GroupInfo... groupInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfGroupInfo.handleMultiple(groupInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Maybe<List<GroupInfo>> getAll() {
    final String _sql = "SELECT * FROM GroupInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<GroupInfo>>() {
      @Override
      public List<GroupInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfLibraryEditing = CursorUtil.getColumnIndexOrThrow(_cursor, "libraryEditing");
          final int _cursorIndexOfLibraryReading = CursorUtil.getColumnIndexOrThrow(_cursor, "libraryReading");
          final int _cursorIndexOfFileEditing = CursorUtil.getColumnIndexOrThrow(_cursor, "fileEditing");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final List<GroupInfo> _result = new ArrayList<GroupInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupInfo _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpLibraryEditing;
            _tmpLibraryEditing = _cursor.getString(_cursorIndexOfLibraryEditing);
            final String _tmpLibraryReading;
            _tmpLibraryReading = _cursor.getString(_cursorIndexOfLibraryReading);
            final String _tmpFileEditing;
            _tmpFileEditing = _cursor.getString(_cursorIndexOfFileEditing);
            final int _tmpOwner;
            _tmpOwner = _cursor.getInt(_cursorIndexOfOwner);
            _item = new GroupInfo(_tmpId,_tmpVersion,_tmpName,_tmpDescription,_tmpType,_tmpUrl,_tmpLibraryEditing,_tmpLibraryReading,_tmpFileEditing,_tmpOwner);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public int getNumber() {
    final String _sql = "SELECT COUNT(*) FROM GroupInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Single<GroupInfo> getGroupInfo(final String id) {
    final String _sql = "SELECT * FROM GroupInfo WHERE id=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return RxRoom.createSingle(new Callable<GroupInfo>() {
      @Override
      public GroupInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final int _cursorIndexOfLibraryEditing = CursorUtil.getColumnIndexOrThrow(_cursor, "libraryEditing");
          final int _cursorIndexOfLibraryReading = CursorUtil.getColumnIndexOrThrow(_cursor, "libraryReading");
          final int _cursorIndexOfFileEditing = CursorUtil.getColumnIndexOrThrow(_cursor, "fileEditing");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final GroupInfo _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            final String _tmpLibraryEditing;
            _tmpLibraryEditing = _cursor.getString(_cursorIndexOfLibraryEditing);
            final String _tmpLibraryReading;
            _tmpLibraryReading = _cursor.getString(_cursorIndexOfLibraryReading);
            final String _tmpFileEditing;
            _tmpFileEditing = _cursor.getString(_cursorIndexOfFileEditing);
            final int _tmpOwner;
            _tmpOwner = _cursor.getInt(_cursorIndexOfOwner);
            _result = new GroupInfo(_tmpId,_tmpVersion,_tmpName,_tmpDescription,_tmpType,_tmpUrl,_tmpLibraryEditing,_tmpLibraryReading,_tmpFileEditing,_tmpOwner);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
