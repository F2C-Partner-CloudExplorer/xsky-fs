# DpDfsSnapshotsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpDfsSnapshot**](DpDfsSnapshotsApi.md#createDpDfsSnapshot) | **POST** /v1/dp-dfs-snapshots/ | 
[**deleteDPDfsSnapshot**](DpDfsSnapshotsApi.md#deleteDPDfsSnapshot) | **DELETE** /v1/dp-dfs-snapshots/{dp_dfs_snapshot_id} | 
[**getDpDfsSnapshot**](DpDfsSnapshotsApi.md#getDpDfsSnapshot) | **GET** /v1/dp-dfs-snapshots/{dp_dfs_snapshot_id} | 
[**listDpDfsSnapshots**](DpDfsSnapshotsApi.md#listDpDfsSnapshots) | **GET** /v1/dp-dfs-snapshots/ | 
[**listDpDfsSnapshotsByDfsPathName**](DpDfsSnapshotsApi.md#listDpDfsSnapshotsByDfsPathName) | **POST** /v1/dp-dfs-snapshots/_search | 

<a name="createDpDfsSnapshot"></a>
# **createDpDfsSnapshot**
> DpDfsSnapshotResp createDpDfsSnapshot(body, allowPathCreate)



Create dp dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotsApi;

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

DpDfsSnapshotsApi apiInstance = new DpDfsSnapshotsApi();
DpDfsSnapshotCreateReq body = new DpDfsSnapshotCreateReq(); // DpDfsSnapshotCreateReq | dp dfs snapshot info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DpDfsSnapshotResp result = apiInstance.createDpDfsSnapshot(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotsApi#createDpDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpDfsSnapshotCreateReq**](DpDfsSnapshotCreateReq.md)| dp dfs snapshot info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DpDfsSnapshotResp**](DpDfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDPDfsSnapshot"></a>
# **deleteDPDfsSnapshot**
> DpDfsSnapshotResp deleteDPDfsSnapshot(dpDfsSnapshotId)



Delete a dp dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotsApi;

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

DpDfsSnapshotsApi apiInstance = new DpDfsSnapshotsApi();
Long dpDfsSnapshotId = 789L; // Long | dp dfs snapshot id
try {
    DpDfsSnapshotResp result = apiInstance.deleteDPDfsSnapshot(dpDfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotsApi#deleteDPDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dpDfsSnapshotId** | **Long**| dp dfs snapshot id |

### Return type

[**DpDfsSnapshotResp**](DpDfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpDfsSnapshot"></a>
# **getDpDfsSnapshot**
> DpDfsSnapshotResp getDpDfsSnapshot(dpDfsSnapshotId)



get dp dfs snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotsApi;

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

DpDfsSnapshotsApi apiInstance = new DpDfsSnapshotsApi();
Long dpDfsSnapshotId = 789L; // Long | the dp dfs snapshot id
try {
    DpDfsSnapshotResp result = apiInstance.getDpDfsSnapshot(dpDfsSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotsApi#getDpDfsSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dpDfsSnapshotId** | **Long**| the dp dfs snapshot id |

### Return type

[**DpDfsSnapshotResp**](DpDfsSnapshotResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpDfsSnapshots"></a>
# **listDpDfsSnapshots**
> DpDfsSnapshotsResp listDpDfsSnapshots(limit, offset, q, sort, policyId, pathId)



List dp dfs snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotsApi;

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

DpDfsSnapshotsApi apiInstance = new DpDfsSnapshotsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long policyId = 789L; // Long | related dp dfs snapshot policy id
Long pathId = 789L; // Long | related dfs path id
try {
    DpDfsSnapshotsResp result = apiInstance.listDpDfsSnapshots(limit, offset, q, sort, policyId, pathId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotsApi#listDpDfsSnapshots");
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
 **policyId** | **Long**| related dp dfs snapshot policy id | [optional]
 **pathId** | **Long**| related dfs path id | [optional]

### Return type

[**DpDfsSnapshotsResp**](DpDfsSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpDfsSnapshotsByDfsPathName"></a>
# **listDpDfsSnapshotsByDfsPathName**
> DpDfsSnapshotsResp listDpDfsSnapshotsByDfsPathName()



List dp dfs snapshots by name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotsApi;

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

DpDfsSnapshotsApi apiInstance = new DpDfsSnapshotsApi();
try {
    DpDfsSnapshotsResp result = apiInstance.listDpDfsSnapshotsByDfsPathName();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotsApi#listDpDfsSnapshotsByDfsPathName");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DpDfsSnapshotsResp**](DpDfsSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

