package com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract;", "", "Model", "Presenter", "View", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$View;", "", "loadURL", "", "url", "", "makeErrorAlert", "title", "message", "openLibraryView", "startLoadingAnimation", "stopLoadingAnimation", "app_debug"})
    public static abstract interface View {
        
        public abstract void loadURL(@org.jetbrains.annotations.NotNull()
        java.lang.String url);
        
        public abstract void makeErrorAlert(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message);
        
        public abstract void startLoadingAnimation();
        
        public abstract void stopLoadingAnimation();
        
        public abstract void openLibraryView();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;", "", "handleOAuthCallback", "", "uri", "Landroid/net/Uri;", "loadAuthorizationURL", "authorizationURL", "", "openLibraryView", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void loadAuthorizationURL(@org.jetbrains.annotations.NotNull()
        java.lang.String authorizationURL);
        
        public abstract void handleOAuthCallback(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri);
        
        public abstract void openLibraryView();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Model;", "", "establishAPIConnection", "", "handleOAuthCallback", "oauth_token", "", "oauth_verifier", "authenticationStorage", "Lcom/mickstarify/zooforzotero/SyncSetup/AuthenticationStorage;", "app_debug"})
    public static abstract interface Model {
        
        public abstract void establishAPIConnection();
        
        public abstract void handleOAuthCallback(@org.jetbrains.annotations.NotNull()
        java.lang.String oauth_token, @org.jetbrains.annotations.NotNull()
        java.lang.String oauth_verifier, @org.jetbrains.annotations.NotNull()
        com.mickstarify.zooforzotero.SyncSetup.AuthenticationStorage authenticationStorage);
    }
}