# HostEncSpecsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHostEncSpec**](HostEncSpecsApi.md#createHostEncSpec) | **POST** /v1/host-enc-specs/ | 
[**deleteHostEncSpec**](HostEncSpecsApi.md#deleteHostEncSpec) | **DELETE** /v1/host-enc-specs/{spec_id} | 
[**getHostEncSpec**](HostEncSpecsApi.md#getHostEncSpec) | **GET** /v1/host-enc-specs/{spec_id} | 
[**listHostEncSpecs**](HostEncSpecsApi.md#listHostEncSpecs) | **GET** /v1/host-enc-specs/ | 

<a name="createHostEncSpec"></a>
# **createHostEncSpec**
> HostEncSpecResp createHostEncSpec(body)



Create a host enclosure spec

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostEncSpecsApi;

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

HostEncSpecsApi apiInstance = new HostEncSpecsApi();
HostEncSpecCreateReq body = new HostEncSpecCreateReq(); // HostEncSpecCreateReq | host enclosure spec info
try {
    HostEncSpecResp result = apiInstance.createHostEncSpec(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostEncSpecsApi#createHostEncSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostEncSpecCreateReq**](HostEncSpecCreateReq.md)| host enclosure spec info |

### Return type

[**HostEncSpecResp**](HostEncSpecResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHostEncSpec"></a>
# **deleteHostEncSpec**
> deleteHostEncSpec(specId)



Delete a host enclosure spec

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostEncSpecsApi;

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

HostEncSpecsApi apiInstance = new HostEncSpecsApi();
Long specId = 789L; // Long | host enclosure spec id
try {
    apiInstance.deleteHostEncSpec(specId);
} catch (ApiException e) {
    System.err.println("Exception when calling HostEncSpecsApi#deleteHostEncSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specId** | **Long**| host enclosure spec id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getHostEncSpec"></a>
# **getHostEncSpec**
> HostEncSpecResp getHostEncSpec(specId)



Get host enclosure spec

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostEncSpecsApi;

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

HostEncSpecsApi apiInstance = new HostEncSpecsApi();
Long specId = 789L; // Long | host enclosure spec id
try {
    HostEncSpecResp result = apiInstance.getHostEncSpec(specId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostEncSpecsApi#getHostEncSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specId** | **Long**| host enclosure spec id |

### Return type

[**HostEncSpecResp**](HostEncSpecResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHostEncSpecs"></a>
# **listHostEncSpecs**
> HostEncSpecsResp listHostEncSpecs(limit, offset, model, vendor)



List host enclosure specs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostEncSpecsApi;

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

HostEncSpecsApi apiInstance = new HostEncSpecsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String model = "model_example"; // String | host model
String vendor = "vendor_example"; // String | host vendor
try {
    HostEncSpecsResp result = apiInstance.listHostEncSpecs(limit, offset, model, vendor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostEncSpecsApi#listHostEncSpecs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **model** | **String**| host model | [optional]
 **vendor** | **String**| host vendor | [optional]

### Return type

[**HostEncSpecsResp**](HostEncSpecsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

