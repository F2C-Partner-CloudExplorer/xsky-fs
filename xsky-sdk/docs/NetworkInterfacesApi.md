# NetworkInterfacesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkInterface**](NetworkInterfacesApi.md#getNetworkInterface) | **GET** /v1/network-interfaces/{network_interface_id} | 
[**getNetworkInterfaceSamples**](NetworkInterfacesApi.md#getNetworkInterfaceSamples) | **GET** /v1/network-interfaces/{network_interface_id}/samples | 
[**listNetworkInterfaces**](NetworkInterfacesApi.md#listNetworkInterfaces) | **GET** /v1/network-interfaces/ | 

<a name="getNetworkInterface"></a>
# **getNetworkInterface**
> NetworkInterfaceResp getNetworkInterface(networkInterfaceId)



Get a network interface

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkInterfacesApi;

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

NetworkInterfacesApi apiInstance = new NetworkInterfacesApi();
Long networkInterfaceId = 789L; // Long | network interface id
try {
    NetworkInterfaceResp result = apiInstance.getNetworkInterface(networkInterfaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkInterfacesApi#getNetworkInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkInterfaceId** | **Long**| network interface id |

### Return type

[**NetworkInterfaceResp**](NetworkInterfaceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNetworkInterfaceSamples"></a>
# **getNetworkInterfaceSamples**
> NetworkInterfaceSamplesResp getNetworkInterfaceSamples(networkInterfaceId, durationBegin, durationEnd, period)



get a network interface&#x27;s Samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkInterfacesApi;

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

NetworkInterfacesApi apiInstance = new NetworkInterfacesApi();
Long networkInterfaceId = 789L; // Long | network interface id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    NetworkInterfaceSamplesResp result = apiInstance.getNetworkInterfaceSamples(networkInterfaceId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkInterfacesApi#getNetworkInterfaceSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkInterfaceId** | **Long**| network interface id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**NetworkInterfaceSamplesResp**](NetworkInterfaceSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNetworkInterfaces"></a>
# **listNetworkInterfaces**
> NetworkInterfacesResp listNetworkInterfaces(limit, offset, masterNetworkInterfaceId, hostId, role)



List network interfaces

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkInterfacesApi;

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

NetworkInterfacesApi apiInstance = new NetworkInterfacesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long masterNetworkInterfaceId = 789L; // Long | master network interface id
Long hostId = 789L; // Long | host id
String role = "role_example"; // String | network interface role
try {
    NetworkInterfacesResp result = apiInstance.listNetworkInterfaces(limit, offset, masterNetworkInterfaceId, hostId, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkInterfacesApi#listNetworkInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **masterNetworkInterfaceId** | **Long**| master network interface id | [optional]
 **hostId** | **Long**| host id | [optional]
 **role** | **String**| network interface role | [optional]

### Return type

[**NetworkInterfacesResp**](NetworkInterfacesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

