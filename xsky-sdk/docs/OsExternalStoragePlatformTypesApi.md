# OsExternalStoragePlatformTypesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSExternalStoragePlatformType**](OsExternalStoragePlatformTypesApi.md#createOSExternalStoragePlatformType) | **POST** /v1/os-external-storage-platform-types/ | 
[**getOSExternalStoragePlatformType**](OsExternalStoragePlatformTypesApi.md#getOSExternalStoragePlatformType) | **GET** /v1/os-external-storage-platform-types/{external_storage_platform_type_id} | 
[**listOSExternalStoragePlatformTypes**](OsExternalStoragePlatformTypesApi.md#listOSExternalStoragePlatformTypes) | **GET** /v1/os-external-storage-platform-types/ | 

<a name="createOSExternalStoragePlatformType"></a>
# **createOSExternalStoragePlatformType**
> OSExternalStoragePlatformTypeResp createOSExternalStoragePlatformType(body, clusterId)



Create os external storage platform type

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStoragePlatformTypesApi;

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

OsExternalStoragePlatformTypesApi apiInstance = new OsExternalStoragePlatformTypesApi();
OSExternalStoragePlatformTypeCreateReq body = new OSExternalStoragePlatformTypeCreateReq(); // OSExternalStoragePlatformTypeCreateReq | external storage platform type info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStoragePlatformTypeResp result = apiInstance.createOSExternalStoragePlatformType(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStoragePlatformTypesApi#createOSExternalStoragePlatformType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSExternalStoragePlatformTypeCreateReq**](OSExternalStoragePlatformTypeCreateReq.md)| external storage platform type info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStoragePlatformTypeResp**](OSExternalStoragePlatformTypeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOSExternalStoragePlatformType"></a>
# **getOSExternalStoragePlatformType**
> OSExternalStoragePlatformTypeResp getOSExternalStoragePlatformType(externalStoragePlatformTypeId)



Get an os external storage platform type info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStoragePlatformTypesApi;

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

OsExternalStoragePlatformTypesApi apiInstance = new OsExternalStoragePlatformTypesApi();
Long externalStoragePlatformTypeId = 789L; // Long | external storage platform type id
try {
    OSExternalStoragePlatformTypeResp result = apiInstance.getOSExternalStoragePlatformType(externalStoragePlatformTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStoragePlatformTypesApi#getOSExternalStoragePlatformType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalStoragePlatformTypeId** | **Long**| external storage platform type id |

### Return type

[**OSExternalStoragePlatformTypeResp**](OSExternalStoragePlatformTypeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSExternalStoragePlatformTypes"></a>
# **listOSExternalStoragePlatformTypes**
> OSExternalStoragePlatformTypesResp listOSExternalStoragePlatformTypes(limit, offset, platform, platformType, clusterId)



List os external storage platform types

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStoragePlatformTypesApi;

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

OsExternalStoragePlatformTypesApi apiInstance = new OsExternalStoragePlatformTypesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String platform = "platform_example"; // String | platform
String platformType = "platformType_example"; // String | platform type
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStoragePlatformTypesResp result = apiInstance.listOSExternalStoragePlatformTypes(limit, offset, platform, platformType, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStoragePlatformTypesApi#listOSExternalStoragePlatformTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **platform** | **String**| platform | [optional]
 **platformType** | **String**| platform type | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStoragePlatformTypesResp**](OSExternalStoragePlatformTypesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

