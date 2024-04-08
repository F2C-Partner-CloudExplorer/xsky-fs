# DfsS3KeysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsS3Key**](DfsS3KeysApi.md#createDfsS3Key) | **POST** /v1/dfs-s3-keys/ | 
[**deleteDfsS3Key**](DfsS3KeysApi.md#deleteDfsS3Key) | **DELETE** /v1/dfs-s3-keys/{key_id} | 
[**getDfsS3Key**](DfsS3KeysApi.md#getDfsS3Key) | **GET** /v1/dfs-s3-keys/{key_id} | 
[**listDfsS3Keys**](DfsS3KeysApi.md#listDfsS3Keys) | **GET** /v1/dfs-s3-keys/ | 
[**updateDfsS3Key**](DfsS3KeysApi.md#updateDfsS3Key) | **PATCH** /v1/dfs-s3-keys/{key_id} | 

<a name="createDfsS3Key"></a>
# **createDfsS3Key**
> DfsS3KeyResp createDfsS3Key(body, clusterId)



Create new dfs s3 key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3KeysApi;

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

DfsS3KeysApi apiInstance = new DfsS3KeysApi();
DfsS3KeyCreateReq body = new DfsS3KeyCreateReq(); // DfsS3KeyCreateReq | key info
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsS3KeyResp result = apiInstance.createDfsS3Key(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3KeysApi#createDfsS3Key");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsS3KeyCreateReq**](DfsS3KeyCreateReq.md)| key info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsS3KeyResp**](DfsS3KeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsS3Key"></a>
# **deleteDfsS3Key**
> DfsS3KeyResp deleteDfsS3Key(keyId)



Delete dfs s3 key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3KeysApi;

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

DfsS3KeysApi apiInstance = new DfsS3KeysApi();
Long keyId = 789L; // Long | key id
try {
    DfsS3KeyResp result = apiInstance.deleteDfsS3Key(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3KeysApi#deleteDfsS3Key");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| key id |

### Return type

[**DfsS3KeyResp**](DfsS3KeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsS3Key"></a>
# **getDfsS3Key**
> DfsS3KeyResp getDfsS3Key(keyId)



get dfs s3 key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3KeysApi;

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

DfsS3KeysApi apiInstance = new DfsS3KeysApi();
Long keyId = 789L; // Long | user id
try {
    DfsS3KeyResp result = apiInstance.getDfsS3Key(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3KeysApi#getDfsS3Key");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| user id |

### Return type

[**DfsS3KeyResp**](DfsS3KeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsS3Keys"></a>
# **listDfsS3Keys**
> DfsS3KeysResp listDfsS3Keys(clusterId, userId, limit, offset)



List dfs s3 keys

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3KeysApi;

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

DfsS3KeysApi apiInstance = new DfsS3KeysApi();
String clusterId = "clusterId_example"; // String | cluster id
Long userId = 789L; // Long | dfs s3 user id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    DfsS3KeysResp result = apiInstance.listDfsS3Keys(clusterId, userId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3KeysApi#listDfsS3Keys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **userId** | **Long**| dfs s3 user id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**DfsS3KeysResp**](DfsS3KeysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsS3Key"></a>
# **updateDfsS3Key**
> DfsS3KeyResp updateDfsS3Key(body, keyId)



Update dfs s3 key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsS3KeysApi;

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

DfsS3KeysApi apiInstance = new DfsS3KeysApi();
DfsS3KeyUpdateReq body = new DfsS3KeyUpdateReq(); // DfsS3KeyUpdateReq | key info
Long keyId = 789L; // Long | key id
try {
    DfsS3KeyResp result = apiInstance.updateDfsS3Key(body, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsS3KeysApi#updateDfsS3Key");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsS3KeyUpdateReq**](DfsS3KeyUpdateReq.md)| key info |
 **keyId** | **Long**| key id |

### Return type

[**DfsS3KeyResp**](DfsS3KeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

