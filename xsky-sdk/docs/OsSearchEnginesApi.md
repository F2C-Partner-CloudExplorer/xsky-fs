# OsSearchEnginesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOSSearchGateways**](OsSearchEnginesApi.md#addOSSearchGateways) | **POST** /v1/os-search-engines/{os_search_engine_id}:add-os-search-gateways | 
[**changeOSSearchEngine**](OsSearchEnginesApi.md#changeOSSearchEngine) | **PATCH** /v1/os-search-engines/{os_search_engine_id} | 
[**createOSSearchEngine**](OsSearchEnginesApi.md#createOSSearchEngine) | **POST** /v1/os-search-engines/ | 
[**deleteOSSearchEngine**](OsSearchEnginesApi.md#deleteOSSearchEngine) | **DELETE** /v1/os-search-engines/{os_search_engine_id} | 
[**getOSSearchEngine**](OsSearchEnginesApi.md#getOSSearchEngine) | **GET** /v1/os-search-engines/{os_search_engine_id} | 
[**getOSSearchEngineSamples**](OsSearchEnginesApi.md#getOSSearchEngineSamples) | **GET** /v1/os-search-engines/{os_search_engine_id}/samples | 
[**listOSSearchEngines**](OsSearchEnginesApi.md#listOSSearchEngines) | **GET** /v1/os-search-engines/ | 
[**removeOSSearchGateways**](OsSearchEnginesApi.md#removeOSSearchGateways) | **POST** /v1/os-search-engines/{os_search_engine_id}:remove-os-search-gateways | 
[**startOSSearchEngine**](OsSearchEnginesApi.md#startOSSearchEngine) | **POST** /v1/os-search-engines/{os_search_engine_id}:start | 
[**stopOSSearchEngine**](OsSearchEnginesApi.md#stopOSSearchEngine) | **POST** /v1/os-search-engines/{os_search_engine_id}:stop | 

<a name="addOSSearchGateways"></a>
# **addOSSearchGateways**
> OSSearchEngineResp addOSSearchGateways(body, osSearchEngineId)



Create new OS Search gateways on OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
OSSearchEngineAddGatewaysReq body = new OSSearchEngineAddGatewaysReq(); // OSSearchEngineAddGatewaysReq | os search gateways info
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.addOSSearchGateways(body, osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#addOSSearchGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSSearchEngineAddGatewaysReq**](OSSearchEngineAddGatewaysReq.md)| os search gateways info |
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeOSSearchEngine"></a>
# **changeOSSearchEngine**
> OSSearchEngineResp changeOSSearchEngine(body, osSearchEngineId)



change OS search engine falvor or data size

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
OSSearchEngineUpdateReq body = new OSSearchEngineUpdateReq(); // OSSearchEngineUpdateReq | os search gateways info
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.changeOSSearchEngine(body, osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#changeOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSSearchEngineUpdateReq**](OSSearchEngineUpdateReq.md)| os search gateways info |
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOSSearchEngine"></a>
# **createOSSearchEngine**
> OSSearchEngineResp createOSSearchEngine(body, clusterId)



Create OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
OSSearchEngineCreateReq body = new OSSearchEngineCreateReq(); // OSSearchEngineCreateReq | OS search engine info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSSearchEngineResp result = apiInstance.createOSSearchEngine(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#createOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSSearchEngineCreateReq**](OSSearchEngineCreateReq.md)| OS search engine info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSSearchEngine"></a>
# **deleteOSSearchEngine**
> OSSearchEngineResp deleteOSSearchEngine(osSearchEngineId)



delete OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.deleteOSSearchEngine(osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#deleteOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSSearchEngine"></a>
# **getOSSearchEngine**
> OSSearchEngineResp getOSSearchEngine(osSearchEngineId)



Get a OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.getOSSearchEngine(osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#getOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSSearchEngineSamples"></a>
# **getOSSearchEngineSamples**
> OSSearchEngineSamplesResp getOSSearchEngineSamples(osSearchEngineId, durationBegin, durationEnd, period)



get an object storage search engine&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
Long osSearchEngineId = 789L; // Long | OS search engine id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OSSearchEngineSamplesResp result = apiInstance.getOSSearchEngineSamples(osSearchEngineId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#getOSSearchEngineSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| OS search engine id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OSSearchEngineSamplesResp**](OSSearchEngineSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSSearchEngines"></a>
# **listOSSearchEngines**
> OSSearchEnginesResp listOSSearchEngines(clusterId, limit, offset)



List OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    OSSearchEnginesResp result = apiInstance.listOSSearchEngines(clusterId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#listOSSearchEngines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**OSSearchEnginesResp**](OSSearchEnginesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeOSSearchGateways"></a>
# **removeOSSearchGateways**
> OSSearchEngineResp removeOSSearchGateways(body, osSearchEngineId)



remove OS search gateways from OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
OSSearchEngineRemoveGatewaysReq body = new OSSearchEngineRemoveGatewaysReq(); // OSSearchEngineRemoveGatewaysReq | os search gateways info
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.removeOSSearchGateways(body, osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#removeOSSearchGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSSearchEngineRemoveGatewaysReq**](OSSearchEngineRemoveGatewaysReq.md)| os search gateways info |
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startOSSearchEngine"></a>
# **startOSSearchEngine**
> OSSearchEngineResp startOSSearchEngine(osSearchEngineId)



start OS search gateways from OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.startOSSearchEngine(osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#startOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopOSSearchEngine"></a>
# **stopOSSearchEngine**
> OSSearchEngineResp stopOSSearchEngine(osSearchEngineId)



stop OS search gateways from OS search engine

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsSearchEnginesApi;

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

OsSearchEnginesApi apiInstance = new OsSearchEnginesApi();
Long osSearchEngineId = 789L; // Long | OS search engine id
try {
    OSSearchEngineResp result = apiInstance.stopOSSearchEngine(osSearchEngineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsSearchEnginesApi#stopOSSearchEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osSearchEngineId** | **Long**| OS search engine id |

### Return type

[**OSSearchEngineResp**](OSSearchEngineResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

