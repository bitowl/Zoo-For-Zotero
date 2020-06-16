package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J&\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016JD\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0016\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\b\u0010*\u001a\u00020\u0011H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010/\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u00100\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000bH\u0016J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u0013H\u0016J\b\u00105\u001a\u00020\u0011H\u0016J\u0016\u00106\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u0002080%H\u0016J\b\u00109\u001a\u00020\u0011H\u0016J\b\u0010:\u001a\u00020\u0011H\u0016J\b\u0010;\u001a\u00020\u0011H\u0016J\b\u0010<\u001a\u00020\u0011H\u0016J\u0018\u0010=\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020-H\u0016J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00132\u0006\u0010A\u001a\u00020-H\u0016J\b\u0010B\u001a\u00020\u0011H\u0016J\b\u0010C\u001a\u00020\u0011H\u0016J\u0010\u0010D\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u000bH\u0016J\b\u0010F\u001a\u00020\u0011H\u0016J\u0018\u0010G\u001a\u00020\u00112\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020IH\u0016J \u0010K\u001a\u00020\u00112\u0006\u0010H\u001a\u00020L2\u0006\u0010J\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010M\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u000bH\u0016J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000b0%*\b\u0012\u0004\u0012\u00020\u000b0%H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006O"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivityPresenter;", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Presenter;", "view", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$View;", "context", "Landroid/content/Context;", "(Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$View;Landroid/content/Context;)V", "model", "Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivityModel;", "sortMethod", "Ljava/util/Comparator;", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "getSortMethod", "()Ljava/util/Comparator;", "getView", "()Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$View;", "attachmentDownloadError", "", "message", "", "cancelAttachmentDownload", "closeQuery", "createErrorAlert", "title", "onClick", "Lkotlin/Function0;", "createNote", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "createYesNoPrompt", "yesText", "noText", "onYesClick", "onNoClick", "deleteNote", "displayGroupsOnActionBar", "groups", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "filterEntries", "query", "finishDownloadingAttachment", "hideBasicSyncAnimation", "hideLibraryLoadingAnimation", "isShowingContent", "", "makeToastAlert", "modifyNote", "onResume", "openAttachment", "item", "openGroup", "groupTitle", "openTrash", "receiveCollections", "collections", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "redisplayItems", "refreshItemView", "requestForceResync", "requestLibraryRefresh", "selectItem", "longPress", "setCollection", "collectionKey", "isSubCollection", "showBasicSyncAnimation", "showLibraryLoadingAnimation", "startUploadingAttachmentProgress", "attachment", "stopUploadingAttachmentProgress", "updateAttachmentDownloadProgress", "progress", "", "total", "updateLibraryRefreshProgress", "", "uploadAttachment", "sort", "app_debug"})
public final class LibraryActivityPresenter implements com.mickstarify.zooforzotero.LibraryActivity.Contract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> sortMethod = null;
    private final com.mickstarify.zooforzotero.LibraryActivity.LibraryActivityModel model = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.LibraryActivity.Contract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getSortMethod() {
        return null;
    }
    
    @java.lang.Override()
    public void openGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupTitle) {
    }
    
    @java.lang.Override()
    public void startUploadingAttachmentProgress(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    @java.lang.Override()
    public void stopUploadingAttachmentProgress() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void displayGroupsOnActionBar(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo> groups) {
    }
    
    @java.lang.Override()
    public void modifyNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void createNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void deleteNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void redisplayItems() {
    }
    
    @java.lang.Override()
    public void cancelAttachmentDownload() {
    }
    
    @java.lang.Override()
    public boolean isShowingContent() {
        return false;
    }
    
    @java.lang.Override()
    public void updateLibraryRefreshProgress(int progress, int total, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void closeQuery() {
    }
    
    @java.lang.Override()
    public void filterEntries(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @java.lang.Override()
    public void attachmentDownloadError(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void finishDownloadingAttachment() {
    }
    
    @java.lang.Override()
    public void createYesNoPrompt(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String yesText, @org.jetbrains.annotations.NotNull()
    java.lang.String noText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onYesClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNoClick) {
    }
    
    @java.lang.Override()
    public void showBasicSyncAnimation() {
    }
    
    @java.lang.Override()
    public void hideBasicSyncAnimation() {
    }
    
    @java.lang.Override()
    public void openAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void updateAttachmentDownloadProgress(long progress, long total) {
    }
    
    @java.lang.Override()
    public void showLibraryLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void hideLibraryLoadingAnimation() {
    }
    
    @java.lang.Override()
    public void requestLibraryRefresh() {
    }
    
    @java.lang.Override()
    public void selectItem(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, boolean longPress) {
    }
    
    @java.lang.Override()
    public void refreshItemView() {
    }
    
    @java.lang.Override()
    public void openTrash() {
    }
    
    @java.lang.Override()
    public void uploadAttachment(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void requestForceResync() {
    }
    
    @java.lang.Override()
    public void setCollection(@org.jetbrains.annotations.NotNull()
    java.lang.String collectionKey, boolean isSubCollection) {
    }
    
    @java.lang.Override()
    public void receiveCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> collections) {
    }
    
    @java.lang.Override()
    public void createErrorAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @java.lang.Override()
    public void makeToastAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> sort(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> $this$sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.LibraryActivity.Contract.View getView() {
        return null;
    }
    
    public LibraryActivityPresenter(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.LibraryActivity.Contract.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}