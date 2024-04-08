# DfsStoragePoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsStoragePolicy**](DfsStoragePoliciesApi.md#createDfsStoragePolicy) | **POST** /v1/dfs-storage-policies/ | 
[**deleteDfsStoragePolicy**](DfsStoragePoliciesApi.md#deleteDfsStoragePolicy) | **DELETE** /v1/dfs-storage-policies/{dfs_storage_policy_id} | 
[**getDfsStoragePolicy**](DfsStoragePoliciesApi.md#getDfsStoragePolicy) | **GET** /v1/dfs-storage-policies/{dfs_storage_policy_id} | 
[**listDfsStoragePolicies**](DfsStoragePoliciesApi.md#listDfsStoragePolicies) | **GET** /v1/dfs-storage-policies/ | 
[**unlinkDfsStoragePolicyAndDfsPath**](DfsStoragePoliciesApi.md#unlinkDfsStoragePolicyAndDfsPath) | **PATCH** /v1/dfs-storage-policies/{dfs_storage_policy_id}:unlink-dfs-path | 
[**updateDfsStoragePolicy**](DfsStoragePoliciesApi.md#updateDfsStoragePolicy) | **PATCH** /v1/dfs-storage-policies/{dfs_storage_policy_id} | 

<a name="createDfsStoragePolicy"></a>
# **createDfsStoragePolicy**
> DfsStoragePolicyResp createDfsStoragePolicy(body)



Create dfs storage policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
DfsStoragePolicyCreateReq body = new DfsStoragePolicyCreateReq(); // DfsStoragePolicyCreateReq | storagepolicy info
try {
    DfsStoragePolicyResp result = apiInstance.createDfsStoragePolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#createDfsStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStoragePolicyCreateReq**](DfsStoragePolicyCreateReq.md)| storagepolicy info |

### Return type

[**DfsStoragePolicyResp**](DfsStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsStoragePolicy"></a>
# **deleteDfsStoragePolicy**
> DfsStoragePolicyResp deleteDfsStoragePolicy(dfsStoragePolicyId)



delete dfs storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
Long dfsStoragePolicyId = 789L; // Long | dfs storage policy id
try {
    DfsStoragePolicyResp result = apiInstance.deleteDfsStoragePolicy(dfsStoragePolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#deleteDfsStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStoragePolicyId** | **Long**| dfs storage policy id |

### Return type

[**DfsStoragePolicyResp**](DfsStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsStoragePolicy"></a>
# **getDfsStoragePolicy**
> DfsStoragePolicyResp getDfsStoragePolicy(dfsStoragePolicyId)



Get dfs storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
Long dfsStoragePolicyId = 789L; // Long | dfs storage policy id
try {
    DfsStoragePolicyResp result = apiInstance.getDfsStoragePolicy(dfsStoragePolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#getDfsStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStoragePolicyId** | **Long**| dfs storage policy id |

### Return type

[**DfsStoragePolicyResp**](DfsStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsStoragePolicies"></a>
# **listDfsStoragePolicies**
> DfsStoragePoliciesResp listDfsStoragePolicies(limit, offset, dfsRootfsId, dfsPathId, dfsStorageClassId, clusterId)



List dfs Policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long dfsRootfsId = 789L; // Long | dfs rootfs id
Long dfsPathId = 789L; // Long | dfs path id
Long dfsStorageClassId = 789L; // Long | dfs class id
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsStoragePoliciesResp result = apiInstance.listDfsStoragePolicies(limit, offset, dfsRootfsId, dfsPathId, dfsStorageClassId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#listDfsStoragePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **dfsRootfsId** | **Long**| dfs rootfs id | [optional]
 **dfsPathId** | **Long**| dfs path id | [optional]
 **dfsStorageClassId** | **Long**| dfs class id | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsStoragePoliciesResp**](DfsStoragePoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unlinkDfsStoragePolicyAndDfsPath"></a>
# **unlinkDfsStoragePolicyAndDfsPath**
> DfsStoragePolicyResp unlinkDfsStoragePolicyAndDfsPath(body, dfsStoragePolicyId)



Policy unlink Path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
DfsStoragePolicyUnlinkDfsPathReq body = new DfsStoragePolicyUnlinkDfsPathReq(); // DfsStoragePolicyUnlinkDfsPathReq | policy info
Long dfsStoragePolicyId = 789L; // Long | dfs storage policy id
try {
    DfsStoragePolicyResp result = apiInstance.unlinkDfsStoragePolicyAndDfsPath(body, dfsStoragePolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#unlinkDfsStoragePolicyAndDfsPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStoragePolicyUnlinkDfsPathReq**](DfsStoragePolicyUnlinkDfsPathReq.md)| policy info |
 **dfsStoragePolicyId** | **Long**| dfs storage policy id |

### Return type

[**DfsStoragePolicyResp**](DfsStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsStoragePolicy"></a>
# **updateDfsStoragePolicy**
> DfsStoragePolicyResp updateDfsStoragePolicy(dfsStoragePolicyId, body)



Update dfs storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStoragePoliciesApi;

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

DfsStoragePoliciesApi apiInstance = new DfsStoragePoliciesApi();
Long dfsStoragePolicyId = 789L; // Long | dfs storage policy id
DfsStoragePolicyUpdateReq body = new DfsStoragePolicyUpdateReq(); // DfsStoragePolicyUpdateReq | storagepolicy info
try {
    DfsStoragePolicyResp result = apiInstance.updateDfsStoragePolicy(dfsStoragePolicyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStoragePoliciesApi#updateDfsStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStoragePolicyId** | **Long**| dfs storage policy id |
 **body** | [**DfsStoragePolicyUpdateReq**](DfsStoragePolicyUpdateReq.md)| storagepolicy info | [optional]

### Return type

[**DfsStoragePolicyResp**](DfsStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

