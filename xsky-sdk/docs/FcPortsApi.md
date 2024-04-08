# FcPortsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearFCPortErrCode**](FcPortsApi.md#clearFCPortErrCode) | **POST** /v1/fc-ports/{fc_port_id}:clear-err-code | 
[**getFCPort**](FcPortsApi.md#getFCPort) | **GET** /v1/fc-ports/{fc_port_id} | 
[**listFCPorts**](FcPortsApi.md#listFCPorts) | **GET** /v1/fc-ports/ | 
[**resetFCPort**](FcPortsApi.md#resetFCPort) | **POST** /v1/fc-ports/{fc_port_id}:reset | 
[**setFCPort**](FcPortsApi.md#setFCPort) | **PATCH** /v1/fc-ports/{fc_port_id} | 

<a name="clearFCPortErrCode"></a>
# **clearFCPortErrCode**
> FCPortResp clearFCPortErrCode(fcPortId)



Clear fc port errcode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortsApi;

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

FcPortsApi apiInstance = new FcPortsApi();
Long fcPortId = 789L; // Long | fc port id
try {
    FCPortResp result = apiInstance.clearFCPortErrCode(fcPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortsApi#clearFCPortErrCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fcPortId** | **Long**| fc port id |

### Return type

[**FCPortResp**](FCPortResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFCPort"></a>
# **getFCPort**
> FCPortResp getFCPort(fcPortId)



Get fc port

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortsApi;

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

FcPortsApi apiInstance = new FcPortsApi();
Long fcPortId = 789L; // Long | fc port id
try {
    FCPortResp result = apiInstance.getFCPort(fcPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortsApi#getFCPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fcPortId** | **Long**| fc port id |

### Return type

[**FCPortResp**](FCPortResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFCPorts"></a>
# **listFCPorts**
> FCPortsResp listFCPorts(limit, offset, clusterId, q, sort)



List fc ports

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortsApi;

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

FcPortsApi apiInstance = new FcPortsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    FCPortsResp result = apiInstance.listFCPorts(limit, offset, clusterId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortsApi#listFCPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**FCPortsResp**](FCPortsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetFCPort"></a>
# **resetFCPort**
> FCPortResp resetFCPort(fcPortId)



Reset fc port

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortsApi;

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

FcPortsApi apiInstance = new FcPortsApi();
Long fcPortId = 789L; // Long | fc port id
try {
    FCPortResp result = apiInstance.resetFCPort(fcPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortsApi#resetFCPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fcPortId** | **Long**| fc port id |

### Return type

[**FCPortResp**](FCPortResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setFCPort"></a>
# **setFCPort**
> FCPortResp setFCPort(fcPortId)



Set fc port

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortsApi;

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

FcPortsApi apiInstance = new FcPortsApi();
Long fcPortId = 789L; // Long | fc port id
try {
    FCPortResp result = apiInstance.setFCPort(fcPortId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortsApi#setFCPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fcPortId** | **Long**| fc port id |

### Return type

[**FCPortResp**](FCPortResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

