# AlertInfoRootApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ackAlertInfoRoot**](AlertInfoRootApi.md#ackAlertInfoRoot) | **POST** /v1/alert-info-root/:ack | 
[**getAlertInfoRoot**](AlertInfoRootApi.md#getAlertInfoRoot) | **GET** /v1/alert-info-root/ | 
[**resolveAlertInfoRoot**](AlertInfoRootApi.md#resolveAlertInfoRoot) | **POST** /v1/alert-info-root/:resolve | 

<a name="ackAlertInfoRoot"></a>
# **ackAlertInfoRoot**
> AlertInfoRootResp ackAlertInfoRoot()



set the acked status of all alert infos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoRootApi;

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

AlertInfoRootApi apiInstance = new AlertInfoRootApi();
try {
    AlertInfoRootResp result = apiInstance.ackAlertInfoRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoRootApi#ackAlertInfoRoot");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertInfoRootResp**](AlertInfoRootResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertInfoRoot"></a>
# **getAlertInfoRoot**
> AlertInfoRootResp getAlertInfoRoot()



get the alert info root

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoRootApi;

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

AlertInfoRootApi apiInstance = new AlertInfoRootApi();
try {
    AlertInfoRootResp result = apiInstance.getAlertInfoRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoRootApi#getAlertInfoRoot");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertInfoRootResp**](AlertInfoRootResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveAlertInfoRoot"></a>
# **resolveAlertInfoRoot**
> AlertInfoRootResp resolveAlertInfoRoot()



set the resolved status of all alert infos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoRootApi;

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

AlertInfoRootApi apiInstance = new AlertInfoRootApi();
try {
    AlertInfoRootResp result = apiInstance.resolveAlertInfoRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoRootApi#resolveAlertInfoRoot");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertInfoRootResp**](AlertInfoRootResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

