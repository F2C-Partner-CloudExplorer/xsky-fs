# VipGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVIPGroup**](VipGroupsApi.md#createVIPGroup) | **POST** /v1/vip-groups/ | 
[**deleteVIPGroup**](VipGroupsApi.md#deleteVIPGroup) | **DELETE** /v1/vip-groups/{vip_group_id} | 
[**getVIPGroup**](VipGroupsApi.md#getVIPGroup) | **GET** /v1/vip-groups/{vip_group_id} | 
[**listVIPGroups**](VipGroupsApi.md#listVIPGroups) | **GET** /v1/vip-groups/ | 
[**redeployVIPGroup**](VipGroupsApi.md#redeployVIPGroup) | **POST** /v1/vip-groups/{vip_group_id}:redeploy | 
[**updateVIPGroup**](VipGroupsApi.md#updateVIPGroup) | **PATCH** /v1/vip-groups/{vip_group_id} | 

<a name="createVIPGroup"></a>
# **createVIPGroup**
> VIPGroupResp createVIPGroup(body)



Create a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
VIPGroupCreateReq body = new VIPGroupCreateReq(); // VIPGroupCreateReq | vip group info
try {
    VIPGroupResp result = apiInstance.createVIPGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#createVIPGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VIPGroupCreateReq**](VIPGroupCreateReq.md)| vip group info |

### Return type

[**VIPGroupResp**](VIPGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteVIPGroup"></a>
# **deleteVIPGroup**
> VIPGroupResp deleteVIPGroup(vipGroupId)



Delete a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
Long vipGroupId = 789L; // Long | vip group id
try {
    VIPGroupResp result = apiInstance.deleteVIPGroup(vipGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#deleteVIPGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vipGroupId** | **Long**| vip group id |

### Return type

[**VIPGroupResp**](VIPGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVIPGroup"></a>
# **getVIPGroup**
> VIPGroupResp getVIPGroup(vipGroupId)



Get a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
Long vipGroupId = 789L; // Long | vip group id
try {
    VIPGroupResp result = apiInstance.getVIPGroup(vipGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#getVIPGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vipGroupId** | **Long**| vip group id |

### Return type

[**VIPGroupResp**](VIPGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVIPGroups"></a>
# **listVIPGroups**
> VIPGroupResps listVIPGroups(limit, offset, resourceType, resourceId)



List vip groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String resourceType = "resourceType_example"; // String | resource type
Long resourceId = 789L; // Long | resource id
try {
    VIPGroupResps result = apiInstance.listVIPGroups(limit, offset, resourceType, resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#listVIPGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **resourceType** | **String**| resource type | [optional]
 **resourceId** | **Long**| resource id | [optional]

### Return type

[**VIPGroupResps**](VIPGroupResps.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redeployVIPGroup"></a>
# **redeployVIPGroup**
> VIPGroupResp redeployVIPGroup(vipGroupId)



Redeploy a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
Long vipGroupId = 789L; // Long | vip group id
try {
    VIPGroupResp result = apiInstance.redeployVIPGroup(vipGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#redeployVIPGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vipGroupId** | **Long**| vip group id |

### Return type

[**VIPGroupResp**](VIPGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateVIPGroup"></a>
# **updateVIPGroup**
> VIPGroupResp updateVIPGroup(body, vipGroupId)



Update a vip group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VipGroupsApi;

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

VipGroupsApi apiInstance = new VipGroupsApi();
VIPGroupUpdateReq body = new VIPGroupUpdateReq(); // VIPGroupUpdateReq | vip group info
Long vipGroupId = 789L; // Long | vip group id
try {
    VIPGroupResp result = apiInstance.updateVIPGroup(body, vipGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VipGroupsApi#updateVIPGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VIPGroupUpdateReq**](VIPGroupUpdateReq.md)| vip group info |
 **vipGroupId** | **Long**| vip group id |

### Return type

[**VIPGroupResp**](VIPGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

