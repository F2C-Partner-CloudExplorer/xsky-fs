# OsBucketsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCustomLabels**](OsBucketsApi.md#addCustomLabels) | **POST** /v1/os-buckets/{bucket_id}:add-custom-labels | 
[**addOSReplicationPaths**](OsBucketsApi.md#addOSReplicationPaths) | **POST** /v1/os-buckets/{bucket_id}:add-os-replication-paths | 
[**addOSReplicationZones**](OsBucketsApi.md#addOSReplicationZones) | **POST** /v1/os-buckets/{bucket_id}:add-os-replication-zones | 
[**batchGetObjectStorageSamples**](OsBucketsApi.md#batchGetObjectStorageSamples) | **GET** /v1/os-buckets/samples | 
[**cancelDeleteBucket**](OsBucketsApi.md#cancelDeleteBucket) | **POST** /v1/os-buckets/{bucket_id}:cancel | 
[**createBucket**](OsBucketsApi.md#createBucket) | **POST** /v1/os-buckets/ | 
[**createObjectStorageBucketNFSClients**](OsBucketsApi.md#createObjectStorageBucketNFSClients) | **POST** /v1/os-buckets/{bucket_id}/nfs-clients | 
[**deleteBucket**](OsBucketsApi.md#deleteBucket) | **DELETE** /v1/os-buckets/{bucket_id} | 
[**deleteObjectStorageBucketNFSClients**](OsBucketsApi.md#deleteObjectStorageBucketNFSClients) | **DELETE** /v1/os-buckets/{bucket_id}/nfs-clients | 
[**deleteObjectStorageLifecycle**](OsBucketsApi.md#deleteObjectStorageLifecycle) | **DELETE** /v1/os-buckets/{bucket_id}/lifecycle | 
[**getBucket**](OsBucketsApi.md#getBucket) | **GET** /v1/os-buckets/{bucket_id} | 
[**getOSBucketOriginPullSamples**](OsBucketsApi.md#getOSBucketOriginPullSamples) | **GET** /v1/os-buckets/{bucket_id}/origin_pull_samples | 
[**getObjectStorageBucketNFSClient**](OsBucketsApi.md#getObjectStorageBucketNFSClient) | **GET** /v1/os-buckets/{bucket_id}/nfs-clients/{client_id} | 
[**getObjectStorageBucketSamples**](OsBucketsApi.md#getObjectStorageBucketSamples) | **GET** /v1/os-buckets/{bucket_id}/samples | 
[**listBuckets**](OsBucketsApi.md#listBuckets) | **GET** /v1/os-buckets/ | 
[**listObjectStorageBucketNFSClients**](OsBucketsApi.md#listObjectStorageBucketNFSClients) | **GET** /v1/os-buckets/{bucket_id}/nfs-clients | 
[**removeCustomLabels**](OsBucketsApi.md#removeCustomLabels) | **POST** /v1/os-buckets/{bucket_id}:remove-custom-labels | 
[**removeOSBucketLoggings**](OsBucketsApi.md#removeOSBucketLoggings) | **POST** /v1/os-buckets/{bucket_id}:remove-os-bucket-loggings | 
[**removeOSReplicationPaths**](OsBucketsApi.md#removeOSReplicationPaths) | **POST** /v1/os-buckets/{bucket_id}:remove-os-replication-paths | 
[**removeOSReplicationZones**](OsBucketsApi.md#removeOSReplicationZones) | **POST** /v1/os-buckets/{bucket_id}:remove-os-replication-zones | 
[**setAccessLogging**](OsBucketsApi.md#setAccessLogging) | **POST** /v1/os-buckets/{bucket_id}:set-access-logging | 
[**setMetadataSearch**](OsBucketsApi.md#setMetadataSearch) | **POST** /v1/os-buckets/{bucket_id}:set-metadata-search | 
[**setOSBucketPolicy**](OsBucketsApi.md#setOSBucketPolicy) | **POST** /v1/os-buckets/{bucket_id}:set-bucket-policy | 
[**setObjectStorageClass**](OsBucketsApi.md#setObjectStorageClass) | **POST** /v1/os-buckets/{bucket_id}:set-object-storage-class | 
[**setObjectStorageLifecycleRules**](OsBucketsApi.md#setObjectStorageLifecycleRules) | **PUT** /v1/os-buckets/{bucket_id}/lifecycle | 
[**suspendAccessLoggings**](OsBucketsApi.md#suspendAccessLoggings) | **POST** /v1/os-buckets/{bucket_id}:suspend-access-logging | 
[**suspendOSReplicationPaths**](OsBucketsApi.md#suspendOSReplicationPaths) | **POST** /v1/os-buckets/{bucket_id}:suspend-os-replication-paths | 
[**switchOwnerOSZone**](OsBucketsApi.md#switchOwnerOSZone) | **POST** /v1/os-buckets/{bucket_id}:switch-owner-os-zone | 
[**unsetAccessLogging**](OsBucketsApi.md#unsetAccessLogging) | **POST** /v1/os-buckets/{bucket_id}:unset-access-logging | 
[**unsetOSBucketPolicy**](OsBucketsApi.md#unsetOSBucketPolicy) | **POST** /v1/os-buckets/{bucket_id}:unset-bucket-policy | 
[**unsuspendAccessLogging**](OsBucketsApi.md#unsuspendAccessLogging) | **POST** /v1/os-buckets/{bucket_id}:unsuspend-access-logging | 
[**unsuspendOSReplicationPaths**](OsBucketsApi.md#unsuspendOSReplicationPaths) | **POST** /v1/os-buckets/{bucket_id}:unsuspend-os-replication-paths | 
[**updateBucket**](OsBucketsApi.md#updateBucket) | **PATCH** /v1/os-buckets/{bucket_id} | 
[**updateCustomLabels**](OsBucketsApi.md#updateCustomLabels) | **POST** /v1/os-buckets/{bucket_id}:update-custom-labels | 
[**updateObjectStorageBucketNFSClient**](OsBucketsApi.md#updateObjectStorageBucketNFSClient) | **PATCH** /v1/os-buckets/{bucket_id}/nfs-clients/{client_id} | 

<a name="addCustomLabels"></a>
# **addCustomLabels**
> ObjectStorageBucketResp addCustomLabels(body, bucketId)



add object storage bucket custom labels

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketCustomLabelsAddReq body = new OSBucketCustomLabelsAddReq(); // OSBucketCustomLabelsAddReq | bucket custom labels info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.addCustomLabels(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#addCustomLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketCustomLabelsAddReq**](OSBucketCustomLabelsAddReq.md)| bucket custom labels info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOSReplicationPaths"></a>
# **addOSReplicationPaths**
> ObjectStorageBucketResp addOSReplicationPaths(body, bucketId)



add os replication paths for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketAddReplicationPathsReq body = new OSBucketAddReplicationPathsReq(); // OSBucketAddReplicationPathsReq | replication paths info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.addOSReplicationPaths(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#addOSReplicationPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketAddReplicationPathsReq**](OSBucketAddReplicationPathsReq.md)| replication paths info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOSReplicationZones"></a>
# **addOSReplicationZones**
> ObjectStorageBucketResp addOSReplicationZones(body, bucketId)



add os replication zones for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketAddReplicationZonesReq body = new OSBucketAddReplicationZonesReq(); // OSBucketAddReplicationZonesReq | replication zones info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.addOSReplicationZones(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#addOSReplicationZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketAddReplicationZonesReq**](OSBucketAddReplicationZonesReq.md)| replication zones info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="batchGetObjectStorageSamples"></a>
# **batchGetObjectStorageSamples**
> MultiObjectStorageBucketsSamplesResp batchGetObjectStorageSamples(ids)



Get samples of multiple object storage buckets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
String ids = "ids_example"; // String | bucket ids
try {
    MultiObjectStorageBucketsSamplesResp result = apiInstance.batchGetObjectStorageSamples(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#batchGetObjectStorageSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**| bucket ids |

### Return type

[**MultiObjectStorageBucketsSamplesResp**](MultiObjectStorageBucketsSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cancelDeleteBucket"></a>
# **cancelDeleteBucket**
> ObjectStorageBucketResp cancelDeleteBucket(bucketId)



cancel delete bucket task

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.cancelDeleteBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#cancelDeleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createBucket"></a>
# **createBucket**
> ObjectStorageBucketResp createBucket(body, clusterId)



Create os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageBucketCreateReq body = new ObjectStorageBucketCreateReq(); // ObjectStorageBucketCreateReq | bucket info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageBucketResp result = apiInstance.createBucket(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#createBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageBucketCreateReq**](ObjectStorageBucketCreateReq.md)| bucket info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createObjectStorageBucketNFSClients"></a>
# **createObjectStorageBucketNFSClients**
> RawObjectStorageBucketResp createObjectStorageBucketNFSClients(body, bucketId)



create nfs client

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageBucketNFSClientsCreateReq body = new ObjectStorageBucketNFSClientsCreateReq(); // ObjectStorageBucketNFSClientsCreateReq | nfs client info
Long bucketId = 789L; // Long | bucket id
try {
    RawObjectStorageBucketResp result = apiInstance.createObjectStorageBucketNFSClients(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#createObjectStorageBucketNFSClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageBucketNFSClientsCreateReq**](ObjectStorageBucketNFSClientsCreateReq.md)| nfs client info |
 **bucketId** | **Long**| bucket id |

### Return type

[**RawObjectStorageBucketResp**](RawObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBucket"></a>
# **deleteBucket**
> ObjectStorageBucketResp deleteBucket(bucketId, force)



delete object storage bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
Boolean force = true; // Boolean | force delete or not
try {
    ObjectStorageBucketResp result = apiInstance.deleteBucket(bucketId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#deleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteObjectStorageBucketNFSClients"></a>
# **deleteObjectStorageBucketNFSClients**
> RawObjectStorageBucketResp deleteObjectStorageBucketNFSClients(body, bucketId)



delete nfs clients

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageBucketNFSClientsDeleteReq body = new ObjectStorageBucketNFSClientsDeleteReq(); // ObjectStorageBucketNFSClientsDeleteReq | nfs client info
Long bucketId = 789L; // Long | bucket id
try {
    RawObjectStorageBucketResp result = apiInstance.deleteObjectStorageBucketNFSClients(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#deleteObjectStorageBucketNFSClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageBucketNFSClientsDeleteReq**](ObjectStorageBucketNFSClientsDeleteReq.md)| nfs client info |
 **bucketId** | **Long**| bucket id |

### Return type

[**RawObjectStorageBucketResp**](RawObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteObjectStorageLifecycle"></a>
# **deleteObjectStorageLifecycle**
> ObjectStorageBucketResp deleteObjectStorageLifecycle(bucketId)



delete object storage lifecycle

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.deleteObjectStorageLifecycle(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#deleteObjectStorageLifecycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBucket"></a>
# **getBucket**
> ObjectStorageBucketResp getBucket(bucketId)



Get object storage bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.getBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#getBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSBucketOriginPullSamples"></a>
# **getOSBucketOriginPullSamples**
> OSBucketOriginPullSamplesResp getOSBucketOriginPullSamples(bucketId, originMode, durationBegin, durationEnd, period)



get an os bucket&#x27;s origin pull Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
String originMode = "originMode_example"; // String | origin mode
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OSBucketOriginPullSamplesResp result = apiInstance.getOSBucketOriginPullSamples(bucketId, originMode, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#getOSBucketOriginPullSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **originMode** | **String**| origin mode | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OSBucketOriginPullSamplesResp**](OSBucketOriginPullSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageBucketNFSClient"></a>
# **getObjectStorageBucketNFSClient**
> ObjectStorageBucketNFSClientResp getObjectStorageBucketNFSClient(bucketId, clientId)



show nfs client

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
Long clientId = 789L; // Long | nfs client id
try {
    ObjectStorageBucketNFSClientResp result = apiInstance.getObjectStorageBucketNFSClient(bucketId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#getObjectStorageBucketNFSClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **clientId** | **Long**| nfs client id |

### Return type

[**ObjectStorageBucketNFSClientResp**](ObjectStorageBucketNFSClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageBucketSamples"></a>
# **getObjectStorageBucketSamples**
> ObjectStorageBucketSamplesResp getObjectStorageBucketSamples(bucketId, durationBegin, durationEnd, period)



get an object storage bucket&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    ObjectStorageBucketSamplesResp result = apiInstance.getObjectStorageBucketSamples(bucketId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#getObjectStorageBucketSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**ObjectStorageBucketSamplesResp**](ObjectStorageBucketSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBuckets"></a>
# **listBuckets**
> ObjectStorageBucketsResp listBuckets(clusterId, limit, offset, name, osPolicyId, osUserId, replicationUuid, virtual, q, sort)



List object storage buckets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String name = "name_example"; // String | name of object storage buckets
Long osPolicyId = 789L; // Long | The id of policy object storage buckets belong to
Long osUserId = 789L; // Long | The id of user object storage buckets belong to
String replicationUuid = "replicationUuid_example"; // String | The uuid of replication os buckets belong to
Boolean virtual = true; // Boolean | Virtual bucket or not
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ObjectStorageBucketsResp result = apiInstance.listBuckets(clusterId, limit, offset, name, osPolicyId, osUserId, replicationUuid, virtual, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#listBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **name** | **String**| name of object storage buckets | [optional]
 **osPolicyId** | **Long**| The id of policy object storage buckets belong to | [optional]
 **osUserId** | **Long**| The id of user object storage buckets belong to | [optional]
 **replicationUuid** | **String**| The uuid of replication os buckets belong to | [optional]
 **virtual** | **Boolean**| Virtual bucket or not | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**ObjectStorageBucketsResp**](ObjectStorageBucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listObjectStorageBucketNFSClients"></a>
# **listObjectStorageBucketNFSClients**
> ObjectStorageBucketNFSClientsResp listObjectStorageBucketNFSClients(bucketId, limit, offset, clusterId)



List nfs clients

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageBucketNFSClientsResp result = apiInstance.listObjectStorageBucketNFSClients(bucketId, limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#listObjectStorageBucketNFSClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageBucketNFSClientsResp**](ObjectStorageBucketNFSClientsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCustomLabels"></a>
# **removeCustomLabels**
> ObjectStorageBucketResp removeCustomLabels(body, bucketId)



remove object storage bucket custom labels

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketCustomLabelsRemoveReq body = new OSBucketCustomLabelsRemoveReq(); // OSBucketCustomLabelsRemoveReq | custom labels info
Long bucketId = 789L; // Long | object storage bucket id
try {
    ObjectStorageBucketResp result = apiInstance.removeCustomLabels(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#removeCustomLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketCustomLabelsRemoveReq**](OSBucketCustomLabelsRemoveReq.md)| custom labels info |
 **bucketId** | **Long**| object storage bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeOSBucketLoggings"></a>
# **removeOSBucketLoggings**
> ObjectStorageBucketResp removeOSBucketLoggings(body, bucketId)



Remove os bucket loggings of os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketRemoveLoggingsReq body = new OSBucketRemoveLoggingsReq(); // OSBucketRemoveLoggingsReq | os bucket loggings info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.removeOSBucketLoggings(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#removeOSBucketLoggings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketRemoveLoggingsReq**](OSBucketRemoveLoggingsReq.md)| os bucket loggings info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeOSReplicationPaths"></a>
# **removeOSReplicationPaths**
> ObjectStorageBucketResp removeOSReplicationPaths(body, bucketId)



remove os replication paths for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketRemoveReplicationPathsReq body = new OSBucketRemoveReplicationPathsReq(); // OSBucketRemoveReplicationPathsReq | replication paths info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.removeOSReplicationPaths(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#removeOSReplicationPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketRemoveReplicationPathsReq**](OSBucketRemoveReplicationPathsReq.md)| replication paths info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeOSReplicationZones"></a>
# **removeOSReplicationZones**
> ObjectStorageBucketResp removeOSReplicationZones(body, bucketId, force)



remove os replication zones for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketRemoveReplicationZonesReq body = new OSBucketRemoveReplicationZonesReq(); // OSBucketRemoveReplicationZonesReq | replication zones info
Long bucketId = 789L; // Long | bucket id
Boolean force = true; // Boolean | force delete os replication zone even if target zone is dead
try {
    ObjectStorageBucketResp result = apiInstance.removeOSReplicationZones(body, bucketId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#removeOSReplicationZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketRemoveReplicationZonesReq**](OSBucketRemoveReplicationZonesReq.md)| replication zones info |
 **bucketId** | **Long**| bucket id |
 **force** | **Boolean**| force delete os replication zone even if target zone is dead | [optional]

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setAccessLogging"></a>
# **setAccessLogging**
> ObjectStorageBucketResp setAccessLogging(body, bucketId)



Set access logging of os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketSetAccessLoggingReq body = new OSBucketSetAccessLoggingReq(); // OSBucketSetAccessLoggingReq | access logging info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.setAccessLogging(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#setAccessLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketSetAccessLoggingReq**](OSBucketSetAccessLoggingReq.md)| access logging info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMetadataSearch"></a>
# **setMetadataSearch**
> ObjectStorageBucketsResp setMetadataSearch(body, bucketId)



set object storage bucket metadata search

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketMetadataSearchSetReq body = new OSBucketMetadataSearchSetReq(); // OSBucketMetadataSearchSetReq | bucket metadata search info
Long bucketId = 789L; // Long | object storage bucket id
try {
    ObjectStorageBucketsResp result = apiInstance.setMetadataSearch(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#setMetadataSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketMetadataSearchSetReq**](OSBucketMetadataSearchSetReq.md)| bucket metadata search info |
 **bucketId** | **Long**| object storage bucket id |

### Return type

[**ObjectStorageBucketsResp**](ObjectStorageBucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setOSBucketPolicy"></a>
# **setOSBucketPolicy**
> ObjectStorageBucketResp setOSBucketPolicy(body, bucketId)



set object storage bucket policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketPolicySetReq body = new OSBucketPolicySetReq(); // OSBucketPolicySetReq | bucket policy info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.setOSBucketPolicy(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#setOSBucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketPolicySetReq**](OSBucketPolicySetReq.md)| bucket policy info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorageClass"></a>
# **setObjectStorageClass**
> ObjectStorageBucketResp setObjectStorageClass(body, bucketId)



Set bucket object match storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketSetObjectStorageClassReq body = new OSBucketSetObjectStorageClassReq(); // OSBucketSetObjectStorageClassReq | object storage class info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.setObjectStorageClass(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#setObjectStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketSetObjectStorageClassReq**](OSBucketSetObjectStorageClassReq.md)| object storage class info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorageLifecycleRules"></a>
# **setObjectStorageLifecycleRules**
> ObjectStorageBucketResp setObjectStorageLifecycleRules(body, bucketId)



Set object storage lifecycle rules

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageLifecycleSetReq body = new ObjectStorageLifecycleSetReq(); // ObjectStorageLifecycleSetReq | lifecyce rules info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.setObjectStorageLifecycleRules(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#setObjectStorageLifecycleRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageLifecycleSetReq**](ObjectStorageLifecycleSetReq.md)| lifecyce rules info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suspendAccessLoggings"></a>
# **suspendAccessLoggings**
> ObjectStorageBucketResp suspendAccessLoggings(bucketId)



suspend access logging for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.suspendAccessLoggings(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#suspendAccessLoggings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="suspendOSReplicationPaths"></a>
# **suspendOSReplicationPaths**
> ObjectStorageBucketResp suspendOSReplicationPaths(body, bucketId)



suspend os replication paths for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketUpdateReplicationPathsReq body = new OSBucketUpdateReplicationPathsReq(); // OSBucketUpdateReplicationPathsReq | replication paths info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.suspendOSReplicationPaths(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#suspendOSReplicationPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketUpdateReplicationPathsReq**](OSBucketUpdateReplicationPathsReq.md)| replication paths info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="switchOwnerOSZone"></a>
# **switchOwnerOSZone**
> ObjectStorageBucketResp switchOwnerOSZone(body, bucketId, force)



Switch owner zone of os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketSwitchOwnerOSZoneReq body = new OSBucketSwitchOwnerOSZoneReq(); // OSBucketSwitchOwnerOSZoneReq | new owner os zone info
Long bucketId = 789L; // Long | bucket id
Boolean force = true; // Boolean | force to switch even if old owner zone is dead
try {
    ObjectStorageBucketResp result = apiInstance.switchOwnerOSZone(body, bucketId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#switchOwnerOSZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketSwitchOwnerOSZoneReq**](OSBucketSwitchOwnerOSZoneReq.md)| new owner os zone info |
 **bucketId** | **Long**| bucket id |
 **force** | **Boolean**| force to switch even if old owner zone is dead | [optional]

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsetAccessLogging"></a>
# **unsetAccessLogging**
> ObjectStorageBucketResp unsetAccessLogging(bucketId)



Unset access logging of os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.unsetAccessLogging(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#unsetAccessLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsetOSBucketPolicy"></a>
# **unsetOSBucketPolicy**
> ObjectStorageBucketResp unsetOSBucketPolicy(bucketId)



unset object storage bucket policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.unsetOSBucketPolicy(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#unsetOSBucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsuspendAccessLogging"></a>
# **unsuspendAccessLogging**
> ObjectStorageBucketResp unsuspendAccessLogging(bucketId)



unsuspend access logging for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.unsuspendAccessLogging(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#unsuspendAccessLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unsuspendOSReplicationPaths"></a>
# **unsuspendOSReplicationPaths**
> ObjectStorageBucketResp unsuspendOSReplicationPaths(body, bucketId)



unsuspend os replication paths for os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketUpdateReplicationPathsReq body = new OSBucketUpdateReplicationPathsReq(); // OSBucketUpdateReplicationPathsReq | replication paths info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.unsuspendOSReplicationPaths(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#unsuspendOSReplicationPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketUpdateReplicationPathsReq**](OSBucketUpdateReplicationPathsReq.md)| replication paths info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBucket"></a>
# **updateBucket**
> ObjectStorageBucketResp updateBucket(body, bucketId)



Update object storage bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageBucketUpdateReq body = new ObjectStorageBucketUpdateReq(); // ObjectStorageBucketUpdateReq | bucket info
Long bucketId = 789L; // Long | bucket id
try {
    ObjectStorageBucketResp result = apiInstance.updateBucket(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#updateBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageBucketUpdateReq**](ObjectStorageBucketUpdateReq.md)| bucket info |
 **bucketId** | **Long**| bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCustomLabels"></a>
# **updateCustomLabels**
> ObjectStorageBucketResp updateCustomLabels(body, bucketId)



update object storage bucket custom labels

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
OSBucketCustomLabelsUpdateReq body = new OSBucketCustomLabelsUpdateReq(); // OSBucketCustomLabelsUpdateReq | custom labels info
Long bucketId = 789L; // Long | object storage bucket id
try {
    ObjectStorageBucketResp result = apiInstance.updateCustomLabels(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#updateCustomLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBucketCustomLabelsUpdateReq**](OSBucketCustomLabelsUpdateReq.md)| custom labels info |
 **bucketId** | **Long**| object storage bucket id |

### Return type

[**ObjectStorageBucketResp**](ObjectStorageBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateObjectStorageBucketNFSClient"></a>
# **updateObjectStorageBucketNFSClient**
> ObjectStorageBucketNFSClientResp updateObjectStorageBucketNFSClient(body, bucketId, clientId)



update nfs client

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBucketsApi;

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

OsBucketsApi apiInstance = new OsBucketsApi();
ObjectStorageBucketNFSClientUpdateReq body = new ObjectStorageBucketNFSClientUpdateReq(); // ObjectStorageBucketNFSClientUpdateReq | nfs client info
Long bucketId = 789L; // Long | bucket id
Long clientId = 789L; // Long | nfs client id
try {
    ObjectStorageBucketNFSClientResp result = apiInstance.updateObjectStorageBucketNFSClient(body, bucketId, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBucketsApi#updateObjectStorageBucketNFSClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageBucketNFSClientUpdateReq**](ObjectStorageBucketNFSClientUpdateReq.md)| nfs client info |
 **bucketId** | **Long**| bucket id |
 **clientId** | **Long**| nfs client id |

### Return type

[**ObjectStorageBucketNFSClientResp**](ObjectStorageBucketNFSClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

