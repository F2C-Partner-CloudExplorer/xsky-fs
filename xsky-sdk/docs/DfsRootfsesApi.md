# DfsRootfsesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsRootfs**](DfsRootfsesApi.md#createDfsRootfs) | **POST** /v1/dfs-rootfses/ | 
[**deleteDfsRootfs**](DfsRootfsesApi.md#deleteDfsRootfs) | **DELETE** /v1/dfs-rootfses/{dfs_rootfs_id} | 
[**getDfsRootfs**](DfsRootfsesApi.md#getDfsRootfs) | **GET** /v1/dfs-rootfses/{dfs_rootfs_id} | 
[**getDfsRootfsSamples**](DfsRootfsesApi.md#getDfsRootfsSamples) | **GET** /v1/dfs-rootfses/{dfs_rootfs_id}/samples | 
[**listDfsRootfses**](DfsRootfsesApi.md#listDfsRootfses) | **GET** /v1/dfs-rootfses/ | 
[**setDfsWormLogPath**](DfsRootfsesApi.md#setDfsWormLogPath) | **PATCH** /v1/dfs-rootfses/{dfs_rootfs_id}:set-worm-log-path | 
[**setGCSpeed**](DfsRootfsesApi.md#setGCSpeed) | **POST** /v1/dfs-rootfses/{dfs_rootfs_id}:set-gc-speed | 
[**updateDfsRootfsActivePool**](DfsRootfsesApi.md#updateDfsRootfsActivePool) | **PATCH** /v1/dfs-rootfses/{dfs_rootfs_id}:update-active-pools | 

<a name="createDfsRootfs"></a>
# **createDfsRootfs**
> DfsRootfsResp createDfsRootfs(body)



Create dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
DfsRootfsCreateReq body = new DfsRootfsCreateReq(); // DfsRootfsCreateReq | rootfs info
try {
    DfsRootfsResp result = apiInstance.createDfsRootfs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#createDfsRootfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsRootfsCreateReq**](DfsRootfsCreateReq.md)| rootfs info |

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsRootfs"></a>
# **deleteDfsRootfs**
> DfsRootfsResp deleteDfsRootfs(dfsRootfsId, force)



delete dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
Long dfsRootfsId = 789L; // Long | rootfs id
Boolean force = true; // Boolean | force delete
try {
    DfsRootfsResp result = apiInstance.deleteDfsRootfs(dfsRootfsId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#deleteDfsRootfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsRootfsId** | **Long**| rootfs id |
 **force** | **Boolean**| force delete | [optional]

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsRootfs"></a>
# **getDfsRootfs**
> DfsRootfsResp getDfsRootfs(dfsRootfsId)



Get dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
Long dfsRootfsId = 789L; // Long | rootfs id
try {
    DfsRootfsResp result = apiInstance.getDfsRootfs(dfsRootfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#getDfsRootfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsRootfsId** | **Long**| rootfs id |

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsRootfsSamples"></a>
# **getDfsRootfsSamples**
> DfsRootfsSamplesResp getDfsRootfsSamples(dfsRootfsId, durationBegin, durationEnd, period)



get a dfs rootfs&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsRootfsSamplesResp result = apiInstance.getDfsRootfsSamples(dfsRootfsId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#getDfsRootfsSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsRootfsId** | **Long**| dfs rootfs id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsRootfsSamplesResp**](DfsRootfsSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsRootfses"></a>
# **listDfsRootfses**
> DfsRootfsesResp listDfsRootfses(limit, offset, q, sort, clusterId, poolId, fsUserId, fsUserGroupId)



List dfs rootfses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long poolId = 789L; // Long | pool id
Long fsUserId = 789L; // Long | fs user id
Long fsUserGroupId = 789L; // Long | fs user group id
try {
    DfsRootfsesResp result = apiInstance.listDfsRootfses(limit, offset, q, sort, clusterId, poolId, fsUserId, fsUserGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#listDfsRootfses");
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
 **clusterId** | **String**| cluster id | [optional]
 **poolId** | **Long**| pool id | [optional]
 **fsUserId** | **Long**| fs user id | [optional]
 **fsUserGroupId** | **Long**| fs user group id | [optional]

### Return type

[**DfsRootfsesResp**](DfsRootfsesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setDfsWormLogPath"></a>
# **setDfsWormLogPath**
> DfsRootfsResp setDfsWormLogPath(body, dfsRootfsId, allowPathCreate)



Set dfs worm log path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
DfsRootfsSetWormLogPathReq body = new DfsRootfsSetWormLogPathReq(); // DfsRootfsSetWormLogPathReq | worm log path
Long dfsRootfsId = 789L; // Long | rootfs id
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsRootfsResp result = apiInstance.setDfsWormLogPath(body, dfsRootfsId, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#setDfsWormLogPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsRootfsSetWormLogPathReq**](DfsRootfsSetWormLogPathReq.md)| worm log path |
 **dfsRootfsId** | **Long**| rootfs id |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setGCSpeed"></a>
# **setGCSpeed**
> DfsRootfsResp setGCSpeed(body, dfsRootfsId)



Set gc speed of dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
DfsRootfsSetGCSpeedReq body = new DfsRootfsSetGCSpeedReq(); // DfsRootfsSetGCSpeedReq | gc speed
Long dfsRootfsId = 789L; // Long | rootfs id
try {
    DfsRootfsResp result = apiInstance.setGCSpeed(body, dfsRootfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#setGCSpeed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsRootfsSetGCSpeedReq**](DfsRootfsSetGCSpeedReq.md)| gc speed |
 **dfsRootfsId** | **Long**| rootfs id |

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsRootfsActivePool"></a>
# **updateDfsRootfsActivePool**
> DfsRootfsResp updateDfsRootfsActivePool(body, dfsRootfsId)



Update dfs rootfs active pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsRootfsesApi;

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

DfsRootfsesApi apiInstance = new DfsRootfsesApi();
DfsRootfsUpdateActivePoolReq body = new DfsRootfsUpdateActivePoolReq(); // DfsRootfsUpdateActivePoolReq | active pool ids
Long dfsRootfsId = 789L; // Long | rootfs id
try {
    DfsRootfsResp result = apiInstance.updateDfsRootfsActivePool(body, dfsRootfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsRootfsesApi#updateDfsRootfsActivePool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsRootfsUpdateActivePoolReq**](DfsRootfsUpdateActivePoolReq.md)| active pool ids |
 **dfsRootfsId** | **Long**| rootfs id |

### Return type

[**DfsRootfsResp**](DfsRootfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

