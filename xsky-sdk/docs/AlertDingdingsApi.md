# AlertDingdingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertDingDingConfig**](AlertDingdingsApi.md#getAlertDingDingConfig) | **GET** /v1/alert-dingdings/config | 
[**sendDingDingMessage**](AlertDingdingsApi.md#sendDingDingMessage) | **POST** /v1/alert-dingdings/ | 
[**updateAlertDingDingConfig**](AlertDingdingsApi.md#updateAlertDingDingConfig) | **PATCH** /v1/alert-dingdings/config | 

<a name="getAlertDingDingConfig"></a>
# **getAlertDingDingConfig**
> AlertDingDingConfigResp getAlertDingDingConfig()



get alert dingding config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertDingdingsApi;

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

AlertDingdingsApi apiInstance = new AlertDingdingsApi();
try {
    AlertDingDingConfigResp result = apiInstance.getAlertDingDingConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDingdingsApi#getAlertDingDingConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertDingDingConfigResp**](AlertDingDingConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendDingDingMessage"></a>
# **sendDingDingMessage**
> AlertDingDingSendResp sendDingDingMessage(body)



send wechat test message

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertDingdingsApi;

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

AlertDingdingsApi apiInstance = new AlertDingdingsApi();
AlertDingDingSendReq body = new AlertDingDingSendReq(); // AlertDingDingSendReq | dingding info
try {
    AlertDingDingSendResp result = apiInstance.sendDingDingMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDingdingsApi#sendDingDingMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertDingDingSendReq**](AlertDingDingSendReq.md)| dingding info |

### Return type

[**AlertDingDingSendResp**](AlertDingDingSendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAlertDingDingConfig"></a>
# **updateAlertDingDingConfig**
> AlertDingDingConfigResp updateAlertDingDingConfig(body)



setup alert dingding configs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertDingdingsApi;

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

AlertDingdingsApi apiInstance = new AlertDingdingsApi();
AlertDingDingConfigUpdateReq body = new AlertDingDingConfigUpdateReq(); // AlertDingDingConfigUpdateReq | alert dingding config info
try {
    AlertDingDingConfigResp result = apiInstance.updateAlertDingDingConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertDingdingsApi#updateAlertDingDingConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertDingDingConfigUpdateReq**](AlertDingDingConfigUpdateReq.md)| alert dingding config info |

### Return type

[**AlertDingDingConfigResp**](AlertDingDingConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

