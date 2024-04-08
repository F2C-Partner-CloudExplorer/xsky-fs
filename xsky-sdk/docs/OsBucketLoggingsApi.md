# OsBucketLoggingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOSBucketLoggings**](OsBucketLoggingsApi.md#listOSBucketLoggings) | **GET** /v1/os-bucket-loggings/ | 

<a name="listOSBucketLoggings"></a>
# **listOSBucketLoggings**
> OSBucketLoggingsResp listOSBucketLoggings(limit, offset, sourceBucketName, targetBucketName, q, sort, clusterId)



List os bucket loggings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketLoggingsApi;

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

OsBucketLoggingsApi apiInstance = new OsBucketLoggingsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String sourceBucketName = "sourceBucketName_example"; // String | source bucket name
String targetBucketName = "targetBucketName_example"; // String | target bucket name
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSBucketLoggingsResp result = apiInstance.listOSBucketLoggings(limit, offset, sourceBucketName, targetBucketName, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketLoggingsApi#listOSBucketLoggings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **sourceBucketName** | **String**| source bucket name | [optional]
 **targetBucketName** | **String**| target bucket name | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSBucketLoggingsResp**](OSBucketLoggingsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

