# DfsNfsSharesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsNFSShareACLs**](DfsNfsSharesApi.md#addDfsNFSShareACLs) | **POST** /v1/dfs-nfs-shares/{dfs_nfs_share_id}:add-acls | 
[**createDfsNFSShare**](DfsNfsSharesApi.md#createDfsNFSShare) | **POST** /v1/dfs-nfs-shares/ | 
[**deleteDfsNFSShare**](DfsNfsSharesApi.md#deleteDfsNFSShare) | **DELETE** /v1/dfs-nfs-shares/{dfs_nfs_share_id} | 
[**getDfsNFSShare**](DfsNfsSharesApi.md#getDfsNFSShare) | **GET** /v1/dfs-nfs-shares/{dfs_nfs_share_id} | 
[**listDfsNFSShares**](DfsNfsSharesApi.md#listDfsNFSShares) | **GET** /v1/dfs-nfs-shares/ | 
[**removeDfsNFSShareACLs**](DfsNfsSharesApi.md#removeDfsNFSShareACLs) | **POST** /v1/dfs-nfs-shares/{dfs_nfs_share_id}:remove-acls | 
[**setDfsNFSShareACLs**](DfsNfsSharesApi.md#setDfsNFSShareACLs) | **POST** /v1/dfs-nfs-shares/{dfs_nfs_share_id}:set-acls | 
[**updateDfsNFSShare**](DfsNfsSharesApi.md#updateDfsNFSShare) | **PATCH** /v1/dfs-nfs-shares/{dfs_nfs_share_id} | 
[**updateDfsNFSShareACLs**](DfsNfsSharesApi.md#updateDfsNFSShareACLs) | **POST** /v1/dfs-nfs-shares/{dfs_nfs_share_id}:update-acls | 

<a name="addDfsNFSShareACLs"></a>
# **addDfsNFSShareACLs**
> DfsNFSShareResp addDfsNFSShareACLs(body, dfsNfsShareId)



Add dfs nfs shares acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareAddACLsReq body = new DfsNFSShareAddACLsReq(); // DfsNFSShareAddACLsReq | share acls info
Long dfsNfsShareId = 789L; // Long | dfs nfs shares id
try {
    DfsNFSShareResp result = apiInstance.addDfsNFSShareACLs(body, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#addDfsNFSShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareAddACLsReq**](DfsNFSShareAddACLsReq.md)| share acls info |
 **dfsNfsShareId** | **Long**| dfs nfs shares id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsNFSShare"></a>
# **createDfsNFSShare**
> DfsNFSShareResp createDfsNFSShare(body, allowPathCreate)



Create dfs nfs shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareCreateReq body = new DfsNFSShareCreateReq(); // DfsNFSShareCreateReq | share info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsNFSShareResp result = apiInstance.createDfsNFSShare(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#createDfsNFSShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareCreateReq**](DfsNFSShareCreateReq.md)| share info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsNFSShare"></a>
# **deleteDfsNFSShare**
> DfsNFSShareResp deleteDfsNFSShare(dfsNfsShareId, force, withDirectory)



delete dfs nfs shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
Long dfsNfsShareId = 789L; // Long | share id
Boolean force = true; // Boolean | force delete or not
Boolean withDirectory = true; // Boolean | also delete directory
try {
    DfsNFSShareResp result = apiInstance.deleteDfsNFSShare(dfsNfsShareId, force, withDirectory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#deleteDfsNFSShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsNfsShareId** | **Long**| share id |
 **force** | **Boolean**| force delete or not | [optional]
 **withDirectory** | **Boolean**| also delete directory | [optional]

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsNFSShare"></a>
# **getDfsNFSShare**
> DfsNFSShareResp getDfsNFSShare(dfsNfsShareId)



Get dfs nfs shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
Long dfsNfsShareId = 789L; // Long | share id
try {
    DfsNFSShareResp result = apiInstance.getDfsNFSShare(dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#getDfsNFSShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsNfsShareId** | **Long**| share id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsNFSShares"></a>
# **listDfsNFSShares**
> DfsNFSSharesResp listDfsNFSShares(limit, offset, dfsRootfsId, path, dfsGatewayGroupId, nfsVersions, q, sort, clusterId)



List dfs nfs sharess

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String path = "path_example"; // String | related dfs path
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
String nfsVersions = "nfsVersions_example"; // String | nfs share version
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsNFSSharesResp result = apiInstance.listDfsNFSShares(limit, offset, dfsRootfsId, path, dfsGatewayGroupId, nfsVersions, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#listDfsNFSShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **dfsRootfsId** | **Long**| dfs rootfs id | [optional]
 **path** | **String**| related dfs path | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id | [optional]
 **nfsVersions** | **String**| nfs share version | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsNFSSharesResp**](DfsNFSSharesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsNFSShareACLs"></a>
# **removeDfsNFSShareACLs**
> DfsNFSShareResp removeDfsNFSShareACLs(body, dfsNfsShareId)



remove dfs nfs shares acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareRemoveACLsReq body = new DfsNFSShareRemoveACLsReq(); // DfsNFSShareRemoveACLsReq | share acls info
Long dfsNfsShareId = 789L; // Long | dfs nfs shares id
try {
    DfsNFSShareResp result = apiInstance.removeDfsNFSShareACLs(body, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#removeDfsNFSShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareRemoveACLsReq**](DfsNFSShareRemoveACLsReq.md)| share acls info |
 **dfsNfsShareId** | **Long**| dfs nfs shares id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDfsNFSShareACLs"></a>
# **setDfsNFSShareACLs**
> DfsNFSShareResp setDfsNFSShareACLs(body, dfsNfsShareId)



Set all acls of dfs nfs share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareSetACLsReq body = new DfsNFSShareSetACLsReq(); // DfsNFSShareSetACLsReq | share info
Long dfsNfsShareId = 789L; // Long | share id
try {
    DfsNFSShareResp result = apiInstance.setDfsNFSShareACLs(body, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#setDfsNFSShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareSetACLsReq**](DfsNFSShareSetACLsReq.md)| share info |
 **dfsNfsShareId** | **Long**| share id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsNFSShare"></a>
# **updateDfsNFSShare**
> DfsNFSShareResp updateDfsNFSShare(body, dfsNfsShareId)



update dfs nfs shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareUpdateReq body = new DfsNFSShareUpdateReq(); // DfsNFSShareUpdateReq | share info
Long dfsNfsShareId = 789L; // Long | share id
try {
    DfsNFSShareResp result = apiInstance.updateDfsNFSShare(body, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#updateDfsNFSShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareUpdateReq**](DfsNFSShareUpdateReq.md)| share info |
 **dfsNfsShareId** | **Long**| share id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsNFSShareACLs"></a>
# **updateDfsNFSShareACLs**
> DfsNFSShareResp updateDfsNFSShareACLs(body, dfsNfsShareId)



Update dfs nfs share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsSharesApi;

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

DfsNfsSharesApi apiInstance = new DfsNfsSharesApi();
DfsNFSShareUpdateACLsReq body = new DfsNFSShareUpdateACLsReq(); // DfsNFSShareUpdateACLsReq | share info
Long dfsNfsShareId = 789L; // Long | share id
try {
    DfsNFSShareResp result = apiInstance.updateDfsNFSShareACLs(body, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsSharesApi#updateDfsNFSShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsNFSShareUpdateACLsReq**](DfsNFSShareUpdateACLsReq.md)| share info |
 **dfsNfsShareId** | **Long**| share id |

### Return type

[**DfsNFSShareResp**](DfsNFSShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

