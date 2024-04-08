# OsReplicationZonesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSReplicationZone**](OsReplicationZonesApi.md#createOSReplicationZone) | **POST** /v1/os-replication-zones/ | 
[**deleteOSReplicationZone**](OsReplicationZonesApi.md#deleteOSReplicationZone) | **DELETE** /v1/os-replication-zones/{zone_uuid} | 
[**getOSReplicationZone**](OsReplicationZonesApi.md#getOSReplicationZone) | **GET** /v1/os-replication-zones/{zone_uuid} | 
[**getOSReplicationZoneSamples**](OsReplicationZonesApi.md#getOSReplicationZoneSamples) | **GET** /v1/os-replication-zones/{zone_uuid}/samples | 
[**listOSReplicationZones**](OsReplicationZonesApi.md#listOSReplicationZones) | **GET** /v1/os-replication-zones/ | 
[**updateOSReplicationZone**](OsReplicationZonesApi.md#updateOSReplicationZone) | **PATCH** /v1/os-replication-zones/{zone_uuid} | 

<a name="createOSReplicationZone"></a>
# **createOSReplicationZone**
> OSReplicationZoneResp createOSReplicationZone(body, clusterId)



Create a os replication zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
OSReplicationZoneCreateReq body = new OSReplicationZoneCreateReq(); // OSReplicationZoneCreateReq | os replication zone info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSReplicationZoneResp result = apiInstance.createOSReplicationZone(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#createOSReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSReplicationZoneCreateReq**](OSReplicationZoneCreateReq.md)| os replication zone info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSReplicationZoneResp**](OSReplicationZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOSReplicationZone"></a>
# **deleteOSReplicationZone**
> OSReplicationZoneResp deleteOSReplicationZone(zoneUuid)



Delete a os replication zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
String zoneUuid = "zoneUuid_example"; // String | os replication zone uuid
try {
    OSReplicationZoneResp result = apiInstance.deleteOSReplicationZone(zoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#deleteOSReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| os replication zone uuid |

### Return type

[**OSReplicationZoneResp**](OSReplicationZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSReplicationZone"></a>
# **getOSReplicationZone**
> OSReplicationZoneRecordResp getOSReplicationZone(zoneUuid)



Get a os replication zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
String zoneUuid = "zoneUuid_example"; // String | os replication zone uuid
try {
    OSReplicationZoneRecordResp result = apiInstance.getOSReplicationZone(zoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#getOSReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| os replication zone uuid |

### Return type

[**OSReplicationZoneRecordResp**](OSReplicationZoneRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOSReplicationZoneSamples"></a>
# **getOSReplicationZoneSamples**
> OSReplicationZoneSamplesResp getOSReplicationZoneSamples(zoneUuid, durationBegin, durationEnd, period)



get an os replication zone&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
String zoneUuid = "zoneUuid_example"; // String | os replication zone uuid
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OSReplicationZoneSamplesResp result = apiInstance.getOSReplicationZoneSamples(zoneUuid, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#getOSReplicationZoneSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| os replication zone uuid |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OSReplicationZoneSamplesResp**](OSReplicationZoneSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOSReplicationZones"></a>
# **listOSReplicationZones**
> OSReplicationZoneRecordsResp listOSReplicationZones(limit, offset, marker, replicationUuid, osZoneUuid, clusterId)



List os replication zones

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String marker = "marker_example"; // String | paging param
String replicationUuid = "replicationUuid_example"; // String | os replication uuid
String osZoneUuid = "osZoneUuid_example"; // String | os zone uuid
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSReplicationZoneRecordsResp result = apiInstance.listOSReplicationZones(limit, offset, marker, replicationUuid, osZoneUuid, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#listOSReplicationZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **marker** | **String**| paging param | [optional]
 **replicationUuid** | **String**| os replication uuid | [optional]
 **osZoneUuid** | **String**| os zone uuid | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSReplicationZoneRecordsResp**](OSReplicationZoneRecordsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOSReplicationZone"></a>
# **updateOSReplicationZone**
> OSReplicationZoneResp updateOSReplicationZone(zoneUuid)



Update an os replication zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsReplicationZonesApi;

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

OsReplicationZonesApi apiInstance = new OsReplicationZonesApi();
String zoneUuid = "zoneUuid_example"; // String | os replication zone uuid
try {
    OSReplicationZoneResp result = apiInstance.updateOSReplicationZone(zoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsReplicationZonesApi#updateOSReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneUuid** | **String**| os replication zone uuid |

### Return type

[**OSReplicationZoneResp**](OSReplicationZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

