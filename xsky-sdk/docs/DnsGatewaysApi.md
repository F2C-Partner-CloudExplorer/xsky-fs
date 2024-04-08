# DnsGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDNSGateway**](DnsGatewaysApi.md#getDNSGateway) | **GET** /v1/dns-gateways/{gateway_id} | 
[**listDNSGateways**](DnsGatewaysApi.md#listDNSGateways) | **GET** /v1/dns-gateways/ | 

<a name="getDNSGateway"></a>
# **getDNSGateway**
> DNSGatewayResp getDNSGateway(gatewayId)



Get a dns gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewaysApi;

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

DnsGatewaysApi apiInstance = new DnsGatewaysApi();
Long gatewayId = 789L; // Long | dns gateway id
try {
    DNSGatewayResp result = apiInstance.getDNSGateway(gatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewaysApi#getDNSGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gatewayId** | **Long**| dns gateway id |

### Return type

[**DNSGatewayResp**](DNSGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDNSGateways"></a>
# **listDNSGateways**
> DNSGatewaysResp listDNSGateways(limit, offset, dnsGatewayGroupId)



List dns gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewaysApi;

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

DnsGatewaysApi apiInstance = new DnsGatewaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long dnsGatewayGroupId = 789L; // Long | dns_gateway_group id
try {
    DNSGatewaysResp result = apiInstance.listDNSGateways(limit, offset, dnsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewaysApi#listDNSGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **dnsGatewayGroupId** | **Long**| dns_gateway_group id | [optional]

### Return type

[**DNSGatewaysResp**](DNSGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

