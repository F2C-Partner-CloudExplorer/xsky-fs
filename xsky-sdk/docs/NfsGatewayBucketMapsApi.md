# NfsGatewayBucketMapsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listNFSGatewayS3BucketMaps**](NfsGatewayBucketMapsApi.md#listNFSGatewayS3BucketMaps) | **GET** /v1/nfs-gateway-bucket-maps/ | 

<a name="listNFSGatewayS3BucketMaps"></a>
# **listNFSGatewayS3BucketMaps**
> NFSGatewayBucketMapsResp listNFSGatewayS3BucketMaps(limit, offset, nfsGatewayId, osBucketId, clusterId)



List nfs gateway s3 bucket maps

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NfsGatewayBucketMapsApi;

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

NfsGatewayBucketMapsApi apiInstance = new NfsGatewayBucketMapsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long nfsGatewayId = 789L; // Long | nfs gateway id
Long osBucketId = 789L; // Long | s3 bucket id
String clusterId = "clusterId_example"; // String | cluster id
try {
    NFSGatewayBucketMapsResp result = apiInstance.listNFSGatewayS3BucketMaps(limit, offset, nfsGatewayId, osBucketId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NfsGatewayBucketMapsApi#listNFSGatewayS3BucketMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **nfsGatewayId** | **Long**| nfs gateway id | [optional]
 **osBucketId** | **Long**| s3 bucket id | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NFSGatewayBucketMapsResp**](NFSGatewayBucketMapsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

