package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH\'J!\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0011\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0011\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfoDao;", "", "delete", "", "groupInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "getAll", "Lio/reactivex/Maybe;", "", "getGroupInfo", "Lio/reactivex/Single;", "id", "", "getNumber", "", "insertGroupInfos", "Lio/reactivex/Completable;", "", "([Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;)Lio/reactivex/Completable;", "updateGroupInfos", "([Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;)V", "app_debug"})
public abstract interface GroupInfoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM GroupInfo")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo>> getAll();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM GroupInfo")
    public abstract int getNumber();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM GroupInfo WHERE id=:id LIMIT 1")
    public abstract io.reactivex.Single<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo> getGroupInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertGroupInfos(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo... groupInfo);
    
    @androidx.room.Update()
    public abstract void updateGroupInfos(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo... groupInfo);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo groupInfo);
}