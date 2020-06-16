package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecentlyOpenedAttachmentDao_Impl implements RecentlyOpenedAttachmentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecentlyOpenedAttachment> __insertionAdapterOfRecentlyOpenedAttachment;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public RecentlyOpenedAttachmentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentlyOpenedAttachment = new EntityInsertionAdapter<RecentlyOpenedAttachment>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `RecentlyOpenedAttachment` (`itemKey`,`version`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentlyOpenedAttachment value) {
        if (value.getItemKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getItemKey());
        }
        stmt.bindLong(2, value.getVersion());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RecentlyOpenedAttachment WHERE itemKey=?";
        return _query;
      }
    };
  }

  @Override
  public Completable insert(final RecentlyOpenedAttachment recentlyOpenedAttachment) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecentlyOpenedAttachment.insert(recentlyOpenedAttachment);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final String itemKey) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        if (itemKey == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, itemKey);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    });
  }

  @Override
  public Maybe<List<RecentlyOpenedAttachment>> getAll() {
    final String _sql = "SELECT * FROM RecentlyOpenedAttachment";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<RecentlyOpenedAttachment>>() {
      @Override
      public List<RecentlyOpenedAttachment> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final List<RecentlyOpenedAttachment> _result = new ArrayList<RecentlyOpenedAttachment>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecentlyOpenedAttachment _item;
            final String _tmpItemKey;
            _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            _item = new RecentlyOpenedAttachment(_tmpItemKey,_tmpVersion);
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
