# RemoteClustersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRemoteCluster**](RemoteClustersApi.md#createRemoteCluster) | **POST** /v1/remote-clusters/ | 
[**deleteRemoteCluster**](RemoteClustersApi.md#deleteRemoteCluster) | **DELETE** /v1/remote-clusters/{cluster_id} | 
[**getRemoteCluster**](RemoteClustersApi.md#getRemoteCluster) | **GET** /v1/remote-clusters/{cluster_id} | 
[**listRemoteClusters**](RemoteClustersApi.md#listRemoteClusters) | **GET** /v1/remote-clusters/ | 
[**updateRemoteCluster**](RemoteClustersApi.md#updateRemoteCluster) | **PATCH** /v1/remote-clusters/{cluster_id} | 

<a name="createRemoteCluster"></a>
# **createRemoteCluster**
> RemoteClusterResp createRemoteCluster(body)



Create a remote cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RemoteClustersApi;

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

RemoteClustersApi apiInstance = new RemoteClustersApi();
RemoteClusterCreateReq body = new RemoteClusterCreateReq(); // RemoteClusterCreateReq | remote cluster info
try {
    RemoteClusterResp result = apiInstance.createRemoteCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteClustersApi#createRemoteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteClusterCreateReq**](RemoteClusterCreateReq.md)| remote cluster info |

### Return type

[**RemoteClusterResp**](RemoteClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRemoteCluster"></a>
# **deleteRemoteCluster**
> RemoteClusterResp deleteRemoteCluster(clusterId)



Delete a remote cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RemoteClustersApi;

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

RemoteClustersApi apiInstance = new RemoteClustersApi();
Long clusterId = 789L; // Long | remote cluster id
try {
    RemoteClusterResp result = apiInstance.deleteRemoteCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteClustersApi#deleteRemoteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Long**| remote cluster id |

### Return type

[**RemoteClusterResp**](RemoteClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRemoteCluster"></a>
# **getRemoteCluster**
> RemoteClusterResp getRemoteCluster(clusterId)



Get remote cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RemoteClustersApi;

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

RemoteClustersApi apiInstance = new RemoteClustersApi();
Long clusterId = 789L; // Long | remote cluster id
try {
    RemoteClusterResp result = apiInstance.getRemoteCluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteClustersApi#getRemoteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **Long**| remote cluster id |

### Return type

[**RemoteClusterResp**](RemoteClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRemoteClusters"></a>
# **listRemoteClusters**
> RemoteClustersResp listRemoteClusters(limit, offset, q, sort, fsId)



List remote clusters

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RemoteClustersApi;

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

RemoteClustersApi apiInstance = new RemoteClustersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String fsId = "fsId_example"; // String | fsid of cluster
try {
    RemoteClustersResp result = apiInstance.listRemoteClusters(limit, offset, q, sort, fsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteClustersApi#listRemoteClusters");
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
 **fsId** | **String**| fsid of cluster | [optional]

### Return type

[**RemoteClustersResp**](RemoteClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRemoteCluster"></a>
# **updateRemoteCluster**
> RemoteClusterResp updateRemoteCluster(body, clusterId)



Update a remote cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.RemoteClustersApi;

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

RemoteClustersApi apiInstance = new RemoteClustersApi();
RemoteClusterUpdateReq body = new RemoteClusterUpdateReq(); // RemoteClusterUpdateReq | remote cluster info
Long clusterId = 789L; // Long | remote cluster id
try {
    RemoteClusterResp result = apiInstance.updateRemoteCluster(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemoteClustersApi#updateRemoteCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteClusterUpdateReq**](RemoteClusterUpdateReq.md)| remote cluster info |
 **clusterId** | **Long**| remote cluster id |

### Return type

[**RemoteClusterResp**](RemoteClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

