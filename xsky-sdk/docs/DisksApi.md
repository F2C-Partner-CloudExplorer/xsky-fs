# DisksApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPartitions**](DisksApi.md#createPartitions) | **PUT** /v1/disks/{disk_id}/partitions | 
[**deletePartitions**](DisksApi.md#deletePartitions) | **DELETE** /v1/disks/{disk_id}/partitions | 
[**getDisk**](DisksApi.md#getDisk) | **GET** /v1/disks/{disk_id} | 
[**getDiskSamples**](DisksApi.md#getDiskSamples) | **GET** /v1/disks/{disk_id}/samples | 
[**listDisks**](DisksApi.md#listDisks) | **GET** /v1/disks/ | 
[**rebuildDisk**](DisksApi.md#rebuildDisk) | **POST** /v1/disks/{disk_id}:rebuild | 
[**updateDisk**](DisksApi.md#updateDisk) | **PATCH** /v1/disks/{disk_id} | 

<a name="createPartitions"></a>
# **createPartitions**
> DiskResp createPartitions(body, diskId, num)



create cache partitions for disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
PartitionsCreateReq body = new PartitionsCreateReq(); // PartitionsCreateReq | partitions info
Long diskId = 789L; // Long | disk id
Long num = 789L; // Long | num of cache partitions to create
try {
    DiskResp result = apiInstance.createPartitions(body, diskId, num);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#createPartitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PartitionsCreateReq**](PartitionsCreateReq.md)| partitions info |
 **diskId** | **Long**| disk id |
 **num** | **Long**| num of cache partitions to create | [optional]

### Return type

[**DiskResp**](DiskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePartitions"></a>
# **deletePartitions**
> DiskResp deletePartitions(diskId)



delete cache partitions of disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
Long diskId = 789L; // Long | disk id
try {
    DiskResp result = apiInstance.deletePartitions(diskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#deletePartitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diskId** | **Long**| disk id |

### Return type

[**DiskResp**](DiskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDisk"></a>
# **getDisk**
> DiskResp getDisk(diskId)



Get a disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
Long diskId = 789L; // Long | disk id
try {
    DiskResp result = apiInstance.getDisk(diskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#getDisk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diskId** | **Long**| disk id |

### Return type

[**DiskResp**](DiskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDiskSamples"></a>
# **getDiskSamples**
> DiskSamplesResp getDiskSamples(diskId, durationBegin, durationEnd, period)



get a disk&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
Long diskId = 789L; // Long | disk id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DiskSamplesResp result = apiInstance.getDiskSamples(diskId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#getDiskSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diskId** | **Long**| disk id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DiskSamplesResp**](DiskSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDisks"></a>
# **listDisks**
> DisksResp listDisks(limit, offset, hostId, clusterId, rebuildDiskId, isCache, diskType, usage, used, q, sort, device, status, ids, hostIds, orderBy)



List all pyhsical disks in the system

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long hostId = 789L; // Long | host id
String clusterId = "clusterId_example"; // String | cluster id
Long rebuildDiskId = 789L; // Long | disk id to order disk by size and type for rebuilding disk
Boolean isCache = true; // Boolean | filter cache disk, deprecated, use `usage=partition` instead
String diskType = "diskType_example"; // String | filter disk type
String usage = "usage_example"; // String | filter disk usage
Boolean used = true; // Boolean | filter used
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String device = "device_example"; // String | device name of disk
String status = "status_example"; // String | disk status
String ids = "ids_example"; // String | disk comma separate ids
String hostIds = "hostIds_example"; // String | disk.host comma separate ids
String orderBy = "orderBy_example"; // String | sort param without search, split with comma, e.g. -host.name
try {
    DisksResp result = apiInstance.listDisks(limit, offset, hostId, clusterId, rebuildDiskId, isCache, diskType, usage, used, q, sort, device, status, ids, hostIds, orderBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#listDisks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **hostId** | **Long**| host id | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **rebuildDiskId** | **Long**| disk id to order disk by size and type for rebuilding disk | [optional]
 **isCache** | **Boolean**| filter cache disk, deprecated, use &#x60;usage&#x3D;partition&#x60; instead | [optional]
 **diskType** | **String**| filter disk type | [optional]
 **usage** | **String**| filter disk usage | [optional]
 **used** | **Boolean**| filter used | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **device** | **String**| device name of disk | [optional]
 **status** | **String**| disk status | [optional]
 **ids** | **String**| disk comma separate ids | [optional]
 **hostIds** | **String**| disk.host comma separate ids | [optional]
 **orderBy** | **String**| sort param without search, split with comma, e.g. -host.name | [optional]

### Return type

[**DisksResp**](DisksResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildDisk"></a>
# **rebuildDisk**
> DiskResp rebuildDisk(body, diskId)



rebuild disk with a new disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
DiskRebuildReq body = new DiskRebuildReq(); // DiskRebuildReq | new disk info
Long diskId = 789L; // Long | disk id
try {
    DiskResp result = apiInstance.rebuildDisk(body, diskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#rebuildDisk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DiskRebuildReq**](DiskRebuildReq.md)| new disk info |
 **diskId** | **Long**| disk id |

### Return type

[**DiskResp**](DiskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDisk"></a>
# **updateDisk**
> DiskResp updateDisk(body, diskId)



update disk info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DisksApi;

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

DisksApi apiInstance = new DisksApi();
DiskUpdateReq body = new DiskUpdateReq(); // DiskUpdateReq | disk info
Long diskId = 789L; // Long | disk id
try {
    DiskResp result = apiInstance.updateDisk(body, diskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisksApi#updateDisk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DiskUpdateReq**](DiskUpdateReq.md)| disk info |
 **diskId** | **Long**| disk id |

### Return type

[**DiskResp**](DiskResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

