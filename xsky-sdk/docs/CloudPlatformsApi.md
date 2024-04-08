# CloudPlatformsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudPlatform**](CloudPlatformsApi.md#createCloudPlatform) | **POST** /v1/cloud-platforms/ | 
[**deleteCloudPlatform**](CloudPlatformsApi.md#deleteCloudPlatform) | **DELETE** /v1/cloud-platforms/{cloud_platform_id} | 
[**getCloudPlatform**](CloudPlatformsApi.md#getCloudPlatform) | **GET** /v1/cloud-platforms/{cloud_platform_id} | 
[**listCloudPlatforms**](CloudPlatformsApi.md#listCloudPlatforms) | **GET** /v1/cloud-platforms/ | 
[**syncCloudPlatform**](CloudPlatformsApi.md#syncCloudPlatform) | **POST** /v1/cloud-platforms/{cloud_platform_id}:sync | 
[**updateCloudPlatform**](CloudPlatformsApi.md#updateCloudPlatform) | **PATCH** /v1/cloud-platforms/{cloud_platform_id} | 

<a name="createCloudPlatform"></a>
# **createCloudPlatform**
> CloudPlatformResp createCloudPlatform(body, clusterId)



Create cloud platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
CloudPlatformCreateReq body = new CloudPlatformCreateReq(); // CloudPlatformCreateReq | cloud platform info
String clusterId = "clusterId_example"; // String | cluster id
try {
    CloudPlatformResp result = apiInstance.createCloudPlatform(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#createCloudPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudPlatformCreateReq**](CloudPlatformCreateReq.md)| cloud platform info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**CloudPlatformResp**](CloudPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudPlatform"></a>
# **deleteCloudPlatform**
> deleteCloudPlatform(cloudPlatformId)



Delete cloud platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
Long cloudPlatformId = 789L; // Long | cloud platform id
try {
    apiInstance.deleteCloudPlatform(cloudPlatformId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#deleteCloudPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPlatformId** | **Long**| cloud platform id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCloudPlatform"></a>
# **getCloudPlatform**
> CloudPlatformResp getCloudPlatform(cloudPlatformId)



Get a cloud platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
Long cloudPlatformId = 789L; // Long | cloud platform id
try {
    CloudPlatformResp result = apiInstance.getCloudPlatform(cloudPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#getCloudPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPlatformId** | **Long**| cloud platform id |

### Return type

[**CloudPlatformResp**](CloudPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCloudPlatforms"></a>
# **listCloudPlatforms**
> CloudPlatformsResp listCloudPlatforms(limit, offset, clusterId)



List cloud platforms

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    CloudPlatformsResp result = apiInstance.listCloudPlatforms(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#listCloudPlatforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**CloudPlatformsResp**](CloudPlatformsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="syncCloudPlatform"></a>
# **syncCloudPlatform**
> CloudPlatformResp syncCloudPlatform(cloudPlatformId)



Sync a cloud platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
Long cloudPlatformId = 789L; // Long | cloud platform id
try {
    CloudPlatformResp result = apiInstance.syncCloudPlatform(cloudPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#syncCloudPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPlatformId** | **Long**| cloud platform id |

### Return type

[**CloudPlatformResp**](CloudPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCloudPlatform"></a>
# **updateCloudPlatform**
> CloudPlatformResp updateCloudPlatform(body, cloudPlatformId)



Update a cloud platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudPlatformsApi;

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

CloudPlatformsApi apiInstance = new CloudPlatformsApi();
CloudPlatformUpdateReq body = new CloudPlatformUpdateReq(); // CloudPlatformUpdateReq | cloud platform info
Long cloudPlatformId = 789L; // Long | cloud platform id
try {
    CloudPlatformResp result = apiInstance.updateCloudPlatform(body, cloudPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudPlatformsApi#updateCloudPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudPlatformUpdateReq**](CloudPlatformUpdateReq.md)| cloud platform info |
 **cloudPlatformId** | **Long**| cloud platform id |

### Return type

[**CloudPlatformResp**](CloudPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

