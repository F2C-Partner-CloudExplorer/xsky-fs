# ServicesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getService**](ServicesApi.md#getService) | **GET** /v1/services/{service_id} | 
[**listServices**](ServicesApi.md#listServices) | **GET** /v1/services/ | 

<a name="getService"></a>
# **getService**
> ServiceResp getService(serviceId)



get a service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ServicesApi;

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

ServicesApi apiInstance = new ServicesApi();
Long serviceId = 789L; // Long | service id
try {
    ServiceResp result = apiInstance.getService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#getService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Long**| service id |

### Return type

[**ServiceResp**](ServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listServices"></a>
# **listServices**
> ServicesResp listServices(limit, offset, hostId, hostIds, type)



List all services by host

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ServicesApi;

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

ServicesApi apiInstance = new ServicesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long hostId = 789L; // Long | host id
String hostIds = "hostIds_example"; // String | host comma seperate ids
String type = "type_example"; // String | service type
try {
    ServicesResp result = apiInstance.listServices(limit, offset, hostId, hostIds, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **hostId** | **Long**| host id | [optional]
 **hostIds** | **String**| host comma seperate ids | [optional]
 **type** | **String**| service type | [optional]

### Return type

[**ServicesResp**](ServicesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

