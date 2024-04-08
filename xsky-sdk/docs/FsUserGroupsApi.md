# FsUserGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFSUsers**](FsUserGroupsApi.md#addFSUsers) | **PUT** /v1/fs-user-groups/{fs_user_group_id}/fs-users | 
[**createFSUserGroup**](FsUserGroupsApi.md#createFSUserGroup) | **POST** /v1/fs-user-groups/ | 
[**deleteFSUserGroup**](FsUserGroupsApi.md#deleteFSUserGroup) | **DELETE** /v1/fs-user-groups/{fs_user_group_id} | 
[**getFSUserGroup**](FsUserGroupsApi.md#getFSUserGroup) | **GET** /v1/fs-user-groups/{fs_user_group_id} | 
[**listFSUserGroups**](FsUserGroupsApi.md#listFSUserGroups) | **GET** /v1/fs-user-groups/ | 
[**removeFSUsers**](FsUserGroupsApi.md#removeFSUsers) | **DELETE** /v1/fs-user-groups/{fs_user_group_id}/fs-users | 
[**updateFSUserGroup**](FsUserGroupsApi.md#updateFSUserGroup) | **PATCH** /v1/fs-user-groups/{fs_user_group_id} | 

<a name="addFSUsers"></a>
# **addFSUsers**
> FSUserGroupResp addFSUsers(body, fsUserGroupId)



add users to file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
FSUserGroupAddUsersReq body = new FSUserGroupAddUsersReq(); // FSUserGroupAddUsersReq | users info
Long fsUserGroupId = 789L; // Long | user group id
try {
    FSUserGroupResp result = apiInstance.addFSUsers(body, fsUserGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#addFSUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserGroupAddUsersReq**](FSUserGroupAddUsersReq.md)| users info |
 **fsUserGroupId** | **Long**| user group id |

### Return type

[**FSUserGroupResp**](FSUserGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFSUserGroup"></a>
# **createFSUserGroup**
> FSUserGroupResp createFSUserGroup(body, clusterId)



Create file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
FSUserGroupCreateReq body = new FSUserGroupCreateReq(); // FSUserGroupCreateReq | user group info
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSUserGroupResp result = apiInstance.createFSUserGroup(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#createFSUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserGroupCreateReq**](FSUserGroupCreateReq.md)| user group info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSUserGroupResp**](FSUserGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFSUserGroup"></a>
# **deleteFSUserGroup**
> deleteFSUserGroup(fsUserGroupId)



delete file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
Long fsUserGroupId = 789L; // Long | user group id
try {
    apiInstance.deleteFSUserGroup(fsUserGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#deleteFSUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsUserGroupId** | **Long**| user group id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFSUserGroup"></a>
# **getFSUserGroup**
> FSUserGroupResp getFSUserGroup(fsUserGroupId)



Get file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
Long fsUserGroupId = 789L; // Long | user group id
try {
    FSUserGroupResp result = apiInstance.getFSUserGroup(fsUserGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#getFSUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsUserGroupId** | **Long**| user group id |

### Return type

[**FSUserGroupResp**](FSUserGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFSUserGroups"></a>
# **listFSUserGroups**
> FSUserGroupsResp listFSUserGroups(limit, offset, q, sort, clusterId, type, fsUserId, notDfsHdfsId, notDfsSmbShareId)



List file storage user groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
String type = "type_example"; // String | security type of file storage user group
Long fsUserId = 789L; // Long | file storage user id
Long notDfsHdfsId = 789L; // Long | id of dfs hdfs user groups not in
Long notDfsSmbShareId = 789L; // Long | id of dfs smb share user groups not in
try {
    FSUserGroupsResp result = apiInstance.listFSUserGroups(limit, offset, q, sort, clusterId, type, fsUserId, notDfsHdfsId, notDfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#listFSUserGroups");
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
 **type** | **String**| security type of file storage user group | [optional]
 **fsUserId** | **Long**| file storage user id | [optional]
 **notDfsHdfsId** | **Long**| id of dfs hdfs user groups not in | [optional]
 **notDfsSmbShareId** | **Long**| id of dfs smb share user groups not in | [optional]

### Return type

[**FSUserGroupsResp**](FSUserGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFSUsers"></a>
# **removeFSUsers**
> FSUserGroupResp removeFSUsers(body, fsUserGroupId)



remove users from file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
FSUserGroupRemoveUsersReq body = new FSUserGroupRemoveUsersReq(); // FSUserGroupRemoveUsersReq | users info
Long fsUserGroupId = 789L; // Long | user group id
try {
    FSUserGroupResp result = apiInstance.removeFSUsers(body, fsUserGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#removeFSUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserGroupRemoveUsersReq**](FSUserGroupRemoveUsersReq.md)| users info |
 **fsUserGroupId** | **Long**| user group id |

### Return type

[**FSUserGroupResp**](FSUserGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFSUserGroup"></a>
# **updateFSUserGroup**
> FSUserGroupResp updateFSUserGroup(body, fsUserGroupId)



Update file storage user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsUserGroupsApi;

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

FsUserGroupsApi apiInstance = new FsUserGroupsApi();
FSUserGroupUpdateReq body = new FSUserGroupUpdateReq(); // FSUserGroupUpdateReq | user group info
Long fsUserGroupId = 789L; // Long | user group id
try {
    FSUserGroupResp result = apiInstance.updateFSUserGroup(body, fsUserGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsUserGroupsApi#updateFSUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSUserGroupUpdateReq**](FSUserGroupUpdateReq.md)| user group info |
 **fsUserGroupId** | **Long**| user group id |

### Return type

[**FSUserGroupResp**](FSUserGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

