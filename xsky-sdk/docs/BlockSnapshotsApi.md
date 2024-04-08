# BlockSnapshotsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlockSnapshot**](BlockSnapshotsApi.md#createBlockSnapshot) | **POST** /v1/block-snapshots/ | 
[**deleteBlockSnapshot**](BlockSnapshotsApi.md#deleteBlockSnapshot) | **DELETE** /v1/block-snapshots/{snapshot_id} | 
[**getBlockSnapshot**](BlockSnapshotsApi.md#getBlockSnapshot) | **GET** /v1/block-snapshots/{block_snapshot_id} | 
[**listBlockSnapshots**](BlockSnapshotsApi.md#listBlockSnapshots) | **GET** /v1/block-snapshots/ | 
[**updateSnapshot**](BlockSnapshotsApi.md#updateSnapshot) | **PATCH** /v1/block-snapshots/{snapshot_id} | 

<a name="createBlockSnapshot"></a>
# **createBlockSnapshot**
> SnapshotResp createBlockSnapshot(body)



Create block snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockSnapshotsApi;

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

BlockSnapshotsApi apiInstance = new BlockSnapshotsApi();
SnapshotCreateReq body = new SnapshotCreateReq(); // SnapshotCreateReq | snapshot info
try {
    SnapshotResp result = apiInstance.createBlockSnapshot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockSnapshotsApi#createBlockSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnapshotCreateReq**](SnapshotCreateReq.md)| snapshot info |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockSnapshot"></a>
# **deleteBlockSnapshot**
> SnapshotResp deleteBlockSnapshot(snapshotId)



Delete block snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockSnapshotsApi;

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

BlockSnapshotsApi apiInstance = new BlockSnapshotsApi();
Long snapshotId = 789L; // Long | snapshot id
try {
    SnapshotResp result = apiInstance.deleteBlockSnapshot(snapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockSnapshotsApi#deleteBlockSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotId** | **Long**| snapshot id |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockSnapshot"></a>
# **getBlockSnapshot**
> SnapshotResp getBlockSnapshot(blockSnapshotId)



get block snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockSnapshotsApi;

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

BlockSnapshotsApi apiInstance = new BlockSnapshotsApi();
Long blockSnapshotId = 789L; // Long | the block snapshot id
try {
    SnapshotResp result = apiInstance.getBlockSnapshot(blockSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockSnapshotsApi#getBlockSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockSnapshotId** | **Long**| the block snapshot id |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockSnapshots"></a>
# **listBlockSnapshots**
> SnapshotsResp listBlockSnapshots(limit, offset, clusterId, poolId, uid, blockVolumeId, consistentSnapshotId, reserved, q, sort, all)



List block snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockSnapshotsApi;

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

BlockSnapshotsApi apiInstance = new BlockSnapshotsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long poolId = 789L; // Long | pool id
String uid = "uid_example"; // String | snapshot uid
Long blockVolumeId = 789L; // Long | volume id
Long consistentSnapshotId = 789L; // Long | consistent snapshot id
Boolean reserved = true; // Boolean | show reserved snapshot or not, default not
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Boolean all = true; // Boolean | show all snapshots
try {
    SnapshotsResp result = apiInstance.listBlockSnapshots(limit, offset, clusterId, poolId, uid, blockVolumeId, consistentSnapshotId, reserved, q, sort, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockSnapshotsApi#listBlockSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **poolId** | **Long**| pool id | [optional]
 **uid** | **String**| snapshot uid | [optional]
 **blockVolumeId** | **Long**| volume id | [optional]
 **consistentSnapshotId** | **Long**| consistent snapshot id | [optional]
 **reserved** | **Boolean**| show reserved snapshot or not, default not | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **all** | **Boolean**| show all snapshots | [optional]

### Return type

[**SnapshotsResp**](SnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSnapshot"></a>
# **updateSnapshot**
> SnapshotResp updateSnapshot(body, snapshotId)



Update block snapshot info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockSnapshotsApi;

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

BlockSnapshotsApi apiInstance = new BlockSnapshotsApi();
SnapshotUpdateReq body = new SnapshotUpdateReq(); // SnapshotUpdateReq | snapshot info
Long snapshotId = 789L; // Long | snapshot id
try {
    SnapshotResp result = apiInstance.updateSnapshot(body, snapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockSnapshotsApi#updateSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnapshotUpdateReq**](SnapshotUpdateReq.md)| snapshot info |
 **snapshotId** | **Long**| snapshot id |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

