# AccessPathsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessPath**](AccessPathsApi.md#createAccessPath) | **POST** /v1/access-paths/ | 
[**deleteAccessPath**](AccessPathsApi.md#deleteAccessPath) | **DELETE** /v1/access-paths/{access_path_id} | 
[**getAccessPath**](AccessPathsApi.md#getAccessPath) | **GET** /v1/access-paths/{access_path_id} | 
[**listAccessPaths**](AccessPathsApi.md#listAccessPaths) | **GET** /v1/access-paths/ | 
[**updateAccessPath**](AccessPathsApi.md#updateAccessPath) | **PATCH** /v1/access-paths/{access_path_id} | 

<a name="createAccessPath"></a>
# **createAccessPath**
> AccessPathResp createAccessPath(body, clusterId)



Create an access path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessPathsApi;

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

AccessPathsApi apiInstance = new AccessPathsApi();
AccessPathCreateReq body = new AccessPathCreateReq(); // AccessPathCreateReq | access path info
String clusterId = "clusterId_example"; // String | cluster id
try {
    AccessPathResp result = apiInstance.createAccessPath(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPathsApi#createAccessPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessPathCreateReq**](AccessPathCreateReq.md)| access path info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**AccessPathResp**](AccessPathResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccessPath"></a>
# **deleteAccessPath**
> AccessPathResp deleteAccessPath(accessPathId)



Delete access path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessPathsApi;

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

AccessPathsApi apiInstance = new AccessPathsApi();
Long accessPathId = 789L; // Long | access path id
try {
    AccessPathResp result = apiInstance.deleteAccessPath(accessPathId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPathsApi#deleteAccessPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessPathId** | **Long**| access path id |

### Return type

[**AccessPathResp**](AccessPathResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccessPath"></a>
# **getAccessPath**
> AccessPathResp getAccessPath(accessPathId)



Get access path by id

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessPathsApi;

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

AccessPathsApi apiInstance = new AccessPathsApi();
Long accessPathId = 789L; // Long | access path id
try {
    AccessPathResp result = apiInstance.getAccessPath(accessPathId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPathsApi#getAccessPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessPathId** | **Long**| access path id |

### Return type

[**AccessPathResp**](AccessPathResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccessPaths"></a>
# **listAccessPaths**
> AccessPathsResp listAccessPaths(limit, offset, clusterId, q, uid, clientGroupId, all)



List access paths

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessPathsApi;

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

AccessPathsApi apiInstance = new AccessPathsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String q = "q_example"; // String | query param of search
String uid = "uid_example"; // String | access path uid
Long clientGroupId = 789L; // Long | related client group id
Boolean all = true; // Boolean | show all access targets
try {
    AccessPathsResp result = apiInstance.listAccessPaths(limit, offset, clusterId, q, uid, clientGroupId, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPathsApi#listAccessPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **uid** | **String**| access path uid | [optional]
 **clientGroupId** | **Long**| related client group id | [optional]
 **all** | **Boolean**| show all access targets | [optional]

### Return type

[**AccessPathsResp**](AccessPathsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccessPath"></a>
# **updateAccessPath**
> AccessPathResp updateAccessPath(body, accessPathId)



update access path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessPathsApi;

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

AccessPathsApi apiInstance = new AccessPathsApi();
AccessPathUpdateReq body = new AccessPathUpdateReq(); // AccessPathUpdateReq | access path info
Long accessPathId = 789L; // Long | access path id
try {
    AccessPathResp result = apiInstance.updateAccessPath(body, accessPathId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessPathsApi#updateAccessPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessPathUpdateReq**](AccessPathUpdateReq.md)| access path info |
 **accessPathId** | **Long**| access path id |

### Return type

[**AccessPathResp**](AccessPathResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

