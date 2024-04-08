# DpBlockReplicationPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpBlockReplicationPolicy**](DpBlockReplicationPoliciesApi.md#createDpBlockReplicationPolicy) | **POST** /v1/dp-block-replication-policies/ | 
[**deleteDpBlockReplicationPolicy**](DpBlockReplicationPoliciesApi.md#deleteDpBlockReplicationPolicy) | **DELETE** /v1/dp-block-replication-policies/{policy_id} | 
[**getDpBlockReplicationPolicy**](DpBlockReplicationPoliciesApi.md#getDpBlockReplicationPolicy) | **GET** /v1/dp-block-replication-policies/{policy_id} | 
[**listDpBlockReplicationPolicies**](DpBlockReplicationPoliciesApi.md#listDpBlockReplicationPolicies) | **GET** /v1/dp-block-replication-policies/ | 
[**updateDpBlockReplicationPolicy**](DpBlockReplicationPoliciesApi.md#updateDpBlockReplicationPolicy) | **PATCH** /v1/dp-block-replication-policies/{policy_id} | 

<a name="createDpBlockReplicationPolicy"></a>
# **createDpBlockReplicationPolicy**
> DpBlockReplicationPolicyResp createDpBlockReplicationPolicy(body)



Create dp block replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockReplicationPoliciesApi;

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

DpBlockReplicationPoliciesApi apiInstance = new DpBlockReplicationPoliciesApi();
DpBlockReplicationPolicyCreateReq body = new DpBlockReplicationPolicyCreateReq(); // DpBlockReplicationPolicyCreateReq | policy info
try {
    DpBlockReplicationPolicyResp result = apiInstance.createDpBlockReplicationPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockReplicationPoliciesApi#createDpBlockReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockReplicationPolicyCreateReq**](DpBlockReplicationPolicyCreateReq.md)| policy info |

### Return type

[**DpBlockReplicationPolicyResp**](DpBlockReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockReplicationPolicy"></a>
# **deleteDpBlockReplicationPolicy**
> deleteDpBlockReplicationPolicy(policyId)



Delete dp block replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockReplicationPoliciesApi;

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

DpBlockReplicationPoliciesApi apiInstance = new DpBlockReplicationPoliciesApi();
Long policyId = 789L; // Long | policy id
try {
    apiInstance.deleteDpBlockReplicationPolicy(policyId);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockReplicationPoliciesApi#deleteDpBlockReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| policy id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDpBlockReplicationPolicy"></a>
# **getDpBlockReplicationPolicy**
> DpBlockReplicationPolicyResp getDpBlockReplicationPolicy(policyId)



Get dp block replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockReplicationPoliciesApi;

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

DpBlockReplicationPoliciesApi apiInstance = new DpBlockReplicationPoliciesApi();
Long policyId = 789L; // Long | resource id
try {
    DpBlockReplicationPolicyResp result = apiInstance.getDpBlockReplicationPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockReplicationPoliciesApi#getDpBlockReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockReplicationPolicyResp**](DpBlockReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockReplicationPolicies"></a>
# **listDpBlockReplicationPolicies**
> DpBlockReplicationPoliciesResp listDpBlockReplicationPolicies(limit, offset, q, sort)



List dp block replication policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockReplicationPoliciesApi;

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

DpBlockReplicationPoliciesApi apiInstance = new DpBlockReplicationPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DpBlockReplicationPoliciesResp result = apiInstance.listDpBlockReplicationPolicies(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockReplicationPoliciesApi#listDpBlockReplicationPolicies");
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

[**DpBlockReplicationPoliciesResp**](DpBlockReplicationPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpBlockReplicationPolicy"></a>
# **updateDpBlockReplicationPolicy**
> DpBlockReplicationPolicyResp updateDpBlockReplicationPolicy(body, policyId)



Update dp block replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockReplicationPoliciesApi;

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

DpBlockReplicationPoliciesApi apiInstance = new DpBlockReplicationPoliciesApi();
DpBlockReplicationPolicyUpdateReq body = new DpBlockReplicationPolicyUpdateReq(); // DpBlockReplicationPolicyUpdateReq | policy info
Long policyId = 789L; // Long | resource id
try {
    DpBlockReplicationPolicyResp result = apiInstance.updateDpBlockReplicationPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockReplicationPoliciesApi#updateDpBlockReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockReplicationPolicyUpdateReq**](DpBlockReplicationPolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockReplicationPolicyResp**](DpBlockReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

