# DfsGatewayServicesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchGetDfsGatewayServiceSamples**](DfsGatewayServicesApi.md#batchGetDfsGatewayServiceSamples) | **GET** /v1/dfs-gateway-services/samples | 
[**getDfsGatewayService**](DfsGatewayServicesApi.md#getDfsGatewayService) | **GET** /v1/dfs-gateway-services/{dfs_gateway_service_id} | 
[**getDfsGatewayServiceSamples**](DfsGatewayServicesApi.md#getDfsGatewayServiceSamples) | **GET** /v1/dfs-gateway-services/{dfs_gateway_service_id}/samples | 
[**listDfsGatewayServices**](DfsGatewayServicesApi.md#listDfsGatewayServices) | **GET** /v1/dfs-gateway-services/ | 

<a name="batchGetDfsGatewayServiceSamples"></a>
# **batchGetDfsGatewayServiceSamples**
> MultiDfsGatewayServicesSamplesResp batchGetDfsGatewayServiceSamples(ids, dfsGatewayId, durationBegin, durationEnd, period)



Get samples of multiple dfs gateway service by ids or gateway id

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayServicesApi;

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

DfsGatewayServicesApi apiInstance = new DfsGatewayServicesApi();
String ids = "ids_example"; // String | dfs gateway service id, format 1,2,3
Long dfsGatewayId = 789L; // Long | dfs gateway service id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    MultiDfsGatewayServicesSamplesResp result = apiInstance.batchGetDfsGatewayServiceSamples(ids, dfsGatewayId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayServicesApi#batchGetDfsGatewayServiceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| dfs gateway service id, format 1,2,3 | [optional]
 **dfsGatewayId** | **Long**| dfs gateway service id | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**MultiDfsGatewayServicesSamplesResp**](MultiDfsGatewayServicesSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewayService"></a>
# **getDfsGatewayService**
> DfsGatewayServiceResp getDfsGatewayService(dfsGatewayServiceId)



Get dfs gateway service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayServicesApi;

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

DfsGatewayServicesApi apiInstance = new DfsGatewayServicesApi();
Long dfsGatewayServiceId = 789L; // Long | gateway service id
try {
    DfsGatewayServiceResp result = apiInstance.getDfsGatewayService(dfsGatewayServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayServicesApi#getDfsGatewayService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayServiceId** | **Long**| gateway service id |

### Return type

[**DfsGatewayServiceResp**](DfsGatewayServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewayServiceSamples"></a>
# **getDfsGatewayServiceSamples**
> DfsGatewayServiceSamplesResp getDfsGatewayServiceSamples(dfsGatewayServiceId, durationBegin, durationEnd, period)



Get a dfs gateway service&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayServicesApi;

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

DfsGatewayServicesApi apiInstance = new DfsGatewayServicesApi();
Long dfsGatewayServiceId = 789L; // Long | dfs gateway service id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsGatewayServiceSamplesResp result = apiInstance.getDfsGatewayServiceSamples(dfsGatewayServiceId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayServicesApi#getDfsGatewayServiceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayServiceId** | **Long**| dfs gateway service id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsGatewayServiceSamplesResp**](DfsGatewayServiceSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGatewayServices"></a>
# **listDfsGatewayServices**
> DfsGatewaysResp listDfsGatewayServices(limit, offset, q, sort, clusterId, hostId, dfsGatewayId, dfsGatewayGroupId)



List dfs gateway services

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayServicesApi;

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

DfsGatewayServicesApi apiInstance = new DfsGatewayServicesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long hostId = 789L; // Long | host id
Long dfsGatewayId = 789L; // Long | dfs gateway id
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
try {
    DfsGatewaysResp result = apiInstance.listDfsGatewayServices(limit, offset, q, sort, clusterId, hostId, dfsGatewayId, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayServicesApi#listDfsGatewayServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **hostId** | **Long**| host id | [optional]
 **dfsGatewayId** | **Long**| dfs gateway id | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id | [optional]

### Return type

[**DfsGatewaysResp**](DfsGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

