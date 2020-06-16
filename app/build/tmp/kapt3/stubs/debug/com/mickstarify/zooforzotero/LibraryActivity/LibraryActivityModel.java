package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010T\u001a\u00020U2\u0018\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0W0 J\b\u0010X\u001a\u00020UH\u0016J\u0006\u0010Y\u001a\u00020UJ\u0006\u0010Z\u001a\u00020UJ\u0010\u0010[\u001a\u00020U2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020U2\u0006\u0010_\u001a\u00020\u0014H\u0016J\u0010\u0010`\u001a\u00020U2\u0006\u0010\\\u001a\u00020]H\u0016J\u0006\u0010a\u001a\u00020UJ\u0006\u0010b\u001a\u00020UJ\u0010\u0010c\u001a\u00020U2\u0006\u0010_\u001a\u00020\u0014H\u0016J\u0018\u0010d\u001a\u00020U2\u0006\u0010e\u001a\u00020#2\u0006\u0010f\u001a\u00020#H\u0016J\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020h0 2\u0006\u0010i\u001a\u00020\u0010H\u0016J\u0016\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010i\u001a\u00020\u0010H\u0016J\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00140 2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0002J\u0010\u0010l\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u0010\u0010n\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u0010\u0010o\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u0010\u0010p\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u0010\u0010q\u001a\u00020U2\u0006\u0010r\u001a\u00020!H\u0002J\u0016\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010t\u001a\u00020\u0010H\u0016J\u0010\u0010u\u001a\u0004\u0018\u00010h2\u0006\u0010v\u001a\u00020\u0010J\u000e\u0010w\u001a\b\u0012\u0004\u0012\u00020h0 H\u0016J\u0006\u0010x\u001a\u00020\u0010J\u0006\u0010y\u001a\u00020!J\u0012\u0010z\u001a\u0004\u0018\u00010!2\u0006\u0010{\u001a\u00020\u0010H\u0016J\u0016\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010v\u001a\u00020\u0010H\u0016J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0016J\u0016\u0010~\u001a\b\u0012\u0004\u0012\u00020]0 2\u0006\u0010t\u001a\u00020\u0010H\u0016J\u0016\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020h0 2\u0006\u0010v\u001a\u00020\u0010H\u0016J\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140 J\u000f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0016J\u0007\u0010\u0082\u0001\u001a\u00020#J\t\u0010\u0083\u0001\u001a\u00020#H\u0016J\u0007\u0010\u0084\u0001\u001a\u00020#J\u0011\u0010\u0085\u0001\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u001a\u0010\u0086\u0001\u001a\u00020U2\u0006\u0010r\u001a\u00020!2\u0007\u0010\u0087\u0001\u001a\u00020#H\u0016J\u0017\u0010\u0088\u0001\u001a\u00020U2\u0006\u0010r\u001a\u00020!2\u0006\u0010m\u001a\u00020BJ\u0007\u0010\u0089\u0001\u001a\u00020UJ\u001b\u0010\u008a\u0001\u001a\u00020U2\u0006\u0010m\u001a\u00020B2\b\b\u0002\u0010f\u001a\u00020#H\u0002J\u0007\u0010\u008b\u0001\u001a\u00020UJ\u000f\u0010\u008c\u0001\u001a\u00020U2\u0006\u0010m\u001a\u00020BJ\u0011\u0010\u008d\u0001\u001a\u00020U2\u0006\u0010m\u001a\u00020BH\u0002J\u0007\u0010\u008e\u0001\u001a\u00020UJ\u0011\u0010\u008f\u0001\u001a\u00020U2\u0006\u0010\\\u001a\u00020]H\u0016J\u0011\u0010\u0090\u0001\u001a\u00020U2\u0006\u0010_\u001a\u00020\u0014H\u0016J\u0012\u0010\u0091\u0001\u001a\u00020U2\u0007\u0010\u0092\u0001\u001a\u00020\u0014H\u0016J\u0011\u0010\u0093\u0001\u001a\u00020U2\u0006\u0010f\u001a\u00020#H\u0016J\u0012\u0010\u0094\u0001\u001a\u00020U2\u0007\u0010\u0092\u0001\u001a\u00020\u0014H\u0016J\u0010\u0010\u0095\u0001\u001a\u00020U2\u0007\u0010\u0096\u0001\u001a\u00020\u0010J\u0007\u0010\u0097\u0001\u001a\u00020#J\u000f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001J\u0012\u0010\u009b\u0001\u001a\u00020U2\u0007\u0010\u0092\u0001\u001a\u00020\u0014H\u0016J\t\u0010\u009c\u0001\u001a\u00020UH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001a\u0010,\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001a\u0010/\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010$\"\u0004\b1\u0010&R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018R\u0011\u0010;\u001a\u00020<\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u000e\u0010?\u001a\u00020@X\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020B8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010J\u001a\u00020KX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010L\u001a\u00020M8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u000e\u0010R\u001a\u00020SX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u009d\u0001"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivityModel;", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Model;", "presenter", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Presenter;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Presenter;Landroid/content/Context;)V", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "getAttachmentStorageManager", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "setAttachmentStorageManager", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;)V", "collectionsByMenuId", "Ljava/util/HashMap;", "", "", "getContext", "()Landroid/content/Context;", "currentlyDownloadingAttachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "getCurrentlyDownloadingAttachment", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "setCurrentlyDownloadingAttachment", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "downloadDisposable", "Lio/reactivex/disposables/Disposable;", "getDownloadDisposable", "()Lio/reactivex/disposables/Disposable;", "setDownloadDisposable", "(Lio/reactivex/disposables/Disposable;)V", "groups", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "isDisplayingItems", "", "()Z", "setDisplayingItems", "(Z)V", "isDownloading", "setDownloading", "loadingCollections", "getLoadingCollections", "setLoadingCollections", "loadingItems", "getLoadingItems", "setLoadingItems", "loadingTrash", "getLoadingTrash", "setLoadingTrash", "preferences", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "getPreferences", "()Lcom/mickstarify/zooforzotero/PreferenceManager;", "setPreferences", "(Lcom/mickstarify/zooforzotero/PreferenceManager;)V", "selectedItem", "getSelectedItem", "setSelectedItem", "state", "Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryModelState;", "getState", "()Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryModelState;", "zoteroAPI", "Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPI;", "<set-?>", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "zoteroDB", "getZoteroDB", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "setZoteroDB", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;)V", "zoteroDB$delegate", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDBPicker;", "zoteroDBPicker", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDBPicker;", "zoteroDatabase", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "getZoteroDatabase", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "setZoteroDatabase", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;)V", "zoteroGroupDB", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroGroupDB;", "askToUploadAttachments", "", "changedAttachments", "Lkotlin/Pair;", "cancelAttachmentDownload", "checkAllAttachmentsForModification", "checkAttachmentStorageAccess", "createNote", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "deleteAttachment", "item", "deleteNote", "destroyLibrary", "displayGroupsOnUI", "downloadAttachment", "downloadLibrary", "doRefresh", "useSmallLoadingAnimation", "filterCollections", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "query", "filterItems", "items", "finishGetCollections", "db", "finishGetItems", "finishGetTrash", "finishLoading", "finishLoadingGroups", "group", "getAttachments", "itemKey", "getCollectionFromKey", "collectionKey", "getCollections", "getCurrentCollection", "getCurrentGroup", "getGroupByTitle", "groupTitle", "getItemsFromCollection", "getLibraryItems", "getNotes", "getSubCollections", "getTrashedItems", "getUnfiledItems", "hasOldStorage", "isLoaded", "isUsingGroups", "loadCollections", "loadGroup", "refresh", "loadGroupItemsLocally", "loadGroups", "loadItems", "loadLibraryLocally", "loadLibraryStage2", "loadTrashedItems", "migrateFromOldStorage", "modifyNote", "openAttachment", "openPDF", "attachment", "refreshLibrary", "removeFromRecentlyViewed", "setCurrentCollection", "collectionName", "shouldIUpdateLibrary", "updateDeletedEntries", "Lio/reactivex/Single;", "Lio/reactivex/Completable;", "uploadAttachment", "usePersonalLibrary", "app_debug"})
public final class LibraryActivityModel implements com.mickstarify.zooforzotero.LibraryActivity.Contract.Model {
    private java.util.HashMap<java.lang.Integer, java.lang.String> collectionsByMenuId;
    @org.jetbrains.annotations.Nullable()
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item selectedItem;
    private boolean isDisplayingItems;
    private com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPI zoteroAPI;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase zoteroDatabase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager;
    private final com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroGroupDB zoteroGroupDB = null;
    private com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDBPicker zoteroDBPicker;
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo> groups;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.PreferenceManager preferences;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.LibraryActivity.LibraryModelState state = null;
    private final com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDBPicker zoteroDB$delegate = null;
    private boolean loadingItems;
    private boolean loadingCollections;
    private boolean loadingTrash;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.Disposable downloadDisposable;
    private boolean isDownloading;
    @org.jetbrains.annotations.Nullable()
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item currentlyDownloadingAttachment;
    private final com.mickstarify.zooforzotero.LibraryActivity.Contract.Presenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item getSelectedItem() {
        return null;
    }
    
    public final void setSelectedItem(@org.jetbrains.annotations.Nullable()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item p0) {
    }
    
    public final boolean isDisplayingItems() {
        return false;
    }
    
    public final void setDisplayingItems(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase getZoteroDatabase() {
        return null;
    }
    
    public final void setZoteroDatabase(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager getAttachmentStorageManager() {
        return null;
    }
    
    public final void setAttachmentStorageManager(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.PreferenceManager getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.LibraryActivity.LibraryModelState getState() {
        return null;
    }
    
    private final com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB getZoteroDB() {
        return null;
    }
    
    private final void setZoteroDB(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB p0) {
    }
    
    public final boolean getLoadingItems() {
        return false;
    }
    
    public final void setLoadingItems(boolean p0) {
    }
    
    public final boolean getLoadingCollections() {
        return false;
    }
    
    public final void setLoadingCollections(boolean p0) {
    }
    
    public final boolean getLoadingTrash() {
        return false;
    }
    
    public final void setLoadingTrash(boolean p0) {
    }
    
    @java.lang.Override()
    public void refreshLibrary(boolean useSmallLoadingAnimation) {
    }
    
    public final boolean shouldIUpdateLibrary() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isLoaded() {
        return false;
    }
    
    private final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> filterItems(java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> items) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo getGroupByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String groupTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getLibraryItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItemsFromCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getSubCollections(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    @java.lang.Override()
    public void downloadLibrary(boolean doRefresh, boolean useSmallLoadingAnimation) {
    }
    
    private final void loadCollections(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    private final void loadTrashedItems(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    private final void loadItems(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db, boolean useSmallLoadingAnimation) {
    }
    
    private final void finishGetCollections(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    private final void finishGetItems(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    private final void finishGetTrash(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    public final void loadLibraryLocally() {
    }
    
    public final void loadLibraryStage2(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    private final void finishLoading(com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getCollections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getAttachments(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> getNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> filterCollections(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    public void openPDF(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    @java.lang.Override()
    public void openAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> filterItems(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable getDownloadDisposable() {
        return null;
    }
    
    public final void setDownloadDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable p0) {
    }
    
    @java.lang.Override()
    public void downloadAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void cancelAttachmentDownload() {
    }
    
    public final boolean isDownloading() {
        return false;
    }
    
    public final void setDownloading(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item getCurrentlyDownloadingAttachment() {
        return null;
    }
    
    public final void setCurrentlyDownloadingAttachment(@org.jetbrains.annotations.Nullable()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getUnfiledItems() {
        return null;
    }
    
    @java.lang.Override()
    public void createNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void modifyNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void deleteNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void deleteAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    public final void displayGroupsOnUI() {
    }
    
    public final void loadGroups() {
    }
    
    public final void checkAllAttachmentsForModification() {
    }
    
    public final void askToUploadAttachments(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item, java.lang.Integer>> changedAttachments) {
    }
    
    @java.lang.Override()
    public void uploadAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    @java.lang.Override()
    public void removeFromRecentlyViewed(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    public final void loadGroupItemsLocally(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo group, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB db) {
    }
    
    @java.lang.Override()
    public void loadGroup(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo group, boolean refresh) {
    }
    
    private final void finishLoadingGroups(com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo group) {
    }
    
    @java.lang.Override()
    public void usePersonalLibrary() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentCollection() {
        return null;
    }
    
    public final void setCurrentCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionName) {
    }
    
    public final boolean isUsingGroups() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo getCurrentGroup() {
        return null;
    }
    
    public final void checkAttachmentStorageAccess() {
    }
    
    public final boolean hasOldStorage() {
        return false;
    }
    
    public final void migrateFromOldStorage() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<io.reactivex.Completable> updateDeletedEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getTrashedItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection getCollectionFromKey(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey) {
        return null;
    }
    
    public final void destroyLibrary() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public LibraryActivityModel(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.LibraryActivity.Contract.Presenter presenter, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}