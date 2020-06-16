package com.mickstarify.zooforzotero.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/mickstarify/zooforzotero/di/component/ApplicationComponent;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "inject", "", "attachmentManagerModel", "Lcom/mickstarify/zooforzotero/AttachmentManager/AttachmentManagerModel;", "libraryActivityModel", "Lcom/mickstarify/zooforzotero/LibraryActivity/LibraryActivityModel;", "settingsActivity", "Lcom/mickstarify/zooforzotero/SettingsActivity;", "attachmentStorageManager", "Lcom/mickstarify/zooforzotero/ZoteroStorage/AttachmentStorageManager;", "zoteroDB", "Lcom/mickstarify/zooforzotero/ZoteroStorage/ZoteroDB/ZoteroDB;", "app_debug"})
@dagger.Component(modules = {com.mickstarify.zooforzotero.di.module.ApplicationModule.class, com.mickstarify.zooforzotero.di.module.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.LibraryActivity.LibraryActivityModel libraryActivityModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SettingsActivity settingsActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.AttachmentManager.AttachmentManagerModel attachmentManagerModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.AttachmentStorageManager attachmentStorageManager);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.ZoteroStorage.ZoteroDB.ZoteroDB zoteroDB);
}