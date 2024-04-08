# BlockVolumeGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBlockVolumeGroup**](BlockVolumeGroupsApi.md#createBlockVolumeGroup) | **POST** /v1/block-volume-groups/ | 
[**deleteBlockVolumeGroup**](BlockVolumeGroupsApi.md#deleteBlockVolumeGroup) | **DELETE** /v1/block-volume-groups/{block_volume_group_id} | 
[**getBlockVolumeGroup**](BlockVolumeGroupsApi.md#getBlockVolumeGroup) | **GET** /v1/block-volume-groups/{block_volume_group_id} | 
[**listBlockVolumeGroups**](BlockVolumeGroupsApi.md#listBlockVolumeGroups) | **GET** /v1/block-volume-groups/ | 
[**rollbackVolumeGroup**](BlockVolumeGroupsApi.md#rollbackVolumeGroup) | **POST** /v1/block-volume-groups/{block_volume_group_id}:rollback | 
[**setVolumeGroupSnapshotReplicationProtection**](BlockVolumeGroupsApi.md#setVolumeGroupSnapshotReplicationProtection) | **POST** /v1/block-volume-groups/{block_volume_group_id}:set-snapshot-replication-protection | 
[**unsetVolumeGroupSnapshotReplicationProtection**](BlockVolumeGroupsApi.md#unsetVolumeGroupSnapshotReplicationProtection) | **POST** /v1/block-volume-groups/{block_volume_group_id}:unset-snapshot-replication-protection | 
[**updateBlockVolumeGroup**](BlockVolumeGroupsApi.md#updateBlockVolumeGroup) | **PATCH** /v1/block-volume-groups/{block_volume_group_id} | 

<a name="createBlockVolumeGroup"></a>
# **createBlockVolumeGroup**
> VolumeGroupResp createBlockVolumeGroup(body, clusterId)



Create block volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
VolumeGroupCreateReq body = new VolumeGroupCreateReq(); // VolumeGroupCreateReq | volume group info
String clusterId = "clusterId_example"; // String | cluster id
try {
    VolumeGroupResp result = apiInstance.createBlockVolumeGroup(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#createBlockVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupCreateReq**](VolumeGroupCreateReq.md)| volume group info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBlockVolumeGroup"></a>
# **deleteBlockVolumeGroup**
> VolumeGroupResp deleteBlockVolumeGroup(blockVolumeGroupId)



Delete a block volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
Long blockVolumeGroupId = 789L; // Long | block volume group id
try {
    VolumeGroupResp result = apiInstance.deleteBlockVolumeGroup(blockVolumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#deleteBlockVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeGroupId** | **Long**| block volume group id |

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockVolumeGroup"></a>
# **getBlockVolumeGroup**
> VolumeGroupResp getBlockVolumeGroup(blockVolumeGroupId)



get a block volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
Long blockVolumeGroupId = 789L; // Long | block volume group id
try {
    VolumeGroupResp result = apiInstance.getBlockVolumeGroup(blockVolumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#getBlockVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeGroupId** | **Long**| block volume group id |

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockVolumeGroups"></a>
# **listBlockVolumeGroups**
> VolumeGroupsResp listBlockVolumeGroups(clusterId, passive, name, limit, offset, q, sort, dpVolumeGroupSnapshotReplicationPolicyId)



List block volume groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
String clusterId = "clusterId_example"; // String | cluster id
Boolean passive = true; // Boolean | passive or not
String name = "name_example"; // String | name of volume group
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long dpVolumeGroupSnapshotReplicationPolicyId = 789L; // Long | show volume groups of specific dp block async replication policy
try {
    VolumeGroupsResp result = apiInstance.listBlockVolumeGroups(clusterId, passive, name, limit, offset, q, sort, dpVolumeGroupSnapshotReplicationPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#listBlockVolumeGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **passive** | **Boolean**| passive or not | [optional]
 **name** | **String**| name of volume group | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **dpVolumeGroupSnapshotReplicationPolicyId** | **Long**| show volume groups of specific dp block async replication policy | [optional]

### Return type

[**VolumeGroupsResp**](VolumeGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rollbackVolumeGroup"></a>
# **rollbackVolumeGroup**
> VolumeGroupResp rollbackVolumeGroup(body, blockVolumeGroupId)



Rollback volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
VolumeGroupRollbackReq body = new VolumeGroupRollbackReq(); // VolumeGroupRollbackReq | rollback info
Long blockVolumeGroupId = 789L; // Long | block volume group id
try {
    VolumeGroupResp result = apiInstance.rollbackVolumeGroup(body, blockVolumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#rollbackVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupRollbackReq**](VolumeGroupRollbackReq.md)| rollback info |
 **blockVolumeGroupId** | **Long**| block volume group id |

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setVolumeGroupSnapshotReplicationProtection"></a>
# **setVolumeGroupSnapshotReplicationProtection**
> VolumeGroupResp setVolumeGroupSnapshotReplicationProtection(body, blockVolumeGroupId)



Set snapshot replication protection for a volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
VolumeGroupSnapshotReplicationProtectionReq body = new VolumeGroupSnapshotReplicationProtectionReq(); // VolumeGroupSnapshotReplicationProtectionReq | request info
Long blockVolumeGroupId = 789L; // Long | the block volume group id
try {
    VolumeGroupResp result = apiInstance.setVolumeGroupSnapshotReplicationProtection(body, blockVolumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#setVolumeGroupSnapshotReplicationProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupSnapshotReplicationProtectionReq**](VolumeGroupSnapshotReplicationProtectionReq.md)| request info |
 **blockVolumeGroupId** | **Long**| the block volume group id |

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsetVolumeGroupSnapshotReplicationProtection"></a>
# **unsetVolumeGroupSnapshotReplicationProtection**
> VolumeGroupResp unsetVolumeGroupSnapshotReplicationProtection(blockVolumeGroupId, force, reserveVolumeGroup)



Unset volume group snapshot replication protection for a volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
Long blockVolumeGroupId = 789L; // Long | the volume group id
Boolean force = true; // Boolean | force unset or not
Boolean reserveVolumeGroup = true; // Boolean | reserve replicated volume group or not
try {
    VolumeGroupResp result = apiInstance.unsetVolumeGroupSnapshotReplicationProtection(blockVolumeGroupId, force, reserveVolumeGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#unsetVolumeGroupSnapshotReplicationProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeGroupId** | **Long**| the volume group id |
 **force** | **Boolean**| force unset or not | [optional]
 **reserveVolumeGroup** | **Boolean**| reserve replicated volume group or not | [optional]

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBlockVolumeGroup"></a>
# **updateBlockVolumeGroup**
> VolumeGroupResp updateBlockVolumeGroup(body, blockVolumeGroupId)



Update block volume group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeGroupsApi;

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

BlockVolumeGroupsApi apiInstance = new BlockVolumeGroupsApi();
VolumeGroupUpdateReq body = new VolumeGroupUpdateReq(); // VolumeGroupUpdateReq | volume group info
Long blockVolumeGroupId = 789L; // Long | block volume group id
try {
    VolumeGroupResp result = apiInstance.updateBlockVolumeGroup(body, blockVolumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeGroupsApi#updateBlockVolumeGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VolumeGroupUpdateReq**](VolumeGroupUpdateReq.md)| volume group info |
 **blockVolumeGroupId** | **Long**| block volume group id |

### Return type

[**VolumeGroupResp**](VolumeGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

