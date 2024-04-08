# BlockVolumesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchGetBlockVolumeSamples**](BlockVolumesApi.md#batchGetBlockVolumeSamples) | **GET** /v1/block-volumes/samples | 
[**createBlockVolume**](BlockVolumesApi.md#createBlockVolume) | **POST** /v1/block-volumes/ | 
[**deleteBlockVolume**](BlockVolumesApi.md#deleteBlockVolume) | **DELETE** /v1/block-volumes/{block_volume_id} | 
[**getBlockVolume**](BlockVolumesApi.md#getBlockVolume) | **GET** /v1/block-volumes/{block_volume_id} | 
[**getBlockVolumeSamples**](BlockVolumesApi.md#getBlockVolumeSamples) | **GET** /v1/block-volumes/{block_volume_id}/samples | 
[**listBlockVolumes**](BlockVolumesApi.md#listBlockVolumes) | **GET** /v1/block-volumes/ | 
[**migrateBlockVolume**](BlockVolumesApi.md#migrateBlockVolume) | **POST** /v1/block-volumes/{block_volume_id}:migrate | 
[**rebuildBlockVolumeReplication**](BlockVolumesApi.md#rebuildBlockVolumeReplication) | **POST** /v1/block-volumes/{block_volume_id}:rebuild-replication | 
[**setAsyncReplicationProtection**](BlockVolumesApi.md#setAsyncReplicationProtection) | **POST** /v1/block-volumes/{block_volume_id}:set-async-replication-protection | 
[**setBackupProtection**](BlockVolumesApi.md#setBackupProtection) | **POST** /v1/block-volumes/{block_volume_id}:set-backup-protection | 
[**setBlockVolumeCrc**](BlockVolumesApi.md#setBlockVolumeCrc) | **POST** /v1/block-volumes/{block_volume_id}:set-crc | 
[**setBlockVolumeReplication**](BlockVolumesApi.md#setBlockVolumeReplication) | **POST** /v1/block-volumes/{block_volume_id}:set-replication | 
[**setSnapshotProtection**](BlockVolumesApi.md#setSnapshotProtection) | **POST** /v1/block-volumes/{block_volume_id}:set-snapshot-protection | 
[**suspendBlockVolumeReplication**](BlockVolumesApi.md#suspendBlockVolumeReplication) | **POST** /v1/block-volumes/{block_volume_id}:suspend-replication | 
[**unsetAsyncReplicationProtection**](BlockVolumesApi.md#unsetAsyncReplicationProtection) | **POST** /v1/block-volumes/{block_volume_id}:unset-async-replication-protection | 
[**unsetBackupProtection**](BlockVolumesApi.md#unsetBackupProtection) | **POST** /v1/block-volumes/{block_volume_id}:unset-backup-protection | 
[**unsetBlockVolumeCrc**](BlockVolumesApi.md#unsetBlockVolumeCrc) | **POST** /v1/block-volumes/{block_volume_id}:unset-crc | 
[**unsetBlockVolumeReplication**](BlockVolumesApi.md#unsetBlockVolumeReplication) | **POST** /v1/block-volumes/{block_volume_id}:unset-replication | 
[**unsetSnapshotProtection**](BlockVolumesApi.md#unsetSnapshotProtection) | **POST** /v1/block-volumes/{block_volume_id}:unset-snapshot-protection | 
[**updateBlockVolume**](BlockVolumesApi.md#updateBlockVolume) | **PATCH** /v1/block-volumes/{block_volume_id} | 
[**updateBlockVolumeVolumeName**](BlockVolumesApi.md#updateBlockVolumeVolumeName) | **POST** /v1/block-volumes/{block_volume_id}:update-volume-name | 
[**updateVolumeStat**](BlockVolumesApi.md#updateVolumeStat) | **POST** /v1/block-volumes/:update-stat | 

<a name="batchGetBlockVolumeSamples"></a>
# **batchGetBlockVolumeSamples**
> MultiVolumesSamplesResp batchGetBlockVolumeSamples(ids, durationBegin, durationEnd, period)



Get samples of multiple block volumes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
String ids = "ids_example"; // String | volume ids; example: id1,id2,id3
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    MultiVolumesSamplesResp result = apiInstance.batchGetBlockVolumeSamples(ids, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#batchGetBlockVolumeSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| volume ids; example: id1,id2,id3 |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**MultiVolumesSamplesResp**](MultiVolumesSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBlockVolume"></a>
# **createBlockVolume**
> VolumeResp createBlockVolume(body)



Create block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeCreateReq body = new VolumeCreateReq(); // VolumeCreateReq | volume info
try {
    VolumeResp result = apiInstance.createBlockVolume(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#createBlockVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeCreateReq**](VolumeCreateReq.md)| volume info |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockVolume"></a>
# **deleteBlockVolume**
> VolumeResp deleteBlockVolume(blockVolumeId, bypassTrash)



Delete block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | volume id
Boolean bypassTrash = true; // Boolean | bypass trash or not
try {
    VolumeResp result = apiInstance.deleteBlockVolume(blockVolumeId, bypassTrash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#deleteBlockVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| volume id |
 **bypassTrash** | **Boolean**| bypass trash or not | [optional]

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockVolume"></a>
# **getBlockVolume**
> VolumeResp getBlockVolume(blockVolumeId)



get a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.getBlockVolume(blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#getBlockVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockVolumeSamples"></a>
# **getBlockVolumeSamples**
> VolumeSamplesResp getBlockVolumeSamples(blockVolumeId, durationBegin, durationEnd, period)



get a block volume&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | block volume id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    VolumeSamplesResp result = apiInstance.getBlockVolumeSamples(blockVolumeId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#getBlockVolumeSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| block volume id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**VolumeSamplesResp**](VolumeSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockVolumes"></a>
# **listBlockVolumes**
> VolumesResp listBlockVolumes(limit, offset, poolId, poolName, clusterId, blockSnapshotId, name, namePrefix, volumeName, uid, clientGroupId, mappingGroupId, excludeMappingGroupId, accessPathId, passive, recycled, status, withNotUsed, q, sort, all, dpBlockBackupPolicyId, dpBlockAsyncReplicationPolicyId, couldHaveIo, rbdClientId)



List block volumes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long poolId = 789L; // Long | The id of the pool volumes belong to
String poolName = "poolName_example"; // String | The pool_name of the pool volumes belong to
String clusterId = "clusterId_example"; // String | cluster id
Long blockSnapshotId = 789L; // Long | related snapshot id
String name = "name_example"; // String | name of volume
String namePrefix = "namePrefix_example"; // String | name prefix of volume
String volumeName = "volumeName_example"; // String | volume_name of volume
String uid = "uid_example"; // String | uid of volume
Long clientGroupId = 789L; // Long | related client group id
Long mappingGroupId = 789L; // Long | related mapping group id
Long excludeMappingGroupId = 789L; // Long | exclude mapping group id, with access path id
Long accessPathId = 789L; // Long | related access path id
Boolean passive = true; // Boolean | passive or not
Boolean recycled = true; // Boolean | recycled or not
String status = "status_example"; // String | filter with status
Boolean withNotUsed = true; // Boolean | list with not used volumes, can be used with access path id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Boolean all = true; // Boolean | show all volumes
Long dpBlockBackupPolicyId = 789L; // Long | show volumes of specific dp block backup policy
Long dpBlockAsyncReplicationPolicyId = 789L; // Long | show volumes of specific dp block async replication policy
Boolean couldHaveIo = true; // Boolean | show volumes without volume that cannot have io
Long rbdClientId = 789L; // Long | rbd client id
try {
    VolumesResp result = apiInstance.listBlockVolumes(limit, offset, poolId, poolName, clusterId, blockSnapshotId, name, namePrefix, volumeName, uid, clientGroupId, mappingGroupId, excludeMappingGroupId, accessPathId, passive, recycled, status, withNotUsed, q, sort, all, dpBlockBackupPolicyId, dpBlockAsyncReplicationPolicyId, couldHaveIo, rbdClientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#listBlockVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **poolId** | **Long**| The id of the pool volumes belong to | [optional]
 **poolName** | **String**| The pool_name of the pool volumes belong to | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **blockSnapshotId** | **Long**| related snapshot id | [optional]
 **name** | **String**| name of volume | [optional]
 **namePrefix** | **String**| name prefix of volume | [optional]
 **volumeName** | **String**| volume_name of volume | [optional]
 **uid** | **String**| uid of volume | [optional]
 **clientGroupId** | **Long**| related client group id | [optional]
 **mappingGroupId** | **Long**| related mapping group id | [optional]
 **excludeMappingGroupId** | **Long**| exclude mapping group id, with access path id | [optional]
 **accessPathId** | **Long**| related access path id | [optional]
 **passive** | **Boolean**| passive or not | [optional]
 **recycled** | **Boolean**| recycled or not | [optional]
 **status** | **String**| filter with status | [optional]
 **withNotUsed** | **Boolean**| list with not used volumes, can be used with access path id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **all** | **Boolean**| show all volumes | [optional]
 **dpBlockBackupPolicyId** | **Long**| show volumes of specific dp block backup policy | [optional]
 **dpBlockAsyncReplicationPolicyId** | **Long**| show volumes of specific dp block async replication policy | [optional]
 **couldHaveIo** | **Boolean**| show volumes without volume that cannot have io | [optional]
 **rbdClientId** | **Long**| rbd client id | [optional]

### Return type

[**VolumesResp**](VolumesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="migrateBlockVolume"></a>
# **migrateBlockVolume**
> VolumeResp migrateBlockVolume(body, blockVolumeId)



### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeMigrateReq body = new VolumeMigrateReq(); // VolumeMigrateReq | volume migration info
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.migrateBlockVolume(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#migrateBlockVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeMigrateReq**](VolumeMigrateReq.md)| volume migration info |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rebuildBlockVolumeReplication"></a>
# **rebuildBlockVolumeReplication**
> VolumeResp rebuildBlockVolumeReplication(blockVolumeId, force)



Rebuild block volume replication

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | block volume id
Boolean force = true; // Boolean | force rebuild or not
try {
    VolumeResp result = apiInstance.rebuildBlockVolumeReplication(blockVolumeId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#rebuildBlockVolumeReplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| block volume id |
 **force** | **Boolean**| force rebuild or not | [optional]

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setAsyncReplicationProtection"></a>
# **setAsyncReplicationProtection**
> VolumeResp setAsyncReplicationProtection(body, blockVolumeId)



Set async replication protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeAsyncReplicationProtectionReq body = new VolumeAsyncReplicationProtectionReq(); // VolumeAsyncReplicationProtectionReq | request info
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.setAsyncReplicationProtection(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#setAsyncReplicationProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeAsyncReplicationProtectionReq**](VolumeAsyncReplicationProtectionReq.md)| request info |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setBackupProtection"></a>
# **setBackupProtection**
> VolumeResp setBackupProtection(body, blockVolumeId)



Set backup protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeBackupProtectionReq body = new VolumeBackupProtectionReq(); // VolumeBackupProtectionReq | request info
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.setBackupProtection(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#setBackupProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeBackupProtectionReq**](VolumeBackupProtectionReq.md)| request info |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setBlockVolumeCrc"></a>
# **setBlockVolumeCrc**
> VolumeResp setBlockVolumeCrc(body, blockVolumeId)



Set block volume crc

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeCrcSetReq body = new VolumeCrcSetReq(); // VolumeCrcSetReq | volume crc info
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.setBlockVolumeCrc(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#setBlockVolumeCrc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeCrcSetReq**](VolumeCrcSetReq.md)| volume crc info |
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setBlockVolumeReplication"></a>
# **setBlockVolumeReplication**
> VolumeResp setBlockVolumeReplication(body, blockVolumeId)



Set block volume replication

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeReplicationSetReq body = new VolumeReplicationSetReq(); // VolumeReplicationSetReq | volume replication info
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.setBlockVolumeReplication(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#setBlockVolumeReplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeReplicationSetReq**](VolumeReplicationSetReq.md)| volume replication info |
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSnapshotProtection"></a>
# **setSnapshotProtection**
> VolumeResp setSnapshotProtection(body, blockVolumeId)



Set snapshot protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeSnapshotProtectionReq body = new VolumeSnapshotProtectionReq(); // VolumeSnapshotProtectionReq | request info
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.setSnapshotProtection(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#setSnapshotProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeSnapshotProtectionReq**](VolumeSnapshotProtectionReq.md)| request info |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suspendBlockVolumeReplication"></a>
# **suspendBlockVolumeReplication**
> VolumeResp suspendBlockVolumeReplication(blockVolumeId)



Suspend block volume replication

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.suspendBlockVolumeReplication(blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#suspendBlockVolumeReplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetAsyncReplicationProtection"></a>
# **unsetAsyncReplicationProtection**
> VolumeResp unsetAsyncReplicationProtection(blockVolumeId, force, reserveVolume)



Unset async replication protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | the block volume id
Boolean force = true; // Boolean | force unset or not
Boolean reserveVolume = true; // Boolean | reserve replicated volume or not
try {
    VolumeResp result = apiInstance.unsetAsyncReplicationProtection(blockVolumeId, force, reserveVolume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#unsetAsyncReplicationProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| the block volume id |
 **force** | **Boolean**| force unset or not | [optional]
 **reserveVolume** | **Boolean**| reserve replicated volume or not | [optional]

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetBackupProtection"></a>
# **unsetBackupProtection**
> VolumeResp unsetBackupProtection(blockVolumeId, force)



Unset backup protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | the block volume id
Boolean force = true; // Boolean | force unset or not
try {
    VolumeResp result = apiInstance.unsetBackupProtection(blockVolumeId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#unsetBackupProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| the block volume id |
 **force** | **Boolean**| force unset or not | [optional]

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetBlockVolumeCrc"></a>
# **unsetBlockVolumeCrc**
> VolumeResp unsetBlockVolumeCrc(body, blockVolumeId)



Unset block volume crc

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeCrcSetReq body = new VolumeCrcSetReq(); // VolumeCrcSetReq | volume crc info
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.unsetBlockVolumeCrc(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#unsetBlockVolumeCrc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeCrcSetReq**](VolumeCrcSetReq.md)| volume crc info |
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsetBlockVolumeReplication"></a>
# **unsetBlockVolumeReplication**
> VolumeResp unsetBlockVolumeReplication(blockVolumeId)



Unset block volume replication

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | block volume id
try {
    VolumeResp result = apiInstance.unsetBlockVolumeReplication(blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#unsetBlockVolumeReplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetSnapshotProtection"></a>
# **unsetSnapshotProtection**
> VolumeResp unsetSnapshotProtection(blockVolumeId, force)



Unset snapshot protection for a block volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
Long blockVolumeId = 789L; // Long | the block volume id
Boolean force = true; // Boolean | force unset or not
try {
    VolumeResp result = apiInstance.unsetSnapshotProtection(blockVolumeId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#unsetSnapshotProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| the block volume id |
 **force** | **Boolean**| force unset or not | [optional]

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBlockVolume"></a>
# **updateBlockVolume**
> VolumeResp updateBlockVolume(body, blockVolumeId)



Update block volume info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeUpdateReq body = new VolumeUpdateReq(); // VolumeUpdateReq | volume info
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.updateBlockVolume(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#updateBlockVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeUpdateReq**](VolumeUpdateReq.md)| volume info |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBlockVolumeVolumeName"></a>
# **updateBlockVolumeVolumeName**
> VolumeResp updateBlockVolumeVolumeName(body, blockVolumeId)



Update block volume volume_name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
VolumeUpdateVolumeNameReq body = new VolumeUpdateVolumeNameReq(); // VolumeUpdateVolumeNameReq | volume volume_name
Long blockVolumeId = 789L; // Long | the block volume id
try {
    VolumeResp result = apiInstance.updateBlockVolumeVolumeName(body, blockVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#updateBlockVolumeVolumeName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeUpdateVolumeNameReq**](VolumeUpdateVolumeNameReq.md)| volume volume_name |
 **blockVolumeId** | **Long**| the block volume id |

### Return type

[**VolumeResp**](VolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVolumeStat"></a>
# **updateVolumeStat**
> updateVolumeStat(body)



update volume stat from other cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumesApi;

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

BlockVolumesApi apiInstance = new BlockVolumesApi();
UpdateVolumeStatReq body = new UpdateVolumeStatReq(); // UpdateVolumeStatReq | volume stat
try {
    apiInstance.updateVolumeStat(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumesApi#updateVolumeStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateVolumeStatReq**](UpdateVolumeStatReq.md)| volume stat |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

