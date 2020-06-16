package com.mickstarify.zooforzotero.SyncSetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract;", "", "Model", "Presenter", "View", "app_debug"})
public abstract interface SyncSetupContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$View;", "", "createAPIKeyDialog", "", "onKeySubmit", "Lkotlin/Function1;", "", "createAlertDialog", "title", "message", "createUnsupportedAlert", "initUI", "showHowToZoteroSyncDialog", "onProceed", "Lkotlin/Function0;", "startZoteroAPIActivity", "app_debug"})
    public static abstract interface View {
        
        public abstract void initUI();
        
        public abstract void createUnsupportedAlert();
        
        public abstract void startZoteroAPIActivity();
        
        public abstract void showHowToZoteroSyncDialog(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onProceed);
        
        public abstract void createAPIKeyDialog(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onKeySubmit);
        
        public abstract void createAlertDialog(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$Presenter;", "", "createNetworkError", "", "message", "", "hasSyncSetup", "", "selectSyncSetup", "option", "Lcom/mickstarify/zooforzotero/SyncSetup/SyncOption;", "startZoteroAPISetup", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void selectSyncSetup(@org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.SyncSetup.SyncOption option);
        
        public abstract void startZoteroAPISetup();
        
        public abstract boolean hasSyncSetup();
        
        public abstract void createNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/SyncSetupContract$Model;", "", "hasSyncSetup", "", "setupZoteroAPI", "", "testAPIKey", "apiKey", "", "app_debug"})
    public static abstract interface Model {
        
        public abstract void setupZoteroAPI();
        
        public abstract boolean hasSyncSetup();
        
        public abstract void testAPIKey(@org.jetbrains.annotations.NotNull()
        java.lang.String apiKey);
    }
}