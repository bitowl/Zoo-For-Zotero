package com.mickstarify.zooforzotero.AttachmentManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0016J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J \u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006%"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/AttachmentManagerPresenter;", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "view", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$View;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$View;Landroid/content/Context;)V", "model", "Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Model;", "getModel", "()Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Model;", "getView", "()Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$View;", "createErrorAlert", "", "title", "", "message", "onClick", "Lkotlin/Function0;", "displayAttachmentInformation", "nLocal", "", "sizeLocal", "", "nRemote", "displayErrorState", "displayLoadingAnimation", "finishLoadingAnimation", "isDownloading", "", "makeToastAlert", "pressedDownloadAttachments", "updateProgress", "filename", "current", "total", "app_debug"})
public final class AttachmentManagerPresenter implements com.mickstarify.zooforzotero.AttachmentManager.Contract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.AttachmentManager.Contract.Model model = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.AttachmentManager.Contract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.AttachmentManager.Contract.Model getModel() {
        return null;
    }
    
    @java.lang.Override()
    public void pressedDownloadAttachments() {
    }
    
    @java.lang.Override()
    public void displayAttachmentInformation(int nLocal, long sizeLocal, int nRemote) {
    }
    
    @java.lang.Override()
    public void displayLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void finishLoadingAnimation() {
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
    
    @java.lang.Override()
    public boolean isDownloading() {
        return false;
    }
    
    @java.lang.Override()
    public void displayErrorState() {
    }
    
    @java.lang.Override()
    public void updateProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, int current, int total) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.AttachmentManager.Contract.View getView() {
        return null;
    }
    
    public AttachmentManagerPresenter(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.AttachmentManager.Contract.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}