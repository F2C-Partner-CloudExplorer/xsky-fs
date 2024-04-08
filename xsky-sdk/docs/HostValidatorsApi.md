# HostValidatorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHostValidator**](HostValidatorsApi.md#createHostValidator) | **POST** /v1/host-validators/ | 
[**getHostValidator**](HostValidatorsApi.md#getHostValidator) | **GET** /v1/host-validators/{host_validator_id} | 

<a name="createHostValidator"></a>
# **createHostValidator**
> HostValidatorResp createHostValidator(body)



Create host validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostValidatorsApi;

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

HostValidatorsApi apiInstance = new HostValidatorsApi();
HostValidatorCreateReq body = new HostValidatorCreateReq(); // HostValidatorCreateReq | host validator info
try {
    HostValidatorResp result = apiInstance.createHostValidator(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostValidatorsApi#createHostValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostValidatorCreateReq**](HostValidatorCreateReq.md)| host validator info |

### Return type

[**HostValidatorResp**](HostValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHostValidator"></a>
# **getHostValidator**
> HostValidatorResp getHostValidator(hostValidatorId)



Get host validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostValidatorsApi;

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

HostValidatorsApi apiInstance = new HostValidatorsApi();
Long hostValidatorId = 789L; // Long | host validator id
try {
    HostValidatorResp result = apiInstance.getHostValidator(hostValidatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostValidatorsApi#getHostValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostValidatorId** | **Long**| host validator id |

### Return type

[**HostValidatorResp**](HostValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

