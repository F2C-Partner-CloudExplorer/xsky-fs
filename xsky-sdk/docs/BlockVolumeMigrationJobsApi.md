# BlockVolumeMigrationJobsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelBlockVolumeMigrationJob**](BlockVolumeMigrationJobsApi.md#cancelBlockVolumeMigrationJob) | **POST** /v1/block-volume-migration-jobs/{block_volume_migration_job_id}:cancel | 
[**getBlockVolumeMigrationJob**](BlockVolumeMigrationJobsApi.md#getBlockVolumeMigrationJob) | **GET** /v1/block-volume-migration-jobs/{block_volume_migration_job_id} | 
[**listBlockVolumeMigrationJobs**](BlockVolumeMigrationJobsApi.md#listBlockVolumeMigrationJobs) | **GET** /v1/block-volume-migration-jobs/ | 
[**updateMigration**](BlockVolumeMigrationJobsApi.md#updateMigration) | **POST** /v1/block-volume-migration-jobs/{block_volume_migration_job_id}:update | 

<a name="cancelBlockVolumeMigrationJob"></a>
# **cancelBlockVolumeMigrationJob**
> BlockVolumeMigrationJobResp cancelBlockVolumeMigrationJob(blockVolumeMigrationJobId)



### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeMigrationJobsApi;

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

BlockVolumeMigrationJobsApi apiInstance = new BlockVolumeMigrationJobsApi();
Long blockVolumeMigrationJobId = 789L; // Long | block volume migration job id
try {
    BlockVolumeMigrationJobResp result = apiInstance.cancelBlockVolumeMigrationJob(blockVolumeMigrationJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeMigrationJobsApi#cancelBlockVolumeMigrationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeMigrationJobId** | **Long**| block volume migration job id |

### Return type

[**BlockVolumeMigrationJobResp**](BlockVolumeMigrationJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockVolumeMigrationJob"></a>
# **getBlockVolumeMigrationJob**
> BlockVolumeMigrationJobResp getBlockVolumeMigrationJob(blockVolumeMigrationJobId)



get a volume migration job

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeMigrationJobsApi;

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

BlockVolumeMigrationJobsApi apiInstance = new BlockVolumeMigrationJobsApi();
Long blockVolumeMigrationJobId = 789L; // Long | volume migration job id
try {
    BlockVolumeMigrationJobResp result = apiInstance.getBlockVolumeMigrationJob(blockVolumeMigrationJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeMigrationJobsApi#getBlockVolumeMigrationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeMigrationJobId** | **Long**| volume migration job id |

### Return type

[**BlockVolumeMigrationJobResp**](BlockVolumeMigrationJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBlockVolumeMigrationJobs"></a>
# **listBlockVolumeMigrationJobs**
> BlockVolumeMigrationJobsResp listBlockVolumeMigrationJobs(limit, offset, status, q, sort)



List volume migration jobs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeMigrationJobsApi;

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

BlockVolumeMigrationJobsApi apiInstance = new BlockVolumeMigrationJobsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String status = "status_example"; // String | the status of volume migration job
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    BlockVolumeMigrationJobsResp result = apiInstance.listBlockVolumeMigrationJobs(limit, offset, status, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeMigrationJobsApi#listBlockVolumeMigrationJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **status** | **String**| the status of volume migration job | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**BlockVolumeMigrationJobsResp**](BlockVolumeMigrationJobsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMigration"></a>
# **updateMigration**
> BlockVolumeMigrationJobResp updateMigration(body, blockVolumeMigrationJobId)



### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.BlockVolumeMigrationJobsApi;

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

BlockVolumeMigrationJobsApi apiInstance = new BlockVolumeMigrationJobsApi();
BlockVolumeUpdateMigrationReq body = new BlockVolumeUpdateMigrationReq(); // BlockVolumeUpdateMigrationReq | volume migration udpate info
Long blockVolumeMigrationJobId = 789L; // Long | block volume migration job id
try {
    BlockVolumeMigrationJobResp result = apiInstance.updateMigration(body, blockVolumeMigrationJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockVolumeMigrationJobsApi#updateMigration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BlockVolumeUpdateMigrationReq**](BlockVolumeUpdateMigrationReq.md)| volume migration udpate info |
 **blockVolumeMigrationJobId** | **Long**| block volume migration job id |

### Return type

[**BlockVolumeMigrationJobResp**](BlockVolumeMigrationJobResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

