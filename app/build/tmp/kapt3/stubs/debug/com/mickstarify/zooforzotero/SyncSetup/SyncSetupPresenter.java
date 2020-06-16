package com.mickstarify.zooforzotero.SyncSetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupPresenter;", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$Presenter;", "view", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$View;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$View;Landroid/content/Context;)V", "model", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupModel;", "createNetworkError", "", "message", "", "hasSyncSetup", "", "selectSyncSetup", "option", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncOption;", "startZoteroAPISetup", "app_debug"})
public final class SyncSetupPresenter implements com.mickstarify.zooforzotero.SyncSetup.SyncSetupContract.Presenter {
    private final com.mickstarify.zooforzotero.SyncSetup.SyncSetupModel model = null;
    private final com.mickstarify.zooforzotero.SyncSetup.SyncSetupContract.View view = null;
    
    @java.lang.Override()
    public void createNetworkError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public boolean hasSyncSetup() {
        return false;
    }
    
    @java.lang.Override()
    public void startZoteroAPISetup() {
    }
    
    @java.lang.Override()
    public void selectSyncSetup(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.SyncOption option) {
    }
    
    public SyncSetupPresenter(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.SyncSetupContract.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}