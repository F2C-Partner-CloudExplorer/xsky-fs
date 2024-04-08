# OsRemotePoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSRemotePolicy**](OsRemotePoliciesApi.md#getOSRemotePolicy) | **GET** /v1/os-remote-policies/{policy_uuid} | 
[**listOSRemotePolicies**](OsRemotePoliciesApi.md#listOSRemotePolicies) | **GET** /v1/os-remote-policies/ | 

<a name="getOSRemotePolicy"></a>
# **getOSRemotePolicy**
> OSRemotePolicyResp getOSRemotePolicy(policyUuid)



Get a os remote policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsRemotePoliciesApi;

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

OsRemotePoliciesApi apiInstance = new OsRemotePoliciesApi();
String policyUuid = "policyUuid_example"; // String | policy uuid
try {
    OSRemotePolicyResp result = apiInstance.getOSRemotePolicy(policyUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsRemotePoliciesApi#getOSRemotePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyUuid** | **String**| policy uuid |

### Return type

[**OSRemotePolicyResp**](OSRemotePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSRemotePolicies"></a>
# **listOSRemotePolicies**
> OSRemotePoliciesResp listOSRemotePolicies(limit, offset, marker, zoneUuid, clusterId)



List os remote policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsRemotePoliciesApi;

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

OsRemotePoliciesApi apiInstance = new OsRemotePoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String marker = "marker_example"; // String | paging param
String zoneUuid = "zoneUuid_example"; // String | zone uuid
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSRemotePoliciesResp result = apiInstance.listOSRemotePolicies(limit, offset, marker, zoneUuid, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsRemotePoliciesApi#listOSRemotePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **marker** | **String**| paging param | [optional]
 **zoneUuid** | **String**| zone uuid | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSRemotePoliciesResp**](OSRemotePoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

