# OspGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOspGateway**](OspGatewaysApi.md#createOspGateway) | **POST** /v1/osp-gateways/ | 
[**deleteOspGateway**](OspGatewaysApi.md#deleteOspGateway) | **DELETE** /v1/osp-gateways/{osp_gateway_id} | 
[**getOspGateway**](OspGatewaysApi.md#getOspGateway) | **GET** /v1/osp-gateways/{osp_gateway_id} | 
[**getOspGatewaySamples**](OspGatewaysApi.md#getOspGatewaySamples) | **GET** /v1/osp-gateways/{osp_gateway_id}/samples | 
[**getOspGatewaysStatSumByZone**](OspGatewaysApi.md#getOspGatewaysStatSumByZone) | **GET** /v1/osp-gateways/osp_zone_stats | 
[**listOspGateways**](OspGatewaysApi.md#listOspGateways) | **GET** /v1/osp-gateways/ | 
[**restartOspGateway**](OspGatewaysApi.md#restartOspGateway) | **POST** /v1/osp-gateways/{osp_gateway_id}:restart | 
[**restartOspGateways**](OspGatewaysApi.md#restartOspGateways) | **POST** /v1/osp-gateways/:restart | 
[**startOspGateway**](OspGatewaysApi.md#startOspGateway) | **POST** /v1/osp-gateways/{osp_gateway_id}:start | 
[**stopOspGateway**](OspGatewaysApi.md#stopOspGateway) | **POST** /v1/osp-gateways/{osp_gateway_id}:stop | 

<a name="createOspGateway"></a>
# **createOspGateway**
> OspGatewayResp createOspGateway(body)



Create osp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
OspGatewayCreateReq body = new OspGatewayCreateReq(); // OspGatewayCreateReq | gateway info
try {
    OspGatewayResp result = apiInstance.createOspGateway(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#createOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspGatewayCreateReq**](OspGatewayCreateReq.md)| gateway info |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOspGateway"></a>
# **deleteOspGateway**
> OspGatewayResp deleteOspGateway(ospGatewayId)



Delete osp gateway or gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
String ospGatewayId = "ospGatewayId_example"; // String | osp gateway id
try {
    OspGatewayResp result = apiInstance.deleteOspGateway(ospGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#deleteOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **String**| osp gateway id |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspGateway"></a>
# **getOspGateway**
> OspGatewayResp getOspGateway(ospGatewayId)



Get osp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long ospGatewayId = 789L; // Long | osp gateway id
try {
    OspGatewayResp result = apiInstance.getOspGateway(ospGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#getOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **Long**| osp gateway id |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspGatewaySamples"></a>
# **getOspGatewaySamples**
> OspGatewaySamplesResp getOspGatewaySamples(ospGatewayId, durationBegin, durationEnd, period)



Get osp gateway&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long ospGatewayId = 789L; // Long | osp gateway id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspGatewaySamplesResp result = apiInstance.getOspGatewaySamples(ospGatewayId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#getOspGatewaySamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **Long**| osp gateway id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspGatewaySamplesResp**](OspGatewaySamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspGatewaysStatSumByZone"></a>
# **getOspGatewaysStatSumByZone**
> OspZoneStatResp getOspGatewaysStatSumByZone(ospZoneId, clusterId)



calculate osp gateways stat by zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long ospZoneId = 789L; // Long | osp zone id
String clusterId = "clusterId_example"; // String | cluster id
try {
    OspZoneStatResp result = apiInstance.getOspGatewaysStatSumByZone(ospZoneId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#getOspGatewaysStatSumByZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospZoneId** | **Long**| osp zone id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OspZoneStatResp**](OspZoneStatResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOspGateways"></a>
# **listOspGateways**
> OspGatewaysResp listOspGateways(limit, offset, clusterId, ospZoneId, gatewayName, role)



List osp gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long ospZoneId = 789L; // Long | osp zone id
String gatewayName = "gatewayName_example"; // String | gateway name
String role = "role_example"; // String | filter by gateway role
try {
    OspGatewaysResp result = apiInstance.listOspGateways(limit, offset, clusterId, ospZoneId, gatewayName, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#listOspGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **ospZoneId** | **Long**| osp zone id | [optional]
 **gatewayName** | **String**| gateway name | [optional]
 **role** | **String**| filter by gateway role | [optional]

### Return type

[**OspGatewaysResp**](OspGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartOspGateway"></a>
# **restartOspGateway**
> OspGatewayResp restartOspGateway(ospGatewayId)



Restart osp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long ospGatewayId = 789L; // Long | osp gateway id
try {
    OspGatewayResp result = apiInstance.restartOspGateway(ospGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#restartOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **Long**| osp gateway id |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restartOspGateways"></a>
# **restartOspGateways**
> restartOspGateways(clusterId)



Restart osp gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    apiInstance.restartOspGateways(clusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#restartOspGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="startOspGateway"></a>
# **startOspGateway**
> OspGatewayResp startOspGateway(ospGatewayId)



Start osp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
Long ospGatewayId = 789L; // Long | osp gateway id
try {
    OspGatewayResp result = apiInstance.startOspGateway(ospGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#startOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **Long**| osp gateway id |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopOspGateway"></a>
# **stopOspGateway**
> OspGatewayResp stopOspGateway(ospGatewayId)



Stop osp gateway or gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspGatewaysApi;

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

OspGatewaysApi apiInstance = new OspGatewaysApi();
String ospGatewayId = "ospGatewayId_example"; // String | osp gateway id
try {
    OspGatewayResp result = apiInstance.stopOspGateway(ospGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspGatewaysApi#stopOspGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ospGatewayId** | **String**| osp gateway id |

### Return type

[**OspGatewayResp**](OspGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

