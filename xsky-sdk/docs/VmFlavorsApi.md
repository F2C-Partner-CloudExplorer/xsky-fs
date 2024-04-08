# VmFlavorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVMFlavor**](VmFlavorsApi.md#getVMFlavor) | **GET** /v1/vm-flavors/{vm_flavor_id} | 
[**listVMFlavors**](VmFlavorsApi.md#listVMFlavors) | **GET** /v1/vm-flavors/ | 

<a name="getVMFlavor"></a>
# **getVMFlavor**
> VMFlavorResp getVMFlavor(vmFlavorId)



Get vm flavor

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VmFlavorsApi;

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

VmFlavorsApi apiInstance = new VmFlavorsApi();
Long vmFlavorId = 789L; // Long | vm flavor id
try {
    VMFlavorResp result = apiInstance.getVMFlavor(vmFlavorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VmFlavorsApi#getVMFlavor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vmFlavorId** | **Long**| vm flavor id |

### Return type

[**VMFlavorResp**](VMFlavorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVMFlavors"></a>
# **listVMFlavors**
> VMFlavorsResp listVMFlavors(limit, offset)



List vm flavors

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VmFlavorsApi;

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

VmFlavorsApi apiInstance = new VmFlavorsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    VMFlavorsResp result = apiInstance.listVMFlavors(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VmFlavorsApi#listVMFlavors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**VMFlavorsResp**](VMFlavorsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

