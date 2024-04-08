# FsLdapsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFSLdap**](FsLdapsApi.md#createFSLdap) | **POST** /v1/fs-ldaps/ | 
[**deleteFSLdap**](FsLdapsApi.md#deleteFSLdap) | **DELETE** /v1/fs-ldaps/{fs_ldap_id} | 
[**getFSLdap**](FsLdapsApi.md#getFSLdap) | **GET** /v1/fs-ldaps/{fs_ldap_id} | 
[**listFSLdaps**](FsLdapsApi.md#listFSLdaps) | **GET** /v1/fs-ldaps/ | 
[**updateFSLdap**](FsLdapsApi.md#updateFSLdap) | **PATCH** /v1/fs-ldaps/{fs_ldap_id} | 
[**verifyFSLdap**](FsLdapsApi.md#verifyFSLdap) | **POST** /v1/fs-ldaps/{fs_ldap_id}:verify | 

<a name="createFSLdap"></a>
# **createFSLdap**
> FSLdapResp createFSLdap(body, clusterId)



create file storage ldap

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
FSLdapCreateReq body = new FSLdapCreateReq(); // FSLdapCreateReq | file storage ldap info
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSLdapResp result = apiInstance.createFSLdap(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#createFSLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSLdapCreateReq**](FSLdapCreateReq.md)| file storage ldap info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSLdapResp**](FSLdapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFSLdap"></a>
# **deleteFSLdap**
> deleteFSLdap(fsLdapId)



Delete file storage ldap

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
Long fsLdapId = 789L; // Long | file storage ldap id
try {
    apiInstance.deleteFSLdap(fsLdapId);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#deleteFSLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsLdapId** | **Long**| file storage ldap id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getFSLdap"></a>
# **getFSLdap**
> FSLdapResp getFSLdap(fsLdapId)



Get a file storage ldap

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
Long fsLdapId = 789L; // Long | file storage ldap id
try {
    FSLdapResp result = apiInstance.getFSLdap(fsLdapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#getFSLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsLdapId** | **Long**| file storage ldap id |

### Return type

[**FSLdapResp**](FSLdapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFSLdaps"></a>
# **listFSLdaps**
> FSLdapsResp listFSLdaps(limit, offset, clusterId)



List file storage ldaps

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    FSLdapsResp result = apiInstance.listFSLdaps(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#listFSLdaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**FSLdapsResp**](FSLdapsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFSLdap"></a>
# **updateFSLdap**
> FSLdapResp updateFSLdap(body, fsLdapId)



Update a file storage ldap

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
FSLdapUpdateReq body = new FSLdapUpdateReq(); // FSLdapUpdateReq | file storage ldap info
Long fsLdapId = 789L; // Long | file storage ldap id
try {
    FSLdapResp result = apiInstance.updateFSLdap(body, fsLdapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#updateFSLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FSLdapUpdateReq**](FSLdapUpdateReq.md)| file storage ldap info |
 **fsLdapId** | **Long**| file storage ldap id |

### Return type

[**FSLdapResp**](FSLdapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyFSLdap"></a>
# **verifyFSLdap**
> FSLdapResp verifyFSLdap(fsLdapId)



Verify a file storage ldap

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.FsLdapsApi;

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

FsLdapsApi apiInstance = new FsLdapsApi();
Long fsLdapId = 789L; // Long | file storage ldap id
try {
    FSLdapResp result = apiInstance.verifyFSLdap(fsLdapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsLdapsApi#verifyFSLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsLdapId** | **Long**| file storage ldap id |

### Return type

[**FSLdapResp**](FSLdapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

