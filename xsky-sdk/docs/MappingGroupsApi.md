# MappingGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVolumes**](MappingGroupsApi.md#addVolumes) | **POST** /v1/mapping-groups/{mapping_group_id}/block-volumes | 
[**createMappingGroup**](MappingGroupsApi.md#createMappingGroup) | **POST** /v1/mapping-groups/ | 
[**deleteMappingGroup**](MappingGroupsApi.md#deleteMappingGroup) | **DELETE** /v1/mapping-groups/{mapping_group_id} | 
[**getMappingGroup**](MappingGroupsApi.md#getMappingGroup) | **GET** /v1/mapping-groups/{mapping_group_id} | 
[**listMappingGroups**](MappingGroupsApi.md#listMappingGroups) | **GET** /v1/mapping-groups/ | 
[**removeVolumes**](MappingGroupsApi.md#removeVolumes) | **DELETE** /v1/mapping-groups/{mapping_group_id}/block-volumes | 
[**updateMappingGroup**](MappingGroupsApi.md#updateMappingGroup) | **PATCH** /v1/mapping-groups/{mapping_group_id} | 
[**updateMappingGroupClientGroup**](MappingGroupsApi.md#updateMappingGroupClientGroup) | **PATCH** /v1/mapping-groups/{mapping_group_id}/client-group | 

<a name="addVolumes"></a>
# **addVolumes**
> MappingGroupResp addVolumes(body, mappingGroupId)



add volumes to mapping group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
MappingGroupAddVolumesReq body = new MappingGroupAddVolumesReq(); // MappingGroupAddVolumesReq | block volume ids
Long mappingGroupId = 789L; // Long | mapping group id
try {
    MappingGroupResp result = apiInstance.addVolumes(body, mappingGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#addVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingGroupAddVolumesReq**](MappingGroupAddVolumesReq.md)| block volume ids |
 **mappingGroupId** | **Long**| mapping group id |

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMappingGroup"></a>
# **createMappingGroup**
> MappingGroupResp createMappingGroup(body)



create a mapping group in access path

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
MappingGroupCreateReq body = new MappingGroupCreateReq(); // MappingGroupCreateReq | mapping info
try {
    MappingGroupResp result = apiInstance.createMappingGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#createMappingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingGroupCreateReq**](MappingGroupCreateReq.md)| mapping info |

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMappingGroup"></a>
# **deleteMappingGroup**
> MappingGroupResp deleteMappingGroup(mappingGroupId, force)



Delete mapping group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
Long mappingGroupId = 789L; // Long | mapping group id
Boolean force = true; // Boolean | force delete or not
try {
    MappingGroupResp result = apiInstance.deleteMappingGroup(mappingGroupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#deleteMappingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingGroupId** | **Long**| mapping group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMappingGroup"></a>
# **getMappingGroup**
> MappingGroupResp getMappingGroup(mappingGroupId)



Get mapping group by id

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
Long mappingGroupId = 789L; // Long | mapping group id
try {
    MappingGroupResp result = apiInstance.getMappingGroup(mappingGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#getMappingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingGroupId** | **Long**| mapping group id |

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMappingGroups"></a>
# **listMappingGroups**
> MappingGroupsResp listMappingGroups(limit, offset, accessPathId, clientGroupId)



List mapping groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long accessPathId = 789L; // Long | access path id
Long clientGroupId = 789L; // Long | client group id
try {
    MappingGroupsResp result = apiInstance.listMappingGroups(limit, offset, accessPathId, clientGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#listMappingGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **accessPathId** | **Long**| access path id | [optional]
 **clientGroupId** | **Long**| client group id | [optional]

### Return type

[**MappingGroupsResp**](MappingGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeVolumes"></a>
# **removeVolumes**
> MappingGroupResp removeVolumes(body, mappingGroupId, force)



remove volumes from mapping group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
MappingGroupRemoveVolumesReq body = new MappingGroupRemoveVolumesReq(); // MappingGroupRemoveVolumesReq | block volume ids
Long mappingGroupId = 789L; // Long | mapping group id
Boolean force = true; // Boolean | force delete or not
try {
    MappingGroupResp result = apiInstance.removeVolumes(body, mappingGroupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#removeVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingGroupRemoveVolumesReq**](MappingGroupRemoveVolumesReq.md)| block volume ids |
 **mappingGroupId** | **Long**| mapping group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMappingGroup"></a>
# **updateMappingGroup**
> MappingGroupResp updateMappingGroup(body, mappingGroupId)



update mapping group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
MappingGroupUpdateReq body = new MappingGroupUpdateReq(); // MappingGroupUpdateReq | mapping info
Long mappingGroupId = 789L; // Long | mapping group id
try {
    MappingGroupResp result = apiInstance.updateMappingGroup(body, mappingGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#updateMappingGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingGroupUpdateReq**](MappingGroupUpdateReq.md)| mapping info |
 **mappingGroupId** | **Long**| mapping group id |

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMappingGroupClientGroup"></a>
# **updateMappingGroupClientGroup**
> MappingGroupResp updateMappingGroupClientGroup(body, mappingGroupId)



update client group in mapping group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.MappingGroupsApi;

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

MappingGroupsApi apiInstance = new MappingGroupsApi();
MappingGroupUpdateClientGroupReq body = new MappingGroupUpdateClientGroupReq(); // MappingGroupUpdateClientGroupReq | client group id
Long mappingGroupId = 789L; // Long | mapping group id
try {
    MappingGroupResp result = apiInstance.updateMappingGroupClientGroup(body, mappingGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MappingGroupsApi#updateMappingGroupClientGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MappingGroupUpdateClientGroupReq**](MappingGroupUpdateClientGroupReq.md)| client group id |
 **mappingGroupId** | **Long**| mapping group id |

### Return type

[**MappingGroupResp**](MappingGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

