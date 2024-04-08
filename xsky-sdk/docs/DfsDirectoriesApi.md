# DfsDirectoriesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkDirectoryResources**](DfsDirectoriesApi.md#checkDirectoryResources) | **POST** /v1/dfs-directories/:check-resource | 
[**createDfsDirectories**](DfsDirectoriesApi.md#createDfsDirectories) | **POST** /v1/dfs-directories/:create | 
[**createDfsDirectory**](DfsDirectoriesApi.md#createDfsDirectory) | **POST** /v1/dfs-directories/:mkdir | 
[**deleteDfsDirectories**](DfsDirectoriesApi.md#deleteDfsDirectories) | **POST** /v1/dfs-directories/:delete | 
[**deleteDfsDirectory**](DfsDirectoriesApi.md#deleteDfsDirectory) | **POST** /v1/dfs-directories/:rmdir | 
[**directoryValidator**](DfsDirectoriesApi.md#directoryValidator) | **GET** /v1/dfs-directories/directory-validator | 
[**updatePolicyOnDfsDirectory**](DfsDirectoriesApi.md#updatePolicyOnDfsDirectory) | **PATCH** /v1/dfs-directories/:update-storage-policy | 

<a name="checkDirectoryResources"></a>
# **checkDirectoryResources**
> DfsDirectoryResourcesResp checkDirectoryResources(body)



check if resource exists on directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoryReq body = new DfsDirectoryReq(); // DfsDirectoryReq | directory info
try {
    DfsDirectoryResourcesResp result = apiInstance.checkDirectoryResources(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#checkDirectoryResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoryReq**](DfsDirectoryReq.md)| directory info |

### Return type

[**DfsDirectoryResourcesResp**](DfsDirectoryResourcesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsDirectories"></a>
# **createDfsDirectories**
> DfsDirectoriesResp createDfsDirectories(body)



Create directories in dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoriesReq body = new DfsDirectoriesReq(); // DfsDirectoriesReq | directories info
try {
    DfsDirectoriesResp result = apiInstance.createDfsDirectories(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#createDfsDirectories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoriesReq**](DfsDirectoriesReq.md)| directories info |

### Return type

[**DfsDirectoriesResp**](DfsDirectoriesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsDirectory"></a>
# **createDfsDirectory**
> DfsDirectoryResp createDfsDirectory(body)



Create directory in dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoryReq body = new DfsDirectoryReq(); // DfsDirectoryReq | directory info
try {
    DfsDirectoryResp result = apiInstance.createDfsDirectory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#createDfsDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoryReq**](DfsDirectoryReq.md)| directory info |

### Return type

[**DfsDirectoryResp**](DfsDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsDirectories"></a>
# **deleteDfsDirectories**
> DfsDirectoriesResp deleteDfsDirectories(body)



Delete directories in dfs rootfs, deprecated

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoriesReq body = new DfsDirectoriesReq(); // DfsDirectoriesReq | directories info
try {
    DfsDirectoriesResp result = apiInstance.deleteDfsDirectories(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#deleteDfsDirectories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoriesReq**](DfsDirectoriesReq.md)| directories info |

### Return type

[**DfsDirectoriesResp**](DfsDirectoriesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsDirectory"></a>
# **deleteDfsDirectory**
> DfsDirectoryResp deleteDfsDirectory(body)



Delete directory in dfs rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoryReq body = new DfsDirectoryReq(); // DfsDirectoryReq | directory info
try {
    DfsDirectoryResp result = apiInstance.deleteDfsDirectory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#deleteDfsDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoryReq**](DfsDirectoryReq.md)| directory info |

### Return type

[**DfsDirectoryResp**](DfsDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="directoryValidator"></a>
# **directoryValidator**
> DfsDirectoryValidationResp directoryValidator(rootfsId, path)



validate specified directory whether exists, subdirectory contains quotas, snapshots, shares

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
Long rootfsId = 789L; // Long | dfs rootfs id
String path = "path_example"; // String | dfs quota path
try {
    DfsDirectoryValidationResp result = apiInstance.directoryValidator(rootfsId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#directoryValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rootfsId** | **Long**| dfs rootfs id |
 **path** | **String**| dfs quota path |

### Return type

[**DfsDirectoryValidationResp**](DfsDirectoryValidationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePolicyOnDfsDirectory"></a>
# **updatePolicyOnDfsDirectory**
> DfsDirectoryResp updatePolicyOnDfsDirectory(body)



Update policy on Directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsDirectoriesApi;

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

DfsDirectoriesApi apiInstance = new DfsDirectoriesApi();
DfsDirectoryReq body = new DfsDirectoryReq(); // DfsDirectoryReq | policy info
try {
    DfsDirectoryResp result = apiInstance.updatePolicyOnDfsDirectory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsDirectoriesApi#updatePolicyOnDfsDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsDirectoryReq**](DfsDirectoryReq.md)| policy info |

### Return type

[**DfsDirectoryResp**](DfsDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

