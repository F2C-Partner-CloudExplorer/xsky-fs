# DpBlockAsyncReplicationPairsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asyncFailoverDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#asyncFailoverDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:async-failover | 
[**createDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#createDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/ | 
[**deleteDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#deleteDpBlockAsyncReplicationPair) | **DELETE** /v1/dp-block-async-replication-pairs/{pair_id} | 
[**failbackDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#failbackDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:failback | 
[**getDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#getDpBlockAsyncReplicationPair) | **GET** /v1/dp-block-async-replication-pairs/{pair_id} | 
[**listDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#listDpBlockAsyncReplicationPair) | **GET** /v1/dp-block-async-replication-pairs/ | 
[**pauseDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#pauseDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:pause | 
[**resumeDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#resumeDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:resume | 
[**rollbackDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#rollbackDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:rollback | 
[**syncDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#syncDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:sync | 
[**syncFailoverDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#syncFailoverDpBlockAsyncReplicationPair) | **POST** /v1/dp-block-async-replication-pairs/{pair_id}:sync-failover | 
[**updateDpBlockAsyncReplicationPair**](DpBlockAsyncReplicationPairsApi.md#updateDpBlockAsyncReplicationPair) | **PATCH** /v1/dp-block-async-replication-pairs/{pair_id} | 

<a name="asyncFailoverDpBlockAsyncReplicationPair"></a>
# **asyncFailoverDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp asyncFailoverDpBlockAsyncReplicationPair(pairId)



switch the roles of the pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.asyncFailoverDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#asyncFailoverDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDpBlockAsyncReplicationPair"></a>
# **createDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp createDpBlockAsyncReplicationPair(body)



Create dp block async replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
DpBlockAsyncReplicationPairCreateReq body = new DpBlockAsyncReplicationPairCreateReq(); // DpBlockAsyncReplicationPairCreateReq | pair info
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.createDpBlockAsyncReplicationPair(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#createDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockAsyncReplicationPairCreateReq**](DpBlockAsyncReplicationPairCreateReq.md)| pair info |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockAsyncReplicationPair"></a>
# **deleteDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp deleteDpBlockAsyncReplicationPair(pairId, reserveVolume)



Delete dp block async replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
Boolean reserveVolume = true; // Boolean | reserve replicated volume or not
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.deleteDpBlockAsyncReplicationPair(pairId, reserveVolume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#deleteDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |
 **reserveVolume** | **Boolean**| reserve replicated volume or not | [optional]

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="failbackDpBlockAsyncReplicationPair"></a>
# **failbackDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp failbackDpBlockAsyncReplicationPair(pairId)



switch the roles of the pair to synced

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.failbackDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#failbackDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpBlockAsyncReplicationPair"></a>
# **getDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp getDpBlockAsyncReplicationPair(pairId)



Get dp block async replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.getDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#getDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockAsyncReplicationPair"></a>
# **listDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairsResp listDpBlockAsyncReplicationPair(blockVolumeId, dpBlockAsyncReplicationPolicyId)



List dp block async replication pairs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long blockVolumeId = 789L; // Long | show volume snapshot replication pairs of specific block volume
Long dpBlockAsyncReplicationPolicyId = 789L; // Long | show volume snapshot replication pairs of specific block async replication policy
try {
    DpBlockAsyncReplicationPairsResp result = apiInstance.listDpBlockAsyncReplicationPair(blockVolumeId, dpBlockAsyncReplicationPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#listDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| show volume snapshot replication pairs of specific block volume | [optional]
 **dpBlockAsyncReplicationPolicyId** | **Long**| show volume snapshot replication pairs of specific block async replication policy | [optional]

### Return type

[**DpBlockAsyncReplicationPairsResp**](DpBlockAsyncReplicationPairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pauseDpBlockAsyncReplicationPair"></a>
# **pauseDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp pauseDpBlockAsyncReplicationPair(pairId)



pause periodic sync

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.pauseDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#pauseDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeDpBlockAsyncReplicationPair"></a>
# **resumeDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp resumeDpBlockAsyncReplicationPair(pairId)



resume periodic sync

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.resumeDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#resumeDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rollbackDpBlockAsyncReplicationPair"></a>
# **rollbackDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp rollbackDpBlockAsyncReplicationPair(pairId)



rollback volume snapshot pair to previous snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.rollbackDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#rollbackDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="syncDpBlockAsyncReplicationPair"></a>
# **syncDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp syncDpBlockAsyncReplicationPair(pairId)



sync pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.syncDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#syncDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="syncFailoverDpBlockAsyncReplicationPair"></a>
# **syncFailoverDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp syncFailoverDpBlockAsyncReplicationPair(pairId)



switch the roles of the pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.syncFailoverDpBlockAsyncReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#syncFailoverDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpBlockAsyncReplicationPair"></a>
# **updateDpBlockAsyncReplicationPair**
> DpBlockAsyncReplicationPairResp updateDpBlockAsyncReplicationPair(body, pairId)



Update dp block async replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPairsApi;

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

DpBlockAsyncReplicationPairsApi apiInstance = new DpBlockAsyncReplicationPairsApi();
DpBlockAsyncReplicationPairUpdateReq body = new DpBlockAsyncReplicationPairUpdateReq(); // DpBlockAsyncReplicationPairUpdateReq | pair info
Long pairId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPairResp result = apiInstance.updateDpBlockAsyncReplicationPair(body, pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPairsApi#updateDpBlockAsyncReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockAsyncReplicationPairUpdateReq**](DpBlockAsyncReplicationPairUpdateReq.md)| pair info |
 **pairId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPairResp**](DpBlockAsyncReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

