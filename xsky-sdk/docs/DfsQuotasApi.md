# DfsQuotasApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDfsQuota**](DfsQuotasApi.md#createDfsQuota) | **POST** /v1/dfs-quotas/ | 
[**deleteDfsQuota**](DfsQuotasApi.md#deleteDfsQuota) | **DELETE** /v1/dfs-quotas/{dfs_quota_id} | 
[**dfsQuotaOverview**](DfsQuotasApi.md#dfsQuotaOverview) | **GET** /v1/dfs-quotas/overview | 
[**getDfsQuota**](DfsQuotasApi.md#getDfsQuota) | **GET** /v1/dfs-quotas/{dfs_quota_id} | 
[**getDfsQuotaPredictions**](DfsQuotasApi.md#getDfsQuotaPredictions) | **GET** /v1/dfs-quotas/{dfs_quota_id}/predictions | 
[**getDfsQuotaSamples**](DfsQuotasApi.md#getDfsQuotaSamples) | **GET** /v1/dfs-quotas/{dfs_quota_id}/samples | 
[**listDfsQuotas**](DfsQuotasApi.md#listDfsQuotas) | **GET** /v1/dfs-quotas/ | 
[**pathValidator**](DfsQuotasApi.md#pathValidator) | **GET** /v1/dfs-quotas/path-validator | 
[**updateDfsQuota**](DfsQuotasApi.md#updateDfsQuota) | **PATCH** /v1/dfs-quotas/{dfs_quota_id} | 

<a name="createDfsQuota"></a>
# **createDfsQuota**
> DfsQuotaResp createDfsQuota(body, allowPathCreate)



Create dfs quota

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
DfsQuotaCreateReq body = new DfsQuotaCreateReq(); // DfsQuotaCreateReq | quota info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsQuotaResp result = apiInstance.createDfsQuota(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#createDfsQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQuotaCreateReq**](DfsQuotaCreateReq.md)| quota info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsQuotaResp**](DfsQuotaResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsQuota"></a>
# **deleteDfsQuota**
> DfsQuotaResp deleteDfsQuota(dfsQuotaId)



delete dfs quota

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
Long dfsQuotaId = 789L; // Long | dfs quota id
try {
    DfsQuotaResp result = apiInstance.deleteDfsQuota(dfsQuotaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#deleteDfsQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQuotaId** | **Long**| dfs quota id |

### Return type

[**DfsQuotaResp**](DfsQuotaResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dfsQuotaOverview"></a>
# **dfsQuotaOverview**
> DfsQuotaOverviewResp dfsQuotaOverview()



dfs quota overview about type and status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
try {
    DfsQuotaOverviewResp result = apiInstance.dfsQuotaOverview();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#dfsQuotaOverview");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DfsQuotaOverviewResp**](DfsQuotaOverviewResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQuota"></a>
# **getDfsQuota**
> DfsQuotaResp getDfsQuota(dfsQuotaId)



Get dfs quota

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
Long dfsQuotaId = 789L; // Long | dfs quota id
try {
    DfsQuotaResp result = apiInstance.getDfsQuota(dfsQuotaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#getDfsQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQuotaId** | **Long**| dfs quota id |

### Return type

[**DfsQuotaResp**](DfsQuotaResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQuotaPredictions"></a>
# **getDfsQuotaPredictions**
> DfsQuotaPredictionsResp getDfsQuotaPredictions(dfsQuotaId)



get a quota&#x27;s prediction

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
Long dfsQuotaId = 789L; // Long | dfs quota id
try {
    DfsQuotaPredictionsResp result = apiInstance.getDfsQuotaPredictions(dfsQuotaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#getDfsQuotaPredictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQuotaId** | **Long**| dfs quota id |

### Return type

[**DfsQuotaPredictionsResp**](DfsQuotaPredictionsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsQuotaSamples"></a>
# **getDfsQuotaSamples**
> DfsQuotaSamplesResp getDfsQuotaSamples(dfsQuotaId, durationBegin, durationEnd, period)



get a dfs quota&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
Long dfsQuotaId = 789L; // Long | dfs quota id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    DfsQuotaSamplesResp result = apiInstance.getDfsQuotaSamples(dfsQuotaId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#getDfsQuotaSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsQuotaId** | **Long**| dfs quota id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**DfsQuotaSamplesResp**](DfsQuotaSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsQuotas"></a>
# **listDfsQuotas**
> DfsQuotasResp listDfsQuotas(path, type, domainUserName, domainUserGroupName, fsUserId, fsUserGroupId, limit, offset, q, sort, clusterId)



List dfs quotas

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
String path = "path_example"; // String | dfs quota path
String type = "type_example"; // String | dfs quota type
String domainUserName = "domainUserName_example"; // String | dfs quota domain user name
String domainUserGroupName = "domainUserGroupName_example"; // String | dfs quota domain user group name
Long fsUserId = 789L; // Long | fs user id
Long fsUserGroupId = 789L; // Long | fs user group id
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
try {
    DfsQuotasResp result = apiInstance.listDfsQuotas(path, type, domainUserName, domainUserGroupName, fsUserId, fsUserGroupId, limit, offset, q, sort, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#listDfsQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| dfs quota path | [optional]
 **type** | **String**| dfs quota type | [optional]
 **domainUserName** | **String**| dfs quota domain user name | [optional]
 **domainUserGroupName** | **String**| dfs quota domain user group name | [optional]
 **fsUserId** | **Long**| fs user id | [optional]
 **fsUserGroupId** | **Long**| fs user group id | [optional]
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**DfsQuotasResp**](DfsQuotasResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pathValidator"></a>
# **pathValidator**
> DfsQuotaPathValidateResp pathValidator(dfsRootfsId, path)



validate a path for dfs quota

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
Long dfsRootfsId = 789L; // Long | dfs rootfs id
String path = "path_example"; // String | dfs quota path
try {
    DfsQuotaPathValidateResp result = apiInstance.pathValidator(dfsRootfsId, path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#pathValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsRootfsId** | **Long**| dfs rootfs id |
 **path** | **String**| dfs quota path |

### Return type

[**DfsQuotaPathValidateResp**](DfsQuotaPathValidateResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDfsQuota"></a>
# **updateDfsQuota**
> DfsQuotaResp updateDfsQuota(body, dfsQuotaId)



Update dfs quota

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsQuotasApi;

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

DfsQuotasApi apiInstance = new DfsQuotasApi();
DfsQuotaUpdateReq body = new DfsQuotaUpdateReq(); // DfsQuotaUpdateReq | dfs quota info
Long dfsQuotaId = 789L; // Long | quota id
try {
    DfsQuotaResp result = apiInstance.updateDfsQuota(body, dfsQuotaId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsQuotasApi#updateDfsQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsQuotaUpdateReq**](DfsQuotaUpdateReq.md)| dfs quota info |
 **dfsQuotaId** | **Long**| quota id |

### Return type

[**DfsQuotaResp**](DfsQuotaResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

