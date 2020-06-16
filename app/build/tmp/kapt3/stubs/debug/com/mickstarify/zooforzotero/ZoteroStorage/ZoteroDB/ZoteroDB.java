package com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000207J\u0006\u00109\u001a\u000207J\u0006\u0010:\u001a\u000207J\u0006\u0010;\u001a\u000207J\u0014\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u000e\u0010?\u001a\u0002072\u0006\u0010@\u001a\u00020\bJ\u0014\u0010A\u001a\u00020=2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u0018J\u0006\u0010C\u001a\u000207J\u0006\u0010D\u001a\u000207J\u0006\u0010E\u001a\u00020=J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010F\u001a\u00020\bJ\u0010\u0010G\u001a\u0004\u0018\u00010\u00192\u0006\u0010H\u001a\u00020\bJ\u0010\u0010I\u001a\u0004\u0018\u00010\b2\u0006\u0010J\u001a\u00020\bJ\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\b\u0010L\u001a\u0004\u0018\u00010MJ\u0010\u0010N\u001a\u0004\u0018\u00010\u00142\u0006\u0010O\u001a\u00020\bJ\u0014\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010Q\u001a\u00020\bJ\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010S\u001a\u00020\u0005J\u0006\u0010T\u001a\u00020UJ\u0006\u0010V\u001a\u00020\u0005J\u0018\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020ZJ\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020,0\u00182\u0006\u0010O\u001a\u00020\bJ\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010H\u001a\u00020\bJ\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010^\u001a\u00020\u0005J\u0006\u0010_\u001a\u00020ZJ\u0018\u0010`\u001a\u00020Z2\u0006\u0010X\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020ZJ\u0006\u0010a\u001a\u00020ZJ\u0006\u0010b\u001a\u00020=J\u0006\u0010c\u001a\u00020=J\u0006\u0010d\u001a\u00020=J\u0006\u0010e\u001a\u00020=J\u0006\u0010f\u001a\u000207J\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020i0h2\u0006\u0010j\u001a\u00020kJ\u000e\u0010l\u001a\u0002072\u0006\u0010m\u001a\u00020MJ\u000e\u0010n\u001a\u0002072\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010p\u001a\u0002072\u0006\u0010q\u001a\u00020\u0005J\u000e\u0010r\u001a\u0002072\u0006\u0010q\u001a\u00020\u0005J(\u0010s\u001a\u00020=2\u0006\u0010O\u001a\u00020\b2\u0006\u0010t\u001a\u00020\b2\u0006\u0010u\u001a\u00020U2\b\b\u0002\u0010v\u001a\u00020\bJ\u0006\u0010w\u001a\u000207R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R4\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R4\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR:\u0010&\u001a.\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u00010\'j\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001`(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\"\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u0013\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006x"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "", "context", "Landroid/content/Context;", "groupID", "", "(Landroid/content/Context;I)V", "ITEMS_FILENAME", "", "getITEMS_FILENAME", "()Ljava/lang/String;", "attachmentInfo", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfo;", "getAttachmentInfo", "()Ljava/util/Map;", "setAttachmentInfo", "(Ljava/util/Map;)V", "attachments", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "getAttachments", "setAttachments", "value", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "collections", "getCollections", "()Ljava/util/List;", "setCollections", "(Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getGroupID", "()I", "items", "getItems", "setItems", "itemsFromCollections", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "namespace", "getNamespace", "notes", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "prefix", "getPrefix", "trashItems", "zoteroDatabase", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "getZoteroDatabase", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "setZoteroDatabase", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;)V", "clearItemsVersion", "", "commitCollectionsToDatabase", "createAttachmentsMap", "createCollectionItemMap", "createNotesMap", "deleteCollections", "Lio/reactivex/Completable;", "collectionKeys", "deleteItem", "key", "deleteItems", "itemKeys", "deleteLegacyStorage", "destroyDownloadProgress", "destroyItemsDatabase", "itemID", "getCollectionById", "collectionKey", "getCollectionId", "collectionName", "getDisplayableItems", "getDownloadProgress", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ItemsDownloadProgress;", "getItemWithKey", "itemKey", "getItemsFromCollection", "collection", "getItemsWithoutCollection", "getLastDeletedItemsCheckVersion", "getLastModifiedTimestamp", "", "getLibraryVersion", "getMd5Key", "item", "onlyWebdav", "", "getNotes", "getSubCollectionsFor", "getTrashItems", "getTrashVersion", "hasLegacyStorage", "hasMd5Key", "isPopulated", "loadCollectionsFromDatabase", "loadItemsFromDatabase", "loadTrashItemsFromDB", "migrateItemsFromOldStorage", "populateCollectionChildren", "scanAndIndexAttachments", "Lio/reactivex/Observable;", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/IndexFilesProgress;", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "setDownloadProgress", "progress", "setItemsVersion", "libraryVersion", "setLastDeletedItemsCheckVersion", "version", "setTrashVersion", "updateAttachmentMetadata", "md5Key", "mtime", "downloadedFrom", "writeDatabaseUpdatedTimestamp", "app_debug"})
public final class ZoteroDB {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase zoteroDatabase;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String prefix = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> collections;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> items;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> attachments;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo> attachmentInfo;
    private java.util.Map<java.lang.String, java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note>> notes;
    private java.util.HashMap<java.lang.String, java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> itemsFromCollections;
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> trashItems;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ITEMS_FILENAME = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String namespace = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final int groupID = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase getZoteroDatabase() {
        return null;
    }
    
    public final void setZoteroDatabase(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getCollections() {
        return null;
    }
    
    public final void setCollections(@org.jetbrains.annotations.Nullable()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> getAttachments() {
        return null;
    }
    
    public final void setAttachments(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo> getAttachmentInfo() {
        return null;
    }
    
    public final void setAttachmentInfo(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getITEMS_FILENAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamespace() {
        return null;
    }
    
    public final boolean isPopulated() {
        return false;
    }
    
    public final void writeDatabaseUpdatedTimestamp() {
    }
    
    public final long getLastModifiedTimestamp() {
        return 0L;
    }
    
    public final void commitCollectionsToDatabase() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable loadCollectionsFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable loadItemsFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable loadTrashItemsFromDB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable destroyItemsDatabase() {
        return null;
    }
    
    public final void deleteLegacyStorage() {
    }
    
    public final boolean hasLegacyStorage() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getAttachments(@org.jetbrains.annotations.NotNull()
    java.lang.String itemID) {
        return null;
    }
    
    public final void createAttachmentsMap() {
    }
    
    public final void createNotesMap() {
    }
    
    public final void createCollectionItemMap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItemsWithoutCollection() {
        return null;
    }
    
    public final void populateCollectionChildren() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getDisplayableItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItemsFromCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collection) {
        return null;
    }
    
    public final void setItemsVersion(int libraryVersion) {
    }
    
    public final void setDownloadProgress(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ItemsDownloadProgress progress) {
    }
    
    public final void destroyDownloadProgress() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ItemsDownloadProgress getDownloadProgress() {
        return null;
    }
    
    public final int getLastDeletedItemsCheckVersion() {
        return 0;
    }
    
    public final void setLastDeletedItemsCheckVersion(int version) {
    }
    
    public final int getLibraryVersion() {
        return 0;
    }
    
    public final int getTrashVersion() {
        return 0;
    }
    
    public final void setTrashVersion(int version) {
    }
    
    public final void clearItemsVersion() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCollectionId(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getSubCollectionsFor(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> getNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item getItemWithKey(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    public final boolean hasMd5Key(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, boolean onlyWebdav) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMd5Key(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, boolean onlyWebdav) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable migrateItemsFromOldStorage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.IndexFilesProgress> scanAndIndexAttachments(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateAttachmentMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey, @org.jetbrains.annotations.NotNull()
    java.lang.String md5Key, long mtime, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadedFrom) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteItems(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> itemKeys) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> collectionKeys) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getTrashItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection getCollectionById(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getGroupID() {
        return 0;
    }
    
    public ZoteroDB(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int groupID) {
        super();
    }
}