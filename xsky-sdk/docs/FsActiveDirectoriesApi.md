# FsActiveDirectoriesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFSActiveDirectory**](FsActiveDirectoriesApi.md#createFSActiveDirectory) | **POST** /v1/fs-active-directories/ | 
[**deleteFSActiveDirectory**](FsActiveDirectoriesApi.md#deleteFSActiveDirectory) | **DELETE** /v1/fs-active-directories/{fs_active_directory_id} | 
[**getFSActiveDirectory**](FsActiveDirectoriesApi.md#getFSActiveDirectory) | **GET** /v1/fs-active-directories/{fs_active_directory_id} | 
[**listFSActiveDirectories**](FsActiveDirectoriesApi.md#listFSActiveDirectories) | **GET** /v1/fs-active-directories/ | 
[**updateFSActiveDirectory**](FsActiveDirectoriesApi.md#updateFSActiveDirectory) | **PATCH** /v1/fs-active-directories/{fs_active_directory_id} | 
[**verifyFSActiveDirectory**](FsActiveDirectoriesApi.md#verifyFSActiveDirectory) | **POST** /v1/fs-active-directories/{fs_active_directory_id}:verify | 

<a name="createFSActiveDirectory"></a>
# **createFSActiveDirectory**
> FSActiveDirectoryResp createFSActiveDirectory(body, clusterId)



create file storage active directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
FSActiveDirectoryCreateReq body = new FSActiveDirectoryCreateReq(); // FSActiveDirectoryCreateReq | file storage active directory info
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSActiveDirectoryResp result = apiInstance.createFSActiveDirectory(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#createFSActiveDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSActiveDirectoryCreateReq**](FSActiveDirectoryCreateReq.md)| file storage active directory info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSActiveDirectoryResp**](FSActiveDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFSActiveDirectory"></a>
# **deleteFSActiveDirectory**
> FSActiveDirectoryResp deleteFSActiveDirectory(fsActiveDirectoryId)



Delete file storage active directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
Long fsActiveDirectoryId = 789L; // Long | file storage active directory id
try {
    FSActiveDirectoryResp result = apiInstance.deleteFSActiveDirectory(fsActiveDirectoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#deleteFSActiveDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsActiveDirectoryId** | **Long**| file storage active directory id |

### Return type

[**FSActiveDirectoryResp**](FSActiveDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFSActiveDirectory"></a>
# **getFSActiveDirectory**
> FSActiveDirectoryResp getFSActiveDirectory(fsActiveDirectoryId)



Get a file storage active directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
Long fsActiveDirectoryId = 789L; // Long | file storage active directory id
try {
    FSActiveDirectoryResp result = apiInstance.getFSActiveDirectory(fsActiveDirectoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#getFSActiveDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsActiveDirectoryId** | **Long**| file storage active directory id |

### Return type

[**FSActiveDirectoryResp**](FSActiveDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFSActiveDirectories"></a>
# **listFSActiveDirectories**
> FSActiveDirectoriesResp listFSActiveDirectories(limit, offset, clusterId)



List file storage active directories

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSActiveDirectoriesResp result = apiInstance.listFSActiveDirectories(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#listFSActiveDirectories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSActiveDirectoriesResp**](FSActiveDirectoriesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFSActiveDirectory"></a>
# **updateFSActiveDirectory**
> FSActiveDirectoryResp updateFSActiveDirectory(body, fsActiveDirectoryId)



Update a file storage active directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
FSActiveDirectoryUpdateReq body = new FSActiveDirectoryUpdateReq(); // FSActiveDirectoryUpdateReq | file storage active directory info
Long fsActiveDirectoryId = 789L; // Long | file storage active directory id
try {
    FSActiveDirectoryResp result = apiInstance.updateFSActiveDirectory(body, fsActiveDirectoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#updateFSActiveDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSActiveDirectoryUpdateReq**](FSActiveDirectoryUpdateReq.md)| file storage active directory info |
 **fsActiveDirectoryId** | **Long**| file storage active directory id |

### Return type

[**FSActiveDirectoryResp**](FSActiveDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyFSActiveDirectory"></a>
# **verifyFSActiveDirectory**
> FSActiveDirectoryResp verifyFSActiveDirectory(fsActiveDirectoryId)



Verify a fs active directory or user/group info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsActiveDirectoriesApi;

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

FsActiveDirectoriesApi apiInstance = new FsActiveDirectoriesApi();
Long fsActiveDirectoryId = 789L; // Long | file storage active directory id
try {
    FSActiveDirectoryResp result = apiInstance.verifyFSActiveDirectory(fsActiveDirectoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsActiveDirectoriesApi#verifyFSActiveDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsActiveDirectoryId** | **Long**| file storage active directory id |

### Return type

[**FSActiveDirectoryResp**](FSActiveDirectoryResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

