package com.mickstarify.zooforzotero.ZoteroAPI.Model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rB\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020\u001fH\u0016J\u0006\u0010)\u001a\u00020\'J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u001fH\u0016R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006."}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "item", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/ItemPOJO;", "(Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/ItemPOJO;)V", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "note", "", "parent", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "key", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getNote", "setNote", "getParent", "setParent", "tags", "", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "version", "", "getVersion", "()I", "setVersion", "(I)V", "asJsonArray", "Lcom/google/gson/JsonArray;", "asJsonObject", "Lcom/google/gson/JsonObject;", "describeContents", "getJsonNotePatch", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class Note implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String parent;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String key;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String note;
    private int version;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> tags;
    public static final com.mickstarify.zooforzotero.ZoteroAPI.Model.Note.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParent() {
        return null;
    }
    
    public final void setParent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    public final void setKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getVersion() {
        return 0;
    }
    
    public final void setVersion(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject getJsonNotePatch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject asJsonObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonArray asJsonArray() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public Note() {
        super();
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroAPI.Model.ItemPOJO item) {
        super();
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        super();
    }
    
    public Note(@org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String parent) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/Note;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.mickstarify.zooforzotero.ZoteroAPI.Model.Note> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.mickstarify.zooforzotero.ZoteroAPI.Model.Note createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.mickstarify.zooforzotero.ZoteroAPI.Model.Note[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}