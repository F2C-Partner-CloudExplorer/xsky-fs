# BlockConsistentSnapshotsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlockConsistentSnapshot**](BlockConsistentSnapshotsApi.md#createBlockConsistentSnapshot) | **POST** /v1/block-consistent-snapshots/ | 
[**deleteBlockConsistentSnapshot**](BlockConsistentSnapshotsApi.md#deleteBlockConsistentSnapshot) | **DELETE** /v1/block-consistent-snapshots/{consistent_snapshot_id} | 
[**getBlockConsistentSnapshot**](BlockConsistentSnapshotsApi.md#getBlockConsistentSnapshot) | **GET** /v1/block-consistent-snapshots/{block_consistent_snapshot_id} | 
[**listBlockConsistentSnapshots**](BlockConsistentSnapshotsApi.md#listBlockConsistentSnapshots) | **GET** /v1/block-consistent-snapshots/ | 

<a name="createBlockConsistentSnapshot"></a>
# **createBlockConsistentSnapshot**
> ConsistentSnapshotResp createBlockConsistentSnapshot(body, clusterId)



Create block consistent snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockConsistentSnapshotsApi;

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

BlockConsistentSnapshotsApi apiInstance = new BlockConsistentSnapshotsApi();
ConsistentSnapshotCreateReq body = new ConsistentSnapshotCreateReq(); // ConsistentSnapshotCreateReq | consistent snapshot info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ConsistentSnapshotResp result = apiInstance.createBlockConsistentSnapshot(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockConsistentSnapshotsApi#createBlockConsistentSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConsistentSnapshotCreateReq**](ConsistentSnapshotCreateReq.md)| consistent snapshot info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ConsistentSnapshotResp**](ConsistentSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockConsistentSnapshot"></a>
# **deleteBlockConsistentSnapshot**
> SnapshotResp deleteBlockConsistentSnapshot(consistentSnapshotId)



Delete block consistent snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockConsistentSnapshotsApi;

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

BlockConsistentSnapshotsApi apiInstance = new BlockConsistentSnapshotsApi();
Long consistentSnapshotId = 789L; // Long | consistent snapshot id
try {
    SnapshotResp result = apiInstance.deleteBlockConsistentSnapshot(consistentSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockConsistentSnapshotsApi#deleteBlockConsistentSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consistentSnapshotId** | **Long**| consistent snapshot id |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockConsistentSnapshot"></a>
# **getBlockConsistentSnapshot**
> SnapshotResp getBlockConsistentSnapshot(blockConsistentSnapshotId)



get block consistent snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockConsistentSnapshotsApi;

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

BlockConsistentSnapshotsApi apiInstance = new BlockConsistentSnapshotsApi();
Long blockConsistentSnapshotId = 789L; // Long | the block consistent snapshot id
try {
    SnapshotResp result = apiInstance.getBlockConsistentSnapshot(blockConsistentSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockConsistentSnapshotsApi#getBlockConsistentSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockConsistentSnapshotId** | **Long**| the block consistent snapshot id |

### Return type

[**SnapshotResp**](SnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockConsistentSnapshots"></a>
# **listBlockConsistentSnapshots**
> ConsistentSnapshotsResp listBlockConsistentSnapshots(limit, offset, q, sort)



List block consistent snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockConsistentSnapshotsApi;

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

BlockConsistentSnapshotsApi apiInstance = new BlockConsistentSnapshotsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ConsistentSnapshotsResp result = apiInstance.listBlockConsistentSnapshots(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockConsistentSnapshotsApi#listBlockConsistentSnapshots");
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

### Return type

[**ConsistentSnapshotsResp**](ConsistentSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

