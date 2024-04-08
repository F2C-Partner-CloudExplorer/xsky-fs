# TrashResourcesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTrashResource**](TrashResourcesApi.md#deleteTrashResource) | **DELETE** /v1/trash-resources/{trash_resource_id} | 
[**getTrashResource**](TrashResourcesApi.md#getTrashResource) | **GET** /v1/trash-resources/{trash_resource_id} | 
[**listTrashResources**](TrashResourcesApi.md#listTrashResources) | **GET** /v1/trash-resources/ | 
[**restoreTrashResource**](TrashResourcesApi.md#restoreTrashResource) | **POST** /v1/trash-resources/{trash_resource_id}:restore | 

<a name="deleteTrashResource"></a>
# **deleteTrashResource**
> TrashResourceResp deleteTrashResource(trashResourceId)



Delete trash resource

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashResourcesApi;

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

TrashResourcesApi apiInstance = new TrashResourcesApi();
Long trashResourceId = 789L; // Long | trash resource id
try {
    TrashResourceResp result = apiInstance.deleteTrashResource(trashResourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashResourcesApi#deleteTrashResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trashResourceId** | **Long**| trash resource id |

### Return type

[**TrashResourceResp**](TrashResourceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrashResource"></a>
# **getTrashResource**
> TrashResourceResp getTrashResource(trashResourceId)



get a trash resource

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashResourcesApi;

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

TrashResourcesApi apiInstance = new TrashResourcesApi();
Long trashResourceId = 789L; // Long | trash resource id
try {
    TrashResourceResp result = apiInstance.getTrashResource(trashResourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashResourcesApi#getTrashResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trashResourceId** | **Long**| trash resource id |

### Return type

[**TrashResourceResp**](TrashResourceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTrashResources"></a>
# **listTrashResources**
> TrashResourcesResp listTrashResources(limit, offset, clusterId, type, q, sort)



List trash resources

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashResourcesApi;

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

TrashResourcesApi apiInstance = new TrashResourcesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String type = "type_example"; // String | the type of trash resources
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    TrashResourcesResp result = apiInstance.listTrashResources(limit, offset, clusterId, type, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashResourcesApi#listTrashResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **type** | **String**| the type of trash resources | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**TrashResourcesResp**](TrashResourcesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreTrashResource"></a>
# **restoreTrashResource**
> TrashResourceResp restoreTrashResource(trashResourceId)



Restore trash resource

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TrashResourcesApi;

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

TrashResourcesApi apiInstance = new TrashResourcesApi();
Long trashResourceId = 789L; // Long | trash resource id
try {
    TrashResourceResp result = apiInstance.restoreTrashResource(trashResourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashResourcesApi#restoreTrashResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trashResourceId** | **Long**| trash resource id |

### Return type

[**TrashResourceResp**](TrashResourceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

