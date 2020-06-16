package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Database(entities = {com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection.class, com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo.class}, version = 5, exportSchema = true)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "AttachmentInfoDao", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfoDao;", "collectionDao", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/CollectionDao;", "groupInfoDao", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfoDao;", "itemDao", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemDao;", "recentlyOpenedAttachmentsDao", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/RecentlyOpenedAttachmentDao;", "app_debug"})
public abstract class ZoteroRoomDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfoDao groupInfoDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.CollectionDao collectionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachmentDao recentlyOpenedAttachmentsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemDao itemDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfoDao AttachmentInfoDao();
    
    public ZoteroRoomDatabase() {
        super();
    }
}