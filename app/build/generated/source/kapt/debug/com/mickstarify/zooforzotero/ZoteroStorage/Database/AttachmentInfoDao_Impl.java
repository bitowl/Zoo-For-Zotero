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
public final class AttachmentInfoDao_Impl implements AttachmentInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AttachmentInfo> __insertionAdapterOfAttachmentInfo;

  private final EntityDeletionOrUpdateAdapter<AttachmentInfo> __deletionAdapterOfAttachmentInfo;

  public AttachmentInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAttachmentInfo = new EntityInsertionAdapter<AttachmentInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AttachmentInfo` (`itemKey`,`group`,`md5Key`,`mtime`,`downloadedFrom`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AttachmentInfo value) {
        if (value.getItemKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getItemKey());
        }
        stmt.bindLong(2, value.getGroupParent());
        if (value.getMd5Key() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMd5Key());
        }
        stmt.bindLong(4, value.getMtime());
        if (value.getDownloadedFrom() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDownloadedFrom());
        }
      }
    };
    this.__deletionAdapterOfAttachmentInfo = new EntityDeletionOrUpdateAdapter<AttachmentInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `AttachmentInfo` WHERE `itemKey` = ? AND `group` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AttachmentInfo value) {
        if (value.getItemKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getItemKey());
        }
        stmt.bindLong(2, value.getGroupParent());
      }
    };
  }

  @Override
  public Completable insertAttachments(final List<AttachmentInfo> attachments) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAttachmentInfo.insert(attachments);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable updateAttachment(final AttachmentInfo attachment) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAttachmentInfo.insert(attachment);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final AttachmentInfo attachmentInfo) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAttachmentInfo.handle(attachmentInfo);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Maybe<List<AttachmentInfo>> getAll() {
    final String _sql = "SELECT * FROM AttachmentInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<AttachmentInfo>>() {
      @Override
      public List<AttachmentInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final int _cursorIndexOfMd5Key = CursorUtil.getColumnIndexOrThrow(_cursor, "md5Key");
          final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
          final int _cursorIndexOfDownloadedFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedFrom");
          final List<AttachmentInfo> _result = new ArrayList<AttachmentInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AttachmentInfo _item;
            final String _tmpItemKey;
            _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            final String _tmpMd5Key;
            _tmpMd5Key = _cursor.getString(_cursorIndexOfMd5Key);
            final long _tmpMtime;
            _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
            final String _tmpDownloadedFrom;
            _tmpDownloadedFrom = _cursor.getString(_cursorIndexOfDownloadedFrom);
            _item = new AttachmentInfo(_tmpItemKey,_tmpGroupParent,_tmpMd5Key,_tmpMtime,_tmpDownloadedFrom);
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
  public Single<AttachmentInfo> getAttachment(final String key) {
    final String _sql = "SELECT * FROM AttachmentInfo WHERE `itemKey`=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    return RxRoom.createSingle(new Callable<AttachmentInfo>() {
      @Override
      public AttachmentInfo call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final int _cursorIndexOfMd5Key = CursorUtil.getColumnIndexOrThrow(_cursor, "md5Key");
          final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
          final int _cursorIndexOfDownloadedFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedFrom");
          final AttachmentInfo _result;
          if(_cursor.moveToFirst()) {
            final String _tmpItemKey;
            _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            final String _tmpMd5Key;
            _tmpMd5Key = _cursor.getString(_cursorIndexOfMd5Key);
            final long _tmpMtime;
            _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
            final String _tmpDownloadedFrom;
            _tmpDownloadedFrom = _cursor.getString(_cursorIndexOfDownloadedFrom);
            _result = new AttachmentInfo(_tmpItemKey,_tmpGroupParent,_tmpMd5Key,_tmpMtime,_tmpDownloadedFrom);
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

  @Override
  public Maybe<List<AttachmentInfo>> getAttachmentsForGroup(final int groupID) {
    final String _sql = "SELECT * FROM AttachmentInfo WHERE `group`=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupID);
    return Maybe.fromCallable(new Callable<List<AttachmentInfo>>() {
      @Override
      public List<AttachmentInfo> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final int _cursorIndexOfMd5Key = CursorUtil.getColumnIndexOrThrow(_cursor, "md5Key");
          final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
          final int _cursorIndexOfDownloadedFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "downloadedFrom");
          final List<AttachmentInfo> _result = new ArrayList<AttachmentInfo>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AttachmentInfo _item;
            final String _tmpItemKey;
            _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            final String _tmpMd5Key;
            _tmpMd5Key = _cursor.getString(_cursorIndexOfMd5Key);
            final long _tmpMtime;
            _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
            final String _tmpDownloadedFrom;
            _tmpDownloadedFrom = _cursor.getString(_cursorIndexOfDownloadedFrom);
            _item = new AttachmentInfo(_tmpItemKey,_tmpGroupParent,_tmpMd5Key,_tmpMtime,_tmpDownloadedFrom);
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
}
