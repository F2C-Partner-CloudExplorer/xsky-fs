# DfsHdfsesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDfsHdfsACLs**](DfsHdfsesApi.md#addDfsHdfsACLs) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:add-acls | 
[**addDfsHdfsIPWhiteLists**](DfsHdfsesApi.md#addDfsHdfsIPWhiteLists) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:add-ip-white-lists | 
[**addDfsHdfsProxyUsers**](DfsHdfsesApi.md#addDfsHdfsProxyUsers) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:add-proxy-users | 
[**createDfsHdfs**](DfsHdfsesApi.md#createDfsHdfs) | **POST** /v1/dfs-hdfses/ | 
[**deleteDfsHdfs**](DfsHdfsesApi.md#deleteDfsHdfs) | **DELETE** /v1/dfs-hdfses/{dfs_hdfs_id} | 
[**getDfsHdfs**](DfsHdfsesApi.md#getDfsHdfs) | **GET** /v1/dfs-hdfses/{dfs_hdfs_id} | 
[**listDfsHdfses**](DfsHdfsesApi.md#listDfsHdfses) | **GET** /v1/dfs-hdfses/ | 
[**removeDfsHdfsACLs**](DfsHdfsesApi.md#removeDfsHdfsACLs) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:remove-acls | 
[**removeDfsHdfsIPWhiteLists**](DfsHdfsesApi.md#removeDfsHdfsIPWhiteLists) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:remove-ip-white-lists | 
[**removeDfsHdfsProxyUsers**](DfsHdfsesApi.md#removeDfsHdfsProxyUsers) | **POST** /v1/dfs-hdfses/{dfs_hdfs_id}:remove-proxy-users | 
[**updateDfsHdfs**](DfsHdfsesApi.md#updateDfsHdfs) | **PATCH** /v1/dfs-hdfses/{dfs_hdfs_id} | 
[**updateDfsHdfsACLs**](DfsHdfsesApi.md#updateDfsHdfsACLs) | **PATCH** /v1/dfs-hdfses/{dfs_hdfs_id}:update-acls | 
[**updateDfsHdfsIPWhiteLists**](DfsHdfsesApi.md#updateDfsHdfsIPWhiteLists) | **PATCH** /v1/dfs-hdfses/{dfs_hdfs_id}:update-ip-white-lists | 
[**updateDfsHdfsProxyUsers**](DfsHdfsesApi.md#updateDfsHdfsProxyUsers) | **PATCH** /v1/dfs-hdfses/{dfs_hdfs_id}:update-proxy-users | 

<a name="addDfsHdfsACLs"></a>
# **addDfsHdfsACLs**
> DfsHdfsResp addDfsHdfsACLs(body, dfsHdfsId)



add dfs hdfs acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsAddACLsReq body = new DfsHdfsAddACLsReq(); // DfsHdfsAddACLsReq | dfs hdfs info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.addDfsHdfsACLs(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#addDfsHdfsACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsAddACLsReq**](DfsHdfsAddACLsReq.md)| dfs hdfs info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDfsHdfsIPWhiteLists"></a>
# **addDfsHdfsIPWhiteLists**
> DfsHdfsResp addDfsHdfsIPWhiteLists(body, dfsHdfsId)



add dfs hdfs ip white list

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsAddIPWhiteListReq body = new DfsHdfsAddIPWhiteListReq(); // DfsHdfsAddIPWhiteListReq | dfs hdfs info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.addDfsHdfsIPWhiteLists(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#addDfsHdfsIPWhiteLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsAddIPWhiteListReq**](DfsHdfsAddIPWhiteListReq.md)| dfs hdfs info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addDfsHdfsProxyUsers"></a>
# **addDfsHdfsProxyUsers**
> DfsHdfsResp addDfsHdfsProxyUsers(body, dfsHdfsId)



add dfs hdfs proxy users

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsAddProxyUsersReq body = new DfsHdfsAddProxyUsersReq(); // DfsHdfsAddProxyUsersReq | dfs hdfs info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.addDfsHdfsProxyUsers(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#addDfsHdfsProxyUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsAddProxyUsersReq**](DfsHdfsAddProxyUsersReq.md)| dfs hdfs info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDfsHdfs"></a>
# **createDfsHdfs**
> DfsHdfsResp createDfsHdfs(body, allowPathCreate)



Create dfs hdfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsCreateReq body = new DfsHdfsCreateReq(); // DfsHdfsCreateReq | hdfs info
Boolean allowPathCreate = true; // Boolean | allow create path when not existed
try {
    DfsHdfsResp result = apiInstance.createDfsHdfs(body, allowPathCreate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#createDfsHdfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsCreateReq**](DfsHdfsCreateReq.md)| hdfs info |
 **allowPathCreate** | **Boolean**| allow create path when not existed | [optional]

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDfsHdfs"></a>
# **deleteDfsHdfs**
> DfsHdfsResp deleteDfsHdfs(dfsHdfsId, force)



delete dfs hdfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
Long dfsHdfsId = 789L; // Long | dfs hdfs id
Boolean force = true; // Boolean | force delete or not
try {
    DfsHdfsResp result = apiInstance.deleteDfsHdfs(dfsHdfsId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#deleteDfsHdfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsHdfsId** | **Long**| dfs hdfs id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDfsHdfs"></a>
# **getDfsHdfs**
> DfsHdfsResp getDfsHdfs(dfsHdfsId)



Get dfs hdfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
Long dfsHdfsId = 789L; // Long | dfs hdfs id
try {
    DfsHdfsResp result = apiInstance.getDfsHdfs(dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#getDfsHdfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dfsHdfsId** | **Long**| dfs hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDfsHdfses"></a>
# **listDfsHdfses**
> DfsHdfsesResp listDfsHdfses(limit, offset, clusterId, path, auth, dfsGatewayZoneId, q, sort)



List dfs hdfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
String path = "path_example"; // String | related dfs path
String auth = "auth_example"; // String | authType for hdfs: simple, kerberos
Long dfsGatewayZoneId = 789L; // Long | dfs gateway zone id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    DfsHdfsesResp result = apiInstance.listDfsHdfses(limit, offset, clusterId, path, auth, dfsGatewayZoneId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#listDfsHdfses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **path** | **String**| related dfs path | [optional]
 **auth** | **String**| authType for hdfs: simple, kerberos | [optional]
 **dfsGatewayZoneId** | **Long**| dfs gateway zone id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**DfsHdfsesResp**](DfsHdfsesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDfsHdfsACLs"></a>
# **removeDfsHdfsACLs**
> DfsHdfsResp removeDfsHdfsACLs(body, dfsHdfsId)



remove dfs hdfs acls

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsRemoveACLsReq body = new DfsHdfsRemoveACLsReq(); // DfsHdfsRemoveACLsReq | hdfs acls info
Long dfsHdfsId = 789L; // Long | dfs hdfs id
try {
    DfsHdfsResp result = apiInstance.removeDfsHdfsACLs(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#removeDfsHdfsACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsRemoveACLsReq**](DfsHdfsRemoveACLsReq.md)| hdfs acls info |
 **dfsHdfsId** | **Long**| dfs hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDfsHdfsIPWhiteLists"></a>
# **removeDfsHdfsIPWhiteLists**
> DfsHdfsResp removeDfsHdfsIPWhiteLists(body, dfsHdfsId)



remove dfs hdfs ip white lists

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsRemoveIPWhiteListReq body = new DfsHdfsRemoveIPWhiteListReq(); // DfsHdfsRemoveIPWhiteListReq | hdfs ip white list info
Long dfsHdfsId = 789L; // Long | dfs hdfs id
try {
    DfsHdfsResp result = apiInstance.removeDfsHdfsIPWhiteLists(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#removeDfsHdfsIPWhiteLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsRemoveIPWhiteListReq**](DfsHdfsRemoveIPWhiteListReq.md)| hdfs ip white list info |
 **dfsHdfsId** | **Long**| dfs hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDfsHdfsProxyUsers"></a>
# **removeDfsHdfsProxyUsers**
> DfsHdfsResp removeDfsHdfsProxyUsers(body, dfsHdfsId)



remove dfs hdfs proxy users

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsRemoveProxyUsersReq body = new DfsHdfsRemoveProxyUsersReq(); // DfsHdfsRemoveProxyUsersReq | hdfs proxy users info
Long dfsHdfsId = 789L; // Long | dfs hdfs id
try {
    DfsHdfsResp result = apiInstance.removeDfsHdfsProxyUsers(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#removeDfsHdfsProxyUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsRemoveProxyUsersReq**](DfsHdfsRemoveProxyUsersReq.md)| hdfs proxy users info |
 **dfsHdfsId** | **Long**| dfs hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsHdfs"></a>
# **updateDfsHdfs**
> DfsHdfsResp updateDfsHdfs(body, dfsHdfsId)



Update dfs hdfs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsUpdateReq body = new DfsHdfsUpdateReq(); // DfsHdfsUpdateReq | dfs hdfs info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.updateDfsHdfs(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#updateDfsHdfs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsUpdateReq**](DfsHdfsUpdateReq.md)| dfs hdfs info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsHdfsACLs"></a>
# **updateDfsHdfsACLs**
> DfsHdfsResp updateDfsHdfsACLs(body, dfsHdfsId)



Update dfs hdfs ACL

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsUpdateACLsReq body = new DfsHdfsUpdateACLsReq(); // DfsHdfsUpdateACLsReq | hdfs acls info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.updateDfsHdfsACLs(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#updateDfsHdfsACLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsUpdateACLsReq**](DfsHdfsUpdateACLsReq.md)| hdfs acls info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsHdfsIPWhiteLists"></a>
# **updateDfsHdfsIPWhiteLists**
> DfsHdfsResp updateDfsHdfsIPWhiteLists(body, dfsHdfsId)



Update dfs hdfs IP White List

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsUpdateIPWhiteListsReq body = new DfsHdfsUpdateIPWhiteListsReq(); // DfsHdfsUpdateIPWhiteListsReq | hdfs ip white lists info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.updateDfsHdfsIPWhiteLists(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#updateDfsHdfsIPWhiteLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsUpdateIPWhiteListsReq**](DfsHdfsUpdateIPWhiteListsReq.md)| hdfs ip white lists info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDfsHdfsProxyUsers"></a>
# **updateDfsHdfsProxyUsers**
> DfsHdfsResp updateDfsHdfsProxyUsers(body, dfsHdfsId)



Update dfs hdfs proxy users

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DfsHdfsesApi;

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

DfsHdfsesApi apiInstance = new DfsHdfsesApi();
DfsHdfsUpdateProxyUsersReq body = new DfsHdfsUpdateProxyUsersReq(); // DfsHdfsUpdateProxyUsersReq | hdfs proxy user info
Long dfsHdfsId = 789L; // Long | hdfs id
try {
    DfsHdfsResp result = apiInstance.updateDfsHdfsProxyUsers(body, dfsHdfsId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DfsHdfsesApi#updateDfsHdfsProxyUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DfsHdfsUpdateProxyUsersReq**](DfsHdfsUpdateProxyUsersReq.md)| hdfs proxy user info |
 **dfsHdfsId** | **Long**| hdfs id |

### Return type

[**DfsHdfsResp**](DfsHdfsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

