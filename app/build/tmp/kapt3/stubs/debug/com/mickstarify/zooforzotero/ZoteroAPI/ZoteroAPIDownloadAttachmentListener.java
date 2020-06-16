package com.mickstarify.zooforzotero.ZoteroAPI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPIDownloadAttachmentListener;", "", "onComplete", "", "onFailure", "message", "", "onNetworkFailure", "onProgressUpdate", "progress", "", "total", "receiveMetadata", "mtime", "metadataHash", "receiveTask", "task", "Ljava/util/concurrent/Future;", "app_debug"})
public abstract interface ZoteroAPIDownloadAttachmentListener {
    
    public abstract void onProgressUpdate(long progress, long total);
    
    public abstract void onNetworkFailure();
    
    public abstract void onComplete();
    
    public abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void receiveTask(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.Future<kotlin.Unit> task);
    
    public abstract void receiveMetadata(long mtime, @org.jetbrains.annotations.NotNull()
    java.lang.String metadataHash);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}