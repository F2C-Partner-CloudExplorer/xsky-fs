# PartitionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPartition**](PartitionsApi.md#getPartition) | **GET** /v1/partitions/{partition_id} | 
[**listPartitions**](PartitionsApi.md#listPartitions) | **GET** /v1/partitions/ | 
[**updatePartitionOspPartitionType**](PartitionsApi.md#updatePartitionOspPartitionType) | **POST** /v1/partitions/{partition_id}:update-osp-partition-type | 

<a name="getPartition"></a>
# **getPartition**
> PartitionResp getPartition(partitionId)



Get a partition info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PartitionsApi;

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

PartitionsApi apiInstance = new PartitionsApi();
String partitionId = "partitionId_example"; // String | partition id
try {
    PartitionResp result = apiInstance.getPartition(partitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionsApi#getPartition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partitionId** | **String**| partition id |

### Return type

[**PartitionResp**](PartitionResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPartitions"></a>
# **listPartitions**
> PartitionsResp listPartitions(limit, offset, q, sort, hostId, clusterId, type, diskId)



List partitions

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PartitionsApi;

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

PartitionsApi apiInstance = new PartitionsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long hostId = 789L; // Long | host id
Long clusterId = 789L; // Long | cluster id
String type = "type_example"; // String | partition type
Long diskId = 789L; // Long | disk id
try {
    PartitionsResp result = apiInstance.listPartitions(limit, offset, q, sort, hostId, clusterId, type, diskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionsApi#listPartitions");
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
 **hostId** | **Long**| host id | [optional]
 **clusterId** | **Long**| cluster id | [optional]
 **type** | **String**| partition type | [optional]
 **diskId** | **Long**| disk id | [optional]

### Return type

[**PartitionsResp**](PartitionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePartitionOspPartitionType"></a>
# **updatePartitionOspPartitionType**
> OsdResp updatePartitionOspPartitionType(body, partitionId)



Update partition type for osp partition

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PartitionsApi;

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

PartitionsApi apiInstance = new PartitionsApi();
UpdateOspPartitionTypeReq body = new UpdateOspPartitionTypeReq(); // UpdateOspPartitionTypeReq | osp partition type
Long partitionId = 789L; // Long | partition id
try {
    OsdResp result = apiInstance.updatePartitionOspPartitionType(body, partitionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionsApi#updatePartitionOspPartitionType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateOspPartitionTypeReq**](UpdateOspPartitionTypeReq.md)| osp partition type |
 **partitionId** | **Long**| partition id |

### Return type

[**OsdResp**](OsdResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

