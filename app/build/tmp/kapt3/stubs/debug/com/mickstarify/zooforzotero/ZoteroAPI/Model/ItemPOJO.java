package com.mickstarify.zooforzotero.ZoteroAPI.Model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010/\u001a\u00020\u0003J\u0006\u00100\u001a\u00020\u0003J\u0006\u00101\u001a\u00020\u0003J\u0010\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\u0003J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0003J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010+R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001f\u00a8\u0006="}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/ItemPOJO;", "Landroid/os/Parcelable;", "ItemKey", "", "version", "", "data", "", "tags", "", "creators", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CreatorPOJO;", "collections", "mtime", "", "deleted", "(Ljava/lang/String;ILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;DI)V", "getItemKey", "()Ljava/lang/String;", "setItemKey", "(Ljava/lang/String;)V", "getCollections", "()Ljava/util/List;", "getCreators", "getData", "()Ljava/util/Map;", "setData", "(Ljava/util/Map;)V", "getDeleted", "()I", "setDeleted", "(I)V", "localMd5", "localMd5$annotations", "()V", "getLocalMd5", "setLocalMd5", "getMtime", "()D", "setMtime", "(D)V", "getTags", "setTags", "(Ljava/util/List;)V", "getVersion", "setVersion", "describeContents", "getItemType", "getSortableDateAddedString", "getSortableDateString", "getValue", "", "key", "query", "", "queryText", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public class ItemPOJO implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String localMd5;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ItemKey")
    private java.lang.String ItemKey;
    @com.google.gson.annotations.SerializedName(value = "version")
    private int version;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.Map<java.lang.String, java.lang.String> data;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "tags")
    private java.util.List<java.lang.String> tags;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CreatorPOJO> creators = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> collections = null;
    private double mtime;
    private int deleted;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    public static void localMd5$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalMd5() {
        return null;
    }
    
    public final void setLocalMd5(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemType() {
        return null;
    }
    
    public final boolean query(@org.jetbrains.annotations.NotNull()
    java.lang.String queryText) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortableDateString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSortableDateAddedString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemKey() {
        return null;
    }
    
    public final void setItemKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getVersion() {
        return 0;
    }
    
    public final void setVersion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CreatorPOJO> getCreators() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCollections() {
        return null;
    }
    
    public final double getMtime() {
        return 0.0;
    }
    
    public final void setMtime(double p0) {
    }
    
    public final int getDeleted() {
        return 0;
    }
    
    public final void setDeleted(int p0) {
    }
    
    public ItemPOJO(@org.jetbrains.annotations.NotNull()
    java.lang.String ItemKey, int version, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> data, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CreatorPOJO> creators, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> collections, double mtime, int deleted) {
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
}