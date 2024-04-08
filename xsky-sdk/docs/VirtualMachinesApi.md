# VirtualMachinesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVirtualMachine**](VirtualMachinesApi.md#getVirtualMachine) | **GET** /v1/virtual-machines/{virtual_machine_id} | 
[**listVirtualMachines**](VirtualMachinesApi.md#listVirtualMachines) | **GET** /v1/virtual-machines/ | 
[**updateVirtualMachine**](VirtualMachinesApi.md#updateVirtualMachine) | **PATCH** /v1/virtual-machines/{virtual_machine_id} | 

<a name="getVirtualMachine"></a>
# **getVirtualMachine**
> VirtualMachineResp getVirtualMachine(virtualMachineId)



Get virtual machine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VirtualMachinesApi;

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

VirtualMachinesApi apiInstance = new VirtualMachinesApi();
Long virtualMachineId = 789L; // Long | virtual machine id
try {
    VirtualMachineResp result = apiInstance.getVirtualMachine(virtualMachineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualMachinesApi#getVirtualMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualMachineId** | **Long**| virtual machine id |

### Return type

[**VirtualMachineResp**](VirtualMachineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVirtualMachines"></a>
# **listVirtualMachines**
> VirtualMachinesResp listVirtualMachines(limit, offset)



List virtual machines

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VirtualMachinesApi;

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

VirtualMachinesApi apiInstance = new VirtualMachinesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    VirtualMachinesResp result = apiInstance.listVirtualMachines(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualMachinesApi#listVirtualMachines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**VirtualMachinesResp**](VirtualMachinesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVirtualMachine"></a>
# **updateVirtualMachine**
> VirtualMachineResp updateVirtualMachine(virtualMachineId, cpuNum)



Update virtual machine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VirtualMachinesApi;

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

VirtualMachinesApi apiInstance = new VirtualMachinesApi();
Long virtualMachineId = 789L; // Long | virtual machine id
Long cpuNum = 789L; // Long | new cpu number
try {
    VirtualMachineResp result = apiInstance.updateVirtualMachine(virtualMachineId, cpuNum);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VirtualMachinesApi#updateVirtualMachine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualMachineId** | **Long**| virtual machine id |
 **cpuNum** | **Long**| new cpu number | [optional]

### Return type

[**VirtualMachineResp**](VirtualMachineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

