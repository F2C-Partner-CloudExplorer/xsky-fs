# DfsQosPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsQosPolicy**](DfsQosPoliciesApi.md#createDfsQosPolicy) | **POST** /v1/dfs-qos-policies/ | 
[**deleteDfsQosPolicy**](DfsQosPoliciesApi.md#deleteDfsQosPolicy) | **DELETE** /v1/dfs-qos-policies/{policy_id} | 
[**getDfsQosPolicy**](DfsQosPoliciesApi.md#getDfsQosPolicy) | **GET** /v1/dfs-qos-policies/{policy_id} | 
[**listDfsQosPolicies**](DfsQosPoliciesApi.md#listDfsQosPolicies) | **GET** /v1/dfs-qos-policies/ | 
[**updateDfsQosPolicy**](DfsQosPoliciesApi.md#updateDfsQosPolicy) | **PATCH** /v1/dfs-qos-policies/{policy_id} | 

<a name="createDfsQosPolicy"></a>
# **createDfsQosPolicy**
> DfsQosPolicyResp createDfsQosPolicy(body, clusterId)



Create dfs qos policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosPoliciesApi;

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

DfsQosPoliciesApi apiInstance = new DfsQosPoliciesApi();
DfsQosPolicyCreateReq body = new DfsQosPolicyCreateReq(); // DfsQosPolicyCreateReq | qos policy info
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsQosPolicyResp result = apiInstance.createDfsQosPolicy(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosPoliciesApi#createDfsQosPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQosPolicyCreateReq**](DfsQosPolicyCreateReq.md)| qos policy info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsQosPolicyResp**](DfsQosPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsQosPolicy"></a>
# **deleteDfsQosPolicy**
> DfsQosPolicyResp deleteDfsQosPolicy(policyId, clusterId)



delete dfs qos policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosPoliciesApi;

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

DfsQosPoliciesApi apiInstance = new DfsQosPoliciesApi();
Long policyId = 789L; // Long | policy id
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsQosPolicyResp result = apiInstance.deleteDfsQosPolicy(policyId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosPoliciesApi#deleteDfsQosPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| policy id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsQosPolicyResp**](DfsQosPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQosPolicy"></a>
# **getDfsQosPolicy**
> DfsQosPolicyResp getDfsQosPolicy(policyId)



Get dfs qos policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosPoliciesApi;

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

DfsQosPoliciesApi apiInstance = new DfsQosPoliciesApi();
Long policyId = 789L; // Long | dfs qos policy id
try {
    DfsQosPolicyResp result = apiInstance.getDfsQosPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosPoliciesApi#getDfsQosPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| dfs qos policy id |

### Return type

[**DfsQosPolicyResp**](DfsQosPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsQosPolicies"></a>
# **listDfsQosPolicies**
> DfsQosPoliciesResp listDfsQosPolicies(limit, offset, q, sort)



List dfs qos policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosPoliciesApi;

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

DfsQosPoliciesApi apiInstance = new DfsQosPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsQosPoliciesResp result = apiInstance.listDfsQosPolicies(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosPoliciesApi#listDfsQosPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsQosPoliciesResp**](DfsQosPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsQosPolicy"></a>
# **updateDfsQosPolicy**
> DfsQosPolicyResp updateDfsQosPolicy(body, policyId)



Update dfs qos policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQosPoliciesApi;

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

DfsQosPoliciesApi apiInstance = new DfsQosPoliciesApi();
DfsQosPolicyUpdateReq body = new DfsQosPolicyUpdateReq(); // DfsQosPolicyUpdateReq | dfs qos policy info
Long policyId = 789L; // Long | policy id
try {
    DfsQosPolicyResp result = apiInstance.updateDfsQosPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQosPoliciesApi#updateDfsQosPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQosPolicyUpdateReq**](DfsQosPolicyUpdateReq.md)| dfs qos policy info |
 **policyId** | **Long**| policy id |

### Return type

[**DfsQosPolicyResp**](DfsQosPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

