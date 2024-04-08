# ErrorRecordsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createErrorRecord**](ErrorRecordsApi.md#createErrorRecord) | **POST** /v1/error-records/ | 

<a name="createErrorRecord"></a>
# **createErrorRecord**
> ErrorRecordResp createErrorRecord(body)



create error record

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ErrorRecordsApi;

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

ErrorRecordsApi apiInstance = new ErrorRecordsApi();
ErrorRecordCreateReq body = new ErrorRecordCreateReq(); // ErrorRecordCreateReq | error record info
try {
    ErrorRecordResp result = apiInstance.createErrorRecord(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ErrorRecordsApi#createErrorRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ErrorRecordCreateReq**](ErrorRecordCreateReq.md)| error record info |

### Return type

[**ErrorRecordResp**](ErrorRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

