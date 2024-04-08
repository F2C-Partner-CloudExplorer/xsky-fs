# SslCertificatesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSSLCertificate**](SslCertificatesApi.md#createSSLCertificate) | **POST** /v1/ssl-certificates/ | 
[**deleteSSLCertificate**](SslCertificatesApi.md#deleteSSLCertificate) | **DELETE** /v1/ssl-certificates/{certificate_id} | 
[**getSSLCertificate**](SslCertificatesApi.md#getSSLCertificate) | **GET** /v1/ssl-certificates/{certificate_id} | 
[**listSSLCertificates**](SslCertificatesApi.md#listSSLCertificates) | **GET** /v1/ssl-certificates/ | 
[**updateSSLCertificate**](SslCertificatesApi.md#updateSSLCertificate) | **PATCH** /v1/ssl-certificates/{certificate_id} | 

<a name="createSSLCertificate"></a>
# **createSSLCertificate**
> SSLCertificateResp createSSLCertificate(body)



Create ssl certificate

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SslCertificatesApi;

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

SslCertificatesApi apiInstance = new SslCertificatesApi();
SSLCertificateCreateReq body = new SSLCertificateCreateReq(); // SSLCertificateCreateReq | ssl certificate info
try {
    SSLCertificateResp result = apiInstance.createSSLCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslCertificatesApi#createSSLCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SSLCertificateCreateReq**](SSLCertificateCreateReq.md)| ssl certificate info |

### Return type

[**SSLCertificateResp**](SSLCertificateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSSLCertificate"></a>
# **deleteSSLCertificate**
> SSLCertificateResp deleteSSLCertificate(certificateId)



Delete ssl certificate

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SslCertificatesApi;

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

SslCertificatesApi apiInstance = new SslCertificatesApi();
Long certificateId = 789L; // Long | certificate id
try {
    SSLCertificateResp result = apiInstance.deleteSSLCertificate(certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslCertificatesApi#deleteSSLCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **Long**| certificate id |

### Return type

[**SSLCertificateResp**](SSLCertificateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSSLCertificate"></a>
# **getSSLCertificate**
> SSLCertificateResp getSSLCertificate(certificateId, limit, offset)



Get certificates

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SslCertificatesApi;

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

SslCertificatesApi apiInstance = new SslCertificatesApi();
Long certificateId = 789L; // Long | certificate id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    SSLCertificateResp result = apiInstance.getSSLCertificate(certificateId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslCertificatesApi#getSSLCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateId** | **Long**| certificate id |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**SSLCertificateResp**](SSLCertificateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSSLCertificates"></a>
# **listSSLCertificates**
> SSLCertificatesResp listSSLCertificates(limit, offset)



List certificates

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SslCertificatesApi;

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

SslCertificatesApi apiInstance = new SslCertificatesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    SSLCertificatesResp result = apiInstance.listSSLCertificates(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslCertificatesApi#listSSLCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**SSLCertificatesResp**](SSLCertificatesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSSLCertificate"></a>
# **updateSSLCertificate**
> SSLCertificateResp updateSSLCertificate(body, certificateId)



Update ssl certificate

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SslCertificatesApi;

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

SslCertificatesApi apiInstance = new SslCertificatesApi();
SSLCertificateUpdateReq body = new SSLCertificateUpdateReq(); // SSLCertificateUpdateReq | ssl certificate info
Long certificateId = 789L; // Long | certificate id
try {
    SSLCertificateResp result = apiInstance.updateSSLCertificate(body, certificateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslCertificatesApi#updateSSLCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SSLCertificateUpdateReq**](SSLCertificateUpdateReq.md)| ssl certificate info |
 **certificateId** | **Long**| certificate id |

### Return type

[**SSLCertificateResp**](SSLCertificateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

