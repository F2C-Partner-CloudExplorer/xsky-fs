# OsExternalStoragePlatformValidatorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOSExStoragePlatformValidator**](OsExternalStoragePlatformValidatorsApi.md#createOSExStoragePlatformValidator) | **POST** /v1/os-external-storage-platform-validators/ | 
[**getOSExStoragePlatformValidator**](OsExternalStoragePlatformValidatorsApi.md#getOSExStoragePlatformValidator) | **GET** /v1/os-external-storage-platform-validators/{validator_id} | 

<a name="createOSExStoragePlatformValidator"></a>
# **createOSExStoragePlatformValidator**
> OSExStoragePlatformValidatorResp createOSExStoragePlatformValidator(body, clusterId)



Create os external storage platform validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStoragePlatformValidatorsApi;

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

OsExternalStoragePlatformValidatorsApi apiInstance = new OsExternalStoragePlatformValidatorsApi();
OSExStoragePlatformValidatorCreateReq body = new OSExStoragePlatformValidatorCreateReq(); // OSExStoragePlatformValidatorCreateReq | external storage platform validator info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OSExStoragePlatformValidatorResp result = apiInstance.createOSExStoragePlatformValidator(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStoragePlatformValidatorsApi#createOSExStoragePlatformValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OSExStoragePlatformValidatorCreateReq**](OSExStoragePlatformValidatorCreateReq.md)| external storage platform validator info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OSExStoragePlatformValidatorResp**](OSExStoragePlatformValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOSExStoragePlatformValidator"></a>
# **getOSExStoragePlatformValidator**
> OSExStoragePlatformValidatorResp getOSExStoragePlatformValidator(validatorId)



Get a os external storage platform validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OsExternalStoragePlatformValidatorsApi;

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

OsExternalStoragePlatformValidatorsApi apiInstance = new OsExternalStoragePlatformValidatorsApi();
Long validatorId = 789L; // Long | external storage platform validator id
try {
    OSExStoragePlatformValidatorResp result = apiInstance.getOSExStoragePlatformValidator(validatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsExternalStoragePlatformValidatorsApi#getOSExStoragePlatformValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validatorId** | **Long**| external storage platform validator id |

### Return type

[**OSExStoragePlatformValidatorResp**](OSExStoragePlatformValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

