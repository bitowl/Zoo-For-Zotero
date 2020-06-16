package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0085\u0001B\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000fH\u0016J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u000208H\u0016J\b\u0010@\u001a\u000208H\u0016J&\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f2\f\u0010D\u001a\b\u0012\u0004\u0012\u0002080EH\u0016JD\u0010F\u001a\u0002082\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\f\u0010I\u001a\b\u0012\u0004\u0012\u0002080E2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002080EH\u0016J\u0010\u0010K\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010O\u001a\u0002082\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u000208H\u0016J\b\u0010S\u001a\u000208H\u0016J\b\u0010T\u001a\u000208H\u0016J\b\u0010U\u001a\u000208H\u0016J\b\u0010V\u001a\u000208H\u0016J\b\u0010W\u001a\u000208H\u0016J\u0010\u0010X\u001a\u0002082\u0006\u0010C\u001a\u00020\u000fH\u0016J\b\u0010Y\u001a\u000208H\u0016J\u0012\u0010Z\u001a\u0002082\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\u0010\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\u0013H\u0016J\u0012\u0010_\u001a\u0002082\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010`\u001a\u00020\u00192\u0006\u0010P\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u0002082\u0006\u0010c\u001a\u00020dH\u0014J\u0010\u0010e\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010f\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010g\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010h\u001a\u00020\u00192\u0006\u0010P\u001a\u00020aH\u0016J\b\u0010i\u001a\u000208H\u0014J\b\u0010j\u001a\u000208H\u0016J\u0010\u0010k\u001a\u0002082\u0006\u0010[\u001a\u00020\\H\u0014J\b\u0010l\u001a\u000208H\u0014J\u0010\u0010m\u001a\u0002082\u0006\u0010P\u001a\u00020QH\u0016J\u0016\u0010n\u001a\u0002082\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0016J\u0010\u0010r\u001a\u0002082\u0006\u0010B\u001a\u00020\u000fH\u0016J\b\u0010s\u001a\u000208H\u0002J\u0010\u0010t\u001a\u0002082\u0006\u0010u\u001a\u00020QH\u0016J\b\u0010v\u001a\u000208H\u0016J\u0006\u0010w\u001a\u000208J\u0006\u0010x\u001a\u000208J,\u0010y\u001a\u0002082\u0006\u0010P\u001a\u00020Q2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020Q0p2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020M0pH\u0016J\u0010\u0010|\u001a\u0002082\u0006\u0010C\u001a\u00020\u000fH\u0016J\u0010\u0010}\u001a\u0002082\u0006\u0010~\u001a\u00020\u0019H\u0016J\u0010\u0010\u007f\u001a\u0002082\u0006\u0010L\u001a\u00020MH\u0016J\t\u0010\u0080\u0001\u001a\u000208H\u0002J\u001b\u0010\u0081\u0001\u001a\u0002082\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\nH\u0016J#\u0010\u0084\u0001\u001a\u0002082\u0007\u0010\u0082\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\b\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001c\u00104\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*\u00a8\u0006\u0086\u0001"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$View;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment$OnItemFragmentInteractionListener;", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$OnAttachmentFragmentInteractionListener;", "Lcom/mickstarify/zooforzotero/LibraryActivity/Notes/NoteInteractionListener;", "()V", "MENU_ID_COLLECTIONS_OFFSET", "", "MENU_ID_TRASH", "MENU_ID_UNFILED_ITEMS", "collectionKeyByMenuId", "Landroid/util/SparseArray;", "", "getCollectionKeyByMenuId", "()Landroid/util/SparseArray;", "collectionsMenu", "Landroid/view/Menu;", "getCollectionsMenu", "()Landroid/view/Menu;", "setCollectionsMenu", "(Landroid/view/Menu;)V", "doubleBackToExitPressedOnce", "", "itemView", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment;", "presenter", "Lcom/mickstarify/zooforzotero/LibraryActivity/Contract$Presenter;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "progressDialog", "Landroid/app/ProgressDialog;", "progressDialog$annotations", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "sharedCollections", "getSharedCollections", "setSharedCollections", "uploadProgressDialog", "getUploadProgressDialog", "setUploadProgressDialog", "addNavigationEntry", "", "collection", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "parent", "addSharedCollection", "groupInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/GroupInfo;", "clearSidebar", "closeItemView", "createErrorAlert", "title", "message", "onClick", "Lkotlin/Function0;", "createYesNoPrompt", "yesText", "noText", "onYesClick", "onNoClick", "deleteNote", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "editNote", "forceUploadAttachmentListener", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "hideAttachmentDownloadProgress", "hideAttachmentUploadProgress", "hideBasicSyncAnimation", "hideLibraryContentDisplay", "hideLoadingAnimation", "initUI", "makeToastAlert", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "onListFragmentInteraction", "onNavigationItemSelected", "Landroid/view/MenuItem;", "onNewIntent", "intent", "Landroid/content/Intent;", "onNoteCreate", "onNoteDelete", "onNoteEdit", "onOptionsItemSelected", "onPostResume", "onRefresh", "onRestoreInstanceState", "onResume", "openAttachmentFileListener", "populateEntries", "entries", "", "Lcom/mickstarify/zooforzotero/LibraryActivity/ListEntry;", "setTitle", "setupActionbar", "showAttachmentUploadProgress", "attachment", "showBasicSyncAnimation", "showEmptyList", "showFilterMenu", "showItemDialog", "attachments", "notes", "showLibraryContentDisplay", "showLoadingAnimation", "showScreen", "showNote", "showWebDAVSetup", "updateAttachmentDownloadProgress", "progress", "total", "updateLibraryLoadingProgress", "Companion", "app_debug"})
public final class LibraryActivity extends androidx.appcompat.app.AppCompatActivity implements com.mickstarify.zooforzotero.LibraryActivity.Contract.View, com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment.OnItemFragmentInteractionListener, com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry.OnAttachmentFragmentInteractionListener, com.mickstarify.zooforzotero.LibraryActivity.Notes.NoteInteractionListener {
    private final int MENU_ID_UNFILED_ITEMS = 1;
    private final int MENU_ID_TRASH = 2;
    private final int MENU_ID_COLLECTIONS_OFFSET = 10;
    private com.mickstarify.zooforzotero.LibraryActivity.Contract.Presenter presenter;
    private com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment itemView;
    @org.jetbrains.annotations.NotNull()
    public android.view.Menu collectionsMenu;
    @org.jetbrains.annotations.NotNull()
    public android.view.Menu sharedCollections;
    @org.jetbrains.annotations.NotNull()
    private final android.util.SparseArray<java.lang.String> collectionKeyByMenuId = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.SearchView searchView;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog uploadProgressDialog;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ProgressBar progressBar;
    private boolean doubleBackToExitPressedOnce;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_FILTER = "com.mickstarify.zooforzotero.intent.action.LIBRARY_FILTER_INTENT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_QUERY = "com.mickstarify.zooforzotero.intent.EXTRA_QUERY_TEXT";
    public static final com.mickstarify.zooforzotero.LibraryActivity.LibraryActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.Menu getCollectionsMenu() {
        return null;
    }
    
    public final void setCollectionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.Menu getSharedCollections() {
        return null;
    }
    
    public final void setSharedCollections(@org.jetbrains.annotations.NotNull()
    android.view.Menu p0) {
    }
    
    @java.lang.Override()
    public void initUI() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.SparseArray<java.lang.String> getCollectionKeyByMenuId() {
        return null;
    }
    
    @java.lang.Override()
    public void addNavigationEntry(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection, @org.jetbrains.annotations.NotNull()
    java.lang.String parent) {
    }
    
    @java.lang.Override()
    public void addSharedCollection(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.GroupInfo groupInfo) {
    }
    
    @java.lang.Override()
    public void clearSidebar() {
    }
    
    public final void showFilterMenu() {
    }
    
    private final void showWebDAVSetup() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.SearchView getSearchView() {
        return null;
    }
    
    public final void setSearchView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.SearchView p0) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void populateEntries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.LibraryActivity.ListEntry> entries) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public void createErrorAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @java.lang.Override()
    public void showLoadingAnimation(boolean showScreen) {
    }
    
    @java.lang.Override()
    public void hideLoadingAnimation() {
    }
    
    private final void setupActionbar() {
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void showItemDialog(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes) {
    }
    
    @java.lang.Override()
    public void showNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void closeItemView() {
    }
    
    @java.lang.Override()
    public void showBasicSyncAnimation() {
    }
    
    @java.lang.Override()
    public void hideBasicSyncAnimation() {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public static void progressDialog$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    @java.lang.Override()
    public void updateAttachmentDownloadProgress(int progress, int total) {
    }
    
    @java.lang.Override()
    public void hideAttachmentDownloadProgress() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getUploadProgressDialog() {
        return null;
    }
    
    public final void setUploadProgressDialog(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @java.lang.Override()
    public void showAttachmentUploadProgress(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
    }
    
    @java.lang.Override()
    public void hideAttachmentUploadProgress() {
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
    public void openAttachmentFileListener(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void forceUploadAttachmentListener(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void onListFragmentInteraction(@org.jetbrains.annotations.Nullable()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
    }
    
    @java.lang.Override()
    public void makeToastAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onPostResume() {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.Nullable()
    android.widget.ProgressBar p0) {
    }
    
    @java.lang.Override()
    public void updateLibraryLoadingProgress(int progress, int total, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showEmptyList() {
    }
    
    @java.lang.Override()
    public void showLibraryContentDisplay(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void hideLibraryContentDisplay() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void onNoteCreate(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void onNoteEdit(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void onNoteDelete(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void deleteNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void editNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    public LibraryActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivity$Companion;", "", "()V", "ACTION_FILTER", "", "EXTRA_QUERY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}