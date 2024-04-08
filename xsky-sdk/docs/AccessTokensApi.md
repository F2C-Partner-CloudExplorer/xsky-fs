# AccessTokensApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessToken**](AccessTokensApi.md#createAccessToken) | **POST** /v1/access-tokens/ | 
[**deleteAccessToken**](AccessTokensApi.md#deleteAccessToken) | **DELETE** /v1/access-tokens/{access_token_id} | 
[**getAccessToken**](AccessTokensApi.md#getAccessToken) | **GET** /v1/access-tokens/{access_token_id} | 
[**listAccessTokens**](AccessTokensApi.md#listAccessTokens) | **GET** /v1/access-tokens/ | 
[**regenerateAccessToken**](AccessTokensApi.md#regenerateAccessToken) | **POST** /v1/access-tokens/{access_token_id}:regenerate | 
[**updateAccessToken**](AccessTokensApi.md#updateAccessToken) | **PATCH** /v1/access-tokens/{access_token_id} | 
[**validateAccessToken**](AccessTokensApi.md#validateAccessToken) | **POST** /v1/access-tokens:validate | 

<a name="createAccessToken"></a>
# **createAccessToken**
> AccessTokenCreateResp createAccessToken(body)



Create an access token

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
AccessTokenCreateReq body = new AccessTokenCreateReq(); // AccessTokenCreateReq | access token info
try {
    AccessTokenCreateResp result = apiInstance.createAccessToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#createAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessTokenCreateReq**](AccessTokenCreateReq.md)| access token info |

### Return type

[**AccessTokenCreateResp**](AccessTokenCreateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccessToken"></a>
# **deleteAccessToken**
> deleteAccessToken(accessTokenId)



delete an access token

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
Long accessTokenId = 789L; // Long | access token id
try {
    apiInstance.deleteAccessToken(accessTokenId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#deleteAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenId** | **Long**| access token id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAccessToken"></a>
# **getAccessToken**
> AccessTokenResp getAccessToken(accessTokenId)



get an access Token

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
Long accessTokenId = 789L; // Long | access token id
try {
    AccessTokenResp result = apiInstance.getAccessToken(accessTokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#getAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenId** | **Long**| access token id |

### Return type

[**AccessTokenResp**](AccessTokenResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAccessTokens"></a>
# **listAccessTokens**
> AccessTokensResp listAccessTokens(limit, offset, userId, role, all)



List access tokens

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long userId = 789L; // Long | The id of user access tokens belong to
String role = "role_example"; // String | filter access tokens by role
Boolean all = true; // Boolean | show all access tokens
try {
    AccessTokensResp result = apiInstance.listAccessTokens(limit, offset, userId, role, all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#listAccessTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **userId** | **Long**| The id of user access tokens belong to | [optional]
 **role** | **String**| filter access tokens by role | [optional]
 **all** | **Boolean**| show all access tokens | [optional]

### Return type

[**AccessTokensResp**](AccessTokensResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regenerateAccessToken"></a>
# **regenerateAccessToken**
> AccessTokenCreateResp regenerateAccessToken(accessTokenId)



regenereate an access token UUID

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
Long accessTokenId = 789L; // Long | access token id
try {
    AccessTokenCreateResp result = apiInstance.regenerateAccessToken(accessTokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#regenerateAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessTokenId** | **Long**| access token id |

### Return type

[**AccessTokenCreateResp**](AccessTokenCreateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccessToken"></a>
# **updateAccessToken**
> AccessTokenResp updateAccessToken(body, accessTokenId)



update an access token

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
AccessTokenUpdateReq body = new AccessTokenUpdateReq(); // AccessTokenUpdateReq | access token info
Long accessTokenId = 789L; // Long | access token id
try {
    AccessTokenResp result = apiInstance.updateAccessToken(body, accessTokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#updateAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessTokenUpdateReq**](AccessTokenUpdateReq.md)| access token info |
 **accessTokenId** | **Long**| access token id |

### Return type

[**AccessTokenResp**](AccessTokenResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateAccessToken"></a>
# **validateAccessToken**
> AccessTokenResp validateAccessToken(subjectAccessToken)



validate an access token

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AccessTokensApi;

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

AccessTokensApi apiInstance = new AccessTokensApi();
String subjectAccessToken = "subjectAccessToken_example"; // String | access token to be validated
try {
    AccessTokenResp result = apiInstance.validateAccessToken(subjectAccessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokensApi#validateAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectAccessToken** | **String**| access token to be validated |

### Return type

[**AccessTokenResp**](AccessTokenResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

