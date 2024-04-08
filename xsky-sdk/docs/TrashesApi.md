# TrashesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cleanupTrash**](TrashesApi.md#cleanupTrash) | **POST** /v1/trashes/{trash_id}:cleanup | 
[**getTrash**](TrashesApi.md#getTrash) | **GET** /v1/trashes/{trash_id} | 
[**listTrashes**](TrashesApi.md#listTrashes) | **GET** /v1/trashes/ | 
[**updateTrash**](TrashesApi.md#updateTrash) | **PATCH** /v1/trashes/{trash_id} | 

<a name="cleanupTrash"></a>
# **cleanupTrash**
> TrashResp cleanupTrash(trashId)



Cleanup trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashesApi;

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

TrashesApi apiInstance = new TrashesApi();
Long trashId = 789L; // Long | trash id
try {
    TrashResp result = apiInstance.cleanupTrash(trashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashesApi#cleanupTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trashId** | **Long**| trash id |

### Return type

[**TrashResp**](TrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrash"></a>
# **getTrash**
> TrashResp getTrash(trashId)



get a trash

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashesApi;

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

TrashesApi apiInstance = new TrashesApi();
Long trashId = 789L; // Long | trash id
try {
    TrashResp result = apiInstance.getTrash(trashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashesApi#getTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trashId** | **Long**| trash id |

### Return type

[**TrashResp**](TrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTrashes"></a>
# **listTrashes**
> TrashesResp listTrashes(limit, offset, type, q, sort)



List trashes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashesApi;

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

TrashesApi apiInstance = new TrashesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String type = "type_example"; // String | the type of trash
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    TrashesResp result = apiInstance.listTrashes(limit, offset, type, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashesApi#listTrashes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **type** | **String**| the type of trash | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**TrashesResp**](TrashesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTrash"></a>
# **updateTrash**
> TrashResp updateTrash(body, trashId)



Update trash info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashesApi;

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

TrashesApi apiInstance = new TrashesApi();
TrashUpdateReq body = new TrashUpdateReq(); // TrashUpdateReq | trash info
Long trashId = 789L; // Long | trash id
try {
    TrashResp result = apiInstance.updateTrash(body, trashId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashesApi#updateTrash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TrashUpdateReq**](TrashUpdateReq.md)| trash info |
 **trashId** | **Long**| trash id |

### Return type

[**TrashResp**](TrashResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

