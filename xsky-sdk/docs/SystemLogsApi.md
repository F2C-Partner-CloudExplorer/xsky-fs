# SystemLogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadSystemLogs**](SystemLogsApi.md#downloadSystemLogs) | **GET** /v1/system-logs/archive | 
[**listSystemLogs**](SystemLogsApi.md#listSystemLogs) | **GET** /v1/system-logs/ | 

<a name="downloadSystemLogs"></a>
# **downloadSystemLogs**
> File downloadSystemLogs()



download system logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SystemLogsApi;

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

SystemLogsApi apiInstance = new SystemLogsApi();
try {
    File result = apiInstance.downloadSystemLogs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemLogsApi#downloadSystemLogs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="listSystemLogs"></a>
# **listSystemLogs**
> SystemLogsResp listSystemLogs(hostId, catalog, limit, offset)



List system logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SystemLogsApi;

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

SystemLogsApi apiInstance = new SystemLogsApi();
Long hostId = 789L; // Long | The id of host system logs belong to
String catalog = "catalog_example"; // String | The name of catalog system logs belong to
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    SystemLogsResp result = apiInstance.listSystemLogs(hostId, catalog, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemLogsApi#listSystemLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| The id of host system logs belong to |
 **catalog** | **String**| The name of catalog system logs belong to |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**SystemLogsResp**](SystemLogsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

