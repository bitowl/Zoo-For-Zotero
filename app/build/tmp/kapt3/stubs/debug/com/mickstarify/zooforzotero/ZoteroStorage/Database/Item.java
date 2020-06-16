package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001IB\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020/J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0005J\u0006\u00104\u001a\u00020\u0005J\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020\u0005J\u0006\u00108\u001a\u00020\u0005J\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010;\u001a\u00020\u0005J\u0006\u0010<\u001a\u00020/J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020>J\u000e\u0010@\u001a\u00020>2\u0006\u0010A\u001a\u00020\u0005J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0002J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020/H\u00d6\u0001R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR-\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b#\u0010!R2\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0002\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010)R$\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\t\u00a8\u0006J"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "Landroid/os/Parcelable;", "()V", "collections", "", "", "getCollections", "()Ljava/util/List;", "setCollections", "(Ljava/util/List;)V", "creators", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Creator;", "getCreators", "setCreators", "data", "", "data$annotations", "getData", "()Ljava/util/Map;", "data$delegate", "Lkotlin/Lazy;", "itemData", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemData;", "getItemData", "setItemData", "itemInfo", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemInfo;", "getItemInfo", "()Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemInfo;", "setItemInfo", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemInfo;)V", "itemKey", "getItemKey", "()Ljava/lang/String;", "itemType", "getItemType", "mappedData", "", "mappedData$annotations", "getMappedData", "setMappedData", "(Ljava/util/Map;)V", "tags", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/ItemTag;", "getTags", "setTags", "describeContents", "", "getAuthor", "getFileExtension", "getGroup", "key", "getMd5Key", "getMtime", "", "getSortableDateAddedString", "getSortableDateString", "getSortedCreators", "getTagList", "getTitle", "getVersion", "hasParent", "", "isDownloadable", "query", "queryText", "stripHtml", "html", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class Item implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    public com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo itemInfo;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData.class, parentColumn = "itemKey", entityColumn = "parent")
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> itemData;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator.class, parentColumn = "itemKey", entityColumn = "parent")
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> creators;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag.class, parentColumn = "itemKey", entityColumn = "parent")
    public java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> tags;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Relation(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemCollection.class, parentColumn = "itemKey", entityColumn = "itemKey", projection = {"collectionKey"})
    public java.util.List<java.lang.String> collections;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Ignore()
    private java.util.Map<java.lang.String, java.lang.String> mappedData;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final kotlin.Lazy data$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ATTACHMENT_TYPE = "attachment";
    public static final com.mickstarify.zooforzotero.ZoteroStorage.Database.Item.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo getItemInfo() {
        return null;
    }
    
    public final void setItemInfo(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> getItemData() {
        return null;
    }
    
    public final void setItemData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> getCreators() {
        return null;
    }
    
    public final void setCreators(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemTag> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCollections() {
        return null;
    }
    
    public final void setCollections(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final int getGroup() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroStorage.Database.Creator> getSortedCreators() {
        return null;
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemData(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemType() {
        return null;
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    public static void mappedData$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getMappedData() {
        return null;
    }
    
    public final void setMappedData(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    public static void data$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }
    
    private final java.lang.String stripHtml(java.lang.String html) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortableDateString() {
        return null;
    }
    
    public final boolean query(@org.jetbrains.annotations.NotNull()
    java.lang.String queryText) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortableDateAddedString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMd5Key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTagList() {
        return null;
    }
    
    public final boolean hasParent() {
        return false;
    }
    
    public final long getMtime() {
        return 0L;
    }
    
    public final boolean isDownloadable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileExtension() {
        return null;
    }
    
    public Item() {
        super();
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item$Companion;", "", "()V", "ATTACHMENT_TYPE", "", "getATTACHMENT_TYPE", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getATTACHMENT_TYPE() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}