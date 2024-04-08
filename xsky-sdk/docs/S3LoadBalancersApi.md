# S3LoadBalancersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchGetS3LoadBalancerSamples**](S3LoadBalancersApi.md#batchGetS3LoadBalancerSamples) | **GET** /v1/s3-load-balancers/samples | 
[**getS3LoadBalancer**](S3LoadBalancersApi.md#getS3LoadBalancer) | **GET** /v1/s3-load-balancers/{load_balancer_id} | 
[**getS3LoadBalancerSamples**](S3LoadBalancersApi.md#getS3LoadBalancerSamples) | **GET** /v1/s3-load-balancers/{s3_load_balancer_id}/samples | 
[**listS3LoadBalancers**](S3LoadBalancersApi.md#listS3LoadBalancers) | **GET** /v1/s3-load-balancers/ | 

<a name="batchGetS3LoadBalancerSamples"></a>
# **batchGetS3LoadBalancerSamples**
> MultiS3LoadBalancersSamplesResp batchGetS3LoadBalancerSamples()



Get samples of multiple s3 load balancers

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancersApi;

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

S3LoadBalancersApi apiInstance = new S3LoadBalancersApi();
try {
    MultiS3LoadBalancersSamplesResp result = apiInstance.batchGetS3LoadBalancerSamples();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancersApi#batchGetS3LoadBalancerSamples");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MultiS3LoadBalancersSamplesResp**](MultiS3LoadBalancersSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getS3LoadBalancer"></a>
# **getS3LoadBalancer**
> S3LoadBalancerResp getS3LoadBalancer(loadBalancerId)



Get s3 load balancer

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancersApi;

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

S3LoadBalancersApi apiInstance = new S3LoadBalancersApi();
Long loadBalancerId = 789L; // Long | s3 load balancer id
try {
    S3LoadBalancerResp result = apiInstance.getS3LoadBalancer(loadBalancerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancersApi#getS3LoadBalancer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loadBalancerId** | **Long**| s3 load balancer id |

### Return type

[**S3LoadBalancerResp**](S3LoadBalancerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getS3LoadBalancerSamples"></a>
# **getS3LoadBalancerSamples**
> S3LoadBalancerSamplesResp getS3LoadBalancerSamples(s3LoadBalancerId, durationBegin, durationEnd, period)



get a s3 load balancer&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancersApi;

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

S3LoadBalancersApi apiInstance = new S3LoadBalancersApi();
Long s3LoadBalancerId = 789L; // Long | s3 load balancer id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    S3LoadBalancerSamplesResp result = apiInstance.getS3LoadBalancerSamples(s3LoadBalancerId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancersApi#getS3LoadBalancerSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **s3LoadBalancerId** | **Long**| s3 load balancer id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**S3LoadBalancerSamplesResp**](S3LoadBalancerSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listS3LoadBalancers"></a>
# **listS3LoadBalancers**
> S3LoadBalancersResp listS3LoadBalancers(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId)



List s3 load balancers

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancersApi;

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

S3LoadBalancersApi apiInstance = new S3LoadBalancersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long groupId = 789L; // Long | s3 load balancer group id
Long ospZoneId = 789L; // Long | osp zone id
Long hostId = 789L; // Long | host id
try {
    S3LoadBalancersResp result = apiInstance.listS3LoadBalancers(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancersApi#listS3LoadBalancers");
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
 **clusterId** | **String**| cluster id | [optional]
 **groupId** | **Long**| s3 load balancer group id | [optional]
 **ospZoneId** | **Long**| osp zone id | [optional]
 **hostId** | **Long**| host id | [optional]

### Return type

[**S3LoadBalancersResp**](S3LoadBalancersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

