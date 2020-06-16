package com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/ZoteroAPISetupModel;", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Model;", "presenter", "Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;", "(Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;)V", "ACCESS_TOKEN_ENDPOINT", "", "API_URL", "OAuthConsumer", "Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;", "getOAuthConsumer", "()Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;", "OAuthProvider", "Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;", "getOAuthProvider", "()Loauth/signpost/commonshttp/CommonsHttpOAuthProvider;", "REQUEST_TOKEN_ENDPOINT", "ZOTERO_AUTHORIZE_ENDPOINT", "client_key", "client_secret", "getPresenter", "()Lcom/mickstarify/zooforzotero/SyncSetup/ZoteroAPISetup/Contract$Presenter;", "establishAPIConnection", "", "handleOAuthCallback", "oauth_token", "oauth_verifier", "authenticationStorage", "Lcom/mickstarify/zooforzotero/SyncSetup/AuthenticationStorage;", "app_debug"})
public final class ZoteroAPISetupModel implements com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Model {
    private final java.lang.String API_URL = "https://api.zotero.org";
    private final java.lang.String REQUEST_TOKEN_ENDPOINT = "https://www.zotero.org/oauth/request?library_access=1&notes_access=1&write_access=1&all_groups=write";
    private final java.lang.String ACCESS_TOKEN_ENDPOINT = "https://www.zotero.org/oauth/access?library_access=1&notes_access=1&write_access=1&all_groups=write";
    private final java.lang.String ZOTERO_AUTHORIZE_ENDPOINT = "https://www.zotero.org/oauth/authorize?library_access=1&notes_access=1&write_access=1&all_groups=write";
    private final java.lang.String client_key = "";
    private final java.lang.String client_secret = "";
    @org.jetbrains.annotations.NotNull()
    private final oauth.signpost.commonshttp.CommonsHttpOAuthProvider OAuthProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final oauth.signpost.commonshttp.CommonsHttpOAuthConsumer OAuthConsumer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Presenter presenter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final oauth.signpost.commonshttp.CommonsHttpOAuthProvider getOAuthProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final oauth.signpost.commonshttp.CommonsHttpOAuthConsumer getOAuthConsumer() {
        return null;
    }
    
    @java.lang.Override()
    public void establishAPIConnection() {
    }
    
    @java.lang.Override()
    public void handleOAuthCallback(@org.jetbrains.annotations.NotNull()
    java.lang.String oauth_token, @org.jetbrains.annotations.NotNull()
    java.lang.String oauth_verifier, @org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.AuthenticationStorage authenticationStorage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Presenter getPresenter() {
        return null;
    }
    
    public ZoteroAPISetupModel(@org.jetbrains.annotations.NotNull()
    com.mickstarify.zooforzotero.SyncSetup.ZoteroAPISetup.Contract.Presenter presenter) {
        super();
    }
}