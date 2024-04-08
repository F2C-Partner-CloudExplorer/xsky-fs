# OsZonePairsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOSZonePairs**](OsZonePairsApi.md#listOSZonePairs) | **GET** /v1/os-zone-pairs/ | 

<a name="listOSZonePairs"></a>
# **listOSZonePairs**
> OSZonePairsResp listOSZonePairs(minClockDiffAbs, clusterId)



list os zone pairs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonePairsApi;

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

OsZonePairsApi apiInstance = new OsZonePairsApi();
String minClockDiffAbs = "minClockDiffAbs_example"; // String | min clock diff absolute value for zone pairs
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSZonePairsResp result = apiInstance.listOSZonePairs(minClockDiffAbs, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonePairsApi#listOSZonePairs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **minClockDiffAbs** | **String**| min clock diff absolute value for zone pairs | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSZonePairsResp**](OSZonePairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

