# HostInitializationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hostInitialization**](HostInitializationsApi.md#hostInitialization) | **POST** /v1/host-initializations/ | 

<a name="hostInitialization"></a>
# **hostInitialization**
> HostInitializationResp hostInitialization(body)



Create host initialization

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostInitializationsApi;

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

HostInitializationsApi apiInstance = new HostInitializationsApi();
HostInitializationReq body = new HostInitializationReq(); // HostInitializationReq | host initialization info
try {
    HostInitializationResp result = apiInstance.hostInitialization(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostInitializationsApi#hostInitialization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostInitializationReq**](HostInitializationReq.md)| host initialization info |

### Return type

[**HostInitializationResp**](HostInitializationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

