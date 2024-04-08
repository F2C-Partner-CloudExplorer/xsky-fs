# IdentityPlatformsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIdentityPlatform**](IdentityPlatformsApi.md#createIdentityPlatform) | **POST** /v1/identity-platforms/ | 
[**deleteIdentityPlatform**](IdentityPlatformsApi.md#deleteIdentityPlatform) | **DELETE** /v1/identity-platforms/{identity_platform_id} | 
[**getIdentityPlatform**](IdentityPlatformsApi.md#getIdentityPlatform) | **GET** /v1/identity-platforms/{identity_platform_id} | 
[**listIdentityPlatforms**](IdentityPlatformsApi.md#listIdentityPlatforms) | **GET** /v1/identity-platforms/ | 
[**loginSSOTypes**](IdentityPlatformsApi.md#loginSSOTypes) | **GET** /v1/identity-platforms/types | 
[**regenerateIdentityKey**](IdentityPlatformsApi.md#regenerateIdentityKey) | **POST** /v1/identity-platforms/{identity_platform_id}:regenerate | 
[**updateIdentityPlatform**](IdentityPlatformsApi.md#updateIdentityPlatform) | **PATCH** /v1/identity-platforms/{identity_platform_id} | 

<a name="createIdentityPlatform"></a>
# **createIdentityPlatform**
> IdentityPlatformResp createIdentityPlatform(body)



Create identity platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
IdentityPlatformCreateReq body = new IdentityPlatformCreateReq(); // IdentityPlatformCreateReq | identity platform info
try {
    IdentityPlatformResp result = apiInstance.createIdentityPlatform(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#createIdentityPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentityPlatformCreateReq**](IdentityPlatformCreateReq.md)| identity platform info |

### Return type

[**IdentityPlatformResp**](IdentityPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIdentityPlatform"></a>
# **deleteIdentityPlatform**
> deleteIdentityPlatform(identityPlatformId)



Delete identity platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
Long identityPlatformId = 789L; // Long | identity platform id
try {
    apiInstance.deleteIdentityPlatform(identityPlatformId);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#deleteIdentityPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityPlatformId** | **Long**| identity platform id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getIdentityPlatform"></a>
# **getIdentityPlatform**
> IdentityPlatformResp getIdentityPlatform(identityPlatformId)



Get a identity platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
Long identityPlatformId = 789L; // Long | identity platform id
try {
    IdentityPlatformResp result = apiInstance.getIdentityPlatform(identityPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#getIdentityPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityPlatformId** | **Long**| identity platform id |

### Return type

[**IdentityPlatformResp**](IdentityPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIdentityPlatforms"></a>
# **listIdentityPlatforms**
> IdentityPlatformsResp listIdentityPlatforms(limit, offset)



List identity platforms

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    IdentityPlatformsResp result = apiInstance.listIdentityPlatforms(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#listIdentityPlatforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**IdentityPlatformsResp**](IdentityPlatformsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginSSOTypes"></a>
# **loginSSOTypes**
> LoginSsoTypesResp loginSSOTypes()



List SSO Protocol Types

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
try {
    LoginSsoTypesResp result = apiInstance.loginSSOTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#loginSSOTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LoginSsoTypesResp**](LoginSsoTypesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regenerateIdentityKey"></a>
# **regenerateIdentityKey**
> IdentityPlatformResp regenerateIdentityKey(identityPlatformId)



regenereate a identity platform key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
Long identityPlatformId = 789L; // Long | identity platform id
try {
    IdentityPlatformResp result = apiInstance.regenerateIdentityKey(identityPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#regenerateIdentityKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityPlatformId** | **Long**| identity platform id |

### Return type

[**IdentityPlatformResp**](IdentityPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIdentityPlatform"></a>
# **updateIdentityPlatform**
> IdentityPlatformResp updateIdentityPlatform(body, identityPlatformId)



Update a identity platform

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.IdentityPlatformsApi;

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

IdentityPlatformsApi apiInstance = new IdentityPlatformsApi();
IdentityPlatformUpdateReq body = new IdentityPlatformUpdateReq(); // IdentityPlatformUpdateReq | identity platform info
Long identityPlatformId = 789L; // Long | identity platform id
try {
    IdentityPlatformResp result = apiInstance.updateIdentityPlatform(body, identityPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityPlatformsApi#updateIdentityPlatform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentityPlatformUpdateReq**](IdentityPlatformUpdateReq.md)| identity platform info |
 **identityPlatformId** | **Long**| identity platform id |

### Return type

[**IdentityPlatformResp**](IdentityPlatformResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

