# AdminVipApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateAdminVIP**](AdminVipApi.md#createOrUpdateAdminVIP) | **PUT** /v1/admin-vip/ | 
[**flushAdminVIP**](AdminVipApi.md#flushAdminVIP) | **PATCH** /v1/admin-vip/ | 
[**getAdminVIP**](AdminVipApi.md#getAdminVIP) | **GET** /v1/admin-vip/ | 
[**getAdminVIPNetwork**](AdminVipApi.md#getAdminVIPNetwork) | **GET** /v1/admin-vip/networks | 

<a name="createOrUpdateAdminVIP"></a>
# **createOrUpdateAdminVIP**
> AdminVIPResp createOrUpdateAdminVIP(body)



open or close admin vip

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AdminVipApi;

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

AdminVipApi apiInstance = new AdminVipApi();
AdminVIPCreateReq body = new AdminVIPCreateReq(); // AdminVIPCreateReq | admin vip info
try {
    AdminVIPResp result = apiInstance.createOrUpdateAdminVIP(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminVipApi#createOrUpdateAdminVIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdminVIPCreateReq**](AdminVIPCreateReq.md)| admin vip info |

### Return type

[**AdminVIPResp**](AdminVIPResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="flushAdminVIP"></a>
# **flushAdminVIP**
> AdminVIPResp flushAdminVIP()



flush admin vip

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AdminVipApi;

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

AdminVipApi apiInstance = new AdminVipApi();
try {
    AdminVIPResp result = apiInstance.flushAdminVIP();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminVipApi#flushAdminVIP");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminVIPResp**](AdminVIPResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdminVIP"></a>
# **getAdminVIP**
> AdminVIPResp getAdminVIP()



Get admin vip

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AdminVipApi;

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

AdminVipApi apiInstance = new AdminVipApi();
try {
    AdminVIPResp result = apiInstance.getAdminVIP();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminVipApi#getAdminVIP");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminVIPResp**](AdminVIPResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdminVIPNetwork"></a>
# **getAdminVIPNetwork**
> AdminVIPNetworkResp getAdminVIPNetwork()



Get admin vip network

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AdminVipApi;

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

AdminVipApi apiInstance = new AdminVipApi();
try {
    AdminVIPNetworkResp result = apiInstance.getAdminVIPNetwork();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminVipApi#getAdminVIPNetwork");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdminVIPNetworkResp**](AdminVIPNetworkResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

