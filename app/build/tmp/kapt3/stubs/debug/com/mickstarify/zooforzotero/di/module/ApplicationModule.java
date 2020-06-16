package com.mickstarify.zooforzotero.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/mickstarify/zooforzotero/di/module/ApplicationModule;", "", "app", "Lcom/mickstarify/zooforzotero/ZooForZoteroApplication;", "(Lcom/mickstarify/zooforzotero/ZooForZoteroApplication;)V", "getApp", "()Lcom/mickstarify/zooforzotero/ZooForZoteroApplication;", "provideContext", "Landroid/content/Context;", "providePreferenceManager", "Lcom/mickstarify/zooforzotero/PreferenceManager;", "context", "providesAttachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "preferenceManager", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.ZooForZoteroApplication app = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager providesAttachmentStorageManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.PreferenceManager preferenceManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.mickstarify.zooforzotero.PreferenceManager providePreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.ZooForZoteroApplication getApp() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZooForZoteroApplication app) {
        super();
    }
}