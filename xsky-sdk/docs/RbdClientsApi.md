# RbdClientsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRBDC**](RbdClientsApi.md#createRBDC) | **POST** /v1/rbd-clients/ | 
[**deleteRBDClient**](RbdClientsApi.md#deleteRBDClient) | **DELETE** /v1/rbd-clients/{rbdc_id} | 
[**getRBDClient**](RbdClientsApi.md#getRBDClient) | **GET** /v1/rbd-clients/{rbdc_id} | 
[**listRBDClients**](RbdClientsApi.md#listRBDClients) | **GET** /v1/rbd-clients/ | 
[**updateRBDClient**](RbdClientsApi.md#updateRBDClient) | **PATCH** /v1/rbd-clients/{rbdc_id} | 
[**validateRBDClientHost**](RbdClientsApi.md#validateRBDClientHost) | **POST** /v1/rbd-clients/:validate-host | 

<a name="createRBDC"></a>
# **createRBDC**
> RBDClientResp createRBDC(body)



check env and install packages

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
RBDClientCreateReq body = new RBDClientCreateReq(); // RBDClientCreateReq | rbdc info
try {
    RBDClientResp result = apiInstance.createRBDC(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#createRBDC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RBDClientCreateReq**](RBDClientCreateReq.md)| rbdc info |

### Return type

[**RBDClientResp**](RBDClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRBDClient"></a>
# **deleteRBDClient**
> RBDClientResp deleteRBDClient(rbdcId, force, skipUninstall)



delete rbdc

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
Long rbdcId = 789L; // Long | rbdc id
Boolean force = true; // Boolean | force delete or not
Boolean skipUninstall = true; // Boolean | skip uninstallation for managed rbdc
try {
    RBDClientResp result = apiInstance.deleteRBDClient(rbdcId, force, skipUninstall);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#deleteRBDClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rbdcId** | **Long**| rbdc id |
 **force** | **Boolean**| force delete or not | [optional]
 **skipUninstall** | **Boolean**| skip uninstallation for managed rbdc | [optional]

### Return type

[**RBDClientResp**](RBDClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRBDClient"></a>
# **getRBDClient**
> RBDClientResp getRBDClient(rbdcId)



get a rbd client info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
Long rbdcId = 789L; // Long | the rbd client id
try {
    RBDClientResp result = apiInstance.getRBDClient(rbdcId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#getRBDClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rbdcId** | **Long**| the rbd client id |

### Return type

[**RBDClientResp**](RBDClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRBDClients"></a>
# **listRBDClients**
> RBDClientsResp listRBDClients(limit, offset, clusterId, type, q, sort)



List rbd clients by filter

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String type = "type_example"; // String | filter by rbdc type
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    RBDClientsResp result = apiInstance.listRBDClients(limit, offset, clusterId, type, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#listRBDClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **type** | **String**| filter by rbdc type | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**RBDClientsResp**](RBDClientsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRBDClient"></a>
# **updateRBDClient**
> RBDClientResp updateRBDClient(body, rbdcId)



update rbd client info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
RBDClientUpdateReq body = new RBDClientUpdateReq(); // RBDClientUpdateReq | rbdc info
Long rbdcId = 789L; // Long | rbdc id
try {
    RBDClientResp result = apiInstance.updateRBDClient(body, rbdcId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#updateRBDClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RBDClientUpdateReq**](RBDClientUpdateReq.md)| rbdc info |
 **rbdcId** | **Long**| rbdc id |

### Return type

[**RBDClientResp**](RBDClientResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateRBDClientHost"></a>
# **validateRBDClientHost**
> RBDClientValidateHostResp validateRBDClientHost(body)



validate rbd client host

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RbdClientsApi;

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

RbdClientsApi apiInstance = new RbdClientsApi();
RBDClientValidateHostReq body = new RBDClientValidateHostReq(); // RBDClientValidateHostReq | validate rbdc info
try {
    RBDClientValidateHostResp result = apiInstance.validateRBDClientHost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RbdClientsApi#validateRBDClientHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RBDClientValidateHostReq**](RBDClientValidateHostReq.md)| validate rbdc info |

### Return type

[**RBDClientValidateHostResp**](RBDClientValidateHostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

