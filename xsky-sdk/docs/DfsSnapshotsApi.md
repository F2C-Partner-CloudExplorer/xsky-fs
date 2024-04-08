# DfsSnapshotsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsSnapshot**](DfsSnapshotsApi.md#createDfsSnapshot) | **POST** /v1/dfs-snapshots/ | 
[**deleteDfsSnapshot**](DfsSnapshotsApi.md#deleteDfsSnapshot) | **DELETE** /v1/dfs-snapshots/{dfs_snapshot_id} | 
[**getDfsSnapshot**](DfsSnapshotsApi.md#getDfsSnapshot) | **GET** /v1/dfs-snapshots/{dfs_snapshot_id} | 
[**getDfsSnapshotsOverViewPage**](DfsSnapshotsApi.md#getDfsSnapshotsOverViewPage) | **GET** /v1/dfs-snapshots/overview | 
[**listDfsSnapshots**](DfsSnapshotsApi.md#listDfsSnapshots) | **GET** /v1/dfs-snapshots/ | 
[**lockDfsSnapshot**](DfsSnapshotsApi.md#lockDfsSnapshot) | **POST** /v1/dfs-snapshots/{dfs_snapshot_id}:lock | 
[**rollbackDfsSnapshot**](DfsSnapshotsApi.md#rollbackDfsSnapshot) | **POST** /v1/dfs-snapshots/{dfs_snapshot_id}:rollback | 
[**unlockDfsSnapshot**](DfsSnapshotsApi.md#unlockDfsSnapshot) | **POST** /v1/dfs-snapshots/{dfs_snapshot_id}:unlock | 
[**updateDfsSnapshot**](DfsSnapshotsApi.md#updateDfsSnapshot) | **PATCH** /v1/dfs-snapshots/{dfs_snapshot_id} | 

<a name="createDfsSnapshot"></a>
# **createDfsSnapshot**
> DfsSnapshotResp createDfsSnapshot(body, allowPathCreate)



Create dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
DfsSnapshotCreateReq body = new DfsSnapshotCreateReq(); // DfsSnapshotCreateReq | dfs snapshot info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsSnapshotResp result = apiInstance.createDfsSnapshot(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#createDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSnapshotCreateReq**](DfsSnapshotCreateReq.md)| dfs snapshot info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsSnapshot"></a>
# **deleteDfsSnapshot**
> DfsSnapshotResp deleteDfsSnapshot(dfsSnapshotId)



Delete a dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
Long dfsSnapshotId = 789L; // Long | dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.deleteDfsSnapshot(dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#deleteDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapshotId** | **Long**| dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsSnapshot"></a>
# **getDfsSnapshot**
> DfsSnapshotResp getDfsSnapshot(dfsSnapshotId)



get dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
Long dfsSnapshotId = 789L; // Long | the dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.getDfsSnapshot(dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#getDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapshotId** | **Long**| the dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsSnapshotsOverViewPage"></a>
# **getDfsSnapshotsOverViewPage**
> DfsSnapShotsOverviewPageResp getDfsSnapshotsOverViewPage()



get dfs snapshots overview page

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
try {
    DfsSnapShotsOverviewPageResp result = apiInstance.getDfsSnapshotsOverViewPage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#getDfsSnapshotsOverViewPage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DfsSnapShotsOverviewPageResp**](DfsSnapShotsOverviewPageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsSnapshots"></a>
# **listDfsSnapshots**
> DfsSnapshotsResp listDfsSnapshots(clusterId, dfsPathId, dpDfsSnapshotId, path, name, limit, offset, q, sort)



List dfs snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long dfsPathId = 789L; // Long | related dfs path id
Long dpDfsSnapshotId = 789L; // Long | dp dfs snapshot id
String path = "path_example"; // String | related dfs path
String name = "name_example"; // String | name of dfs snapshot
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsSnapshotsResp result = apiInstance.listDfsSnapshots(clusterId, dfsPathId, dpDfsSnapshotId, path, name, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#listDfsSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **dfsPathId** | **Long**| related dfs path id | [optional]
 **dpDfsSnapshotId** | **Long**| dp dfs snapshot id | [optional]
 **path** | **String**| related dfs path | [optional]
 **name** | **String**| name of dfs snapshot | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsSnapshotsResp**](DfsSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lockDfsSnapshot"></a>
# **lockDfsSnapshot**
> DfsSnapshotResp lockDfsSnapshot(dfsSnapshotId)



Lock dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
Long dfsSnapshotId = 789L; // Long | dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.lockDfsSnapshot(dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#lockDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapshotId** | **Long**| dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rollbackDfsSnapshot"></a>
# **rollbackDfsSnapshot**
> DfsSnapshotResp rollbackDfsSnapshot(body, dfsSnapshotId)



Rollback dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
DfsSnapshotRollbackReq body = new DfsSnapshotRollbackReq(); // DfsSnapshotRollbackReq | snapshot rollback info
Long dfsSnapshotId = 789L; // Long | dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.rollbackDfsSnapshot(body, dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#rollbackDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSnapshotRollbackReq**](DfsSnapshotRollbackReq.md)| snapshot rollback info |
 **dfsSnapshotId** | **Long**| dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockDfsSnapshot"></a>
# **unlockDfsSnapshot**
> DfsSnapshotResp unlockDfsSnapshot(dfsSnapshotId)



Unlock dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
Long dfsSnapshotId = 789L; // Long | dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.unlockDfsSnapshot(dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#unlockDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsSnapshotId** | **Long**| dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsSnapshot"></a>
# **updateDfsSnapshot**
> DfsSnapshotResp updateDfsSnapshot(body, dfsSnapshotId)



Update dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSnapshotsApi;

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

DfsSnapshotsApi apiInstance = new DfsSnapshotsApi();
DfsSnapshotUpdateReq body = new DfsSnapshotUpdateReq(); // DfsSnapshotUpdateReq | dfs snapshot info
Long dfsSnapshotId = 789L; // Long | dfs snapshot id
try {
    DfsSnapshotResp result = apiInstance.updateDfsSnapshot(body, dfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSnapshotsApi#updateDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSnapshotUpdateReq**](DfsSnapshotUpdateReq.md)| dfs snapshot info |
 **dfsSnapshotId** | **Long**| dfs snapshot id |

### Return type

[**DfsSnapshotResp**](DfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

