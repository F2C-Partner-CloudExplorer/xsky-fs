# DfsSmbSharesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsSMBShareACLs**](DfsSmbSharesApi.md#addDfsSMBShareACLs) | **POST** /v1/dfs-smb-shares/{dfs_smb_share_id}:add-acls | 
[**createDfsSMBShare**](DfsSmbSharesApi.md#createDfsSMBShare) | **POST** /v1/dfs-smb-shares/ | 
[**deleteDfsSMBShare**](DfsSmbSharesApi.md#deleteDfsSMBShare) | **DELETE** /v1/dfs-smb-shares/{dfs_smb_share_id} | 
[**getDfsSMBShare**](DfsSmbSharesApi.md#getDfsSMBShare) | **GET** /v1/dfs-smb-shares/{dfs_smb_share_id} | 
[**listDfsSMBShares**](DfsSmbSharesApi.md#listDfsSMBShares) | **GET** /v1/dfs-smb-shares/ | 
[**removeDfsSMBShareACLs**](DfsSmbSharesApi.md#removeDfsSMBShareACLs) | **POST** /v1/dfs-smb-shares/{dfs_smb_share_id}:remove-acls | 
[**updateDfsSMBShare**](DfsSmbSharesApi.md#updateDfsSMBShare) | **PATCH** /v1/dfs-smb-shares/{dfs_smb_share_id} | 
[**updateDfsSMBShareACLs**](DfsSmbSharesApi.md#updateDfsSMBShareACLs) | **POST** /v1/dfs-smb-shares/{dfs_smb_share_id}:update-acls | 

<a name="addDfsSMBShareACLs"></a>
# **addDfsSMBShareACLs**
> DfsSMBShareResp addDfsSMBShareACLs(body, dfsSmbShareId)



Add dfs smb share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
DfsSMBShareAddACLsReq body = new DfsSMBShareAddACLsReq(); // DfsSMBShareAddACLsReq | share acls info
Long dfsSmbShareId = 789L; // Long | dfs smb share id
try {
    DfsSMBShareResp result = apiInstance.addDfsSMBShareACLs(body, dfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#addDfsSMBShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBShareAddACLsReq**](DfsSMBShareAddACLsReq.md)| share acls info |
 **dfsSmbShareId** | **Long**| dfs smb share id |

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsSMBShare"></a>
# **createDfsSMBShare**
> DfsSMBShareResp createDfsSMBShare(body, allowPathCreate)



Create dfs smb share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
DfsSMBShareCreateReq body = new DfsSMBShareCreateReq(); // DfsSMBShareCreateReq | share info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsSMBShareResp result = apiInstance.createDfsSMBShare(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#createDfsSMBShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBShareCreateReq**](DfsSMBShareCreateReq.md)| share info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsSMBShare"></a>
# **deleteDfsSMBShare**
> DfsSMBShareResp deleteDfsSMBShare(dfsSmbShareId, force, withDirectory)



delete dfs smb share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
Long dfsSmbShareId = 789L; // Long | share id
Boolean force = true; // Boolean | force delete or not
Boolean withDirectory = true; // Boolean | also delete directory
try {
    DfsSMBShareResp result = apiInstance.deleteDfsSMBShare(dfsSmbShareId, force, withDirectory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#deleteDfsSMBShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSmbShareId** | **Long**| share id |
 **force** | **Boolean**| force delete or not | [optional]
 **withDirectory** | **Boolean**| also delete directory | [optional]

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsSMBShare"></a>
# **getDfsSMBShare**
> DfsSMBShareResp getDfsSMBShare(dfsSmbShareId)



Get dfs smb share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
Long dfsSmbShareId = 789L; // Long | share id
try {
    DfsSMBShareResp result = apiInstance.getDfsSMBShare(dfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#getDfsSMBShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSmbShareId** | **Long**| share id |

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsSMBShares"></a>
# **listDfsSMBShares**
> DfsSMBSharesResp listDfsSMBShares(limit, offset, clusterId, dfsRootfsId, dfsGatewayGroupId, q, path, sort)



List dfs smb shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsRootfsId = 789L; // Long | dfs rootfs id
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
String q = "q_example"; // String | query param of search
String path = "path_example"; // String | related dfs path
String sort = "sort_example"; // String | sort param of search
try {
    DfsSMBSharesResp result = apiInstance.listDfsSMBShares(limit, offset, clusterId, dfsRootfsId, dfsGatewayGroupId, q, path, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#listDfsSMBShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsRootfsId** | **Long**| dfs rootfs id | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id | [optional]
 **q** | **String**| query param of search | [optional]
 **path** | **String**| related dfs path | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsSMBSharesResp**](DfsSMBSharesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsSMBShareACLs"></a>
# **removeDfsSMBShareACLs**
> DfsSMBShareResp removeDfsSMBShareACLs(body, dfsSmbShareId)



remove dfs smb share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
DfsSMBShareRemoveACLsReq body = new DfsSMBShareRemoveACLsReq(); // DfsSMBShareRemoveACLsReq | share acls info
Long dfsSmbShareId = 789L; // Long | dfs smb share id
try {
    DfsSMBShareResp result = apiInstance.removeDfsSMBShareACLs(body, dfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#removeDfsSMBShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBShareRemoveACLsReq**](DfsSMBShareRemoveACLsReq.md)| share acls info |
 **dfsSmbShareId** | **Long**| dfs smb share id |

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsSMBShare"></a>
# **updateDfsSMBShare**
> DfsSMBShareResp updateDfsSMBShare(body, dfsSmbShareId)



Update dfs smb share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
DfsSMBShareUpdateReq body = new DfsSMBShareUpdateReq(); // DfsSMBShareUpdateReq | share info
Long dfsSmbShareId = 789L; // Long | share id
try {
    DfsSMBShareResp result = apiInstance.updateDfsSMBShare(body, dfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#updateDfsSMBShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBShareUpdateReq**](DfsSMBShareUpdateReq.md)| share info |
 **dfsSmbShareId** | **Long**| share id |

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsSMBShareACLs"></a>
# **updateDfsSMBShareACLs**
> DfsSMBShareResp updateDfsSMBShareACLs(body, dfsSmbShareId)



Update dfs smb share ACL

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbSharesApi;

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

DfsSmbSharesApi apiInstance = new DfsSmbSharesApi();
DfsSMBShareUpdateACLsReq body = new DfsSMBShareUpdateACLsReq(); // DfsSMBShareUpdateACLsReq | share acls info
Long dfsSmbShareId = 789L; // Long | share id
try {
    DfsSMBShareResp result = apiInstance.updateDfsSMBShareACLs(body, dfsSmbShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbSharesApi#updateDfsSMBShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBShareUpdateACLsReq**](DfsSMBShareUpdateACLsReq.md)| share acls info |
 **dfsSmbShareId** | **Long**| share id |

### Return type

[**DfsSMBShareResp**](DfsSMBShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

