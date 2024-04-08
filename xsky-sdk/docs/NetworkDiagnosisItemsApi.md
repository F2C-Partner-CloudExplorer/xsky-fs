# NetworkDiagnosisItemsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNetworkDiagnosisItems**](NetworkDiagnosisItemsApi.md#listNetworkDiagnosisItems) | **GET** /v1/network-diagnosis-items/ | 

<a name="listNetworkDiagnosisItems"></a>
# **listNetworkDiagnosisItems**
> NetworkDiagnosisItemsResp listNetworkDiagnosisItems(limit, offset, networks, finished)



List network diagnosis items

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosisItemsApi;

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

NetworkDiagnosisItemsApi apiInstance = new NetworkDiagnosisItemsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String networks = "networks_example"; // String | network type
Boolean finished = true; // Boolean | diagnosis item finished or not
try {
    NetworkDiagnosisItemsResp result = apiInstance.listNetworkDiagnosisItems(limit, offset, networks, finished);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosisItemsApi#listNetworkDiagnosisItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **networks** | **String**| network type | [optional]
 **finished** | **Boolean**| diagnosis item finished or not | [optional]

### Return type

[**NetworkDiagnosisItemsResp**](NetworkDiagnosisItemsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

