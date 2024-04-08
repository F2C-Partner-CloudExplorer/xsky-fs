# OsZonesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createObjectStorageZone**](OsZonesApi.md#createObjectStorageZone) | **POST** /v1/os-zones/ | 
[**deleteObjectStorageZone**](OsZonesApi.md#deleteObjectStorageZone) | **DELETE** /v1/os-zones/{zone_uuid} | 
[**getObjectStorageZone**](OsZonesApi.md#getObjectStorageZone) | **GET** /v1/os-zones/{zone_uuid} | 
[**getObjectStorageZoneSamples**](OsZonesApi.md#getObjectStorageZoneSamples) | **GET** /v1/os-zones/{zone_uuid}/samples | 
[**listObjectStorageZones**](OsZonesApi.md#listObjectStorageZones) | **GET** /v1/os-zones/ | 
[**updateOSZonesClockDiff**](OsZonesApi.md#updateOSZonesClockDiff) | **POST** /v1/os-zones/{zone_uuid} | 

<a name="createObjectStorageZone"></a>
# **createObjectStorageZone**
> ObjectStorageZoneResp createObjectStorageZone(body, clusterId)



Create a object storage zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
ObjectStorageZoneCreateReq body = new ObjectStorageZoneCreateReq(); // ObjectStorageZoneCreateReq | zone info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageZoneResp result = apiInstance.createObjectStorageZone(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#createObjectStorageZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageZoneCreateReq**](ObjectStorageZoneCreateReq.md)| zone info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageZoneResp**](ObjectStorageZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteObjectStorageZone"></a>
# **deleteObjectStorageZone**
> ObjectStorageZoneResp deleteObjectStorageZone(zoneUuid, force)



Delete a object storage zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
String zoneUuid = "zoneUuid_example"; // String | os zone uuid
Boolean force = true; // Boolean | delete os zone forcefully or not
try {
    ObjectStorageZoneResp result = apiInstance.deleteObjectStorageZone(zoneUuid, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#deleteObjectStorageZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| os zone uuid |
 **force** | **Boolean**| delete os zone forcefully or not | [optional]

### Return type

[**ObjectStorageZoneResp**](ObjectStorageZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageZone"></a>
# **getObjectStorageZone**
> ObjectStorageZoneRecordResp getObjectStorageZone(zoneUuid)



Get object storage zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
String zoneUuid = "zoneUuid_example"; // String | object storage zone uuid
try {
    ObjectStorageZoneRecordResp result = apiInstance.getObjectStorageZone(zoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#getObjectStorageZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| object storage zone uuid |

### Return type

[**ObjectStorageZoneRecordResp**](ObjectStorageZoneRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageZoneSamples"></a>
# **getObjectStorageZoneSamples**
> ObjectStorageZoneSamplesResp getObjectStorageZoneSamples(zoneUuid, durationBegin, durationEnd, period)



get an object storage zone&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
String zoneUuid = "zoneUuid_example"; // String | object storage zone uuid
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    ObjectStorageZoneSamplesResp result = apiInstance.getObjectStorageZoneSamples(zoneUuid, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#getObjectStorageZoneSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| object storage zone uuid |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**ObjectStorageZoneSamplesResp**](ObjectStorageZoneSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listObjectStorageZones"></a>
# **listObjectStorageZones**
> ObjectStorageZonesRecordResp listObjectStorageZones(limit, offset, q, sort, local, master, name, clusterId)



List object storage zones

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Boolean local = true; // Boolean | local or non-local zones
Boolean master = true; // Boolean | master or non-master zones
String name = "name_example"; // String | name of zone
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageZonesRecordResp result = apiInstance.listObjectStorageZones(limit, offset, q, sort, local, master, name, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#listObjectStorageZones");
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
 **local** | **Boolean**| local or non-local zones | [optional]
 **master** | **Boolean**| master or non-master zones | [optional]
 **name** | **String**| name of zone | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageZonesRecordResp**](ObjectStorageZonesRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSZonesClockDiff"></a>
# **updateOSZonesClockDiff**
> ObjectStorageZoneResp updateOSZonesClockDiff(body, zoneUuid)



update os zone pairs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsZonesApi;

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

OsZonesApi apiInstance = new OsZonesApi();
OSZonePairsUpdateReq body = new OSZonePairsUpdateReq(); // OSZonePairsUpdateReq | zone pairs info
String zoneUuid = "zoneUuid_example"; // String | os zone uuid
try {
    ObjectStorageZoneResp result = apiInstance.updateOSZonesClockDiff(body, zoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsZonesApi#updateOSZonesClockDiff");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSZonePairsUpdateReq**](OSZonePairsUpdateReq.md)| zone pairs info |
 **zoneUuid** | **String**| os zone uuid |

### Return type

[**ObjectStorageZoneResp**](ObjectStorageZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

