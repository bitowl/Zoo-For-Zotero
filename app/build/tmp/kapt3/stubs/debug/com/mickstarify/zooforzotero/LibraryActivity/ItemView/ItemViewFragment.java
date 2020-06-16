package com.mickstarify.zooforzotero.LibraryActivity.ItemView;

import java.lang.System;

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [ItemViewFragment.OnListFragmentInteractionListener] interface.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u00012\u00020\u0002:\u000245B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0016\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\'\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010.\u001a\u00020\u0013H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0007\u001a\u000201H\u0016J\u0016\u00102\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0002J\b\u00103\u001a\u00020\u0013H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u00066"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/mickstarify/zooforzotero/LibraryActivity/Notes/NoteInteractionListener;", "()V", "attachments", "", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "item", "listener", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment$OnItemFragmentInteractionListener;", "notes", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "addAttachments", "", "addCreators", "creators", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Creator;", "addTextEntry", "label", "", "content", "deleteNote", "note", "editNote", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onOptionsItemSelected", "", "Landroid/view/MenuItem;", "populateNotes", "showCreateNoteDialog", "Companion", "OnItemFragmentInteractionListener", "app_debug"})
public final class ItemViewFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements com.mickstarify.zooforzotero.LibraryActivity.Notes.NoteInteractionListener {
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item;
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments;
    private java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes;
    private com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment.OnItemFragmentInteractionListener listener;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ITEM = "item";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ATTACHMENTS = "attachments";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_NOTES = "notes";
    public static final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void deleteNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void editNote(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showCreateNoteDialog() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void populateNotes(java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes) {
    }
    
    private final void addAttachments(java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments) {
    }
    
    private final void addTextEntry(java.lang.String label, java.lang.String content) {
    }
    
    private final void addCreators(java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> creators) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public ItemViewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes) {
        return null;
    }
    
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson
     * [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment$OnItemFragmentInteractionListener;", "", "onListFragmentInteraction", "", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "onNoteCreate", "note", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "onNoteDelete", "onNoteEdit", "app_debug"})
    public static abstract interface OnItemFragmentInteractionListener {
        
        public abstract void onListFragmentInteraction(@org.jetbrains.annotations.Nullable()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void onNoteCreate(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void onNoteEdit(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
        
        public abstract void onNoteDelete(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroAPI.Model.Note note);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment$Companion;", "", "()V", "ARG_ATTACHMENTS", "", "ARG_ITEM", "ARG_NOTES", "newInstance", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemViewFragment;", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "attachments", "", "notes", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemViewFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Item> attachments, @org.jetbrains.annotations.NotNull()
        java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> notes) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}