# ClientCodesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listClientCodes**](ClientCodesApi.md#listClientCodes) | **GET** /v1/client-codes/ | 

<a name="listClientCodes"></a>
# **listClientCodes**
> ClientCodesResp listClientCodes(limit, offset, type, unused)



List client iqns/wwns

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientCodesApi;

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

ClientCodesApi apiInstance = new ClientCodesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String type = "type_example"; // String | FC/iSCSI
Boolean unused = true; // Boolean | list unused client codes
try {
    ClientCodesResp result = apiInstance.listClientCodes(limit, offset, type, unused);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientCodesApi#listClientCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **type** | **String**| FC/iSCSI | [optional]
 **unused** | **Boolean**| list unused client codes | [optional]

### Return type

[**ClientCodesResp**](ClientCodesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

