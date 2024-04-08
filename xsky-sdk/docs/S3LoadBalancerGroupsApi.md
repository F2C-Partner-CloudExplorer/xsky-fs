# S3LoadBalancerGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addS3LoadBalancersToGroup**](S3LoadBalancerGroupsApi.md#addS3LoadBalancersToGroup) | **PUT** /v1/s3-load-balancer-groups/{group_id}/s3-load-balancers | 
[**createS3LoadBalancerGroup**](S3LoadBalancerGroupsApi.md#createS3LoadBalancerGroup) | **POST** /v1/s3-load-balancer-groups/ | 
[**deleteS3LoadBalancerGroup**](S3LoadBalancerGroupsApi.md#deleteS3LoadBalancerGroup) | **DELETE** /v1/s3-load-balancer-groups/{group_id} | 
[**getS3LoadBalancerGroup**](S3LoadBalancerGroupsApi.md#getS3LoadBalancerGroup) | **GET** /v1/s3-load-balancer-groups/{group_id} | 
[**listS3LoadBalancerGroups**](S3LoadBalancerGroupsApi.md#listS3LoadBalancerGroups) | **GET** /v1/s3-load-balancer-groups/ | 
[**redeployS3LoadBalancerGroup**](S3LoadBalancerGroupsApi.md#redeployS3LoadBalancerGroup) | **POST** /v1/s3-load-balancer-groups/{group_id}:redeploy | 
[**registerS3LoadBalancerService**](S3LoadBalancerGroupsApi.md#registerS3LoadBalancerService) | **POST** /v1/s3-load-balancer-groups/register-service | 
[**removeS3LoadBalancerService**](S3LoadBalancerGroupsApi.md#removeS3LoadBalancerService) | **DELETE** /v1/s3-load-balancer-groups/remove-service | 
[**removeS3LoadBalancersFromGroup**](S3LoadBalancerGroupsApi.md#removeS3LoadBalancersFromGroup) | **DELETE** /v1/s3-load-balancer-groups/{group_id}/s3-load-balancers | 
[**updateS3LoadBalancerGroup**](S3LoadBalancerGroupsApi.md#updateS3LoadBalancerGroup) | **PATCH** /v1/s3-load-balancer-groups/{group_id} | 

<a name="addS3LoadBalancersToGroup"></a>
# **addS3LoadBalancersToGroup**
> S3LoadBalancerGroupResp addS3LoadBalancersToGroup(body, groupId)



add load balancers to group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancersAddReq body = new S3LoadBalancersAddReq(); // S3LoadBalancersAddReq | load balancer ids to add
Long groupId = 789L; // Long | group id
try {
    S3LoadBalancerGroupResp result = apiInstance.addS3LoadBalancersToGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#addS3LoadBalancersToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancersAddReq**](S3LoadBalancersAddReq.md)| load balancer ids to add |
 **groupId** | **Long**| group id |

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createS3LoadBalancerGroup"></a>
# **createS3LoadBalancerGroup**
> S3LoadBalancerGroupResp createS3LoadBalancerGroup(body, clusterId)



Create a s3 load balancer group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancerGroupCreateReq body = new S3LoadBalancerGroupCreateReq(); // S3LoadBalancerGroupCreateReq | s3 load balancer group info
String clusterId = "clusterId_example"; // String | cluster id
try {
    S3LoadBalancerGroupResp result = apiInstance.createS3LoadBalancerGroup(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#createS3LoadBalancerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancerGroupCreateReq**](S3LoadBalancerGroupCreateReq.md)| s3 load balancer group info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteS3LoadBalancerGroup"></a>
# **deleteS3LoadBalancerGroup**
> S3LoadBalancerGroupResp deleteS3LoadBalancerGroup(groupId, force)



Delete s3 load balancer group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
Long groupId = 789L; // Long | s3 load balancer group id
Boolean force = true; // Boolean | forcedly delete or not
try {
    S3LoadBalancerGroupResp result = apiInstance.deleteS3LoadBalancerGroup(groupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#deleteS3LoadBalancerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| s3 load balancer group id |
 **force** | **Boolean**| forcedly delete or not | [optional]

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getS3LoadBalancerGroup"></a>
# **getS3LoadBalancerGroup**
> S3LoadBalancerGroupResp getS3LoadBalancerGroup(groupId)



Get s3 load balancer group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
Long groupId = 789L; // Long | s3 load balancer group id
try {
    S3LoadBalancerGroupResp result = apiInstance.getS3LoadBalancerGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#getS3LoadBalancerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| s3 load balancer group id |

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listS3LoadBalancerGroups"></a>
# **listS3LoadBalancerGroups**
> S3LoadBalancerGroupsResp listS3LoadBalancerGroups(limit, offset, q, sort, clusterId, ospZoneId)



List s3 load balancer groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
String clusterId = "clusterId_example"; // String | cluster id
Long ospZoneId = 789L; // Long | osp zone id
try {
    S3LoadBalancerGroupsResp result = apiInstance.listS3LoadBalancerGroups(limit, offset, q, sort, clusterId, ospZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#listS3LoadBalancerGroups");
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
 **clusterId** | **String**| cluster id | [optional]
 **ospZoneId** | **Long**| osp zone id | [optional]

### Return type

[**S3LoadBalancerGroupsResp**](S3LoadBalancerGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redeployS3LoadBalancerGroup"></a>
# **redeployS3LoadBalancerGroup**
> S3LoadBalancerGroupResp redeployS3LoadBalancerGroup(groupId, reloadKeepalived)



Redeploy a s3 load balancer group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
Long groupId = 789L; // Long | s3 load balancer group id
Boolean reloadKeepalived = true; // Boolean | reload keepalived
try {
    S3LoadBalancerGroupResp result = apiInstance.redeployS3LoadBalancerGroup(groupId, reloadKeepalived);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#redeployS3LoadBalancerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| s3 load balancer group id |
 **reloadKeepalived** | **Boolean**| reload keepalived | [optional]

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerS3LoadBalancerService"></a>
# **registerS3LoadBalancerService**
> S3LoadBalancerServiceResp registerS3LoadBalancerService(body)



Register s3 load balancer service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancerRegisterServiceReq body = new S3LoadBalancerRegisterServiceReq(); // S3LoadBalancerRegisterServiceReq | register s3 load balancer service info
try {
    S3LoadBalancerServiceResp result = apiInstance.registerS3LoadBalancerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#registerS3LoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancerRegisterServiceReq**](S3LoadBalancerRegisterServiceReq.md)| register s3 load balancer service info |

### Return type

[**S3LoadBalancerServiceResp**](S3LoadBalancerServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeS3LoadBalancerService"></a>
# **removeS3LoadBalancerService**
> S3LoadBalancerServiceResp removeS3LoadBalancerService(body)



Remove s3 load balancer service

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancerRemoveServiceReq body = new S3LoadBalancerRemoveServiceReq(); // S3LoadBalancerRemoveServiceReq | remove s3 load balancer service info
try {
    S3LoadBalancerServiceResp result = apiInstance.removeS3LoadBalancerService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#removeS3LoadBalancerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancerRemoveServiceReq**](S3LoadBalancerRemoveServiceReq.md)| remove s3 load balancer service info |

### Return type

[**S3LoadBalancerServiceResp**](S3LoadBalancerServiceResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeS3LoadBalancersFromGroup"></a>
# **removeS3LoadBalancersFromGroup**
> S3LoadBalancerGroupResp removeS3LoadBalancersFromGroup(body, groupId, force)



remove load balancers from group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancersRemoveReq body = new S3LoadBalancersRemoveReq(); // S3LoadBalancersRemoveReq | load balancer ids to remove
Long groupId = 789L; // Long | group id
Boolean force = true; // Boolean | forcedly remove or not
try {
    S3LoadBalancerGroupResp result = apiInstance.removeS3LoadBalancersFromGroup(body, groupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#removeS3LoadBalancersFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancersRemoveReq**](S3LoadBalancersRemoveReq.md)| load balancer ids to remove |
 **groupId** | **Long**| group id |
 **force** | **Boolean**| forcedly remove or not | [optional]

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateS3LoadBalancerGroup"></a>
# **updateS3LoadBalancerGroup**
> S3LoadBalancerGroupResp updateS3LoadBalancerGroup(body, groupId)



Update a s3 load balancer group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.S3LoadBalancerGroupsApi;

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

S3LoadBalancerGroupsApi apiInstance = new S3LoadBalancerGroupsApi();
S3LoadBalancerGroupUpdateReq body = new S3LoadBalancerGroupUpdateReq(); // S3LoadBalancerGroupUpdateReq | s3 load balancer group info
Long groupId = 789L; // Long | s3 load balancer group id
try {
    S3LoadBalancerGroupResp result = apiInstance.updateS3LoadBalancerGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling S3LoadBalancerGroupsApi#updateS3LoadBalancerGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**S3LoadBalancerGroupUpdateReq**](S3LoadBalancerGroupUpdateReq.md)| s3 load balancer group info |
 **groupId** | **Long**| s3 load balancer group id |

### Return type

[**S3LoadBalancerGroupResp**](S3LoadBalancerGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

