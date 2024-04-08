# OspMetadataServersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOspMetadataServer**](OspMetadataServersApi.md#deleteOspMetadataServer) | **DELETE** /v1/osp-metadata-servers/{id} | 
[**disableOspMetadataServer**](OspMetadataServersApi.md#disableOspMetadataServer) | **POST** /v1/osp-metadata-servers/{id}:disable | 
[**enableOspMetadataServer**](OspMetadataServersApi.md#enableOspMetadataServer) | **POST** /v1/osp-metadata-servers/{id}:enable | 
[**getOspMetadataServer**](OspMetadataServersApi.md#getOspMetadataServer) | **GET** /v1/osp-metadata-servers/{id} | 
[**getOspMetadataServerSamples**](OspMetadataServersApi.md#getOspMetadataServerSamples) | **GET** /v1/osp-metadata-servers/{id}/samples | 
[**listOspMetadataServers**](OspMetadataServersApi.md#listOspMetadataServers) | **GET** /v1/osp-metadata-servers/ | 
[**setOspMetadataServerRole**](OspMetadataServersApi.md#setOspMetadataServerRole) | **POST** /v1/osp-metadata-servers/{id}:set-role | 

<a name="deleteOspMetadataServer"></a>
# **deleteOspMetadataServer**
> OspMetadataServerResp deleteOspMetadataServer(id)



delete osp metadata server

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
try {
    OspMetadataServerResp result = apiInstance.deleteOspMetadataServer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#deleteOspMetadataServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |

### Return type

[**OspMetadataServerResp**](OspMetadataServerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="disableOspMetadataServer"></a>
# **disableOspMetadataServer**
> OspMetadataServerResp disableOspMetadataServer(id)



disable osp metadata server

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
try {
    OspMetadataServerResp result = apiInstance.disableOspMetadataServer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#disableOspMetadataServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |

### Return type

[**OspMetadataServerResp**](OspMetadataServerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableOspMetadataServer"></a>
# **enableOspMetadataServer**
> OspMetadataServerResp enableOspMetadataServer(id)



enable osp metadata server

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
try {
    OspMetadataServerResp result = apiInstance.enableOspMetadataServer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#enableOspMetadataServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |

### Return type

[**OspMetadataServerResp**](OspMetadataServerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspMetadataServer"></a>
# **getOspMetadataServer**
> OspMetadataServerResp getOspMetadataServer(id)



Returns info of a osp metadata server

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
try {
    OspMetadataServerResp result = apiInstance.getOspMetadataServer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#getOspMetadataServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |

### Return type

[**OspMetadataServerResp**](OspMetadataServerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspMetadataServerSamples"></a>
# **getOspMetadataServerSamples**
> OspMetadataServerSamplesResp getOspMetadataServerSamples(id, durationBegin, durationEnd, period)



Get osp metadata server&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspMetadataServerSamplesResp result = apiInstance.getOspMetadataServerSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#getOspMetadataServerSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspMetadataServerSamplesResp**](OspMetadataServerSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOspMetadataServers"></a>
# **listOspMetadataServers**
> OspMetadataServersResp listOspMetadataServers(limit, offset, clusterId, ospMetadataClusterId, status)



Lists osp metadata servers

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long clusterId = 789L; // Long | The id of osp metadata server's cluster
Long ospMetadataClusterId = 789L; // Long | The id of osp metadata server's metadata cluster
String status = "status_example"; // String | status of osp metadata server
try {
    OspMetadataServersResp result = apiInstance.listOspMetadataServers(limit, offset, clusterId, ospMetadataClusterId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#listOspMetadataServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **Long**| The id of osp metadata server&#x27;s cluster | [optional]
 **ospMetadataClusterId** | **Long**| The id of osp metadata server&#x27;s metadata cluster | [optional]
 **status** | **String**| status of osp metadata server | [optional]

### Return type

[**OspMetadataServersResp**](OspMetadataServersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setOspMetadataServerRole"></a>
# **setOspMetadataServerRole**
> OspMetadataServerResp setOspMetadataServerRole(id)



set osp metadata server role

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataServersApi;

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

OspMetadataServersApi apiInstance = new OspMetadataServersApi();
Long id = 789L; // Long | osp metadata server id
try {
    OspMetadataServerResp result = apiInstance.setOspMetadataServerRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataServersApi#setOspMetadataServerRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata server id |

### Return type

[**OspMetadataServerResp**](OspMetadataServerResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

