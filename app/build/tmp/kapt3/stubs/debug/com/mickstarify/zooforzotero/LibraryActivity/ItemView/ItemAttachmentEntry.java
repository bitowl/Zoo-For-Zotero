package com.mickstarify.zooforzotero.LibraryActivity.ItemView;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry;", "Landroidx/fragment/app/Fragment;", "()V", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "fileOpenListener", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$OnAttachmentFragmentInteractionListener;", "getFileOpenListener", "()Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$OnAttachmentFragmentInteractionListener;", "setFileOpenListener", "(Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$OnAttachmentFragmentInteractionListener;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "OnAttachmentFragmentInteractionListener", "app_debug"})
public final class ItemAttachmentEntry extends androidx.fragment.app.Fragment {
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment;
    @org.jetbrains.annotations.Nullable()
    private com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry.OnAttachmentFragmentInteractionListener fileOpenListener;
    public static final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry.OnAttachmentFragmentInteractionListener getFileOpenListener() {
        return null;
    }
    
    public final void setFileOpenListener(@org.jetbrains.annotations.Nullable()
    com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry.OnAttachmentFragmentInteractionListener p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public ItemAttachmentEntry() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry newInstance(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$OnAttachmentFragmentInteractionListener;", "", "forceUploadAttachmentListener", "", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "openAttachmentFileListener", "app_debug"})
    public static abstract interface OnAttachmentFragmentInteractionListener {
        
        public abstract void openAttachmentFileListener(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
        
        public abstract void forceUploadAttachmentListener(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry$Companion;", "", "()V", "newInstance", "Lcom/mickstarify/zooforzotero/LibraryActivity/ItemView/ItemAttachmentEntry;", "attachment", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.mickstarify.zooforzotero.LibraryActivity.ItemView.ItemAttachmentEntry newInstance(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.ZoteroStorage.Database.Item attachment) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}