package com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/ZoteroAPISetupPresenter;", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;", "view", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$View;", "authenticationStorage", "Lcom/mickstarify/zooforzotero/SyncSetup/AuthenticationStorage;", "(Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$View;Lcom/mickstarify/zooforzotero/SyncSetup/AuthenticationStorage;)V", "getAuthenticationStorage", "()Lcom/mickstarify/zooforzotero/SyncSetup/AuthenticationStorage;", "model", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/ZoteroAPISetupModel;", "getView", "()Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$View;", "handleOAuthCallback", "", "uri", "Landroid/net/Uri;", "loadAuthorizationURL", "authorizationURL", "", "openLibraryView", "app_debug"})
public final class ZoteroAPISetupPresenter implements com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Presenter {
    private final com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.ZoteroAPISetupModel model = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.View view = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.SyncSetup.AuthenticationStorage authenticationStorage = null;
    
    @java.lang.Override()
    public void openLibraryView() {
    }
    
    @java.lang.Override()
    public void handleOAuthCallback(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void loadAuthorizationURL(@org.jetbrains.annotations.NotNull()
    java.lang.String authorizationURL) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SyncSetup.AuthenticationStorage getAuthenticationStorage() {
        return null;
    }
    
    public ZoteroAPISetupPresenter(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.View view, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.AuthenticationStorage authenticationStorage) {
        super();
    }
}