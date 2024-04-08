# RoleMappingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoleMapping**](RoleMappingsApi.md#createRoleMapping) | **POST** /v1/role-mappings/ | 
[**deleteRoleMapping**](RoleMappingsApi.md#deleteRoleMapping) | **DELETE** /v1/role-mappings/{role_mapping_id} | 
[**getRoleMapping**](RoleMappingsApi.md#getRoleMapping) | **GET** /v1/role-mappings/{role_mapping_id} | 
[**listRoleMappings**](RoleMappingsApi.md#listRoleMappings) | **GET** /v1/role-mappings/ | 
[**updateRoleMapping**](RoleMappingsApi.md#updateRoleMapping) | **PATCH** /v1/role-mappings/{role_mapping_id} | 

<a name="createRoleMapping"></a>
# **createRoleMapping**
> RoleMappingResp createRoleMapping(body)



Create role mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RoleMappingsApi;

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

RoleMappingsApi apiInstance = new RoleMappingsApi();
RoleMappingCreateReq body = new RoleMappingCreateReq(); // RoleMappingCreateReq | role mapping info
try {
    RoleMappingResp result = apiInstance.createRoleMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingsApi#createRoleMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleMappingCreateReq**](RoleMappingCreateReq.md)| role mapping info |

### Return type

[**RoleMappingResp**](RoleMappingResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRoleMapping"></a>
# **deleteRoleMapping**
> deleteRoleMapping(roleMappingId)



Delete role mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RoleMappingsApi;

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

RoleMappingsApi apiInstance = new RoleMappingsApi();
Long roleMappingId = 789L; // Long | role mapping id
try {
    apiInstance.deleteRoleMapping(roleMappingId);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingsApi#deleteRoleMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleMappingId** | **Long**| role mapping id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getRoleMapping"></a>
# **getRoleMapping**
> RoleMappingResp getRoleMapping(roleMappingId)



Get a role mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RoleMappingsApi;

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

RoleMappingsApi apiInstance = new RoleMappingsApi();
Long roleMappingId = 789L; // Long | role mapping id
try {
    RoleMappingResp result = apiInstance.getRoleMapping(roleMappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingsApi#getRoleMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleMappingId** | **Long**| role mapping id |

### Return type

[**RoleMappingResp**](RoleMappingResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRoleMappings"></a>
# **listRoleMappings**
> RoleMappingsResp listRoleMappings(limit, offset, identityPlatformId)



List role mappings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RoleMappingsApi;

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

RoleMappingsApi apiInstance = new RoleMappingsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long identityPlatformId = 789L; // Long | identity platform id
try {
    RoleMappingsResp result = apiInstance.listRoleMappings(limit, offset, identityPlatformId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingsApi#listRoleMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **identityPlatformId** | **Long**| identity platform id | [optional]

### Return type

[**RoleMappingsResp**](RoleMappingsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRoleMapping"></a>
# **updateRoleMapping**
> RoleMappingResp updateRoleMapping(body, roleMappingId)



Update a role mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RoleMappingsApi;

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

RoleMappingsApi apiInstance = new RoleMappingsApi();
RoleMappingUpdateReq body = new RoleMappingUpdateReq(); // RoleMappingUpdateReq | role mapping info
Long roleMappingId = 789L; // Long | role mapping id
try {
    RoleMappingResp result = apiInstance.updateRoleMapping(body, roleMappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleMappingsApi#updateRoleMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RoleMappingUpdateReq**](RoleMappingUpdateReq.md)| role mapping info |
 **roleMappingId** | **Long**| role mapping id |

### Return type

[**RoleMappingResp**](RoleMappingResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

