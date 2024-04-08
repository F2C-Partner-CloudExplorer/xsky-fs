# DpBlockSnapshotPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpBlockSnapshotPolicy**](DpBlockSnapshotPoliciesApi.md#createDpBlockSnapshotPolicy) | **POST** /v1/dp-block-snapshot-policies/ | 
[**deleteDpBlockSnapshotPolicy**](DpBlockSnapshotPoliciesApi.md#deleteDpBlockSnapshotPolicy) | **DELETE** /v1/dp-block-snapshot-policies/{policy_id} | 
[**getDpBlockSnapshotPolicy**](DpBlockSnapshotPoliciesApi.md#getDpBlockSnapshotPolicy) | **GET** /v1/dp-block-snapshot-policies/{policy_id} | 
[**listDpBlockSnapshotPolicies**](DpBlockSnapshotPoliciesApi.md#listDpBlockSnapshotPolicies) | **GET** /v1/dp-block-snapshot-policies/ | 
[**updateDpBlockSnapshotPolicy**](DpBlockSnapshotPoliciesApi.md#updateDpBlockSnapshotPolicy) | **PATCH** /v1/dp-block-snapshot-policies/{policy_id} | 

<a name="createDpBlockSnapshotPolicy"></a>
# **createDpBlockSnapshotPolicy**
> DpBlockSnapshotPolicyResp createDpBlockSnapshotPolicy(body)



Create dp block snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotPoliciesApi;

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

DpBlockSnapshotPoliciesApi apiInstance = new DpBlockSnapshotPoliciesApi();
DpBlockSnapshotPolicyCreateReq body = new DpBlockSnapshotPolicyCreateReq(); // DpBlockSnapshotPolicyCreateReq | policy info
try {
    DpBlockSnapshotPolicyResp result = apiInstance.createDpBlockSnapshotPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotPoliciesApi#createDpBlockSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockSnapshotPolicyCreateReq**](DpBlockSnapshotPolicyCreateReq.md)| policy info |

### Return type

[**DpBlockSnapshotPolicyResp**](DpBlockSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockSnapshotPolicy"></a>
# **deleteDpBlockSnapshotPolicy**
> DpBlockSnapshotPolicyResp deleteDpBlockSnapshotPolicy(policyId, force)



Delete dp block snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotPoliciesApi;

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

DpBlockSnapshotPoliciesApi apiInstance = new DpBlockSnapshotPoliciesApi();
Long policyId = 789L; // Long | resource id
Boolean force = true; // Boolean | force delete or not
try {
    DpBlockSnapshotPolicyResp result = apiInstance.deleteDpBlockSnapshotPolicy(policyId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotPoliciesApi#deleteDpBlockSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DpBlockSnapshotPolicyResp**](DpBlockSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpBlockSnapshotPolicy"></a>
# **getDpBlockSnapshotPolicy**
> DpBlockSnapshotPolicyResp getDpBlockSnapshotPolicy(policyId)



Get dp block snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotPoliciesApi;

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

DpBlockSnapshotPoliciesApi apiInstance = new DpBlockSnapshotPoliciesApi();
Long policyId = 789L; // Long | resource id
try {
    DpBlockSnapshotPolicyResp result = apiInstance.getDpBlockSnapshotPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotPoliciesApi#getDpBlockSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockSnapshotPolicyResp**](DpBlockSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockSnapshotPolicies"></a>
# **listDpBlockSnapshotPolicies**
> DpBlockSnapshotPoliciesResp listDpBlockSnapshotPolicies(limit, offset, q, sort)



List dp block snapshot policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotPoliciesApi;

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

DpBlockSnapshotPoliciesApi apiInstance = new DpBlockSnapshotPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DpBlockSnapshotPoliciesResp result = apiInstance.listDpBlockSnapshotPolicies(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotPoliciesApi#listDpBlockSnapshotPolicies");
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

[**DpBlockSnapshotPoliciesResp**](DpBlockSnapshotPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpBlockSnapshotPolicy"></a>
# **updateDpBlockSnapshotPolicy**
> DpBlockSnapshotPolicyResp updateDpBlockSnapshotPolicy(body, policyId)



Update dp block snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockSnapshotPoliciesApi;

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

DpBlockSnapshotPoliciesApi apiInstance = new DpBlockSnapshotPoliciesApi();
DpBlockSnapshotPolicyUpdateReq body = new DpBlockSnapshotPolicyUpdateReq(); // DpBlockSnapshotPolicyUpdateReq | policy info
Long policyId = 789L; // Long | resource id
try {
    DpBlockSnapshotPolicyResp result = apiInstance.updateDpBlockSnapshotPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockSnapshotPoliciesApi#updateDpBlockSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockSnapshotPolicyUpdateReq**](DpBlockSnapshotPolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockSnapshotPolicyResp**](DpBlockSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

