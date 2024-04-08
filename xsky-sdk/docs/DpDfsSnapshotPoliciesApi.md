# DpDfsSnapshotPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpDfsSnapshotPolicy**](DpDfsSnapshotPoliciesApi.md#createDpDfsSnapshotPolicy) | **POST** /v1/dp-dfs-snapshot-policies/ | 
[**deleteDPDfsSnapshotPolicy**](DpDfsSnapshotPoliciesApi.md#deleteDPDfsSnapshotPolicy) | **DELETE** /v1/dp-dfs-snapshot-policies/{policy_id} | 
[**getDpDfsSnapshotPolicy**](DpDfsSnapshotPoliciesApi.md#getDpDfsSnapshotPolicy) | **GET** /v1/dp-dfs-snapshot-policies/{policy_id} | 
[**listDpDfsSnapshotPolicies**](DpDfsSnapshotPoliciesApi.md#listDpDfsSnapshotPolicies) | **GET** /v1/dp-dfs-snapshot-policies/ | 
[**updateDpDfsSnapshotPolicy**](DpDfsSnapshotPoliciesApi.md#updateDpDfsSnapshotPolicy) | **PATCH** /v1/dp-dfs-snapshot-policies/{policy_id} | 

<a name="createDpDfsSnapshotPolicy"></a>
# **createDpDfsSnapshotPolicy**
> DpDfsSnapshotPolicyResp createDpDfsSnapshotPolicy(body)



Create dp dfs snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotPoliciesApi;

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

DpDfsSnapshotPoliciesApi apiInstance = new DpDfsSnapshotPoliciesApi();
DpDfsSnapshotPolicyCreateReq body = new DpDfsSnapshotPolicyCreateReq(); // DpDfsSnapshotPolicyCreateReq | dp dfs snapshot policy info
try {
    DpDfsSnapshotPolicyResp result = apiInstance.createDpDfsSnapshotPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotPoliciesApi#createDpDfsSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpDfsSnapshotPolicyCreateReq**](DpDfsSnapshotPolicyCreateReq.md)| dp dfs snapshot policy info |

### Return type

[**DpDfsSnapshotPolicyResp**](DpDfsSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDPDfsSnapshotPolicy"></a>
# **deleteDPDfsSnapshotPolicy**
> deleteDPDfsSnapshotPolicy(policyId, force)



Delete a dp dfs snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotPoliciesApi;

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

DpDfsSnapshotPoliciesApi apiInstance = new DpDfsSnapshotPoliciesApi();
Long policyId = 789L; // Long | dp dfs snapshot policy id
Boolean force = true; // Boolean | force delete or not
try {
    apiInstance.deleteDPDfsSnapshotPolicy(policyId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotPoliciesApi#deleteDPDfsSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| dp dfs snapshot policy id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDpDfsSnapshotPolicy"></a>
# **getDpDfsSnapshotPolicy**
> DpDfsSnapshotPolicyResp getDpDfsSnapshotPolicy(policyId)



get dp dfs snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotPoliciesApi;

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

DpDfsSnapshotPoliciesApi apiInstance = new DpDfsSnapshotPoliciesApi();
Long policyId = 789L; // Long | the dp dfs snapshot policy id
try {
    DpDfsSnapshotPolicyResp result = apiInstance.getDpDfsSnapshotPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotPoliciesApi#getDpDfsSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| the dp dfs snapshot policy id |

### Return type

[**DpDfsSnapshotPolicyResp**](DpDfsSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpDfsSnapshotPolicies"></a>
# **listDpDfsSnapshotPolicies**
> DpDfsSnapshotPoliciesResp listDpDfsSnapshotPolicies(limit, offset, q, sort, dfsPathName)



List dp dfs snapshot policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotPoliciesApi;

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

DpDfsSnapshotPoliciesApi apiInstance = new DpDfsSnapshotPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String dfsPathName = "dfsPathName_example"; // String | show dp dfs snapshot policies of specific dfs path
try {
    DpDfsSnapshotPoliciesResp result = apiInstance.listDpDfsSnapshotPolicies(limit, offset, q, sort, dfsPathName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotPoliciesApi#listDpDfsSnapshotPolicies");
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
 **dfsPathName** | **String**| show dp dfs snapshot policies of specific dfs path | [optional]

### Return type

[**DpDfsSnapshotPoliciesResp**](DpDfsSnapshotPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpDfsSnapshotPolicy"></a>
# **updateDpDfsSnapshotPolicy**
> DpDfsSnapshotPolicyResp updateDpDfsSnapshotPolicy(body, policyId)



Update dp dfs snapshot policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpDfsSnapshotPoliciesApi;

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

DpDfsSnapshotPoliciesApi apiInstance = new DpDfsSnapshotPoliciesApi();
DpDfsSnapshotPolicyUpdateReq body = new DpDfsSnapshotPolicyUpdateReq(); // DpDfsSnapshotPolicyUpdateReq | dp dfs snapshot policy update info
Long policyId = 789L; // Long | dp dfs snapshot policy id
try {
    DpDfsSnapshotPolicyResp result = apiInstance.updateDpDfsSnapshotPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpDfsSnapshotPoliciesApi#updateDpDfsSnapshotPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpDfsSnapshotPolicyUpdateReq**](DpDfsSnapshotPolicyUpdateReq.md)| dp dfs snapshot policy update info |
 **policyId** | **Long**| dp dfs snapshot policy id |

### Return type

[**DpDfsSnapshotPolicyResp**](DpDfsSnapshotPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

