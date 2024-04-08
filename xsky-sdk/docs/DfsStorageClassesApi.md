# DfsStorageClassesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsStorageClassPools**](DfsStorageClassesApi.md#addDfsStorageClassPools) | **POST** /v1/dfs-storage-classes/{dfs_storage_class_id}:add-pools | 
[**createDfsStorageClass**](DfsStorageClassesApi.md#createDfsStorageClass) | **POST** /v1/dfs-storage-classes/ | 
[**deleteDfsStorageClass**](DfsStorageClassesApi.md#deleteDfsStorageClass) | **DELETE** /v1/dfs-storage-classes/{dfs_storage_class_id} | 
[**getDfsStorageClass**](DfsStorageClassesApi.md#getDfsStorageClass) | **GET** /v1/dfs-storage-classes/{dfs_storage_class_id} | 
[**getDfsStorageClassPredictions**](DfsStorageClassesApi.md#getDfsStorageClassPredictions) | **GET** /v1/dfs-storage-classes/{dfs_storage_class_id}/predictions | 
[**getDfsStorageClassSamples**](DfsStorageClassesApi.md#getDfsStorageClassSamples) | **GET** /v1/dfs-storage-classes/{dfs_storage_class_id}/samples | 
[**listDfsStorageClasses**](DfsStorageClassesApi.md#listDfsStorageClasses) | **GET** /v1/dfs-storage-classes/ | 
[**removeDfsStorageClassPools**](DfsStorageClassesApi.md#removeDfsStorageClassPools) | **POST** /v1/dfs-storage-classes/{dfs_storage_class_id}:remove-pools | 
[**updateDfsStorageClass**](DfsStorageClassesApi.md#updateDfsStorageClass) | **PATCH** /v1/dfs-storage-classes/{dfs_storage_class_id} | 

<a name="addDfsStorageClassPools"></a>
# **addDfsStorageClassPools**
> DfsStorageClassResp addDfsStorageClassPools(body, dfsStorageClassId)



add dfs storage class pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
DfsStorageClassAddPoolReq body = new DfsStorageClassAddPoolReq(); // DfsStorageClassAddPoolReq | pools info
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassResp result = apiInstance.addDfsStorageClassPools(body, dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#addDfsStorageClassPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStorageClassAddPoolReq**](DfsStorageClassAddPoolReq.md)| pools info |
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsStorageClass"></a>
# **createDfsStorageClass**
> DfsStorageClassResp createDfsStorageClass(body)



create dfs storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
DfsStorageClassCreateReq body = new DfsStorageClassCreateReq(); // DfsStorageClassCreateReq | class info
try {
    DfsStorageClassResp result = apiInstance.createDfsStorageClass(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#createDfsStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStorageClassCreateReq**](DfsStorageClassCreateReq.md)| class info |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsStorageClass"></a>
# **deleteDfsStorageClass**
> DfsStorageClassResp deleteDfsStorageClass(dfsStorageClassId)



delete dfs storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassResp result = apiInstance.deleteDfsStorageClass(dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#deleteDfsStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsStorageClass"></a>
# **getDfsStorageClass**
> DfsStorageClassResp getDfsStorageClass(dfsStorageClassId)



Get dfs storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassResp result = apiInstance.getDfsStorageClass(dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#getDfsStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsStorageClassPredictions"></a>
# **getDfsStorageClassPredictions**
> DfsStorageClassPredictionsResp getDfsStorageClassPredictions(dfsStorageClassId)



get a dfs storage class&#x27;s prediction

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassPredictionsResp result = apiInstance.getDfsStorageClassPredictions(dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#getDfsStorageClassPredictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassPredictionsResp**](DfsStorageClassPredictionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsStorageClassSamples"></a>
# **getDfsStorageClassSamples**
> DfsStorageClassSamplesResp getDfsStorageClassSamples(dfsStorageClassId, durationBegin, durationEnd, period)



get a dfs storage class&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
Long dfsStorageClassId = 789L; // Long | dfs storage class id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsStorageClassSamplesResp result = apiInstance.getDfsStorageClassSamples(dfsStorageClassId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#getDfsStorageClassSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsStorageClassId** | **Long**| dfs storage class id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsStorageClassSamplesResp**](DfsStorageClassSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsStorageClasses"></a>
# **listDfsStorageClasses**
> DfsStorageClassesResp listDfsStorageClasses(limit, offset, clusterId, writePolicy, q, sort)



List dfs storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String writePolicy = "writePolicy_example"; // String | write policy
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsStorageClassesResp result = apiInstance.listDfsStorageClasses(limit, offset, clusterId, writePolicy, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#listDfsStorageClasses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **writePolicy** | **String**| write policy | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsStorageClassesResp**](DfsStorageClassesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsStorageClassPools"></a>
# **removeDfsStorageClassPools**
> DfsStorageClassResp removeDfsStorageClassPools(body, dfsStorageClassId)



remove dfs storage class pools

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
DfsStorageClassRemovePoolReq body = new DfsStorageClassRemovePoolReq(); // DfsStorageClassRemovePoolReq | pools info
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassResp result = apiInstance.removeDfsStorageClassPools(body, dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#removeDfsStorageClassPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStorageClassRemovePoolReq**](DfsStorageClassRemovePoolReq.md)| pools info |
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsStorageClass"></a>
# **updateDfsStorageClass**
> DfsStorageClassResp updateDfsStorageClass(body, dfsStorageClassId)



update dfs storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsStorageClassesApi;

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

DfsStorageClassesApi apiInstance = new DfsStorageClassesApi();
DfsStorageClassUpdateReq body = new DfsStorageClassUpdateReq(); // DfsStorageClassUpdateReq | class info
Long dfsStorageClassId = 789L; // Long | dfs storage class id
try {
    DfsStorageClassResp result = apiInstance.updateDfsStorageClass(body, dfsStorageClassId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsStorageClassesApi#updateDfsStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsStorageClassUpdateReq**](DfsStorageClassUpdateReq.md)| class info |
 **dfsStorageClassId** | **Long**| dfs storage class id |

### Return type

[**DfsStorageClassResp**](DfsStorageClassResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

