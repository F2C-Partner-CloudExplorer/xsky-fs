# OsOriginPullRulesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSOriginPullRule**](OsOriginPullRulesApi.md#createOSOriginPullRule) | **POST** /v1/os-origin-pull-rules/ | 
[**deleteOSOriginPullRule**](OsOriginPullRulesApi.md#deleteOSOriginPullRule) | **DELETE** /v1/os-origin-pull-rules/{rule_id} | 
[**getOSOriginPullRule**](OsOriginPullRulesApi.md#getOSOriginPullRule) | **GET** /v1/os-origin-pull-rules/{rule_id} | 
[**listOSOriginPullRules**](OsOriginPullRulesApi.md#listOSOriginPullRules) | **GET** /v1/os-origin-pull-rules/ | 
[**updateOSOriginPullRule**](OsOriginPullRulesApi.md#updateOSOriginPullRule) | **PATCH** /v1/os-origin-pull-rules/{rule_id} | 

<a name="createOSOriginPullRule"></a>
# **createOSOriginPullRule**
> OSOriginPullRuleResp createOSOriginPullRule(body, clusterId)



Create os origin pull rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsOriginPullRulesApi;

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

OsOriginPullRulesApi apiInstance = new OsOriginPullRulesApi();
OSOriginPullRuleCreateReq body = new OSOriginPullRuleCreateReq(); // OSOriginPullRuleCreateReq | origin pull rule info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSOriginPullRuleResp result = apiInstance.createOSOriginPullRule(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsOriginPullRulesApi#createOSOriginPullRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSOriginPullRuleCreateReq**](OSOriginPullRuleCreateReq.md)| origin pull rule info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSOriginPullRuleResp**](OSOriginPullRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSOriginPullRule"></a>
# **deleteOSOriginPullRule**
> OSOriginPullRuleResp deleteOSOriginPullRule(ruleId)



Delete an os origin pull rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsOriginPullRulesApi;

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

OsOriginPullRulesApi apiInstance = new OsOriginPullRulesApi();
Long ruleId = 789L; // Long | origin pull rule id
try {
    OSOriginPullRuleResp result = apiInstance.deleteOSOriginPullRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsOriginPullRulesApi#deleteOSOriginPullRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Long**| origin pull rule id |

### Return type

[**OSOriginPullRuleResp**](OSOriginPullRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSOriginPullRule"></a>
# **getOSOriginPullRule**
> OSOriginPullRuleResp getOSOriginPullRule(ruleId)



Get an os origin pull rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsOriginPullRulesApi;

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

OsOriginPullRulesApi apiInstance = new OsOriginPullRulesApi();
Long ruleId = 789L; // Long | rule id
try {
    OSOriginPullRuleResp result = apiInstance.getOSOriginPullRule(ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsOriginPullRulesApi#getOSOriginPullRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleId** | **Long**| rule id |

### Return type

[**OSOriginPullRuleResp**](OSOriginPullRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSOriginPullRules"></a>
# **listOSOriginPullRules**
> OSOriginPullRulesResp listOSOriginPullRules(clusterId, limit, offset, bucketId, s3LbGroupId)



List os origin pull rules

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsOriginPullRulesApi;

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

OsOriginPullRulesApi apiInstance = new OsOriginPullRulesApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long bucketId = 789L; // Long | bucket id
Long s3LbGroupId = 789L; // Long | s3 lb group id
try {
    OSOriginPullRulesResp result = apiInstance.listOSOriginPullRules(clusterId, limit, offset, bucketId, s3LbGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsOriginPullRulesApi#listOSOriginPullRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **bucketId** | **Long**| bucket id | [optional]
 **s3LbGroupId** | **Long**| s3 lb group id | [optional]

### Return type

[**OSOriginPullRulesResp**](OSOriginPullRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSOriginPullRule"></a>
# **updateOSOriginPullRule**
> OSOriginPullRuleResp updateOSOriginPullRule(body, ruleId)



update os origin pull rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsOriginPullRulesApi;

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

OsOriginPullRulesApi apiInstance = new OsOriginPullRulesApi();
OSOriginPullRuleUpdateReq body = new OSOriginPullRuleUpdateReq(); // OSOriginPullRuleUpdateReq | origin pull rule info
Long ruleId = 789L; // Long | origin pull rule id
try {
    OSOriginPullRuleResp result = apiInstance.updateOSOriginPullRule(body, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsOriginPullRulesApi#updateOSOriginPullRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSOriginPullRuleUpdateReq**](OSOriginPullRuleUpdateReq.md)| origin pull rule info |
 **ruleId** | **Long**| origin pull rule id |

### Return type

[**OSOriginPullRuleResp**](OSOriginPullRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

