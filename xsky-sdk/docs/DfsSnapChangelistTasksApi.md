# DfsSnapChangelistTasksApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsSnapChangelistTask**](DfsSnapChangelistTasksApi.md#createDfsSnapChangelistTask) | **POST** /v1/dfs-snap-changelist-tasks/ | 
[**deleteDfsSnapChangelistTask**](DfsSnapChangelistTasksApi.md#deleteDfsSnapChangelistTask) | **DELETE** /v1/dfs-snap-changelist-tasks/{dfs_snap_changelist_task_id} | 
[**getDfsSnapChangelistTask**](DfsSnapChangelistTasksApi.md#getDfsSnapChangelistTask) | **GET** /v1/dfs-snap-changelist-tasks/{dfs_snap_changelist_task_id} | 
[**listDfsSnapChangelistTasks**](DfsSnapChangelistTasksApi.md#listDfsSnapChangelistTasks) | **GET** /v1/dfs-snap-changelist-tasks/ | 

<a name="createDfsSnapChangelistTask"></a>
# **createDfsSnapChangelistTask**
> DfsSnapChangelistTaskResp createDfsSnapChangelistTask(body)



Create dfs snap change list task

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapChangelistTasksApi;

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

DfsSnapChangelistTasksApi apiInstance = new DfsSnapChangelistTasksApi();
DfsSnapChangelistTaskCreateReq body = new DfsSnapChangelistTaskCreateReq(); // DfsSnapChangelistTaskCreateReq | task info
try {
    DfsSnapChangelistTaskResp result = apiInstance.createDfsSnapChangelistTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapChangelistTasksApi#createDfsSnapChangelistTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSnapChangelistTaskCreateReq**](DfsSnapChangelistTaskCreateReq.md)| task info |

### Return type

[**DfsSnapChangelistTaskResp**](DfsSnapChangelistTaskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsSnapChangelistTask"></a>
# **deleteDfsSnapChangelistTask**
> deleteDfsSnapChangelistTask(dfsSnapChangelistTaskId)



delete dfs snap change list task

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapChangelistTasksApi;

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

DfsSnapChangelistTasksApi apiInstance = new DfsSnapChangelistTasksApi();
Long dfsSnapChangelistTaskId = 789L; // Long | task id
try {
    apiInstance.deleteDfsSnapChangelistTask(dfsSnapChangelistTaskId);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapChangelistTasksApi#deleteDfsSnapChangelistTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapChangelistTaskId** | **Long**| task id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDfsSnapChangelistTask"></a>
# **getDfsSnapChangelistTask**
> DfsSnapChangelistTaskResp getDfsSnapChangelistTask(dfsSnapChangelistTaskId)



get dfs snap change list task

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapChangelistTasksApi;

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

DfsSnapChangelistTasksApi apiInstance = new DfsSnapChangelistTasksApi();
Long dfsSnapChangelistTaskId = 789L; // Long | the dfs snap change list task id
try {
    DfsSnapChangelistTaskResp result = apiInstance.getDfsSnapChangelistTask(dfsSnapChangelistTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapChangelistTasksApi#getDfsSnapChangelistTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapChangelistTaskId** | **Long**| the dfs snap change list task id |

### Return type

[**DfsSnapChangelistTaskResp**](DfsSnapChangelistTaskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsSnapChangelistTasks"></a>
# **listDfsSnapChangelistTasks**
> DfsSnapChangelistTasksResp listDfsSnapChangelistTasks(clusterId, path, limit, offset, q, sort)



List dfs snap change list tasks

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapChangelistTasksApi;

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

DfsSnapChangelistTasksApi apiInstance = new DfsSnapChangelistTasksApi();
String clusterId = "clusterId_example"; // String | cluster id
String path = "path_example"; // String | related dfs path
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsSnapChangelistTasksResp result = apiInstance.listDfsSnapChangelistTasks(clusterId, path, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapChangelistTasksApi#listDfsSnapChangelistTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **path** | **String**| related dfs path | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsSnapChangelistTasksResp**](DfsSnapChangelistTasksResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

