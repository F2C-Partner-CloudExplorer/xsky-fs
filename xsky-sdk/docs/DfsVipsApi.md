# DfsVipsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDfsVIP**](DfsVipsApi.md#getDfsVIP) | **GET** /v1/dfs-vips/{dfs_vip_id} | 
[**listDfsVIPs**](DfsVipsApi.md#listDfsVIPs) | **GET** /v1/dfs-vips/ | 
[**moveDfsVIP**](DfsVipsApi.md#moveDfsVIP) | **POST** /v1/dfs-vips/{dfs_vip_id} | 

<a name="getDfsVIP"></a>
# **getDfsVIP**
> DfsVIPResp getDfsVIP(dfsVipId)



Get dfs vip

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsVipsApi;

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

DfsVipsApi apiInstance = new DfsVipsApi();
Long dfsVipId = 789L; // Long | vip id
try {
    DfsVIPResp result = apiInstance.getDfsVIP(dfsVipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsVipsApi#getDfsVIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsVipId** | **Long**| vip id |

### Return type

[**DfsVIPResp**](DfsVIPResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsVIPs"></a>
# **listDfsVIPs**
> DfsVIPsResp listDfsVIPs(limit, offset, clusterId, dfsGatewayGroupId, dfsGatewayZoneId, primaryGatewayId)



List dfs vips

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsVipsApi;

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

DfsVipsApi apiInstance = new DfsVipsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long dfsGatewayGroupId = 789L; // Long | dfs vip group id
Long dfsGatewayZoneId = 789L; // Long | dfs gateway zone id
Long primaryGatewayId = 789L; // Long | primary gateway id
try {
    DfsVIPsResp result = apiInstance.listDfsVIPs(limit, offset, clusterId, dfsGatewayGroupId, dfsGatewayZoneId, primaryGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsVipsApi#listDfsVIPs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **dfsGatewayGroupId** | **Long**| dfs vip group id | [optional]
 **dfsGatewayZoneId** | **Long**| dfs gateway zone id | [optional]
 **primaryGatewayId** | **Long**| primary gateway id | [optional]

### Return type

[**DfsVIPsResp**](DfsVIPsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="moveDfsVIP"></a>
# **moveDfsVIP**
> DfsVIPResp moveDfsVIP(dfsVipId, body)



move vip to another dfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsVipsApi;

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

DfsVipsApi apiInstance = new DfsVipsApi();
Long dfsVipId = 789L; // Long | vip id
DfsVIPMoveReq body = new DfsVIPMoveReq(); // DfsVIPMoveReq | moving vip info
try {
    DfsVIPResp result = apiInstance.moveDfsVIP(dfsVipId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsVipsApi#moveDfsVIP");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsVipId** | **Long**| vip id |
 **body** | [**DfsVIPMoveReq**](DfsVIPMoveReq.md)| moving vip info | [optional]

### Return type

[**DfsVIPResp**](DfsVIPResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

