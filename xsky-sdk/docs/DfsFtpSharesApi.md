# DfsFtpSharesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsFTPShareACLs**](DfsFtpSharesApi.md#addDfsFTPShareACLs) | **POST** /v1/dfs-ftp-shares/{dfs_ftp_share_id}:add-acls | 
[**createDfsFTPShare**](DfsFtpSharesApi.md#createDfsFTPShare) | **POST** /v1/dfs-ftp-shares/ | 
[**deleteDfsFTPShare**](DfsFtpSharesApi.md#deleteDfsFTPShare) | **DELETE** /v1/dfs-ftp-shares/{dfs_ftp_share_id} | 
[**getDfsFTPShare**](DfsFtpSharesApi.md#getDfsFTPShare) | **GET** /v1/dfs-ftp-shares/{dfs_ftp_share_id} | 
[**listDfsFTPShares**](DfsFtpSharesApi.md#listDfsFTPShares) | **GET** /v1/dfs-ftp-shares/ | 
[**removeDfsFTPShareACLs**](DfsFtpSharesApi.md#removeDfsFTPShareACLs) | **POST** /v1/dfs-ftp-shares/{dfs_ftp_share_id}:remove-acls | 
[**updateDfsFTPShare**](DfsFtpSharesApi.md#updateDfsFTPShare) | **PATCH** /v1/dfs-ftp-shares/{dfs_ftp_share_id} | 
[**updateDfsFTPShareACLs**](DfsFtpSharesApi.md#updateDfsFTPShareACLs) | **POST** /v1/dfs-ftp-shares/{dfs_ftp_share_id}:update-acls | 

<a name="addDfsFTPShareACLs"></a>
# **addDfsFTPShareACLs**
> DfsFTPShareResp addDfsFTPShareACLs(body, dfsFtpShareId)



Add dfs ftp share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
DfsFTPShareAddACLsReq body = new DfsFTPShareAddACLsReq(); // DfsFTPShareAddACLsReq | ftp share acls info
Long dfsFtpShareId = 789L; // Long | dfs ftp share id
try {
    DfsFTPShareResp result = apiInstance.addDfsFTPShareACLs(body, dfsFtpShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#addDfsFTPShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFTPShareAddACLsReq**](DfsFTPShareAddACLsReq.md)| ftp share acls info |
 **dfsFtpShareId** | **Long**| dfs ftp share id |

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsFTPShare"></a>
# **createDfsFTPShare**
> DfsFTPShareResp createDfsFTPShare(body, allowPathCreate)



Create dfs ftp share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
DfsFTPShareCreateReq body = new DfsFTPShareCreateReq(); // DfsFTPShareCreateReq | share info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsFTPShareResp result = apiInstance.createDfsFTPShare(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#createDfsFTPShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFTPShareCreateReq**](DfsFTPShareCreateReq.md)| share info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsFTPShare"></a>
# **deleteDfsFTPShare**
> DfsFTPShareResp deleteDfsFTPShare(dfsFtpShareId, force, withDirectory)



delete dfs ftp share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
Long dfsFtpShareId = 789L; // Long | share id
Boolean force = true; // Boolean | force delete or not
Boolean withDirectory = true; // Boolean | also delete directory
try {
    DfsFTPShareResp result = apiInstance.deleteDfsFTPShare(dfsFtpShareId, force, withDirectory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#deleteDfsFTPShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsFtpShareId** | **Long**| share id |
 **force** | **Boolean**| force delete or not | [optional]
 **withDirectory** | **Boolean**| also delete directory | [optional]

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsFTPShare"></a>
# **getDfsFTPShare**
> DfsFTPShareResp getDfsFTPShare(dfsFtpShareId)



Get dfs ftp share

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
Long dfsFtpShareId = 789L; // Long | share id
try {
    DfsFTPShareResp result = apiInstance.getDfsFTPShare(dfsFtpShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#getDfsFTPShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsFtpShareId** | **Long**| share id |

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsFTPShares"></a>
# **listDfsFTPShares**
> DfsFTPSharesResp listDfsFTPShares(limit, offset, clusterId, dfsRootfsId, path, dfsGatewayGroupId, q, sort)



List dfs ftp shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String path = "path_example"; // String | related dfs path
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsFTPSharesResp result = apiInstance.listDfsFTPShares(limit, offset, clusterId, dfsRootfsId, path, dfsGatewayGroupId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#listDfsFTPShares");
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
 **path** | **String**| related dfs path | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsFTPSharesResp**](DfsFTPSharesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsFTPShareACLs"></a>
# **removeDfsFTPShareACLs**
> DfsFTPShareResp removeDfsFTPShareACLs(body, dfsFtpShareId)



remove dfs ftp share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
DfsFTPShareRemoveACLsReq body = new DfsFTPShareRemoveACLsReq(); // DfsFTPShareRemoveACLsReq | share acls info
Long dfsFtpShareId = 789L; // Long | dfs ftp share id
try {
    DfsFTPShareResp result = apiInstance.removeDfsFTPShareACLs(body, dfsFtpShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#removeDfsFTPShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFTPShareRemoveACLsReq**](DfsFTPShareRemoveACLsReq.md)| share acls info |
 **dfsFtpShareId** | **Long**| dfs ftp share id |

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsFTPShare"></a>
# **updateDfsFTPShare**
> DfsFTPShareResp updateDfsFTPShare(body, dfsFtpShareId)



update dfs ftp shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
DfsFTPShareUpdateReq body = new DfsFTPShareUpdateReq(); // DfsFTPShareUpdateReq | share info
Long dfsFtpShareId = 789L; // Long | share id
try {
    DfsFTPShareResp result = apiInstance.updateDfsFTPShare(body, dfsFtpShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#updateDfsFTPShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFTPShareUpdateReq**](DfsFTPShareUpdateReq.md)| share info |
 **dfsFtpShareId** | **Long**| share id |

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsFTPShareACLs"></a>
# **updateDfsFTPShareACLs**
> DfsFTPShareResp updateDfsFTPShareACLs(body, dfsFtpShareId)



Update dfs ftp share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFtpSharesApi;

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

DfsFtpSharesApi apiInstance = new DfsFtpSharesApi();
DfsFTPShareUpdateACLsReq body = new DfsFTPShareUpdateACLsReq(); // DfsFTPShareUpdateACLsReq | ftp share acls info
Long dfsFtpShareId = 789L; // Long | ftp share id
try {
    DfsFTPShareResp result = apiInstance.updateDfsFTPShareACLs(body, dfsFtpShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFtpSharesApi#updateDfsFTPShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFTPShareUpdateACLsReq**](DfsFTPShareUpdateACLsReq.md)| ftp share acls info |
 **dfsFtpShareId** | **Long**| ftp share id |

### Return type

[**DfsFTPShareResp**](DfsFTPShareResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

