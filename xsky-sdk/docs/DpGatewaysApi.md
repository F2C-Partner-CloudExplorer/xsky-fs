# DpGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpGateway**](DpGatewaysApi.md#createDpGateway) | **POST** /v1/dp-gateways/ | 
[**deleteDpGateway**](DpGatewaysApi.md#deleteDpGateway) | **DELETE** /v1/dp-gateways/{gateway_id} | 
[**getDpGateway**](DpGatewaysApi.md#getDpGateway) | **GET** /v1/dp-gateways/{gateway_id} | 
[**listDpGateways**](DpGatewaysApi.md#listDpGateways) | **GET** /v1/dp-gateways/ | 
[**updateDpGateway**](DpGatewaysApi.md#updateDpGateway) | **PATCH** /v1/dp-gateways/{gateway_id} | 

<a name="createDpGateway"></a>
# **createDpGateway**
> DpGatewayResp createDpGateway(body)



Create a dp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpGatewaysApi;

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

DpGatewaysApi apiInstance = new DpGatewaysApi();
DpGatewayCreateReq body = new DpGatewayCreateReq(); // DpGatewayCreateReq | dp gateway info
try {
    DpGatewayResp result = apiInstance.createDpGateway(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpGatewaysApi#createDpGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpGatewayCreateReq**](DpGatewayCreateReq.md)| dp gateway info |

### Return type

[**DpGatewayResp**](DpGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpGateway"></a>
# **deleteDpGateway**
> DpGatewayResp deleteDpGateway(gatewayId)



Delete dp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpGatewaysApi;

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

DpGatewaysApi apiInstance = new DpGatewaysApi();
Long gatewayId = 789L; // Long | dp gateway id
try {
    DpGatewayResp result = apiInstance.deleteDpGateway(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpGatewaysApi#deleteDpGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| dp gateway id |

### Return type

[**DpGatewayResp**](DpGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpGateway"></a>
# **getDpGateway**
> DpGatewayResp getDpGateway(gatewayId)



Get dp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpGatewaysApi;

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

DpGatewaysApi apiInstance = new DpGatewaysApi();
Long gatewayId = 789L; // Long | dp gateway id
try {
    DpGatewayResp result = apiInstance.getDpGateway(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpGatewaysApi#getDpGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| dp gateway id |

### Return type

[**DpGatewayResp**](DpGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpGateways"></a>
# **listDpGateways**
> DpGatewaysResp listDpGateways(limit, offset, q, sort)



List dp gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpGatewaysApi;

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

DpGatewaysApi apiInstance = new DpGatewaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DpGatewaysResp result = apiInstance.listDpGateways(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpGatewaysApi#listDpGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DpGatewaysResp**](DpGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpGateway"></a>
# **updateDpGateway**
> DpGatewayResp updateDpGateway(body, gatewayId)



Update a dp gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpGatewaysApi;

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

DpGatewaysApi apiInstance = new DpGatewaysApi();
DpGatewayUpdateReq body = new DpGatewayUpdateReq(); // DpGatewayUpdateReq | dp gateway info
Long gatewayId = 789L; // Long | dp gateway id
try {
    DpGatewayResp result = apiInstance.updateDpGateway(body, gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpGatewaysApi#updateDpGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpGatewayUpdateReq**](DpGatewayUpdateReq.md)| dp gateway info |
 **gatewayId** | **Long**| dp gateway id |

### Return type

[**DpGatewayResp**](DpGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

