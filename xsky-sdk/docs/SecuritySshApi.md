# SecuritySshApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSSHValidation**](SecuritySshApi.md#createSSHValidation) | **POST** /v1/security-ssh/validation | 
[**listSSHConfigs**](SecuritySshApi.md#listSSHConfigs) | **GET** /v1/security-ssh/ | 
[**updateSSHConfig**](SecuritySshApi.md#updateSSHConfig) | **PATCH** /v1/security-ssh/{config_id} | 

<a name="createSSHValidation"></a>
# **createSSHValidation**
> SecuritySSHValidationResp createSSHValidation(body)



Create ssh validation

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SecuritySshApi;

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

SecuritySshApi apiInstance = new SecuritySshApi();
SecuritySSHValidationReq body = new SecuritySSHValidationReq(); // SecuritySSHValidationReq | ssh validation info
try {
    SecuritySSHValidationResp result = apiInstance.createSSHValidation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritySshApi#createSSHValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritySSHValidationReq**](SecuritySSHValidationReq.md)| ssh validation info |

### Return type

[**SecuritySSHValidationResp**](SecuritySSHValidationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSSHConfigs"></a>
# **listSSHConfigs**
> SecuritySSHConfigResp listSSHConfigs()



List ssh configs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SecuritySshApi;

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

SecuritySshApi apiInstance = new SecuritySshApi();
try {
    SecuritySSHConfigResp result = apiInstance.listSSHConfigs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritySshApi#listSSHConfigs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecuritySSHConfigResp**](SecuritySSHConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSSHConfig"></a>
# **updateSSHConfig**
> SecuritySSHConfigResp updateSSHConfig(body, configId)



Update ssh validation

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.SecuritySshApi;

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

SecuritySshApi apiInstance = new SecuritySshApi();
SecuritySSHConfigReq body = new SecuritySSHConfigReq(); // SecuritySSHConfigReq | ssh validation info
Long configId = 789L; // Long | security ssh config id
try {
    SecuritySSHConfigResp result = apiInstance.updateSSHConfig(body, configId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecuritySshApi#updateSSHConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecuritySSHConfigReq**](SecuritySSHConfigReq.md)| ssh validation info |
 **configId** | **Long**| security ssh config id |

### Return type

[**SecuritySSHConfigResp**](SecuritySSHConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

