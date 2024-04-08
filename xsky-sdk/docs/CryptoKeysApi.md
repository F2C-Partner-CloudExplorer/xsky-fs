# CryptoKeysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCryptoKey**](CryptoKeysApi.md#createCryptoKey) | **POST** /v1/crypto-keys/ | 
[**downloadCryptoKey**](CryptoKeysApi.md#downloadCryptoKey) | **GET** /v1/crypto-keys/{key_id}/key | 
[**getCryptoKey**](CryptoKeysApi.md#getCryptoKey) | **GET** /v1/crypto-keys/{key_id} | 
[**listCryptoKeys**](CryptoKeysApi.md#listCryptoKeys) | **GET** /v1/crypto-keys/ | 
[**updateCryptoKey**](CryptoKeysApi.md#updateCryptoKey) | **PATCH** /v1/crypto-keys/{key_id} | 

<a name="createCryptoKey"></a>
# **createCryptoKey**
> CryptoKeyResp createCryptoKey(name, key)



Create a crypto key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CryptoKeysApi;

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

CryptoKeysApi apiInstance = new CryptoKeysApi();
String name = "name_example"; // String | 
String key = "key_example"; // String | 
try {
    CryptoKeyResp result = apiInstance.createCryptoKey(name, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoKeysApi#createCryptoKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **key** | **String**|  |

### Return type

[**CryptoKeyResp**](CryptoKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="downloadCryptoKey"></a>
# **downloadCryptoKey**
> File downloadCryptoKey(keyId, password)



### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CryptoKeysApi;

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

CryptoKeysApi apiInstance = new CryptoKeysApi();
Long keyId = 789L; // Long | crypto key id
String password = "password_example"; // String | password
try {
    File result = apiInstance.downloadCryptoKey(keyId, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoKeysApi#downloadCryptoKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| crypto key id |
 **password** | **String**| password | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getCryptoKey"></a>
# **getCryptoKey**
> CryptoKeyResp getCryptoKey(keyId)



Get a crypto key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CryptoKeysApi;

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

CryptoKeysApi apiInstance = new CryptoKeysApi();
Long keyId = 789L; // Long | crypto key id
try {
    CryptoKeyResp result = apiInstance.getCryptoKey(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoKeysApi#getCryptoKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **Long**| crypto key id |

### Return type

[**CryptoKeyResp**](CryptoKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCryptoKeys"></a>
# **listCryptoKeys**
> CryptoKeysResp listCryptoKeys(limit, offset, q, sort)



List crypto keys

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CryptoKeysApi;

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

CryptoKeysApi apiInstance = new CryptoKeysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    CryptoKeysResp result = apiInstance.listCryptoKeys(limit, offset, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoKeysApi#listCryptoKeys");
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

[**CryptoKeysResp**](CryptoKeysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCryptoKey"></a>
# **updateCryptoKey**
> CryptoKeyResp updateCryptoKey(body, keyId)



Update a crypto key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CryptoKeysApi;

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

CryptoKeysApi apiInstance = new CryptoKeysApi();
CryptoKeyUpdateReq body = new CryptoKeyUpdateReq(); // CryptoKeyUpdateReq | crypto key info
Long keyId = 789L; // Long | crypto key id
try {
    CryptoKeyResp result = apiInstance.updateCryptoKey(body, keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CryptoKeysApi#updateCryptoKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CryptoKeyUpdateReq**](CryptoKeyUpdateReq.md)| crypto key info |
 **keyId** | **Long**| crypto key id |

### Return type

[**CryptoKeyResp**](CryptoKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

