# DpVolumeGroupSnapshotReplicationPoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpVolumeGroupSnapshotReplicationPolicy**](DpVolumeGroupSnapshotReplicationPoliciesApi.md#createDpVolumeGroupSnapshotReplicationPolicy) | **POST** /v1/dp-volume-group-snapshot-replication-policies/ | 
[**deleteDpVolumeGroupSnapshotReplicationPolicy**](DpVolumeGroupSnapshotReplicationPoliciesApi.md#deleteDpVolumeGroupSnapshotReplicationPolicy) | **DELETE** /v1/dp-volume-group-snapshot-replication-policies/{policy_id} | 
[**getDpVolumeGroupSnapshotReplicationPolicy**](DpVolumeGroupSnapshotReplicationPoliciesApi.md#getDpVolumeGroupSnapshotReplicationPolicy) | **GET** /v1/dp-volume-group-snapshot-replication-policies/{policy_id} | 
[**listDpVolumeGroupSnapshotReplicationPolicies**](DpVolumeGroupSnapshotReplicationPoliciesApi.md#listDpVolumeGroupSnapshotReplicationPolicies) | **GET** /v1/dp-volume-group-snapshot-replication-policies/ | 
[**updateDpVolumeGroupSnapshotReplicationPolicy**](DpVolumeGroupSnapshotReplicationPoliciesApi.md#updateDpVolumeGroupSnapshotReplicationPolicy) | **PATCH** /v1/dp-volume-group-snapshot-replication-policies/{policy_id} | 

<a name="createDpVolumeGroupSnapshotReplicationPolicy"></a>
# **createDpVolumeGroupSnapshotReplicationPolicy**
> DpVolumeGroupSnapshotReplicationPolicyResp createDpVolumeGroupSnapshotReplicationPolicy(body)



Create dp volume group snapshot replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPoliciesApi;

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

DpVolumeGroupSnapshotReplicationPoliciesApi apiInstance = new DpVolumeGroupSnapshotReplicationPoliciesApi();
DpVolumeGroupSnapshotReplicationPolicyCreateReq body = new DpVolumeGroupSnapshotReplicationPolicyCreateReq(); // DpVolumeGroupSnapshotReplicationPolicyCreateReq | policy info
try {
    DpVolumeGroupSnapshotReplicationPolicyResp result = apiInstance.createDpVolumeGroupSnapshotReplicationPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPoliciesApi#createDpVolumeGroupSnapshotReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpVolumeGroupSnapshotReplicationPolicyCreateReq**](DpVolumeGroupSnapshotReplicationPolicyCreateReq.md)| policy info |

### Return type

[**DpVolumeGroupSnapshotReplicationPolicyResp**](DpVolumeGroupSnapshotReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpVolumeGroupSnapshotReplicationPolicy"></a>
# **deleteDpVolumeGroupSnapshotReplicationPolicy**
> DpVolumeGroupSnapshotReplicationPolicyResp deleteDpVolumeGroupSnapshotReplicationPolicy(policyId, force)



Delete dp volume group snapshot replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPoliciesApi;

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

DpVolumeGroupSnapshotReplicationPoliciesApi apiInstance = new DpVolumeGroupSnapshotReplicationPoliciesApi();
Long policyId = 789L; // Long | resource id
Boolean force = true; // Boolean | force delete or not
try {
    DpVolumeGroupSnapshotReplicationPolicyResp result = apiInstance.deleteDpVolumeGroupSnapshotReplicationPolicy(policyId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPoliciesApi#deleteDpVolumeGroupSnapshotReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DpVolumeGroupSnapshotReplicationPolicyResp**](DpVolumeGroupSnapshotReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpVolumeGroupSnapshotReplicationPolicy"></a>
# **getDpVolumeGroupSnapshotReplicationPolicy**
> DpVolumeGroupSnapshotReplicationPolicyResp getDpVolumeGroupSnapshotReplicationPolicy(policyId)



Get dp volume group snapshot replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPoliciesApi;

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

DpVolumeGroupSnapshotReplicationPoliciesApi apiInstance = new DpVolumeGroupSnapshotReplicationPoliciesApi();
Long policyId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPolicyResp result = apiInstance.getDpVolumeGroupSnapshotReplicationPolicy(policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPoliciesApi#getDpVolumeGroupSnapshotReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPolicyResp**](DpVolumeGroupSnapshotReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpVolumeGroupSnapshotReplicationPolicies"></a>
# **listDpVolumeGroupSnapshotReplicationPolicies**
> DpVolumeGroupSnapshotReplicationPoliciesResp listDpVolumeGroupSnapshotReplicationPolicies(limit, offset, q, sort, dpSiteId, volumeGroupId)



List dp volume group snapshot replication policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPoliciesApi;

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

DpVolumeGroupSnapshotReplicationPoliciesApi apiInstance = new DpVolumeGroupSnapshotReplicationPoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Long dpSiteId = 789L; // Long | related site id
Long volumeGroupId = 789L; // Long | related volume group id
try {
    DpVolumeGroupSnapshotReplicationPoliciesResp result = apiInstance.listDpVolumeGroupSnapshotReplicationPolicies(limit, offset, q, sort, dpSiteId, volumeGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPoliciesApi#listDpVolumeGroupSnapshotReplicationPolicies");
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
 **volumeGroupId** | **Long**| related volume group id | [optional]

### Return type

[**DpVolumeGroupSnapshotReplicationPoliciesResp**](DpVolumeGroupSnapshotReplicationPoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpVolumeGroupSnapshotReplicationPolicy"></a>
# **updateDpVolumeGroupSnapshotReplicationPolicy**
> DpVolumeGroupSnapshotReplicationPolicyResp updateDpVolumeGroupSnapshotReplicationPolicy(body, policyId)



Update dp volume group snapshot replication policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpVolumeGroupSnapshotReplicationPoliciesApi;

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

DpVolumeGroupSnapshotReplicationPoliciesApi apiInstance = new DpVolumeGroupSnapshotReplicationPoliciesApi();
DpVolumeGroupSnapshotReplicationPolicyUpdateReq body = new DpVolumeGroupSnapshotReplicationPolicyUpdateReq(); // DpVolumeGroupSnapshotReplicationPolicyUpdateReq | policy info
Long policyId = 789L; // Long | resource id
try {
    DpVolumeGroupSnapshotReplicationPolicyResp result = apiInstance.updateDpVolumeGroupSnapshotReplicationPolicy(body, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpVolumeGroupSnapshotReplicationPoliciesApi#updateDpVolumeGroupSnapshotReplicationPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpVolumeGroupSnapshotReplicationPolicyUpdateReq**](DpVolumeGroupSnapshotReplicationPolicyUpdateReq.md)| policy info |
 **policyId** | **Long**| resource id |

### Return type

[**DpVolumeGroupSnapshotReplicationPolicyResp**](DpVolumeGroupSnapshotReplicationPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

