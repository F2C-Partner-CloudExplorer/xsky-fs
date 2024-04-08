# ConfsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConfItem**](ConfsApi.md#deleteConfItem) | **DELETE** /v1/confs/{type}/{key} | 
[**getConfItem**](ConfsApi.md#getConfItem) | **GET** /v1/confs/{type}/{key} | 
[**listConfItems**](ConfsApi.md#listConfItems) | **GET** /v1/confs/{type} | 
[**listConfItemsQuery**](ConfsApi.md#listConfItemsQuery) | **GET** /v1/confs/ | 
[**setConfItem**](ConfsApi.md#setConfItem) | **PUT** /v1/confs/ | 
[**setConfItems**](ConfsApi.md#setConfItems) | **PUT** /v1/confs/{type} | 

<a name="deleteConfItem"></a>
# **deleteConfItem**
> deleteConfItem(type, key)



delete conf item

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
String type = "type_example"; // String | filter the type of conf item
String key = "key_example"; // String | filter the key of conf item
try {
    apiInstance.deleteConfItem(type, key);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#deleteConfItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| filter the type of conf item |
 **key** | **String**| filter the key of conf item |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getConfItem"></a>
# **getConfItem**
> ConfItemResp getConfItem(type, key, clusterId)



get conf item

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
String type = "type_example"; // String | filter the type of conf
String key = "key_example"; // String | filter the key of conf item
String clusterId = "clusterId_example"; // String | cluster id
try {
    ConfItemResp result = apiInstance.getConfItem(type, key, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#getConfItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| filter the type of conf |
 **key** | **String**| filter the key of conf item |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ConfItemResp**](ConfItemResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConfItems"></a>
# **listConfItems**
> ConfItemsResp listConfItems(type, limit, offset)



List conf items

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
String type = "type_example"; // String | filter the type of conf
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    ConfItemsResp result = apiInstance.listConfItems(type, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#listConfItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| filter the type of conf |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**ConfItemsResp**](ConfItemsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConfItemsQuery"></a>
# **listConfItemsQuery**
> ConfItemsResp listConfItemsQuery(limit, offset, type, key)



List conf items with query

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String type = "type_example"; // String | filter the type of conf
String key = "key_example"; // String | filter the key of conf
try {
    ConfItemsResp result = apiInstance.listConfItemsQuery(limit, offset, type, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#listConfItemsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **type** | **String**| filter the type of conf | [optional]
 **key** | **String**| filter the key of conf | [optional]

### Return type

[**ConfItemsResp**](ConfItemsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setConfItem"></a>
# **setConfItem**
> ConfItem setConfItem(body, clusterId)



set conf item

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
ConfItemSetReq body = new ConfItemSetReq(); // ConfItemSetReq | conf item
String clusterId = "clusterId_example"; // String | cluster id
try {
    ConfItem result = apiInstance.setConfItem(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#setConfItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfItemSetReq**](ConfItemSetReq.md)| conf item |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ConfItem**](ConfItem.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setConfItems"></a>
# **setConfItems**
> setConfItems(body, type, clusterId)



set conf items

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ConfsApi;

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

ConfsApi apiInstance = new ConfsApi();
ConfItemsSetReq body = new ConfItemsSetReq(); // ConfItemsSetReq | conf items
String type = "type_example"; // String | filter the type of conf
String clusterId = "clusterId_example"; // String | cluster id
try {
    apiInstance.setConfItems(body, type, clusterId);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfsApi#setConfItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfItemsSetReq**](ConfItemsSetReq.md)| conf items |
 **type** | **String**| filter the type of conf |
 **clusterId** | **String**| cluster id | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

