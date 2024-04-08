# OsZoneTranslogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSZoneTranslog**](OsZoneTranslogsApi.md#getOSZoneTranslog) | **GET** /v1/os-zone-translogs/{translog_uuid} | 
[**listOSZoneTranslogs**](OsZoneTranslogsApi.md#listOSZoneTranslogs) | **GET** /v1/os-zone-translogs/ | 

<a name="getOSZoneTranslog"></a>
# **getOSZoneTranslog**
> OSZoneTranslogResp getOSZoneTranslog(translogUuid)



Get a os zone translog

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneTranslogsApi;

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

OsZoneTranslogsApi apiInstance = new OsZoneTranslogsApi();
String translogUuid = "translogUuid_example"; // String | translog uuid
try {
    OSZoneTranslogResp result = apiInstance.getOSZoneTranslog(translogUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneTranslogsApi#getOSZoneTranslog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **translogUuid** | **String**| translog uuid |

### Return type

[**OSZoneTranslogResp**](OSZoneTranslogResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSZoneTranslogs"></a>
# **listOSZoneTranslogs**
> OSZoneTranslogsResp listOSZoneTranslogs(limit, offset, epochUuid, clusterId)



List os zone translogs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneTranslogsApi;

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

OsZoneTranslogsApi apiInstance = new OsZoneTranslogsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String epochUuid = "epochUuid_example"; // String | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSZoneTranslogsResp result = apiInstance.listOSZoneTranslogs(limit, offset, epochUuid, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneTranslogsApi#listOSZoneTranslogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **epochUuid** | **String**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSZoneTranslogsResp**](OSZoneTranslogsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

