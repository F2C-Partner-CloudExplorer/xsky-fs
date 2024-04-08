# AlertRuleGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlertRuleGroupDetail**](AlertRuleGroupsApi.md#getAlertRuleGroupDetail) | **GET** /v1/alert-rule-groups/{id}/detail | 
[**listAlertRuleGroups**](AlertRuleGroupsApi.md#listAlertRuleGroups) | **GET** /v1/alert-rule-groups/ | 
[**updateAlertRuleGroupDetail**](AlertRuleGroupsApi.md#updateAlertRuleGroupDetail) | **PATCH** /v1/alert-rule-groups/{id}/detail | 

<a name="getAlertRuleGroupDetail"></a>
# **getAlertRuleGroupDetail**
> AlertRuleGroupDetailResp getAlertRuleGroupDetail(id)



Get alert rule group detail

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRuleGroupsApi;

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

AlertRuleGroupsApi apiInstance = new AlertRuleGroupsApi();
Long id = 789L; // Long | alert rule group id
try {
    AlertRuleGroupDetailResp result = apiInstance.getAlertRuleGroupDetail(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRuleGroupsApi#getAlertRuleGroupDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| alert rule group id |

### Return type

[**AlertRuleGroupDetailResp**](AlertRuleGroupDetailResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAlertRuleGroups"></a>
# **listAlertRuleGroups**
> AlertRuleGroupsResp listAlertRuleGroups(limit, offset, resourceType, name, level, enabled)



List alert rule groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRuleGroupsApi;

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

AlertRuleGroupsApi apiInstance = new AlertRuleGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String resourceType = "resourceType_example"; // String | resource type of alert rule group
String name = "name_example"; // String | name of alert rule group
String level = "level_example"; // String | level of alert rule group
Boolean enabled = true; // Boolean | enabled or not
try {
    AlertRuleGroupsResp result = apiInstance.listAlertRuleGroups(limit, offset, resourceType, name, level, enabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRuleGroupsApi#listAlertRuleGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **resourceType** | **String**| resource type of alert rule group | [optional]
 **name** | **String**| name of alert rule group | [optional]
 **level** | **String**| level of alert rule group | [optional]
 **enabled** | **Boolean**| enabled or not | [optional]

### Return type

[**AlertRuleGroupsResp**](AlertRuleGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAlertRuleGroupDetail"></a>
# **updateAlertRuleGroupDetail**
> AlertRuleGroupDetailResp updateAlertRuleGroupDetail(body, id, restore)



set alert rule group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRuleGroupsApi;

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

AlertRuleGroupsApi apiInstance = new AlertRuleGroupsApi();
AlertRuleGroupDetailUpdateReq body = new AlertRuleGroupDetailUpdateReq(); // AlertRuleGroupDetailUpdateReq | alert rule group detail
Long id = 789L; // Long | alert rule group id
Boolean restore = true; // Boolean | restore default setup
try {
    AlertRuleGroupDetailResp result = apiInstance.updateAlertRuleGroupDetail(body, id, restore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRuleGroupsApi#updateAlertRuleGroupDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertRuleGroupDetailUpdateReq**](AlertRuleGroupDetailUpdateReq.md)| alert rule group detail |
 **id** | **Long**| alert rule group id |
 **restore** | **Boolean**| restore default setup | [optional]

### Return type

[**AlertRuleGroupDetailResp**](AlertRuleGroupDetailResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

