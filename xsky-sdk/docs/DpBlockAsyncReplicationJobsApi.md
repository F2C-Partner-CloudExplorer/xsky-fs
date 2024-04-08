# DpBlockAsyncReplicationJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDpBlockAsyncReplicationJob**](DpBlockAsyncReplicationJobsApi.md#deleteDpBlockAsyncReplicationJob) | **DELETE** /v1/dp-block-async-replication-jobs/{job_id} | 
[**getDpBlockAsyncReplicationJob**](DpBlockAsyncReplicationJobsApi.md#getDpBlockAsyncReplicationJob) | **GET** /v1/dp-block-async-replication-jobs/{job_id} | 
[**listDpBlockAsyncReplicationJob**](DpBlockAsyncReplicationJobsApi.md#listDpBlockAsyncReplicationJob) | **GET** /v1/dp-block-async-replication-jobs/ | 

<a name="deleteDpBlockAsyncReplicationJob"></a>
# **deleteDpBlockAsyncReplicationJob**
> deleteDpBlockAsyncReplicationJob(jobId)



Delete dp block async replication job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationJobsApi;

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

DpBlockAsyncReplicationJobsApi apiInstance = new DpBlockAsyncReplicationJobsApi();
Long jobId = 789L; // Long | resource id
try {
    apiInstance.deleteDpBlockAsyncReplicationJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationJobsApi#deleteDpBlockAsyncReplicationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| resource id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDpBlockAsyncReplicationJob"></a>
# **getDpBlockAsyncReplicationJob**
> DpBlockAsyncReplicationJobResp getDpBlockAsyncReplicationJob(jobId)



Get dp block async replication job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationJobsApi;

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

DpBlockAsyncReplicationJobsApi apiInstance = new DpBlockAsyncReplicationJobsApi();
Long jobId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationJobResp result = apiInstance.getDpBlockAsyncReplicationJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationJobsApi#getDpBlockAsyncReplicationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationJobResp**](DpBlockAsyncReplicationJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockAsyncReplicationJob"></a>
# **listDpBlockAsyncReplicationJob**
> DpBlockAsyncReplicationJobsResp listDpBlockAsyncReplicationJob()



List dp block async replication jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationJobsApi;

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

DpBlockAsyncReplicationJobsApi apiInstance = new DpBlockAsyncReplicationJobsApi();
try {
    DpBlockAsyncReplicationJobsResp result = apiInstance.listDpBlockAsyncReplicationJob();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationJobsApi#listDpBlockAsyncReplicationJob");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DpBlockAsyncReplicationJobsResp**](DpBlockAsyncReplicationJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

