# NfsGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNFSGateway**](NfsGatewaysApi.md#createNFSGateway) | **POST** /v1/nfs-gateways/ | 
[**createNFSGatewayBucketMap**](NfsGatewaysApi.md#createNFSGatewayBucketMap) | **PUT** /v1/nfs-gateways/{gateway_id}/buckets/{bucket_id} | 
[**deleteNFSGateway**](NfsGatewaysApi.md#deleteNFSGateway) | **DELETE** /v1/nfs-gateways/{gateway_id} | 
[**deleteNFSGatewayBucketMap**](NfsGatewaysApi.md#deleteNFSGatewayBucketMap) | **DELETE** /v1/nfs-gateways/{gateway_id}/buckets/{bucket_id} | 
[**doNFSGateway**](NfsGatewaysApi.md#doNFSGateway) | **PUT** /v1/nfs-gateways/{gateway_id} | 
[**getNFSGateway**](NfsGatewaysApi.md#getNFSGateway) | **GET** /v1/nfs-gateways/{gateway_id} | 
[**getNFSGatewayBucketMap**](NfsGatewaysApi.md#getNFSGatewayBucketMap) | **GET** /v1/nfs-gateways/{gateway_id}/buckets/{bucket_id} | 
[**getNFSGatewaySamples**](NfsGatewaysApi.md#getNFSGatewaySamples) | **GET** /v1/nfs-gateways/{gateway_id}/samples | 
[**listNFSGatewayBucketMaps**](NfsGatewaysApi.md#listNFSGatewayBucketMaps) | **GET** /v1/nfs-gateways/{gateway_id}/buckets | 
[**listNFSGateways**](NfsGatewaysApi.md#listNFSGateways) | **GET** /v1/nfs-gateways/ | 
[**updateNFSGateway**](NfsGatewaysApi.md#updateNFSGateway) | **PATCH** /v1/nfs-gateways/{gateway_id} | 
[**updateNFSGatewayBucketMap**](NfsGatewaysApi.md#updateNFSGatewayBucketMap) | **PATCH** /v1/nfs-gateways/{gateway_id}/buckets/{bucket_id} | 
[**updateOspExportConfig**](NfsGatewaysApi.md#updateOspExportConfig) | **POST** /v1/nfs-gateways/{gateway_id}:update-osp-export-config | 

<a name="createNFSGateway"></a>
# **createNFSGateway**
> NFSGatewayResp createNFSGateway(body, clusterId)



create nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
NFSGatewayCreateReq body = new NFSGatewayCreateReq(); // NFSGatewayCreateReq | nfs gateway info
String clusterId = "clusterId_example"; // String | cluster id
try {
    NFSGatewayResp result = apiInstance.createNFSGateway(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#createNFSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NFSGatewayCreateReq**](NFSGatewayCreateReq.md)| nfs gateway info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNFSGatewayBucketMap"></a>
# **createNFSGatewayBucketMap**
> NFSGatewayBucketMapResp createNFSGatewayBucketMap(gatewayId, bucketId, clusterId)



add bucket to nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
Long bucketId = 789L; // Long | bucket id
String clusterId = "clusterId_example"; // String | cluster id
try {
    NFSGatewayBucketMapResp result = apiInstance.createNFSGatewayBucketMap(gatewayId, bucketId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#createNFSGatewayBucketMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |
 **bucketId** | **Long**| bucket id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NFSGatewayBucketMapResp**](NFSGatewayBucketMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNFSGateway"></a>
# **deleteNFSGateway**
> NFSGatewayResp deleteNFSGateway(gatewayId, force)



delete nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
Boolean force = true; // Boolean | force delete or not
try {
    NFSGatewayResp result = apiInstance.deleteNFSGateway(gatewayId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#deleteNFSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNFSGatewayBucketMap"></a>
# **deleteNFSGatewayBucketMap**
> NFSGatewayBucketMapResp deleteNFSGatewayBucketMap(gatewayId, bucketId, force)



remove bucket from nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
Long bucketId = 789L; // Long | bucket id
Boolean force = true; // Boolean | force delete or no
try {
    NFSGatewayBucketMapResp result = apiInstance.deleteNFSGatewayBucketMap(gatewayId, bucketId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#deleteNFSGatewayBucketMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |
 **bucketId** | **Long**| bucket id |
 **force** | **Boolean**| force delete or no | [optional]

### Return type

[**NFSGatewayBucketMapResp**](NFSGatewayBucketMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="doNFSGateway"></a>
# **doNFSGateway**
> NFSGatewayResp doNFSGateway(body, gatewayId, force)



start/stop nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
NFSGatewayActionReq body = new NFSGatewayActionReq(); // NFSGatewayActionReq | nfs gateway action info
Long gatewayId = 789L; // Long | nfs gateway id
Boolean force = true; // Boolean | force stop or no
try {
    NFSGatewayResp result = apiInstance.doNFSGateway(body, gatewayId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#doNFSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NFSGatewayActionReq**](NFSGatewayActionReq.md)| nfs gateway action info |
 **gatewayId** | **Long**| nfs gateway id |
 **force** | **Boolean**| force stop or no | [optional]

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNFSGateway"></a>
# **getNFSGateway**
> NFSGatewayResp getNFSGateway(gatewayId)



show nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
try {
    NFSGatewayResp result = apiInstance.getNFSGateway(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#getNFSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNFSGatewayBucketMap"></a>
# **getNFSGatewayBucketMap**
> NFSGatewayBucketMapResp getNFSGatewayBucketMap(gatewayId, bucketId)



get nfs gateway bucket map

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
Long bucketId = 789L; // Long | bucket id
try {
    NFSGatewayBucketMapResp result = apiInstance.getNFSGatewayBucketMap(gatewayId, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#getNFSGatewayBucketMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |
 **bucketId** | **Long**| bucket id |

### Return type

[**NFSGatewayBucketMapResp**](NFSGatewayBucketMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNFSGatewaySamples"></a>
# **getNFSGatewaySamples**
> NFSGatewaySamplesResp getNFSGatewaySamples(gatewayId, durationBegin, durationEnd, period)



Get nfs gateway&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | gateway id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    NFSGatewaySamplesResp result = apiInstance.getNFSGatewaySamples(gatewayId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#getNFSGatewaySamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| gateway id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**NFSGatewaySamplesResp**](NFSGatewaySamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNFSGatewayBucketMaps"></a>
# **listNFSGatewayBucketMaps**
> NFSGatewayBucketMapsResp listNFSGatewayBucketMaps(gatewayId, limit, offset, clusterId)



List nfs gateway bucket maps

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    NFSGatewayBucketMapsResp result = apiInstance.listNFSGatewayBucketMaps(gatewayId, limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#listNFSGatewayBucketMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NFSGatewayBucketMapsResp**](NFSGatewayBucketMapsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNFSGateways"></a>
# **listNFSGateways**
> NFSGatewaysResp listNFSGateways(limit, offset, q, sort, ospZoneId, clusterId)



List all nfs gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long ospZoneId = 789L; // Long | osp zone id
String clusterId = "clusterId_example"; // String | cluster id
try {
    NFSGatewaysResp result = apiInstance.listNFSGateways(limit, offset, q, sort, ospZoneId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#listNFSGateways");
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
 **ospZoneId** | **Long**| osp zone id | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NFSGatewaysResp**](NFSGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNFSGateway"></a>
# **updateNFSGateway**
> NFSGatewayResp updateNFSGateway(body, gatewayId)



update nfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
NFSGatewayUpdateReq body = new NFSGatewayUpdateReq(); // NFSGatewayUpdateReq | nfs gateway info
Long gatewayId = 789L; // Long | nfs gateway id
try {
    NFSGatewayResp result = apiInstance.updateNFSGateway(body, gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#updateNFSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NFSGatewayUpdateReq**](NFSGatewayUpdateReq.md)| nfs gateway info |
 **gatewayId** | **Long**| nfs gateway id |

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNFSGatewayBucketMap"></a>
# **updateNFSGatewayBucketMap**
> NFSGatewayBucketMapResp updateNFSGatewayBucketMap(body, gatewayId, bucketId, force)



update nfs gateway bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
NFSGatewayBucketMapUpdateReq body = new NFSGatewayBucketMapUpdateReq(); // NFSGatewayBucketMapUpdateReq | nfs gateway bucket update info
Long gatewayId = 789L; // Long | nfs gateway id
Long bucketId = 789L; // Long | bucket id
Boolean force = true; // Boolean | force update bucket map
try {
    NFSGatewayBucketMapResp result = apiInstance.updateNFSGatewayBucketMap(body, gatewayId, bucketId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#updateNFSGatewayBucketMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NFSGatewayBucketMapUpdateReq**](NFSGatewayBucketMapUpdateReq.md)| nfs gateway bucket update info |
 **gatewayId** | **Long**| nfs gateway id |
 **bucketId** | **Long**| bucket id |
 **force** | **Boolean**| force update bucket map | [optional]

### Return type

[**NFSGatewayBucketMapResp**](NFSGatewayBucketMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOspExportConfig"></a>
# **updateOspExportConfig**
> NFSGatewayResp updateOspExportConfig(gatewayId)



update osp nfs gateway export config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewaysApi;

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

NfsGatewaysApi apiInstance = new NfsGatewaysApi();
Long gatewayId = 789L; // Long | nfs gateway id
try {
    NFSGatewayResp result = apiInstance.updateOspExportConfig(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewaysApi#updateOspExportConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| nfs gateway id |

### Return type

[**NFSGatewayResp**](NFSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

