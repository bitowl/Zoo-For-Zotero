package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/RecentlyOpenedAttachmentDao;", "", "delete", "Lio/reactivex/Completable;", "itemKey", "", "getAll", "Lio/reactivex/Maybe;", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/RecentlyOpenedAttachment;", "insert", "recentlyOpenedAttachment", "app_debug"})
public abstract interface RecentlyOpenedAttachmentDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RecentlyOpenedAttachment")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM RecentlyOpenedAttachment WHERE itemKey=:itemKey")
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract io.reactivex.Completable insert(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment recentlyOpenedAttachment);
}