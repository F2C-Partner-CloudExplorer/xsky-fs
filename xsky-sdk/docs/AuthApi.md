# AuthApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRSAKey**](AuthApi.md#createRSAKey) | **POST** /v1/auth/rsa-keys | 
[**createToken**](AuthApi.md#createToken) | **POST** /v1/auth/tokens | 
[**getAuthSecurityPolicy**](AuthApi.md#getAuthSecurityPolicy) | **GET** /v1/auth/security-policy | 
[**login**](AuthApi.md#login) | **POST** /v1/auth/tokens:login | 
[**logout**](AuthApi.md#logout) | **POST** /v1/auth/tokens:logout | 
[**updateAuthSecurityPolicy**](AuthApi.md#updateAuthSecurityPolicy) | **PATCH** /v1/auth/security-policy | 
[**validatePrivilegedToken**](AuthApi.md#validatePrivilegedToken) | **POST** /v1/auth/:validate-privileged-token | 

<a name="createRSAKey"></a>
# **createRSAKey**
> AuthRSAKeyResp createRSAKey()



Create RSA key

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    AuthRSAKeyResp result = apiInstance.createRSAKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createRSAKey");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthRSAKeyResp**](AuthRSAKeyResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createToken"></a>
# **createToken**
> TokenResp createToken(body)



creates temporary token for credentials

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
TokenCreateReq body = new TokenCreateReq(); // TokenCreateReq | the identity credential
try {
    TokenResp result = apiInstance.createToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TokenCreateReq**](TokenCreateReq.md)| the identity credential |

### Return type

[**TokenResp**](TokenResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthSecurityPolicy"></a>
# **getAuthSecurityPolicy**
> AuthSecurityPolicyResp getAuthSecurityPolicy()



setup auth security policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AuthApi;

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

AuthApi apiInstance = new AuthApi();
try {
    AuthSecurityPolicyResp result = apiInstance.getAuthSecurityPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthSecurityPolicy");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthSecurityPolicyResp**](AuthSecurityPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="login"></a>
# **login**
> TokenResp login(body)



logs in

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
AuthLoginReq body = new AuthLoginReq(); // AuthLoginReq | the identity credential
try {
    TokenResp result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthLoginReq**](AuthLoginReq.md)| the identity credential |

### Return type

[**TokenResp**](TokenResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout()



logs out

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AuthApi;

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

AuthApi apiInstance = new AuthApi();
try {
    apiInstance.logout();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateAuthSecurityPolicy"></a>
# **updateAuthSecurityPolicy**
> AuthSecurityPolicyResp updateAuthSecurityPolicy(body)



update auth security policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AuthApi;

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

AuthApi apiInstance = new AuthApi();
AuthSecurityPolicyUpdateReq body = new AuthSecurityPolicyUpdateReq(); // AuthSecurityPolicyUpdateReq | auth security policy info
try {
    AuthSecurityPolicyResp result = apiInstance.updateAuthSecurityPolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateAuthSecurityPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuthSecurityPolicyUpdateReq**](AuthSecurityPolicyUpdateReq.md)| auth security policy info |

### Return type

[**AuthSecurityPolicyResp**](AuthSecurityPolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validatePrivilegedToken"></a>
# **validatePrivilegedToken**
> PrivilegedTokenResp validatePrivilegedToken(body)



validate privileged token in some operations

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AuthApi;

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

AuthApi apiInstance = new AuthApi();
PrivilegedTokenReq body = new PrivilegedTokenReq(); // PrivilegedTokenReq | privileged token info
try {
    PrivilegedTokenResp result = apiInstance.validatePrivilegedToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#validatePrivilegedToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivilegedTokenReq**](PrivilegedTokenReq.md)| privileged token info |

### Return type

[**PrivilegedTokenResp**](PrivilegedTokenResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

