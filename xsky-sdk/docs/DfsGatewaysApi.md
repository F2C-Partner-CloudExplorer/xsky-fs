# DfsGatewaysApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDfsGateway**](DfsGatewaysApi.md#getDfsGateway) | **GET** /v1/dfs-gateways/{dfs_gateway_id} | 
[**getDfsGatewaySamples**](DfsGatewaysApi.md#getDfsGatewaySamples) | **GET** /v1/dfs-gateways/{dfs_gateway_id}/samples | 
[**listDfsGatewayConnections**](DfsGatewaysApi.md#listDfsGatewayConnections) | **GET** /v1/dfs-gateways/{dfs_gateway_id}/connections | 
[**listDfsGateways**](DfsGatewaysApi.md#listDfsGateways) | **GET** /v1/dfs-gateways/ | 

<a name="getDfsGateway"></a>
# **getDfsGateway**
> DfsGatewayResp getDfsGateway(dfsGatewayId)



Get dfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewaysApi;

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

DfsGatewaysApi apiInstance = new DfsGatewaysApi();
Long dfsGatewayId = 789L; // Long | gateway id
try {
    DfsGatewayResp result = apiInstance.getDfsGateway(dfsGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewaysApi#getDfsGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayId** | **Long**| gateway id |

### Return type

[**DfsGatewayResp**](DfsGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewaySamples"></a>
# **getDfsGatewaySamples**
> DfsGatewaySamplesResp getDfsGatewaySamples(dfsGatewayId, durationBegin, durationEnd, period)



get a dfs gateway&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewaysApi;

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

DfsGatewaysApi apiInstance = new DfsGatewaysApi();
Long dfsGatewayId = 789L; // Long | dfs gateway id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsGatewaySamplesResp result = apiInstance.getDfsGatewaySamples(dfsGatewayId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewaysApi#getDfsGatewaySamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayId** | **Long**| dfs gateway id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsGatewaySamplesResp**](DfsGatewaySamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGatewayConnections"></a>
# **listDfsGatewayConnections**
> DfsGatewayConnectionsResp listDfsGatewayConnections(dfsGatewayId, types)



list client connections of dfs gateway

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewaysApi;

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

DfsGatewaysApi apiInstance = new DfsGatewaysApi();
Long dfsGatewayId = 789L; // Long | dfs gateway id
String types = "types_example"; // String | share types, value is smb|nfs|ftp|s3|hdfs
try {
    DfsGatewayConnectionsResp result = apiInstance.listDfsGatewayConnections(dfsGatewayId, types);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewaysApi#listDfsGatewayConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayId** | **Long**| dfs gateway id |
 **types** | **String**| share types, value is smb|nfs|ftp|s3|hdfs | [optional]

### Return type

[**DfsGatewayConnectionsResp**](DfsGatewayConnectionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGateways"></a>
# **listDfsGateways**
> DfsGatewaysResp listDfsGateways(limit, offset, q, sort, clusterId, dfsGatewayGroupId)



List dfs gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewaysApi;

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

DfsGatewaysApi apiInstance = new DfsGatewaysApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long dfsGatewayGroupId = 789L; // Long | dfs gateway group id
try {
    DfsGatewaysResp result = apiInstance.listDfsGateways(limit, offset, q, sort, clusterId, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewaysApi#listDfsGateways");
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

### Return type

[**DfsGatewaysResp**](DfsGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

