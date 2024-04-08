# DfsGatewayZonesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsGatewayZone**](DfsGatewayZonesApi.md#createDfsGatewayZone) | **POST** /v1/dfs-gateway-zones/ | 
[**deleteDfsGatewayZone**](DfsGatewayZonesApi.md#deleteDfsGatewayZone) | **DELETE** /v1/dfs-gateway-zones/{dfs_gateway_zone_id} | 
[**getDfsGatewayZone**](DfsGatewayZonesApi.md#getDfsGatewayZone) | **GET** /v1/dfs-gateway-zones/{dfs_gateway_zone_id} | 
[**getDfsGatewayZoneSamples**](DfsGatewayZonesApi.md#getDfsGatewayZoneSamples) | **GET** /v1/dfs-gateway-zones/{dfs_gateway_zone_id}/samples | 
[**listDfsGatewayZones**](DfsGatewayZonesApi.md#listDfsGatewayZones) | **GET** /v1/dfs-gateway-zones/ | 
[**updateDfsGatewayZone**](DfsGatewayZonesApi.md#updateDfsGatewayZone) | **PATCH** /v1/dfs-gateway-zones/{dfs_gateway_zone_id} | 

<a name="createDfsGatewayZone"></a>
# **createDfsGatewayZone**
> DfsGatewayZoneResp createDfsGatewayZone(body, clusterId)



Create dfs gateway zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
DfsGatewayZoneCreateReq body = new DfsGatewayZoneCreateReq(); // DfsGatewayZoneCreateReq | gateway zone info
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsGatewayZoneResp result = apiInstance.createDfsGatewayZone(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#createDfsGatewayZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayZoneCreateReq**](DfsGatewayZoneCreateReq.md)| gateway zone info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsGatewayZoneResp**](DfsGatewayZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsGatewayZone"></a>
# **deleteDfsGatewayZone**
> DfsGatewayZoneResp deleteDfsGatewayZone(dfsGatewayZoneId, force)



delete dfs gateway zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
Long dfsGatewayZoneId = 789L; // Long | gateway zone id
Boolean force = true; // Boolean | force delete or not
try {
    DfsGatewayZoneResp result = apiInstance.deleteDfsGatewayZone(dfsGatewayZoneId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#deleteDfsGatewayZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayZoneId** | **Long**| gateway zone id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DfsGatewayZoneResp**](DfsGatewayZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewayZone"></a>
# **getDfsGatewayZone**
> DfsGatewayZoneResp getDfsGatewayZone(dfsGatewayZoneId)



Get dfs gateway zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
Long dfsGatewayZoneId = 789L; // Long | gateway zone id
try {
    DfsGatewayZoneResp result = apiInstance.getDfsGatewayZone(dfsGatewayZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#getDfsGatewayZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayZoneId** | **Long**| gateway zone id |

### Return type

[**DfsGatewayZoneResp**](DfsGatewayZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewayZoneSamples"></a>
# **getDfsGatewayZoneSamples**
> DfsGatewayZoneSamplesResp getDfsGatewayZoneSamples(dfsGatewayZoneId, durationBegin, durationEnd, period)



get a dfs gateway zone&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
Long dfsGatewayZoneId = 789L; // Long | dfs gateway zone id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsGatewayZoneSamplesResp result = apiInstance.getDfsGatewayZoneSamples(dfsGatewayZoneId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#getDfsGatewayZoneSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayZoneId** | **Long**| dfs gateway zone id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsGatewayZoneSamplesResp**](DfsGatewayZoneSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGatewayZones"></a>
# **listDfsGatewayZones**
> DfsGatewayZonesResp listDfsGatewayZones(limit, offset, q, sort, clusterId)



List dfs gateway zones

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsGatewayZonesResp result = apiInstance.listDfsGatewayZones(limit, offset, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#listDfsGatewayZones");
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

### Return type

[**DfsGatewayZonesResp**](DfsGatewayZonesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsGatewayZone"></a>
# **updateDfsGatewayZone**
> DfsGatewayZoneResp updateDfsGatewayZone(body, dfsGatewayZoneId)



Update dfs gateway zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayZonesApi;

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

DfsGatewayZonesApi apiInstance = new DfsGatewayZonesApi();
DfsGatewayZoneUpdateReq body = new DfsGatewayZoneUpdateReq(); // DfsGatewayZoneUpdateReq | gateway zone info
Long dfsGatewayZoneId = 789L; // Long | gateway zone id
try {
    DfsGatewayZoneResp result = apiInstance.updateDfsGatewayZone(body, dfsGatewayZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayZonesApi#updateDfsGatewayZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayZoneUpdateReq**](DfsGatewayZoneUpdateReq.md)| gateway zone info |
 **dfsGatewayZoneId** | **Long**| gateway zone id |

### Return type

[**DfsGatewayZoneResp**](DfsGatewayZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

