# DnsLoadBalancePoliciesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listDNSLoadBalancePolicies**](DnsLoadBalancePoliciesApi.md#listDNSLoadBalancePolicies) | **GET** /v1/dns-load-balance-policies/ | 

<a name="listDNSLoadBalancePolicies"></a>
# **listDNSLoadBalancePolicies**
> DNSLoadBalancePoliciesResp listDNSLoadBalancePolicies(limit, offset, resourceType)



List dns load balance policies

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsLoadBalancePoliciesApi;

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

DnsLoadBalancePoliciesApi apiInstance = new DnsLoadBalancePoliciesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String resourceType = "resourceType_example"; // String | resource type
try {
    DNSLoadBalancePoliciesResp result = apiInstance.listDNSLoadBalancePolicies(limit, offset, resourceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsLoadBalancePoliciesApi#listDNSLoadBalancePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **resourceType** | **String**| resource type | [optional]

### Return type

[**DNSLoadBalancePoliciesResp**](DNSLoadBalancePoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

