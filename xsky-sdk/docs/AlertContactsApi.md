# AlertContactsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkAlertContact**](AlertContactsApi.md#checkAlertContact) | **GET** /v1/alert-contacts/{alert_contact_id}/check | 
[**createAlertContact**](AlertContactsApi.md#createAlertContact) | **POST** /v1/alert-contacts/ | 
[**deleteAlertContact**](AlertContactsApi.md#deleteAlertContact) | **DELETE** /v1/alert-contacts/{alert_contact_id} | 
[**getAlertContact**](AlertContactsApi.md#getAlertContact) | **GET** /v1/alert-contacts/{alert_contact_id} | 
[**listAlertContacts**](AlertContactsApi.md#listAlertContacts) | **GET** /v1/alert-contacts/ | 
[**updateAlertContact**](AlertContactsApi.md#updateAlertContact) | **PATCH** /v1/alert-contacts/{alert_contact_id} | 

<a name="checkAlertContact"></a>
# **checkAlertContact**
> AlertContactStrategyResp checkAlertContact(alertContactId)



check the relationship between alert contact and alert strategy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
Long alertContactId = 789L; // Long | alert contact id
try {
    AlertContactStrategyResp result = apiInstance.checkAlertContact(alertContactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#checkAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertContactId** | **Long**| alert contact id |

### Return type

[**AlertContactStrategyResp**](AlertContactStrategyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAlertContact"></a>
# **createAlertContact**
> AlertContactReq createAlertContact(body)



create contact of alert

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
AlertContactReq body = new AlertContactReq(); // AlertContactReq | alert contact
try {
    AlertContactReq result = apiInstance.createAlertContact(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#createAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertContactReq**](AlertContactReq.md)| alert contact |

### Return type

[**AlertContactReq**](AlertContactReq.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlertContact"></a>
# **deleteAlertContact**
> deleteAlertContact(alertContactId)



Delete alert contact

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
Long alertContactId = 789L; // Long | alert contact id
try {
    apiInstance.deleteAlertContact(alertContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#deleteAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertContactId** | **Long**| alert contact id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAlertContact"></a>
# **getAlertContact**
> AlertContactResp getAlertContact(alertContactId)



get an alert contact

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
Long alertContactId = 789L; // Long | alert contact id
try {
    AlertContactResp result = apiInstance.getAlertContact(alertContactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#getAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertContactId** | **Long**| alert contact id |

### Return type

[**AlertContactResp**](AlertContactResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAlertContacts"></a>
# **listAlertContacts**
> AlertContactsResp listAlertContacts(limit, offset, name, durationBegin, durationEnd, durationLimit, durationOffset, q, sort)



List all alert contacts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
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
    AlertContactsResp result = apiInstance.listAlertContacts(limit, offset, name, durationBegin, durationEnd, durationLimit, durationOffset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#listAlertContacts");
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

<a name="updateAlertContact"></a>
# **updateAlertContact**
> updateAlertContact(body, alertContactId)



update alert contact

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.AlertContactsApi;

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

AlertContactsApi apiInstance = new AlertContactsApi();
AlertsActionReq body = new AlertsActionReq(); // AlertsActionReq | the alerts action info
Long alertContactId = 789L; // Long | alert contact id
try {
    apiInstance.updateAlertContact(body, alertContactId);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertContactsApi#updateAlertContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertsActionReq**](AlertsActionReq.md)| the alerts action info |
 **alertContactId** | **Long**| alert contact id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

