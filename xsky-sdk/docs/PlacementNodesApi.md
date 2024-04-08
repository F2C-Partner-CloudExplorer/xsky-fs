# PlacementNodesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPlacementNode**](PlacementNodesApi.md#createPlacementNode) | **POST** /v1/placement-nodes/ | 
[**deletePlacementNode**](PlacementNodesApi.md#deletePlacementNode) | **DELETE** /v1/placement-nodes/{placement_node_id} | 
[**getPlacementNode**](PlacementNodesApi.md#getPlacementNode) | **GET** /v1/placement-nodes/{placement_node_id} | 
[**getPlacementNodeTopology**](PlacementNodesApi.md#getPlacementNodeTopology) | **GET** /v1/placement-nodes/{placement_node_id}/topology | 
[**getTopologyFromOsds**](PlacementNodesApi.md#getTopologyFromOsds) | **POST** /v1/placement-nodes/:topology-from-osd | 
[**listPlacementNodes**](PlacementNodesApi.md#listPlacementNodes) | **GET** /v1/placement-nodes/ | 
[**updatePlacementNode**](PlacementNodesApi.md#updatePlacementNode) | **PATCH** /v1/placement-nodes/{placement_node_id} | 

<a name="createPlacementNode"></a>
# **createPlacementNode**
> PlacementNodeResp createPlacementNode(body)



Create placement node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
PlacementNodeCreateReq body = new PlacementNodeCreateReq(); // PlacementNodeCreateReq | placement node info
try {
    PlacementNodeResp result = apiInstance.createPlacementNode(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#createPlacementNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlacementNodeCreateReq**](PlacementNodeCreateReq.md)| placement node info |

### Return type

[**PlacementNodeResp**](PlacementNodeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePlacementNode"></a>
# **deletePlacementNode**
> deletePlacementNode(placementNodeId)



delete placement node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
Long placementNodeId = 789L; // Long | placement node id
try {
    apiInstance.deletePlacementNode(placementNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#deletePlacementNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placementNodeId** | **Long**| placement node id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPlacementNode"></a>
# **getPlacementNode**
> PlacementNodeResp getPlacementNode(placementNodeId)



Get placement node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
Long placementNodeId = 789L; // Long | placement node id
try {
    PlacementNodeResp result = apiInstance.getPlacementNode(placementNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#getPlacementNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placementNodeId** | **Long**| placement node id |

### Return type

[**PlacementNodeResp**](PlacementNodeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlacementNodeTopology"></a>
# **getPlacementNodeTopology**
> PlacementNodeTopologyResp getPlacementNodeTopology(placementNodeId, clusterId, osdType, osdRole, withCompound, withHybrid)



Get subtree topology of placement node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
Long placementNodeId = 789L; // Long | placement node id
String clusterId = "clusterId_example"; // String | cluster id
String osdType = "osdType_example"; // String | osd type
String osdRole = "osdRole_example"; // String | osd role
Boolean withCompound = true; // Boolean | with compound osd
Boolean withHybrid = true; // Boolean | with hybrid osd
try {
    PlacementNodeTopologyResp result = apiInstance.getPlacementNodeTopology(placementNodeId, clusterId, osdType, osdRole, withCompound, withHybrid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#getPlacementNodeTopology");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **placementNodeId** | **Long**| placement node id |
 **clusterId** | **String**| cluster id | [optional]
 **osdType** | **String**| osd type | [optional]
 **osdRole** | **String**| osd role | [optional]
 **withCompound** | **Boolean**| with compound osd | [optional]
 **withHybrid** | **Boolean**| with hybrid osd | [optional]

### Return type

[**PlacementNodeTopologyResp**](PlacementNodeTopologyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopologyFromOsds"></a>
# **getTopologyFromOsds**
> PlacementNodeTopologyResp getTopologyFromOsds(body)



Get topology from osds

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
TopologyFromOsdReq body = new TopologyFromOsdReq(); // TopologyFromOsdReq | osds
try {
    PlacementNodeTopologyResp result = apiInstance.getTopologyFromOsds(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#getTopologyFromOsds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TopologyFromOsdReq**](TopologyFromOsdReq.md)| osds |

### Return type

[**PlacementNodeTopologyResp**](PlacementNodeTopologyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPlacementNodes"></a>
# **listPlacementNodes**
> PlacementNodesResp listPlacementNodes(limit, offset, type, parentId)



List placement nodes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String type = "type_example"; // String | filter placement nodes by type
Long parentId = 789L; // Long | filter placement nodes by parent
try {
    PlacementNodesResp result = apiInstance.listPlacementNodes(limit, offset, type, parentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#listPlacementNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **type** | **String**| filter placement nodes by type | [optional]
 **parentId** | **Long**| filter placement nodes by parent | [optional]

### Return type

[**PlacementNodesResp**](PlacementNodesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePlacementNode"></a>
# **updatePlacementNode**
> PlacementNodeResp updatePlacementNode(body, placementNodeId)



update placement node

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.PlacementNodesApi;

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

PlacementNodesApi apiInstance = new PlacementNodesApi();
PlacementNodeUpdateReq body = new PlacementNodeUpdateReq(); // PlacementNodeUpdateReq | the placement node info
Long placementNodeId = 789L; // Long | the placement node id
try {
    PlacementNodeResp result = apiInstance.updatePlacementNode(body, placementNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacementNodesApi#updatePlacementNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PlacementNodeUpdateReq**](PlacementNodeUpdateReq.md)| the placement node info |
 **placementNodeId** | **Long**| the placement node id |

### Return type

[**PlacementNodeResp**](PlacementNodeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

