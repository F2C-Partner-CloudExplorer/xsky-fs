# OsUsersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createObjectStorageUser**](OsUsersApi.md#createObjectStorageUser) | **POST** /v1/os-users/ | 
[**deleteObjectStorageUser**](OsUsersApi.md#deleteObjectStorageUser) | **DELETE** /v1/os-users/{user_id} | 
[**getObjectStorageUser**](OsUsersApi.md#getObjectStorageUser) | **GET** /v1/os-users/{user_id} | 
[**getObjectStorageUserSamples**](OsUsersApi.md#getObjectStorageUserSamples) | **GET** /v1/os-users/{user_id}/samples | 
[**listObjectStorageUsers**](OsUsersApi.md#listObjectStorageUsers) | **GET** /v1/os-users/ | 
[**updateObjectStorageUser**](OsUsersApi.md#updateObjectStorageUser) | **PATCH** /v1/os-users/{user_id} | 

<a name="createObjectStorageUser"></a>
# **createObjectStorageUser**
> ObjectStorageUserResp createObjectStorageUser(body, clusterId)



create object storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
ObjectStorageUserCreateReq body = new ObjectStorageUserCreateReq(); // ObjectStorageUserCreateReq | user info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageUserResp result = apiInstance.createObjectStorageUser(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#createObjectStorageUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageUserCreateReq**](ObjectStorageUserCreateReq.md)| user info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageUserResp**](ObjectStorageUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteObjectStorageUser"></a>
# **deleteObjectStorageUser**
> ObjectStorageUserResp deleteObjectStorageUser(userId)



delete object storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
Long userId = 789L; // Long | user id
try {
    ObjectStorageUserResp result = apiInstance.deleteObjectStorageUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#deleteObjectStorageUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user id |

### Return type

[**ObjectStorageUserResp**](ObjectStorageUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageUser"></a>
# **getObjectStorageUser**
> ObjectStorageUserResp getObjectStorageUser(userId)



get object storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
Long userId = 789L; // Long | user id
try {
    ObjectStorageUserResp result = apiInstance.getObjectStorageUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#getObjectStorageUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user id |

### Return type

[**ObjectStorageUserResp**](ObjectStorageUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageUserSamples"></a>
# **getObjectStorageUserSamples**
> ObjectStorageUserSamplesResp getObjectStorageUserSamples(userId, durationBegin, durationEnd, period)



get an object storage user&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
Long userId = 789L; // Long | user id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    ObjectStorageUserSamplesResp result = apiInstance.getObjectStorageUserSamples(userId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#getObjectStorageUserSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| user id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**ObjectStorageUserSamplesResp**](ObjectStorageUserSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listObjectStorageUsers"></a>
# **listObjectStorageUsers**
> ObjectStorageUsersResp listObjectStorageUsers(clusterId, limit, offset, q, sort)



List object storage users

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ObjectStorageUsersResp result = apiInstance.listObjectStorageUsers(clusterId, limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#listObjectStorageUsers");
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

[**ObjectStorageUsersResp**](ObjectStorageUsersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateObjectStorageUser"></a>
# **updateObjectStorageUser**
> ObjectStorageUserResp updateObjectStorageUser(body, userId)



update object storage user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsUsersApi;

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

OsUsersApi apiInstance = new OsUsersApi();
ObjectStorageUserUpdateReq body = new ObjectStorageUserUpdateReq(); // ObjectStorageUserUpdateReq | user info
Long userId = 789L; // Long | user id
try {
    ObjectStorageUserResp result = apiInstance.updateObjectStorageUser(body, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsUsersApi#updateObjectStorageUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageUserUpdateReq**](ObjectStorageUserUpdateReq.md)| user info |
 **userId** | **Long**| user id |

### Return type

[**ObjectStorageUserResp**](ObjectStorageUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

