# DfsQosesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsQos**](DfsQosesApi.md#createDfsQos) | **POST** /v1/dfs-qoses/ | 
[**deleteDfsQos**](DfsQosesApi.md#deleteDfsQos) | **DELETE** /v1/dfs-qoses/{dfs_qos_id} | 
[**getDfsQos**](DfsQosesApi.md#getDfsQos) | **GET** /v1/dfs-qoses/{dfs_qos_id} | 
[**getDfsQosSamples**](DfsQosesApi.md#getDfsQosSamples) | **GET** /v1/dfs-qoses/{dfs_qos_id}/samples | 
[**listDfsQoses**](DfsQosesApi.md#listDfsQoses) | **GET** /v1/dfs-qoses/ | 
[**updateDfsQos**](DfsQosesApi.md#updateDfsQos) | **PATCH** /v1/dfs-qoses/{dfs_qos_id} | 

<a name="createDfsQos"></a>
# **createDfsQos**
> DfsQosResp createDfsQos(body)



Create dfs qos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
DfsQosCreateReq body = new DfsQosCreateReq(); // DfsQosCreateReq | qos info
try {
    DfsQosResp result = apiInstance.createDfsQos(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#createDfsQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQosCreateReq**](DfsQosCreateReq.md)| qos info |

### Return type

[**DfsQosResp**](DfsQosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsQos"></a>
# **deleteDfsQos**
> DfsQosResp deleteDfsQos(dfsQosId)



delete dfs qos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
Long dfsQosId = 789L; // Long | dfs qos id
try {
    DfsQosResp result = apiInstance.deleteDfsQos(dfsQosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#deleteDfsQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQosId** | **Long**| dfs qos id |

### Return type

[**DfsQosResp**](DfsQosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQos"></a>
# **getDfsQos**
> DfsQosResp getDfsQos(dfsQosId)



Get dfs qos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
Long dfsQosId = 789L; // Long | dfs qos id
try {
    DfsQosResp result = apiInstance.getDfsQos(dfsQosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#getDfsQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQosId** | **Long**| dfs qos id |

### Return type

[**DfsQosResp**](DfsQosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQosSamples"></a>
# **getDfsQosSamples**
> DfsQosSamplesResp getDfsQosSamples(dfsQosId, durationBegin, durationEnd, period)



get a dfs qos&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
Long dfsQosId = 789L; // Long | dfs qos id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsQosSamplesResp result = apiInstance.getDfsQosSamples(dfsQosId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#getDfsQosSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQosId** | **Long**| dfs qos id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsQosSamplesResp**](DfsQosSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsQoses"></a>
# **listDfsQoses**
> DfsQosesRecordsResp listDfsQoses(policyId, path, limit, offset, q, sort, clusterId)



List dfs qoses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
Long policyId = 789L; // Long | policy id
String path = "path_example"; // String | dfs qos path
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsQosesRecordsResp result = apiInstance.listDfsQoses(policyId, path, limit, offset, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#listDfsQoses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| policy id |
 **path** | **String**| dfs qos path | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsQosesRecordsResp**](DfsQosesRecordsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsQos"></a>
# **updateDfsQos**
> DfsQosResp updateDfsQos(body, dfsQosId, clusterId)



Update dfs qos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosesApi;

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

DfsQosesApi apiInstance = new DfsQosesApi();
DfsQosUpdateReq body = new DfsQosUpdateReq(); // DfsQosUpdateReq | dfs qos info
Long dfsQosId = 789L; // Long | qos id
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsQosResp result = apiInstance.updateDfsQos(body, dfsQosId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosesApi#updateDfsQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQosUpdateReq**](DfsQosUpdateReq.md)| dfs qos info |
 **dfsQosId** | **Long**| qos id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsQosResp**](DfsQosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

