# OspMetadataClustersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPartitions**](OspMetadataClustersApi.md#addPartitions) | **POST** /v1/osp-metadata-clusters/{id}:add-partitions | 
[**createOspMetadataCluster**](OspMetadataClustersApi.md#createOspMetadataCluster) | **POST** /v1/osp-metadata-clusters/ | 
[**deleteOspMetadataCluster**](OspMetadataClustersApi.md#deleteOspMetadataCluster) | **DELETE** /v1/osp-metadata-clusters/{id} | 
[**getOspMetadataCluster**](OspMetadataClustersApi.md#getOspMetadataCluster) | **GET** /v1/osp-metadata-clusters/{id} | 
[**getOspMetadataClusterSamples**](OspMetadataClustersApi.md#getOspMetadataClusterSamples) | **GET** /v1/osp-metadata-clusters/{id}/samples | 
[**listOspMetadataClusters**](OspMetadataClustersApi.md#listOspMetadataClusters) | **GET** /v1/osp-metadata-clusters/ | 
[**removePartitions**](OspMetadataClustersApi.md#removePartitions) | **POST** /v1/osp-metadata-clusters/{id}:remove-partitions | 
[**setCoordinator**](OspMetadataClustersApi.md#setCoordinator) | **POST** /v1/osp-metadata-clusters/{id}:set-coordinator | 
[**setDeployMode**](OspMetadataClustersApi.md#setDeployMode) | **POST** /v1/osp-metadata-clusters/{id}:set-deploy-mode | 
[**setLogServices**](OspMetadataClustersApi.md#setLogServices) | **POST** /v1/osp-metadata-clusters/{id}:set-log-services | 
[**setMetadataServices**](OspMetadataClustersApi.md#setMetadataServices) | **POST** /v1/osp-metadata-clusters/{id}:set-metadata-services | 
[**setName**](OspMetadataClustersApi.md#setName) | **POST** /v1/osp-metadata-clusters/{id}:set-name | 
[**setPrimaryDc**](OspMetadataClustersApi.md#setPrimaryDc) | **POST** /v1/osp-metadata-clusters/{id}:set-primary-dc | 
[**setSecurityPolicy**](OspMetadataClustersApi.md#setSecurityPolicy) | **POST** /v1/osp-metadata-clusters/{id}:set-security-policy | 
[**setStatelessNum**](OspMetadataClustersApi.md#setStatelessNum) | **POST** /v1/osp-metadata-clusters/{id}:set-stateless-num | 
[**setStatelessServer**](OspMetadataClustersApi.md#setStatelessServer) | **POST** /v1/osp-metadata-clusters/{id}:set-stateless-server | 
[**upgradeOspMetadataCluster**](OspMetadataClustersApi.md#upgradeOspMetadataCluster) | **POST** /v1/osp-metadata-clusters/{id}:upgrade-service | 

<a name="addPartitions"></a>
# **addPartitions**
> OspMetadataClusterResp addPartitions(body, id)



add osp metadata cluster partitions

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.addPartitions(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#addPartitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOspMetadataCluster"></a>
# **createOspMetadataCluster**
> OspMetadataClusterResp createOspMetadataCluster(body)



Create new osp metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterCreateReq body = new OspMetadataClusterCreateReq(); // OspMetadataClusterCreateReq | osp metadata cluster info
try {
    OspMetadataClusterResp result = apiInstance.createOspMetadataCluster(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#createOspMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterCreateReq**](OspMetadataClusterCreateReq.md)| osp metadata cluster info |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOspMetadataCluster"></a>
# **deleteOspMetadataCluster**
> OspMetadataClusterResp deleteOspMetadataCluster(id)



Delete osp metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.deleteOspMetadataCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#deleteOspMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspMetadataCluster"></a>
# **getOspMetadataCluster**
> OspMetadataClusterResp getOspMetadataCluster(id)



Returns info a osp metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.getOspMetadataCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#getOspMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOspMetadataClusterSamples"></a>
# **getOspMetadataClusterSamples**
> OspMetadataClusterSamplesResp getOspMetadataClusterSamples(id, durationBegin, durationEnd, period)



Get osp metadata cluster&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
Long id = 789L; // Long | osp metadata cluster id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspMetadataClusterSamplesResp result = apiInstance.getOspMetadataClusterSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#getOspMetadataClusterSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata cluster id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspMetadataClusterSamplesResp**](OspMetadataClusterSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOspMetadataClusters"></a>
# **listOspMetadataClusters**
> OspMetadataClustersResp listOspMetadataClusters(limit, offset, clusterId, objectStorageId)



Lists osp metadata clusters

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long clusterId = 789L; // Long | The id of osp metadata cluster's cluster
Long objectStorageId = 789L; // Long | The id of osp metadata cluster's object storage
try {
    OspMetadataClustersResp result = apiInstance.listOspMetadataClusters(limit, offset, clusterId, objectStorageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#listOspMetadataClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **Long**| The id of osp metadata cluster&#x27;s cluster | [optional]
 **objectStorageId** | **Long**| The id of osp metadata cluster&#x27;s object storage | [optional]

### Return type

[**OspMetadataClustersResp**](OspMetadataClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removePartitions"></a>
# **removePartitions**
> OspMetadataClusterResp removePartitions(body, id)



remove osp metadata cluster partitions

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.removePartitions(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#removePartitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setCoordinator"></a>
# **setCoordinator**
> OspMetadataClusterResp setCoordinator(body, id)



set osp metadata cluster coordinator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setCoordinator(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setCoordinator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDeployMode"></a>
# **setDeployMode**
> OspMetadataClusterResp setDeployMode(body, id)



set osp metadata cluster deploy mode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setDeployMode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setDeployMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setLogServices"></a>
# **setLogServices**
> OspMetadataClusterResp setLogServices(body, id)



set osp metadata cluster log services

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setLogServices(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setLogServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMetadataServices"></a>
# **setMetadataServices**
> OspMetadataClusterResp setMetadataServices(body, id)



set osp metadata cluster metadata services

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setMetadataServices(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setMetadataServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setName"></a>
# **setName**
> OspMetadataClusterResp setName(body, id)



set osp metadata cluster name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterSetNameReq body = new OspMetadataClusterSetNameReq(); // OspMetadataClusterSetNameReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setName(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterSetNameReq**](OspMetadataClusterSetNameReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setPrimaryDc"></a>
# **setPrimaryDc**
> OspMetadataClusterResp setPrimaryDc(body, id)



set osp metadata cluster primary data center

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterSetStatelessNumReq body = new OspMetadataClusterSetStatelessNumReq(); // OspMetadataClusterSetStatelessNumReq | osp metadata cluster primary data center info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setPrimaryDc(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setPrimaryDc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterSetStatelessNumReq**](OspMetadataClusterSetStatelessNumReq.md)| osp metadata cluster primary data center info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSecurityPolicy"></a>
# **setSecurityPolicy**
> OspMetadataClusterResp setSecurityPolicy(body, id)



set osp metadata cluster security policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterUpdateReq body = new OspMetadataClusterUpdateReq(); // OspMetadataClusterUpdateReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setSecurityPolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setSecurityPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterUpdateReq**](OspMetadataClusterUpdateReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setStatelessNum"></a>
# **setStatelessNum**
> OspMetadataClusterResp setStatelessNum(body, id)



set osp metadata cluster Stateless server num

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterSetStatelessNumReq body = new OspMetadataClusterSetStatelessNumReq(); // OspMetadataClusterSetStatelessNumReq | osp metadata cluster transaction roles info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setStatelessNum(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setStatelessNum");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterSetStatelessNumReq**](OspMetadataClusterSetStatelessNumReq.md)| osp metadata cluster transaction roles info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setStatelessServer"></a>
# **setStatelessServer**
> OspMetadataClusterResp setStatelessServer(body, id)



Set osp metadata cluster stateless server

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
OspMetadataClusterSetStatelessServerReq body = new OspMetadataClusterSetStatelessServerReq(); // OspMetadataClusterSetStatelessServerReq | osp metadata cluster info
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.setStatelessServer(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#setStatelessServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspMetadataClusterSetStatelessServerReq**](OspMetadataClusterSetStatelessServerReq.md)| osp metadata cluster info |
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="upgradeOspMetadataCluster"></a>
# **upgradeOspMetadataCluster**
> OspMetadataClusterResp upgradeOspMetadataCluster(id)



upgrade osp metadata cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.OspMetadataClustersApi;

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

OspMetadataClustersApi apiInstance = new OspMetadataClustersApi();
Long id = 789L; // Long | osp metadata cluster id
try {
    OspMetadataClusterResp result = apiInstance.upgradeOspMetadataCluster(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OspMetadataClustersApi#upgradeOspMetadataCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| osp metadata cluster id |

### Return type

[**OspMetadataClusterResp**](OspMetadataClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

