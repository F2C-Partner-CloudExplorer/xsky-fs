# DfsPathPerformancesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsPathPerformance**](DfsPathPerformancesApi.md#createDfsPathPerformance) | **POST** /v1/dfs-path-performances/ | 
[**deleteDfsPathPerformance**](DfsPathPerformancesApi.md#deleteDfsPathPerformance) | **DELETE** /v1/dfs-path-performances/{dfs_path_performance_id} | 
[**getDfsPathPerformance**](DfsPathPerformancesApi.md#getDfsPathPerformance) | **GET** /v1/dfs-path-performances/{dfs_path_performance_id} | 
[**getDfsPathPerformanceSamples**](DfsPathPerformancesApi.md#getDfsPathPerformanceSamples) | **GET** /v1/dfs-path-performances/{dfs_path_performance_id}/samples | 
[**listDfsPathPerformances**](DfsPathPerformancesApi.md#listDfsPathPerformances) | **GET** /v1/dfs-path-performances/ | 

<a name="createDfsPathPerformance"></a>
# **createDfsPathPerformance**
> DfsPathPerformanceResp createDfsPathPerformance(body)



Create dfs path performance

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPathPerformancesApi;

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

DfsPathPerformancesApi apiInstance = new DfsPathPerformancesApi();
DfsPathPerformanceCreateReq body = new DfsPathPerformanceCreateReq(); // DfsPathPerformanceCreateReq | path performance info
try {
    DfsPathPerformanceResp result = apiInstance.createDfsPathPerformance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPathPerformancesApi#createDfsPathPerformance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsPathPerformanceCreateReq**](DfsPathPerformanceCreateReq.md)| path performance info |

### Return type

[**DfsPathPerformanceResp**](DfsPathPerformanceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsPathPerformance"></a>
# **deleteDfsPathPerformance**
> DfsPathPerformanceResp deleteDfsPathPerformance(dfsPathPerformanceId)



Delete dfs path performance

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPathPerformancesApi;

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

DfsPathPerformancesApi apiInstance = new DfsPathPerformancesApi();
Long dfsPathPerformanceId = 789L; // Long | dfs path performance id
try {
    DfsPathPerformanceResp result = apiInstance.deleteDfsPathPerformance(dfsPathPerformanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPathPerformancesApi#deleteDfsPathPerformance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsPathPerformanceId** | **Long**| dfs path performance id |

### Return type

[**DfsPathPerformanceResp**](DfsPathPerformanceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsPathPerformance"></a>
# **getDfsPathPerformance**
> DfsPathPerformanceResp getDfsPathPerformance(dfsPathPerformanceId)



Get dfs path performance

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPathPerformancesApi;

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

DfsPathPerformancesApi apiInstance = new DfsPathPerformancesApi();
Long dfsPathPerformanceId = 789L; // Long | path performance id
try {
    DfsPathPerformanceResp result = apiInstance.getDfsPathPerformance(dfsPathPerformanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPathPerformancesApi#getDfsPathPerformance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsPathPerformanceId** | **Long**| path performance id |

### Return type

[**DfsPathPerformanceResp**](DfsPathPerformanceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsPathPerformanceSamples"></a>
# **getDfsPathPerformanceSamples**
> DfsPathPerformanceSamplesResp getDfsPathPerformanceSamples(dfsPathPerformanceId, durationBegin, durationEnd, period)



get a dfs path performance&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPathPerformancesApi;

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

DfsPathPerformancesApi apiInstance = new DfsPathPerformancesApi();
Long dfsPathPerformanceId = 789L; // Long | dfs path performance id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsPathPerformanceSamplesResp result = apiInstance.getDfsPathPerformanceSamples(dfsPathPerformanceId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPathPerformancesApi#getDfsPathPerformanceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsPathPerformanceId** | **Long**| dfs path performance id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsPathPerformanceSamplesResp**](DfsPathPerformanceSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsPathPerformances"></a>
# **listDfsPathPerformances**
> DfsPathPerformancesResp listDfsPathPerformances(limit, offset, clusterId, path)



List dfs path performances

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsPathPerformancesApi;

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

DfsPathPerformancesApi apiInstance = new DfsPathPerformancesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String path = "path_example"; // String | path
try {
    DfsPathPerformancesResp result = apiInstance.listDfsPathPerformances(limit, offset, clusterId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsPathPerformancesApi#listDfsPathPerformances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **path** | **String**| path | [optional]

### Return type

[**DfsPathPerformancesResp**](DfsPathPerformancesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

