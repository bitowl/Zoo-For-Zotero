package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemInfo> __insertionAdapterOfItemInfo;

  private final EntityInsertionAdapter<ItemData> __insertionAdapterOfItemData;

  private final EntityInsertionAdapter<Creator> __insertionAdapterOfCreator;

  private final EntityInsertionAdapter<ItemCollection> __insertionAdapterOfItemCollection;

  private final EntityInsertionAdapter<ItemTag> __insertionAdapterOfItemTag;

  private final EntityDeletionOrUpdateAdapter<ItemInfo> __deletionAdapterOfItemInfo;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUsingItemKey;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllForGroup;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemInfo = new EntityInsertionAdapter<ItemInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ItemInfo` (`itemKey`,`group`,`version`,`deleted`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemInfo value) {
        if (value.getItemKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getItemKey());
        }
        stmt.bindLong(2, value.getGroupParent());
        stmt.bindLong(3, value.getVersion());
        final int _tmp;
        _tmp = value.getDeleted() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__insertionAdapterOfItemData = new EntityInsertionAdapter<ItemData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ItemData` (`parent`,`name`,`value`,`valueType`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemData value) {
        if (value.getParent() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getParent());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getValue() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getValue());
        }
        if (value.getValueType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getValueType());
        }
      }
    };
    this.__insertionAdapterOfCreator = new EntityInsertionAdapter<Creator>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ItemCreator` (`parent`,`firstName`,`lastName`,`creatorType`,`order`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Creator value) {
        if (value.getParent() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getParent());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
        if (value.getCreatorType() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCreatorType());
        }
        stmt.bindLong(5, value.getOrder());
      }
    };
    this.__insertionAdapterOfItemCollection = new EntityInsertionAdapter<ItemCollection>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ItemCollection` (`collectionKey`,`itemKey`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemCollection value) {
        if (value.getCollectionKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCollectionKey());
        }
        if (value.getItemKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemKey());
        }
      }
    };
    this.__insertionAdapterOfItemTag = new EntityInsertionAdapter<ItemTag>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ItemTags` (`parent`,`tag`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemTag value) {
        if (value.getParent() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getParent());
        }
        if (value.getTag() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTag());
        }
      }
    };
    this.__deletionAdapterOfItemInfo = new EntityDeletionOrUpdateAdapter<ItemInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ItemInfo` WHERE `itemKey` = ? AND `group` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemInfo value) {
        if (value.getItemKey() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getItemKey());
        }
        stmt.bindLong(2, value.getGroupParent());
      }
    };
    this.__preparedStmtOfDeleteUsingItemKey = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ItemInfo WHERE `itemKey`=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllForGroup = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM iteminfo WHERE `group`=?";
        return _query;
      }
    };
  }

  @Override
  public Completable insertItemInfo(final ItemInfo items) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemInfo.insert(items);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertItemData(final List<ItemData> itemData) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemData.insert(itemData);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertCreators(final List<Creator> creators) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCreator.insert(creators);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertItemCollections(final List<ItemCollection> collections) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemCollection.insert(collections);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertTags(final List<ItemTag> tags) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemTag.insert(tags);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public void delete(final ItemInfo item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfItemInfo.handle(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertItem(final ItemInfo itemInfo, final List<ItemData> itemDatas,
      final List<Creator> creators, final List<ItemCollection> collections,
      final List<ItemTag> tags) {
    __db.beginTransaction();
    try {
      ItemDao.DefaultImpls.insertItem(ItemDao_Impl.this, itemInfo, itemDatas, creators, collections, tags);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUsingItemKey(final String itemKey) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUsingItemKey.acquire();
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
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUsingItemKey.release(_stmt);
    }
  }

  @Override
  public Completable deleteAllForGroup(final int groupID) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllForGroup.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, groupID);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllForGroup.release(_stmt);
        }
      }
    });
  }

  @Override
  public Maybe<List<Item>> getAll() {
    final String _sql = "SELECT * FROM itemInfo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<Item>>() {
      @Override
      public List<Item> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
            final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
            final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
            final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
            final ArrayMap<String, ArrayList<ItemData>> _collectionItemData = new ArrayMap<String, ArrayList<ItemData>>();
            final ArrayMap<String, ArrayList<Creator>> _collectionCreators = new ArrayMap<String, ArrayList<Creator>>();
            final ArrayMap<String, ArrayList<ItemTag>> _collectionTags = new ArrayMap<String, ArrayList<ItemTag>>();
            final ArrayMap<String, ArrayList<String>> _collectionCollections = new ArrayMap<String, ArrayList<String>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemData> _tmpItemDataCollection = _collectionItemData.get(_tmpKey);
              if (_tmpItemDataCollection == null) {
                _tmpItemDataCollection = new ArrayList<ItemData>();
                _collectionItemData.put(_tmpKey, _tmpItemDataCollection);
              }
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<Creator> _tmpCreatorsCollection = _collectionCreators.get(_tmpKey_1);
              if (_tmpCreatorsCollection == null) {
                _tmpCreatorsCollection = new ArrayList<Creator>();
                _collectionCreators.put(_tmpKey_1, _tmpCreatorsCollection);
              }
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<ItemTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
              final String _tmpKey_3 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<String> _tmpCollectionsCollection = _collectionCollections.get(_tmpKey_3);
              if (_tmpCollectionsCollection == null) {
                _tmpCollectionsCollection = new ArrayList<String>();
                _collectionCollections.put(_tmpKey_3, _tmpCollectionsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_collectionItemData);
            __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_collectionCreators);
            __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_collectionTags);
            __fetchRelationshipItemCollectionAsjavaLangString(_collectionCollections);
            final List<Item> _result = new ArrayList<Item>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Item _item;
              final ItemInfo _tmpItemInfo;
              if (! (_cursor.isNull(_cursorIndexOfItemKey) && _cursor.isNull(_cursorIndexOfGroupParent) && _cursor.isNull(_cursorIndexOfVersion) && _cursor.isNull(_cursorIndexOfDeleted))) {
                final String _tmpItemKey;
                _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
                final int _tmpGroupParent;
                _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
                final int _tmpVersion;
                _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
                final boolean _tmpDeleted;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfDeleted);
                _tmpDeleted = _tmp != 0;
                _tmpItemInfo = new ItemInfo(_tmpItemKey,_tmpGroupParent,_tmpVersion,_tmpDeleted);
              }  else  {
                _tmpItemInfo = null;
              }
              ArrayList<ItemData> _tmpItemDataCollection_1 = null;
              final String _tmpKey_4 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpItemDataCollection_1 = _collectionItemData.get(_tmpKey_4);
              if (_tmpItemDataCollection_1 == null) {
                _tmpItemDataCollection_1 = new ArrayList<ItemData>();
              }
              ArrayList<Creator> _tmpCreatorsCollection_1 = null;
              final String _tmpKey_5 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCreatorsCollection_1 = _collectionCreators.get(_tmpKey_5);
              if (_tmpCreatorsCollection_1 == null) {
                _tmpCreatorsCollection_1 = new ArrayList<Creator>();
              }
              ArrayList<ItemTag> _tmpTagsCollection_1 = null;
              final String _tmpKey_6 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_6);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<ItemTag>();
              }
              ArrayList<String> _tmpCollectionsCollection_1 = null;
              final String _tmpKey_7 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCollectionsCollection_1 = _collectionCollections.get(_tmpKey_7);
              if (_tmpCollectionsCollection_1 == null) {
                _tmpCollectionsCollection_1 = new ArrayList<String>();
              }
              _item = new Item();
              _item.itemInfo = _tmpItemInfo;
              _item.itemData = _tmpItemDataCollection_1;
              _item.creators = _tmpCreatorsCollection_1;
              _item.tags = _tmpTagsCollection_1;
              _item.collections = _tmpCollectionsCollection_1;
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<Item> getItem(final String key) {
    final String _sql = "SELECT * FROM itemInfo WHERE `itemKey`=? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (key == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, key);
    }
    return RxRoom.createSingle(new Callable<Item>() {
      @Override
      public Item call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
            final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
            final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
            final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
            final ArrayMap<String, ArrayList<ItemData>> _collectionItemData = new ArrayMap<String, ArrayList<ItemData>>();
            final ArrayMap<String, ArrayList<Creator>> _collectionCreators = new ArrayMap<String, ArrayList<Creator>>();
            final ArrayMap<String, ArrayList<ItemTag>> _collectionTags = new ArrayMap<String, ArrayList<ItemTag>>();
            final ArrayMap<String, ArrayList<String>> _collectionCollections = new ArrayMap<String, ArrayList<String>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemData> _tmpItemDataCollection = _collectionItemData.get(_tmpKey);
              if (_tmpItemDataCollection == null) {
                _tmpItemDataCollection = new ArrayList<ItemData>();
                _collectionItemData.put(_tmpKey, _tmpItemDataCollection);
              }
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<Creator> _tmpCreatorsCollection = _collectionCreators.get(_tmpKey_1);
              if (_tmpCreatorsCollection == null) {
                _tmpCreatorsCollection = new ArrayList<Creator>();
                _collectionCreators.put(_tmpKey_1, _tmpCreatorsCollection);
              }
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<ItemTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
              final String _tmpKey_3 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<String> _tmpCollectionsCollection = _collectionCollections.get(_tmpKey_3);
              if (_tmpCollectionsCollection == null) {
                _tmpCollectionsCollection = new ArrayList<String>();
                _collectionCollections.put(_tmpKey_3, _tmpCollectionsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_collectionItemData);
            __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_collectionCreators);
            __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_collectionTags);
            __fetchRelationshipItemCollectionAsjavaLangString(_collectionCollections);
            final Item _result;
            if(_cursor.moveToFirst()) {
              final ItemInfo _tmpItemInfo;
              if (! (_cursor.isNull(_cursorIndexOfItemKey) && _cursor.isNull(_cursorIndexOfGroupParent) && _cursor.isNull(_cursorIndexOfVersion) && _cursor.isNull(_cursorIndexOfDeleted))) {
                final String _tmpItemKey;
                _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
                final int _tmpGroupParent;
                _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
                final int _tmpVersion;
                _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
                final boolean _tmpDeleted;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfDeleted);
                _tmpDeleted = _tmp != 0;
                _tmpItemInfo = new ItemInfo(_tmpItemKey,_tmpGroupParent,_tmpVersion,_tmpDeleted);
              }  else  {
                _tmpItemInfo = null;
              }
              ArrayList<ItemData> _tmpItemDataCollection_1 = null;
              final String _tmpKey_4 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpItemDataCollection_1 = _collectionItemData.get(_tmpKey_4);
              if (_tmpItemDataCollection_1 == null) {
                _tmpItemDataCollection_1 = new ArrayList<ItemData>();
              }
              ArrayList<Creator> _tmpCreatorsCollection_1 = null;
              final String _tmpKey_5 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCreatorsCollection_1 = _collectionCreators.get(_tmpKey_5);
              if (_tmpCreatorsCollection_1 == null) {
                _tmpCreatorsCollection_1 = new ArrayList<Creator>();
              }
              ArrayList<ItemTag> _tmpTagsCollection_1 = null;
              final String _tmpKey_6 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_6);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<ItemTag>();
              }
              ArrayList<String> _tmpCollectionsCollection_1 = null;
              final String _tmpKey_7 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCollectionsCollection_1 = _collectionCollections.get(_tmpKey_7);
              if (_tmpCollectionsCollection_1 == null) {
                _tmpCollectionsCollection_1 = new ArrayList<String>();
              }
              _result = new Item();
              _result.itemInfo = _tmpItemInfo;
              _result.itemData = _tmpItemDataCollection_1;
              _result.creators = _tmpCreatorsCollection_1;
              _result.tags = _tmpTagsCollection_1;
              _result.collections = _tmpCollectionsCollection_1;
            } else {
              _result = null;
            }
            if(_result == null) {
              throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Maybe<List<Item>> getItemsForGroup(final int groupID) {
    final String _sql = "SELECT * FROM itemInfo WHERE `group`=? and `deleted`=0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupID);
    return Maybe.fromCallable(new Callable<List<Item>>() {
      @Override
      public List<Item> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
            final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
            final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
            final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
            final ArrayMap<String, ArrayList<ItemData>> _collectionItemData = new ArrayMap<String, ArrayList<ItemData>>();
            final ArrayMap<String, ArrayList<Creator>> _collectionCreators = new ArrayMap<String, ArrayList<Creator>>();
            final ArrayMap<String, ArrayList<ItemTag>> _collectionTags = new ArrayMap<String, ArrayList<ItemTag>>();
            final ArrayMap<String, ArrayList<String>> _collectionCollections = new ArrayMap<String, ArrayList<String>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemData> _tmpItemDataCollection = _collectionItemData.get(_tmpKey);
              if (_tmpItemDataCollection == null) {
                _tmpItemDataCollection = new ArrayList<ItemData>();
                _collectionItemData.put(_tmpKey, _tmpItemDataCollection);
              }
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<Creator> _tmpCreatorsCollection = _collectionCreators.get(_tmpKey_1);
              if (_tmpCreatorsCollection == null) {
                _tmpCreatorsCollection = new ArrayList<Creator>();
                _collectionCreators.put(_tmpKey_1, _tmpCreatorsCollection);
              }
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<ItemTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
              final String _tmpKey_3 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<String> _tmpCollectionsCollection = _collectionCollections.get(_tmpKey_3);
              if (_tmpCollectionsCollection == null) {
                _tmpCollectionsCollection = new ArrayList<String>();
                _collectionCollections.put(_tmpKey_3, _tmpCollectionsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_collectionItemData);
            __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_collectionCreators);
            __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_collectionTags);
            __fetchRelationshipItemCollectionAsjavaLangString(_collectionCollections);
            final List<Item> _result = new ArrayList<Item>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Item _item;
              final ItemInfo _tmpItemInfo;
              if (! (_cursor.isNull(_cursorIndexOfItemKey) && _cursor.isNull(_cursorIndexOfGroupParent) && _cursor.isNull(_cursorIndexOfVersion) && _cursor.isNull(_cursorIndexOfDeleted))) {
                final String _tmpItemKey;
                _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
                final int _tmpGroupParent;
                _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
                final int _tmpVersion;
                _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
                final boolean _tmpDeleted;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfDeleted);
                _tmpDeleted = _tmp != 0;
                _tmpItemInfo = new ItemInfo(_tmpItemKey,_tmpGroupParent,_tmpVersion,_tmpDeleted);
              }  else  {
                _tmpItemInfo = null;
              }
              ArrayList<ItemData> _tmpItemDataCollection_1 = null;
              final String _tmpKey_4 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpItemDataCollection_1 = _collectionItemData.get(_tmpKey_4);
              if (_tmpItemDataCollection_1 == null) {
                _tmpItemDataCollection_1 = new ArrayList<ItemData>();
              }
              ArrayList<Creator> _tmpCreatorsCollection_1 = null;
              final String _tmpKey_5 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCreatorsCollection_1 = _collectionCreators.get(_tmpKey_5);
              if (_tmpCreatorsCollection_1 == null) {
                _tmpCreatorsCollection_1 = new ArrayList<Creator>();
              }
              ArrayList<ItemTag> _tmpTagsCollection_1 = null;
              final String _tmpKey_6 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_6);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<ItemTag>();
              }
              ArrayList<String> _tmpCollectionsCollection_1 = null;
              final String _tmpKey_7 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCollectionsCollection_1 = _collectionCollections.get(_tmpKey_7);
              if (_tmpCollectionsCollection_1 == null) {
                _tmpCollectionsCollection_1 = new ArrayList<String>();
              }
              _item = new Item();
              _item.itemInfo = _tmpItemInfo;
              _item.itemData = _tmpItemDataCollection_1;
              _item.creators = _tmpCreatorsCollection_1;
              _item.tags = _tmpTagsCollection_1;
              _item.collections = _tmpCollectionsCollection_1;
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Maybe<List<Item>> getTrashedItemsForUser() {
    final String _sql = "SELECT * FROM itemInfo WHERE `group`=-1 and `deleted`=1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<Item>>() {
      @Override
      public List<Item> call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfItemKey = CursorUtil.getColumnIndexOrThrow(_cursor, "itemKey");
            final int _cursorIndexOfGroupParent = CursorUtil.getColumnIndexOrThrow(_cursor, "group");
            final int _cursorIndexOfVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "version");
            final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
            final ArrayMap<String, ArrayList<ItemData>> _collectionItemData = new ArrayMap<String, ArrayList<ItemData>>();
            final ArrayMap<String, ArrayList<Creator>> _collectionCreators = new ArrayMap<String, ArrayList<Creator>>();
            final ArrayMap<String, ArrayList<ItemTag>> _collectionTags = new ArrayMap<String, ArrayList<ItemTag>>();
            final ArrayMap<String, ArrayList<String>> _collectionCollections = new ArrayMap<String, ArrayList<String>>();
            while (_cursor.moveToNext()) {
              final String _tmpKey = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemData> _tmpItemDataCollection = _collectionItemData.get(_tmpKey);
              if (_tmpItemDataCollection == null) {
                _tmpItemDataCollection = new ArrayList<ItemData>();
                _collectionItemData.put(_tmpKey, _tmpItemDataCollection);
              }
              final String _tmpKey_1 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<Creator> _tmpCreatorsCollection = _collectionCreators.get(_tmpKey_1);
              if (_tmpCreatorsCollection == null) {
                _tmpCreatorsCollection = new ArrayList<Creator>();
                _collectionCreators.put(_tmpKey_1, _tmpCreatorsCollection);
              }
              final String _tmpKey_2 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<ItemTag> _tmpTagsCollection = _collectionTags.get(_tmpKey_2);
              if (_tmpTagsCollection == null) {
                _tmpTagsCollection = new ArrayList<ItemTag>();
                _collectionTags.put(_tmpKey_2, _tmpTagsCollection);
              }
              final String _tmpKey_3 = _cursor.getString(_cursorIndexOfItemKey);
              ArrayList<String> _tmpCollectionsCollection = _collectionCollections.get(_tmpKey_3);
              if (_tmpCollectionsCollection == null) {
                _tmpCollectionsCollection = new ArrayList<String>();
                _collectionCollections.put(_tmpKey_3, _tmpCollectionsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_collectionItemData);
            __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_collectionCreators);
            __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_collectionTags);
            __fetchRelationshipItemCollectionAsjavaLangString(_collectionCollections);
            final List<Item> _result = new ArrayList<Item>(_cursor.getCount());
            while(_cursor.moveToNext()) {
              final Item _item;
              final ItemInfo _tmpItemInfo;
              if (! (_cursor.isNull(_cursorIndexOfItemKey) && _cursor.isNull(_cursorIndexOfGroupParent) && _cursor.isNull(_cursorIndexOfVersion) && _cursor.isNull(_cursorIndexOfDeleted))) {
                final String _tmpItemKey;
                _tmpItemKey = _cursor.getString(_cursorIndexOfItemKey);
                final int _tmpGroupParent;
                _tmpGroupParent = _cursor.getInt(_cursorIndexOfGroupParent);
                final int _tmpVersion;
                _tmpVersion = _cursor.getInt(_cursorIndexOfVersion);
                final boolean _tmpDeleted;
                final int _tmp;
                _tmp = _cursor.getInt(_cursorIndexOfDeleted);
                _tmpDeleted = _tmp != 0;
                _tmpItemInfo = new ItemInfo(_tmpItemKey,_tmpGroupParent,_tmpVersion,_tmpDeleted);
              }  else  {
                _tmpItemInfo = null;
              }
              ArrayList<ItemData> _tmpItemDataCollection_1 = null;
              final String _tmpKey_4 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpItemDataCollection_1 = _collectionItemData.get(_tmpKey_4);
              if (_tmpItemDataCollection_1 == null) {
                _tmpItemDataCollection_1 = new ArrayList<ItemData>();
              }
              ArrayList<Creator> _tmpCreatorsCollection_1 = null;
              final String _tmpKey_5 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCreatorsCollection_1 = _collectionCreators.get(_tmpKey_5);
              if (_tmpCreatorsCollection_1 == null) {
                _tmpCreatorsCollection_1 = new ArrayList<Creator>();
              }
              ArrayList<ItemTag> _tmpTagsCollection_1 = null;
              final String _tmpKey_6 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpTagsCollection_1 = _collectionTags.get(_tmpKey_6);
              if (_tmpTagsCollection_1 == null) {
                _tmpTagsCollection_1 = new ArrayList<ItemTag>();
              }
              ArrayList<String> _tmpCollectionsCollection_1 = null;
              final String _tmpKey_7 = _cursor.getString(_cursorIndexOfItemKey);
              _tmpCollectionsCollection_1 = _collectionCollections.get(_tmpKey_7);
              if (_tmpCollectionsCollection_1 == null) {
                _tmpCollectionsCollection_1 = new ArrayList<String>();
              }
              _item = new Item();
              _item.itemInfo = _tmpItemInfo;
              _item.itemData = _tmpItemDataCollection_1;
              _item.creators = _tmpCreatorsCollection_1;
              _item.tags = _tmpTagsCollection_1;
              _item.collections = _tmpCollectionsCollection_1;
              _result.add(_item);
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
          }
        } finally {
          __db.endTransaction();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Single<Boolean> containsItem(final int groupID, final String itemKey) {
    final String _sql = "SELECT COUNT(*) != 0 FROM ItemInfo WHERE `itemKey`=? and `group`=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (itemKey == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, itemKey);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, groupID);
    return RxRoom.createSingle(new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
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

  private void __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(
      final ArrayMap<String, ArrayList<ItemData>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<ItemData>> _tmpInnerMap = new ArrayMap<String, ArrayList<ItemData>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<ItemData>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipItemDataAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemData(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `parent`,`name`,`value`,`valueType` FROM `ItemData` WHERE `parent` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "parent");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfParent = CursorUtil.getColumnIndex(_cursor, "parent");
      final int _cursorIndexOfName = CursorUtil.getColumnIndex(_cursor, "name");
      final int _cursorIndexOfValue = CursorUtil.getColumnIndex(_cursor, "value");
      final int _cursorIndexOfValueType = CursorUtil.getColumnIndex(_cursor, "valueType");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<ItemData> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final ItemData _item_1;
          final String _tmpParent;
          if (_cursorIndexOfParent == -1) {
            _tmpParent = null;
          } else {
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
          }
          final String _tmpName;
          if (_cursorIndexOfName == -1) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpValue;
          if (_cursorIndexOfValue == -1) {
            _tmpValue = null;
          } else {
            _tmpValue = _cursor.getString(_cursorIndexOfValue);
          }
          final String _tmpValueType;
          if (_cursorIndexOfValueType == -1) {
            _tmpValueType = null;
          } else {
            _tmpValueType = _cursor.getString(_cursorIndexOfValueType);
          }
          _item_1 = new ItemData(_tmpParent,_tmpName,_tmpValue,_tmpValueType);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(
      final ArrayMap<String, ArrayList<Creator>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<Creator>> _tmpInnerMap = new ArrayMap<String, ArrayList<Creator>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<Creator>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipItemCreatorAscomMickstarifyZooforzoteroZoteroStorageDatabaseCreator(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `parent`,`firstName`,`lastName`,`creatorType`,`order` FROM `ItemCreator` WHERE `parent` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "parent");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfParent = CursorUtil.getColumnIndex(_cursor, "parent");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndex(_cursor, "firstName");
      final int _cursorIndexOfLastName = CursorUtil.getColumnIndex(_cursor, "lastName");
      final int _cursorIndexOfCreatorType = CursorUtil.getColumnIndex(_cursor, "creatorType");
      final int _cursorIndexOfOrder = CursorUtil.getColumnIndex(_cursor, "order");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<Creator> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final Creator _item_1;
          final String _tmpParent;
          if (_cursorIndexOfParent == -1) {
            _tmpParent = null;
          } else {
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
          }
          final String _tmpFirstName;
          if (_cursorIndexOfFirstName == -1) {
            _tmpFirstName = null;
          } else {
            _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
          }
          final String _tmpLastName;
          if (_cursorIndexOfLastName == -1) {
            _tmpLastName = null;
          } else {
            _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
          }
          final String _tmpCreatorType;
          if (_cursorIndexOfCreatorType == -1) {
            _tmpCreatorType = null;
          } else {
            _tmpCreatorType = _cursor.getString(_cursorIndexOfCreatorType);
          }
          final int _tmpOrder;
          if (_cursorIndexOfOrder == -1) {
            _tmpOrder = 0;
          } else {
            _tmpOrder = _cursor.getInt(_cursorIndexOfOrder);
          }
          _item_1 = new Creator(_tmpParent,_tmpFirstName,_tmpLastName,_tmpCreatorType,_tmpOrder);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(
      final ArrayMap<String, ArrayList<ItemTag>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<ItemTag>> _tmpInnerMap = new ArrayMap<String, ArrayList<ItemTag>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<ItemTag>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipItemTagsAscomMickstarifyZooforzoteroZoteroStorageDatabaseItemTag(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `parent`,`tag` FROM `ItemTags` WHERE `parent` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "parent");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfParent = CursorUtil.getColumnIndex(_cursor, "parent");
      final int _cursorIndexOfTag = CursorUtil.getColumnIndex(_cursor, "tag");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<ItemTag> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final ItemTag _item_1;
          final String _tmpParent;
          if (_cursorIndexOfParent == -1) {
            _tmpParent = null;
          } else {
            _tmpParent = _cursor.getString(_cursorIndexOfParent);
          }
          final String _tmpTag;
          if (_cursorIndexOfTag == -1) {
            _tmpTag = null;
          } else {
            _tmpTag = _cursor.getString(_cursorIndexOfTag);
          }
          _item_1 = new ItemTag(_tmpParent,_tmpTag);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipItemCollectionAsjavaLangString(
      final ArrayMap<String, ArrayList<String>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<String>> _tmpInnerMap = new ArrayMap<String, ArrayList<String>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipItemCollectionAsjavaLangString(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<String>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipItemCollectionAsjavaLangString(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `collectionKey`,`itemKey` FROM `ItemCollection` WHERE `itemKey` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "itemKey");
      if (_itemKeyIndex == -1) {
        return;
      }
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<String> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final String _item_1;
          _item_1 = _cursor.getString(0);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
