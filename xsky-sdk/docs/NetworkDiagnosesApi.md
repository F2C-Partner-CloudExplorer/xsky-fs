# NetworkDiagnosesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNetworkDiagnosis**](NetworkDiagnosesApi.md#createNetworkDiagnosis) | **POST** /v1/network-diagnoses/ | 
[**deleteNetworkDiagnosis**](NetworkDiagnosesApi.md#deleteNetworkDiagnosis) | **DELETE** /v1/network-diagnoses/{network_diagnosis_id} | 
[**getNetworkDiagnosis**](NetworkDiagnosesApi.md#getNetworkDiagnosis) | **GET** /v1/network-diagnoses/{network_diagnosis_id} | 
[**listNetworkDiagnoses**](NetworkDiagnosesApi.md#listNetworkDiagnoses) | **GET** /v1/network-diagnoses/ | 
[**stopNetworkDiagnosis**](NetworkDiagnosesApi.md#stopNetworkDiagnosis) | **POST** /v1/network-diagnoses/{network_diagnosis_id}:stop | 

<a name="createNetworkDiagnosis"></a>
# **createNetworkDiagnosis**
> NetworkDiagnosisResp createNetworkDiagnosis(body, clusterId)



Create network diagnosis

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosesApi;

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

NetworkDiagnosesApi apiInstance = new NetworkDiagnosesApi();
NetworkDiagnosisCreateReq body = new NetworkDiagnosisCreateReq(); // NetworkDiagnosisCreateReq | network diagnosis info
String clusterId = "clusterId_example"; // String | cluster id
try {
    NetworkDiagnosisResp result = apiInstance.createNetworkDiagnosis(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosesApi#createNetworkDiagnosis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkDiagnosisCreateReq**](NetworkDiagnosisCreateReq.md)| network diagnosis info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NetworkDiagnosisResp**](NetworkDiagnosisResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNetworkDiagnosis"></a>
# **deleteNetworkDiagnosis**
> deleteNetworkDiagnosis(networkDiagnosisId)



delete network diagnosis

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosesApi;

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

NetworkDiagnosesApi apiInstance = new NetworkDiagnosesApi();
Long networkDiagnosisId = 789L; // Long | network diagnosis id
try {
    apiInstance.deleteNetworkDiagnosis(networkDiagnosisId);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosesApi#deleteNetworkDiagnosis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkDiagnosisId** | **Long**| network diagnosis id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getNetworkDiagnosis"></a>
# **getNetworkDiagnosis**
> NetworkDiagnosisResp getNetworkDiagnosis(networkDiagnosisId)



Get network diagnosis

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosesApi;

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

NetworkDiagnosesApi apiInstance = new NetworkDiagnosesApi();
Long networkDiagnosisId = 789L; // Long | network diagnosis id
try {
    NetworkDiagnosisResp result = apiInstance.getNetworkDiagnosis(networkDiagnosisId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosesApi#getNetworkDiagnosis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkDiagnosisId** | **Long**| network diagnosis id |

### Return type

[**NetworkDiagnosisResp**](NetworkDiagnosisResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNetworkDiagnoses"></a>
# **listNetworkDiagnoses**
> NetworkDiagnosesResp listNetworkDiagnoses(limit, offset)



List network diagnoses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosesApi;

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

NetworkDiagnosesApi apiInstance = new NetworkDiagnosesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    NetworkDiagnosesResp result = apiInstance.listNetworkDiagnoses(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosesApi#listNetworkDiagnoses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**NetworkDiagnosesResp**](NetworkDiagnosesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopNetworkDiagnosis"></a>
# **stopNetworkDiagnosis**
> NetworkDiagnosisResp stopNetworkDiagnosis(networkDiagnosisId)



stop network diagnosis

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkDiagnosesApi;

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

NetworkDiagnosesApi apiInstance = new NetworkDiagnosesApi();
Long networkDiagnosisId = 789L; // Long | network diagnosis id
try {
    NetworkDiagnosisResp result = apiInstance.stopNetworkDiagnosis(networkDiagnosisId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkDiagnosesApi#stopNetworkDiagnosis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkDiagnosisId** | **Long**| network diagnosis id |

### Return type

[**NetworkDiagnosisResp**](NetworkDiagnosisResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

