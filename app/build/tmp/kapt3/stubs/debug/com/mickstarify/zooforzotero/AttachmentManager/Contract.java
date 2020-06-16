package com.mickstarify.zooforzotero.AttachmentManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/Contract;", "", "Model", "Presenter", "View", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0003H&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH&\u00a8\u0006\u0019"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$View;", "", "createErrorAlert", "", "title", "", "message", "onClick", "Lkotlin/Function0;", "displayAttachmentInformation", "nLocal", "", "sizeLocal", "nRemote", "hideLibraryLoadingAnimation", "initUI", "makeToastAlert", "setDownloadButtonState", "text", "enabled", "", "showLibraryLoadingAnimation", "updateLoadingProgress", "current", "total", "app_debug"})
    public static abstract interface View {
        
        public abstract void initUI();
        
        public abstract void showLibraryLoadingAnimation();
        
        public abstract void hideLibraryLoadingAnimation();
        
        public abstract void updateLoadingProgress(@org.jetbrains.annotations.NotNull()
        java.lang.String message, int current, int total);
        
        public abstract void createErrorAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
        
        public abstract void makeToastAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void displayAttachmentInformation(int nLocal, @org.jetbrains.annotations.NotNull()
        java.lang.String sizeLocal, int nRemote);
        
        public abstract void setDownloadButtonState(@org.jetbrains.annotations.NotNull()
        java.lang.String text, boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0003H&J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH&\u00a8\u0006\u001a"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Presenter;", "", "createErrorAlert", "", "title", "", "message", "onClick", "Lkotlin/Function0;", "displayAttachmentInformation", "nLocal", "", "sizeLocal", "", "nRemote", "displayErrorState", "displayLoadingAnimation", "finishLoadingAnimation", "isDownloading", "", "makeToastAlert", "pressedDownloadAttachments", "updateProgress", "filename", "current", "total", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void pressedDownloadAttachments();
        
        public abstract void displayAttachmentInformation(int nLocal, long sizeLocal, int nRemote);
        
        public abstract void displayLoadingAnimation();
        
        public abstract void finishLoadingAnimation();
        
        public abstract void makeToastAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void displayErrorState();
        
        public abstract void updateProgress(@org.jetbrains.annotations.NotNull()
        java.lang.String filename, int current, int total);
        
        public abstract void createErrorAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
        
        public abstract boolean isDownloading();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/mickstarify/zooforzotero/AttachmentManager/Contract$Model;", "", "isDownloading", "", "()Z", "setDownloading", "(Z)V", "cancelDownload", "", "downloadAttachments", "loadLibrary", "app_debug"})
    public static abstract interface Model {
        
        public abstract void downloadAttachments();
        
        public abstract void loadLibrary();
        
        public abstract void cancelDownload();
        
        public abstract boolean isDownloading();
        
        public abstract void setDownloading(boolean p0);
    }
}