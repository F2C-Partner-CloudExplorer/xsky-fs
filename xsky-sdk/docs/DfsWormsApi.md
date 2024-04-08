# DfsWormsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsWorm**](DfsWormsApi.md#createDfsWorm) | **POST** /v1/dfs-worms/ | 
[**deleteDfsWorm**](DfsWormsApi.md#deleteDfsWorm) | **DELETE** /v1/dfs-worms/{dfs_worm_id} | 
[**getDfsWorm**](DfsWormsApi.md#getDfsWorm) | **GET** /v1/dfs-worms/{dfs_worm_id} | 
[**listDfsWorms**](DfsWormsApi.md#listDfsWorms) | **GET** /v1/dfs-worms/ | 
[**updateDfsWorm**](DfsWormsApi.md#updateDfsWorm) | **PATCH** /v1/dfs-worms/{dfs_worm_id} | 

<a name="createDfsWorm"></a>
# **createDfsWorm**
> DfsWormResp createDfsWorm(body, allowPathCreate)



Create dfs worm

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsWormsApi;

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

DfsWormsApi apiInstance = new DfsWormsApi();
DfsWormCreateReq body = new DfsWormCreateReq(); // DfsWormCreateReq | worm info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsWormResp result = apiInstance.createDfsWorm(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsWormsApi#createDfsWorm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsWormCreateReq**](DfsWormCreateReq.md)| worm info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsWormResp**](DfsWormResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsWorm"></a>
# **deleteDfsWorm**
> DfsWormResp deleteDfsWorm(dfsWormId)



delete dfs worm

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsWormsApi;

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

DfsWormsApi apiInstance = new DfsWormsApi();
Long dfsWormId = 789L; // Long | worm id
try {
    DfsWormResp result = apiInstance.deleteDfsWorm(dfsWormId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsWormsApi#deleteDfsWorm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsWormId** | **Long**| worm id |

### Return type

[**DfsWormResp**](DfsWormResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsWorm"></a>
# **getDfsWorm**
> DfsWormResp getDfsWorm(dfsWormId)



get dfs worm

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsWormsApi;

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

DfsWormsApi apiInstance = new DfsWormsApi();
Long dfsWormId = 789L; // Long | the dfs worm id
try {
    DfsWormResp result = apiInstance.getDfsWorm(dfsWormId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsWormsApi#getDfsWorm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsWormId** | **Long**| the dfs worm id |

### Return type

[**DfsWormResp**](DfsWormResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsWorms"></a>
# **listDfsWorms**
> DfsWormsResp listDfsWorms(clusterId, dfsPathId, path, limit, offset, q, sort)



List dfs worms

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsWormsApi;

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

DfsWormsApi apiInstance = new DfsWormsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long dfsPathId = 789L; // Long | related dfs path id
String path = "path_example"; // String | related dfs path
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsWormsResp result = apiInstance.listDfsWorms(clusterId, dfsPathId, path, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsWormsApi#listDfsWorms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **dfsPathId** | **Long**| related dfs path id | [optional]
 **path** | **String**| related dfs path | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsWormsResp**](DfsWormsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsWorm"></a>
# **updateDfsWorm**
> DfsWormResp updateDfsWorm(body, dfsWormId)



Update dfs worm

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsWormsApi;

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

DfsWormsApi apiInstance = new DfsWormsApi();
DfsWormUpdateReq body = new DfsWormUpdateReq(); // DfsWormUpdateReq | dfs worm info
Long dfsWormId = 789L; // Long | dfs worm id
try {
    DfsWormResp result = apiInstance.updateDfsWorm(body, dfsWormId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsWormsApi#updateDfsWorm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsWormUpdateReq**](DfsWormUpdateReq.md)| dfs worm info |
 **dfsWormId** | **Long**| dfs worm id |

### Return type

[**DfsWormResp**](DfsWormResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

