# AlertRulesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlertRuleResourceBlacklist**](AlertRulesApi.md#createAlertRuleResourceBlacklist) | **POST** /v1/alert-rules/{rule_id}/blacklist | 
[**deleteAlertRule**](AlertRulesApi.md#deleteAlertRule) | **DELETE** /v1/alert-rules/{rule_id} | 
[**deleteAlertRuleResourceBlacklist**](AlertRulesApi.md#deleteAlertRuleResourceBlacklist) | **DELETE** /v1/alert-rules/{rule_id}/blacklist | 
[**getAlertRule**](AlertRulesApi.md#getAlertRule) | **GET** /v1/alert-rules/{rule_id} | 
[**getAlertRuleSchema**](AlertRulesApi.md#getAlertRuleSchema) | **GET** /v1/alert-rules/schema | 
[**getAlertRulesReport**](AlertRulesApi.md#getAlertRulesReport) | **GET** /v1/alert-rules/report | 
[**listAlertRuleResourceBlacklist**](AlertRulesApi.md#listAlertRuleResourceBlacklist) | **GET** /v1/alert-rules/{rule_id}/blacklist | 
[**listAlertRules**](AlertRulesApi.md#listAlertRules) | **GET** /v1/alert-rules/ | 
[**updateAlertRule**](AlertRulesApi.md#updateAlertRule) | **PATCH** /v1/alert-rules/{rule_id} | 

<a name="createAlertRuleResourceBlacklist"></a>
# **createAlertRuleResourceBlacklist**
> AlertRuleResourceBlacklistResp createAlertRuleResourceBlacklist(body, ruleId)



create resource blacklist of alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
UpdateAlertRuleResourceBlacklistReq body = new UpdateAlertRuleResourceBlacklistReq(); // UpdateAlertRuleResourceBlacklistReq | resource blacklist
Long ruleId = 789L; // Long | the id of alert rule
try {
    AlertRuleResourceBlacklistResp result = apiInstance.createAlertRuleResourceBlacklist(body, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#createAlertRuleResourceBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAlertRuleResourceBlacklistReq**](UpdateAlertRuleResourceBlacklistReq.md)| resource blacklist |
 **ruleId** | **Long**| the id of alert rule |

### Return type

[**AlertRuleResourceBlacklistResp**](AlertRuleResourceBlacklistResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertRule"></a>
# **deleteAlertRule**
> deleteAlertRule(ruleId)



delete alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
Long ruleId = 789L; // Long | the id of alert rule
try {
    apiInstance.deleteAlertRule(ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#deleteAlertRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Long**| the id of alert rule |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAlertRuleResourceBlacklist"></a>
# **deleteAlertRuleResourceBlacklist**
> deleteAlertRuleResourceBlacklist(body, ruleId)



delete resource blacklist of alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
UpdateAlertRuleResourceBlacklistReq body = new UpdateAlertRuleResourceBlacklistReq(); // UpdateAlertRuleResourceBlacklistReq | resource blacklist
Long ruleId = 789L; // Long | the id of alert rule
try {
    apiInstance.deleteAlertRuleResourceBlacklist(body, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#deleteAlertRuleResourceBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateAlertRuleResourceBlacklistReq**](UpdateAlertRuleResourceBlacklistReq.md)| resource blacklist |
 **ruleId** | **Long**| the id of alert rule |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAlertRule"></a>
# **getAlertRule**
> AlertRuleResp getAlertRule(ruleId)



get alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
Long ruleId = 789L; // Long | the id of alert rule
try {
    AlertRuleResp result = apiInstance.getAlertRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#getAlertRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Long**| the id of alert rule |

### Return type

[**AlertRuleResp**](AlertRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertRuleSchema"></a>
# **getAlertRuleSchema**
> AlertRuleSchemaResp getAlertRuleSchema()



get alert rule schema

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
try {
    AlertRuleSchemaResp result = apiInstance.getAlertRuleSchema();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#getAlertRuleSchema");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AlertRuleSchemaResp**](AlertRuleSchemaResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlertRulesReport"></a>
# **getAlertRulesReport**
> getAlertRulesReport(resourceType, groupName, level, enabled, basicType)



Get report of alert rules

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
String resourceType = "resourceType_example"; // String | resource type of alert rule
String groupName = "groupName_example"; // String | group name of alert rule
String level = "level_example"; // String | level of alert rule
Boolean enabled = true; // Boolean | enabled or not
String basicType = "basicType_example"; // String | basic type of alert rule
try {
    apiInstance.getAlertRulesReport(resourceType, groupName, level, enabled, basicType);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#getAlertRulesReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceType** | **String**| resource type of alert rule | [optional]
 **groupName** | **String**| group name of alert rule | [optional]
 **level** | **String**| level of alert rule | [optional]
 **enabled** | **Boolean**| enabled or not | [optional]
 **basicType** | **String**| basic type of alert rule | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listAlertRuleResourceBlacklist"></a>
# **listAlertRuleResourceBlacklist**
> AlertRuleResourceBlacklistResp listAlertRuleResourceBlacklist(ruleId, blacklist, limit, offset)



List all blacklist of alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
Long ruleId = 789L; // Long | the id of alert rule
String blacklist = "blacklist_example"; // String | filter resource in blacklist or not
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    AlertRuleResourceBlacklistResp result = apiInstance.listAlertRuleResourceBlacklist(ruleId, blacklist, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#listAlertRuleResourceBlacklist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Long**| the id of alert rule |
 **blacklist** | **String**| filter resource in blacklist or not |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**AlertRuleResourceBlacklistResp**](AlertRuleResourceBlacklistResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAlertRules"></a>
# **listAlertRules**
> AlertRulesResp listAlertRules(limit, offset, alertGroupId, resourceType, groupName, level, enabled, q, sort, basicType)



List all alert rules

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long alertGroupId = 789L; // Long | alert group id
String resourceType = "resourceType_example"; // String | resource type of alert rule
String groupName = "groupName_example"; // String | group name of alert rule
String level = "level_example"; // String | level of alert rule
Boolean enabled = true; // Boolean | enabled or not
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String basicType = "basicType_example"; // String | basic type of alert rule
try {
    AlertRulesResp result = apiInstance.listAlertRules(limit, offset, alertGroupId, resourceType, groupName, level, enabled, q, sort, basicType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#listAlertRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **alertGroupId** | **Long**| alert group id | [optional]
 **resourceType** | **String**| resource type of alert rule | [optional]
 **groupName** | **String**| group name of alert rule | [optional]
 **level** | **String**| level of alert rule | [optional]
 **enabled** | **Boolean**| enabled or not | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **basicType** | **String**| basic type of alert rule | [optional]

### Return type

[**AlertRulesResp**](AlertRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAlertRule"></a>
# **updateAlertRule**
> AlertRuleResp updateAlertRule(body, ruleId)



set alert rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertRulesApi;

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

AlertRulesApi apiInstance = new AlertRulesApi();
AlertRuleUpdateReq body = new AlertRuleUpdateReq(); // AlertRuleUpdateReq | alert rule
Long ruleId = 789L; // Long | the id of alert rule
try {
    AlertRuleResp result = apiInstance.updateAlertRule(body, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertRulesApi#updateAlertRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertRuleUpdateReq**](AlertRuleUpdateReq.md)| alert rule |
 **ruleId** | **Long**| the id of alert rule |

### Return type

[**AlertRuleResp**](AlertRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

