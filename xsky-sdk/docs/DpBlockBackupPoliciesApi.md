# DpBlockBackupPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpBlockBackupPolicy**](DpBlockBackupPoliciesApi.md#createDpBlockBackupPolicy) | **POST** /v1/dp-block-backup-policies/ | 
[**deleteDpBlockBackupPolicy**](DpBlockBackupPoliciesApi.md#deleteDpBlockBackupPolicy) | **DELETE** /v1/dp-block-backup-policies/{policy_id} | 
[**getDpBlockBackupPolicy**](DpBlockBackupPoliciesApi.md#getDpBlockBackupPolicy) | **GET** /v1/dp-block-backup-policies/{policy_id} | 
[**listDpBlockBackupPolicies**](DpBlockBackupPoliciesApi.md#listDpBlockBackupPolicies) | **GET** /v1/dp-block-backup-policies/ | 
[**updateDpBlockBackupPolicy**](DpBlockBackupPoliciesApi.md#updateDpBlockBackupPolicy) | **PATCH** /v1/dp-block-backup-policies/{policy_id} | 

<a name="createDpBlockBackupPolicy"></a>
# **createDpBlockBackupPolicy**
> DpBlockBackupPolicyResp createDpBlockBackupPolicy(body)



Create dp block backup policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockBackupPoliciesApi;

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

DpBlockBackupPoliciesApi apiInstance = new DpBlockBackupPoliciesApi();
DpBlockBackupPolicyCreateReq body = new DpBlockBackupPolicyCreateReq(); // DpBlockBackupPolicyCreateReq | policy info
try {
    DpBlockBackupPolicyResp result = apiInstance.createDpBlockBackupPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockBackupPoliciesApi#createDpBlockBackupPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockBackupPolicyCreateReq**](DpBlockBackupPolicyCreateReq.md)| policy info |

### Return type

[**DpBlockBackupPolicyResp**](DpBlockBackupPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpBlockBackupPolicy"></a>
# **deleteDpBlockBackupPolicy**
> DpBlockBackupPolicyResp deleteDpBlockBackupPolicy(policyId, force)



Delete dp block backup policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockBackupPoliciesApi;

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

DpBlockBackupPoliciesApi apiInstance = new DpBlockBackupPoliciesApi();
Long policyId = 789L; // Long | resource id
Boolean force = true; // Boolean | force delete or not
try {
    DpBlockBackupPolicyResp result = apiInstance.deleteDpBlockBackupPolicy(policyId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockBackupPoliciesApi#deleteDpBlockBackupPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DpBlockBackupPolicyResp**](DpBlockBackupPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpBlockBackupPolicy"></a>
# **getDpBlockBackupPolicy**
> DpBlockBackupPolicyResp getDpBlockBackupPolicy(policyId)



Get dp block backup policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockBackupPoliciesApi;

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

DpBlockBackupPoliciesApi apiInstance = new DpBlockBackupPoliciesApi();
Long policyId = 789L; // Long | resource id
try {
    DpBlockBackupPolicyResp result = apiInstance.getDpBlockBackupPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockBackupPoliciesApi#getDpBlockBackupPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockBackupPolicyResp**](DpBlockBackupPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpBlockBackupPolicies"></a>
# **listDpBlockBackupPolicies**
> DpBlockBackupPoliciesResp listDpBlockBackupPolicies(limit, offset, q, sort, blockVolumeId, dpSiteId)



List dp block backup policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockBackupPoliciesApi;

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

DpBlockBackupPoliciesApi apiInstance = new DpBlockBackupPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long blockVolumeId = 789L; // Long | show dp block backup policies of specific block volume
Long dpSiteId = 789L; // Long | related site id
try {
    DpBlockBackupPoliciesResp result = apiInstance.listDpBlockBackupPolicies(limit, offset, q, sort, blockVolumeId, dpSiteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockBackupPoliciesApi#listDpBlockBackupPolicies");
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
 **blockVolumeId** | **Long**| show dp block backup policies of specific block volume | [optional]
 **dpSiteId** | **Long**| related site id | [optional]

### Return type

[**DpBlockBackupPoliciesResp**](DpBlockBackupPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpBlockBackupPolicy"></a>
# **updateDpBlockBackupPolicy**
> DpBlockBackupPolicyResp updateDpBlockBackupPolicy(body, policyId)



Update dp block backup policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpBlockBackupPoliciesApi;

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

DpBlockBackupPoliciesApi apiInstance = new DpBlockBackupPoliciesApi();
DpBlockBackupPolicyUpdateReq body = new DpBlockBackupPolicyUpdateReq(); // DpBlockBackupPolicyUpdateReq | policy info
Long policyId = 789L; // Long | resource id
try {
    DpBlockBackupPolicyResp result = apiInstance.updateDpBlockBackupPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpBlockBackupPoliciesApi#updateDpBlockBackupPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpBlockBackupPolicyUpdateReq**](DpBlockBackupPolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| resource id |

### Return type

[**DpBlockBackupPolicyResp**](DpBlockBackupPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

