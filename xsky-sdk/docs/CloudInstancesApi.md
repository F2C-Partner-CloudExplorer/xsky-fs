# CloudInstancesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudInstance**](CloudInstancesApi.md#getCloudInstance) | **GET** /v1/cloud-instances/{cloud_instance_id} | 
[**getCloudInstanceSamples**](CloudInstancesApi.md#getCloudInstanceSamples) | **GET** /v1/cloud-instances/{cloud_instance_id}/samples | 
[**listCloudInstances**](CloudInstancesApi.md#listCloudInstances) | **GET** /v1/cloud-instances/ | 

<a name="getCloudInstance"></a>
# **getCloudInstance**
> CloudInstanceResp getCloudInstance(cloudInstanceId)



Get a cloud instance

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudInstancesApi;

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

CloudInstancesApi apiInstance = new CloudInstancesApi();
Long cloudInstanceId = 789L; // Long | cloud instance id
try {
    CloudInstanceResp result = apiInstance.getCloudInstance(cloudInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstancesApi#getCloudInstance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudInstanceId** | **Long**| cloud instance id |

### Return type

[**CloudInstanceResp**](CloudInstanceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCloudInstanceSamples"></a>
# **getCloudInstanceSamples**
> CloudInstanceSamplesResp getCloudInstanceSamples(cloudInstanceId, durationBegin, durationEnd, period)



get a cloud instance&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudInstancesApi;

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

CloudInstancesApi apiInstance = new CloudInstancesApi();
Long cloudInstanceId = 789L; // Long | cloud instance id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    CloudInstanceSamplesResp result = apiInstance.getCloudInstanceSamples(cloudInstanceId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstancesApi#getCloudInstanceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudInstanceId** | **Long**| cloud instance id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**CloudInstanceSamplesResp**](CloudInstanceSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCloudInstances"></a>
# **listCloudInstances**
> CloudInstancesResp listCloudInstances(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId)



List cloud instances

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudInstancesApi;

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

CloudInstancesApi apiInstance = new CloudInstancesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long cloudPlatformId = 789L; // Long | cloud platform id
String cloudPlatformType = "cloudPlatformType_example"; // String | cloud platform type
String cloudPlatformName = "cloudPlatformName_example"; // String | cloud platform name
String clusterId = "clusterId_example"; // String | cluster id
try {
    CloudInstancesResp result = apiInstance.listCloudInstances(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudInstancesApi#listCloudInstances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **cloudPlatformId** | **Long**| cloud platform id | [optional]
 **cloudPlatformType** | **String**| cloud platform type | [optional]
 **cloudPlatformName** | **String**| cloud platform name | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**CloudInstancesResp**](CloudInstancesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

