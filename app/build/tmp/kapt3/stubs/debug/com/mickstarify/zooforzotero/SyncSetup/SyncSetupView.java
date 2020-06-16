package com.mickstarify.zooforzotero.SyncSetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014J\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupView;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$View;", "()V", "presenter", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupPresenter;", "selected_provider", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncOption;", "getSelected_provider", "()Lcom/mickstarify/zooforzotero/SyncSetup/SyncOption;", "setSelected_provider", "(Lcom/mickstarify/zooforzotero/SyncSetup/SyncOption;)V", "createAPIKeyDialog", "", "onKeySubmit", "Lkotlin/Function1;", "", "createAlertDialog", "title", "message", "createUnsupportedAlert", "initUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showHowToZoteroSyncDialog", "onProceed", "Lkotlin/Function0;", "startZoteroAPIActivity", "app_debug"})
public final class SyncSetupView extends androidx.appcompat.app.AppCompatActivity implements com.mickstarify.zooforzotero.SyncSetup.SyncSetupContract.View {
    @org.jetbrains.annotations.NotNull()
    private com.mickstarify.zooforzotero.SyncSetup.SyncOption selected_provider;
    private com.mickstarify.zooforzotero.SyncSetup.SyncSetupPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void createAlertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void createAPIKeyDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onKeySubmit) {
    }
    
    @java.lang.Override()
    public void showHowToZoteroSyncDialog(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onProceed) {
    }
    
    @java.lang.Override()
    public void createUnsupportedAlert() {
    }
    
    @java.lang.Override()
    public void startZoteroAPIActivity() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SyncSetup.SyncOption getSelected_provider() {
        return null;
    }
    
    public final void setSelected_provider(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.SyncOption p0) {
    }
    
    @java.lang.Override()
    public void initUI() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public SyncSetupView() {
        super();
    }
}