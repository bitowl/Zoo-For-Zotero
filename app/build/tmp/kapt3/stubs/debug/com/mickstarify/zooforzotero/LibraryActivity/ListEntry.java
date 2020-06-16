package com.mickstarify.zooforzotero.LibraryActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/mickstarify/zooforzotero/LibraryActivity/ListEntry;", "", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "collection", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;)V", "getCollection", "getItem", "isCollection", "", "isItem", "app_debug"})
public final class ListEntry {
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection;
    private com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item;
    
    public final boolean isItem() {
        return false;
    }
    
    public final boolean isCollection() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item getItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection getCollection() {
        return null;
    }
    
    public ListEntry(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        super();
    }
    
    public ListEntry(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection) {
        super();
    }
}