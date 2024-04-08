# AlertWechatsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertWechatConfig**](AlertWechatsApi.md#getAlertWechatConfig) | **GET** /v1/alert-wechats/config | 
[**sendWechatMessage**](AlertWechatsApi.md#sendWechatMessage) | **POST** /v1/alert-wechats/ | 
[**updateAlertWechatConfig**](AlertWechatsApi.md#updateAlertWechatConfig) | **PATCH** /v1/alert-wechats/config | 

<a name="getAlertWechatConfig"></a>
# **getAlertWechatConfig**
> AlertWechatConfigResp getAlertWechatConfig()



get alert wechat config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertWechatsApi;

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

AlertWechatsApi apiInstance = new AlertWechatsApi();
try {
    AlertWechatConfigResp result = apiInstance.getAlertWechatConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertWechatsApi#getAlertWechatConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertWechatConfigResp**](AlertWechatConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendWechatMessage"></a>
# **sendWechatMessage**
> AlertWechatSendResp sendWechatMessage(body)



send wechat test message

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertWechatsApi;

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

AlertWechatsApi apiInstance = new AlertWechatsApi();
AlertWechatSendReq body = new AlertWechatSendReq(); // AlertWechatSendReq | wechat info
try {
    AlertWechatSendResp result = apiInstance.sendWechatMessage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertWechatsApi#sendWechatMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertWechatSendReq**](AlertWechatSendReq.md)| wechat info |

### Return type

[**AlertWechatSendResp**](AlertWechatSendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAlertWechatConfig"></a>
# **updateAlertWechatConfig**
> AlertWechatConfigResp updateAlertWechatConfig(body)



setup alert wechat configs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertWechatsApi;

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

AlertWechatsApi apiInstance = new AlertWechatsApi();
AlertWechatConfigUpdateReq body = new AlertWechatConfigUpdateReq(); // AlertWechatConfigUpdateReq | alert wechat config info
try {
    AlertWechatConfigResp result = apiInstance.updateAlertWechatConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertWechatsApi#updateAlertWechatConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertWechatConfigUpdateReq**](AlertWechatConfigUpdateReq.md)| alert wechat config info |

### Return type

[**AlertWechatConfigResp**](AlertWechatConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

