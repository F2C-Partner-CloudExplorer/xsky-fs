# OsSearchGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSSearchGatewaySamples**](OsSearchGatewaysApi.md#getOSSearchGatewaySamples) | **GET** /v1/os-search-gateways/{gateway_id}/samples | 
[**getOSSearchGateways**](OsSearchGatewaysApi.md#getOSSearchGateways) | **GET** /v1/os-search-gateways/{gateway_id} | 
[**listOSSearchGateways**](OsSearchGatewaysApi.md#listOSSearchGateways) | **GET** /v1/os-search-gateways/ | 

<a name="getOSSearchGatewaySamples"></a>
# **getOSSearchGatewaySamples**
> OSSearchGatewaySamplesResp getOSSearchGatewaySamples(gatewayId, durationBegin, durationEnd, period)



get a os search gateway&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchGatewaysApi;

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

OsSearchGatewaysApi apiInstance = new OsSearchGatewaysApi();
Long gatewayId = 789L; // Long | os search gateway id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OSSearchGatewaySamplesResp result = apiInstance.getOSSearchGatewaySamples(gatewayId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchGatewaysApi#getOSSearchGatewaySamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| os search gateway id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OSSearchGatewaySamplesResp**](OSSearchGatewaySamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSSearchGateways"></a>
# **getOSSearchGateways**
> OSSearchGatewayResp getOSSearchGateways(gatewayId)



Get OS Search Gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchGatewaysApi;

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

OsSearchGatewaysApi apiInstance = new OsSearchGatewaysApi();
Long gatewayId = 789L; // Long | os search gateway id
try {
    OSSearchGatewayResp result = apiInstance.getOSSearchGateways(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchGatewaysApi#getOSSearchGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| os search gateway id |

### Return type

[**OSSearchGatewayResp**](OSSearchGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSSearchGateways"></a>
# **listOSSearchGateways**
> OSSearchGatewaysResp listOSSearchGateways(osSearchEngineId, clusterId, q, sort)



List OS Search Gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchGatewaysApi;

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

OsSearchGatewaysApi apiInstance = new OsSearchGatewaysApi();
Long osSearchEngineId = 789L; // Long | os search engine id
String clusterId = "clusterId_example"; // String | cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    OSSearchGatewaysResp result = apiInstance.listOSSearchGateways(osSearchEngineId, clusterId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchGatewaysApi#listOSSearchGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| os search engine id | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**OSSearchGatewaysResp**](OSSearchGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

