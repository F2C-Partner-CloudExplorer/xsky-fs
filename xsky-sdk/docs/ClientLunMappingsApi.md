# ClientLunMappingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClientLunMapping**](ClientLunMappingsApi.md#getClientLunMapping) | **GET** /v1/client-lun-mappings/{client_lun_mapping_id} | 
[**listClientLunMappings**](ClientLunMappingsApi.md#listClientLunMappings) | **GET** /v1/client-lun-mappings/ | 

<a name="getClientLunMapping"></a>
# **getClientLunMapping**
> ClientLunMappingResp getClientLunMapping(clientLunMappingId, isFetchLunInfo)



get a client lun mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientLunMappingsApi;

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

ClientLunMappingsApi apiInstance = new ClientLunMappingsApi();
Long clientLunMappingId = 789L; // Long | client lun mapping id
Boolean isFetchLunInfo = true; // Boolean | whether to fetch lun info from target
try {
    ClientLunMappingResp result = apiInstance.getClientLunMapping(clientLunMappingId, isFetchLunInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientLunMappingsApi#getClientLunMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientLunMappingId** | **Long**| client lun mapping id |
 **isFetchLunInfo** | **Boolean**| whether to fetch lun info from target | [optional]

### Return type

[**ClientLunMappingResp**](ClientLunMappingResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClientLunMappings"></a>
# **listClientLunMappings**
> ClientLunMappingsResp listClientLunMappings(mappingGroupId, limit, offset)



List client lun mappings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientLunMappingsApi;

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

ClientLunMappingsApi apiInstance = new ClientLunMappingsApi();
Long mappingGroupId = 789L; // Long | mapping group id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    ClientLunMappingsResp result = apiInstance.listClientLunMappings(mappingGroupId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientLunMappingsApi#listClientLunMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingGroupId** | **Long**| mapping group id |
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**ClientLunMappingsResp**](ClientLunMappingsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

