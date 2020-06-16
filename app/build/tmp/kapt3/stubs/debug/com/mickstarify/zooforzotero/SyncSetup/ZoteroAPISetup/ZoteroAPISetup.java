package com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/ZoteroAPISetup;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$View;", "()V", "presenter", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "handleZoteroOAuthIntent", "intent", "Landroid/content/Intent;", "loadURL", "url", "", "makeErrorAlert", "title", "message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "openLibraryView", "startLoadingAnimation", "stopLoadingAnimation", "app_debug"})
public final class ZoteroAPISetup extends androidx.appcompat.app.AppCompatActivity implements com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.View {
    private com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Presenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void openLibraryView() {
    }
    
    @java.lang.Override()
    public void startLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void stopLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void makeErrorAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void loadURL(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @java.lang.Override()
    public void applyOverrideConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration overrideConfiguration) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final void handleZoteroOAuthIntent(android.content.Intent intent) {
    }
    
    public ZoteroAPISetup() {
        super();
    }
}