# HostInfoApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHostInfo**](HostInfoApi.md#getHostInfo) | **GET** /v1/host-info/ | 

<a name="getHostInfo"></a>
# **getHostInfo**
> HostInfoResp getHostInfo(ip)



scan host info from specified ip

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostInfoApi;

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

HostInfoApi apiInstance = new HostInfoApi();
String ip = "ip_example"; // String | host ip
try {
    HostInfoResp result = apiInstance.getHostInfo(ip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostInfoApi#getHostInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| host ip |

### Return type

[**HostInfoResp**](HostInfoResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

