# AlertGuideApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertGuide**](AlertGuideApi.md#getAlertGuide) | **GET** /v1/alert-guide/ | 

<a name="getAlertGuide"></a>
# **getAlertGuide**
> AlertGuideResp getAlertGuide()



get alert guide status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertGuideApi;

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

AlertGuideApi apiInstance = new AlertGuideApi();
try {
    AlertGuideResp result = apiInstance.getAlertGuide();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertGuideApi#getAlertGuide");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertGuideResp**](AlertGuideResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

