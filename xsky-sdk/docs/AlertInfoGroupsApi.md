# AlertInfoGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ackAlertInfoGroup**](AlertInfoGroupsApi.md#ackAlertInfoGroup) | **POST** /v1/alert-info-groups/{alert_info_group_id}:ack | 
[**countAlertInfoGroups**](AlertInfoGroupsApi.md#countAlertInfoGroups) | **GET** /v1/alert-info-groups/stats | 
[**deleteAlertInfoGroup**](AlertInfoGroupsApi.md#deleteAlertInfoGroup) | **DELETE** /v1/alert-info-groups/{alert_info_group_id} | 
[**getAlertInfoGroup**](AlertInfoGroupsApi.md#getAlertInfoGroup) | **GET** /v1/alert-info-groups/{group_id} | 
[**getAlertInfoGroupsReport**](AlertInfoGroupsApi.md#getAlertInfoGroupsReport) | **GET** /v1/alert-info-groups/report | 
[**listAlertInfoGroups**](AlertInfoGroupsApi.md#listAlertInfoGroups) | **GET** /v1/alert-info-groups/ | 
[**resolveAlertInfoGroup**](AlertInfoGroupsApi.md#resolveAlertInfoGroup) | **POST** /v1/alert-info-groups/{alert_info_group_id}:resolve | 

<a name="ackAlertInfoGroup"></a>
# **ackAlertInfoGroup**
> AlertInfoGroupResp ackAlertInfoGroup(alertInfoGroupId)



set the acked status of alert info group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
Long alertInfoGroupId = 789L; // Long | the id of alert info group
try {
    AlertInfoGroupResp result = apiInstance.ackAlertInfoGroup(alertInfoGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#ackAlertInfoGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoGroupId** | **Long**| the id of alert info group |

### Return type

[**AlertInfoGroupResp**](AlertInfoGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="countAlertInfoGroups"></a>
# **countAlertInfoGroups**
> AlertStatsResp countAlertInfoGroups(acked, resolved, resourceType, resourceId, startTime, endTime)



count alert info groups with conditions

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
Boolean acked = true; // Boolean | acked of the most recently alert info in group
Boolean resolved = true; // Boolean | resolved or not of the most recently alert info in group
String resourceType = "resourceType_example"; // String | resource type of alert info group
Long resourceId = 789L; // Long | resource id of alert info group
String startTime = "startTime_example"; // String | start time of create of alert info group
String endTime = "endTime_example"; // String | end time of create of alert info group
try {
    AlertStatsResp result = apiInstance.countAlertInfoGroups(acked, resolved, resourceType, resourceId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#countAlertInfoGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acked** | **Boolean**| acked of the most recently alert info in group | [optional]
 **resolved** | **Boolean**| resolved or not of the most recently alert info in group | [optional]
 **resourceType** | **String**| resource type of alert info group | [optional]
 **resourceId** | **Long**| resource id of alert info group | [optional]
 **startTime** | **String**| start time of create of alert info group | [optional]
 **endTime** | **String**| end time of create of alert info group | [optional]

### Return type

[**AlertStatsResp**](AlertStatsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAlertInfoGroup"></a>
# **deleteAlertInfoGroup**
> AlertInfoGroupResp deleteAlertInfoGroup(alertInfoGroupId)



delete an alert info group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
Long alertInfoGroupId = 789L; // Long | the id of alert info group
try {
    AlertInfoGroupResp result = apiInstance.deleteAlertInfoGroup(alertInfoGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#deleteAlertInfoGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoGroupId** | **Long**| the id of alert info group |

### Return type

[**AlertInfoGroupResp**](AlertInfoGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertInfoGroup"></a>
# **getAlertInfoGroup**
> AlertInfoGroupResp getAlertInfoGroup(groupId)



get alert info group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
Long groupId = 789L; // Long | the id of alert info group
try {
    AlertInfoGroupResp result = apiInstance.getAlertInfoGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#getAlertInfoGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| the id of alert info group |

### Return type

[**AlertInfoGroupResp**](AlertInfoGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertInfoGroupsReport"></a>
# **getAlertInfoGroupsReport**
> getAlertInfoGroupsReport(level, resourceType, createAfter, acked, resolved, group)



Get report of alert info groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
String level = "level_example"; // String | level of alert info group
String resourceType = "resourceType_example"; // String | resource type of alert info group
String createAfter = "createAfter_example"; // String | create_after timestamp of alert info group
Boolean acked = true; // Boolean | acked of alert info
Boolean resolved = true; // Boolean | resolved or not of alert info
String group = "group_example"; // String | group of alert info
try {
    apiInstance.getAlertInfoGroupsReport(level, resourceType, createAfter, acked, resolved, group);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#getAlertInfoGroupsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | **String**| level of alert info group | [optional]
 **resourceType** | **String**| resource type of alert info group | [optional]
 **createAfter** | **String**| create_after timestamp of alert info group | [optional]
 **acked** | **Boolean**| acked of alert info | [optional]
 **resolved** | **Boolean**| resolved or not of alert info | [optional]
 **group** | **String**| group of alert info | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listAlertInfoGroups"></a>
# **listAlertInfoGroups**
> AlertInfoGroupsResp listAlertInfoGroups(qMust, q, relatedResource, sort, limit, offset, level, resourceType, resourceId, createAfter, createBefore, acked, resolved, group, excludeCluster)



List all alert info groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
String qMust = "qMust_example"; // String | must query param of search
String q = "q_example"; // String | should query param of search
String relatedResource = "relatedResource_example"; // String | should query param of search
String sort = "sort_example"; // String | sort param of search
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String level = "level_example"; // String | level of alert info group
String resourceType = "resourceType_example"; // String | resource type of alert info group
Long resourceId = 789L; // Long | resource id of alert info group
String createAfter = "createAfter_example"; // String | create_after start time of alert info group
String createBefore = "createBefore_example"; // String | create_before end time of alert info group
Boolean acked = true; // Boolean | acked of alert info
Boolean resolved = true; // Boolean | resolved or not of alert info
String group = "group_example"; // String | group of alert info
Boolean excludeCluster = true; // Boolean | filter to exclude cluster of alert info
try {
    AlertInfoGroupsResp result = apiInstance.listAlertInfoGroups(qMust, q, relatedResource, sort, limit, offset, level, resourceType, resourceId, createAfter, createBefore, acked, resolved, group, excludeCluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#listAlertInfoGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qMust** | **String**| must query param of search | [optional]
 **q** | **String**| should query param of search | [optional]
 **relatedResource** | **String**| should query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **level** | **String**| level of alert info group | [optional]
 **resourceType** | **String**| resource type of alert info group | [optional]
 **resourceId** | **Long**| resource id of alert info group | [optional]
 **createAfter** | **String**| create_after start time of alert info group | [optional]
 **createBefore** | **String**| create_before end time of alert info group | [optional]
 **acked** | **Boolean**| acked of alert info | [optional]
 **resolved** | **Boolean**| resolved or not of alert info | [optional]
 **group** | **String**| group of alert info | [optional]
 **excludeCluster** | **Boolean**| filter to exclude cluster of alert info | [optional]

### Return type

[**AlertInfoGroupsResp**](AlertInfoGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveAlertInfoGroup"></a>
# **resolveAlertInfoGroup**
> AlertInfoGroupResp resolveAlertInfoGroup(alertInfoGroupId)



set the resolved status of alert info group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfoGroupsApi;

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

AlertInfoGroupsApi apiInstance = new AlertInfoGroupsApi();
Long alertInfoGroupId = 789L; // Long | the id of alert info group
try {
    AlertInfoGroupResp result = apiInstance.resolveAlertInfoGroup(alertInfoGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfoGroupsApi#resolveAlertInfoGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoGroupId** | **Long**| the id of alert info group |

### Return type

[**AlertInfoGroupResp**](AlertInfoGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

