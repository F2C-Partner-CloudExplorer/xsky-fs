# ClusterServicesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterService**](ClusterServicesApi.md#getClusterService) | **GET** /v1/cluster-services/{service_id} | 
[**listClusterServices**](ClusterServicesApi.md#listClusterServices) | **GET** /v1/cluster-services/ | 
[**rebuildClusterService**](ClusterServicesApi.md#rebuildClusterService) | **POST** /v1/cluster-services/{service_id}:rebuild | 
[**reindexDocs**](ClusterServicesApi.md#reindexDocs) | **POST** /v1/cluster-services/{service_id}:reindex-docs | 

<a name="getClusterService"></a>
# **getClusterService**
> ClusterServiceResp getClusterService(serviceId)



Get a cluster service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterServicesApi;

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

ClusterServicesApi apiInstance = new ClusterServicesApi();
Long serviceId = 789L; // Long | clsuter service id
try {
    ClusterServiceResp result = apiInstance.getClusterService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterServicesApi#getClusterService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Long**| clsuter service id |

### Return type

[**ClusterServiceResp**](ClusterServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClusterServices"></a>
# **listClusterServices**
> ClusterServicesResp listClusterServices(limit, offset)



List cluster services

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterServicesApi;

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

ClusterServicesApi apiInstance = new ClusterServicesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    ClusterServicesResp result = apiInstance.listClusterServices(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterServicesApi#listClusterServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**ClusterServicesResp**](ClusterServicesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildClusterService"></a>
# **rebuildClusterService**
> ClusterServiceResp rebuildClusterService(serviceId)



Rebuild the cluster service.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterServicesApi;

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

ClusterServicesApi apiInstance = new ClusterServicesApi();
Long serviceId = 789L; // Long | clsuter service id
try {
    ClusterServiceResp result = apiInstance.rebuildClusterService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterServicesApi#rebuildClusterService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Long**| clsuter service id |

### Return type

[**ClusterServiceResp**](ClusterServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="reindexDocs"></a>
# **reindexDocs**
> ClusterServiceResp reindexDocs(serviceId)



Reindex search docs.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterServicesApi;

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

ClusterServicesApi apiInstance = new ClusterServicesApi();
Long serviceId = 789L; // Long | clsuter service id
try {
    ClusterServiceResp result = apiInstance.reindexDocs(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterServicesApi#reindexDocs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **Long**| clsuter service id |

### Return type

[**ClusterServiceResp**](ClusterServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

