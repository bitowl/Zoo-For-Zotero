package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\bH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\'J\b\u0010\u0012\u001a\u00020\u0011H\'J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\'J!\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0017\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/CollectionDao;", "", "delete", "", "collection", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "deleteUsingKey", "collectionKey", "", "getAll", "Lio/reactivex/Maybe;", "", "getCollection", "Lio/reactivex/Single;", "key", "getCollectionsForGroup", "groupID", "", "getNumber", "insertAllCollections", "Lio/reactivex/Completable;", "collections", "updateCollections", "", "([Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;)V", "app_debug"})
public abstract interface CollectionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Collections")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection>> getAll();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM Collections")
    public abstract int getNumber();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Collections WHERE `key`=:key LIMIT 1")
    public abstract io.reactivex.Single<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Collections WHERE `group`=:groupID ORDER BY name")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection>> getCollectionsForGroup(int groupID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertAllCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> collections);
    
    @androidx.room.Update()
    public abstract void updateCollections(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection... collection);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection);
    
    @androidx.room.Query(value = "DELETE FROM Collections where `key`=:collectionKey")
    @androidx.room.Transaction()
    public abstract void deleteUsingKey(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey);
}