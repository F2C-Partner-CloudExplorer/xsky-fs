# DpVolumeGroupSnapshotReplicationJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDpVolumeGroupSnapshotReplicationJob**](DpVolumeGroupSnapshotReplicationJobsApi.md#deleteDpVolumeGroupSnapshotReplicationJob) | **DELETE** /v1/dp-volume-group-snapshot-replication-jobs/{job_id} | 
[**getDpVolumeGroupSnapshotReplicationJob**](DpVolumeGroupSnapshotReplicationJobsApi.md#getDpVolumeGroupSnapshotReplicationJob) | **GET** /v1/dp-volume-group-snapshot-replication-jobs/{job_id} | 
[**listDpVolumeGroupSnapshotReplicationJob**](DpVolumeGroupSnapshotReplicationJobsApi.md#listDpVolumeGroupSnapshotReplicationJob) | **GET** /v1/dp-volume-group-snapshot-replication-jobs/ | 

<a name="deleteDpVolumeGroupSnapshotReplicationJob"></a>
# **deleteDpVolumeGroupSnapshotReplicationJob**
> deleteDpVolumeGroupSnapshotReplicationJob(jobId)



Delete dp volume group snapshot replication job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationJobsApi;

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

DpVolumeGroupSnapshotReplicationJobsApi apiInstance = new DpVolumeGroupSnapshotReplicationJobsApi();
Long jobId = 789L; // Long | resource id
try {
    apiInstance.deleteDpVolumeGroupSnapshotReplicationJob(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationJobsApi#deleteDpVolumeGroupSnapshotReplicationJob");
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

<a name="getDpVolumeGroupSnapshotReplicationJob"></a>
# **getDpVolumeGroupSnapshotReplicationJob**
> DpVolumeGroupSnapshotReplicationJobResp getDpVolumeGroupSnapshotReplicationJob(jobId)



Get dp volume group snapshot replication job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationJobsApi;

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

DpVolumeGroupSnapshotReplicationJobsApi apiInstance = new DpVolumeGroupSnapshotReplicationJobsApi();
Long jobId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationJobResp result = apiInstance.getDpVolumeGroupSnapshotReplicationJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationJobsApi#getDpVolumeGroupSnapshotReplicationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationJobResp**](DpVolumeGroupSnapshotReplicationJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpVolumeGroupSnapshotReplicationJob"></a>
# **listDpVolumeGroupSnapshotReplicationJob**
> DpVolumeGroupSnapshotReplicationJobsResp listDpVolumeGroupSnapshotReplicationJob(dpVolumeGroupSnapshotReplicationPairId)



List dp volume group snapshot replication jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationJobsApi;

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

DpVolumeGroupSnapshotReplicationJobsApi apiInstance = new DpVolumeGroupSnapshotReplicationJobsApi();
Long dpVolumeGroupSnapshotReplicationPairId = 789L; // Long | related pair id
try {
    DpVolumeGroupSnapshotReplicationJobsResp result = apiInstance.listDpVolumeGroupSnapshotReplicationJob(dpVolumeGroupSnapshotReplicationPairId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationJobsApi#listDpVolumeGroupSnapshotReplicationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dpVolumeGroupSnapshotReplicationPairId** | **Long**| related pair id | [optional]

### Return type

[**DpVolumeGroupSnapshotReplicationJobsResp**](DpVolumeGroupSnapshotReplicationJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

