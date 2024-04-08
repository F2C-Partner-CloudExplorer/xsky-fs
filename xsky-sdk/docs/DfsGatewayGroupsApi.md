# DfsGatewayGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsGateways**](DfsGatewayGroupsApi.md#addDfsGateways) | **POST** /v1/dfs-gateway-groups/{dfs_gateway_group_id}:add-gateways | 
[**createDfsGatewayGroup**](DfsGatewayGroupsApi.md#createDfsGatewayGroup) | **POST** /v1/dfs-gateway-groups/ | 
[**deleteDfsGatewayGroup**](DfsGatewayGroupsApi.md#deleteDfsGatewayGroup) | **DELETE** /v1/dfs-gateway-groups/{dfs_gateway_group_id} | 
[**getDfsGatewayGroup**](DfsGatewayGroupsApi.md#getDfsGatewayGroup) | **GET** /v1/dfs-gateway-groups/{dfs_gateway_group_id} | 
[**listDfsGatewayGroups**](DfsGatewayGroupsApi.md#listDfsGatewayGroups) | **GET** /v1/dfs-gateway-groups/ | 
[**rebuildDfsGateways**](DfsGatewayGroupsApi.md#rebuildDfsGateways) | **POST** /v1/dfs-gateway-groups/{dfs_gateway_group_id}:rebuild-gateways | 
[**removeDfsGateways**](DfsGatewayGroupsApi.md#removeDfsGateways) | **POST** /v1/dfs-gateway-groups/{dfs_gateway_group_id}:remove-gateways | 
[**updateDfsGatewayGroup**](DfsGatewayGroupsApi.md#updateDfsGatewayGroup) | **PATCH** /v1/dfs-gateway-groups/{dfs_gateway_group_id} | 
[**updateDfsGatewayGroupTypes**](DfsGatewayGroupsApi.md#updateDfsGatewayGroupTypes) | **POST** /v1/dfs-gateway-groups/{dfs_gateway_group_id}:update-types | 
[**updateDfsGatewayGroupVIPs**](DfsGatewayGroupsApi.md#updateDfsGatewayGroupVIPs) | **POST** /v1/dfs-gateway-groups/{dfs_gateway_group_id}:update-vips | 

<a name="addDfsGateways"></a>
# **addDfsGateways**
> DfsGatewayGroupResp addDfsGateways(body, dfsGatewayGroupId)



add dfs gateways

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupAddGatewaysReq body = new DfsGatewayGroupAddGatewaysReq(); // DfsGatewayGroupAddGatewaysReq | gateways info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.addDfsGateways(body, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#addDfsGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupAddGatewaysReq**](DfsGatewayGroupAddGatewaysReq.md)| gateways info |
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsGatewayGroup"></a>
# **createDfsGatewayGroup**
> DfsGatewayGroupResp createDfsGatewayGroup(body, clusterId)



Create dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupCreateReq body = new DfsGatewayGroupCreateReq(); // DfsGatewayGroupCreateReq | gateway group info
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsGatewayGroupResp result = apiInstance.createDfsGatewayGroup(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#createDfsGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupCreateReq**](DfsGatewayGroupCreateReq.md)| gateway group info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsGatewayGroup"></a>
# **deleteDfsGatewayGroup**
> DfsGatewayGroupResp deleteDfsGatewayGroup(dfsGatewayGroupId, force)



delete dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
Long dfsGatewayGroupId = 789L; // Long | gateway group id
Boolean force = true; // Boolean | force delete or not
try {
    DfsGatewayGroupResp result = apiInstance.deleteDfsGatewayGroup(dfsGatewayGroupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#deleteDfsGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayGroupId** | **Long**| gateway group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsGatewayGroup"></a>
# **getDfsGatewayGroup**
> DfsGatewayGroupResp getDfsGatewayGroup(dfsGatewayGroupId)



Get dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.getDfsGatewayGroup(dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#getDfsGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsGatewayGroups"></a>
# **listDfsGatewayGroups**
> DfsGatewayGroupsResp listDfsGatewayGroups(limit, offset, clusterId, type, security, q, sort)



List dfs gateway groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String type = "type_example"; // String | type of dfs gateway group
String security = "security_example"; // String | security of dfs gateway group
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsGatewayGroupsResp result = apiInstance.listDfsGatewayGroups(limit, offset, clusterId, type, security, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#listDfsGatewayGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **type** | **String**| type of dfs gateway group | [optional]
 **security** | **String**| security of dfs gateway group | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsGatewayGroupsResp**](DfsGatewayGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rebuildDfsGateways"></a>
# **rebuildDfsGateways**
> DfsGatewayGroupResp rebuildDfsGateways(body, dfsGatewayGroupId)



rebuild gateways in gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupRebuildGatewaysReq body = new DfsGatewayGroupRebuildGatewaysReq(); // DfsGatewayGroupRebuildGatewaysReq | gateways info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.rebuildDfsGateways(body, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#rebuildDfsGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupRebuildGatewaysReq**](DfsGatewayGroupRebuildGatewaysReq.md)| gateways info |
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDfsGateways"></a>
# **removeDfsGateways**
> DfsGatewayGroupResp removeDfsGateways(body, dfsGatewayGroupId, force)



remove gateways from gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupRemoveGatewaysReq body = new DfsGatewayGroupRemoveGatewaysReq(); // DfsGatewayGroupRemoveGatewaysReq | gateways info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
Boolean force = true; // Boolean | force delete or not
try {
    DfsGatewayGroupResp result = apiInstance.removeDfsGateways(body, dfsGatewayGroupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#removeDfsGateways");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupRemoveGatewaysReq**](DfsGatewayGroupRemoveGatewaysReq.md)| gateways info |
 **dfsGatewayGroupId** | **Long**| gateway group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsGatewayGroup"></a>
# **updateDfsGatewayGroup**
> DfsGatewayGroupResp updateDfsGatewayGroup(body, dfsGatewayGroupId)



Update dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupUpdateReq body = new DfsGatewayGroupUpdateReq(); // DfsGatewayGroupUpdateReq | gateway group info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.updateDfsGatewayGroup(body, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#updateDfsGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupUpdateReq**](DfsGatewayGroupUpdateReq.md)| gateway group info |
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsGatewayGroupTypes"></a>
# **updateDfsGatewayGroupTypes**
> DfsGatewayGroupResp updateDfsGatewayGroupTypes(body, dfsGatewayGroupId)



Update protocal types of dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupUpdateTypesReq body = new DfsGatewayGroupUpdateTypesReq(); // DfsGatewayGroupUpdateTypesReq | gateway group info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.updateDfsGatewayGroupTypes(body, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#updateDfsGatewayGroupTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupUpdateTypesReq**](DfsGatewayGroupUpdateTypesReq.md)| gateway group info |
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsGatewayGroupVIPs"></a>
# **updateDfsGatewayGroupVIPs**
> DfsGatewayGroupResp updateDfsGatewayGroupVIPs(body, dfsGatewayGroupId)



Update VIPs of dfs gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsGatewayGroupsApi;

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

DfsGatewayGroupsApi apiInstance = new DfsGatewayGroupsApi();
DfsGatewayGroupUpdateVIPsReq body = new DfsGatewayGroupUpdateVIPsReq(); // DfsGatewayGroupUpdateVIPsReq | gateway group info
Long dfsGatewayGroupId = 789L; // Long | gateway group id
try {
    DfsGatewayGroupResp result = apiInstance.updateDfsGatewayGroupVIPs(body, dfsGatewayGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsGatewayGroupsApi#updateDfsGatewayGroupVIPs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsGatewayGroupUpdateVIPsReq**](DfsGatewayGroupUpdateVIPsReq.md)| gateway group info |
 **dfsGatewayGroupId** | **Long**| gateway group id |

### Return type

[**DfsGatewayGroupResp**](DfsGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

