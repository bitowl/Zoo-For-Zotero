package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(tableName = "AttachmentInfo", primaryKeys = {"itemKey", "group"}, foreignKeys = {@androidx.room.ForeignKey(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo.class, childColumns = {"itemKey"}, onDelete = 5, parentColumns = {"itemKey"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfo;", "Landroid/os/Parcelable;", "itemKey", "", "groupParent", "", "md5Key", "mtime", "", "downloadedFrom", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;)V", "getDownloadedFrom", "()Ljava/lang/String;", "getGroupParent", "()I", "getItemKey", "getMd5Key", "getMtime", "()J", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class AttachmentInfo implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "itemKey")
    private final java.lang.String itemKey = null;
    @androidx.room.ColumnInfo(name = "group")
    private final int groupParent = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "md5Key")
    private final java.lang.String md5Key = null;
    @androidx.room.ColumnInfo(name = "mtime")
    private final long mtime = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "downloadedFrom")
    private final java.lang.String downloadedFrom = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNSET = "UNSET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEBDAV = "WEBDAV";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZOTEROAPI = "ZOTERO_API";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCALSYNC = "LOCAL_SYNC";
    public static final com.mickstarify.zooforzotero.ZoteroStorage.Database.AttachmentInfo.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemKey() {
        return null;
    }
    
    public final int getGroupParent() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMd5Key() {
        return null;
    }
    
    public final long getMtime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDownloadedFrom() {
        return null;
    }
    
    public AttachmentInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String itemKey, int groupParent, @org.jetbrains.annotations.NotNull()
    java.lang.String md5Key, long mtime, @org.jetbrains.annotations.NotNull()
    java.lang.String downloadedFrom) {
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
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/AttachmentInfo$Companion;", "", "()V", "LOCALSYNC", "", "UNSET", "WEBDAV", "ZOTEROAPI", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}