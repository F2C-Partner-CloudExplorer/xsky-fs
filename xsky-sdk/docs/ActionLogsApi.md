# ActionLogsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActionLog**](ActionLogsApi.md#createActionLog) | **POST** /v1/action-logs/ | 
[**getActionLog**](ActionLogsApi.md#getActionLog) | **GET** /v1/action-logs/{action_log_id} | 
[**getActionLogUser**](ActionLogsApi.md#getActionLogUser) | **GET** /v1/action-logs/:user | 
[**listActionLogs**](ActionLogsApi.md#listActionLogs) | **GET** /v1/action-logs/ | 
[**updateActionLog**](ActionLogsApi.md#updateActionLog) | **PATCH** /v1/action-logs/{action_log_id} | 

<a name="createActionLog"></a>
# **createActionLog**
> ActionLogResp createActionLog(body)



create action log

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ActionLogsApi;

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

ActionLogsApi apiInstance = new ActionLogsApi();
ActionLogCreateReq body = new ActionLogCreateReq(); // ActionLogCreateReq | action log info
try {
    ActionLogResp result = apiInstance.createActionLog(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionLogsApi#createActionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActionLogCreateReq**](ActionLogCreateReq.md)| action log info |

### Return type

[**ActionLogResp**](ActionLogResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActionLog"></a>
# **getActionLog**
> ActionLogResp getActionLog(actionLogId)



get a action log

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ActionLogsApi;

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

ActionLogsApi apiInstance = new ActionLogsApi();
Long actionLogId = 789L; // Long | action log id
try {
    ActionLogResp result = apiInstance.getActionLog(actionLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionLogsApi#getActionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionLogId** | **Long**| action log id |

### Return type

[**ActionLogResp**](ActionLogResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogUser"></a>
# **getActionLogUser**
> ActionLogUserResp getActionLogUser()



get action log user info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ActionLogsApi;

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

ActionLogsApi apiInstance = new ActionLogsApi();
try {
    ActionLogUserResp result = apiInstance.getActionLogUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionLogsApi#getActionLogUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActionLogUserResp**](ActionLogUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActionLogs"></a>
# **listActionLogs**
> ActionLogsResp listActionLogs(limit, offset, action, resourceType, status, userId, parentId, createBegin, createEnd, q, relatedResource, sort, clusterId)



List action logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ActionLogsApi;

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

ActionLogsApi apiInstance = new ActionLogsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String action = "action_example"; // String | action of action logs
String resourceType = "resourceType_example"; // String | resource type of action logs
String status = "status_example"; // String | status of action logs
Long userId = 789L; // Long | user id of action logs
Long parentId = 789L; // Long | parent action log id of action logs
String createBegin = "createBegin_example"; // String | create begin timestamp
String createEnd = "createEnd_example"; // String | create end timestamp
String q = "q_example"; // String | query param of search
String relatedResource = "relatedResource_example"; // String | related resource info of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    ActionLogsResp result = apiInstance.listActionLogs(limit, offset, action, resourceType, status, userId, parentId, createBegin, createEnd, q, relatedResource, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionLogsApi#listActionLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **action** | **String**| action of action logs | [optional]
 **resourceType** | **String**| resource type of action logs | [optional]
 **status** | **String**| status of action logs | [optional]
 **userId** | **Long**| user id of action logs | [optional]
 **parentId** | **Long**| parent action log id of action logs | [optional]
 **createBegin** | **String**| create begin timestamp | [optional]
 **createEnd** | **String**| create end timestamp | [optional]
 **q** | **String**| query param of search | [optional]
 **relatedResource** | **String**| related resource info of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ActionLogsResp**](ActionLogsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateActionLog"></a>
# **updateActionLog**
> ActionLogResp updateActionLog(body, actionLogId)



update action log

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ActionLogsApi;

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

ActionLogsApi apiInstance = new ActionLogsApi();
ActionLogUpdateReq body = new ActionLogUpdateReq(); // ActionLogUpdateReq | action log info
Long actionLogId = 789L; // Long | action log id
try {
    ActionLogResp result = apiInstance.updateActionLog(body, actionLogId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionLogsApi#updateActionLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActionLogUpdateReq**](ActionLogUpdateReq.md)| action log info |
 **actionLogId** | **Long**| action log id |

### Return type

[**ActionLogResp**](ActionLogResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

