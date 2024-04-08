# AlertsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countAlerts**](AlertsApi.md#countAlerts) | **GET** /v1/alerts/stats | 
[**deleteAlert**](AlertsApi.md#deleteAlert) | **DELETE** /v1/alerts/{alert_id} | 
[**deleteAlerts**](AlertsApi.md#deleteAlerts) | **DELETE** /v1/alerts/ | 
[**doAlert**](AlertsApi.md#doAlert) | **PUT** /v1/alerts/{alert_id} | 
[**doAlerts**](AlertsApi.md#doAlerts) | **PATCH** /v1/alerts/ | 
[**getAlert**](AlertsApi.md#getAlert) | **GET** /v1/alerts/{alert_id} | 
[**listAlerts**](AlertsApi.md#listAlerts) | **GET** /v1/alerts/ | 
[**resolveAlert**](AlertsApi.md#resolveAlert) | **POST** /v1/alerts/{alert_id}:resolve | 
[**resolveAlerts**](AlertsApi.md#resolveAlerts) | **POST** /v1/alerts/:resolve | 

<a name="countAlerts"></a>
# **countAlerts**
> AlertStatsResp countAlerts(acked, resolved, resourceType, resourceId)



count all alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
Boolean acked = true; // Boolean | acked of alert
Boolean resolved = true; // Boolean | resolved or not of alert
String resourceType = "resourceType_example"; // String | resource type of alert
Long resourceId = 789L; // Long | resource id of alert
try {
    AlertStatsResp result = apiInstance.countAlerts(acked, resolved, resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#countAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acked** | **Boolean**| acked of alert | [optional]
 **resolved** | **Boolean**| resolved or not of alert | [optional]
 **resourceType** | **String**| resource type of alert | [optional]
 **resourceId** | **Long**| resource id of alert | [optional]

### Return type

[**AlertStatsResp**](AlertStatsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAlert"></a>
# **deleteAlert**
> deleteAlert(alertId)



Delete alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
Long alertId = 789L; // Long | alert id
try {
    apiInstance.deleteAlert(alertId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Long**| alert id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteAlerts"></a>
# **deleteAlerts**
> deleteAlerts(before)



delete alerts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
String before = "before_example"; // String | create time of last alert
try {
    apiInstance.deleteAlerts(before);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#deleteAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **String**| create time of last alert | [optional]

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="doAlert"></a>
# **doAlert**
> AlertResp doAlert(body, alertId)



set the ack status of alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
AlertActionReq body = new AlertActionReq(); // AlertActionReq | the alert action info
Long alertId = 789L; // Long | the id of alert
try {
    AlertResp result = apiInstance.doAlert(body, alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#doAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertActionReq**](AlertActionReq.md)| the alert action info |
 **alertId** | **Long**| the id of alert |

### Return type

[**AlertResp**](AlertResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="doAlerts"></a>
# **doAlerts**
> doAlerts(body)



set the ack status of alerts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
AlertsActionReq body = new AlertsActionReq(); // AlertsActionReq | the alerts action info
try {
    apiInstance.doAlerts(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#doAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertsActionReq**](AlertsActionReq.md)| the alerts action info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAlert"></a>
# **getAlert**
> AlertResp getAlert(alertId)



get a alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
Long alertId = 789L; // Long | alert id
try {
    AlertResp result = apiInstance.getAlert(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#getAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Long**| alert id |

### Return type

[**AlertResp**](AlertResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAlerts"></a>
# **listAlerts**
> AlertsResp listAlerts(limit, offset, resourceType, resourceId, alertType, acked, resolved, resolveType, level, durationBegin, durationEnd, durationLimit, durationOffset, q, relatedResource, sort)



List all alerts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String resourceType = "resourceType_example"; // String | resource type of alert
Long resourceId = 789L; // Long | resource id of alert
String alertType = "alertType_example"; // String | type of alert
Boolean acked = true; // Boolean | acked of alert
Boolean resolved = true; // Boolean | resolved or not of alert
String resolveType = "resolveType_example"; // String | resolve type of alert
String level = "level_example"; // String | level of alert
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
Long durationLimit = 789L; // Long | duration limit param
Long durationOffset = 789L; // Long | duration offset param
String q = "q_example"; // String | query param of search
String relatedResource = "relatedResource_example"; // String | related resource info of search
String sort = "sort_example"; // String | sort param of search
try {
    AlertsResp result = apiInstance.listAlerts(limit, offset, resourceType, resourceId, alertType, acked, resolved, resolveType, level, durationBegin, durationEnd, durationLimit, durationOffset, q, relatedResource, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **resourceType** | **String**| resource type of alert | [optional]
 **resourceId** | **Long**| resource id of alert | [optional]
 **alertType** | **String**| type of alert | [optional]
 **acked** | **Boolean**| acked of alert | [optional]
 **resolved** | **Boolean**| resolved or not of alert | [optional]
 **resolveType** | **String**| resolve type of alert | [optional]
 **level** | **String**| level of alert | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **durationLimit** | **Long**| duration limit param | [optional]
 **durationOffset** | **Long**| duration offset param | [optional]
 **q** | **String**| query param of search | [optional]
 **relatedResource** | **String**| related resource info of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**AlertsResp**](AlertsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveAlert"></a>
# **resolveAlert**
> AlertResp resolveAlert(alertId)



set the resolved status of alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
Long alertId = 789L; // Long | the id of alert
try {
    AlertResp result = apiInstance.resolveAlert(alertId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#resolveAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertId** | **Long**| the id of alert |

### Return type

[**AlertResp**](AlertResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resolveAlerts"></a>
# **resolveAlerts**
> resolveAlerts(body)



resolve alerts of specific group or resource type

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertsApi;

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

AlertsApi apiInstance = new AlertsApi();
AlertsResolveReq body = new AlertsResolveReq(); // AlertsResolveReq | the alerts resolve info
try {
    apiInstance.resolveAlerts(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#resolveAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertsResolveReq**](AlertsResolveReq.md)| the alerts resolve info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

