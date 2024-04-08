# OsdsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOsd**](OsdsApi.md#activateOsd) | **POST** /v1/osds/{osd_id}:activate | 
[**createOsd**](OsdsApi.md#createOsd) | **POST** /v1/osds/ | 
[**deleteOsd**](OsdsApi.md#deleteOsd) | **DELETE** /v1/osds/{osd_id} | 
[**getOsd**](OsdsApi.md#getOsd) | **GET** /v1/osds/{osd_id} | 
[**getOsdPredictions**](OsdsApi.md#getOsdPredictions) | **GET** /v1/osds/{osd_id}/predictions | 
[**getOsdSamples**](OsdsApi.md#getOsdSamples) | **GET** /v1/osds/{osd_id}/samples | 
[**getOsdsOverview**](OsdsApi.md#getOsdsOverview) | **GET** /v1/osds/overview | 
[**listOsds**](OsdsApi.md#listOsds) | **GET** /v1/osds/ | 
[**maintainOsd**](OsdsApi.md#maintainOsd) | **POST** /v1/osds/{osd_id}:maintain | 
[**rebuildOsd**](OsdsApi.md#rebuildOsd) | **POST** /v1/osds/{osd_id}:rebuild | 
[**switchOsdRole**](OsdsApi.md#switchOsdRole) | **POST** /v1/osds/{osd_id}:switch-role | 
[**unmaintainOsd**](OsdsApi.md#unmaintainOsd) | **POST** /v1/osds/{osd_id}:unmaintain | 
[**unsetOsdIsolation**](OsdsApi.md#unsetOsdIsolation) | **POST** /v1/osds/{osd_id}:unset-isolation | 
[**updateOsdNumaNode**](OsdsApi.md#updateOsdNumaNode) | **POST** /v1/osds/{osd_id}:update-numa-node | 

<a name="activateOsd"></a>
# **activateOsd**
> OsdResp activateOsd(osdId)



Try to activate osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.activateOsd(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#activateOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createOsd"></a>
# **createOsd**
> OsdResp createOsd(body)



Create osd service on specific disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
OsdCreateReq body = new OsdCreateReq(); // OsdCreateReq | osd info
try {
    OsdResp result = apiInstance.createOsd(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#createOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdCreateReq**](OsdCreateReq.md)| osd info |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOsd"></a>
# **deleteOsd**
> OsdResp deleteOsd(osdId)



remove an osd from cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.deleteOsd(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#deleteOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsd"></a>
# **getOsd**
> OsdResp getOsd(osdId)



get an osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.getOsd(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#getOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsdPredictions"></a>
# **getOsdPredictions**
> OsdPredictionsResp getOsdPredictions(osdId)



get a osd&#x27;s prediction

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdPredictionsResp result = apiInstance.getOsdPredictions(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#getOsdPredictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdPredictionsResp**](OsdPredictionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsdSamples"></a>
# **getOsdSamples**
> OsdSamplesResp getOsdSamples(osdId, durationBegin, durationEnd, period)



get a osd&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OsdSamplesResp result = apiInstance.getOsdSamples(osdId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#getOsdSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OsdSamplesResp**](OsdSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsdsOverview"></a>
# **getOsdsOverview**
> OsdOverviewResp getOsdsOverview(clusterId)



Get osd overview in the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    OsdOverviewResp result = apiInstance.getOsdsOverview(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#getOsdsOverview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OsdOverviewResp**](OsdOverviewResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOsds"></a>
# **listOsds**
> OsdsResp listOsds(limit, offset, hostId, clusterId, diskIds, poolId, bindPoolId, osdGroupId, type, role, statusClass, withCompound, withHybrid, cacheDiskId, ids, q, sort)



List all osds in the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long hostId = 789L; // Long | host id
String clusterId = "clusterId_example"; // String | cluster id
Long diskIds = 789L; // Long | disk ids
Long poolId = 789L; // Long | pool id
Long bindPoolId = 789L; // Long | bind pool id
Long osdGroupId = 789L; // Long | osd group id
String type = "type_example"; // String | osd type: HDD, SSD, Hybrid
String role = "role_example"; // String | osd role: index or data
String statusClass = "statusClass_example"; // String | osd status class: active, warning, error, offline, doing
Boolean withCompound = true; // Boolean | with compound osd
Boolean withHybrid = true; // Boolean | with hybrid osd
Long cacheDiskId = 789L; // Long | cache disk id
String ids = "ids_example"; // String | comma separate osd ids
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    OsdsResp result = apiInstance.listOsds(limit, offset, hostId, clusterId, diskIds, poolId, bindPoolId, osdGroupId, type, role, statusClass, withCompound, withHybrid, cacheDiskId, ids, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#listOsds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **hostId** | **Long**| host id | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **diskIds** | **Long**| disk ids | [optional]
 **poolId** | **Long**| pool id | [optional]
 **bindPoolId** | **Long**| bind pool id | [optional]
 **osdGroupId** | **Long**| osd group id | [optional]
 **type** | **String**| osd type: HDD, SSD, Hybrid | [optional]
 **role** | **String**| osd role: index or data | [optional]
 **statusClass** | **String**| osd status class: active, warning, error, offline, doing | [optional]
 **withCompound** | **Boolean**| with compound osd | [optional]
 **withHybrid** | **Boolean**| with hybrid osd | [optional]
 **cacheDiskId** | **Long**| cache disk id | [optional]
 **ids** | **String**| comma separate osd ids | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**OsdsResp**](OsdsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="maintainOsd"></a>
# **maintainOsd**
> OsdResp maintainOsd(osdId)



Put osd in maintained status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.maintainOsd(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#maintainOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildOsd"></a>
# **rebuildOsd**
> OsdResp rebuildOsd(body, osdId)



rebuild an osd from cluster pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
OsdRebuildReq body = new OsdRebuildReq(); // OsdRebuildReq | osd info
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.rebuildOsd(body, osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#rebuildOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdRebuildReq**](OsdRebuildReq.md)| osd info |
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="switchOsdRole"></a>
# **switchOsdRole**
> OsdResp switchOsdRole(osdId)



Switch osd role to compound

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.switchOsdRole(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#switchOsdRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unmaintainOsd"></a>
# **unmaintainOsd**
> OsdResp unmaintainOsd(osdId)



Put osd out of maintained status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.unmaintainOsd(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#unmaintainOsd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetOsdIsolation"></a>
# **unsetOsdIsolation**
> OsdResp unsetOsdIsolation(osdId)



Unset osd in isolation status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.unsetOsdIsolation(osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#unsetOsdIsolation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOsdNumaNode"></a>
# **updateOsdNumaNode**
> OsdResp updateOsdNumaNode(body, osdId)



Update osd numa node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdsApi;

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

OsdsApi apiInstance = new OsdsApi();
OsdUpdateNumaNodeReq body = new OsdUpdateNumaNodeReq(); // OsdUpdateNumaNodeReq | osd numa node
Long osdId = 789L; // Long | osd id
try {
    OsdResp result = apiInstance.updateOsdNumaNode(body, osdId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdsApi#updateOsdNumaNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdUpdateNumaNodeReq**](OsdUpdateNumaNodeReq.md)| osd numa node |
 **osdId** | **Long**| osd id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

