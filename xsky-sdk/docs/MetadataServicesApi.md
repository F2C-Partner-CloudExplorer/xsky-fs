# MetadataServicesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetadataService**](MetadataServicesApi.md#getMetadataService) | **GET** /v1/metadata-services/{metadata_service_id} | 
[**getMetadataServiceSamples**](MetadataServicesApi.md#getMetadataServiceSamples) | **GET** /v1/metadata-services/{metadata_service_id}/samples | 
[**listMetadataServices**](MetadataServicesApi.md#listMetadataServices) | **GET** /v1/metadata-services/ | 

<a name="getMetadataService"></a>
# **getMetadataService**
> MetadataServiceResp getMetadataService(metadataServiceId)



get a metadata service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataServicesApi;

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

MetadataServicesApi apiInstance = new MetadataServicesApi();
Long metadataServiceId = 789L; // Long | metadata service id
try {
    MetadataServiceResp result = apiInstance.getMetadataService(metadataServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataServicesApi#getMetadataService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataServiceId** | **Long**| metadata service id |

### Return type

[**MetadataServiceResp**](MetadataServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataServiceSamples"></a>
# **getMetadataServiceSamples**
> MetadataServiceSamplesResp getMetadataServiceSamples(metadataServiceId, durationBegin, durationEnd, period)



get samples of a metadata service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataServicesApi;

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

MetadataServicesApi apiInstance = new MetadataServicesApi();
Long metadataServiceId = 789L; // Long | metadata service id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    MetadataServiceSamplesResp result = apiInstance.getMetadataServiceSamples(metadataServiceId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataServicesApi#getMetadataServiceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataServiceId** | **Long**| metadata service id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**MetadataServiceSamplesResp**](MetadataServiceSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMetadataServices"></a>
# **listMetadataServices**
> MetadataServicesResp listMetadataServices(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort)



List all metadata services in the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataServicesApi;

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

MetadataServicesApi apiInstance = new MetadataServicesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long diskIds = 789L; // Long | disk ids
Long hostId = 789L; // Long | host id
Long metadataClusterId = 789L; // Long | metadata cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    MetadataServicesResp result = apiInstance.listMetadataServices(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataServicesApi#listMetadataServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **diskIds** | **Long**| disk ids | [optional]
 **hostId** | **Long**| host id | [optional]
 **metadataClusterId** | **Long**| metadata cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**MetadataServicesResp**](MetadataServicesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

