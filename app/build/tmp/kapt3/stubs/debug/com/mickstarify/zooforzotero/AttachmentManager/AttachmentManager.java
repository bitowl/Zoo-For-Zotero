package com.mickstarify.zooforzotero.AttachmentManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0016J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\u0012\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J \u0010)\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006,"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/AttachmentManager;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$View;", "()V", "doubleBackToExitPressedOnce", "", "presenter", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "getPresenter", "()Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "setPresenter", "(Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;)V", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "createErrorAlert", "", "title", "", "message", "onClick", "Lkotlin/Function0;", "displayAttachmentInformation", "nLocal", "", "sizeLocal", "nRemote", "hideLibraryLoadingAnimation", "initUI", "makeToastAlert", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setDownloadButtonState", "text", "enabled", "showLibraryLoadingAnimation", "updateLoadingProgress", "current", "total", "app_debug"})
public final class AttachmentManager extends androidx.appcompat.app.AppCompatActivity implements com.mickstarify.zooforzotero.AttachmentManager.Contract.View {
    @org.jetbrains.annotations.NotNull()
    public com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter presenter;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ProgressBar progressBar;
    private boolean doubleBackToExitPressedOnce;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initUI() {
    }
    
    @java.lang.Override()
    public void makeToastAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void createErrorAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.Nullable()
    android.widget.ProgressBar p0) {
    }
    
    @java.lang.Override()
    public void showLibraryLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void hideLibraryLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void setDownloadButtonState(@org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean enabled) {
    }
    
    @java.lang.Override()
    public void updateLoadingProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int current, int total) {
    }
    
    @java.lang.Override()
    public void displayAttachmentInformation(int nLocal, @org.jetbrains.annotations.NotNull()
    java.lang.String sizeLocal, int nRemote) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public AttachmentManager() {
        super();
    }
}