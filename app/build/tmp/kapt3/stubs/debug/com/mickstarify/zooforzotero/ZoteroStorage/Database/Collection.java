package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@androidx.room.Entity(tableName = "Collections")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B/\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\bJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00000\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection;", "", "collectionPOJO", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionPOJO;", "groupID", "", "(Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionPOJO;I)V", "key", "", "version", "name", "parentCollection", "groupParent", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getGroupParent", "()I", "getKey", "()Ljava/lang/String;", "getName", "getParentCollection", "subCollections", "", "getVersion", "addSubCollection", "", "collection", "getParent", "getSubCollections", "", "hasChildren", "", "hasParent", "Companion", "app_debug"})
public final class Collection {
    @androidx.room.Ignore()
    private java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> subCollections;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private final java.lang.String key = null;
    @androidx.room.ColumnInfo(name = "version")
    private final int version = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "parentCollection")
    private final java.lang.String parentCollection = null;
    @androidx.room.ColumnInfo(name = "group")
    private final int groupParent = 0;
    public static final int NO_GROUP_ID = -1;
    public static final com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection.Companion Companion = null;
    
    public final boolean hasParent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParent() {
        return null;
    }
    
    public final boolean hasChildren() {
        return false;
    }
    
    public final void addSubCollection(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection collection) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Collection> getSubCollections() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParentCollection() {
        return null;
    }
    
    public final int getGroupParent() {
        return 0;
    }
    
    public Collection(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int version, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String parentCollection, int groupParent) {
        super();
    }
    
    public Collection(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionPOJO collectionPOJO, int groupID) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Collection$Companion;", "", "()V", "NO_GROUP_ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}