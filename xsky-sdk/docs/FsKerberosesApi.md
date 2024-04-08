# FsKerberosesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFSKerberos**](FsKerberosesApi.md#createFSKerberos) | **POST** /v1/fs-kerberoses/ | 
[**deleteFSKerberos**](FsKerberosesApi.md#deleteFSKerberos) | **DELETE** /v1/fs-kerberoses/{fs_kerberos_id} | 
[**getFSKerberos**](FsKerberosesApi.md#getFSKerberos) | **GET** /v1/fs-kerberoses/{fs_kerberos_id} | 
[**listFSKerberoses**](FsKerberosesApi.md#listFSKerberoses) | **GET** /v1/fs-kerberoses/ | 
[**updateFSKerberos**](FsKerberosesApi.md#updateFSKerberos) | **PATCH** /v1/fs-kerberoses/{fs_kerberos_id} | 
[**verifyFSKerberos**](FsKerberosesApi.md#verifyFSKerberos) | **POST** /v1/fs-kerberoses/{fs_kerberos_id}:verify | 

<a name="createFSKerberos"></a>
# **createFSKerberos**
> FSKerberosResp createFSKerberos(body, clusterId)



create file storage kerberos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
FSKerberosCreateReq body = new FSKerberosCreateReq(); // FSKerberosCreateReq | file storage kerberos info
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSKerberosResp result = apiInstance.createFSKerberos(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#createFSKerberos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSKerberosCreateReq**](FSKerberosCreateReq.md)| file storage kerberos info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSKerberosResp**](FSKerberosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFSKerberos"></a>
# **deleteFSKerberos**
> FSKerberosResp deleteFSKerberos(fsKerberosId)



Delete file storage kerberos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
Long fsKerberosId = 789L; // Long | file storage kerberos id
try {
    FSKerberosResp result = apiInstance.deleteFSKerberos(fsKerberosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#deleteFSKerberos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsKerberosId** | **Long**| file storage kerberos id |

### Return type

[**FSKerberosResp**](FSKerberosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFSKerberos"></a>
# **getFSKerberos**
> FSKerberosResp getFSKerberos(fsKerberosId)



Get a file storage kerberos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
Long fsKerberosId = 789L; // Long | file storage kerberos id
try {
    FSKerberosResp result = apiInstance.getFSKerberos(fsKerberosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#getFSKerberos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsKerberosId** | **Long**| file storage kerberos id |

### Return type

[**FSKerberosResp**](FSKerberosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFSKerberoses"></a>
# **listFSKerberoses**
> FSKerberosesResp listFSKerberoses(limit, offset, clusterId, q, sort, actionStatus)



List file storage kerberoses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String actionStatus = "actionStatus_example"; // String | kerberos action status: active, verifying, verifying_error
try {
    FSKerberosesResp result = apiInstance.listFSKerberoses(limit, offset, clusterId, q, sort, actionStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#listFSKerberoses");
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
 **sort** | **String**| sort param of search | [optional]
 **actionStatus** | **String**| kerberos action status: active, verifying, verifying_error | [optional]

### Return type

[**FSKerberosesResp**](FSKerberosesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFSKerberos"></a>
# **updateFSKerberos**
> FSKerberosResp updateFSKerberos(body, fsKerberosId)



Update a file storage kerberos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
FSKerberosUpdateReq body = new FSKerberosUpdateReq(); // FSKerberosUpdateReq | file storage kerberos info
Long fsKerberosId = 789L; // Long | file storage kerberos id
try {
    FSKerberosResp result = apiInstance.updateFSKerberos(body, fsKerberosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#updateFSKerberos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSKerberosUpdateReq**](FSKerberosUpdateReq.md)| file storage kerberos info |
 **fsKerberosId** | **Long**| file storage kerberos id |

### Return type

[**FSKerberosResp**](FSKerberosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyFSKerberos"></a>
# **verifyFSKerberos**
> FSKerberosResp verifyFSKerberos(fsKerberosId)



Verify a fs kerberos info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsKerberosesApi;

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

FsKerberosesApi apiInstance = new FsKerberosesApi();
Long fsKerberosId = 789L; // Long | file storage kerberos id
try {
    FSKerberosResp result = apiInstance.verifyFSKerberos(fsKerberosId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsKerberosesApi#verifyFSKerberos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsKerberosId** | **Long**| file storage kerberos id |

### Return type

[**FSKerberosResp**](FSKerberosResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

