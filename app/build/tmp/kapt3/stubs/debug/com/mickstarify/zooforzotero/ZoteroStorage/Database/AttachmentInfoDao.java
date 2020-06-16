package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfoDao;", "", "delete", "Lio/reactivex/Completable;", "attachmentInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfo;", "getAll", "Lio/reactivex/Maybe;", "", "getAttachment", "Lio/reactivex/Single;", "key", "", "getAttachmentsForGroup", "groupID", "", "insertAttachments", "attachments", "updateAttachment", "attachment", "app_debug"})
public abstract interface AttachmentInfoDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AttachmentInfo")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AttachmentInfo WHERE `itemKey`=:key LIMIT 1")
    public abstract io.reactivex.Single<com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo> getAttachment(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AttachmentInfo WHERE `group`=:groupID")
    public abstract io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo>> getAttachmentsForGroup(int groupID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable insertAttachments(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo> attachments);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable updateAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo attachment);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo attachmentInfo);
}