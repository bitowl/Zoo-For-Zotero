package com.mickstarify.zooforzotero.AttachmentManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001HB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020DH\u0016J\b\u0010F\u001a\u00020DH\u0016J\b\u0010G\u001a\u00020DH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u00020>8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006I"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/AttachmentManagerModel;", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Model;", "presenter", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;Landroid/content/Context;)V", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "getAttachmentStorageManager", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "setAttachmentStorageManager", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;)V", "getContext", "()Landroid/content/Context;", "downloadDisposable", "Lio/reactivex/disposables/Disposable;", "getDownloadDisposable", "()Lio/reactivex/disposables/Disposable;", "setDownloadDisposable", "(Lio/reactivex/disposables/Disposable;)V", "isDownloading", "", "()Z", "setDownloading", "(Z)V", "localAttachmentSize", "", "getLocalAttachmentSize", "()J", "setLocalAttachmentSize", "(J)V", "nLocalAttachments", "", "getNLocalAttachments", "()I", "setNLocalAttachments", "(I)V", "nRemoteAttachments", "getNRemoteAttachments", "setNRemoteAttachments", "preferenceManager", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "getPreferenceManager", "()Lcom/mickstarify/zooforzotero/PreferenceManager;", "setPreferenceManager", "(Lcom/mickstarify/zooforzotero/PreferenceManager;)V", "getPresenter", "()Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "zoteroAPI", "Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPI;", "getZoteroAPI", "()Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPI;", "setZoteroAPI", "(Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPI;)V", "zoteroDB", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "getZoteroDB", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "setZoteroDB", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;)V", "zoteroDatabase", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "getZoteroDatabase", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;", "setZoteroDatabase", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ZoteroDatabase;)V", "cancelDownload", "", "downloadAttachments", "loadLibrary", "showMetaInformation", "downloadAllProgress", "app_debug"})
public final class AttachmentManagerModel implements com.mickstarify.zooforzotero.AttachmentManager.Contract.Model {
    @org.jetbrains.annotations.NotNull()
    public com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPI zoteroAPI;
    @org.jetbrains.annotations.NotNull()
    public com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB zoteroDB;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.ZoteroStorage.Database.ZoteroDatabase zoteroDatabase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.mickstarify.zooforzotero.PreferenceManager preferenceManager;
    private boolean isDownloading;
    @org.jetbrains.annotations.Nullable()
    private io.reactivex.disposables.Disposable downloadDisposable;
    private long localAttachmentSize;
    private int nLocalAttachments;
    private int nRemoteAttachments;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPI getZoteroAPI() {
        return null;
    }
    
    public final void setZoteroAPI(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.ZoteroAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB getZoteroDB() {
        return null;
    }
    
    public final void setZoteroDB(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB p0) {
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
    public final com.mickstarify.zooforzotero.PreferenceManager getPreferenceManager() {
        return null;
    }
    
    public final void setPreferenceManager(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager p0) {
    }
    
    @java.lang.Override()
    public boolean isDownloading() {
        return false;
    }
    
    @java.lang.Override()
    public void setDownloading(boolean p0) {
    }
    
    @java.lang.Override()
    public void cancelDownload() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.reactivex.disposables.Disposable getDownloadDisposable() {
        return null;
    }
    
    public final void setDownloadDisposable(@org.jetbrains.annotations.Nullable()
    io.reactivex.disposables.Disposable p0) {
    }
    
    @java.lang.Override()
    public void downloadAttachments() {
    }
    
    @java.lang.Override()
    public void loadLibrary() {
    }
    
    public final long getLocalAttachmentSize() {
        return 0L;
    }
    
    public final void setLocalAttachmentSize(long p0) {
    }
    
    public final int getNLocalAttachments() {
        return 0;
    }
    
    public final void setNLocalAttachments(int p0) {
    }
    
    public final int getNRemoteAttachments() {
        return 0;
    }
    
    public final void setNRemoteAttachments(int p0) {
    }
    
    private final void showMetaInformation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public AttachmentManagerModel(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter presenter, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/AttachmentManagerModel$downloadAllProgress;", "", "status", "", "currentIndex", "", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "(ZILcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "getAttachment", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "setAttachment", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "getStatus", "()Z", "setStatus", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
    public static final class downloadAllProgress {
        private boolean status;
        private int currentIndex;
        @org.jetbrains.annotations.NotNull()
        private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment;
        
        public final boolean getStatus() {
            return false;
        }
        
        public final void setStatus(boolean p0) {
        }
        
        public final int getCurrentIndex() {
            return 0;
        }
        
        public final void setCurrentIndex(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item getAttachment() {
            return null;
        }
        
        public final void setAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item p0) {
        }
        
        public downloadAllProgress(boolean status, int currentIndex, @org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mickstarify.zooforzotero.AttachmentManager.AttachmentManagerModel.downloadAllProgress copy(boolean status, int currentIndex, @org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}