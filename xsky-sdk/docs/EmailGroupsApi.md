# EmailGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmailGroup**](EmailGroupsApi.md#createEmailGroup) | **POST** /v1/email-groups/ | 
[**deleteEmailGroup**](EmailGroupsApi.md#deleteEmailGroup) | **DELETE** /v1/email-groups/{group_id} | 
[**getEmailGroup**](EmailGroupsApi.md#getEmailGroup) | **GET** /v1/email-groups/{group_id} | 
[**listEmailGroups**](EmailGroupsApi.md#listEmailGroups) | **GET** /v1/email-groups/ | 
[**updateEmailGroup**](EmailGroupsApi.md#updateEmailGroup) | **PUT** /v1/email-groups/{group_id} | 

<a name="createEmailGroup"></a>
# **createEmailGroup**
> EmailGroupResp createEmailGroup(body)



create email group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailGroupsApi;

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

EmailGroupsApi apiInstance = new EmailGroupsApi();
EmailGroupUpdateReq body = new EmailGroupUpdateReq(); // EmailGroupUpdateReq | email group
try {
    EmailGroupResp result = apiInstance.createEmailGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailGroupsApi#createEmailGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailGroupUpdateReq**](EmailGroupUpdateReq.md)| email group |

### Return type

[**EmailGroupResp**](EmailGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailGroup"></a>
# **deleteEmailGroup**
> deleteEmailGroup(groupId)



delete email group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailGroupsApi;

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

EmailGroupsApi apiInstance = new EmailGroupsApi();
Long groupId = 789L; // Long | the id of email group
try {
    apiInstance.deleteEmailGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailGroupsApi#deleteEmailGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| the id of email group |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmailGroup"></a>
# **getEmailGroup**
> EmailGroupResp getEmailGroup(groupId)



get email group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailGroupsApi;

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

EmailGroupsApi apiInstance = new EmailGroupsApi();
Long groupId = 789L; // Long | the id of email group
try {
    EmailGroupResp result = apiInstance.getEmailGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailGroupsApi#getEmailGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| the id of email group |

### Return type

[**EmailGroupResp**](EmailGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEmailGroups"></a>
# **listEmailGroups**
> EmailGroupsResp listEmailGroups(limit, offset, alertGroupId, name)



List all email groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailGroupsApi;

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

EmailGroupsApi apiInstance = new EmailGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long alertGroupId = 789L; // Long | alert group id
String name = "name_example"; // String | name of email groups
try {
    EmailGroupsResp result = apiInstance.listEmailGroups(limit, offset, alertGroupId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailGroupsApi#listEmailGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **alertGroupId** | **Long**| alert group id | [optional]
 **name** | **String**| name of email groups | [optional]

### Return type

[**EmailGroupsResp**](EmailGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEmailGroup"></a>
# **updateEmailGroup**
> EmailGroupResp updateEmailGroup(body, groupId)



update email group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailGroupsApi;

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

EmailGroupsApi apiInstance = new EmailGroupsApi();
EmailGroupUpdateReq body = new EmailGroupUpdateReq(); // EmailGroupUpdateReq | email group
Long groupId = 789L; // Long | the id of email group
try {
    EmailGroupResp result = apiInstance.updateEmailGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailGroupsApi#updateEmailGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailGroupUpdateReq**](EmailGroupUpdateReq.md)| email group |
 **groupId** | **Long**| the id of email group |

### Return type

[**EmailGroupResp**](EmailGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

