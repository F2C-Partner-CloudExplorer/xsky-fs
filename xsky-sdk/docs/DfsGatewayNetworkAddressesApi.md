# DfsGatewayNetworkAddressesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDfsGatewayNetworkAddress**](DfsGatewayNetworkAddressesApi.md#getDfsGatewayNetworkAddress) | **GET** /v1/dfs-gateway-network-addresses/{dfs_gateway_network_address_id} | 
[**listDfsGatewayNetworkAddresses**](DfsGatewayNetworkAddressesApi.md#listDfsGatewayNetworkAddresses) | **GET** /v1/dfs-gateway-network-addresses/ | 

<a name="getDfsGatewayNetworkAddress"></a>
# **getDfsGatewayNetworkAddress**
> DfsGatewayNetworkAddressResp getDfsGatewayNetworkAddress(dfsGatewayNetworkAddressId)



Get dfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayNetworkAddressesApi;

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

DfsGatewayNetworkAddressesApi apiInstance = new DfsGatewayNetworkAddressesApi();
Long dfsGatewayNetworkAddressId = 789L; // Long | gateway network address id
try {
    DfsGatewayNetworkAddressResp result = apiInstance.getDfsGatewayNetworkAddress(dfsGatewayNetworkAddressId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayNetworkAddressesApi#getDfsGatewayNetworkAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayNetworkAddressId** | **Long**| gateway network address id |

### Return type

[**DfsGatewayNetworkAddressResp**](DfsGatewayNetworkAddressResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGatewayNetworkAddresses"></a>
# **listDfsGatewayNetworkAddresses**
> DfsGatewayNetworkAddressesResp listDfsGatewayNetworkAddresses(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId)



List dfs gateway network addresses

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayNetworkAddressesApi;

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

DfsGatewayNetworkAddressesApi apiInstance = new DfsGatewayNetworkAddressesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
Long dfsGatewayZoneId = 789L; // Long | dfs gateway zone id
try {
    DfsGatewayNetworkAddressesResp result = apiInstance.listDfsGatewayNetworkAddresses(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayNetworkAddressesApi#listDfsGatewayNetworkAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsGatewayGroupId** | **Long**| dfs gateway group id | [optional]
 **dfsGatewayZoneId** | **Long**| dfs gateway zone id | [optional]

### Return type

[**DfsGatewayNetworkAddressesResp**](DfsGatewayNetworkAddressesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

