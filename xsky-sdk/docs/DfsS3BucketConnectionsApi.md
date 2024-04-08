# DfsS3BucketConnectionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDfsS3BucketConnections**](DfsS3BucketConnectionsApi.md#listDfsS3BucketConnections) | **GET** /v1/dfs-s3-bucket-connections/ | 

<a name="listDfsS3BucketConnections"></a>
# **listDfsS3BucketConnections**
> DfsS3BucketConnectionsResp listDfsS3BucketConnections(limit, offset, bucketId)



List dfs s3 Bucket connections

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketConnectionsApi;

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

DfsS3BucketConnectionsApi apiInstance = new DfsS3BucketConnectionsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long bucketId = 789L; // Long | bucket id
try {
    DfsS3BucketConnectionsResp result = apiInstance.listDfsS3BucketConnections(limit, offset, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketConnectionsApi#listDfsS3BucketConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **bucketId** | **Long**| bucket id | [optional]

### Return type

[**DfsS3BucketConnectionsResp**](DfsS3BucketConnectionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

