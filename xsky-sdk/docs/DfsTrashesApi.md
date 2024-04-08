# DfsTrashesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeDfsTrash**](DfsTrashesApi.md#closeDfsTrash) | **DELETE** /v1/dfs-trashes/{dfs_trash_id} | 
[**emptyDfsTrash**](DfsTrashesApi.md#emptyDfsTrash) | **POST** /v1/dfs-trashes/{dfs_trash_id}:empty | 
[**getDfsTrash**](DfsTrashesApi.md#getDfsTrash) | **GET** /v1/dfs-trashes/{dfs_trash_id} | 
[**listDfsTrashFileJobs**](DfsTrashesApi.md#listDfsTrashFileJobs) | **GET** /v1/dfs-trashes/:list_trash_file_jobs | 
[**listDfsTrashFiles**](DfsTrashesApi.md#listDfsTrashFiles) | **POST** /v1/dfs-trashes/{dfs_trash_id}:list_trash_files | 
[**listDfsTrashes**](DfsTrashesApi.md#listDfsTrashes) | **GET** /v1/dfs-trashes/ | 
[**openDfsTrash**](DfsTrashesApi.md#openDfsTrash) | **POST** /v1/dfs-trashes/ | 
[**removeDfsTrashFile**](DfsTrashesApi.md#removeDfsTrashFile) | **POST** /v1/dfs-trashes/{dfs_trash_id}:remove-file | 
[**restoreDfsTrashFile**](DfsTrashesApi.md#restoreDfsTrashFile) | **POST** /v1/dfs-trashes/{dfs_trash_id}:restore-file | 
[**searchDfsTrashFiles**](DfsTrashesApi.md#searchDfsTrashFiles) | **POST** /v1/dfs-trashes/{dfs_trash_id}:search_trash_files | 
[**updateDfsTrash**](DfsTrashesApi.md#updateDfsTrash) | **PATCH** /v1/dfs-trashes/{dfs_trash_id} | 

<a name="closeDfsTrash"></a>
# **closeDfsTrash**
> DfsTrashResp closeDfsTrash(dfsTrashId)



Close dfs trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long dfsTrashId = 789L; // Long | trash id
try {
    DfsTrashResp result = apiInstance.closeDfsTrash(dfsTrashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#closeDfsTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTrashId** | **Long**| trash id |

### Return type

[**DfsTrashResp**](DfsTrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emptyDfsTrash"></a>
# **emptyDfsTrash**
> DfsTrashResp emptyDfsTrash(dfsTrashId, force)



Empty dfs trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long dfsTrashId = 789L; // Long | trash id
Boolean force = true; // Boolean | force empty
try {
    DfsTrashResp result = apiInstance.emptyDfsTrash(dfsTrashId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#emptyDfsTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTrashId** | **Long**| trash id |
 **force** | **Boolean**| force empty | [optional]

### Return type

[**DfsTrashResp**](DfsTrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsTrash"></a>
# **getDfsTrash**
> DfsTrashResp getDfsTrash(dfsTrashId)



Get dfs trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long dfsTrashId = 789L; // Long | trash id
try {
    DfsTrashResp result = apiInstance.getDfsTrash(dfsTrashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#getDfsTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTrashId** | **Long**| trash id |

### Return type

[**DfsTrashResp**](DfsTrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsTrashFileJobs"></a>
# **listDfsTrashFileJobs**
> DfsTrashFileJobResp listDfsTrashFileJobs(limit, offset, clusterId, dfsTrashId, path, action)



List dfs trash file job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String dfsTrashId = "dfsTrashId_example"; // String | trash id
String path = "path_example"; // String | path
String action = "action_example"; // String | action
try {
    DfsTrashFileJobResp result = apiInstance.listDfsTrashFileJobs(limit, offset, clusterId, dfsTrashId, path, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#listDfsTrashFileJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsTrashId** | **String**| trash id | [optional]
 **path** | **String**| path | [optional]
 **action** | **String**| action | [optional]

### Return type

[**DfsTrashFileJobResp**](DfsTrashFileJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsTrashFiles"></a>
# **listDfsTrashFiles**
> DfsTrashFilesResp listDfsTrashFiles(dfsTrashId, limit, path, start, prefix)



List dfs trash files

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long dfsTrashId = 789L; // Long | trash id
Long limit = 789L; // Long | paging param
String path = "path_example"; // String | parent path
String start = "start_example"; // String | start file for list
String prefix = "prefix_example"; // String | prefix to filter file or directory
try {
    DfsTrashFilesResp result = apiInstance.listDfsTrashFiles(dfsTrashId, limit, path, start, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#listDfsTrashFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTrashId** | **Long**| trash id |
 **limit** | **Long**| paging param | [optional]
 **path** | **String**| parent path | [optional]
 **start** | **String**| start file for list | [optional]
 **prefix** | **String**| prefix to filter file or directory | [optional]

### Return type

[**DfsTrashFilesResp**](DfsTrashFilesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsTrashes"></a>
# **listDfsTrashes**
> DfsTrashesResp listDfsTrashes(limit, offset, q, sort, clusterId, status)



List dfs trashes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
String status = "status_example"; // String | status
try {
    DfsTrashesResp result = apiInstance.listDfsTrashes(limit, offset, q, sort, clusterId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#listDfsTrashes");
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
 **status** | **String**| status | [optional]

### Return type

[**DfsTrashesResp**](DfsTrashesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openDfsTrash"></a>
# **openDfsTrash**
> DfsTrashResp openDfsTrash(body, allowPathCreate)



Create dfs trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
DfsTrashOpenReq body = new DfsTrashOpenReq(); // DfsTrashOpenReq | trash info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsTrashResp result = apiInstance.openDfsTrash(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#openDfsTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTrashOpenReq**](DfsTrashOpenReq.md)| trash info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsTrashResp**](DfsTrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDfsTrashFile"></a>
# **removeDfsTrashFile**
> DfsTrashFileJobResp removeDfsTrashFile(body, dfsTrashId)



Remove dfs trash file

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
DfsTrashRemoveFileReq body = new DfsTrashRemoveFileReq(); // DfsTrashRemoveFileReq | trash info
Long dfsTrashId = 789L; // Long | trash id
try {
    DfsTrashFileJobResp result = apiInstance.removeDfsTrashFile(body, dfsTrashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#removeDfsTrashFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTrashRemoveFileReq**](DfsTrashRemoveFileReq.md)| trash info |
 **dfsTrashId** | **Long**| trash id |

### Return type

[**DfsTrashFileJobResp**](DfsTrashFileJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreDfsTrashFile"></a>
# **restoreDfsTrashFile**
> DfsTrashFileJobResp restoreDfsTrashFile(body, dfsTrashId, force)



Restore dfs trash file

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
DfsTrashRestoreFileReq body = new DfsTrashRestoreFileReq(); // DfsTrashRestoreFileReq | trash info
Long dfsTrashId = 789L; // Long | trash id
Boolean force = true; // Boolean | force restore
try {
    DfsTrashFileJobResp result = apiInstance.restoreDfsTrashFile(body, dfsTrashId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#restoreDfsTrashFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTrashRestoreFileReq**](DfsTrashRestoreFileReq.md)| trash info |
 **dfsTrashId** | **Long**| trash id |
 **force** | **Boolean**| force restore | [optional]

### Return type

[**DfsTrashFileJobResp**](DfsTrashFileJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchDfsTrashFiles"></a>
# **searchDfsTrashFiles**
> DfsTrashFilesResp searchDfsTrashFiles(dfsTrashId, limit, path, start, prefix)



Search dfs trash files

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
Long dfsTrashId = 789L; // Long | trash id
Long limit = 789L; // Long | paging param
String path = "path_example"; // String | subdirectory of trash path
String start = "start_example"; // String | start file for list
String prefix = "prefix_example"; // String | prefix to filter file or directory
try {
    DfsTrashFilesResp result = apiInstance.searchDfsTrashFiles(dfsTrashId, limit, path, start, prefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#searchDfsTrashFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTrashId** | **Long**| trash id |
 **limit** | **Long**| paging param | [optional]
 **path** | **String**| subdirectory of trash path | [optional]
 **start** | **String**| start file for list | [optional]
 **prefix** | **String**| prefix to filter file or directory | [optional]

### Return type

[**DfsTrashFilesResp**](DfsTrashFilesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsTrash"></a>
# **updateDfsTrash**
> DfsTrashResp updateDfsTrash(body, dfsTrashId)



Update dfs trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTrashesApi;

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

DfsTrashesApi apiInstance = new DfsTrashesApi();
DfsTrashUpdateReq body = new DfsTrashUpdateReq(); // DfsTrashUpdateReq | trash info
Long dfsTrashId = 789L; // Long | trash id
try {
    DfsTrashResp result = apiInstance.updateDfsTrash(body, dfsTrashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTrashesApi#updateDfsTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTrashUpdateReq**](DfsTrashUpdateReq.md)| trash info |
 **dfsTrashId** | **Long**| trash id |

### Return type

[**DfsTrashResp**](DfsTrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

