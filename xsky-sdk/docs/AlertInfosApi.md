# AlertInfosApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ackAlertInfo**](AlertInfosApi.md#ackAlertInfo) | **POST** /v1/alert-infos/{alert_info_id}:ack | 
[**countAlertInfos**](AlertInfosApi.md#countAlertInfos) | **GET** /v1/alert-infos/stats | 
[**deleteAlertInfo**](AlertInfosApi.md#deleteAlertInfo) | **DELETE** /v1/alert-infos/{alert_info_id} | 
[**getAlertInfo**](AlertInfosApi.md#getAlertInfo) | **GET** /v1/alert-infos/{alert_info_id} | 
[**getAlertInfosReport**](AlertInfosApi.md#getAlertInfosReport) | **GET** /v1/alert-infos/report | 
[**listAlertInfos**](AlertInfosApi.md#listAlertInfos) | **GET** /v1/alert-infos/ | 
[**resolveAlertInfo**](AlertInfosApi.md#resolveAlertInfo) | **POST** /v1/alert-infos/{alert_info_id}:resolve | 

<a name="ackAlertInfo"></a>
# **ackAlertInfo**
> ackAlertInfo(alertInfoId)



set the acked status of alert info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
Long alertInfoId = 789L; // Long | the id of alert info
try {
    apiInstance.ackAlertInfo(alertInfoId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#ackAlertInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoId** | **Long**| the id of alert info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="countAlertInfos"></a>
# **countAlertInfos**
> AlertStatsResp countAlertInfos(acked, resolved, resourceType, resourceId)



count all alert infos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
Boolean acked = true; // Boolean | acked of alert info
Boolean resolved = true; // Boolean | resolved or not of alert info
String resourceType = "resourceType_example"; // String | resource type of alert info
Long resourceId = 789L; // Long | resource id of alert info
try {
    AlertStatsResp result = apiInstance.countAlertInfos(acked, resolved, resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#countAlertInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acked** | **Boolean**| acked of alert info | [optional]
 **resolved** | **Boolean**| resolved or not of alert info | [optional]
 **resourceType** | **String**| resource type of alert info | [optional]
 **resourceId** | **Long**| resource id of alert info | [optional]

### Return type

[**AlertStatsResp**](AlertStatsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAlertInfo"></a>
# **deleteAlertInfo**
> AlertInfoResp deleteAlertInfo(alertInfoId)



delete an alert info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
Long alertInfoId = 789L; // Long | the id of alert info
try {
    AlertInfoResp result = apiInstance.deleteAlertInfo(alertInfoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#deleteAlertInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoId** | **Long**| the id of alert info |

### Return type

[**AlertInfoResp**](AlertInfoResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertInfo"></a>
# **getAlertInfo**
> AlertInfoResp getAlertInfo(alertInfoId)



get an alert info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
Long alertInfoId = 789L; // Long | alert info id
try {
    AlertInfoResp result = apiInstance.getAlertInfo(alertInfoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#getAlertInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoId** | **Long**| alert info id |

### Return type

[**AlertInfoResp**](AlertInfoResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertInfosReport"></a>
# **getAlertInfosReport**
> getAlertInfosReport(level, resourceType, resourceId, createAfter, acked, resolved, group)



Get report of alert infos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
String level = "level_example"; // String | level of alert info
String resourceType = "resourceType_example"; // String | resource type of alert info
Long resourceId = 789L; // Long | resource id of alert info
String createAfter = "createAfter_example"; // String | create_after timestamp of alert info
Boolean acked = true; // Boolean | acked of alert info
Boolean resolved = true; // Boolean | resolved or not of alert info
String group = "group_example"; // String | group of alert info
try {
    apiInstance.getAlertInfosReport(level, resourceType, resourceId, createAfter, acked, resolved, group);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#getAlertInfosReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | **String**| level of alert info | [optional]
 **resourceType** | **String**| resource type of alert info | [optional]
 **resourceId** | **Long**| resource id of alert info | [optional]
 **createAfter** | **String**| create_after timestamp of alert info | [optional]
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

<a name="listAlertInfos"></a>
# **listAlertInfos**
> AlertInfosResp listAlertInfos(qMust, q, relatedResource, sort, limit, offset, level, resourceType, resourceId, createAfter, acked, resolved, group, excludeCluster)



List all alert infos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
String qMust = "qMust_example"; // String | must query param of search
String q = "q_example"; // String | should query param of search
String relatedResource = "relatedResource_example"; // String | should query param of search
String sort = "sort_example"; // String | sort param of search
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String level = "level_example"; // String | level of alert info
String resourceType = "resourceType_example"; // String | resource type of alert info
Long resourceId = 789L; // Long | resource id of alert info
String createAfter = "createAfter_example"; // String | create_after timestamp of alert info
Boolean acked = true; // Boolean | acked of alert info
Boolean resolved = true; // Boolean | resolved or not of alert info
String group = "group_example"; // String | group of alert info
Boolean excludeCluster = true; // Boolean | filter to exclude cluster of alert info
try {
    AlertInfosResp result = apiInstance.listAlertInfos(qMust, q, relatedResource, sort, limit, offset, level, resourceType, resourceId, createAfter, acked, resolved, group, excludeCluster);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#listAlertInfos");
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
 **level** | **String**| level of alert info | [optional]
 **resourceType** | **String**| resource type of alert info | [optional]
 **resourceId** | **Long**| resource id of alert info | [optional]
 **createAfter** | **String**| create_after timestamp of alert info | [optional]
 **acked** | **Boolean**| acked of alert info | [optional]
 **resolved** | **Boolean**| resolved or not of alert info | [optional]
 **group** | **String**| group of alert info | [optional]
 **excludeCluster** | **Boolean**| filter to exclude cluster of alert info | [optional]

### Return type

[**AlertInfosResp**](AlertInfosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveAlertInfo"></a>
# **resolveAlertInfo**
> resolveAlertInfo(alertInfoId)



set the resolved status of alert info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertInfosApi;

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

AlertInfosApi apiInstance = new AlertInfosApi();
Long alertInfoId = 789L; // Long | the id of alert info
try {
    apiInstance.resolveAlertInfo(alertInfoId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertInfosApi#resolveAlertInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertInfoId** | **Long**| the id of alert info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

