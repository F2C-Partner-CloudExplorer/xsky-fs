# DpDfsSnapshotJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDpDfsSnapshotJobs**](DpDfsSnapshotJobsApi.md#listDpDfsSnapshotJobs) | **GET** /v1/dp-dfs-snapshot-jobs/ | 

<a name="listDpDfsSnapshotJobs"></a>
# **listDpDfsSnapshotJobs**
> DpDfsSnapshotJobsResp listDpDfsSnapshotJobs(limit, offset, q, sort, dpDfsSnapshotPolicyId)



List dp dfs snapshot jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotJobsApi;

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

DpDfsSnapshotJobsApi apiInstance = new DpDfsSnapshotJobsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long dpDfsSnapshotPolicyId = 789L; // Long | dp dfs snapshot policy
try {
    DpDfsSnapshotJobsResp result = apiInstance.listDpDfsSnapshotJobs(limit, offset, q, sort, dpDfsSnapshotPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotJobsApi#listDpDfsSnapshotJobs");
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
 **dpDfsSnapshotPolicyId** | **Long**| dp dfs snapshot policy | [optional]

### Return type

[**DpDfsSnapshotJobsResp**](DpDfsSnapshotJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

