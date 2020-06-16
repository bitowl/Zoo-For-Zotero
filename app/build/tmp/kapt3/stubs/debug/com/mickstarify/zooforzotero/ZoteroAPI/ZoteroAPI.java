package com.mickstarify.zooforzotero.ZoteroAPI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0012J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'J(\u0010(\u001a\b\u0012\u0004\u0012\u00020)0!2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\b\b\u0002\u0010+\u001a\u00020\u001dH\u0002J$\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0!2\u0006\u0010/\u001a\u00020\u001d2\b\b\u0002\u0010%\u001a\u00020\u001dJ\u001e\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00103\u001a\u00020\u001d2\b\b\u0002\u0010%\u001a\u00020\u001dJ\u0012\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050-0!J,\u00106\u001a\b\u0012\u0004\u0012\u0002070!2\b\b\u0002\u0010/\u001a\u00020\u001d2\b\b\u0002\u0010%\u001a\u00020\u001d2\n\b\u0002\u00108\u001a\u0004\u0018\u000109J&\u0010:\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001dH\u0002J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010%\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dJ$\u0010<\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010%\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001dJF\u0010=\u001a\b\u0012\u0004\u0012\u00020>0!2\u0006\u0010#\u001a\u00020$2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010/\u001a\u00020\u001dJ\u0016\u0010I\u001a\u00020F2\u0006\u0010#\u001a\u00020$2\u0006\u0010J\u001a\u00020KJ>\u0010L\u001a\u00020\u001a26\u0010M\u001a2\u0012\u0013\u0012\u00110O\u00a2\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u001a0NJ\u000e\u0010T\u001a\u00020F2\u0006\u0010U\u001a\u00020$J\u0016\u0010V\u001a\u00020F2\u0006\u0010U\u001a\u00020$2\u0006\u0010&\u001a\u00020\'J\u000e\u0010W\u001a\u00020F2\u0006\u0010G\u001a\u00020HR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\n\u00a8\u0006X"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPI;", "", "API_KEY", "", "userID", "username", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;)V", "getAPI_KEY", "()Ljava/lang/String;", "getAttachmentStorageManager", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "service", "Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPIService;", "kotlin.jvm.PlatformType", "getService", "()Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPIService;", "getUserID", "getUsername", "buildAmazonService", "deleteItem", "", "itemKey", "version", "", "listener", "Lcom/mickstarify/zooforzotero/ZoteroAPI/DeleteItemListener;", "downloadItemRx", "Lio/reactivex/Observable;", "Lcom/mickstarify/zooforzotero/ZoteroAPI/DownloadProgress;", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "groupID", "context", "Landroid/content/Context;", "getCollectionFromIndex", "Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPICollectionsResponse;", "modificationSinceVersion", "index", "getCollections", "", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionPOJO;", "libraryVersion", "getDeletedEntries", "Lio/reactivex/Single;", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/DeletedEntriesPojo;", "sinceVersion", "getGroupInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "getItems", "Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPIItemsResponse;", "downloadProgress", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ItemsDownloadProgress;", "getItemsFromIndex", "getTrashedItems", "getTrashedItemsFromIndex", "getUploadAuthorization", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/ZoteroUploadAuthorizationPojo;", "oldMd5", "newMd5", "filename", "filesize", "", "mtime", "modifyNote", "Lio/reactivex/Completable;", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "patchItem", "patch", "Lcom/google/gson/JsonObject;", "testConnection", "callback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "message", "updateAttachment", "attachment", "uploadAttachmentWithWebdav", "uploadNote", "app_debug"})
public final class ZoteroAPI {
    @org.jetbrains.annotations.NotNull()
    private final okhttp3.OkHttpClient httpClient = null;
    private final com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIService service = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String API_KEY = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userID = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getHttpClient() {
        return null;
    }
    
    public final com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIService getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIService buildAmazonService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.DownloadProgress> downloadItemRx(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, int groupID, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void testConnection(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable modifyNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note, int libraryVersion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.mickstarify.zooforzotero.ZoteroAPI.Model.DeletedEntriesPojo> getDeletedEntries(int sinceVersion, int groupID) {
        return null;
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey, int version, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.DeleteItemListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable patchItem(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject patch) {
        return null;
    }
    
    private final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIItemsResponse> getItemsFromIndex(int modificationSinceVersion, int index, int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIItemsResponse> getItems(int libraryVersion, int groupID, @org.jetbrains.annotations.Nullable()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ItemsDownloadProgress downloadProgress) {
        return null;
    }
    
    private final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPICollectionsResponse> getCollectionFromIndex(int groupID, int modificationSinceVersion, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionPOJO>> getCollections(int libraryVersion, int groupID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo>> getGroupInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIItemsResponse> getTrashedItemsFromIndex(int groupID, int sinceVersion, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIItemsResponse> getTrashedItems(int groupID, int sinceVersion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadAttachmentWithWebdav(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    private final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.Model.ZoteroUploadAuthorizationPojo> getUploadAuthorization(com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, java.lang.String oldMd5, java.lang.String newMd5, java.lang.String filename, long filesize, long mtime, com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPIService service) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_KEY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager getAttachmentStorageManager() {
        return null;
    }
    
    public ZoteroAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String API_KEY, @org.jetbrains.annotations.NotNull()
    java.lang.String userID, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager) {
        super();
    }
}