package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/Contract;", "", "Model", "Presenter", "View", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J&\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&JD\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0016\u0010\u001e\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u0003H&J,\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0 2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0 H&J\u0012\u0010,\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0007H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020+H&J\u0018\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000204H&J\"\u00106\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\u0006\u0010\u000f\u001a\u00020\u0007H&\u00a8\u00067"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$View;", "", "addNavigationEntry", "", "collection", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "parent", "", "addSharedCollection", "groupInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "clearSidebar", "closeItemView", "createErrorAlert", "title", "message", "onClick", "Lkotlin/Function0;", "createYesNoPrompt", "yesText", "noText", "onYesClick", "onNoClick", "hideAttachmentDownloadProgress", "hideAttachmentUploadProgress", "hideBasicSyncAnimation", "hideLibraryContentDisplay", "hideLoadingAnimation", "initUI", "makeToastAlert", "populateEntries", "entries", "", "Lcom/mickstarify/zooforzotero/LibraryActivity/ListEntry;", "setTitle", "showAttachmentUploadProgress", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "showBasicSyncAnimation", "showItemDialog", "item", "attachments", "notes", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "showLibraryContentDisplay", "showLoadingAnimation", "showScreen", "", "showNote", "note", "updateAttachmentDownloadProgress", "progress", "", "total", "updateLibraryLoadingProgress", "app_debug"})
    public static abstract interface View {
        
        public abstract void initUI();
        
        public abstract void createErrorAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
        
        public abstract void showLoadingAnimation(boolean showScreen);
        
        public abstract void updateLibraryLoadingProgress(int progress, int total, @org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void addSharedCollection(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo groupInfo);
        
        public abstract void hideLoadingAnimation();
        
        public abstract void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String title);
        
        public abstract void addNavigationEntry(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection, @org.jetbrains.annotations.NotNull()
        java.lang.String parent);
        
        public abstract void populateEntries(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.LibraryActivity.ListEntry> entries);
        
        public abstract void showItemDialog(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes);
        
        public abstract void updateAttachmentDownloadProgress(int progress, int total);
        
        public abstract void hideAttachmentDownloadProgress();
        
        public abstract void makeToastAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void showLibraryContentDisplay(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void hideLibraryContentDisplay();
        
        public abstract void clearSidebar();
        
        public abstract void closeItemView();
        
        public abstract void showAttachmentUploadProgress(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment);
        
        public abstract void hideAttachmentUploadProgress();
        
        public abstract void createYesNoPrompt(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String yesText, @org.jetbrains.annotations.NotNull()
        java.lang.String noText, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onYesClick, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onNoClick);
        
        public abstract void showNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void showBasicSyncAnimation();
        
        public abstract void hideBasicSyncAnimation();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J&\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&JD\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u0005H&J\b\u0010(\u001a\u00020\u0003H&J\u0016\u0010)\u001a\u00020\u00032\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0017H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\u001a\u00100\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\b\b\u0002\u00101\u001a\u00020\u001fH&J\u001a\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u001fH&J\b\u00105\u001a\u00020\u0003H&J\b\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020%H&J\b\u00109\u001a\u00020\u0003H&J\u0018\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<H&J \u0010>\u001a\u00020\u00032\u0006\u0010;\u001a\u00020?2\u0006\u0010=\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&\u00a8\u0006A"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Presenter;", "", "attachmentDownloadError", "", "message", "", "cancelAttachmentDownload", "closeQuery", "createErrorAlert", "title", "onClick", "Lkotlin/Function0;", "createNote", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "createYesNoPrompt", "yesText", "noText", "onYesClick", "onNoClick", "deleteNote", "displayGroupsOnActionBar", "groups", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "filterEntries", "query", "finishDownloadingAttachment", "hideBasicSyncAnimation", "hideLibraryLoadingAnimation", "isShowingContent", "", "makeToastAlert", "modifyNote", "onResume", "openAttachment", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "openGroup", "groupTitle", "openTrash", "receiveCollections", "collections", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "redisplayItems", "refreshItemView", "requestForceResync", "requestLibraryRefresh", "selectItem", "longPress", "setCollection", "collectionName", "isSubCollection", "showBasicSyncAnimation", "showLibraryLoadingAnimation", "startUploadingAttachmentProgress", "attachment", "stopUploadingAttachmentProgress", "updateAttachmentDownloadProgress", "progress", "", "total", "updateLibraryRefreshProgress", "", "uploadAttachment", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void createErrorAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
        
        public abstract void receiveCollections(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> collections);
        
        public abstract void setCollection(@org.jetbrains.annotations.NotNull()
        java.lang.String collectionName, boolean isSubCollection);
        
        public abstract void selectItem(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, boolean longPress);
        
        public abstract void requestLibraryRefresh();
        
        public abstract void showLibraryLoadingAnimation();
        
        public abstract void hideLibraryLoadingAnimation();
        
        public abstract void openAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void finishDownloadingAttachment();
        
        public abstract void makeToastAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void attachmentDownloadError(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void updateAttachmentDownloadProgress(long progress, long total);
        
        public abstract void filterEntries(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        public abstract void closeQuery();
        
        public abstract void updateLibraryRefreshProgress(int progress, int total, @org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract boolean isShowingContent();
        
        public abstract void cancelAttachmentDownload();
        
        public abstract void redisplayItems();
        
        public abstract void createNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void modifyNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void refreshItemView();
        
        public abstract void displayGroupsOnActionBar(@org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo> groups);
        
        public abstract void openGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String groupTitle);
        
        public abstract void startUploadingAttachmentProgress(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment);
        
        public abstract void stopUploadingAttachmentProgress();
        
        public abstract void onResume();
        
        public abstract void createYesNoPrompt(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String yesText, @org.jetbrains.annotations.NotNull()
        java.lang.String noText, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onYesClick, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onNoClick);
        
        public abstract void showBasicSyncAnimation();
        
        public abstract void hideBasicSyncAnimation();
        
        public abstract void openTrash();
        
        public abstract void uploadAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void requestForceResync();
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u0017\u001a\u00020\u0014H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\u0006\u0010\u001d\u001a\u00020\u0014H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0017\u001a\u00020\u0014H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001d\u001a\u00020\u0014H&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H&J\b\u0010\"\u001a\u00020\u000eH&J\u001a\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020\u000eH&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\tH&J\u0012\u0010*\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\tH&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\tH&J\b\u0010-\u001a\u00020\u0003H&\u00a8\u0006."}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Model;", "", "cancelAttachmentDownload", "", "createNote", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "deleteAttachment", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "deleteNote", "downloadAttachment", "downloadLibrary", "doRefresh", "", "useSmallLoadingAnimation", "filterCollections", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "query", "", "filterItems", "getAttachments", "itemKey", "getCollections", "getGroupByTitle", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "groupTitle", "getItemsFromCollection", "collectionName", "getLibraryItems", "getNotes", "getSubCollections", "getUnfiledItems", "isLoaded", "loadGroup", "group", "refresh", "modifyNote", "openAttachment", "openPDF", "attachment", "refreshLibrary", "removeFromRecentlyViewed", "uploadAttachment", "usePersonalLibrary", "app_debug"})
    public static abstract interface Model {
        
        public abstract void downloadLibrary(boolean doRefresh, boolean useSmallLoadingAnimation);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getLibraryItems();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getItemsFromCollection(@org.jetbrains.annotations.NotNull()
        java.lang.String collectionName);
        
        public abstract void refreshLibrary(boolean useSmallLoadingAnimation);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getCollections();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getAttachments(@org.jetbrains.annotations.NotNull()
        java.lang.String itemKey);
        
        public abstract void downloadAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void cancelAttachmentDownload();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getSubCollections(@org.jetbrains.annotations.NotNull()
        java.lang.String collectionName);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> filterCollections(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> filterItems(@org.jetbrains.annotations.NotNull()
        java.lang.String query);
        
        public abstract boolean isLoaded();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> getNotes(@org.jetbrains.annotations.NotNull()
        java.lang.String itemKey);
        
        public abstract void createNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void modifyNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void openPDF(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment);
        
        public abstract void openAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void deleteAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void uploadAttachment(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment);
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> getUnfiledItems();
        
        public abstract void loadGroup(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo group, boolean refresh);
        
        public abstract void usePersonalLibrary();
        
        @org.jetbrains.annotations.Nullable()
        public abstract com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo getGroupByTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String groupTitle);
        
        public abstract void removeFromRecentlyViewed(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
        }
    }
}