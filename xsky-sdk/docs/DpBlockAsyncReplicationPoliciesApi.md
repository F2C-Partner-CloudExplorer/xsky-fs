# DpBlockAsyncReplicationPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpBlockAsyncReplicationPolicy**](DpBlockAsyncReplicationPoliciesApi.md#createDpBlockAsyncReplicationPolicy) | **POST** /v1/dp-block-async-replication-policies/ | 
[**deleteDpBlockAsyncReplicationPolicy**](DpBlockAsyncReplicationPoliciesApi.md#deleteDpBlockAsyncReplicationPolicy) | **DELETE** /v1/dp-block-async-replication-policies/{policy_id} | 
[**getDpBlockAsyncReplicationPolicy**](DpBlockAsyncReplicationPoliciesApi.md#getDpBlockAsyncReplicationPolicy) | **GET** /v1/dp-block-async-replication-policies/{policy_id} | 
[**listDpBlockAsyncReplicationPolicies**](DpBlockAsyncReplicationPoliciesApi.md#listDpBlockAsyncReplicationPolicies) | **GET** /v1/dp-block-async-replication-policies/ | 
[**updateDpBlockAsyncReplicationPolicy**](DpBlockAsyncReplicationPoliciesApi.md#updateDpBlockAsyncReplicationPolicy) | **PATCH** /v1/dp-block-async-replication-policies/{policy_id} | 

<a name="createDpBlockAsyncReplicationPolicy"></a>
# **createDpBlockAsyncReplicationPolicy**
> DpBlockAsyncReplicationPolicyResp createDpBlockAsyncReplicationPolicy(body)



Create dp block async replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPoliciesApi;

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

DpBlockAsyncReplicationPoliciesApi apiInstance = new DpBlockAsyncReplicationPoliciesApi();
DpBlockAsyncReplicationPolicyCreateReq body = new DpBlockAsyncReplicationPolicyCreateReq(); // DpBlockAsyncReplicationPolicyCreateReq | policy info
try {
    DpBlockAsyncReplicationPolicyResp result = apiInstance.createDpBlockAsyncReplicationPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPoliciesApi#createDpBlockAsyncReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockAsyncReplicationPolicyCreateReq**](DpBlockAsyncReplicationPolicyCreateReq.md)| policy info |

### Return type

[**DpBlockAsyncReplicationPolicyResp**](DpBlockAsyncReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockAsyncReplicationPolicy"></a>
# **deleteDpBlockAsyncReplicationPolicy**
> DpBlockAsyncReplicationPolicyResp deleteDpBlockAsyncReplicationPolicy(policyId, force)



Delete dp block async replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPoliciesApi;

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

DpBlockAsyncReplicationPoliciesApi apiInstance = new DpBlockAsyncReplicationPoliciesApi();
Long policyId = 789L; // Long | resource id
Boolean force = true; // Boolean | force delete or not
try {
    DpBlockAsyncReplicationPolicyResp result = apiInstance.deleteDpBlockAsyncReplicationPolicy(policyId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPoliciesApi#deleteDpBlockAsyncReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DpBlockAsyncReplicationPolicyResp**](DpBlockAsyncReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpBlockAsyncReplicationPolicy"></a>
# **getDpBlockAsyncReplicationPolicy**
> DpBlockAsyncReplicationPolicyResp getDpBlockAsyncReplicationPolicy(policyId)



Get dp block async replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPoliciesApi;

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

DpBlockAsyncReplicationPoliciesApi apiInstance = new DpBlockAsyncReplicationPoliciesApi();
Long policyId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPolicyResp result = apiInstance.getDpBlockAsyncReplicationPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPoliciesApi#getDpBlockAsyncReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPolicyResp**](DpBlockAsyncReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockAsyncReplicationPolicies"></a>
# **listDpBlockAsyncReplicationPolicies**
> DpBlockAsyncReplicationPoliciesResp listDpBlockAsyncReplicationPolicies(limit, offset, q, sort, dpSiteId, volumeId)



List dp block async replication policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPoliciesApi;

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

DpBlockAsyncReplicationPoliciesApi apiInstance = new DpBlockAsyncReplicationPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long dpSiteId = 789L; // Long | related site id
Long volumeId = 789L; // Long | related volume id
try {
    DpBlockAsyncReplicationPoliciesResp result = apiInstance.listDpBlockAsyncReplicationPolicies(limit, offset, q, sort, dpSiteId, volumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPoliciesApi#listDpBlockAsyncReplicationPolicies");
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
 **dpSiteId** | **Long**| related site id | [optional]
 **volumeId** | **Long**| related volume id | [optional]

### Return type

[**DpBlockAsyncReplicationPoliciesResp**](DpBlockAsyncReplicationPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpBlockAsyncReplicationPolicy"></a>
# **updateDpBlockAsyncReplicationPolicy**
> DpBlockAsyncReplicationPolicyResp updateDpBlockAsyncReplicationPolicy(body, policyId)



Update dp block async replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockAsyncReplicationPoliciesApi;

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

DpBlockAsyncReplicationPoliciesApi apiInstance = new DpBlockAsyncReplicationPoliciesApi();
DpBlockAsyncReplicationPolicyUpdateReq body = new DpBlockAsyncReplicationPolicyUpdateReq(); // DpBlockAsyncReplicationPolicyUpdateReq | policy info
Long policyId = 789L; // Long | resource id
try {
    DpBlockAsyncReplicationPolicyResp result = apiInstance.updateDpBlockAsyncReplicationPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockAsyncReplicationPoliciesApi#updateDpBlockAsyncReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockAsyncReplicationPolicyUpdateReq**](DpBlockAsyncReplicationPolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockAsyncReplicationPolicyResp**](DpBlockAsyncReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

