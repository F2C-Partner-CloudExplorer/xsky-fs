# AlertStrategiesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlertStrategy**](AlertStrategiesApi.md#createAlertStrategy) | **POST** /v1/alert-strategies/ | 
[**deleteAlertStrategy**](AlertStrategiesApi.md#deleteAlertStrategy) | **DELETE** /v1/alert-strategies/{alert_strategy_id} | 
[**getAlertStrategy**](AlertStrategiesApi.md#getAlertStrategy) | **GET** /v1/alert-strategies/{alert_strategy_id} | 
[**listAlertStrategies**](AlertStrategiesApi.md#listAlertStrategies) | **GET** /v1/alert-strategies/ | 
[**updateUpdateAlertStrategyAlertContact**](AlertStrategiesApi.md#updateUpdateAlertStrategyAlertContact) | **PATCH** /v1/alert-strategies/{alert_strategy_id} | 

<a name="createAlertStrategy"></a>
# **createAlertStrategy**
> AlertStrategyReq createAlertStrategy(body)



create strategy of alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertStrategiesApi;

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

AlertStrategiesApi apiInstance = new AlertStrategiesApi();
AlertStrategyReq body = new AlertStrategyReq(); // AlertStrategyReq | alert strategy
try {
    AlertStrategyReq result = apiInstance.createAlertStrategy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertStrategiesApi#createAlertStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertStrategyReq**](AlertStrategyReq.md)| alert strategy |

### Return type

[**AlertStrategyReq**](AlertStrategyReq.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertStrategy"></a>
# **deleteAlertStrategy**
> deleteAlertStrategy(alertStrategyId)



Delete alert strategy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertStrategiesApi;

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

AlertStrategiesApi apiInstance = new AlertStrategiesApi();
Long alertStrategyId = 789L; // Long | alert strategy id
try {
    apiInstance.deleteAlertStrategy(alertStrategyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertStrategiesApi#deleteAlertStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertStrategyId** | **Long**| alert strategy id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAlertStrategy"></a>
# **getAlertStrategy**
> AlertStrategyResp getAlertStrategy(alertStrategyId)



get a alert strategy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertStrategiesApi;

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

AlertStrategiesApi apiInstance = new AlertStrategiesApi();
Long alertStrategyId = 789L; // Long | alert strategy id
try {
    AlertStrategyResp result = apiInstance.getAlertStrategy(alertStrategyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertStrategiesApi#getAlertStrategy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertStrategyId** | **Long**| alert strategy id |

### Return type

[**AlertStrategyResp**](AlertStrategyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAlertStrategies"></a>
# **listAlertStrategies**
> AlertContactsResp listAlertStrategies(limit, offset, name, durationBegin, durationEnd, durationLimit, durationOffset, q, sort)



List all alert contacts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertStrategiesApi;

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

AlertStrategiesApi apiInstance = new AlertStrategiesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String name = "name_example"; // String | name of alert contact
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
Long durationLimit = 789L; // Long | duration limit param
Long durationOffset = 789L; // Long | duration offset param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    AlertContactsResp result = apiInstance.listAlertStrategies(limit, offset, name, durationBegin, durationEnd, durationLimit, durationOffset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertStrategiesApi#listAlertStrategies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **name** | **String**| name of alert contact | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **durationLimit** | **Long**| duration limit param | [optional]
 **durationOffset** | **Long**| duration offset param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**AlertContactsResp**](AlertContactsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUpdateAlertStrategyAlertContact"></a>
# **updateUpdateAlertStrategyAlertContact**
> updateUpdateAlertStrategyAlertContact(body, alertStrategyId)



update alert strategy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertStrategiesApi;

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

AlertStrategiesApi apiInstance = new AlertStrategiesApi();
AlertStrategyReq body = new AlertStrategyReq(); // AlertStrategyReq | strategy update request
Long alertStrategyId = 789L; // Long | alert strategy id
try {
    apiInstance.updateUpdateAlertStrategyAlertContact(body, alertStrategyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertStrategiesApi#updateUpdateAlertStrategyAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertStrategyReq**](AlertStrategyReq.md)| strategy update request |
 **alertStrategyId** | **Long**| alert strategy id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

