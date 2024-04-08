# OsKeysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createKey**](OsKeysApi.md#createKey) | **POST** /v1/os-keys/ | 
[**deleteKey**](OsKeysApi.md#deleteKey) | **DELETE** /v1/os-keys/{key_id} | 
[**getKey**](OsKeysApi.md#getKey) | **GET** /v1/os-keys/{key_id} | 
[**listKeys**](OsKeysApi.md#listKeys) | **GET** /v1/os-keys/ | 
[**updateKey**](OsKeysApi.md#updateKey) | **PATCH** /v1/os-keys/{key_id} | 

<a name="createKey"></a>
# **createKey**
> ObjectStorageKeyResp createKey(body, clusterId)



Create new object storage key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsKeysApi;

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

OsKeysApi apiInstance = new OsKeysApi();
ObjectStorageKeyCreateReq body = new ObjectStorageKeyCreateReq(); // ObjectStorageKeyCreateReq | key info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageKeyResp result = apiInstance.createKey(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsKeysApi#createKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageKeyCreateReq**](ObjectStorageKeyCreateReq.md)| key info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageKeyResp**](ObjectStorageKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteKey"></a>
# **deleteKey**
> ObjectStorageKeyResp deleteKey(keyId)



Delete object storage key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsKeysApi;

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

OsKeysApi apiInstance = new OsKeysApi();
Long keyId = 789L; // Long | key id
try {
    ObjectStorageKeyResp result = apiInstance.deleteKey(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsKeysApi#deleteKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| key id |

### Return type

[**ObjectStorageKeyResp**](ObjectStorageKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKey"></a>
# **getKey**
> ObjectStorageKeyResp getKey(keyId)



get object storage key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsKeysApi;

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

OsKeysApi apiInstance = new OsKeysApi();
Long keyId = 789L; // Long | user id
try {
    ObjectStorageKeyResp result = apiInstance.getKey(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsKeysApi#getKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| user id |

### Return type

[**ObjectStorageKeyResp**](ObjectStorageKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listKeys"></a>
# **listKeys**
> ObjectStorageKeysResp listKeys(clusterId, limit, offset, userId)



List object storage keys

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsKeysApi;

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

OsKeysApi apiInstance = new OsKeysApi();
String clusterId = "clusterId_example"; // String | cluster id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long userId = 789L; // Long | object storage user id
try {
    ObjectStorageKeysResp result = apiInstance.listKeys(clusterId, limit, offset, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsKeysApi#listKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **userId** | **Long**| object storage user id | [optional]

### Return type

[**ObjectStorageKeysResp**](ObjectStorageKeysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateKey"></a>
# **updateKey**
> ObjectStorageKeyResp updateKey(body, keyId)



Update object storage key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsKeysApi;

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

OsKeysApi apiInstance = new OsKeysApi();
ObjectStorageKeyUpdateReq body = new ObjectStorageKeyUpdateReq(); // ObjectStorageKeyUpdateReq | key info
Long keyId = 789L; // Long | key id
try {
    ObjectStorageKeyResp result = apiInstance.updateKey(body, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsKeysApi#updateKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageKeyUpdateReq**](ObjectStorageKeyUpdateReq.md)| key info |
 **keyId** | **Long**| key id |

### Return type

[**ObjectStorageKeyResp**](ObjectStorageKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

