# DfsNfsConnectionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsNFSConnections**](DfsNfsConnectionsApi.md#listDfsNFSConnections) | **GET** /v1/dfs-nfs-connections/ | 

<a name="listDfsNFSConnections"></a>
# **listDfsNFSConnections**
> DfsNFSConnectionsResp listDfsNFSConnections(limit, offset, clusterId, dfsNfsShareId, q, sort)



List dfs nfs connections

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsConnectionsApi;

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

DfsNfsConnectionsApi apiInstance = new DfsNfsConnectionsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsNfsShareId = 789L; // Long | dfs nfs share id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsNFSConnectionsResp result = apiInstance.listDfsNFSConnections(limit, offset, clusterId, dfsNfsShareId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsConnectionsApi#listDfsNFSConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsNfsShareId** | **Long**| dfs nfs share id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsNFSConnectionsResp**](DfsNFSConnectionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

