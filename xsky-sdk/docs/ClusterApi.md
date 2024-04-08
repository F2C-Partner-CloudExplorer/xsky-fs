# ClusterApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bootNode**](ClusterApi.md#bootNode) | **GET** /v1/cluster/bootnode | 
[**cluster**](ClusterApi.md#cluster) | **GET** /v1/cluster/ | 
[**commitMasterSwitching**](ClusterApi.md#commitMasterSwitching) | **POST** /v1/cluster/object-storage:commit-master-switching | 
[**deleteObjectStorage**](ClusterApi.md#deleteObjectStorage) | **DELETE** /v1/cluster/object-storage | 
[**download**](ClusterApi.md#download) | **GET** /v1/cluster/download | 
[**enableMultiZone**](ClusterApi.md#enableMultiZone) | **POST** /v1/cluster/object-storage:enable-multi-zone | 
[**getActionLogReport**](ClusterApi.md#getActionLogReport) | **GET** /v1/cluster/action-log-report | 
[**getAlertReport**](ClusterApi.md#getAlertReport) | **GET** /v1/cluster/alert-report | 
[**getClusterOverview**](ClusterApi.md#getClusterOverview) | **GET** /v1/cluster/stats | 
[**getClusterReport**](ClusterApi.md#getClusterReport) | **GET** /v1/cluster/report | 
[**getClusterSamples**](ClusterApi.md#getClusterSamples) | **GET** /v1/cluster/samples | 
[**getClusterStatsUsagePrediction**](ClusterApi.md#getClusterStatsUsagePrediction) | **GET** /v1/cluster/stats-usage-prediction | 
[**getEventLogReport**](ClusterApi.md#getEventLogReport) | **GET** /v1/cluster/event-log-report | 
[**getNgObjectStorage**](ClusterApi.md#getNgObjectStorage) | **GET** /v1/cluster/ng-object-storage | 
[**getObjectStorage**](ClusterApi.md#getObjectStorage) | **GET** /v1/cluster/object-storage | 
[**getObjectStorageSamples**](ClusterApi.md#getObjectStorageSamples) | **GET** /v1/cluster/object-storage/samples | 
[**initObjectStorage**](ClusterApi.md#initObjectStorage) | **PUT** /v1/cluster/object-storage | 
[**installation**](ClusterApi.md#installation) | **GET** /v1/cluster/installation | 
[**prepareMasterSwitching**](ClusterApi.md#prepareMasterSwitching) | **POST** /v1/cluster/object-storage:prepare-master-switching | 
[**removeClusterAccessInfo**](ClusterApi.md#removeClusterAccessInfo) | **POST** /v1/cluster:remove-access-info | 
[**rollbackMasterSwitching**](ClusterApi.md#rollbackMasterSwitching) | **POST** /v1/cluster/object-storage:rollback-master-switching | 
[**serverTime**](ClusterApi.md#serverTime) | **GET** /v1/cluster/time | 
[**setBootNode**](ClusterApi.md#setBootNode) | **PUT** /v1/cluster/bootnode | 
[**setClusterAccessInfo**](ClusterApi.md#setClusterAccessInfo) | **POST** /v1/cluster:set-access-info | 
[**setClusterNetwork**](ClusterApi.md#setClusterNetwork) | **POST** /v1/cluster:set-network | 
[**setNgObjectStorageDomainNames**](ClusterApi.md#setNgObjectStorageDomainNames) | **POST** /v1/cluster/ng-object-storage:set-domain-names | 
[**setObjectStorage**](ClusterApi.md#setObjectStorage) | **PATCH** /v1/cluster/object-storage | 
[**setObjectStorageDNSNames**](ClusterApi.md#setObjectStorageDNSNames) | **POST** /v1/cluster/object-storage:set-dns-names | 
[**setObjectStorageOriginPullHosts**](ClusterApi.md#setObjectStorageOriginPullHosts) | **POST** /v1/cluster/object-storage:set-origin-pull-hosts | 
[**setObjectStorageTieringHosts**](ClusterApi.md#setObjectStorageTieringHosts) | **POST** /v1/cluster/object-storage:set-tiering-hosts | 
[**switchOSZoneToMaster**](ClusterApi.md#switchOSZoneToMaster) | **POST** /v1/cluster/object-storage:switch-os-zone-to-master | 
[**updateCluster**](ClusterApi.md#updateCluster) | **PATCH** /v1/cluster/ | 
[**updateClusterMaintenance**](ClusterApi.md#updateClusterMaintenance) | **PUT** /v1/cluster/maintenance | 

<a name="bootNode"></a>
# **bootNode**
> BootNodeResp bootNode(clusterId)



get bootnode info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    BootNodeResp result = apiInstance.bootNode(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#bootNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**BootNodeResp**](BootNodeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cluster"></a>
# **cluster**
> ClusterRecordResp cluster(clusterId)



Output the status of the cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterRecordResp result = apiInstance.cluster(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#cluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterRecordResp**](ClusterRecordResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="commitMasterSwitching"></a>
# **commitMasterSwitching**
> ObjectStorageResp commitMasterSwitching(clusterId)



Commit the switch to new master os zone.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.commitMasterSwitching(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#commitMasterSwitching");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteObjectStorage"></a>
# **deleteObjectStorage**
> ObjectStorageResp deleteObjectStorage(force, clusterId)



Delete object storage system in current cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
Boolean force = true; // Boolean | force delete or not
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.deleteObjectStorage(force, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#deleteObjectStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **force** | **Boolean**| force delete or not | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="download"></a>
# **download**
> File download(paths)



download the file which in whitelist path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String paths = "paths_example"; // String | file path
try {
    File result = apiInstance.download(paths);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#download");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paths** | **String**| file path |

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="enableMultiZone"></a>
# **enableMultiZone**
> ObjectStorageResp enableMultiZone(clusterId)



Enable multi zone for object storage system

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.enableMultiZone(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#enableMultiZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActionLogReport"></a>
# **getActionLogReport**
> File getActionLogReport(clusterId)



Get report of cluster action logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    File result = apiInstance.getActionLogReport(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getActionLogReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAlertReport"></a>
# **getAlertReport**
> File getAlertReport()



Get report of cluster alerts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
try {
    File result = apiInstance.getAlertReport();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getAlertReport");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getClusterOverview"></a>
# **getClusterOverview**
> ClusterOverviewResp getClusterOverview()



Get overview data of a cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterOverviewResp result = apiInstance.getClusterOverview();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterOverview");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterOverviewResp**](ClusterOverviewResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterReport"></a>
# **getClusterReport**
> File getClusterReport(clusterId)



Get report of a cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    File result = apiInstance.getClusterReport(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getClusterSamples"></a>
# **getClusterSamples**
> ClusterSamplesResp getClusterSamples(durationBegin, durationEnd, period)



get cluster&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    ClusterSamplesResp result = apiInstance.getClusterSamples(durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**ClusterSamplesResp**](ClusterSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterStatsUsagePrediction"></a>
# **getClusterStatsUsagePrediction**
> ClusterStatsPredictionResp getClusterStatsUsagePrediction()



Get prediction of stats space usage

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterStatsPredictionResp result = apiInstance.getClusterStatsUsagePrediction();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterStatsUsagePrediction");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterStatsPredictionResp**](ClusterStatsPredictionResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventLogReport"></a>
# **getEventLogReport**
> File getEventLogReport(clusterId)



Get report of cluster event logs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    File result = apiInstance.getEventLogReport(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getEventLogReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**File**](File.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getNgObjectStorage"></a>
# **getNgObjectStorage**
> NgObjectStorageResp getNgObjectStorage(clusterId)



Get osp status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    NgObjectStorageResp result = apiInstance.getNgObjectStorage(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getNgObjectStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NgObjectStorageResp**](NgObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorage"></a>
# **getObjectStorage**
> ObjectStorageResp getObjectStorage(clusterId)



Get object storage system status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.getObjectStorage(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getObjectStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getObjectStorageSamples"></a>
# **getObjectStorageSamples**
> ObjectStorageSamplesResp getObjectStorageSamples(clusterId, durationBegin, durationEnd, period)



Get object storage&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    ObjectStorageSamplesResp result = apiInstance.getObjectStorageSamples(clusterId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getObjectStorageSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**ObjectStorageSamplesResp**](ObjectStorageSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="initObjectStorage"></a>
# **initObjectStorage**
> ObjectStorageResp initObjectStorage(body, clusterId)



Initialize object storage system in current cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ObjectStorageInitReq body = new ObjectStorageInitReq(); // ObjectStorageInitReq | init info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.initObjectStorage(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#initObjectStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageInitReq**](ObjectStorageInitReq.md)| init info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="installation"></a>
# **installation**
> ClusterInstallationResp installation()



show the installation status

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
try {
    ClusterInstallationResp result = apiInstance.installation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#installation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterInstallationResp**](ClusterInstallationResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="prepareMasterSwitching"></a>
# **prepareMasterSwitching**
> ObjectStorageResp prepareMasterSwitching(clusterId)



Prepare to switch to new master os zone.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.prepareMasterSwitching(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#prepareMasterSwitching");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeClusterAccessInfo"></a>
# **removeClusterAccessInfo**
> ClusterResp removeClusterAccessInfo(clusterId)



Remove cluster access info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterResp result = apiInstance.removeClusterAccessInfo(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#removeClusterAccessInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rollbackMasterSwitching"></a>
# **rollbackMasterSwitching**
> ObjectStorageResp rollbackMasterSwitching(clusterId)



Rollback the switch to new master os zone.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.rollbackMasterSwitching(clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#rollbackMasterSwitching");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="serverTime"></a>
# **serverTime**
> ClusterServerTimeResp serverTime()



show current server time

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.ClusterApi;


ClusterApi apiInstance = new ClusterApi();
try {
    ClusterServerTimeResp result = apiInstance.serverTime();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#serverTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterServerTimeResp**](ClusterServerTimeResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setBootNode"></a>
# **setBootNode**
> BootNodeResp setBootNode(body, clusterId)



set bootnode info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
BootNodeReq body = new BootNodeReq(); // BootNodeReq | bootnode info
String clusterId = "clusterId_example"; // String | cluster id
try {
    BootNodeResp result = apiInstance.setBootNode(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setBootNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BootNodeReq**](BootNodeReq.md)| bootnode info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**BootNodeResp**](BootNodeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setClusterAccessInfo"></a>
# **setClusterAccessInfo**
> ClusterResp setClusterAccessInfo(body, clusterId)



Set cluster access info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ClusterSetAccessInfoReq body = new ClusterSetAccessInfoReq(); // ClusterSetAccessInfoReq | access info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterResp result = apiInstance.setClusterAccessInfo(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setClusterAccessInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterSetAccessInfoReq**](ClusterSetAccessInfoReq.md)| access info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setClusterNetwork"></a>
# **setClusterNetwork**
> ClusterResp setClusterNetwork(body, clusterId)



Set cluster gateway networks

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ClusterSetNetworkReq body = new ClusterSetNetworkReq(); // ClusterSetNetworkReq | gateway network
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterResp result = apiInstance.setClusterNetwork(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setClusterNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterSetNetworkReq**](ClusterSetNetworkReq.md)| gateway network |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setNgObjectStorageDomainNames"></a>
# **setNgObjectStorageDomainNames**
> NgObjectStorageResp setNgObjectStorageDomainNames(body, clusterId)



Set osp domain names

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
NgObjectStorageSetDomainNamesReq body = new NgObjectStorageSetDomainNamesReq(); // NgObjectStorageSetDomainNamesReq | domain names info
String clusterId = "clusterId_example"; // String | cluster id
try {
    NgObjectStorageResp result = apiInstance.setNgObjectStorageDomainNames(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setNgObjectStorageDomainNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NgObjectStorageSetDomainNamesReq**](NgObjectStorageSetDomainNamesReq.md)| domain names info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**NgObjectStorageResp**](NgObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorage"></a>
# **setObjectStorage**
> ObjectStorageResp setObjectStorage(body, clusterId)



Set object storage system in current cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ObjectStorageSetReq body = new ObjectStorageSetReq(); // ObjectStorageSetReq | set info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.setObjectStorage(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setObjectStorage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageSetReq**](ObjectStorageSetReq.md)| set info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorageDNSNames"></a>
# **setObjectStorageDNSNames**
> ObjectStorageResp setObjectStorageDNSNames(body, clusterId)



Set object storage dns names

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ObjectStorageSetDNSNamesReq body = new ObjectStorageSetDNSNamesReq(); // ObjectStorageSetDNSNamesReq | dns names info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.setObjectStorageDNSNames(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setObjectStorageDNSNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageSetDNSNamesReq**](ObjectStorageSetDNSNamesReq.md)| dns names info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorageOriginPullHosts"></a>
# **setObjectStorageOriginPullHosts**
> ObjectStorageResp setObjectStorageOriginPullHosts(body, clusterId)



Set object storage origin pull enable hosts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ObjectStorageSetFunctionEnableHostsReq body = new ObjectStorageSetFunctionEnableHostsReq(); // ObjectStorageSetFunctionEnableHostsReq | origin pull enabled hosts info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.setObjectStorageOriginPullHosts(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setObjectStorageOriginPullHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageSetFunctionEnableHostsReq**](ObjectStorageSetFunctionEnableHostsReq.md)| origin pull enabled hosts info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectStorageTieringHosts"></a>
# **setObjectStorageTieringHosts**
> ObjectStorageResp setObjectStorageTieringHosts(body, clusterId)



Set object storage tiering enable hosts

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ObjectStorageSetFunctionEnableHostsReq body = new ObjectStorageSetFunctionEnableHostsReq(); // ObjectStorageSetFunctionEnableHostsReq | tiering enabled hosts info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ObjectStorageResp result = apiInstance.setObjectStorageTieringHosts(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#setObjectStorageTieringHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ObjectStorageSetFunctionEnableHostsReq**](ObjectStorageSetFunctionEnableHostsReq.md)| tiering enabled hosts info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="switchOSZoneToMaster"></a>
# **switchOSZoneToMaster**
> ObjectStorageResp switchOSZoneToMaster(clusterId, force)



Switch current os zone to master

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
String clusterId = "clusterId_example"; // String | cluster id
Boolean force = true; // Boolean | force to switch even if old master is dead
try {
    ObjectStorageResp result = apiInstance.switchOSZoneToMaster(clusterId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#switchOSZoneToMaster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterId** | **String**| cluster id | [optional]
 **force** | **Boolean**| force to switch even if old master is dead | [optional]

### Return type

[**ObjectStorageResp**](ObjectStorageResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCluster"></a>
# **updateCluster**
> ClusterResp updateCluster(body, clusterId)



set disk lighting mode of cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ClusterUpdateReq body = new ClusterUpdateReq(); // ClusterUpdateReq | cluster disk lighting info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterResp result = apiInstance.updateCluster(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterUpdateReq**](ClusterUpdateReq.md)| cluster disk lighting info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterMaintenance"></a>
# **updateClusterMaintenance**
> ClusterResp updateClusterMaintenance(body, clusterId)



update maintenance mode of cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClusterApi;

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

ClusterApi apiInstance = new ClusterApi();
ClusterMaintainReq body = new ClusterMaintainReq(); // ClusterMaintainReq | cluster maintenance info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClusterResp result = apiInstance.updateClusterMaintenance(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterMaintenance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClusterMaintainReq**](ClusterMaintainReq.md)| cluster maintenance info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClusterResp**](ClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

