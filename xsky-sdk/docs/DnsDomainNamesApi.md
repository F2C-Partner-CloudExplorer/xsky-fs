# DnsDomainNamesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDNSDomainName**](DnsDomainNamesApi.md#createDNSDomainName) | **POST** /v1/dns-domain-names/ | 
[**deleteDNSDomainName**](DnsDomainNamesApi.md#deleteDNSDomainName) | **DELETE** /v1/dns-domain-names/{name_id} | 
[**getDNSDomainName**](DnsDomainNamesApi.md#getDNSDomainName) | **GET** /v1/dns-domain-names/{name_id} | 
[**listDNSDomainNames**](DnsDomainNamesApi.md#listDNSDomainNames) | **GET** /v1/dns-domain-names/ | 
[**updateDNSDomainName**](DnsDomainNamesApi.md#updateDNSDomainName) | **PATCH** /v1/dns-domain-names/{name_id} | 

<a name="createDNSDomainName"></a>
# **createDNSDomainName**
> DNSDomainNameResp createDNSDomainName(body)



Create a DNS domain name.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsDomainNamesApi;

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

DnsDomainNamesApi apiInstance = new DnsDomainNamesApi();
DNSDomainNameCreateReq body = new DNSDomainNameCreateReq(); // DNSDomainNameCreateReq | DNS domain name info
try {
    DNSDomainNameResp result = apiInstance.createDNSDomainName(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsDomainNamesApi#createDNSDomainName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSDomainNameCreateReq**](DNSDomainNameCreateReq.md)| DNS domain name info |

### Return type

[**DNSDomainNameResp**](DNSDomainNameResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDNSDomainName"></a>
# **deleteDNSDomainName**
> deleteDNSDomainName(nameId)



Delete a DNS domain nam.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsDomainNamesApi;

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

DnsDomainNamesApi apiInstance = new DnsDomainNamesApi();
Long nameId = 789L; // Long | DNS domain name id
try {
    apiInstance.deleteDNSDomainName(nameId);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsDomainNamesApi#deleteDNSDomainName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameId** | **Long**| DNS domain name id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDNSDomainName"></a>
# **getDNSDomainName**
> DNSDomainNameResp getDNSDomainName(nameId)



Get a dns domain name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsDomainNamesApi;

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

DnsDomainNamesApi apiInstance = new DnsDomainNamesApi();
Long nameId = 789L; // Long | dns domain name id
try {
    DNSDomainNameResp result = apiInstance.getDNSDomainName(nameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsDomainNamesApi#getDNSDomainName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameId** | **Long**| dns domain name id |

### Return type

[**DNSDomainNameResp**](DNSDomainNameResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDNSDomainNames"></a>
# **listDNSDomainNames**
> DNSDomainNamesResp listDNSDomainNames(limit, offset, dnsZoneId, dfsGatewayZoneId)



List dns domain names

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsDomainNamesApi;

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

DnsDomainNamesApi apiInstance = new DnsDomainNamesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long dnsZoneId = 789L; // Long | dns zone id
Long dfsGatewayZoneId = 789L; // Long | dfs gateway zone id
try {
    DNSDomainNamesResp result = apiInstance.listDNSDomainNames(limit, offset, dnsZoneId, dfsGatewayZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsDomainNamesApi#listDNSDomainNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **dnsZoneId** | **Long**| dns zone id | [optional]
 **dfsGatewayZoneId** | **Long**| dfs gateway zone id | [optional]

### Return type

[**DNSDomainNamesResp**](DNSDomainNamesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDNSDomainName"></a>
# **updateDNSDomainName**
> DNSDomainNameResp updateDNSDomainName(body, nameId)



Update a DNS domain name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsDomainNamesApi;

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

DnsDomainNamesApi apiInstance = new DnsDomainNamesApi();
DNSDomainNameUpdateReq body = new DNSDomainNameUpdateReq(); // DNSDomainNameUpdateReq | DNS domain name info
Long nameId = 789L; // Long | DNS domain name id
try {
    DNSDomainNameResp result = apiInstance.updateDNSDomainName(body, nameId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsDomainNamesApi#updateDNSDomainName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSDomainNameUpdateReq**](DNSDomainNameUpdateReq.md)| DNS domain name info |
 **nameId** | **Long**| DNS domain name id |

### Return type

[**DNSDomainNameResp**](DNSDomainNameResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

