package com.mickstarify.zooforzotero.ZoteroStorage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u00019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020#J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020#J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010,\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010-\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010/\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0014J\u0006\u00103\u001a\u00020\u001aJ\u0006\u00104\u001a\u00020\u0010J\u0016\u00105\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u0014J\u0016\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006:"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "", "context", "Landroid/content/Context;", "preferenceManager", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "(Landroid/content/Context;Lcom/mickstarify/zooforzotero/PreferenceManager;)V", "getContext", "()Landroid/content/Context;", "getPreferenceManager", "()Lcom/mickstarify/zooforzotero/PreferenceManager;", "storageMode", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager$StorageMode;", "getStorageMode", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager$StorageMode;", "askUserForPath", "", "activity", "Landroid/app/Activity;", "calculateMd5", "", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "inputStream", "Ljava/io/InputStream;", "checkIfAttachmentExists", "", "item", "checkMd5", "createTempFile", "Ljava/io/File;", "filename", "deleteAttachment", "getAttachmentFile", "getAttachmentUri", "Landroid/net/Uri;", "getCustomStorageTreeURI", "getFileSize", "", "attachmentUri", "getFilenameForItem", "getItemInputStream", "getItemOutputStream", "Ljava/io/OutputStream;", "getMtime", "openAttachment", "Landroid/content/Intent;", "readBytes", "", "setStorage", "location", "testStorage", "validateAccess", "validateMd5ForItem", "md5Key", "writeAttachmentFromFile", "file", "StorageMode", "app_debug"})
@javax.inject.Singleton()
public final class AttachmentStorageManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.PreferenceManager preferenceManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager.StorageMode getStorageMode() {
        return null;
    }
    
    public final void validateAccess() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilenameForItem(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        return null;
    }
    
    public final boolean validateMd5ForItem(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
    java.lang.String md5Key) {
        return false;
    }
    
    public final boolean checkIfAttachmentExists(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, boolean checkMd5) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateMd5(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String calculateMd5(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.OutputStream getItemOutputStream(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.InputStream getItemInputStream(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getAttachmentUri(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        return null;
    }
    
    public final void askUserForPath(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent openAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    public final boolean testStorage() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createTempFile(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    public final void setStorage(@org.jetbrains.annotations.Nullable()
    java.lang.String location) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getCustomStorageTreeURI() {
        return null;
    }
    
    public final long getMtime(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return 0L;
    }
    
    private final java.io.File getAttachmentFile(com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    public final long getFileSize(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return 0L;
    }
    
    public final long getFileSize(@org.jetbrains.annotations.NotNull()
    android.net.Uri attachmentUri) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] readBytes(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri writeAttachmentFromFile(@org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    public final void deleteAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.PreferenceManager getPreferenceManager() {
        return null;
    }
    
    @javax.inject.Inject()
    public AttachmentStorageManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager preferenceManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager$StorageMode;", "", "(Ljava/lang/String;I)V", "CUSTOM", "EXTERNAL_CACHE", "NONE_SET", "app_debug"})
    public static enum StorageMode {
        /*public static final*/ CUSTOM /* = new CUSTOM() */,
        /*public static final*/ EXTERNAL_CACHE /* = new EXTERNAL_CACHE() */,
        /*public static final*/ NONE_SET /* = new NONE_SET() */;
        
        StorageMode() {
        }
    }
}