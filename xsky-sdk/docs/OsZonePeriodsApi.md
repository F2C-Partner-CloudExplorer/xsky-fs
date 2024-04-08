# OsZonePeriodsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOSZonePeriod**](OsZonePeriodsApi.md#getOSZonePeriod) | **GET** /v1/os-zone-periods/{period_uuid} | 
[**listOSZonePeriods**](OsZonePeriodsApi.md#listOSZonePeriods) | **GET** /v1/os-zone-periods/ | 

<a name="getOSZonePeriod"></a>
# **getOSZonePeriod**
> OSZonePeriodResp getOSZonePeriod(periodUuid)



Get a os zone period.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonePeriodsApi;

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

OsZonePeriodsApi apiInstance = new OsZonePeriodsApi();
String periodUuid = "periodUuid_example"; // String | os zone period uuid
try {
    OSZonePeriodResp result = apiInstance.getOSZonePeriod(periodUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonePeriodsApi#getOSZonePeriod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodUuid** | **String**| os zone period uuid |

### Return type

[**OSZonePeriodResp**](OSZonePeriodResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSZonePeriods"></a>
# **listOSZonePeriods**
> OSZonePeriodsResp listOSZonePeriods(limit, offset, clusterId)



List os zone periods.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonePeriodsApi;

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

OsZonePeriodsApi apiInstance = new OsZonePeriodsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSZonePeriodsResp result = apiInstance.listOSZonePeriods(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonePeriodsApi#listOSZonePeriods");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSZonePeriodsResp**](OSZonePeriodsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

