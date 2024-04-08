# DfsS3BucketsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsS3Bucket**](DfsS3BucketsApi.md#createDfsS3Bucket) | **POST** /v1/dfs-s3-buckets/ | 
[**deleteDfsS3Bucket**](DfsS3BucketsApi.md#deleteDfsS3Bucket) | **DELETE** /v1/dfs-s3-buckets/{bucket_id} | 
[**deleteDfsS3BucketPolicy**](DfsS3BucketsApi.md#deleteDfsS3BucketPolicy) | **DELETE** /v1/dfs-s3-buckets/{bucket_id}:delete-bucket-policy | 
[**getDfsS3Bucket**](DfsS3BucketsApi.md#getDfsS3Bucket) | **GET** /v1/dfs-s3-buckets/{bucket_id} | 
[**getDfsS3BucketSamples**](DfsS3BucketsApi.md#getDfsS3BucketSamples) | **GET** /v1/dfs-s3-buckets/{bucket_id}/samples | 
[**listDfsS3Buckets**](DfsS3BucketsApi.md#listDfsS3Buckets) | **GET** /v1/dfs-s3-buckets/ | 
[**setDfsS3BucketPolicy**](DfsS3BucketsApi.md#setDfsS3BucketPolicy) | **POST** /v1/dfs-s3-buckets/{bucket_id}:set-bucket-policy | 
[**updateDfsS3Bucket**](DfsS3BucketsApi.md#updateDfsS3Bucket) | **PATCH** /v1/dfs-s3-buckets/{bucket_id} | 

<a name="createDfsS3Bucket"></a>
# **createDfsS3Bucket**
> DfsS3BucketResp createDfsS3Bucket(body, clusterId, allowPathCreate)



Create os bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
DfsS3BucketCreateReq body = new DfsS3BucketCreateReq(); // DfsS3BucketCreateReq | bucket info
String clusterId = "clusterId_example"; // String | cluster id
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsS3BucketResp result = apiInstance.createDfsS3Bucket(body, clusterId, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#createDfsS3Bucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsS3BucketCreateReq**](DfsS3BucketCreateReq.md)| bucket info |
 **clusterId** | **String**| cluster id | [optional]
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsS3Bucket"></a>
# **deleteDfsS3Bucket**
> DfsS3BucketResp deleteDfsS3Bucket(bucketId, withDirectory)



delete dfs s3 bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
Long bucketId = 789L; // Long | bucket id
Boolean withDirectory = true; // Boolean | also delete directory
try {
    DfsS3BucketResp result = apiInstance.deleteDfsS3Bucket(bucketId, withDirectory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#deleteDfsS3Bucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |
 **withDirectory** | **Boolean**| also delete directory | [optional]

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDfsS3BucketPolicy"></a>
# **deleteDfsS3BucketPolicy**
> DfsS3BucketResp deleteDfsS3BucketPolicy(bucketId)



delete dfs s3 bucket policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    DfsS3BucketResp result = apiInstance.deleteDfsS3BucketPolicy(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#deleteDfsS3BucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsS3Bucket"></a>
# **getDfsS3Bucket**
> DfsS3BucketResp getDfsS3Bucket(bucketId)



Get dfs s3 bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
Long bucketId = 789L; // Long | bucket id
try {
    DfsS3BucketResp result = apiInstance.getDfsS3Bucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#getDfsS3Bucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsS3BucketSamples"></a>
# **getDfsS3BucketSamples**
> DfsS3BucketSamplesResp getDfsS3BucketSamples(bucketId, durationBegin, durationEnd, period)



get an dfs s3 bucket&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
Long bucketId = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsS3BucketSamplesResp result = apiInstance.getDfsS3BucketSamples(bucketId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#getDfsS3BucketSamples");
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

[**DfsS3BucketSamplesResp**](DfsS3BucketSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsS3Buckets"></a>
# **listDfsS3Buckets**
> DfsS3BucketsResp listDfsS3Buckets(clusterId, limit, offset, name, ownerId, pathId, q, sort)



List dfs s3 buckets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String name = "name_example"; // String | name of dfs s3 buckets
Long ownerId = 789L; // Long | The id of user buckets belong to
Long pathId = 789L; // Long | The id of bucket path
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsS3BucketsResp result = apiInstance.listDfsS3Buckets(clusterId, limit, offset, name, ownerId, pathId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#listDfsS3Buckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **name** | **String**| name of dfs s3 buckets | [optional]
 **ownerId** | **Long**| The id of user buckets belong to | [optional]
 **pathId** | **Long**| The id of bucket path | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsS3BucketsResp**](DfsS3BucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setDfsS3BucketPolicy"></a>
# **setDfsS3BucketPolicy**
> DfsS3BucketResp setDfsS3BucketPolicy(body, bucketId)



set dfs s3 bucket policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
DfsS3BucketPolicySetReq body = new DfsS3BucketPolicySetReq(); // DfsS3BucketPolicySetReq | bucket policy info
Long bucketId = 789L; // Long | bucket id
try {
    DfsS3BucketResp result = apiInstance.setDfsS3BucketPolicy(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#setDfsS3BucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsS3BucketPolicySetReq**](DfsS3BucketPolicySetReq.md)| bucket policy info |
 **bucketId** | **Long**| bucket id |

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsS3Bucket"></a>
# **updateDfsS3Bucket**
> DfsS3BucketResp updateDfsS3Bucket(body, bucketId)



Update dfs s3 bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3BucketsApi;

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

DfsS3BucketsApi apiInstance = new DfsS3BucketsApi();
DfsS3BucketUpdateReq body = new DfsS3BucketUpdateReq(); // DfsS3BucketUpdateReq | bucket info
Long bucketId = 789L; // Long | bucket id
try {
    DfsS3BucketResp result = apiInstance.updateDfsS3Bucket(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3BucketsApi#updateDfsS3Bucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsS3BucketUpdateReq**](DfsS3BucketUpdateReq.md)| bucket info |
 **bucketId** | **Long**| bucket id |

### Return type

[**DfsS3BucketResp**](DfsS3BucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

