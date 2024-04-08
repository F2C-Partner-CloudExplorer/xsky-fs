# MetadataClustersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetadataServicesToCluster**](MetadataClustersApi.md#addMetadataServicesToCluster) | **POST** /v1/metadata-clusters/{metadata_cluster_id}:add-metadata-services | 
[**createMetadataCluster**](MetadataClustersApi.md#createMetadataCluster) | **POST** /v1/metadata-clusters/ | 
[**deleteMetadataCluster**](MetadataClustersApi.md#deleteMetadataCluster) | **DELETE** /v1/metadata-clusters/{metadata_cluster_id} | 
[**getMetadataCluster**](MetadataClustersApi.md#getMetadataCluster) | **GET** /v1/metadata-clusters/{metadata_cluster_id} | 
[**getMetadataClusterPredictions**](MetadataClustersApi.md#getMetadataClusterPredictions) | **GET** /v1/metadata-clusters/{metadata_cluster_id}/predictions | 
[**getMetadataClusterSamples**](MetadataClustersApi.md#getMetadataClusterSamples) | **GET** /v1/metadata-clusters/{metadata_cluster_id}/samples | 
[**listMetadataClusters**](MetadataClustersApi.md#listMetadataClusters) | **GET** /v1/metadata-clusters/ | 
[**removeMetadataServicesFromCluster**](MetadataClustersApi.md#removeMetadataServicesFromCluster) | **POST** /v1/metadata-clusters/{metadata_cluster_id}:remove-metadata-services | 
[**setMetadataClusterToStretched**](MetadataClustersApi.md#setMetadataClusterToStretched) | **PATCH** /v1/metadata-clusters/{metadata_cluster_id}:set-stretched | 
[**updateMetadataCluster**](MetadataClustersApi.md#updateMetadataCluster) | **PATCH** /v1/metadata-clusters/{metadata_cluster_id} | 
[**updatePrimaryDc**](MetadataClustersApi.md#updatePrimaryDc) | **PATCH** /v1/metadata-clusters/{metadata_cluster_id}:update-primary-dc | 

<a name="addMetadataServicesToCluster"></a>
# **addMetadataServicesToCluster**
> MetadataClusterResp addMetadataServicesToCluster(body, metadataClusterId)



Add metadata services to cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
MetadataClusterAddServicesReq body = new MetadataClusterAddServicesReq(); // MetadataClusterAddServicesReq | metadata services
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.addMetadataServicesToCluster(body, metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#addMetadataServicesToCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataClusterAddServicesReq**](MetadataClusterAddServicesReq.md)| metadata services |
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMetadataCluster"></a>
# **createMetadataCluster**
> MetadataClusterResp createMetadataCluster(body, clusterId)



Create metadata cluster on specific disk

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
MetadataClusterCreateReq body = new MetadataClusterCreateReq(); // MetadataClusterCreateReq | metadata cluster info
String clusterId = "clusterId_example"; // String | cluster id
try {
    MetadataClusterResp result = apiInstance.createMetadataCluster(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#createMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataClusterCreateReq**](MetadataClusterCreateReq.md)| metadata cluster info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetadataCluster"></a>
# **deleteMetadataCluster**
> MetadataClusterResp deleteMetadataCluster(metadataClusterId)



delete a metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.deleteMetadataCluster(metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#deleteMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataCluster"></a>
# **getMetadataCluster**
> MetadataClusterResp getMetadataCluster(metadataClusterId)



get a metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.getMetadataCluster(metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#getMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataClusterPredictions"></a>
# **getMetadataClusterPredictions**
> MetadataClusterPredictionsResp getMetadataClusterPredictions(metadataClusterId)



get a metadata cluster&#x27;s prediction

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterPredictionsResp result = apiInstance.getMetadataClusterPredictions(metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#getMetadataClusterPredictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterPredictionsResp**](MetadataClusterPredictionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetadataClusterSamples"></a>
# **getMetadataClusterSamples**
> MetadataClusterSamplesResp getMetadataClusterSamples(metadataClusterId, durationBegin, durationEnd, period)



get samples of a metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long metadataClusterId = 789L; // Long | metadata cluster id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    MetadataClusterSamplesResp result = apiInstance.getMetadataClusterSamples(metadataClusterId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#getMetadataClusterSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataClusterId** | **Long**| metadata cluster id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**MetadataClusterSamplesResp**](MetadataClusterSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMetadataClusters"></a>
# **listMetadataClusters**
> MetadataClustersResp listMetadataClusters(limit, offset, clusterId, hostId, metadataClusterId, q, sort)



List all metadata clusters in the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
Long hostId = 789L; // Long | host id
Long metadataClusterId = 789L; // Long | metadata cluster id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    MetadataClustersResp result = apiInstance.listMetadataClusters(limit, offset, clusterId, hostId, metadataClusterId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#listMetadataClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **hostId** | **Long**| host id | [optional]
 **metadataClusterId** | **Long**| metadata cluster id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**MetadataClustersResp**](MetadataClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeMetadataServicesFromCluster"></a>
# **removeMetadataServicesFromCluster**
> MetadataClusterResp removeMetadataServicesFromCluster(body, metadataClusterId)



Remove metadata services from cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
MetadataClusterRemoveServicesReq body = new MetadataClusterRemoveServicesReq(); // MetadataClusterRemoveServicesReq | metadata services
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.removeMetadataServicesFromCluster(body, metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#removeMetadataServicesFromCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataClusterRemoveServicesReq**](MetadataClusterRemoveServicesReq.md)| metadata services |
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMetadataClusterToStretched"></a>
# **setMetadataClusterToStretched**
> MetadataClusterResp setMetadataClusterToStretched(metadataClusterId)



set metadata cluster to stretched

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.setMetadataClusterToStretched(metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#setMetadataClusterToStretched");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMetadataCluster"></a>
# **updateMetadataCluster**
> MetadataClusterResp updateMetadataCluster(body, metadataClusterId)



update metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
MetadataClusterUpdateReq body = new MetadataClusterUpdateReq(); // MetadataClusterUpdateReq | metadata cluster info
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.updateMetadataCluster(body, metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#updateMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataClusterUpdateReq**](MetadataClusterUpdateReq.md)| metadata cluster info |
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePrimaryDc"></a>
# **updatePrimaryDc**
> MetadataClusterResp updatePrimaryDc(body, metadataClusterId)



update primary datacenter of metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MetadataClustersApi;

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

MetadataClustersApi apiInstance = new MetadataClustersApi();
MetadataClusterUpdatePrimaryDcReq body = new MetadataClusterUpdatePrimaryDcReq(); // MetadataClusterUpdatePrimaryDcReq | metadata cluster info
Long metadataClusterId = 789L; // Long | metadata cluster id
try {
    MetadataClusterResp result = apiInstance.updatePrimaryDc(body, metadataClusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetadataClustersApi#updatePrimaryDc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataClusterUpdatePrimaryDcReq**](MetadataClusterUpdatePrimaryDcReq.md)| metadata cluster info |
 **metadataClusterId** | **Long**| metadata cluster id |

### Return type

[**MetadataClusterResp**](MetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

