# DnsZonesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDNSZone**](DnsZonesApi.md#getDNSZone) | **GET** /v1/dns-zones/{zone_id} | 
[**listDNSZones**](DnsZonesApi.md#listDNSZones) | **GET** /v1/dns-zones/ | 
[**updateDNSZone**](DnsZonesApi.md#updateDNSZone) | **PATCH** /v1/dns-zones/{zone_id} | 

<a name="getDNSZone"></a>
# **getDNSZone**
> DNSZoneResp getDNSZone(zoneId)



Get a dns zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsZonesApi;

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

DnsZonesApi apiInstance = new DnsZonesApi();
Long zoneId = 789L; // Long | dns zone id
try {
    DNSZoneResp result = apiInstance.getDNSZone(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsZonesApi#getDNSZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Long**| dns zone id |

### Return type

[**DNSZoneResp**](DNSZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDNSZones"></a>
# **listDNSZones**
> DNSZonesResp listDNSZones(limit, offset, dnsGatewayGroupId)



List dns zones

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsZonesApi;

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

DnsZonesApi apiInstance = new DnsZonesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long dnsGatewayGroupId = 789L; // Long | dns gateway group id
try {
    DNSZonesResp result = apiInstance.listDNSZones(limit, offset, dnsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsZonesApi#listDNSZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **dnsGatewayGroupId** | **Long**| dns gateway group id | [optional]

### Return type

[**DNSZonesResp**](DNSZonesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDNSZone"></a>
# **updateDNSZone**
> DNSZoneResp updateDNSZone(body, zoneId)



Update a dns zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsZonesApi;

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

DnsZonesApi apiInstance = new DnsZonesApi();
DNSZoneUpdateReq body = new DNSZoneUpdateReq(); // DNSZoneUpdateReq | DNS zone info
Long zoneId = 789L; // Long | dns zone id
try {
    DNSZoneResp result = apiInstance.updateDNSZone(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsZonesApi#updateDNSZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSZoneUpdateReq**](DNSZoneUpdateReq.md)| DNS zone info |
 **zoneId** | **Long**| dns zone id |

### Return type

[**DNSZoneResp**](DNSZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

