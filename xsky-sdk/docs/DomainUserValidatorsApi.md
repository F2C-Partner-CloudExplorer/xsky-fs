# DomainUserValidatorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDomainUserValidator**](DomainUserValidatorsApi.md#createDomainUserValidator) | **POST** /v1/domain-user-validators/ | 
[**getDomainUserValidator**](DomainUserValidatorsApi.md#getDomainUserValidator) | **GET** /v1/domain-user-validators/{domain_user_validator_id} | 

<a name="createDomainUserValidator"></a>
# **createDomainUserValidator**
> DomainUserValidatorResp createDomainUserValidator(body)



Create domain user validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DomainUserValidatorsApi;

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

DomainUserValidatorsApi apiInstance = new DomainUserValidatorsApi();
DomainUserValidatorCreateReq body = new DomainUserValidatorCreateReq(); // DomainUserValidatorCreateReq | domain user validator info
try {
    DomainUserValidatorResp result = apiInstance.createDomainUserValidator(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainUserValidatorsApi#createDomainUserValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainUserValidatorCreateReq**](DomainUserValidatorCreateReq.md)| domain user validator info |

### Return type

[**DomainUserValidatorResp**](DomainUserValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDomainUserValidator"></a>
# **getDomainUserValidator**
> DomainUserValidatorResp getDomainUserValidator(domainUserValidatorId)



Get domain_user validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DomainUserValidatorsApi;

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

DomainUserValidatorsApi apiInstance = new DomainUserValidatorsApi();
Long domainUserValidatorId = 789L; // Long | domain user validator id
try {
    DomainUserValidatorResp result = apiInstance.getDomainUserValidator(domainUserValidatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainUserValidatorsApi#getDomainUserValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domainUserValidatorId** | **Long**| domain user validator id |

### Return type

[**DomainUserValidatorResp**](DomainUserValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

