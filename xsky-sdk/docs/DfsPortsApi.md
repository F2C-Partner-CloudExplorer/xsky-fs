# DfsPortsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsPorts**](DfsPortsApi.md#listDfsPorts) | **GET** /v1/dfs-ports/ | 

<a name="listDfsPorts"></a>
# **listDfsPorts**
> DfsPortsResp listDfsPorts(limit, offset, clusterId, dfsGatewayZoneId, share)



List dfs path performances

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPortsApi;

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

DfsPortsApi apiInstance = new DfsPortsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String dfsGatewayZoneId = "dfsGatewayZoneId_example"; // String | dfs gateway zone id
String share = "share_example"; // String | share
try {
    DfsPortsResp result = apiInstance.listDfsPorts(limit, offset, clusterId, dfsGatewayZoneId, share);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPortsApi#listDfsPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsGatewayZoneId** | **String**| dfs gateway zone id | [optional]
 **share** | **String**| share | [optional]

### Return type

[**DfsPortsResp**](DfsPortsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

