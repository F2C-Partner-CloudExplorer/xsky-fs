# DfsFilesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chmod**](DfsFilesApi.md#chmod) | **POST** /v1/dfs-files/:chmod | 
[**deleteDfsFile**](DfsFilesApi.md#deleteDfsFile) | **POST** /v1/dfs-files:delete | 
[**downloadDfsFile**](DfsFilesApi.md#downloadDfsFile) | **GET** /v1/dfs-files/:download | 
[**findDfsFiles**](DfsFilesApi.md#findDfsFiles) | **GET** /v1/dfs-files/:find | 
[**getDfsLogReport**](DfsFilesApi.md#getDfsLogReport) | **GET** /v1/dfs-files/log-report | 
[**listDfsFiles**](DfsFilesApi.md#listDfsFiles) | **POST** /v1/dfs-files/ | 
[**renameDfsFile**](DfsFilesApi.md#renameDfsFile) | **POST** /v1/dfs-files/:rename | 
[**statDfsFile**](DfsFilesApi.md#statDfsFile) | **POST** /v1/dfs-files/:stat | 

<a name="chmod"></a>
# **chmod**
> chmod(body)



Set file mode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
ChmodReq body = new ChmodReq(); // ChmodReq | path and permission info
try {
    apiInstance.chmod(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#chmod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChmodReq**](ChmodReq.md)| path and permission info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteDfsFile"></a>
# **deleteDfsFile**
> deleteDfsFile(body)



delete dfs file from rootfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
DfsFileDeleteReq body = new DfsFileDeleteReq(); // DfsFileDeleteReq | active pool ids
try {
    apiInstance.deleteDfsFile(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#deleteDfsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsFileDeleteReq**](DfsFileDeleteReq.md)| active pool ids |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="downloadDfsFile"></a>
# **downloadDfsFile**
> File downloadDfsFile(path, rootfsId)



Download a file from dfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
String path = "path_example"; // String | dfs file path
Long rootfsId = 789L; // Long | dfs rootfs id
try {
    File result = apiInstance.downloadDfsFile(path, rootfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#downloadDfsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| dfs file path |
 **rootfsId** | **Long**| dfs rootfs id | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="findDfsFiles"></a>
# **findDfsFiles**
> DfsFileBasesResp findDfsFiles(path, rootfsId, type)



Find files in dfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
String path = "path_example"; // String | dfs dirctory path
Long rootfsId = 789L; // Long | dfs rootfs id
String type = "type_example"; // String | filter type, 'file' or 'dir'
try {
    DfsFileBasesResp result = apiInstance.findDfsFiles(path, rootfsId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#findDfsFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| dfs dirctory path |
 **rootfsId** | **Long**| dfs rootfs id | [optional]
 **type** | **String**| filter type, &#x27;file&#x27; or &#x27;dir&#x27; | [optional]

### Return type

[**DfsFileBasesResp**](DfsFileBasesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsLogReport"></a>
# **getDfsLogReport**
> File getDfsLogReport(dfsRootfsId, paths)



Get report of a gfs log

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String paths = "paths_example"; // String | dfs log path
try {
    File result = apiInstance.getDfsLogReport(dfsRootfsId, paths);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#getDfsLogReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsRootfsId** | **Long**| dfs rootfs id |
 **paths** | **String**| dfs log path |

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="listDfsFiles"></a>
# **listDfsFiles**
> DfsFilesResp listDfsFiles(rootfsId, limit, path, start, prefix, type, worm, reverse, pageUp, hidden)



List dfs files in a directory

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
Long rootfsId = 789L; // Long | dfs rootfs id
Long limit = 789L; // Long | paging param
String path = "path_example"; // String | parent path
String start = "start_example"; // String | start file for list
String prefix = "prefix_example"; // String | prefix to filter file or directory
String type = "type_example"; // String | filter by file or dir type
Boolean worm = true; // Boolean | check dir worm before enable filter
Boolean reverse = true; // Boolean | sort reverse
Boolean pageUp = true; // Boolean | query last page instead of next
Boolean hidden = true; // Boolean | show hidden files
try {
    DfsFilesResp result = apiInstance.listDfsFiles(rootfsId, limit, path, start, prefix, type, worm, reverse, pageUp, hidden);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#listDfsFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rootfsId** | **Long**| dfs rootfs id | [optional]
 **limit** | **Long**| paging param | [optional]
 **path** | **String**| parent path | [optional]
 **start** | **String**| start file for list | [optional]
 **prefix** | **String**| prefix to filter file or directory | [optional]
 **type** | **String**| filter by file or dir type | [optional]
 **worm** | **Boolean**| check dir worm before enable filter | [optional]
 **reverse** | **Boolean**| sort reverse | [optional]
 **pageUp** | **Boolean**| query last page instead of next | [optional]
 **hidden** | **Boolean**| show hidden files | [optional]

### Return type

[**DfsFilesResp**](DfsFilesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="renameDfsFile"></a>
# **renameDfsFile**
> renameDfsFile(body)



rename dfs file

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
RenameDfsFileReq body = new RenameDfsFileReq(); // RenameDfsFileReq | src path and dst path
try {
    apiInstance.renameDfsFile(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#renameDfsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RenameDfsFileReq**](RenameDfsFileReq.md)| src path and dst path |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="statDfsFile"></a>
# **statDfsFile**
> DfsFileResp statDfsFile(rootfsId, path)



Get dfs file Stat

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsFilesApi;

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

DfsFilesApi apiInstance = new DfsFilesApi();
Long rootfsId = 789L; // Long | dfs rootfs id
String path = "path_example"; // String | parent path
try {
    DfsFileResp result = apiInstance.statDfsFile(rootfsId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsFilesApi#statDfsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rootfsId** | **Long**| dfs rootfs id | [optional]
 **path** | **String**| parent path | [optional]

### Return type

[**DfsFileResp**](DfsFileResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

