# VipInstancesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVIPInstance**](VipInstancesApi.md#getVIPInstance) | **GET** /v1/vip-instances/{vip_instance_id} | 
[**listVIPInstances**](VipInstancesApi.md#listVIPInstances) | **GET** /v1/vip-instances/ | 

<a name="getVIPInstance"></a>
# **getVIPInstance**
> VIPInstanceResp getVIPInstance(vipInstanceId)



Get a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipInstancesApi;

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

VipInstancesApi apiInstance = new VipInstancesApi();
Long vipInstanceId = 789L; // Long | vip group id
try {
    VIPInstanceResp result = apiInstance.getVIPInstance(vipInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipInstancesApi#getVIPInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vipInstanceId** | **Long**| vip group id |

### Return type

[**VIPInstanceResp**](VIPInstanceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVIPInstances"></a>
# **listVIPInstances**
> VIPInstancesResp listVIPInstances(limit, offset, vipId)



List vip instances

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipInstancesApi;

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

VipInstancesApi apiInstance = new VipInstancesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long vipId = 789L; // Long | vip id
try {
    VIPInstancesResp result = apiInstance.listVIPInstances(limit, offset, vipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipInstancesApi#listVIPInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **vipId** | **Long**| vip id | [optional]

### Return type

[**VIPInstancesResp**](VIPInstancesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

