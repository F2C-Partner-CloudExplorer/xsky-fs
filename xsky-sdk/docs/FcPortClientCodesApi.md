# FcPortClientCodesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listFCPortClientCodes**](FcPortClientCodesApi.md#listFCPortClientCodes) | **GET** /v1/fc-port-client-codes/ | 

<a name="listFCPortClientCodes"></a>
# **listFCPortClientCodes**
> FCPortClientCodesResp listFCPortClientCodes(unused, limit, offset)



List fc port client codes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FcPortClientCodesApi;

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

FcPortClientCodesApi apiInstance = new FcPortClientCodesApi();
Boolean unused = true; // Boolean | list unused client codes only
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    FCPortClientCodesResp result = apiInstance.listFCPortClientCodes(unused, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FcPortClientCodesApi#listFCPortClientCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unused** | **Boolean**| list unused client codes only | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**FCPortClientCodesResp**](FCPortClientCodesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

