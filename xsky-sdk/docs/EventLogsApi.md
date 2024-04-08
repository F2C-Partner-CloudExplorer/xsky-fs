# EventLogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEventLogs**](EventLogsApi.md#listEventLogs) | **GET** /v1/event-logs/ | 

<a name="listEventLogs"></a>
# **listEventLogs**
> EventLogsResp listEventLogs(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId)



List event logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EventLogsApi;

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

EventLogsApi apiInstance = new EventLogsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String status = "status_example"; // String | status of event logs
String resourceType = "resourceType_example"; // String | resource type of event logs
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    EventLogsResp result = apiInstance.listEventLogs(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventLogsApi#listEventLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **status** | **String**| status of event logs | [optional]
 **resourceType** | **String**| resource type of event logs | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**EventLogsResp**](EventLogsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

