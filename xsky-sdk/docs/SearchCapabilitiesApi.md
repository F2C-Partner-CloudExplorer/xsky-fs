# SearchCapabilitiesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchCapabilites**](SearchCapabilitiesApi.md#searchCapabilites) | **GET** /v1/search-capabilities/ | 

<a name="searchCapabilites"></a>
# **searchCapabilites**
> searchCapabilites()



search capabilites

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SearchCapabilitiesApi;

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

SearchCapabilitiesApi apiInstance = new SearchCapabilitiesApi();
try {
    apiInstance.searchCapabilites();
} catch (ApiException e) {
    System.err.println("Exception when calling SearchCapabilitiesApi#searchCapabilites");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

