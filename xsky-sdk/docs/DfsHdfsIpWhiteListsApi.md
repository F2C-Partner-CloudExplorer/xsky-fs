# DfsHdfsIpWhiteListsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsHdfsIPWhiteList**](DfsHdfsIpWhiteListsApi.md#listDfsHdfsIPWhiteList) | **GET** /v1/dfs-hdfs-ip-white-lists/ | 

<a name="listDfsHdfsIPWhiteList"></a>
# **listDfsHdfsIPWhiteList**
> DfsHdfsIPWhiteListsResp listDfsHdfsIPWhiteList(limit, offset, clusterId, dfsHdfsId, permission, q, sort)



List dfs hdfs ip white list

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsIpWhiteListsApi;

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

DfsHdfsIpWhiteListsApi apiInstance = new DfsHdfsIpWhiteListsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsHdfsId = 789L; // Long | dfs hdfs id
String permission = "permission_example"; // String | permission of ip white list:RW, RO
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsHdfsIPWhiteListsResp result = apiInstance.listDfsHdfsIPWhiteList(limit, offset, clusterId, dfsHdfsId, permission, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsIpWhiteListsApi#listDfsHdfsIPWhiteList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsHdfsId** | **Long**| dfs hdfs id | [optional]
 **permission** | **String**| permission of ip white list:RW, RO | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsHdfsIPWhiteListsResp**](DfsHdfsIPWhiteListsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

