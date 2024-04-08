# OsBuiltinBluRaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSBuiltinBluRay**](OsBuiltinBluRaysApi.md#createOSBuiltinBluRay) | **POST** /v1/os-builtin-blu-rays/ | 
[**deleteOSBuiltinBluRay**](OsBuiltinBluRaysApi.md#deleteOSBuiltinBluRay) | **DELETE** /v1/os-builtin-blu-rays/{builtin_blu_ray_id} | 
[**getOSBuiltinBluRay**](OsBuiltinBluRaysApi.md#getOSBuiltinBluRay) | **GET** /v1/os-builtin-blu-rays/{builtin_blu_ray_id} | 
[**listOSBuiltinBluRays**](OsBuiltinBluRaysApi.md#listOSBuiltinBluRays) | **GET** /v1/os-builtin-blu-rays/ | 
[**updateOSBuiltinBluRay**](OsBuiltinBluRaysApi.md#updateOSBuiltinBluRay) | **PATCH** /v1/os-builtin-blu-rays/{builtin_blu_ray_id} | 

<a name="createOSBuiltinBluRay"></a>
# **createOSBuiltinBluRay**
> OSBuiltinBluRayResp createOSBuiltinBluRay(body)



Create an os builtin blu ray

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBuiltinBluRaysApi;

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

OsBuiltinBluRaysApi apiInstance = new OsBuiltinBluRaysApi();
OSBuiltinBluRayCreateReq body = new OSBuiltinBluRayCreateReq(); // OSBuiltinBluRayCreateReq | builtin blu ray info
try {
    OSBuiltinBluRayResp result = apiInstance.createOSBuiltinBluRay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBuiltinBluRaysApi#createOSBuiltinBluRay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBuiltinBluRayCreateReq**](OSBuiltinBluRayCreateReq.md)| builtin blu ray info |

### Return type

[**OSBuiltinBluRayResp**](OSBuiltinBluRayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSBuiltinBluRay"></a>
# **deleteOSBuiltinBluRay**
> deleteOSBuiltinBluRay(builtinBluRayId)



Delete an os builtin blu ray

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBuiltinBluRaysApi;

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

OsBuiltinBluRaysApi apiInstance = new OsBuiltinBluRaysApi();
Long builtinBluRayId = 789L; // Long | builtin blu ray id
try {
    apiInstance.deleteOSBuiltinBluRay(builtinBluRayId);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBuiltinBluRaysApi#deleteOSBuiltinBluRay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **builtinBluRayId** | **Long**| builtin blu ray id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOSBuiltinBluRay"></a>
# **getOSBuiltinBluRay**
> OSBuiltinBluRayResp getOSBuiltinBluRay(builtinBluRayId)



Get an os builtin blu ray

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBuiltinBluRaysApi;

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

OsBuiltinBluRaysApi apiInstance = new OsBuiltinBluRaysApi();
Long builtinBluRayId = 789L; // Long | builtin blu ray id
try {
    OSBuiltinBluRayResp result = apiInstance.getOSBuiltinBluRay(builtinBluRayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBuiltinBluRaysApi#getOSBuiltinBluRay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **builtinBluRayId** | **Long**| builtin blu ray id |

### Return type

[**OSBuiltinBluRayResp**](OSBuiltinBluRayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSBuiltinBluRays"></a>
# **listOSBuiltinBluRays**
> OSBuiltinBluRaysResp listOSBuiltinBluRays(limit, offset, q, sort)



List os builtin blu rays

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBuiltinBluRaysApi;

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

OsBuiltinBluRaysApi apiInstance = new OsBuiltinBluRaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    OSBuiltinBluRaysResp result = apiInstance.listOSBuiltinBluRays(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBuiltinBluRaysApi#listOSBuiltinBluRays");
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

[**OSBuiltinBluRaysResp**](OSBuiltinBluRaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSBuiltinBluRay"></a>
# **updateOSBuiltinBluRay**
> OSBuiltinBluRayResp updateOSBuiltinBluRay(body, builtinBluRayId)



update os builtin blu ray

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsBuiltinBluRaysApi;

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

OsBuiltinBluRaysApi apiInstance = new OsBuiltinBluRaysApi();
OSBuiltinBluRayUpdateReq body = new OSBuiltinBluRayUpdateReq(); // OSBuiltinBluRayUpdateReq | builtin blu ray info
Long builtinBluRayId = 789L; // Long | builtin blu ray id
try {
    OSBuiltinBluRayResp result = apiInstance.updateOSBuiltinBluRay(body, builtinBluRayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsBuiltinBluRaysApi#updateOSBuiltinBluRay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSBuiltinBluRayUpdateReq**](OSBuiltinBluRayUpdateReq.md)| builtin blu ray info |
 **builtinBluRayId** | **Long**| builtin blu ray id |

### Return type

[**OSBuiltinBluRayResp**](OSBuiltinBluRayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

