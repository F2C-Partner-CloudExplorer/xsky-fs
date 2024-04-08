# NetworkAddressesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkAddress**](NetworkAddressesApi.md#getNetworkAddress) | **GET** /v1/network-addresses/{network_address_id} | 
[**listNetworkAddresses**](NetworkAddressesApi.md#listNetworkAddresses) | **GET** /v1/network-addresses/ | 

<a name="getNetworkAddress"></a>
# **getNetworkAddress**
> NetworkAddressResp getNetworkAddress(networkAddressId)



Get a network address

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkAddressesApi;

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

NetworkAddressesApi apiInstance = new NetworkAddressesApi();
Long networkAddressId = 789L; // Long | network address id
try {
    NetworkAddressResp result = apiInstance.getNetworkAddress(networkAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkAddressesApi#getNetworkAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkAddressId** | **Long**| network address id |

### Return type

[**NetworkAddressResp**](NetworkAddressResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNetworkAddresses"></a>
# **listNetworkAddresses**
> NetworkAddressesResp listNetworkAddresses(limit, offset, networkInterfaceId, hostId, role, vipGroupId)



List network addresses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.NetworkAddressesApi;

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

NetworkAddressesApi apiInstance = new NetworkAddressesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long networkInterfaceId = 789L; // Long | network interface id
Long hostId = 789L; // Long | host id
String role = "role_example"; // String | network address role
Long vipGroupId = 789L; // Long | vip group id
try {
    NetworkAddressesResp result = apiInstance.listNetworkAddresses(limit, offset, networkInterfaceId, hostId, role, vipGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkAddressesApi#listNetworkAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **networkInterfaceId** | **Long**| network interface id | [optional]
 **hostId** | **Long**| host id | [optional]
 **role** | **String**| network address role | [optional]
 **vipGroupId** | **Long**| vip group id | [optional]

### Return type

[**NetworkAddressesResp**](NetworkAddressesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

