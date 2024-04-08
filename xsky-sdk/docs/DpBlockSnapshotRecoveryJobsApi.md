# DpBlockSnapshotRecoveryJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpBlockSnapshotRecoveryJob**](DpBlockSnapshotRecoveryJobsApi.md#createDpBlockSnapshotRecoveryJob) | **POST** /v1/dp-block-snapshot-recovery-jobs/ | 
[**deleteDpBlockSnapshotRecoveryJob**](DpBlockSnapshotRecoveryJobsApi.md#deleteDpBlockSnapshotRecoveryJob) | **DELETE** /v1/dp-block-snapshot-recovery-jobs/{job_id} | 
[**getDpBlockSnapshotRecoveryJob**](DpBlockSnapshotRecoveryJobsApi.md#getDpBlockSnapshotRecoveryJob) | **GET** /v1/dp-block-snapshot-recovery-jobs/{job_id} | 
[**listDpBlockSnapshotRecoveryJobs**](DpBlockSnapshotRecoveryJobsApi.md#listDpBlockSnapshotRecoveryJobs) | **GET** /v1/dp-block-snapshot-recovery-jobs/ | 

<a name="createDpBlockSnapshotRecoveryJob"></a>
# **createDpBlockSnapshotRecoveryJob**
> DpBlockSnapshotRecoveryJobResp createDpBlockSnapshotRecoveryJob(body)



Create a dp block snapshot recovery job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotRecoveryJobsApi;

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

DpBlockSnapshotRecoveryJobsApi apiInstance = new DpBlockSnapshotRecoveryJobsApi();
DpBlockSnapshotRecoveryJobCreateReq body = new DpBlockSnapshotRecoveryJobCreateReq(); // DpBlockSnapshotRecoveryJobCreateReq | resource info
try {
    DpBlockSnapshotRecoveryJobResp result = apiInstance.createDpBlockSnapshotRecoveryJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotRecoveryJobsApi#createDpBlockSnapshotRecoveryJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockSnapshotRecoveryJobCreateReq**](DpBlockSnapshotRecoveryJobCreateReq.md)| resource info |

### Return type

[**DpBlockSnapshotRecoveryJobResp**](DpBlockSnapshotRecoveryJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockSnapshotRecoveryJob"></a>
# **deleteDpBlockSnapshotRecoveryJob**
> deleteDpBlockSnapshotRecoveryJob(jobId)



Delete a dp block snapshot recovery job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotRecoveryJobsApi;

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

DpBlockSnapshotRecoveryJobsApi apiInstance = new DpBlockSnapshotRecoveryJobsApi();
Long jobId = 789L; // Long | resource id
try {
    apiInstance.deleteDpBlockSnapshotRecoveryJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotRecoveryJobsApi#deleteDpBlockSnapshotRecoveryJob");
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

<a name="getDpBlockSnapshotRecoveryJob"></a>
# **getDpBlockSnapshotRecoveryJob**
> DpBlockSnapshotRecoveryJobResp getDpBlockSnapshotRecoveryJob(jobId)



Get a dp block snapshot recovery job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotRecoveryJobsApi;

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

DpBlockSnapshotRecoveryJobsApi apiInstance = new DpBlockSnapshotRecoveryJobsApi();
Long jobId = 789L; // Long | resource id
try {
    DpBlockSnapshotRecoveryJobResp result = apiInstance.getDpBlockSnapshotRecoveryJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotRecoveryJobsApi#getDpBlockSnapshotRecoveryJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| resource id |

### Return type

[**DpBlockSnapshotRecoveryJobResp**](DpBlockSnapshotRecoveryJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockSnapshotRecoveryJobs"></a>
# **listDpBlockSnapshotRecoveryJobs**
> DpBlockSnapshotRecoveryJobsResp listDpBlockSnapshotRecoveryJobs(limit, offset, q, sort)



List dp block snapshot recovery jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotRecoveryJobsApi;

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

DpBlockSnapshotRecoveryJobsApi apiInstance = new DpBlockSnapshotRecoveryJobsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DpBlockSnapshotRecoveryJobsResp result = apiInstance.listDpBlockSnapshotRecoveryJobs(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotRecoveryJobsApi#listDpBlockSnapshotRecoveryJobs");
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

### Return type

[**DpBlockSnapshotRecoveryJobsResp**](DpBlockSnapshotRecoveryJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

