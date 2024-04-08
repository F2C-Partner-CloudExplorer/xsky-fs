# DfsSmbWindowsAclsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsSMBWindowsACL**](DfsSmbWindowsAclsApi.md#createDfsSMBWindowsACL) | **POST** /v1/dfs-smb-windows-acls/ | 
[**deleteDfsSMBWindowsACL**](DfsSmbWindowsAclsApi.md#deleteDfsSMBWindowsACL) | **DELETE** /v1/dfs-smb-windows-acls/ | 
[**getDfsSMBWindowsACL**](DfsSmbWindowsAclsApi.md#getDfsSMBWindowsACL) | **POST** /v1/dfs-smb-windows-acls/:get-windows-acl | 
[**setDfsSMBWindowsACLs**](DfsSmbWindowsAclsApi.md#setDfsSMBWindowsACLs) | **PATCH** /v1/dfs-smb-windows-acls/:set-acls | 
[**updateDfsSMBWindowsACL**](DfsSmbWindowsAclsApi.md#updateDfsSMBWindowsACL) | **PATCH** /v1/dfs-smb-windows-acls/ | 
[**updateDfsSMBWindowsACLInheritance**](DfsSmbWindowsAclsApi.md#updateDfsSMBWindowsACLInheritance) | **PATCH** /v1/dfs-smb-windows-acls/:update-inheritance | 

<a name="createDfsSMBWindowsACL"></a>
# **createDfsSMBWindowsACL**
> DfsSMBWindowsACLResp createDfsSMBWindowsACL(body)



Create dfs smb windows acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLCreateReq body = new DfsSMBWindowsACLCreateReq(); // DfsSMBWindowsACLCreateReq | windows acl info
try {
    DfsSMBWindowsACLResp result = apiInstance.createDfsSMBWindowsACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#createDfsSMBWindowsACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLCreateReq**](DfsSMBWindowsACLCreateReq.md)| windows acl info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsSMBWindowsACL"></a>
# **deleteDfsSMBWindowsACL**
> DfsSMBWindowsACLResp deleteDfsSMBWindowsACL(body)



Delete dfs smb windows acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLDeleteReq body = new DfsSMBWindowsACLDeleteReq(); // DfsSMBWindowsACLDeleteReq | windows acl info
try {
    DfsSMBWindowsACLResp result = apiInstance.deleteDfsSMBWindowsACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#deleteDfsSMBWindowsACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLDeleteReq**](DfsSMBWindowsACLDeleteReq.md)| windows acl info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDfsSMBWindowsACL"></a>
# **getDfsSMBWindowsACL**
> DfsSMBWindowsACLResp getDfsSMBWindowsACL(body)



Get dfs smb windows acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLGetReq body = new DfsSMBWindowsACLGetReq(); // DfsSMBWindowsACLGetReq | windows acl info
try {
    DfsSMBWindowsACLResp result = apiInstance.getDfsSMBWindowsACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#getDfsSMBWindowsACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLGetReq**](DfsSMBWindowsACLGetReq.md)| windows acl info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDfsSMBWindowsACLs"></a>
# **setDfsSMBWindowsACLs**
> DfsSMBWindowsACLResp setDfsSMBWindowsACLs(body)



Set dfs smb windows acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLSetReq body = new DfsSMBWindowsACLSetReq(); // DfsSMBWindowsACLSetReq | windows acls info
try {
    DfsSMBWindowsACLResp result = apiInstance.setDfsSMBWindowsACLs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#setDfsSMBWindowsACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLSetReq**](DfsSMBWindowsACLSetReq.md)| windows acls info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsSMBWindowsACL"></a>
# **updateDfsSMBWindowsACL**
> DfsSMBWindowsACLResp updateDfsSMBWindowsACL(body)



Update dfs smb windows acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLUpdateReq body = new DfsSMBWindowsACLUpdateReq(); // DfsSMBWindowsACLUpdateReq | windows acl info
try {
    DfsSMBWindowsACLResp result = apiInstance.updateDfsSMBWindowsACL(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#updateDfsSMBWindowsACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLUpdateReq**](DfsSMBWindowsACLUpdateReq.md)| windows acl info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsSMBWindowsACLInheritance"></a>
# **updateDfsSMBWindowsACLInheritance**
> DfsSMBWindowsACLResp updateDfsSMBWindowsACLInheritance(body)



update dfs smb windows acl inheritance

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsSmbWindowsAclsApi;

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

DfsSmbWindowsAclsApi apiInstance = new DfsSmbWindowsAclsApi();
DfsSMBWindowsACLInheritanceUpdateReq body = new DfsSMBWindowsACLInheritanceUpdateReq(); // DfsSMBWindowsACLInheritanceUpdateReq | windows acl info
try {
    DfsSMBWindowsACLResp result = apiInstance.updateDfsSMBWindowsACLInheritance(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsSmbWindowsAclsApi#updateDfsSMBWindowsACLInheritance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsSMBWindowsACLInheritanceUpdateReq**](DfsSMBWindowsACLInheritanceUpdateReq.md)| windows acl info |

### Return type

[**DfsSMBWindowsACLResp**](DfsSMBWindowsACLResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

