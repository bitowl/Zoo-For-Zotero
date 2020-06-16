package com.mickstarify.zooforzotero.ZoteroAPI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\""}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Webdav;", "", "address", "", "username", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getPassword", "sardine", "Lcom/thegrizzlylabs/sardineandroid/impl/OkHttpSardine;", "getSardine", "()Lcom/thegrizzlylabs/sardineandroid/impl/OkHttpSardine;", "setSardine", "(Lcom/thegrizzlylabs/sardineandroid/impl/OkHttpSardine;)V", "getUsername", "downloadFileRx", "Lio/reactivex/Observable;", "Lcom/mickstarify/zooforzotero/ZoteroAPI/DownloadProgress;", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "context", "Landroid/content/Context;", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "downloadPropToString", "webpath", "testConnection", "", "uploadAttachment", "Lio/reactivex/Completable;", "app_debug"})
public final class Webdav {
    @org.jetbrains.annotations.NotNull()
    private com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine sardine;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine getSardine() {
        return null;
    }
    
    public final void setSardine(@org.jetbrains.annotations.NotNull()
    com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean testConnection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String downloadPropToString(@org.jetbrains.annotations.NotNull()
    java.lang.String webpath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.mickstarify.zooforzotero.ZoteroAPI.DownloadProgress> downloadFileRx(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public Webdav(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        super();
    }
}