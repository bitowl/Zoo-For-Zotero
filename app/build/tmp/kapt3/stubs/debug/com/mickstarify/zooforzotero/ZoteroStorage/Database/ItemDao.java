package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0015\u001a\u00020\bH\'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\'J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\'JH\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0012H\u0017J\u0016\u0010#\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\'J\u0016\u0010$\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012H\'J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\fH\'J\u0016\u0010(\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0012H\'\u00a8\u0006)"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemDao;", "", "containsItem", "Lio/reactivex/Single;", "", "groupID", "", "itemKey", "", "delete", "", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemInfo;", "deleteAllForGroup", "Lio/reactivex/Completable;", "deleteUsingItemKey", "getAll", "Lio/reactivex/Maybe;", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "getItem", "key", "getItemsForGroup", "getTrashedItemsForUser", "insertCreators", "creators", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Creator;", "insertItem", "itemInfo", "itemDatas", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemData;", "collections", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemCollection;", "tags", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemTag;", "insertItemCollections", "insertItemData", "itemData", "insertItemInfo", "items", "insertTags", "app_debug"})
public abstract interface ItemDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM itemInfo")
    @androidx.room.Transaction()
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM itemInfo WHERE `itemKey`=:key LIMIT 1")
    @androidx.room.Transaction()
    public abstract io.reactivex.Single<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItem(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM itemInfo WHERE `group`=:groupID and `deleted`=0")
    @androidx.room.Transaction()
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getItemsForGroup(int groupID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM itemInfo WHERE `group`=-1 and `deleted`=1")
    @androidx.room.Transaction()
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getTrashedItemsForUser();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) != 0 FROM ItemInfo WHERE `itemKey`=:itemKey and `group`=:groupID")
    public abstract io.reactivex.Single<java.lang.Boolean> containsItem(int groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertItemInfo(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo items);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertItemData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> itemData);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertCreators(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> creators);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertItemCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection> collections);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertTags(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> tags);
    
    @androidx.room.Transaction()
    public abstract void insertItem(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo itemInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> itemDatas, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> creators, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection> collections, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> tags);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo item);
    
    @androidx.room.Query(value = "DELETE FROM ItemInfo WHERE `itemKey`=:itemKey")
    @androidx.room.Transaction()
    public abstract void deleteUsingItemKey(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM iteminfo WHERE `group`=:groupID")
    public abstract io.reactivex.Completable deleteAllForGroup(int groupID);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insertItem(com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemDao $this, @org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo itemInfo, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> itemDatas, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> creators, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection> collections, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> tags) {
        }
    }
}