package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
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
public final class CollectionDao_Impl implements CollectionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Collection> __insertionAdapterOfCollection;

  private final EntityDeletionOrUpdateAdapter<Collection> __deletionAdapterOfCollection;

  private final EntityDeletionOrUpdateAdapter<Collection> __updateAdapterOfCollection;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUsingKey;

  public CollectionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCollection = new EntityInsertionAdapter<Collection>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Collections` (`key`,`version`,`name`,`parentCollection`,`group`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Collection value) {
        if (value.getKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKey());
        }
        stmt.bindLong(2, value.getVersion());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getParentCollection() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getParentCollection());
        }
        stmt.bindLong(5, value.getGroupParent());
      }
    };
    this.__deletionAdapterOfCollection = new EntityDeletionOrUpdateAdapter<Collection>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Collections` WHERE `key` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Collection value) {
        if (value.getKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKey());
        }
      }
    };
    this.__updateAdapterOfCollection = new EntityDeletionOrUpdateAdapter<Collection>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Collections` SET `key` = ?,`version` = ?,`name` = ?,`parentCollection` = ?,`group` = ? WHERE `key` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Collection value) {
        if (value.getKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getKey());
        }
        stmt.bindLong(2, value.getVersion());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getParentCollection() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getParentCollection());
        }
        stmt.bindLong(5, value.getGroupParent());
        if (value.getKey() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getKey());
        }
      }
    };
    this.__preparedStmtOfDeleteUsingKey = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Collections where `key`=?";
        return _query;
      }
    };
  }

  @Override
  public Completable insertAllCollections(final List<Collection> collections) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCollection.insert(collections);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void delete(final Collection collection) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCollection.handle(collection);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCollections(final Collection... collection) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCollection.handleMultiple(collection);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUsingKey(final String collectionKey) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUsingKey.acquire();
    int _argIndex = 1;
    if (collectionKey == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, collectionKey);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUsingKey.release(_stmt);
    }
  }

  @Override
  public Maybe<List<Collection>> getAll() {
    final String _sql = "SELECT * FROM Collections";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<Collection>>() {
      @Override
      public List<Collection> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfParentCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "parentCollection");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final List<Collection> _result = new ArrayList<Collection>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Collection _item;
            final String _tmpKey;
            _tmpKey = _cursor.getString(_cursorIndexOfKey);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpParentCollection;
            _tmpParentCollection = _cursor.getString(_cursorIndexOfParentCollection);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            _item = new Collection(_tmpKey,_tmpVersion,_tmpName,_tmpParentCollection,_tmpGroupParent);
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
    final String _sql = "SELECT COUNT(*) FROM Collections";
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
  public Single<Collection> getCollection(final String key) {
    final String _sql = "SELECT * FROM Collections WHERE `key`=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    return RxRoom.createSingle(new Callable<Collection>() {
      @Override
      public Collection call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfParentCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "parentCollection");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final Collection _result;
          if(_cursor.moveToFirst()) {
            final String _tmpKey;
            _tmpKey = _cursor.getString(_cursorIndexOfKey);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpParentCollection;
            _tmpParentCollection = _cursor.getString(_cursorIndexOfParentCollection);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            _result = new Collection(_tmpKey,_tmpVersion,_tmpName,_tmpParentCollection,_tmpGroupParent);
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
  public Maybe<List<Collection>> getCollectionsForGroup(final int groupID) {
    final String _sql = "SELECT * FROM Collections WHERE `group`=? ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupID);
    return Maybe.fromCallable(new Callable<List<Collection>>() {
      @Override
      public List<Collection> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKey = CursorUtil.getColumnIndexOrThrow(_cursor, "key");
          final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfParentCollection = CursorUtil.getColumnIndexOrThrow(_cursor, "parentCollection");
          final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
          final List<Collection> _result = new ArrayList<Collection>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Collection _item;
            final String _tmpKey;
            _tmpKey = _cursor.getString(_cursorIndexOfKey);
            final int _tmpVersion;
            _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpParentCollection;
            _tmpParentCollection = _cursor.getString(_cursorIndexOfParentCollection);
            final int _tmpGroupParent;
            _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
            _item = new Collection(_tmpKey,_tmpVersion,_tmpName,_tmpParentCollection,_tmpGroupParent);
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
