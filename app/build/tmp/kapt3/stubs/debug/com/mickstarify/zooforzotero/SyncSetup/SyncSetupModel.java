package com.mickstarify.zooforzotero.SyncSetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupModel;", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$Model;", "presenter", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupPresenter;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupPresenter;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getPresenter", "()Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupPresenter;", "hasSyncSetup", "", "openLibrary", "", "setupZoteroAPI", "testAPIKey", "apiKey", "", "app_debug"})
public final class SyncSetupModel implements com.mickstarify.zooforzotero.SyncSetup.SyncSetupContract.Model {
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.SyncSetup.SyncSetupPresenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @java.lang.Override()
    public void testAPIKey(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
    
    @java.lang.Override()
    public boolean hasSyncSetup() {
        return false;
    }
    
    @java.lang.Override()
    public void setupZoteroAPI() {
    }
    
    public final void openLibrary() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SyncSetup.SyncSetupPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public SyncSetupModel(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.SyncSetupPresenter presenter, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}