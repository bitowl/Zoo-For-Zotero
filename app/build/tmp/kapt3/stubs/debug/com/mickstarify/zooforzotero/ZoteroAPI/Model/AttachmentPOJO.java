package com.mickstarify.zooforzotero.ZoteroAPI.Model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u0006\u0010+\u001a\u00020,R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000eR\u001a\u0010(\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000e\u00a8\u0006."}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/AttachmentPOJO;", "", "item", "Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;", "(Lcom/mickstarify/zooforzotero/ZoteroStorage/Database/Item;)V", "title", "", "filename", "parent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "accessDate", "getAccessDate", "()Ljava/lang/String;", "setAccessDate", "(Ljava/lang/String;)V", "contentType", "getContentType", "setContentType", "getFilename", "setFilename", "itemKey", "getItemKey", "setItemKey", "itemType", "getItemType", "setItemType", "linkMode", "getLinkMode", "setLinkMode", "md5", "getMd5", "setMd5", "note", "getNote", "setNote", "parentItem", "getParentItem", "setParentItem", "getTitle", "setTitle", "url", "getUrl", "setUrl", "asNewJsonTemplate", "Lcom/google/gson/JsonArray;", "Companion", "app_debug"})
public final class AttachmentPOJO {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String itemKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String parentItem;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String itemType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String linkMode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String filename;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String contentType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String md5;
    public static final com.mickstarify.zooforzotero.ZoteroAPI.Model.AttachmentPOJO.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemKey() {
        return null;
    }
    
    public final void setItemKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParentItem() {
        return null;
    }
    
    public final void setParentItem(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItemType() {
        return null;
    }
    
    public final void setItemType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLinkMode() {
        return null;
    }
    
    public final void setLinkMode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilename() {
        return null;
    }
    
    public final void setFilename(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getContentType() {
        return null;
    }
    
    public final void setContentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessDate() {
        return null;
    }
    
    public final void setAccessDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMd5() {
        return null;
    }
    
    public final void setMd5(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonArray asNewJsonTemplate() {
        return null;
    }
    
    public AttachmentPOJO(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.Database.Item item) {
        super();
    }
    
    public AttachmentPOJO(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    java.lang.String parent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.gson.JsonArray getNewAttachmentTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String filename, @org.jetbrains.annotations.NotNull()
    java.lang.String parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/AttachmentPOJO$Companion;", "", "()V", "getNewAttachmentTemplate", "Lcom/google/gson/JsonArray;", "title", "", "filename", "parent", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.gson.JsonArray getNewAttachmentTemplate(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String filename, @org.jetbrains.annotations.NotNull()
        java.lang.String parent) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}