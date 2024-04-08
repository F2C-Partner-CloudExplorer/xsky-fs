# ConfTypesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listConfTypes**](ConfTypesApi.md#listConfTypes) | **GET** /v1/conf-types/ | 

<a name="listConfTypes"></a>
# **listConfTypes**
> ConfTypesResp listConfTypes(clusterId)



List conf types

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfTypesApi;

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

ConfTypesApi apiInstance = new ConfTypesApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ConfTypesResp result = apiInstance.listConfTypes(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfTypesApi#listConfTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ConfTypesResp**](ConfTypesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

