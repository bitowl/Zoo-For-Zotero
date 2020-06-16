package com.mickstarify.zooforzotero.ZoteroStorage.Database;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(tableName = "ItemCreator", primaryKeys = {"parent", "firstName", "lastName"}, foreignKeys = {@androidx.room.ForeignKey(entity = com.mickstarify.zooforzotero.ZoteroStorage.Database.ItemInfo.class, childColumns = {"parent"}, onDelete = 5, parentColumns = {"itemKey"})})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\bH\u00d6\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Creator;", "Landroid/os/Parcelable;", "parent", "", "firstName", "lastName", "creatorType", "order", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCreatorType", "()Ljava/lang/String;", "getFirstName", "getLastName", "getOrder", "()I", "getParent", "describeContents", "makeString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Creator implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "parent")
    private final java.lang.String parent = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "firstName")
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "lastName")
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "creatorType")
    private final java.lang.String creatorType = null;
    @androidx.room.ColumnInfo(name = "order")
    private final int order = 0;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String makeString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatorType() {
        return null;
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public Creator(@org.jetbrains.annotations.NotNull()
    java.lang.String parent, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String creatorType, int order) {
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
}