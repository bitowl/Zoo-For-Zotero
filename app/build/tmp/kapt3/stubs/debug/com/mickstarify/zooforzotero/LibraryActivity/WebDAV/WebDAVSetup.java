package com.mickstarify.zooforzotero.LibraryActivity.WebDAV;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0010J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0012J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u001e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/WebDAV/WebDAVSetup;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "preferenceManager", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "getPreferenceManager", "()Lcom/mickstarify/zooforzotero/PreferenceManager;", "setPreferenceManager", "(Lcom/mickstarify/zooforzotero/PreferenceManager;)V", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "destroyWebDAVAuthentication", "", "formatAddress", "", "address", "hideProgressDialog", "makeConnection", "username", "password", "notifyFailed", "message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setWebDAVAuthentication", "startProgressDialog", "app_debug"})
public final class WebDAVSetup extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public com.mickstarify.zooforzotero.PreferenceManager preferenceManager;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.PreferenceManager getPreferenceManager() {
        return null;
    }
    
    public final void setPreferenceManager(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public final void makeConnection(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    public final void startProgressDialog() {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void notifyFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setWebDAVAuthentication(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void destroyWebDAVAuthentication() {
    }
    
    public WebDAVSetup() {
        super();
    }
}