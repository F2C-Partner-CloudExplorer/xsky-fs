# LunsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLun**](LunsApi.md#getLun) | **GET** /v1/luns/{lun_id} | 
[**listLuns**](LunsApi.md#listLuns) | **GET** /v1/luns/ | 

<a name="getLun"></a>
# **getLun**
> LunResp getLun(lunId)



get a lun

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.LunsApi;

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

LunsApi apiInstance = new LunsApi();
Long lunId = 789L; // Long | lun id
try {
    LunResp result = apiInstance.getLun(lunId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LunsApi#getLun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lunId** | **Long**| lun id |

### Return type

[**LunResp**](LunResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLuns"></a>
# **listLuns**
> LunsResp listLuns(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId)



List luns

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.LunsApi;

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

LunsApi apiInstance = new LunsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long mappingGroupId = 789L; // Long | mapping group id
Long volumeId = 789L; // Long | volume id
Long accessPathId = 789L; // Long | access path id
String clusterId = "clusterId_example"; // String | cluster id
try {
    LunsResp result = apiInstance.listLuns(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LunsApi#listLuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **mappingGroupId** | **Long**| mapping group id | [optional]
 **volumeId** | **Long**| volume id | [optional]
 **accessPathId** | **Long**| access path id | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**LunsResp**](LunsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

