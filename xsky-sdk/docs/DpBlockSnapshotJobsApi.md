# DpBlockSnapshotJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDpBlockSnapshotJobs**](DpBlockSnapshotJobsApi.md#listDpBlockSnapshotJobs) | **GET** /v1/dp-block-snapshot-jobs/ | 

<a name="listDpBlockSnapshotJobs"></a>
# **listDpBlockSnapshotJobs**
> DpBlockSnapshotJobsResp listDpBlockSnapshotJobs(limit, offset, q, sort, blockVolumeId, blockSnapshotId, dpBlockSnapshotPolicyId)



List dp block snapshot jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotJobsApi;

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

DpBlockSnapshotJobsApi apiInstance = new DpBlockSnapshotJobsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long blockVolumeId = 789L; // Long | block volume
Long blockSnapshotId = 789L; // Long | object storage bucket
Long dpBlockSnapshotPolicyId = 789L; // Long | dp block snapshot policy
try {
    DpBlockSnapshotJobsResp result = apiInstance.listDpBlockSnapshotJobs(limit, offset, q, sort, blockVolumeId, blockSnapshotId, dpBlockSnapshotPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotJobsApi#listDpBlockSnapshotJobs");
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
 **blockVolumeId** | **Long**| block volume | [optional]
 **blockSnapshotId** | **Long**| object storage bucket | [optional]
 **dpBlockSnapshotPolicyId** | **Long**| dp block snapshot policy | [optional]

### Return type

[**DpBlockSnapshotJobsResp**](DpBlockSnapshotJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

