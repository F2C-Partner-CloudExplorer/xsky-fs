# ClustersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clusterAddHosts**](ClustersApi.md#clusterAddHosts) | **POST** /v1/clusters/{cluster_id}:add-hosts | 
[**clusterRemoveHosts**](ClustersApi.md#clusterRemoveHosts) | **POST** /v1/clusters/{cluster_id}:remove-hosts | 
[**clusterSkipAction**](ClustersApi.md#clusterSkipAction) | **PATCH** /v1/clusters/{cluster_id}::action | 
[**createCluster**](ClustersApi.md#createCluster) | **POST** /v1/clusters/ | 
[**deleteCluster**](ClustersApi.md#deleteCluster) | **DELETE** /v1/clusters/{cluster_id} | 
[**getOspClusterOverview**](ClustersApi.md#getOspClusterOverview) | **GET** /v1/clusters/{cluster_id}/osp-overview | 
[**listClusters**](ClustersApi.md#listClusters) | **GET** /v1/clusters/ | 
[**updateClusters**](ClustersApi.md#updateClusters) | **PATCH** /v1/clusters/{cluster_id} | 

<a name="clusterAddHosts"></a>
# **clusterAddHosts**
> ClusterResp clusterAddHosts(body, clusterId)



add hosts to a cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
ClusterAddHostsReq body = new ClusterAddHostsReq(); // ClusterAddHostsReq | hosts info
Long clusterId = 789L; // Long | cluster id
try {
    ClusterResp result = apiInstance.clusterAddHosts(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#clusterAddHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterAddHostsReq**](ClusterAddHostsReq.md)| hosts info |
 **clusterId** | **Long**| cluster id |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterRemoveHosts"></a>
# **clusterRemoveHosts**
> ClusterResp clusterRemoveHosts(body, clusterId)



remove hosts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
ClusterRemoveHostsReq body = new ClusterRemoveHostsReq(); // ClusterRemoveHostsReq | host ids
Long clusterId = 789L; // Long | cluster id
try {
    ClusterResp result = apiInstance.clusterRemoveHosts(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#clusterRemoveHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterRemoveHostsReq**](ClusterRemoveHostsReq.md)| host ids |
 **clusterId** | **Long**| cluster id |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clusterSkipAction"></a>
# **clusterSkipAction**
> ClusterResp clusterSkipAction(body, clusterId)



skip initial action

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
ClusterAddHostsReq body = new ClusterAddHostsReq(); // ClusterAddHostsReq | hosts info
Long clusterId = 789L; // Long | cluster id
try {
    ClusterResp result = apiInstance.clusterSkipAction(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#clusterSkipAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterAddHostsReq**](ClusterAddHostsReq.md)| hosts info |
 **clusterId** | **Long**| cluster id |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCluster"></a>
# **createCluster**
> ClusterResp createCluster(body)



Create cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
ClusterCreateReq body = new ClusterCreateReq(); // ClusterCreateReq | cluster info
try {
    ClusterResp result = apiInstance.createCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#createCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterCreateReq**](ClusterCreateReq.md)| cluster info |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCluster"></a>
# **deleteCluster**
> ClusterResp deleteCluster(clusterId)



Delete a cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
Long clusterId = 789L; // Long | cluster id
try {
    ClusterResp result = apiInstance.deleteCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#deleteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Long**| cluster id |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspClusterOverview"></a>
# **getOspClusterOverview**
> OspClusterOverviewResp getOspClusterOverview(clusterId)



returns osp cluster overview

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
Long clusterId = 789L; // Long | cluster id
try {
    OspClusterOverviewResp result = apiInstance.getOspClusterOverview(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#getOspClusterOverview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Long**| cluster id |

### Return type

[**OspClusterOverviewResp**](OspClusterOverviewResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClusters"></a>
# **listClusters**
> ClustersResp listClusters(limit, offset, q, sort, type)



List clusters

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String type = "type_example"; // String | cluster type
try {
    ClustersResp result = apiInstance.listClusters(limit, offset, q, sort, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#listClusters");
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
 **type** | **String**| cluster type | [optional]

### Return type

[**ClustersResp**](ClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClusters"></a>
# **updateClusters**
> ClusterResp updateClusters(body, clusterId)



update cluster info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClustersApi;

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

ClustersApi apiInstance = new ClustersApi();
ClustersUpdateReq body = new ClustersUpdateReq(); // ClustersUpdateReq | cluster info
Long clusterId = 789L; // Long | cluster id
try {
    ClusterResp result = apiInstance.updateClusters(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClustersApi#updateClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClustersUpdateReq**](ClustersUpdateReq.md)| cluster info |
 **clusterId** | **Long**| cluster id |

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

