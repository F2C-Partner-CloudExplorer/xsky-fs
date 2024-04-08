# OsdGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOsdsToOsdGroup**](OsdGroupsApi.md#addOsdsToOsdGroup) | **POST** /v1/osd-groups/{group_id}:add-osds | 
[**disableDeviceTypeCheck**](OsdGroupsApi.md#disableDeviceTypeCheck) | **POST** /v1/osd-groups/{group_id}:disable-device-type-check | 
[**enableDeviceTypeCheck**](OsdGroupsApi.md#enableDeviceTypeCheck) | **POST** /v1/osd-groups/{group_id}:enable-device-type-check | 
[**getOsdGroup**](OsdGroupsApi.md#getOsdGroup) | **GET** /v1/osd-groups/{group_id} | 
[**getOsdGroupSamples**](OsdGroupsApi.md#getOsdGroupSamples) | **GET** /v1/osd-groups/{group_id}/samples | 
[**listOsdGroups**](OsdGroupsApi.md#listOsdGroups) | **GET** /v1/osd-groups/ | 
[**removeOsdsFromOsdGroup**](OsdGroupsApi.md#removeOsdsFromOsdGroup) | **POST** /v1/osd-groups/{group_id}:remove-osds | 
[**reweightOsdGroup**](OsdGroupsApi.md#reweightOsdGroup) | **POST** /v1/osd-groups/{group_id}:reweight | 
[**setOsdFullRatio**](OsdGroupsApi.md#setOsdFullRatio) | **POST** /v1/osd-groups/{group_id}:set-osd-full-ratio | 
[**setOsdGroupQos**](OsdGroupsApi.md#setOsdGroupQos) | **POST** /v1/osd-groups/{group_id}:set-qos | 

<a name="addOsdsToOsdGroup"></a>
# **addOsdsToOsdGroup**
> OsdGroupResp addOsdsToOsdGroup(body, groupId)



Add osds to osd grouop

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
OsdGroupOsdsUpdateReq body = new OsdGroupOsdsUpdateReq(); // OsdGroupOsdsUpdateReq | osd ids
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.addOsdsToOsdGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#addOsdsToOsdGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdGroupOsdsUpdateReq**](OsdGroupOsdsUpdateReq.md)| osd ids |
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="disableDeviceTypeCheck"></a>
# **disableDeviceTypeCheck**
> OsdGroupResp disableDeviceTypeCheck(groupId)



Disable device type check when add osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.disableDeviceTypeCheck(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#disableDeviceTypeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enableDeviceTypeCheck"></a>
# **enableDeviceTypeCheck**
> OsdGroupResp enableDeviceTypeCheck(groupId)



Enable device type check when add osd

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.enableDeviceTypeCheck(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#enableDeviceTypeCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsdGroup"></a>
# **getOsdGroup**
> OsdGroupResp getOsdGroup(groupId)



Get osd group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.getOsdGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#getOsdGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOsdGroupSamples"></a>
# **getOsdGroupSamples**
> OsdGroupSamplesResp getOsdGroupSamples(groupId, durationBegin, durationEnd, period)



get a osd group&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long groupId = 789L; // Long | osd group id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OsdGroupSamplesResp result = apiInstance.getOsdGroupSamples(groupId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#getOsdGroupSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| osd group id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OsdGroupSamplesResp**](OsdGroupSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOsdGroups"></a>
# **listOsdGroups**
> OsdGroupsResp listOsdGroups(limit, offset, q, sort)



List osd groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    OsdGroupsResp result = apiInstance.listOsdGroups(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#listOsdGroups");
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

[**OsdGroupsResp**](OsdGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeOsdsFromOsdGroup"></a>
# **removeOsdsFromOsdGroup**
> OsdGroupResp removeOsdsFromOsdGroup(body, groupId)



Remove multiple osds from a osd group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
OsdGroupOsdsUpdateReq body = new OsdGroupOsdsUpdateReq(); // OsdGroupOsdsUpdateReq | remove osd ids
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.removeOsdsFromOsdGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#removeOsdsFromOsdGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdGroupOsdsUpdateReq**](OsdGroupOsdsUpdateReq.md)| remove osd ids |
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reweightOsdGroup"></a>
# **reweightOsdGroup**
> OsdGroupResp reweightOsdGroup(groupId)



Reweight pools of osd group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.reweightOsdGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#reweightOsdGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setOsdFullRatio"></a>
# **setOsdFullRatio**
> OsdGroupResp setOsdFullRatio(body, groupId)



Set osd full ratio of osd group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
SetOsdFullRatioReq body = new SetOsdFullRatioReq(); // SetOsdFullRatioReq | osds full ratio
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.setOsdFullRatio(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#setOsdFullRatio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetOsdFullRatioReq**](SetOsdFullRatioReq.md)| osds full ratio |
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setOsdGroupQos"></a>
# **setOsdGroupQos**
> OsdGroupResp setOsdGroupQos(body, groupId)



Set osd group&#x27;s qos

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsdGroupsApi;

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

OsdGroupsApi apiInstance = new OsdGroupsApi();
OsdGroupSetQosReq body = new OsdGroupSetQosReq(); // OsdGroupSetQosReq | qos info
Long groupId = 789L; // Long | osd group id
try {
    OsdGroupResp result = apiInstance.setOsdGroupQos(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsdGroupsApi#setOsdGroupQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OsdGroupSetQosReq**](OsdGroupSetQosReq.md)| qos info |
 **groupId** | **Long**| osd group id |

### Return type

[**OsdGroupResp**](OsdGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

