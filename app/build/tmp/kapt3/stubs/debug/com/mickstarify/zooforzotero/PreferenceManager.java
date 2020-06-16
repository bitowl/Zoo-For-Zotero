package com.mickstarify.zooforzotero;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\fJ\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\fJ\u001e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fJ\u0006\u0010\'\u001a\u00020\u000eJ\u000e\u0010(\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0011J\u000e\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\fJ\u0006\u0010+\u001a\u00020\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006-"}, d2 = {"Lcom/mickstarify/zooforzotero/PreferenceManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "destroyWebDAVAuthentication", "", "getCustomAttachmentStorageLocation", "", "getIsShowingOnlyNotes", "", "getIsShowingOnlyPdfs", "getSortMethod", "Lcom/mickstarify/zooforzotero/SortMethod;", "getStorageMode", "getWebDAVAddress", "getWebDAVPassword", "getWebDAVUsername", "isAttachmentUploadingEnabled", "isSortedAscendingly", "isWebDAVEnabled", "isWebDAVEnabledForGroups", "setCustomAttachmentStorage", "data", "setIsShowingOnlyNotes", "value", "setIsShowingOnlyPdfs", "setSortDirection", "direction", "setSortMethod", "method", "setWebDAVAuthentication", "address", "username", "password", "shouldOpenPDFOnOpen", "sortMethodToString", "stringToSortMethod", "methodString", "useExternalCache", "Companion", "app_debug"})
public final class PreferenceManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SORT_METHOD_ASCENDING = "ASCENDING";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SORT_METHOD_DESCENDING = "DESCENDING";
    public static final com.mickstarify.zooforzotero.PreferenceManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSortMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String method) {
    }
    
    public final void setSortMethod(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SortMethod method) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String sortMethodToString(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SortMethod method) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SortMethod stringToSortMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String methodString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SortMethod getSortMethod() {
        return null;
    }
    
    public final boolean isSortedAscendingly() {
        return false;
    }
    
    public final void setSortDirection(@org.jetbrains.annotations.NotNull()
    java.lang.String direction) {
    }
    
    public final boolean getIsShowingOnlyPdfs() {
        return false;
    }
    
    public final boolean getIsShowingOnlyNotes() {
        return false;
    }
    
    public final void setIsShowingOnlyPdfs(boolean value) {
    }
    
    public final void setIsShowingOnlyNotes(boolean value) {
    }
    
    public final void setWebDAVAuthentication(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void destroyWebDAVAuthentication() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebDAVUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebDAVPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebDAVAddress() {
        return null;
    }
    
    public final boolean isWebDAVEnabled() {
        return false;
    }
    
    public final boolean isWebDAVEnabledForGroups() {
        return false;
    }
    
    public final void setCustomAttachmentStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomAttachmentStorageLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStorageMode() {
        return null;
    }
    
    public final void useExternalCache() {
    }
    
    public final boolean isAttachmentUploadingEnabled() {
        return false;
    }
    
    public final boolean shouldOpenPDFOnOpen() {
        return false;
    }
    
    @javax.inject.Inject()
    public PreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/mickstarify/zooforzotero/PreferenceManager$Companion;", "", "()V", "SORT_METHOD_ASCENDING", "", "getSORT_METHOD_ASCENDING", "()Ljava/lang/String;", "SORT_METHOD_DESCENDING", "getSORT_METHOD_DESCENDING", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSORT_METHOD_ASCENDING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSORT_METHOD_DESCENDING() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}