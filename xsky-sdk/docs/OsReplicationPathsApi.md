# OsReplicationPathsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSReplicationPath**](OsReplicationPathsApi.md#getOSReplicationPath) | **GET** /v1/os-replication-paths/{path_uuid} | 
[**listOSReplicationPaths**](OsReplicationPathsApi.md#listOSReplicationPaths) | **GET** /v1/os-replication-paths/ | 

<a name="getOSReplicationPath"></a>
# **getOSReplicationPath**
> OSReplicationPathResp getOSReplicationPath(pathUuid)



Get a os replication path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationPathsApi;

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

OsReplicationPathsApi apiInstance = new OsReplicationPathsApi();
String pathUuid = "pathUuid_example"; // String | replication path uuid
try {
    OSReplicationPathResp result = apiInstance.getOSReplicationPath(pathUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationPathsApi#getOSReplicationPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pathUuid** | **String**| replication path uuid |

### Return type

[**OSReplicationPathResp**](OSReplicationPathResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSReplicationPaths"></a>
# **listOSReplicationPaths**
> OSReplicationPathsResp listOSReplicationPaths(limit, offset, marker, replicationUuid, allowUnknownZone, clusterId)



List os replication paths

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationPathsApi;

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

OsReplicationPathsApi apiInstance = new OsReplicationPathsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String marker = "marker_example"; // String | paging param
String replicationUuid = "replicationUuid_example"; // String | os replication uuid
Boolean allowUnknownZone = true; // Boolean | allow has nil zone result(default true)
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSReplicationPathsResp result = apiInstance.listOSReplicationPaths(limit, offset, marker, replicationUuid, allowUnknownZone, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationPathsApi#listOSReplicationPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **marker** | **String**| paging param | [optional]
 **replicationUuid** | **String**| os replication uuid | [optional]
 **allowUnknownZone** | **Boolean**| allow has nil zone result(default true) | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSReplicationPathsResp**](OSReplicationPathsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

