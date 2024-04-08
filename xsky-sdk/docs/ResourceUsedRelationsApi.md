# ResourceUsedRelationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourceRelatedResources**](ResourceUsedRelationsApi.md#getResourceRelatedResources) | **GET** /v1/resource-used-relations/related-resources | 

<a name="getResourceRelatedResources"></a>
# **getResourceRelatedResources**
> ResourceRelatedResourcesResp getResourceRelatedResources(resource, ids)



Get resource related resources info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ResourceUsedRelationsApi;

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

ResourceUsedRelationsApi apiInstance = new ResourceUsedRelationsApi();
String resource = "resource_example"; // String | resource type
String ids = "ids_example"; // String | resource ids
try {
    ResourceRelatedResourcesResp result = apiInstance.getResourceRelatedResources(resource, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourceUsedRelationsApi#getResourceRelatedResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource** | **String**| resource type |
 **ids** | **String**| resource ids |

### Return type

[**ResourceRelatedResourcesResp**](ResourceRelatedResourcesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

