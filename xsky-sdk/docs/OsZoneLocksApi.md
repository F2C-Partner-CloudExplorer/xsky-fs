# OsZoneLocksApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSZoneLock**](OsZoneLocksApi.md#createOSZoneLock) | **POST** /v1/os-zone-locks/ | 
[**deleteOSZoneLock**](OsZoneLocksApi.md#deleteOSZoneLock) | **DELETE** /v1/os-zone-locks/{lock_uuid} | 
[**getOSZoneLock**](OsZoneLocksApi.md#getOSZoneLock) | **GET** /v1/os-zone-locks/{lock_uuid} | 
[**listOSZoneLocks**](OsZoneLocksApi.md#listOSZoneLocks) | **GET** /v1/os-zone-locks/ | 
[**refreshOSZoneLock**](OsZoneLocksApi.md#refreshOSZoneLock) | **POST** /v1/os-zone-locks/{lock_uuid}:refresh | 

<a name="createOSZoneLock"></a>
# **createOSZoneLock**
> OSZoneLockResp createOSZoneLock(body, clusterId)



Create a os zone lock.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneLocksApi;

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

OsZoneLocksApi apiInstance = new OsZoneLocksApi();
OSZoneLockCreateReq body = new OSZoneLockCreateReq(); // OSZoneLockCreateReq | os zone lock info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSZoneLockResp result = apiInstance.createOSZoneLock(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneLocksApi#createOSZoneLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSZoneLockCreateReq**](OSZoneLockCreateReq.md)| os zone lock info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSZoneLockResp**](OSZoneLockResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSZoneLock"></a>
# **deleteOSZoneLock**
> deleteOSZoneLock(lockUuid)



Delete a os zone lock.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneLocksApi;

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

OsZoneLocksApi apiInstance = new OsZoneLocksApi();
String lockUuid = "lockUuid_example"; // String | os zone lock uuid
try {
    apiInstance.deleteOSZoneLock(lockUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneLocksApi#deleteOSZoneLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lockUuid** | **String**| os zone lock uuid |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOSZoneLock"></a>
# **getOSZoneLock**
> OSZoneLockResp getOSZoneLock(lockUuid)



Get a os zone lock.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneLocksApi;

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

OsZoneLocksApi apiInstance = new OsZoneLocksApi();
String lockUuid = "lockUuid_example"; // String | os zone lock uuid
try {
    OSZoneLockResp result = apiInstance.getOSZoneLock(lockUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneLocksApi#getOSZoneLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lockUuid** | **String**| os zone lock uuid |

### Return type

[**OSZoneLockResp**](OSZoneLockResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSZoneLocks"></a>
# **listOSZoneLocks**
> OSZoneLocksResp listOSZoneLocks(limit, offset, all, clusterId)



List os zone locks.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneLocksApi;

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

OsZoneLocksApi apiInstance = new OsZoneLocksApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Boolean all = true; // Boolean | show all zone locks
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSZoneLocksResp result = apiInstance.listOSZoneLocks(limit, offset, all, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneLocksApi#listOSZoneLocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **all** | **Boolean**| show all zone locks | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSZoneLocksResp**](OSZoneLocksResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="refreshOSZoneLock"></a>
# **refreshOSZoneLock**
> OSZoneLockResp refreshOSZoneLock(lockUuid)



Refresh a os zone lock.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZoneLocksApi;

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

OsZoneLocksApi apiInstance = new OsZoneLocksApi();
String lockUuid = "lockUuid_example"; // String | os zone lock uuid
try {
    OSZoneLockResp result = apiInstance.refreshOSZoneLock(lockUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZoneLocksApi#refreshOSZoneLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lockUuid** | **String**| os zone lock uuid |

### Return type

[**OSZoneLockResp**](OSZoneLockResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

