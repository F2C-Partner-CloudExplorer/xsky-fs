# OsStorageClassesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSStorageClass**](OsStorageClassesApi.md#createOSStorageClass) | **POST** /v1/os-storage-classes/ | 
[**deleteOSStorageClass**](OsStorageClassesApi.md#deleteOSStorageClass) | **DELETE** /v1/os-storage-classes/{storage_class_id} | 
[**getOSStorageClass**](OsStorageClassesApi.md#getOSStorageClass) | **GET** /v1/os-storage-classes/{storage_class_id} | 
[**listOSStorageClasses**](OsStorageClassesApi.md#listOSStorageClasses) | **GET** /v1/os-storage-classes/ | 
[**updateOSStorageClass**](OsStorageClassesApi.md#updateOSStorageClass) | **PATCH** /v1/os-storage-classes/{storage_class_id} | 

<a name="createOSStorageClass"></a>
# **createOSStorageClass**
> OSStorageClassResp createOSStorageClass(body, clusterId)



Create os storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsStorageClassesApi;

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

OsStorageClassesApi apiInstance = new OsStorageClassesApi();
OSStorageClassCreateReq body = new OSStorageClassCreateReq(); // OSStorageClassCreateReq | storage class info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSStorageClassResp result = apiInstance.createOSStorageClass(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsStorageClassesApi#createOSStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSStorageClassCreateReq**](OSStorageClassCreateReq.md)| storage class info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSStorageClassResp**](OSStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSStorageClass"></a>
# **deleteOSStorageClass**
> OSStorageClassResp deleteOSStorageClass(storageClassId)



Delete an os storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsStorageClassesApi;

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

OsStorageClassesApi apiInstance = new OsStorageClassesApi();
Long storageClassId = 789L; // Long | storage class id
try {
    OSStorageClassResp result = apiInstance.deleteOSStorageClass(storageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsStorageClassesApi#deleteOSStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageClassId** | **Long**| storage class id |

### Return type

[**OSStorageClassResp**](OSStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSStorageClass"></a>
# **getOSStorageClass**
> OSStorageClassResp getOSStorageClass(storageClassId)



Get an os storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsStorageClassesApi;

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

OsStorageClassesApi apiInstance = new OsStorageClassesApi();
String storageClassId = "storageClassId_example"; // String | storage class id
try {
    OSStorageClassResp result = apiInstance.getOSStorageClass(storageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsStorageClassesApi#getOSStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageClassId** | **String**| storage class id |

### Return type

[**OSStorageClassResp**](OSStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSStorageClasses"></a>
# **listOSStorageClasses**
> OSStorageClassesResp listOSStorageClasses(limit, offset, osPolicyId, clusterId)



List os storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsStorageClassesApi;

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

OsStorageClassesApi apiInstance = new OsStorageClassesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long osPolicyId = 789L; // Long | os policy id
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSStorageClassesResp result = apiInstance.listOSStorageClasses(limit, offset, osPolicyId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsStorageClassesApi#listOSStorageClasses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **osPolicyId** | **Long**| os policy id | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSStorageClassesResp**](OSStorageClassesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSStorageClass"></a>
# **updateOSStorageClass**
> OSStorageClassResp updateOSStorageClass(body, storageClassId)



update storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsStorageClassesApi;

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

OsStorageClassesApi apiInstance = new OsStorageClassesApi();
OSStorageClassUpdateReq body = new OSStorageClassUpdateReq(); // OSStorageClassUpdateReq | storage class info
Long storageClassId = 789L; // Long | storage class id
try {
    OSStorageClassResp result = apiInstance.updateOSStorageClass(body, storageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsStorageClassesApi#updateOSStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSStorageClassUpdateReq**](OSStorageClassUpdateReq.md)| storage class info |
 **storageClassId** | **Long**| storage class id |

### Return type

[**OSStorageClassResp**](OSStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

