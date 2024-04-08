# OsPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicy**](OsPoliciesApi.md#createPolicy) | **POST** /v1/os-policies/ | 
[**deletePolicy**](OsPoliciesApi.md#deletePolicy) | **DELETE** /v1/os-policies/{policy_id} | 
[**getPolicy**](OsPoliciesApi.md#getPolicy) | **GET** /v1/os-policies/{policy_id} | 
[**listPolicies**](OsPoliciesApi.md#listPolicies) | **GET** /v1/os-policies/ | 
[**updatePolicy**](OsPoliciesApi.md#updatePolicy) | **PATCH** /v1/os-policies/{policy_id} | 

<a name="createPolicy"></a>
# **createPolicy**
> ObjectStoragePolicyResp createPolicy(body, clusterId)



Create object storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsPoliciesApi;

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

OsPoliciesApi apiInstance = new OsPoliciesApi();
ObjectStoragePolicyCreateReq body = new ObjectStoragePolicyCreateReq(); // ObjectStoragePolicyCreateReq | policy info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStoragePolicyResp result = apiInstance.createPolicy(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsPoliciesApi#createPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStoragePolicyCreateReq**](ObjectStoragePolicyCreateReq.md)| policy info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStoragePolicyResp**](ObjectStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePolicy"></a>
# **deletePolicy**
> ObjectStoragePolicyResp deletePolicy(policyId)



Delete object storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsPoliciesApi;

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

OsPoliciesApi apiInstance = new OsPoliciesApi();
Long policyId = 789L; // Long | policy id
try {
    ObjectStoragePolicyResp result = apiInstance.deletePolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsPoliciesApi#deletePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| policy id |

### Return type

[**ObjectStoragePolicyResp**](ObjectStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicy"></a>
# **getPolicy**
> ObjectStoragePolicyResp getPolicy(policyId)



Get object storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsPoliciesApi;

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

OsPoliciesApi apiInstance = new OsPoliciesApi();
Long policyId = 789L; // Long | policy id
try {
    ObjectStoragePolicyResp result = apiInstance.getPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsPoliciesApi#getPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| policy id |

### Return type

[**ObjectStoragePolicyResp**](ObjectStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPolicies"></a>
# **listPolicies**
> ObjectStoragePoliciesResp listPolicies(clusterId, limit, offset, q, sort)



List object storage policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsPoliciesApi;

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

OsPoliciesApi apiInstance = new OsPoliciesApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ObjectStoragePoliciesResp result = apiInstance.listPolicies(clusterId, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsPoliciesApi#listPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**ObjectStoragePoliciesResp**](ObjectStoragePoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePolicy"></a>
# **updatePolicy**
> ObjectStoragePolicyResp updatePolicy(body, policyId)



Update object storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsPoliciesApi;

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

OsPoliciesApi apiInstance = new OsPoliciesApi();
ObjectStoragePolicyUpdateReq body = new ObjectStoragePolicyUpdateReq(); // ObjectStoragePolicyUpdateReq | policy info
Long policyId = 789L; // Long | policy id
try {
    ObjectStoragePolicyResp result = apiInstance.updatePolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsPoliciesApi#updatePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStoragePolicyUpdateReq**](ObjectStoragePolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| policy id |

### Return type

[**ObjectStoragePolicyResp**](ObjectStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

