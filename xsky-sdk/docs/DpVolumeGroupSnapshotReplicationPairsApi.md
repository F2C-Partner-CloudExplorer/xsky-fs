# DpVolumeGroupSnapshotReplicationPairsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asyncFailoverDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#asyncFailoverDpVolumeGroupSnapshotReplicationPair) | **POST** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id}:async-failover | 
[**createDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#createDpVolumeGroupSnapshotReplicationPair) | **POST** /v1/dp-volume-group-snapshot-replication-pairs/ | 
[**deleteDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#deleteDpVolumeGroupSnapshotReplicationPair) | **DELETE** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id} | 
[**getDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#getDpVolumeGroupSnapshotReplicationPair) | **GET** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id} | 
[**listDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#listDpVolumeGroupSnapshotReplicationPair) | **GET** /v1/dp-volume-group-snapshot-replication-pairs/ | 
[**pauseDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#pauseDpVolumeGroupSnapshotReplicationPair) | **POST** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id}:pause | 
[**resumeDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#resumeDpVolumeGroupSnapshotReplicationPair) | **POST** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id}:resume | 
[**updateDpVolumeGroupSnapshotReplicationPair**](DpVolumeGroupSnapshotReplicationPairsApi.md#updateDpVolumeGroupSnapshotReplicationPair) | **PATCH** /v1/dp-volume-group-snapshot-replication-pairs/{pair_id} | 

<a name="asyncFailoverDpVolumeGroupSnapshotReplicationPair"></a>
# **asyncFailoverDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairsResp asyncFailoverDpVolumeGroupSnapshotReplicationPair(pairId)



switch the roles of the pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPairsResp result = apiInstance.asyncFailoverDpVolumeGroupSnapshotReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#asyncFailoverDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPairsResp**](DpVolumeGroupSnapshotReplicationPairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDpVolumeGroupSnapshotReplicationPair"></a>
# **createDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairResp createDpVolumeGroupSnapshotReplicationPair(body)



Create dp volume group snapshot replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
DpVolumeGroupSnapshotReplicationPairCreateReq body = new DpVolumeGroupSnapshotReplicationPairCreateReq(); // DpVolumeGroupSnapshotReplicationPairCreateReq | pair info
try {
    DpVolumeGroupSnapshotReplicationPairResp result = apiInstance.createDpVolumeGroupSnapshotReplicationPair(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#createDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpVolumeGroupSnapshotReplicationPairCreateReq**](DpVolumeGroupSnapshotReplicationPairCreateReq.md)| pair info |

### Return type

[**DpVolumeGroupSnapshotReplicationPairResp**](DpVolumeGroupSnapshotReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpVolumeGroupSnapshotReplicationPair"></a>
# **deleteDpVolumeGroupSnapshotReplicationPair**
> deleteDpVolumeGroupSnapshotReplicationPair(pairId, force)



Delete dp volume group snapshot replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long pairId = 789L; // Long | resource id
Boolean force = true; // Boolean | force delete volume group pair or not
try {
    apiInstance.deleteDpVolumeGroupSnapshotReplicationPair(pairId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#deleteDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |
 **force** | **Boolean**| force delete volume group pair or not | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDpVolumeGroupSnapshotReplicationPair"></a>
# **getDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairResp getDpVolumeGroupSnapshotReplicationPair(pairId)



Get dp volume group snapshot replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPairResp result = apiInstance.getDpVolumeGroupSnapshotReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#getDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPairResp**](DpVolumeGroupSnapshotReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpVolumeGroupSnapshotReplicationPair"></a>
# **listDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairsResp listDpVolumeGroupSnapshotReplicationPair(volumeGroupId, dpVolumeGroupSnapshotReplicationPolicyId)



List dp volume group snapshot replication pairs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long volumeGroupId = 789L; // Long | related volume group id
Long dpVolumeGroupSnapshotReplicationPolicyId = 789L; // Long | related policy id
try {
    DpVolumeGroupSnapshotReplicationPairsResp result = apiInstance.listDpVolumeGroupSnapshotReplicationPair(volumeGroupId, dpVolumeGroupSnapshotReplicationPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#listDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumeGroupId** | **Long**| related volume group id | [optional]
 **dpVolumeGroupSnapshotReplicationPolicyId** | **Long**| related policy id | [optional]

### Return type

[**DpVolumeGroupSnapshotReplicationPairsResp**](DpVolumeGroupSnapshotReplicationPairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pauseDpVolumeGroupSnapshotReplicationPair"></a>
# **pauseDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairsResp pauseDpVolumeGroupSnapshotReplicationPair(pairId)



pause periodic sync

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPairsResp result = apiInstance.pauseDpVolumeGroupSnapshotReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#pauseDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPairsResp**](DpVolumeGroupSnapshotReplicationPairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeDpVolumeGroupSnapshotReplicationPair"></a>
# **resumeDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairResp resumeDpVolumeGroupSnapshotReplicationPair(pairId)



resume periodic sync

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
Long pairId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPairResp result = apiInstance.resumeDpVolumeGroupSnapshotReplicationPair(pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#resumeDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pairId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPairResp**](DpVolumeGroupSnapshotReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpVolumeGroupSnapshotReplicationPair"></a>
# **updateDpVolumeGroupSnapshotReplicationPair**
> DpVolumeGroupSnapshotReplicationPairResp updateDpVolumeGroupSnapshotReplicationPair(body, pairId)



Update dp volume group snapshot replication pair

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPairsApi;

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

DpVolumeGroupSnapshotReplicationPairsApi apiInstance = new DpVolumeGroupSnapshotReplicationPairsApi();
DpVolumeGroupSnapshotReplicationPairUpdateReq body = new DpVolumeGroupSnapshotReplicationPairUpdateReq(); // DpVolumeGroupSnapshotReplicationPairUpdateReq | pair info
Long pairId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPairResp result = apiInstance.updateDpVolumeGroupSnapshotReplicationPair(body, pairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPairsApi#updateDpVolumeGroupSnapshotReplicationPair");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpVolumeGroupSnapshotReplicationPairUpdateReq**](DpVolumeGroupSnapshotReplicationPairUpdateReq.md)| pair info |
 **pairId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPairResp**](DpVolumeGroupSnapshotReplicationPairResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

