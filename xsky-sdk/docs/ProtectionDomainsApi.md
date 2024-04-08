# ProtectionDomainsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProtectionDomain**](ProtectionDomainsApi.md#getProtectionDomain) | **GET** /v1/protection-domains/{protection_domain_id} | 
[**listProtectionDomains**](ProtectionDomainsApi.md#listProtectionDomains) | **GET** /v1/protection-domains/ | 

<a name="getProtectionDomain"></a>
# **getProtectionDomain**
> ProtectionDomainRecordResp getProtectionDomain(protectionDomainId)



get protection domain

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ProtectionDomainsApi;

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

ProtectionDomainsApi apiInstance = new ProtectionDomainsApi();
Long protectionDomainId = 789L; // Long | protection domain id
try {
    ProtectionDomainRecordResp result = apiInstance.getProtectionDomain(protectionDomainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectionDomainsApi#getProtectionDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **protectionDomainId** | **Long**| protection domain id |

### Return type

[**ProtectionDomainRecordResp**](ProtectionDomainRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listProtectionDomains"></a>
# **listProtectionDomains**
> ProtectionDomainRecordsResp listProtectionDomains(limit, offset, q, sort)



List protection domains

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ProtectionDomainsApi;

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

ProtectionDomainsApi apiInstance = new ProtectionDomainsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ProtectionDomainRecordsResp result = apiInstance.listProtectionDomains(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectionDomainsApi#listProtectionDomains");
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

[**ProtectionDomainRecordsResp**](ProtectionDomainRecordsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

