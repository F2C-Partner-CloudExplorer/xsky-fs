# OsObjectsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOSObjectsBySQL**](OsObjectsApi.md#listOSObjectsBySQL) | **POST** /v1/os-objects/_sql | 
[**listOSObjectsBySearch**](OsObjectsApi.md#listOSObjectsBySearch) | **POST** /v1/os-objects/_search | 
[**reportOSObjectsBySQL**](OsObjectsApi.md#reportOSObjectsBySQL) | **POST** /v1/os-objects/report/_sql | 

<a name="listOSObjectsBySQL"></a>
# **listOSObjectsBySQL**
> listOSObjectsBySQL(clusterId)



List object storage objects by sql

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsObjectsApi;

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

OsObjectsApi apiInstance = new OsObjectsApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    apiInstance.listOSObjectsBySQL(clusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling OsObjectsApi#listOSObjectsBySQL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listOSObjectsBySearch"></a>
# **listOSObjectsBySearch**
> listOSObjectsBySearch(clusterId)



List object storage objects by search

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsObjectsApi;

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

OsObjectsApi apiInstance = new OsObjectsApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    apiInstance.listOSObjectsBySearch(clusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling OsObjectsApi#listOSObjectsBySearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="reportOSObjectsBySQL"></a>
# **reportOSObjectsBySQL**
> File reportOSObjectsBySQL(sql, osBuckets, clusterId)



Download object storage objects report by sql

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsObjectsApi;

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

OsObjectsApi apiInstance = new OsObjectsApi();
String sql = "sql_example"; // String | select statement
String osBuckets = "osBuckets_example"; // String | name of buckets joined by colon
String clusterId = "clusterId_example"; // String | cluster id
try {
    File result = apiInstance.reportOSObjectsBySQL(sql, osBuckets, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsObjectsApi#reportOSObjectsBySQL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sql** | **String**| select statement | [optional]
 **osBuckets** | **String**| name of buckets joined by colon | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

