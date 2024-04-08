# DfsNfsShareAclsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsNFSShareACLs**](DfsNfsShareAclsApi.md#listDfsNFSShareACLs) | **GET** /v1/dfs-nfs-share-acls/ | 

<a name="listDfsNFSShareACLs"></a>
# **listDfsNFSShareACLs**
> DfsNFSShareACLsResp listDfsNFSShareACLs(limit, offset, q, sort, clusterId, dfsNfsShareId)



List dfs nfs shares acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsNfsShareAclsApi;

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

DfsNfsShareAclsApi apiInstance = new DfsNfsShareAclsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long dfsNfsShareId = 789L; // Long | dfs nfs shares id
try {
    DfsNFSShareACLsResp result = apiInstance.listDfsNFSShareACLs(limit, offset, q, sort, clusterId, dfsNfsShareId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsNfsShareAclsApi#listDfsNFSShareACLs");
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
 **dfsNfsShareId** | **Long**| dfs nfs shares id | [optional]

### Return type

[**DfsNFSShareACLsResp**](DfsNFSShareACLsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

