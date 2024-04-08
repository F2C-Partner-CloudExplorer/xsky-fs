# HostMaintainValidatorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHostMaintainValidator**](HostMaintainValidatorsApi.md#createHostMaintainValidator) | **POST** /v1/host-maintain-validators/ | 
[**getHostMaintainValidator**](HostMaintainValidatorsApi.md#getHostMaintainValidator) | **GET** /v1/host-maintain-validators/{host_maintain_validator_id} | 

<a name="createHostMaintainValidator"></a>
# **createHostMaintainValidator**
> HostMaintainValidatorResp createHostMaintainValidator(body)



Create host maintain validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostMaintainValidatorsApi;

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

HostMaintainValidatorsApi apiInstance = new HostMaintainValidatorsApi();
HostMaintainValidatorCreateReq body = new HostMaintainValidatorCreateReq(); // HostMaintainValidatorCreateReq | host maintain validator info
try {
    HostMaintainValidatorResp result = apiInstance.createHostMaintainValidator(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostMaintainValidatorsApi#createHostMaintainValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostMaintainValidatorCreateReq**](HostMaintainValidatorCreateReq.md)| host maintain validator info |

### Return type

[**HostMaintainValidatorResp**](HostMaintainValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHostMaintainValidator"></a>
# **getHostMaintainValidator**
> HostMaintainValidatorResp getHostMaintainValidator(hostMaintainValidatorId)



Get host maintain validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostMaintainValidatorsApi;

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

HostMaintainValidatorsApi apiInstance = new HostMaintainValidatorsApi();
Long hostMaintainValidatorId = 789L; // Long | host maintain validator id
try {
    HostMaintainValidatorResp result = apiInstance.getHostMaintainValidator(hostMaintainValidatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostMaintainValidatorsApi#getHostMaintainValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostMaintainValidatorId** | **Long**| host maintain validator id |

### Return type

[**HostMaintainValidatorResp**](HostMaintainValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

