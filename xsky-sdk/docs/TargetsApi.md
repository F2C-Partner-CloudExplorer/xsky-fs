# TargetsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTargetGatewayIPs**](TargetsApi.md#addTargetGatewayIPs) | **POST** /v1/targets/{target_id}:add-gateway-ips | 
[**createTarget**](TargetsApi.md#createTarget) | **POST** /v1/targets/ | 
[**deleteTarget**](TargetsApi.md#deleteTarget) | **DELETE** /v1/targets/{target_id} | 
[**listTargets**](TargetsApi.md#listTargets) | **GET** /v1/targets/ | 

<a name="addTargetGatewayIPs"></a>
# **addTargetGatewayIPs**
> TargetResp addTargetGatewayIPs(body, targetId)



Add gateway ips to target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TargetsApi;

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

TargetsApi apiInstance = new TargetsApi();
TargetAddGatewayIPsReq body = new TargetAddGatewayIPsReq(); // TargetAddGatewayIPsReq | gateway ips info
Long targetId = 789L; // Long | target id
try {
    TargetResp result = apiInstance.addTargetGatewayIPs(body, targetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#addTargetGatewayIPs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TargetAddGatewayIPsReq**](TargetAddGatewayIPsReq.md)| gateway ips info |
 **targetId** | **Long**| target id |

### Return type

[**TargetResp**](TargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTarget"></a>
# **createTarget**
> TargetResp createTarget(body)



Create target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TargetsApi;

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

TargetsApi apiInstance = new TargetsApi();
TargetCreateReq body = new TargetCreateReq(); // TargetCreateReq | target info
try {
    TargetResp result = apiInstance.createTarget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#createTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TargetCreateReq**](TargetCreateReq.md)| target info |

### Return type

[**TargetResp**](TargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTarget"></a>
# **deleteTarget**
> TargetResp deleteTarget(targetId, force)



delete target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TargetsApi;

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

TargetsApi apiInstance = new TargetsApi();
Long targetId = 789L; // Long | target id
Boolean force = true; // Boolean | force delete or not
try {
    TargetResp result = apiInstance.deleteTarget(targetId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#deleteTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetId** | **Long**| target id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**TargetResp**](TargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTargets"></a>
# **listTargets**
> TargetsResp listTargets(limit, offset, isFetchLunInfo, queryDepth, clusterId, hostId, accessPathId, q, sort)



List all targets in the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.TargetsApi;

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

TargetsApi apiInstance = new TargetsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Boolean isFetchLunInfo = true; // Boolean | whether to fetch lun info from target
Long queryDepth = 789L; // Long | query depth
String clusterId = "clusterId_example"; // String | cluster id
Long hostId = 789L; // Long | host id
Long accessPathId = 789L; // Long | access path id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    TargetsResp result = apiInstance.listTargets(limit, offset, isFetchLunInfo, queryDepth, clusterId, hostId, accessPathId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TargetsApi#listTargets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **isFetchLunInfo** | **Boolean**| whether to fetch lun info from target | [optional]
 **queryDepth** | **Long**| query depth | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **hostId** | **Long**| host id | [optional]
 **accessPathId** | **Long**| access path id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**TargetsResp**](TargetsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

