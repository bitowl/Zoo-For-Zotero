package com.mickstarify.zooforzotero.ZoteroAPI.Model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionPOJO;", "", "key", "", "version", "", "collectionData", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionData;", "(Ljava/lang/String;ILcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionData;)V", "getCollectionData", "()Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionData;", "getKey", "()Ljava/lang/String;", "getVersion", "()I", "getName", "getParent", "hasParent", "", "app_debug"})
public final class CollectionPOJO {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "key")
    private final java.lang.String key = null;
    @com.google.gson.annotations.SerializedName(value = "version")
    private final int version = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionData collectionData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean hasParent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParent() {
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
    public final com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionData getCollectionData() {
        return null;
    }
    
    public CollectionPOJO(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int version, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionData collectionData) {
        super();
    }
}