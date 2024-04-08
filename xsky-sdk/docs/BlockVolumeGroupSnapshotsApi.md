# BlockVolumeGroupSnapshotsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlockVolumeGroupSnapshot**](BlockVolumeGroupSnapshotsApi.md#createBlockVolumeGroupSnapshot) | **POST** /v1/block-volume-group-snapshots/ | 
[**deleteBlockVolumeGroupSnapshot**](BlockVolumeGroupSnapshotsApi.md#deleteBlockVolumeGroupSnapshot) | **DELETE** /v1/block-volume-group-snapshots/{block_volume_group_snapshot_id} | 
[**getBlockVolumeGroupSnapshot**](BlockVolumeGroupSnapshotsApi.md#getBlockVolumeGroupSnapshot) | **GET** /v1/block-volume-group-snapshots/{block_volume_group_snapshot_id} | 
[**listBlockVolumeGroupSnapshots**](BlockVolumeGroupSnapshotsApi.md#listBlockVolumeGroupSnapshots) | **GET** /v1/block-volume-group-snapshots/ | 
[**updateBlockVolumeGroupSnapshot**](BlockVolumeGroupSnapshotsApi.md#updateBlockVolumeGroupSnapshot) | **PATCH** /v1/block-volume-group-snapshots/{block_volume_group_snapshot_id} | 

<a name="createBlockVolumeGroupSnapshot"></a>
# **createBlockVolumeGroupSnapshot**
> VolumeGroupSnapshotResp createBlockVolumeGroupSnapshot(body, clusterId)



Create block volume group snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupSnapshotsApi;

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

BlockVolumeGroupSnapshotsApi apiInstance = new BlockVolumeGroupSnapshotsApi();
VolumeGroupSnapshotCreateReq body = new VolumeGroupSnapshotCreateReq(); // VolumeGroupSnapshotCreateReq | volume group snapshot info
String clusterId = "clusterId_example"; // String | cluster id
try {
    VolumeGroupSnapshotResp result = apiInstance.createBlockVolumeGroupSnapshot(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupSnapshotsApi#createBlockVolumeGroupSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupSnapshotCreateReq**](VolumeGroupSnapshotCreateReq.md)| volume group snapshot info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**VolumeGroupSnapshotResp**](VolumeGroupSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockVolumeGroupSnapshot"></a>
# **deleteBlockVolumeGroupSnapshot**
> VolumeGroupSnapshotResp deleteBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId)



Delete a block volume group snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupSnapshotsApi;

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

BlockVolumeGroupSnapshotsApi apiInstance = new BlockVolumeGroupSnapshotsApi();
Long blockVolumeGroupSnapshotId = 789L; // Long | block volume group snapshot id
try {
    VolumeGroupSnapshotResp result = apiInstance.deleteBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupSnapshotsApi#deleteBlockVolumeGroupSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeGroupSnapshotId** | **Long**| block volume group snapshot id |

### Return type

[**VolumeGroupSnapshotResp**](VolumeGroupSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockVolumeGroupSnapshot"></a>
# **getBlockVolumeGroupSnapshot**
> VolumeGroupSnapshotResp getBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId)



get block volume group snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupSnapshotsApi;

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

BlockVolumeGroupSnapshotsApi apiInstance = new BlockVolumeGroupSnapshotsApi();
Long blockVolumeGroupSnapshotId = 789L; // Long | the block volume group snapshot id
try {
    VolumeGroupSnapshotResp result = apiInstance.getBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupSnapshotsApi#getBlockVolumeGroupSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeGroupSnapshotId** | **Long**| the block volume group snapshot id |

### Return type

[**VolumeGroupSnapshotResp**](VolumeGroupSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockVolumeGroupSnapshots"></a>
# **listBlockVolumeGroupSnapshots**
> VolumeGroupSnapshotsResp listBlockVolumeGroupSnapshots(clusterId, blockVolumeGroupId, name, passive, limit, offset, q, sort)



List block volume group snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupSnapshotsApi;

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

BlockVolumeGroupSnapshotsApi apiInstance = new BlockVolumeGroupSnapshotsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long blockVolumeGroupId = 789L; // Long | related volume group id
String name = "name_example"; // String | name of volume group snapshot
Boolean passive = true; // Boolean | passive or not
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    VolumeGroupSnapshotsResp result = apiInstance.listBlockVolumeGroupSnapshots(clusterId, blockVolumeGroupId, name, passive, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupSnapshotsApi#listBlockVolumeGroupSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **blockVolumeGroupId** | **Long**| related volume group id | [optional]
 **name** | **String**| name of volume group snapshot | [optional]
 **passive** | **Boolean**| passive or not | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**VolumeGroupSnapshotsResp**](VolumeGroupSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBlockVolumeGroupSnapshot"></a>
# **updateBlockVolumeGroupSnapshot**
> VolumeGroupSnapshotResp updateBlockVolumeGroupSnapshot(body, blockVolumeGroupSnapshotId)



Update block volume group snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupSnapshotsApi;

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

BlockVolumeGroupSnapshotsApi apiInstance = new BlockVolumeGroupSnapshotsApi();
VolumeGroupSnapshotUpdateReq body = new VolumeGroupSnapshotUpdateReq(); // VolumeGroupSnapshotUpdateReq | volume group snapshot info
Long blockVolumeGroupSnapshotId = 789L; // Long | the block volume group snapshot id
try {
    VolumeGroupSnapshotResp result = apiInstance.updateBlockVolumeGroupSnapshot(body, blockVolumeGroupSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupSnapshotsApi#updateBlockVolumeGroupSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupSnapshotUpdateReq**](VolumeGroupSnapshotUpdateReq.md)| volume group snapshot info |
 **blockVolumeGroupSnapshotId** | **Long**| the block volume group snapshot id |

### Return type

[**VolumeGroupSnapshotResp**](VolumeGroupSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

