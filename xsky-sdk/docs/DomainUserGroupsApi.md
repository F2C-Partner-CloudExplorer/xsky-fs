# DomainUserGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDomainUserGroup**](DomainUserGroupsApi.md#deleteDomainUserGroup) | **DELETE** /v1/domain-user-groups/{domain_user_group_id} | 
[**listDomainUserGroups**](DomainUserGroupsApi.md#listDomainUserGroups) | **GET** /v1/domain-user-groups/ | 

<a name="deleteDomainUserGroup"></a>
# **deleteDomainUserGroup**
> deleteDomainUserGroup(domainUserGroupId)



delete domain user group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DomainUserGroupsApi;

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

DomainUserGroupsApi apiInstance = new DomainUserGroupsApi();
Long domainUserGroupId = 789L; // Long | domain user group id
try {
    apiInstance.deleteDomainUserGroup(domainUserGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainUserGroupsApi#deleteDomainUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainUserGroupId** | **Long**| domain user group id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listDomainUserGroups"></a>
# **listDomainUserGroups**
> DomainUserGroupsResp listDomainUserGroups(limit, offset)



List domain user groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DomainUserGroupsApi;

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

DomainUserGroupsApi apiInstance = new DomainUserGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    DomainUserGroupsResp result = apiInstance.listDomainUserGroups(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainUserGroupsApi#listDomainUserGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**DomainUserGroupsResp**](DomainUserGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

