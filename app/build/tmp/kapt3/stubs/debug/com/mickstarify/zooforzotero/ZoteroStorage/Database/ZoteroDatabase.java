package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0!2\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0!J\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\"0!2\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\"0!J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\"0!J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010,\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020#J\u0014\u0010/\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020%0\"J\u0016\u00101\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00102\u001a\u000203J\u0016\u00101\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00104\u001a\u00020(J\u001c\u00105\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\f\u00106\u001a\b\u0012\u0004\u0012\u0002030\"J\u001c\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\f\u00108\u001a\b\u0012\u0004\u0012\u00020(0\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u00069"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "db", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroRoomDatabase;", "getDb", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroRoomDatabase;", "addGroup", "Lio/reactivex/Completable;", "group", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "addRecentlyOpenedAttachments", "recentlyOpenedAttachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/RecentlyOpenedAttachment;", "containsItem", "Lio/reactivex/Single;", "", "groupID", "", "itemKey", "", "deleteAllItemsForGroup", "deleteCollection", "collectionKey", "deleteEverything", "", "deleteItem", "deleteRecentlyOpenedAttachment", "getAttachmentsForGroup", "Lio/reactivex/Maybe;", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfo;", "getCollections", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "getGroups", "getItemsForGroup", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "getItemsFromUserTrash", "getRecentlyOpenedAttachments", "moveItemToTrash", "restoreItemFromTrash", "writeAttachmentInfo", "attachmentInfo", "writeCollections", "collections", "writeItem", "itemPOJO", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/ItemPOJO;", "item", "writeItemPOJOs", "itemsPOJO", "writeItems", "items", "app_debug"})
@javax.inject.Singleton()
public final class ZoteroDatabase {
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroRoomDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroRoomDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable addGroup(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo group) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo>> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getItemsForGroup(int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeItemPOJOs(int groupID, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.mickstarify.zooforzotero.ZoteroAPI.Model.ItemPOJO> itemsPOJO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeItems(int groupID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> items) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeItem(int groupID, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeItem(int groupID, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.ItemPOJO itemPOJO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection>> getCollections(int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> collections) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable addRecentlyOpenedAttachments(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment recentlyOpenedAttachment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteRecentlyOpenedAttachment(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.RecentlyOpenedAttachment>> getRecentlyOpenedAttachments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo>> getAttachmentsForGroup(int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getItemsFromUserTrash() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable writeAttachmentInfo(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo attachmentInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteAllItemsForGroup(int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Boolean> containsItem(int groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable moveItemToTrash(int groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable restoreItemFromTrash(int groupID, @org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    public final void deleteEverything() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public ZoteroDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}