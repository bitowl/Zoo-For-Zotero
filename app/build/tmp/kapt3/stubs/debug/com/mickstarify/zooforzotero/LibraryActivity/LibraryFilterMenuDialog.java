package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0018\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0002J\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00060"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryFilterMenuDialog;", "", "context", "Landroid/content/Context;", "onFilterChange", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getContext", "()Landroid/content/Context;", "is_showing_notes", "", "()Z", "set_showing_notes", "(Z)V", "is_showing_pdf", "set_showing_pdf", "getOnFilterChange", "()Lkotlin/jvm/functions/Function0;", "preferences", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "getPreferences", "()Lcom/mickstarify/zooforzotero/PreferenceManager;", "setPreferences", "(Lcom/mickstarify/zooforzotero/PreferenceManager;)V", "selected_sorting_method", "", "getSelected_sorting_method", "()Ljava/lang/String;", "setSelected_sorting_method", "(Ljava/lang/String;)V", "sortingOrderButton", "Landroid/widget/Button;", "getSortingOrderButton", "()Landroid/widget/Button;", "setSortingOrderButton", "(Landroid/widget/Button;)V", "getSortString", "method", "saveSettings", "onlyNotes", "onlyPDFs", "setSortButtonAscending", "setSortButtonDescending", "setSortingMethod", "index", "", "show", "app_debug"})
public final class LibraryFilterMenuDialog {
    @org.jetbrains.annotations.NotNull()
    public com.mickstarify.zooforzotero.PreferenceManager preferences;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selected_sorting_method;
    private boolean is_showing_pdf;
    private boolean is_showing_notes;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button sortingOrderButton;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onFilterChange = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.PreferenceManager getPreferences() {
        return null;
    }
    
    public final void setPreferences(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelected_sorting_method() {
        return null;
    }
    
    public final void setSelected_sorting_method(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean is_showing_pdf() {
        return false;
    }
    
    public final void set_showing_pdf(boolean p0) {
    }
    
    public final boolean is_showing_notes() {
        return false;
    }
    
    public final void set_showing_notes(boolean p0) {
    }
    
    public final void setSortingMethod(int index) {
    }
    
    private final void saveSettings(boolean onlyNotes, boolean onlyPDFs) {
    }
    
    private final java.lang.String getSortString(java.lang.String method) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getSortingOrderButton() {
        return null;
    }
    
    public final void setSortingOrderButton(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    public final void setSortButtonAscending() {
    }
    
    public final void setSortButtonDescending() {
    }
    
    public final void show() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFilterChange() {
        return null;
    }
    
    public LibraryFilterMenuDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFilterChange) {
        super();
    }
}