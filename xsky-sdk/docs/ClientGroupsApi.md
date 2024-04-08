# ClientGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientGroup**](ClientGroupsApi.md#createClientGroup) | **POST** /v1/client-groups/ | 
[**deleteClientGroup**](ClientGroupsApi.md#deleteClientGroup) | **DELETE** /v1/client-groups/{client_group_id} | 
[**getClientGroup**](ClientGroupsApi.md#getClientGroup) | **GET** /v1/client-groups/{client_group_id} | 
[**listClientGroups**](ClientGroupsApi.md#listClientGroups) | **GET** /v1/client-groups/ | 
[**updateClientGroup**](ClientGroupsApi.md#updateClientGroup) | **PATCH** /v1/client-groups/{client_group_id} | 

<a name="createClientGroup"></a>
# **createClientGroup**
> ClientGroupResp createClientGroup(body, clusterId)



Create a client group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientGroupsApi;

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

ClientGroupsApi apiInstance = new ClientGroupsApi();
ClientGroupCreateReq body = new ClientGroupCreateReq(); // ClientGroupCreateReq | client group info
String clusterId = "clusterId_example"; // String | cluster id
try {
    ClientGroupResp result = apiInstance.createClientGroup(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientGroupsApi#createClientGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientGroupCreateReq**](ClientGroupCreateReq.md)| client group info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**ClientGroupResp**](ClientGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientGroup"></a>
# **deleteClientGroup**
> deleteClientGroup(clientGroupId)



Delete a client

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientGroupsApi;

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

ClientGroupsApi apiInstance = new ClientGroupsApi();
Long clientGroupId = 789L; // Long | client group id
try {
    apiInstance.deleteClientGroup(clientGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientGroupsApi#deleteClientGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **Long**| client group id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getClientGroup"></a>
# **getClientGroup**
> ClientGroupResp getClientGroup(clientGroupId)



get a client group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientGroupsApi;

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

ClientGroupsApi apiInstance = new ClientGroupsApi();
Long clientGroupId = 789L; // Long | client group id
try {
    ClientGroupResp result = apiInstance.getClientGroup(clientGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientGroupsApi#getClientGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientGroupId** | **Long**| client group id |

### Return type

[**ClientGroupResp**](ClientGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClientGroups"></a>
# **listClientGroups**
> ClientGroupsResp listClientGroups(limit, offset, uid, blockVolumeId, q, sort)



List client groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientGroupsApi;

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

ClientGroupsApi apiInstance = new ClientGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String uid = "uid_example"; // String | client group uid
Long blockVolumeId = 789L; // Long | related block volume id
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    ClientGroupsResp result = apiInstance.listClientGroups(limit, offset, uid, blockVolumeId, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientGroupsApi#listClientGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **uid** | **String**| client group uid | [optional]
 **blockVolumeId** | **Long**| related block volume id | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**ClientGroupsResp**](ClientGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClientGroup"></a>
# **updateClientGroup**
> ClientGroupResp updateClientGroup(body, clientGroupId)



update client group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.ClientGroupsApi;

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

ClientGroupsApi apiInstance = new ClientGroupsApi();
ClientGroupUpdateReq body = new ClientGroupUpdateReq(); // ClientGroupUpdateReq | client group info
Long clientGroupId = 789L; // Long | client group id
try {
    ClientGroupResp result = apiInstance.updateClientGroup(body, clientGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientGroupsApi#updateClientGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientGroupUpdateReq**](ClientGroupUpdateReq.md)| client group info |
 **clientGroupId** | **Long**| client group id |

### Return type

[**ClientGroupResp**](ClientGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

