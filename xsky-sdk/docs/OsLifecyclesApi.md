# OsLifecyclesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLifecycle**](OsLifecyclesApi.md#getLifecycle) | **GET** /v1/os-lifecycles/{lifecycle_id} | 
[**listLifecycles**](OsLifecyclesApi.md#listLifecycles) | **GET** /v1/os-lifecycles/ | 

<a name="getLifecycle"></a>
# **getLifecycle**
> ObjectStorageLifecycleResp getLifecycle(lifecycleId)



Get object storage lifecycle

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsLifecyclesApi;

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

OsLifecyclesApi apiInstance = new OsLifecyclesApi();
Long lifecycleId = 789L; // Long | lifecycle id
try {
    ObjectStorageLifecycleResp result = apiInstance.getLifecycle(lifecycleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsLifecyclesApi#getLifecycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lifecycleId** | **Long**| lifecycle id |

### Return type

[**ObjectStorageLifecycleResp**](ObjectStorageLifecycleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLifecycles"></a>
# **listLifecycles**
> ObjectStorageLifecyclesResp listLifecycles(limit, offset, clusterId)



List object storage lifecycles

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsLifecyclesApi;

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

OsLifecyclesApi apiInstance = new OsLifecyclesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageLifecyclesResp result = apiInstance.listLifecycles(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsLifecyclesApi#listLifecycles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageLifecyclesResp**](ObjectStorageLifecyclesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

