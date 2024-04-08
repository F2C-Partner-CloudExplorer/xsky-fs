# DpSitesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDpSite**](DpSitesApi.md#createDpSite) | **POST** /v1/dp-sites/ | 
[**deleteDpSite**](DpSitesApi.md#deleteDpSite) | **DELETE** /v1/dp-sites/{site_id} | 
[**getBackupBlockSnapshots**](DpSitesApi.md#getBackupBlockSnapshots) | **GET** /v1/dp-sites/{site_id}/backup-block-snapshots | 
[**getBackupBlockVolumes**](DpSitesApi.md#getBackupBlockVolumes) | **GET** /v1/dp-sites/{site_id}/backup-block-volumes | 
[**getBackupClusters**](DpSitesApi.md#getBackupClusters) | **GET** /v1/dp-sites/{site_id}/backup-clusters | 
[**getDpSite**](DpSitesApi.md#getDpSite) | **GET** /v1/dp-sites/{site_id} | 
[**listDpSites**](DpSitesApi.md#listDpSites) | **GET** /v1/dp-sites/ | 
[**updateDpSite**](DpSitesApi.md#updateDpSite) | **PATCH** /v1/dp-sites/{site_id} | 

<a name="createDpSite"></a>
# **createDpSite**
> DpSiteResp createDpSite(body)



Create a data protection site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
DpSiteCreateReq body = new DpSiteCreateReq(); // DpSiteCreateReq | dp site info
try {
    DpSiteResp result = apiInstance.createDpSite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#createDpSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpSiteCreateReq**](DpSiteCreateReq.md)| dp site info |

### Return type

[**DpSiteResp**](DpSiteResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDpSite"></a>
# **deleteDpSite**
> deleteDpSite(siteId)



Delete data protection site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long siteId = 789L; // Long | dp site id
try {
    apiInstance.deleteDpSite(siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#deleteDpSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| dp site id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBackupBlockSnapshots"></a>
# **getBackupBlockSnapshots**
> DpBackupBlockSnapshotsResp getBackupBlockSnapshots(siteId, dpGatewayId, clusterFsId, blockVolumeName, after)



List snapshots of a volume stored on a dp site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long siteId = 789L; // Long | dp site id
Long dpGatewayId = 789L; // Long | the dp gateway to execute the query
String clusterFsId = "clusterFsId_example"; // String | cluster fs id
String blockVolumeName = "blockVolumeName_example"; // String | block volume name
String after = "after_example"; // String | continuation token
try {
    DpBackupBlockSnapshotsResp result = apiInstance.getBackupBlockSnapshots(siteId, dpGatewayId, clusterFsId, blockVolumeName, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#getBackupBlockSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| dp site id |
 **dpGatewayId** | **Long**| the dp gateway to execute the query |
 **clusterFsId** | **String**| cluster fs id |
 **blockVolumeName** | **String**| block volume name |
 **after** | **String**| continuation token | [optional]

### Return type

[**DpBackupBlockSnapshotsResp**](DpBackupBlockSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBackupBlockVolumes"></a>
# **getBackupBlockVolumes**
> DpBackupBlockVolumesResp getBackupBlockVolumes(siteId, dpGatewayId, clusterFsId, after)



List volumes of a cluster stored on a dp site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long siteId = 789L; // Long | dp site id
Long dpGatewayId = 789L; // Long | the dp gateway to execute the query
String clusterFsId = "clusterFsId_example"; // String | cluster fs id
String after = "after_example"; // String | continuation token
try {
    DpBackupBlockVolumesResp result = apiInstance.getBackupBlockVolumes(siteId, dpGatewayId, clusterFsId, after);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#getBackupBlockVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| dp site id |
 **dpGatewayId** | **Long**| the dp gateway to execute the query |
 **clusterFsId** | **String**| cluster fs id |
 **after** | **String**| continuation token | [optional]

### Return type

[**DpBackupBlockVolumesResp**](DpBackupBlockVolumesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBackupClusters"></a>
# **getBackupClusters**
> DpBackupClustersResp getBackupClusters(siteId, dpGatewayId)



List clusters stored on a dp site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long siteId = 789L; // Long | dp site id
Long dpGatewayId = 789L; // Long | the dp gateway to execute the query
try {
    DpBackupClustersResp result = apiInstance.getBackupClusters(siteId, dpGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#getBackupClusters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| dp site id |
 **dpGatewayId** | **Long**| the dp gateway to execute the query |

### Return type

[**DpBackupClustersResp**](DpBackupClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDpSite"></a>
# **getDpSite**
> DpSiteResp getDpSite(siteId)



Get data protection site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long siteId = 789L; // Long | protection site id
try {
    DpSiteResp result = apiInstance.getDpSite(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#getDpSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **Long**| protection site id |

### Return type

[**DpSiteResp**](DpSiteResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDpSites"></a>
# **listDpSites**
> DpSitesResp listDpSites(limit, offset, q, sort, protectionType)



List data protection sites

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String protectionType = "protectionType_example"; // String | protection type
try {
    DpSitesResp result = apiInstance.listDpSites(limit, offset, q, sort, protectionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#listDpSites");
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
 **protectionType** | **String**| protection type | [optional]

### Return type

[**DpSitesResp**](DpSitesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDpSite"></a>
# **updateDpSite**
> DpSiteResp updateDpSite(body, siteId)



Update a data protection site

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DpSitesApi;

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

DpSitesApi apiInstance = new DpSitesApi();
DpSiteUpdateReq body = new DpSiteUpdateReq(); // DpSiteUpdateReq | dp site info
Long siteId = 789L; // Long | dp site id
try {
    DpSiteResp result = apiInstance.updateDpSite(body, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DpSitesApi#updateDpSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DpSiteUpdateReq**](DpSiteUpdateReq.md)| dp site info |
 **siteId** | **Long**| dp site id |

### Return type

[**DpSiteResp**](DpSiteResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

