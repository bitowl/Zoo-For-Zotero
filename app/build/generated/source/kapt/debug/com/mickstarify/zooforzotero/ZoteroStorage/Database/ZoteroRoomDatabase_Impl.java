package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ZoteroRoomDatabase_Impl extends ZoteroRoomDatabase {
  private volatile GroupInfoDao _groupInfoDao;

  private volatile CollectionDao _collectionDao;

  private volatile RecentlyOpenedAttachmentDao _recentlyOpenedAttachmentDao;

  private volatile ItemDao _itemDao;

  private volatile AttachmentInfoDao _attachmentInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `GroupInfo` (`id` INTEGER NOT NULL, `version` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `libraryEditing` TEXT NOT NULL, `libraryReading` TEXT NOT NULL, `fileEditing` TEXT NOT NULL, `owner` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Collections` (`key` TEXT NOT NULL, `version` INTEGER NOT NULL, `name` TEXT NOT NULL, `parentCollection` TEXT NOT NULL, `group` INTEGER NOT NULL, PRIMARY KEY(`key`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RecentlyOpenedAttachment` (`itemKey` TEXT NOT NULL, `version` INTEGER NOT NULL, PRIMARY KEY(`itemKey`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemInfo` (`itemKey` TEXT NOT NULL, `group` INTEGER NOT NULL, `version` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, PRIMARY KEY(`itemKey`, `group`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_ItemInfo_itemKey` ON `ItemInfo` (`itemKey`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemData` (`parent` TEXT NOT NULL, `name` TEXT NOT NULL, `value` TEXT NOT NULL, `valueType` TEXT NOT NULL, PRIMARY KEY(`parent`, `name`), FOREIGN KEY(`parent`) REFERENCES `ItemInfo`(`itemKey`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemCreator` (`parent` TEXT NOT NULL, `firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `creatorType` TEXT NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`parent`, `firstName`, `lastName`), FOREIGN KEY(`parent`) REFERENCES `ItemInfo`(`itemKey`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemTags` (`parent` TEXT NOT NULL, `tag` TEXT NOT NULL, PRIMARY KEY(`parent`, `tag`), FOREIGN KEY(`parent`) REFERENCES `ItemInfo`(`itemKey`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemCollection` (`collectionKey` TEXT NOT NULL, `itemKey` TEXT NOT NULL, PRIMARY KEY(`collectionKey`, `itemKey`), FOREIGN KEY(`itemKey`) REFERENCES `ItemInfo`(`itemKey`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ItemCollection_itemKey_collectionKey` ON `ItemCollection` (`itemKey`, `collectionKey`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AttachmentInfo` (`itemKey` TEXT NOT NULL, `group` INTEGER NOT NULL, `md5Key` TEXT NOT NULL, `mtime` INTEGER NOT NULL, `downloadedFrom` TEXT NOT NULL, PRIMARY KEY(`itemKey`, `group`), FOREIGN KEY(`itemKey`) REFERENCES `ItemInfo`(`itemKey`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c39277354e4bd8b495037e65a80fe9c2')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `GroupInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `Collections`");
        _db.execSQL("DROP TABLE IF EXISTS `RecentlyOpenedAttachment`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemInfo`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemData`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemCreator`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemTags`");
        _db.execSQL("DROP TABLE IF EXISTS `ItemCollection`");
        _db.execSQL("DROP TABLE IF EXISTS `AttachmentInfo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGroupInfo = new HashMap<String, TableInfo.Column>(10);
        _columnsGroupInfo.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("libraryEditing", new TableInfo.Column("libraryEditing", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("libraryReading", new TableInfo.Column("libraryReading", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("fileEditing", new TableInfo.Column("fileEditing", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupInfo.put("owner", new TableInfo.Column("owner", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroupInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupInfo = new TableInfo("GroupInfo", _columnsGroupInfo, _foreignKeysGroupInfo, _indicesGroupInfo);
        final TableInfo _existingGroupInfo = TableInfo.read(_db, "GroupInfo");
        if (! _infoGroupInfo.equals(_existingGroupInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "GroupInfo(com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo).\n"
                  + " Expected:\n" + _infoGroupInfo + "\n"
                  + " Found:\n" + _existingGroupInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsCollections = new HashMap<String, TableInfo.Column>(5);
        _columnsCollections.put("key", new TableInfo.Column("key", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollections.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollections.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollections.put("parentCollection", new TableInfo.Column("parentCollection", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCollections.put("group", new TableInfo.Column("group", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCollections = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCollections = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCollections = new TableInfo("Collections", _columnsCollections, _foreignKeysCollections, _indicesCollections);
        final TableInfo _existingCollections = TableInfo.read(_db, "Collections");
        if (! _infoCollections.equals(_existingCollections)) {
          return new RoomOpenHelper.ValidationResult(false, "Collections(com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection).\n"
                  + " Expected:\n" + _infoCollections + "\n"
                  + " Found:\n" + _existingCollections);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentlyOpenedAttachment = new HashMap<String, TableInfo.Column>(2);
        _columnsRecentlyOpenedAttachment.put("itemKey", new TableInfo.Column("itemKey", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentlyOpenedAttachment.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentlyOpenedAttachment = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentlyOpenedAttachment = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentlyOpenedAttachment = new TableInfo("RecentlyOpenedAttachment", _columnsRecentlyOpenedAttachment, _foreignKeysRecentlyOpenedAttachment, _indicesRecentlyOpenedAttachment);
        final TableInfo _existingRecentlyOpenedAttachment = TableInfo.read(_db, "RecentlyOpenedAttachment");
        if (! _infoRecentlyOpenedAttachment.equals(_existingRecentlyOpenedAttachment)) {
          return new RoomOpenHelper.ValidationResult(false, "RecentlyOpenedAttachment(com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment).\n"
                  + " Expected:\n" + _infoRecentlyOpenedAttachment + "\n"
                  + " Found:\n" + _existingRecentlyOpenedAttachment);
        }
        final HashMap<String, TableInfo.Column> _columnsItemInfo = new HashMap<String, TableInfo.Column>(4);
        _columnsItemInfo.put("itemKey", new TableInfo.Column("itemKey", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemInfo.put("group", new TableInfo.Column("group", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemInfo.put("version", new TableInfo.Column("version", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemInfo.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemInfo = new HashSet<TableInfo.Index>(1);
        _indicesItemInfo.add(new TableInfo.Index("index_ItemInfo_itemKey", true, Arrays.asList("itemKey")));
        final TableInfo _infoItemInfo = new TableInfo("ItemInfo", _columnsItemInfo, _foreignKeysItemInfo, _indicesItemInfo);
        final TableInfo _existingItemInfo = TableInfo.read(_db, "ItemInfo");
        if (! _infoItemInfo.equals(_existingItemInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemInfo(com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo).\n"
                  + " Expected:\n" + _infoItemInfo + "\n"
                  + " Found:\n" + _existingItemInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsItemData = new HashMap<String, TableInfo.Column>(4);
        _columnsItemData.put("parent", new TableInfo.Column("parent", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemData.put("name", new TableInfo.Column("name", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemData.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemData.put("valueType", new TableInfo.Column("valueType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemData = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysItemData.add(new TableInfo.ForeignKey("ItemInfo", "CASCADE", "NO ACTION",Arrays.asList("parent"), Arrays.asList("itemKey")));
        final HashSet<TableInfo.Index> _indicesItemData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemData = new TableInfo("ItemData", _columnsItemData, _foreignKeysItemData, _indicesItemData);
        final TableInfo _existingItemData = TableInfo.read(_db, "ItemData");
        if (! _infoItemData.equals(_existingItemData)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemData(com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData).\n"
                  + " Expected:\n" + _infoItemData + "\n"
                  + " Found:\n" + _existingItemData);
        }
        final HashMap<String, TableInfo.Column> _columnsItemCreator = new HashMap<String, TableInfo.Column>(5);
        _columnsItemCreator.put("parent", new TableInfo.Column("parent", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemCreator.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemCreator.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemCreator.put("creatorType", new TableInfo.Column("creatorType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemCreator.put("order", new TableInfo.Column("order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemCreator = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysItemCreator.add(new TableInfo.ForeignKey("ItemInfo", "CASCADE", "NO ACTION",Arrays.asList("parent"), Arrays.asList("itemKey")));
        final HashSet<TableInfo.Index> _indicesItemCreator = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemCreator = new TableInfo("ItemCreator", _columnsItemCreator, _foreignKeysItemCreator, _indicesItemCreator);
        final TableInfo _existingItemCreator = TableInfo.read(_db, "ItemCreator");
        if (! _infoItemCreator.equals(_existingItemCreator)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemCreator(com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator).\n"
                  + " Expected:\n" + _infoItemCreator + "\n"
                  + " Found:\n" + _existingItemCreator);
        }
        final HashMap<String, TableInfo.Column> _columnsItemTags = new HashMap<String, TableInfo.Column>(2);
        _columnsItemTags.put("parent", new TableInfo.Column("parent", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemTags.put("tag", new TableInfo.Column("tag", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemTags = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysItemTags.add(new TableInfo.ForeignKey("ItemInfo", "CASCADE", "NO ACTION",Arrays.asList("parent"), Arrays.asList("itemKey")));
        final HashSet<TableInfo.Index> _indicesItemTags = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemTags = new TableInfo("ItemTags", _columnsItemTags, _foreignKeysItemTags, _indicesItemTags);
        final TableInfo _existingItemTags = TableInfo.read(_db, "ItemTags");
        if (! _infoItemTags.equals(_existingItemTags)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemTags(com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag).\n"
                  + " Expected:\n" + _infoItemTags + "\n"
                  + " Found:\n" + _existingItemTags);
        }
        final HashMap<String, TableInfo.Column> _columnsItemCollection = new HashMap<String, TableInfo.Column>(2);
        _columnsItemCollection.put("collectionKey", new TableInfo.Column("collectionKey", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemCollection.put("itemKey", new TableInfo.Column("itemKey", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemCollection = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysItemCollection.add(new TableInfo.ForeignKey("ItemInfo", "CASCADE", "NO ACTION",Arrays.asList("itemKey"), Arrays.asList("itemKey")));
        final HashSet<TableInfo.Index> _indicesItemCollection = new HashSet<TableInfo.Index>(1);
        _indicesItemCollection.add(new TableInfo.Index("index_ItemCollection_itemKey_collectionKey", false, Arrays.asList("itemKey","collectionKey")));
        final TableInfo _infoItemCollection = new TableInfo("ItemCollection", _columnsItemCollection, _foreignKeysItemCollection, _indicesItemCollection);
        final TableInfo _existingItemCollection = TableInfo.read(_db, "ItemCollection");
        if (! _infoItemCollection.equals(_existingItemCollection)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemCollection(com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection).\n"
                  + " Expected:\n" + _infoItemCollection + "\n"
                  + " Found:\n" + _existingItemCollection);
        }
        final HashMap<String, TableInfo.Column> _columnsAttachmentInfo = new HashMap<String, TableInfo.Column>(5);
        _columnsAttachmentInfo.put("itemKey", new TableInfo.Column("itemKey", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttachmentInfo.put("group", new TableInfo.Column("group", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttachmentInfo.put("md5Key", new TableInfo.Column("md5Key", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttachmentInfo.put("mtime", new TableInfo.Column("mtime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAttachmentInfo.put("downloadedFrom", new TableInfo.Column("downloadedFrom", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAttachmentInfo = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysAttachmentInfo.add(new TableInfo.ForeignKey("ItemInfo", "CASCADE", "NO ACTION",Arrays.asList("itemKey"), Arrays.asList("itemKey")));
        final HashSet<TableInfo.Index> _indicesAttachmentInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAttachmentInfo = new TableInfo("AttachmentInfo", _columnsAttachmentInfo, _foreignKeysAttachmentInfo, _indicesAttachmentInfo);
        final TableInfo _existingAttachmentInfo = TableInfo.read(_db, "AttachmentInfo");
        if (! _infoAttachmentInfo.equals(_existingAttachmentInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "AttachmentInfo(com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo).\n"
                  + " Expected:\n" + _infoAttachmentInfo + "\n"
                  + " Found:\n" + _existingAttachmentInfo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c39277354e4bd8b495037e65a80fe9c2", "e6ed750ca0017b85ad696c0960190931");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "GroupInfo","Collections","RecentlyOpenedAttachment","ItemInfo","ItemData","ItemCreator","ItemTags","ItemCollection","AttachmentInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `GroupInfo`");
      _db.execSQL("DELETE FROM `Collections`");
      _db.execSQL("DELETE FROM `RecentlyOpenedAttachment`");
      _db.execSQL("DELETE FROM `ItemInfo`");
      _db.execSQL("DELETE FROM `ItemData`");
      _db.execSQL("DELETE FROM `ItemCreator`");
      _db.execSQL("DELETE FROM `ItemTags`");
      _db.execSQL("DELETE FROM `ItemCollection`");
      _db.execSQL("DELETE FROM `AttachmentInfo`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public GroupInfoDao groupInfoDao() {
    if (_groupInfoDao != null) {
      return _groupInfoDao;
    } else {
      synchronized(this) {
        if(_groupInfoDao == null) {
          _groupInfoDao = new GroupInfoDao_Impl(this);
        }
        return _groupInfoDao;
      }
    }
  }

  @Override
  public CollectionDao collectionDao() {
    if (_collectionDao != null) {
      return _collectionDao;
    } else {
      synchronized(this) {
        if(_collectionDao == null) {
          _collectionDao = new CollectionDao_Impl(this);
        }
        return _collectionDao;
      }
    }
  }

  @Override
  public RecentlyOpenedAttachmentDao recentlyOpenedAttachmentsDao() {
    if (_recentlyOpenedAttachmentDao != null) {
      return _recentlyOpenedAttachmentDao;
    } else {
      synchronized(this) {
        if(_recentlyOpenedAttachmentDao == null) {
          _recentlyOpenedAttachmentDao = new RecentlyOpenedAttachmentDao_Impl(this);
        }
        return _recentlyOpenedAttachmentDao;
      }
    }
  }

  @Override
  public ItemDao itemDao() {
    if (_itemDao != null) {
      return _itemDao;
    } else {
      synchronized(this) {
        if(_itemDao == null) {
          _itemDao = new ItemDao_Impl(this);
        }
        return _itemDao;
      }
    }
  }

  @Override
  public AttachmentInfoDao AttachmentInfoDao() {
    if (_attachmentInfoDao != null) {
      return _attachmentInfoDao;
    } else {
      synchronized(this) {
        if(_attachmentInfoDao == null) {
          _attachmentInfoDao = new AttachmentInfoDao_Impl(this);
        }
        return _attachmentInfoDao;
      }
    }
  }
}
