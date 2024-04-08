# OsSamplesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSSamples**](OsSamplesApi.md#getOSSamples) | **GET** /v1/os-samples/ | 
[**getOSSamplesByBucketName**](OsSamplesApi.md#getOSSamplesByBucketName) | **GET** /v1/os-samples/{user_name}/{bucket_name} | 
[**getOSSamplesByUserName**](OsSamplesApi.md#getOSSamplesByUserName) | **GET** /v1/os-samples/{user_name} | 

<a name="getOSSamples"></a>
# **getOSSamples**
> OSSampleResp getOSSamples(time, clusterId)



Get os samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSamplesApi;

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

OsSamplesApi apiInstance = new OsSamplesApi();
String time = "time_example"; // String | query time(url encode RFC3339)
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSSampleResp result = apiInstance.getOSSamples(time, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSamplesApi#getOSSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time** | **String**| query time(url encode RFC3339) | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSSampleResp**](OSSampleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSSamplesByBucketName"></a>
# **getOSSamplesByBucketName**
> OSSampleResp getOSSamplesByBucketName(userName, bucketName, time, clusterId)



get os samples by os bucket name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSamplesApi;

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

OsSamplesApi apiInstance = new OsSamplesApi();
String userName = "userName_example"; // String | os user name
String bucketName = "bucketName_example"; // String | os bucket name
String time = "time_example"; // String | query time(url encode RFC3339)
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSSampleResp result = apiInstance.getOSSamplesByBucketName(userName, bucketName, time, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSamplesApi#getOSSamplesByBucketName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| os user name |
 **bucketName** | **String**| os bucket name |
 **time** | **String**| query time(url encode RFC3339) | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSSampleResp**](OSSampleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSSamplesByUserName"></a>
# **getOSSamplesByUserName**
> OSSampleResp getOSSamplesByUserName(userName, time, clusterId)



Get os samples by user name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSamplesApi;

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

OsSamplesApi apiInstance = new OsSamplesApi();
String userName = "userName_example"; // String | os user name
String time = "time_example"; // String | query time(url encode RFC3339)
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSSampleResp result = apiInstance.getOSSamplesByUserName(userName, time, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSamplesApi#getOSSamplesByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| os user name |
 **time** | **String**| query time(url encode RFC3339) | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSSampleResp**](OSSampleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

