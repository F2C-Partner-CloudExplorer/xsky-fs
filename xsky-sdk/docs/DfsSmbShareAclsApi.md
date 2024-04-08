# DfsSmbShareAclsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsSMBShareACLs**](DfsSmbShareAclsApi.md#listDfsSMBShareACLs) | **GET** /v1/dfs-smb-share-acls/ | 

<a name="listDfsSMBShareACLs"></a>
# **listDfsSMBShareACLs**
> DfsSMBShareACLsResp listDfsSMBShareACLs(limit, offset, clusterId, dfsSmbShareId, q, sort)



List dfs smb share acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbShareAclsApi;

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

DfsSmbShareAclsApi apiInstance = new DfsSmbShareAclsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsSmbShareId = 789L; // Long | dfs smb share id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsSMBShareACLsResp result = apiInstance.listDfsSMBShareACLs(limit, offset, clusterId, dfsSmbShareId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbShareAclsApi#listDfsSMBShareACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsSmbShareId** | **Long**| dfs smb share id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsSMBShareACLsResp**](DfsSMBShareACLsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

