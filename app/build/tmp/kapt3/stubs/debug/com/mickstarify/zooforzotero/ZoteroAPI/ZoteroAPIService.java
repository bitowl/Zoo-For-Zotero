package com.mickstarify.zooforzotero.ZoteroAPI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J8\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J8\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\tH\'J(\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000e0\f2\b\b\u0001\u0010\u001c\u001a\u00020\u0006H\'J2\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J2\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J<\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J<\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010$\u001a\u00020\u0006H\'J<\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J<\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH\'J<\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020)2\b\b\u0001\u0010\b\u001a\u00020\tH\'JF\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u0006H\'Jn\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010/\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u0002022\b\b\u0001\u00103\u001a\u0002022\b\b\u0003\u00104\u001a\u00020\t2\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u0006H\'J(\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u00107\u001a\u00020\u00062\b\b\u0001\u00108\u001a\u000209H\'J\u008c\u0001\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u00107\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u0002092\b\b\u0001\u0010;\u001a\u0002092\b\b\u0001\u0010<\u001a\u0002092\b\b\u0001\u0010=\u001a\u0002092\b\b\u0001\u0010>\u001a\u0002092\b\b\u0001\u0010?\u001a\u0002092\b\b\u0001\u0010@\u001a\u0002092\b\b\u0001\u0010A\u001a\u0002092\b\b\u0001\u0010B\u001a\u0002092\b\b\u0001\u0010C\u001a\u0002092\b\b\u0001\u0010D\u001a\u000209H\'J(\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020FH\'J\"\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020FH\'\u00a8\u0006H"}, d2 = {"Lcom/mickstarify/zooforzotero/ZoteroAPI/ZoteroAPIService;", "", "deleteItem", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "user", "", "itemKey", "ifUnmodifiedSinceVersion", "", "getAttachmentFileFromGroup", "getCollections", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/CollectionPOJO;", "ifModifiedSinceVersion", "index", "getCollectionsForGroup", "groupID", "getDeletedEntriesSince", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/DeletedEntriesPojo;", "since", "getFileForGroup", "group", "getFileForUser", "getGroupInfo", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/GroupPojo;", "userID", "getItems", "getItemsForGroup", "getItemsForGroupSince", "modificationSinceVersion", "getItemsSince", "getKeyInfo", "Lcom/mickstarify/zooforzotero/ZoteroAPI/Model/KeyInfo;", "key", "getTrashedItemsForGroup", "getTrashedItemsForUser", "patchItem", "json", "Lcom/google/gson/JsonObject;", "registerUpload", "uploadKey", "body", "oldMd5Key", "uploadAttachmentAuthorization", "md5", "filename", "filesize", "", "mtime", "params", "bodyText", "uploadAttachmentToAmazon", "url", "data", "Lokhttp3/RequestBody;", "uploadAttachmentToAmazonMulti", "acl", "content_MD5", "success_action_status", "policy", "x_amz_algorithm", "x_amz_credential", "x_amz_date", "x_amz_signature", "x_amz_security_token", "attachmentData", "uploadNote", "Lcom/google/gson/JsonArray;", "writeItem", "app_debug"})
public abstract interface ZoteroAPIService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/items")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getItems(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/items")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getItemsSince(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @retrofit2.http.Query(value = "since")
    int modificationSinceVersion, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/groups")
    public abstract io.reactivex.Observable<java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.GroupPojo>> getGroupInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String userID);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{groupID}/items")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getItemsForGroup(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @retrofit2.http.Path(value = "groupID")
    int groupID, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{groupID}/items")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getItemsForGroupSince(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @retrofit2.http.Path(value = "groupID")
    int groupID, @retrofit2.http.Query(value = "since")
    int modificationSinceVersion, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{groupID}/collections")
    public abstract io.reactivex.Observable<retrofit2.Response<java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionPOJO>>> getCollectionsForGroup(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @retrofit2.http.Path(value = "groupID")
    int groupID, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{groupID}/items/{itemKey}/file")
    @retrofit2.http.Streaming()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getAttachmentFileFromGroup(@retrofit2.http.Path(value = "groupID")
    int user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "keys/{key}")
    public abstract retrofit2.Call<com.mickstarify.zooforzotero.ZoteroAPI.Model.KeyInfo> getKeyInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "key")
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/deleted")
    public abstract io.reactivex.Observable<retrofit2.Response<com.mickstarify.zooforzotero.ZoteroAPI.Model.DeletedEntriesPojo>> getDeletedEntriesSince(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @retrofit2.http.Query(value = "since")
    int since);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/items/trash")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getTrashedItemsForUser(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @retrofit2.http.Query(value = "since")
    int since, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{groupID}/items/trash")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getTrashedItemsForGroup(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @retrofit2.http.Path(value = "groupID")
    int groupID, @retrofit2.http.Query(value = "since")
    int since, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/collections")
    public abstract io.reactivex.Observable<retrofit2.Response<java.util.List<com.mickstarify.zooforzotero.ZoteroAPI.Model.CollectionPOJO>>> getCollections(@retrofit2.http.Header(value = "If-Modified-Since-Version")
    int ifModifiedSinceVersion, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @retrofit2.http.Query(value = "start")
    int index);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/items/{itemKey}/file")
    @retrofit2.http.Streaming()
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getFileForUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "groups/{group}/items/{itemKey}/file")
    @retrofit2.http.Streaming()
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> getFileForGroup(@retrofit2.http.Path(value = "group")
    int group, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/{user}/items")
    public abstract retrofit2.Call<okhttp3.ResponseBody> writeItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonArray json);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/{user}/items")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> uploadNote(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonArray json);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PATCH(value = "users/{user}/items/{itemKey}")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> patchItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.google.gson.JsonObject json, @retrofit2.http.Header(value = "If-Unmodified-Since-Version")
    int ifUnmodifiedSinceVersion);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "users/{user}/items/{itemKey}")
    public abstract retrofit2.Call<okhttp3.ResponseBody> deleteItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey, @retrofit2.http.Header(value = "If-Unmodified-Since-Version")
    int ifUnmodifiedSinceVersion);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/{user}/items/{itemKey}/file")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> uploadAttachmentAuthorization(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "md5")
    java.lang.String md5, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filename")
    java.lang.String filename, @retrofit2.http.Query(value = "filesize")
    long filesize, @retrofit2.http.Query(value = "mtime")
    long mtime, @retrofit2.http.Query(value = "params")
    int params, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.lang.String bodyText, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "If-Match")
    java.lang.String oldMd5Key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "users/{user}/items/{itemKey}/file")
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> registerUpload(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "itemKey")
    java.lang.String itemKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "upload")
    java.lang.String uploadKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "If-Match")
    java.lang.String oldMd5Key);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST()
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> uploadAttachmentToAmazon(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody data);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST()
    @retrofit2.http.Multipart()
    public abstract io.reactivex.Observable<retrofit2.Response<okhttp3.ResponseBody>> uploadAttachmentToAmazonMulti(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "key")
    okhttp3.RequestBody key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "acl")
    okhttp3.RequestBody acl, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "Content-MD5")
    okhttp3.RequestBody content_MD5, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "success_action_status")
    okhttp3.RequestBody success_action_status, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "policy")
    okhttp3.RequestBody policy, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "x-amz-algorithm")
    okhttp3.RequestBody x_amz_algorithm, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "x-amz-credential")
    okhttp3.RequestBody x_amz_credential, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "x-amz-date")
    okhttp3.RequestBody x_amz_date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "x-amz-signature")
    okhttp3.RequestBody x_amz_signature, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "x-amz-security-token")
    okhttp3.RequestBody x_amz_security_token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "file")
    okhttp3.RequestBody attachmentData);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}