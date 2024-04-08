# ExtCompatConfigsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listExtCompatConf**](ExtCompatConfigsApi.md#listExtCompatConf) | **GET** /v1/ext-compat-configs/ | 
[**setExtCompatConf**](ExtCompatConfigsApi.md#setExtCompatConf) | **POST** /v1/ext-compat-configs/ | 

<a name="listExtCompatConf"></a>
# **listExtCompatConf**
> ExtCompatConfResp listExtCompatConf(extName, funcName, policy, hostId)



list ext compat conf

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ExtCompatConfigsApi;

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

ExtCompatConfigsApi apiInstance = new ExtCompatConfigsApi();
String extName = "extName_example"; // String | filter the external interface name of ext compat conf
String funcName = "funcName_example"; // String | filter the function name of ext compat conf
String policy = "policy_example"; // String | filter the policy of ext compat conf
Long hostId = 789L; // Long | filter the host of ext compat conf, 0 for global config
try {
    ExtCompatConfResp result = apiInstance.listExtCompatConf(extName, funcName, policy, hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtCompatConfigsApi#listExtCompatConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extName** | **String**| filter the external interface name of ext compat conf | [optional]
 **funcName** | **String**| filter the function name of ext compat conf | [optional]
 **policy** | **String**| filter the policy of ext compat conf | [optional]
 **hostId** | **Long**| filter the host of ext compat conf, 0 for global config | [optional]

### Return type

[**ExtCompatConfResp**](ExtCompatConfResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setExtCompatConf"></a>
# **setExtCompatConf**
> SetExtCompatConfResp setExtCompatConf(body)



set ext compat conf

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ExtCompatConfigsApi;

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

ExtCompatConfigsApi apiInstance = new ExtCompatConfigsApi();
SetExtCompatConfReq body = new SetExtCompatConfReq(); // SetExtCompatConfReq | ext compat conf
try {
    SetExtCompatConfResp result = apiInstance.setExtCompatConf(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtCompatConfigsApi#setExtCompatConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetExtCompatConfReq**](SetExtCompatConfReq.md)| ext compat conf |

### Return type

[**SetExtCompatConfResp**](SetExtCompatConfResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

