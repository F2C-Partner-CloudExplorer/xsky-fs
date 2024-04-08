# PoolsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOsdsToPool**](PoolsApi.md#addOsdsToPool) | **PUT** /v1/pools/{pool_id}/osds | 
[**addPoolToOutsideBackend**](PoolsApi.md#addPoolToOutsideBackend) | **POST** /v1/pools:add-to-outside-backend | 
[**addPoolsToOspDataBackend**](PoolsApi.md#addPoolsToOspDataBackend) | **POST** /v1/pools/:add-pools-to-osp-data-backend | 
[**calcCapacity**](PoolsApi.md#calcCapacity) | **POST** /v1/pools/:calc-capacity | 
[**checkFull**](PoolsApi.md#checkFull) | **POST** /v1/pools/:check-full | 
[**createPool**](PoolsApi.md#createPool) | **POST** /v1/pools/ | 
[**deletePool**](PoolsApi.md#deletePool) | **DELETE** /v1/pools/{pool_id} | 
[**disablePoolDeviceTypeCheck**](PoolsApi.md#disablePoolDeviceTypeCheck) | **POST** /v1/pools/{pool_id}:disable-device-type-check | 
[**disablePoolNuma**](PoolsApi.md#disablePoolNuma) | **POST** /v1/pools/{pool_id}:disable-numa | 
[**enablePoolDeviceTypeCheck**](PoolsApi.md#enablePoolDeviceTypeCheck) | **POST** /v1/pools/{pool_id}:enable-device-type-check | 
[**enablePoolNuma**](PoolsApi.md#enablePoolNuma) | **POST** /v1/pools/{pool_id}:enable-numa | 
[**getPool**](PoolsApi.md#getPool) | **GET** /v1/pools/{pool_id} | 
[**getPoolPredictions**](PoolsApi.md#getPoolPredictions) | **GET** /v1/pools/{pool_id}/predictions | 
[**getPoolSamples**](PoolsApi.md#getPoolSamples) | **GET** /v1/pools/{pool_id}/samples | 
[**getPoolTopology**](PoolsApi.md#getPoolTopology) | **GET** /v1/pools/{pool_id}/topology | 
[**initializeEmptyPool**](PoolsApi.md#initializeEmptyPool) | **POST** /v1/pools/{pool_id}:initialize | 
[**listPools**](PoolsApi.md#listPools) | **GET** /v1/pools/ | 
[**removeFromOutsideBackend**](PoolsApi.md#removeFromOutsideBackend) | **POST** /v1/pools:remove-from-outside-backend | 
[**removeOsdsFromPool**](PoolsApi.md#removeOsdsFromPool) | **DELETE** /v1/pools/{pool_id}/osds | 
[**removePoolsFromOspDataBackend**](PoolsApi.md#removePoolsFromOspDataBackend) | **POST** /v1/pools/:remove-pools-from-osp-data-backend | 
[**reweightPool**](PoolsApi.md#reweightPool) | **POST** /v1/pools/{pool_id}:reweight | 
[**switchPoolRole**](PoolsApi.md#switchPoolRole) | **POST** /v1/pools/{pool_id}:switch-role | 
[**updateECPoolCrushRule**](PoolsApi.md#updateECPoolCrushRule) | **POST** /v1/pools/{pool_id}:update-ec-crush-rule | 
[**updatePool**](PoolsApi.md#updatePool) | **PATCH** /v1/pools/{pool_id} | 
[**updatePoolGCPolicyPlan**](PoolsApi.md#updatePoolGCPolicyPlan) | **POST** /v1/pools/{pool_id}:update-gc-policy-plan | 

<a name="addOsdsToPool"></a>
# **addOsdsToPool**
> PoolResp addOsdsToPool(body, poolId)



Add osds to pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OsdsAddReq body = new OsdsAddReq(); // OsdsAddReq | osd infos
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.addOsdsToPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#addOsdsToPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdsAddReq**](OsdsAddReq.md)| osd infos |
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPoolToOutsideBackend"></a>
# **addPoolToOutsideBackend**
> OspPoolOutsideResp addPoolToOutsideBackend(body)



Add pool to outside databackend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OspPoolOutsideReq body = new OspPoolOutsideReq(); // OspPoolOutsideReq | pool info
try {
    OspPoolOutsideResp result = apiInstance.addPoolToOutsideBackend(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#addPoolToOutsideBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspPoolOutsideReq**](OspPoolOutsideReq.md)| pool info |

### Return type

[**OspPoolOutsideResp**](OspPoolOutsideResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPoolsToOspDataBackend"></a>
# **addPoolsToOspDataBackend**
> TaskIDResp addPoolsToOspDataBackend(body)



Adds pools to osp data backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OspDataBackendPoolsOperateReq body = new OspDataBackendPoolsOperateReq(); // OspDataBackendPoolsOperateReq | pool info
try {
    TaskIDResp result = apiInstance.addPoolsToOspDataBackend(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#addPoolsToOspDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendPoolsOperateReq**](OspDataBackendPoolsOperateReq.md)| pool info |

### Return type

[**TaskIDResp**](TaskIDResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calcCapacity"></a>
# **calcCapacity**
> PoolCapacityResp calcCapacity(body)



calculate pool capacity

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
PoolCapacityReq body = new PoolCapacityReq(); // PoolCapacityReq | pool info
try {
    PoolCapacityResp result = apiInstance.calcCapacity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#calcCapacity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolCapacityReq**](PoolCapacityReq.md)| pool info |

### Return type

[**PoolCapacityResp**](PoolCapacityResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkFull"></a>
# **checkFull**
> PoolFullCheckResp checkFull(body)



checks if pools are full

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
PoolFullCheckReq body = new PoolFullCheckReq(); // PoolFullCheckReq | pool ids
try {
    PoolFullCheckResp result = apiInstance.checkFull(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#checkFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolFullCheckReq**](PoolFullCheckReq.md)| pool ids |

### Return type

[**PoolFullCheckResp**](PoolFullCheckResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPool"></a>
# **createPool**
> PoolResp createPool(body, clusterId)



Create pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
PoolCreateReq body = new PoolCreateReq(); // PoolCreateReq | the pool info
String clusterId = "clusterId_example"; // String | cluster id
try {
    PoolResp result = apiInstance.createPool(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#createPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolCreateReq**](PoolCreateReq.md)| the pool info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePool"></a>
# **deletePool**
> PoolResp deletePool(poolId, force)



Delete pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
Boolean force = true; // Boolean | force delete or not
try {
    PoolResp result = apiInstance.deletePool(poolId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#deletePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disablePoolDeviceTypeCheck"></a>
# **disablePoolDeviceTypeCheck**
> PoolResp disablePoolDeviceTypeCheck(poolId)



Disable device type check when add osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.disablePoolDeviceTypeCheck(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#disablePoolDeviceTypeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disablePoolNuma"></a>
# **disablePoolNuma**
> PoolResp disablePoolNuma(poolId)



Disable pool numa

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.disablePoolNuma(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#disablePoolNuma");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enablePoolDeviceTypeCheck"></a>
# **enablePoolDeviceTypeCheck**
> PoolResp enablePoolDeviceTypeCheck(poolId)



Enable device type check when add osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.enablePoolDeviceTypeCheck(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#enablePoolDeviceTypeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enablePoolNuma"></a>
# **enablePoolNuma**
> PoolResp enablePoolNuma(poolId)



Enable pool numa

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.enablePoolNuma(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#enablePoolNuma");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPool"></a>
# **getPool**
> PoolResp getPool(poolId)



get pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.getPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#getPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoolPredictions"></a>
# **getPoolPredictions**
> PoolPredictionsResp getPoolPredictions(poolId)



get a pool&#x27;s prediction

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolPredictionsResp result = apiInstance.getPoolPredictions(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#getPoolPredictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolPredictionsResp**](PoolPredictionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoolSamples"></a>
# **getPoolSamples**
> PoolSamplesResp getPoolSamples(poolId, clientIo, durationBegin, durationEnd, period)



get pool&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
Boolean clientIo = true; // Boolean | merge client io stat for tier pool
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    PoolSamplesResp result = apiInstance.getPoolSamples(poolId, clientIo, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#getPoolSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |
 **clientIo** | **Boolean**| merge client io stat for tier pool | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**PoolSamplesResp**](PoolSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoolTopology"></a>
# **getPoolTopology**
> PoolTopologyResp getPoolTopology(poolId)



get pool topology

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolTopologyResp result = apiInstance.getPoolTopology(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#getPoolTopology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolTopologyResp**](PoolTopologyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="initializeEmptyPool"></a>
# **initializeEmptyPool**
> PoolResp initializeEmptyPool(body, poolId)



initialize an empty pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
EmptyPoolInitializeReq body = new EmptyPoolInitializeReq(); // EmptyPoolInitializeReq | the pool info
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.initializeEmptyPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#initializeEmptyPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmptyPoolInitializeReq**](EmptyPoolInitializeReq.md)| the pool info |
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPools"></a>
# **listPools**
> PoolsResp listPools(limit, offset, all, protectionDomainId, clusterId, compoundOsdOnly, osdGroupId, poolType, poolRole, poolMode, stretched, withCompound, isCache, osPolicyId, storageClassId, storageClassPoolType, ospDataBackendId, ospClusterId, q, sort, poolIds)



List pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Boolean all = true; // Boolean | show all pools
Long protectionDomainId = 789L; // Long | protection domain id
String clusterId = "clusterId_example"; // String | cluster id
Boolean compoundOsdOnly = true; // Boolean | filter pool with only compound osds
Long osdGroupId = 789L; // Long | osd group id
String poolType = "poolType_example"; // String | filter pool by type
String poolRole = "poolRole_example"; // String | filter pool by role
String poolMode = "poolMode_example"; // String | filter pool by pool_mode
Boolean stretched = true; // Boolean | filter stretched pool
Boolean withCompound = true; // Boolean | with compound pool
Boolean isCache = true; // Boolean | list cache pool
Long osPolicyId = 789L; // Long | filter data pool by object storage policy id
Long storageClassId = 789L; // Long | filter data pool by os storage class id
String storageClassPoolType = "storageClassPoolType_example"; // String | storage class pool type(active inactive) to query
Long ospDataBackendId = 789L; // Long | osp data backend id
String ospClusterId = "ospClusterId_example"; // String | osp cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long poolIds = 789L; // Long | filter pool by ids
try {
    PoolsResp result = apiInstance.listPools(limit, offset, all, protectionDomainId, clusterId, compoundOsdOnly, osdGroupId, poolType, poolRole, poolMode, stretched, withCompound, isCache, osPolicyId, storageClassId, storageClassPoolType, ospDataBackendId, ospClusterId, q, sort, poolIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#listPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **all** | **Boolean**| show all pools | [optional]
 **protectionDomainId** | **Long**| protection domain id | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **compoundOsdOnly** | **Boolean**| filter pool with only compound osds | [optional]
 **osdGroupId** | **Long**| osd group id | [optional]
 **poolType** | **String**| filter pool by type | [optional]
 **poolRole** | **String**| filter pool by role | [optional]
 **poolMode** | **String**| filter pool by pool_mode | [optional]
 **stretched** | **Boolean**| filter stretched pool | [optional]
 **withCompound** | **Boolean**| with compound pool | [optional]
 **isCache** | **Boolean**| list cache pool | [optional]
 **osPolicyId** | **Long**| filter data pool by object storage policy id | [optional]
 **storageClassId** | **Long**| filter data pool by os storage class id | [optional]
 **storageClassPoolType** | **String**| storage class pool type(active inactive) to query | [optional]
 **ospDataBackendId** | **Long**| osp data backend id | [optional]
 **ospClusterId** | **String**| osp cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **poolIds** | **Long**| filter pool by ids | [optional]

### Return type

[**PoolsResp**](PoolsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFromOutsideBackend"></a>
# **removeFromOutsideBackend**
> OspPoolOutsideResp removeFromOutsideBackend(body)



Remove pools from outside backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OspPoolOutsideReq body = new OspPoolOutsideReq(); // OspPoolOutsideReq | pool info
try {
    OspPoolOutsideResp result = apiInstance.removeFromOutsideBackend(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#removeFromOutsideBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspPoolOutsideReq**](OspPoolOutsideReq.md)| pool info |

### Return type

[**OspPoolOutsideResp**](OspPoolOutsideResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeOsdsFromPool"></a>
# **removeOsdsFromPool**
> PoolResp removeOsdsFromPool(body, poolId)



Remove multiple osds from a pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OsdsRemoveReq body = new OsdsRemoveReq(); // OsdsRemoveReq | osd infos
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.removeOsdsFromPool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#removeOsdsFromPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdsRemoveReq**](OsdsRemoveReq.md)| osd infos |
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removePoolsFromOspDataBackend"></a>
# **removePoolsFromOspDataBackend**
> TaskIDResp removePoolsFromOspDataBackend(body)



Remove pools from osp data backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
OspDataBackendPoolsOperateReq body = new OspDataBackendPoolsOperateReq(); // OspDataBackendPoolsOperateReq | pool info
try {
    TaskIDResp result = apiInstance.removePoolsFromOspDataBackend(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#removePoolsFromOspDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendPoolsOperateReq**](OspDataBackendPoolsOperateReq.md)| pool info |

### Return type

[**TaskIDResp**](TaskIDResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reweightPool"></a>
# **reweightPool**
> PoolResp reweightPool(poolId)



Reweight a pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.reweightPool(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#reweightPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="switchPoolRole"></a>
# **switchPoolRole**
> PoolResp switchPoolRole(poolId)



Switch pool role to compound

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.switchPoolRole(poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#switchPoolRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateECPoolCrushRule"></a>
# **updateECPoolCrushRule**
> PoolResp updateECPoolCrushRule(body, poolId)



update crush rule with EC pool

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
ECPoolUpdateCrushRuleReq body = new ECPoolUpdateCrushRuleReq(); // ECPoolUpdateCrushRuleReq | crush rule info
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.updateECPoolCrushRule(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#updateECPoolCrushRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ECPoolUpdateCrushRuleReq**](ECPoolUpdateCrushRuleReq.md)| crush rule info |
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePool"></a>
# **updatePool**
> PoolResp updatePool(body, poolId)



update pool info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
PoolUpdateReq body = new PoolUpdateReq(); // PoolUpdateReq | pool info
Long poolId = 789L; // Long | pool id
try {
    PoolResp result = apiInstance.updatePool(body, poolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#updatePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolUpdateReq**](PoolUpdateReq.md)| pool info |
 **poolId** | **Long**| pool id |

### Return type

[**PoolResp**](PoolResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePoolGCPolicyPlan"></a>
# **updatePoolGCPolicyPlan**
> updatePoolGCPolicyPlan(body, poolId)



update pool gc policy plan

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PoolsApi;

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

PoolsApi apiInstance = new PoolsApi();
PoolGCPolicyPlan body = new PoolGCPolicyPlan(); // PoolGCPolicyPlan | pool gc policy plan
Long poolId = 789L; // Long | pool id
try {
    apiInstance.updatePoolGCPolicyPlan(body, poolId);
} catch (ApiException e) {
    System.err.println("Exception when calling PoolsApi#updatePoolGCPolicyPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoolGCPolicyPlan**](PoolGCPolicyPlan.md)| pool gc policy plan |
 **poolId** | **Long**| pool id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

