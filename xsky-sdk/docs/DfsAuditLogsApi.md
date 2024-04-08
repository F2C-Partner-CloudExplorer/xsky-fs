# DfsAuditLogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsAuditLogs**](DfsAuditLogsApi.md#listDfsAuditLogs) | **GET** /v1/dfs-audit-logs/ | 
[**updateDfsAuditLog**](DfsAuditLogsApi.md#updateDfsAuditLog) | **PATCH** /v1/dfs-audit-logs/{dfs_audit_log_id} | 

<a name="listDfsAuditLogs"></a>
# **listDfsAuditLogs**
> DfsAuditLogsResp listDfsAuditLogs(clusterId, limit, offset, q, sort)



List dfs audit logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsAuditLogsApi;

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

DfsAuditLogsApi apiInstance = new DfsAuditLogsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsAuditLogsResp result = apiInstance.listDfsAuditLogs(clusterId, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsAuditLogsApi#listDfsAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsAuditLogsResp**](DfsAuditLogsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsAuditLog"></a>
# **updateDfsAuditLog**
> DfsAuditLogResp updateDfsAuditLog(body, dfsAuditLogId)



Update dfs audit log

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsAuditLogsApi;

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

DfsAuditLogsApi apiInstance = new DfsAuditLogsApi();
DfsAuditLogUpdateReq body = new DfsAuditLogUpdateReq(); // DfsAuditLogUpdateReq | dfs audit log info
Long dfsAuditLogId = 789L; // Long | dfs audit log id
try {
    DfsAuditLogResp result = apiInstance.updateDfsAuditLog(body, dfsAuditLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsAuditLogsApi#updateDfsAuditLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsAuditLogUpdateReq**](DfsAuditLogUpdateReq.md)| dfs audit log info |
 **dfsAuditLogId** | **Long**| dfs audit log id |

### Return type

[**DfsAuditLogResp**](DfsAuditLogResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

