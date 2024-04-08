# EmailsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailConfig**](EmailsApi.md#getEmailConfig) | **GET** /v1/emails/config | 
[**sendEmail**](EmailsApi.md#sendEmail) | **POST** /v1/emails/ | 
[**updateEmailConfig**](EmailsApi.md#updateEmailConfig) | **PATCH** /v1/emails/config | 

<a name="getEmailConfig"></a>
# **getEmailConfig**
> EmailConfigResp getEmailConfig()



setup email configs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailsApi;

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

EmailsApi apiInstance = new EmailsApi();
try {
    EmailConfigResp result = apiInstance.getEmailConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#getEmailConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailConfigResp**](EmailConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendEmail"></a>
# **sendEmail**
> EmailResp sendEmail(body)



send email

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailsApi;

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

EmailsApi apiInstance = new EmailsApi();
EmailSendReq body = new EmailSendReq(); // EmailSendReq | email info
try {
    EmailResp result = apiInstance.sendEmail(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailSendReq**](EmailSendReq.md)| email info |

### Return type

[**EmailResp**](EmailResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailConfig"></a>
# **updateEmailConfig**
> EmailConfigResp updateEmailConfig(body)



setup email configs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.EmailsApi;

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

EmailsApi apiInstance = new EmailsApi();
EmailConfigUpdateReq body = new EmailConfigUpdateReq(); // EmailConfigUpdateReq | email config info
try {
    EmailConfigResp result = apiInstance.updateEmailConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailsApi#updateEmailConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailConfigUpdateReq**](EmailConfigUpdateReq.md)| email config info |

### Return type

[**EmailConfigResp**](EmailConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

