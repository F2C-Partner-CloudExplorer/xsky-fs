# DfsTiersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsTierPools**](DfsTiersApi.md#addDfsTierPools) | **POST** /v1/dfs-tiers/{dfs_tier_id}:add-pools | 
[**getDfsTier**](DfsTiersApi.md#getDfsTier) | **GET** /v1/dfs-tiers/{dfs_tier_id} | 
[**listDfsTiers**](DfsTiersApi.md#listDfsTiers) | **GET** /v1/dfs-tiers/ | 
[**removeDfsTierPools**](DfsTiersApi.md#removeDfsTierPools) | **POST** /v1/dfs-tiers/{dfs_tier_id}:remove-pools | 

<a name="addDfsTierPools"></a>
# **addDfsTierPools**
> DfsTierResp addDfsTierPools(body, dfsTierId)



add dfs tier pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTiersApi;

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

DfsTiersApi apiInstance = new DfsTiersApi();
DfsTierAddPoolReq body = new DfsTierAddPoolReq(); // DfsTierAddPoolReq | pools info
Long dfsTierId = 789L; // Long | dfs tier id
try {
    DfsTierResp result = apiInstance.addDfsTierPools(body, dfsTierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTiersApi#addDfsTierPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTierAddPoolReq**](DfsTierAddPoolReq.md)| pools info |
 **dfsTierId** | **Long**| dfs tier id |

### Return type

[**DfsTierResp**](DfsTierResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDfsTier"></a>
# **getDfsTier**
> DfsTierResp getDfsTier(dfsTierId)



Get dfs tier

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTiersApi;

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

DfsTiersApi apiInstance = new DfsTiersApi();
Long dfsTierId = 789L; // Long | dfs tier id
try {
    DfsTierResp result = apiInstance.getDfsTier(dfsTierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTiersApi#getDfsTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsTierId** | **Long**| dfs tier id |

### Return type

[**DfsTierResp**](DfsTierResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsTiers"></a>
# **listDfsTiers**
> DfsTiersResp listDfsTiers(limit, offset, clusterId, dfsRootfsId, q, sort)



List dfs tiers

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTiersApi;

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

DfsTiersApi apiInstance = new DfsTiersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsTiersResp result = apiInstance.listDfsTiers(limit, offset, clusterId, dfsRootfsId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTiersApi#listDfsTiers");
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
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsTiersResp**](DfsTiersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsTierPools"></a>
# **removeDfsTierPools**
> DfsTierResp removeDfsTierPools(body, dfsTierId)



remove dfs tier pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsTiersApi;

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

DfsTiersApi apiInstance = new DfsTiersApi();
DfsTierRemovePoolReq body = new DfsTierRemovePoolReq(); // DfsTierRemovePoolReq | pools info
Long dfsTierId = 789L; // Long | dfs tier id
try {
    DfsTierResp result = apiInstance.removeDfsTierPools(body, dfsTierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsTiersApi#removeDfsTierPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsTierRemovePoolReq**](DfsTierRemovePoolReq.md)| pools info |
 **dfsTierId** | **Long**| dfs tier id |

### Return type

[**DfsTierResp**](DfsTierResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

