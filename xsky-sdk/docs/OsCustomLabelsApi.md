# OsCustomLabelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSCustomLabel**](OsCustomLabelsApi.md#getOSCustomLabel) | **GET** /v1/os-custom-labels/{os_custom_label_id} | 
[**listOSCustomLabels**](OsCustomLabelsApi.md#listOSCustomLabels) | **GET** /v1/os-custom-labels/ | 

<a name="getOSCustomLabel"></a>
# **getOSCustomLabel**
> OSCustomLabelResp getOSCustomLabel(osCustomLabelId)



Get object storage custom label

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsCustomLabelsApi;

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

OsCustomLabelsApi apiInstance = new OsCustomLabelsApi();
Long osCustomLabelId = 789L; // Long | os custom label id
try {
    OSCustomLabelResp result = apiInstance.getOSCustomLabel(osCustomLabelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsCustomLabelsApi#getOSCustomLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osCustomLabelId** | **Long**| os custom label id |

### Return type

[**OSCustomLabelResp**](OSCustomLabelResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSCustomLabels"></a>
# **listOSCustomLabels**
> OSCustomLabelsResp listOSCustomLabels(bucketId, category, clusterId, limit, offset)



List object storage custom labels

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsCustomLabelsApi;

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

OsCustomLabelsApi apiInstance = new OsCustomLabelsApi();
Long bucketId = 789L; // Long | bucket id
String category = "category_example"; // String | label category: meta, default, tagging
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    OSCustomLabelsResp result = apiInstance.listOSCustomLabels(bucketId, category, clusterId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsCustomLabelsApi#listOSCustomLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id | [optional]
 **category** | **String**| label category: meta, default, tagging | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**OSCustomLabelsResp**](OSCustomLabelsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

