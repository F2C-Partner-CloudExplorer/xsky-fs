# OsExternalStorageClassesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExternalStorageClass**](OsExternalStorageClassesApi.md#createExternalStorageClass) | **POST** /v1/os-external-storage-classes/ | 
[**deleteOSExternalStorageClass**](OsExternalStorageClassesApi.md#deleteOSExternalStorageClass) | **DELETE** /v1/os-external-storage-classes/{external_storage_class_id} | 
[**getOSExternalStorageClass**](OsExternalStorageClassesApi.md#getOSExternalStorageClass) | **GET** /v1/os-external-storage-classes/{external_storage_class_id} | 
[**listOSExternalStorageClasses**](OsExternalStorageClassesApi.md#listOSExternalStorageClasses) | **GET** /v1/os-external-storage-classes/ | 
[**updateOSExternalStorageClass**](OsExternalStorageClassesApi.md#updateOSExternalStorageClass) | **PATCH** /v1/os-external-storage-classes/{external_storage_class_id} | 

<a name="createExternalStorageClass"></a>
# **createExternalStorageClass**
> OSExternalStorageClassResp createExternalStorageClass(body, clusterId)



Create os external storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStorageClassesApi;

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

OsExternalStorageClassesApi apiInstance = new OsExternalStorageClassesApi();
OSExternalStorageClassCreateReq body = new OSExternalStorageClassCreateReq(); // OSExternalStorageClassCreateReq | external storage class info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStorageClassResp result = apiInstance.createExternalStorageClass(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStorageClassesApi#createExternalStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSExternalStorageClassCreateReq**](OSExternalStorageClassCreateReq.md)| external storage class info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStorageClassResp**](OSExternalStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSExternalStorageClass"></a>
# **deleteOSExternalStorageClass**
> OSExternalStorageClassResp deleteOSExternalStorageClass(externalStorageClassId, clusterId)



Delete an os external storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStorageClassesApi;

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

OsExternalStorageClassesApi apiInstance = new OsExternalStorageClassesApi();
Long externalStorageClassId = 789L; // Long | external storage class id
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStorageClassResp result = apiInstance.deleteOSExternalStorageClass(externalStorageClassId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStorageClassesApi#deleteOSExternalStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalStorageClassId** | **Long**| external storage class id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStorageClassResp**](OSExternalStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSExternalStorageClass"></a>
# **getOSExternalStorageClass**
> OSExternalStorageClassResp getOSExternalStorageClass(externalStorageClassId)



Get a os external storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStorageClassesApi;

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

OsExternalStorageClassesApi apiInstance = new OsExternalStorageClassesApi();
Long externalStorageClassId = 789L; // Long | external storage class id
try {
    OSExternalStorageClassResp result = apiInstance.getOSExternalStorageClass(externalStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStorageClassesApi#getOSExternalStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalStorageClassId** | **Long**| external storage class id |

### Return type

[**OSExternalStorageClassResp**](OSExternalStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSExternalStorageClasses"></a>
# **listOSExternalStorageClasses**
> OSExternalStorageClassesResp listOSExternalStorageClasses(limit, offset, osPolicyId, generalStatus, clusterId)



List os external storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStorageClassesApi;

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

OsExternalStorageClassesApi apiInstance = new OsExternalStorageClassesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long osPolicyId = 789L; // Long | os policy id
Boolean generalStatus = true; // Boolean | query records with active or error status
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStorageClassesResp result = apiInstance.listOSExternalStorageClasses(limit, offset, osPolicyId, generalStatus, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStorageClassesApi#listOSExternalStorageClasses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **osPolicyId** | **Long**| os policy id | [optional]
 **generalStatus** | **Boolean**| query records with active or error status | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStorageClassesResp**](OSExternalStorageClassesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSExternalStorageClass"></a>
# **updateOSExternalStorageClass**
> OSExternalStorageClassResp updateOSExternalStorageClass(body, externalStorageClassId, clusterId)



update os external storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStorageClassesApi;

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

OsExternalStorageClassesApi apiInstance = new OsExternalStorageClassesApi();
OSExternalStorageClassUpdateReq body = new OSExternalStorageClassUpdateReq(); // OSExternalStorageClassUpdateReq | external storage class info
Long externalStorageClassId = 789L; // Long | external storage class id
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExternalStorageClassResp result = apiInstance.updateOSExternalStorageClass(body, externalStorageClassId, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStorageClassesApi#updateOSExternalStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSExternalStorageClassUpdateReq**](OSExternalStorageClassUpdateReq.md)| external storage class info |
 **externalStorageClassId** | **Long**| external storage class id |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExternalStorageClassResp**](OSExternalStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

