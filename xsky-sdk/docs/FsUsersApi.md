# FsUsersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFSUser**](FsUsersApi.md#createFSUser) | **POST** /v1/fs-users/ | 
[**deleteFSUser**](FsUsersApi.md#deleteFSUser) | **DELETE** /v1/fs-users/{fs_user_id} | 
[**getFSUser**](FsUsersApi.md#getFSUser) | **GET** /v1/fs-users/{fs_user_id} | 
[**listFSUsers**](FsUsersApi.md#listFSUsers) | **GET** /v1/fs-users/ | 
[**updateFSUser**](FsUsersApi.md#updateFSUser) | **PATCH** /v1/fs-users/{fs_user_id} | 
[**updateFSUserSecondaryGroups**](FsUsersApi.md#updateFSUserSecondaryGroups) | **PATCH** /v1/fs-users/{fs_user_id}/:update-secondary-groups | 
[**verifyFSUser**](FsUsersApi.md#verifyFSUser) | **POST** /v1/fs-users/:verify | 

<a name="createFSUser"></a>
# **createFSUser**
> FSUserResp createFSUser(body, clusterId, allowPathCreate)



create file storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
FSUserCreateReq body = new FSUserCreateReq(); // FSUserCreateReq | user info
String clusterId = "clusterId_example"; // String | cluster id
Boolean allowPathCreate = true; // Boolean | allow create path for s3 when not existed
try {
    FSUserResp result = apiInstance.createFSUser(body, clusterId, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#createFSUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserCreateReq**](FSUserCreateReq.md)| user info |
 **clusterId** | **String**| cluster id | [optional]
 **allowPathCreate** | **Boolean**| allow create path for s3 when not existed | [optional]

### Return type

[**FSUserResp**](FSUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFSUser"></a>
# **deleteFSUser**
> deleteFSUser(fsUserId)



delete file storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
Long fsUserId = 789L; // Long | user id
try {
    apiInstance.deleteFSUser(fsUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#deleteFSUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsUserId** | **Long**| user id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFSUser"></a>
# **getFSUser**
> FSUserResp getFSUser(fsUserId)



get file storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
Long fsUserId = 789L; // Long | user id
try {
    FSUserResp result = apiInstance.getFSUser(fsUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#getFSUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsUserId** | **Long**| user id |

### Return type

[**FSUserResp**](FSUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFSUsers"></a>
# **listFSUsers**
> FSUsersResp listFSUsers(limit, offset, q, sort, clusterId, security, fsUserGroupId, notFsUserGroupId, notDfsSmbShareId, notDfsHdfsId, notDfsFtpShare, dfsGatewayGroupId, s3Enabled, userId)



List file storage users

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
String security = "security_example"; // String | security of file storage users
Long fsUserGroupId = 789L; // Long | file storage user group id
Long notFsUserGroupId = 789L; // Long | file storage user group id
Long notDfsSmbShareId = 789L; // Long | id of dfs smb share users not in
Long notDfsHdfsId = 789L; // Long | id of dfs hdfs users not in
Boolean notDfsFtpShare = true; // Boolean | value must be true, means available add to ftp share
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id, used with not_dfs_ftp_share
Boolean s3Enabled = true; // Boolean | is s3 enabled
Long userId = 789L; // Long | user id
try {
    FSUsersResp result = apiInstance.listFSUsers(limit, offset, q, sort, clusterId, security, fsUserGroupId, notFsUserGroupId, notDfsSmbShareId, notDfsHdfsId, notDfsFtpShare, dfsGatewayGroupId, s3Enabled, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#listFSUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **security** | **String**| security of file storage users | [optional]
 **fsUserGroupId** | **Long**| file storage user group id | [optional]
 **notFsUserGroupId** | **Long**| file storage user group id | [optional]
 **notDfsSmbShareId** | **Long**| id of dfs smb share users not in | [optional]
 **notDfsHdfsId** | **Long**| id of dfs hdfs users not in | [optional]
 **notDfsFtpShare** | **Boolean**| value must be true, means available add to ftp share | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id, used with not_dfs_ftp_share | [optional]
 **s3Enabled** | **Boolean**| is s3 enabled | [optional]
 **userId** | **Long**| user id | [optional]

### Return type

[**FSUsersResp**](FSUsersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFSUser"></a>
# **updateFSUser**
> FSUserResp updateFSUser(body, fsUserId, allowPathCreate)



update file storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
FSUserUpdateReq body = new FSUserUpdateReq(); // FSUserUpdateReq | user info
Long fsUserId = 789L; // Long | user id
Boolean allowPathCreate = true; // Boolean | allow create path for s3 when not existed
try {
    FSUserResp result = apiInstance.updateFSUser(body, fsUserId, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#updateFSUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserUpdateReq**](FSUserUpdateReq.md)| user info |
 **fsUserId** | **Long**| user id |
 **allowPathCreate** | **Boolean**| allow create path for s3 when not existed | [optional]

### Return type

[**FSUserResp**](FSUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFSUserSecondaryGroups"></a>
# **updateFSUserSecondaryGroups**
> FSUserResp updateFSUserSecondaryGroups(body, fsUserId)



update file storage user secondary group and primary group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
FSUserUpdateSecondaryGroupsReq body = new FSUserUpdateSecondaryGroupsReq(); // FSUserUpdateSecondaryGroupsReq | user info
Long fsUserId = 789L; // Long | user id
try {
    FSUserResp result = apiInstance.updateFSUserSecondaryGroups(body, fsUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#updateFSUserSecondaryGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserUpdateSecondaryGroupsReq**](FSUserUpdateSecondaryGroupsReq.md)| user info |
 **fsUserId** | **Long**| user id |

### Return type

[**FSUserResp**](FSUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyFSUser"></a>
# **verifyFSUser**
> FSUserResp verifyFSUser(body)



verify fs user password

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: tokenInHeader
ApiKeyAuth tokenInHeader = (ApiKeyAuth) defaultClient.getAuthentication("tokenInHeader");
tokenInHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInHeader.setApiKeyPrefix("Token");

// Configure API key authorization: tokenInQuery
ApiKeyAuth tokenInQuery = (ApiKeyAuth) defaultClient.getAuthentication("tokenInQuery");
tokenInQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenInQuery.setApiKeyPrefix("Token");

FsUsersApi apiInstance = new FsUsersApi();
FSUserVerifyReq body = new FSUserVerifyReq(); // FSUserVerifyReq | the identity credential
try {
    FSUserResp result = apiInstance.verifyFSUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUsersApi#verifyFSUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserVerifyReq**](FSUserVerifyReq.md)| the identity credential |

### Return type

[**FSUserResp**](FSUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

