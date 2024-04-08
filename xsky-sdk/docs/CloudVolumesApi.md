# CloudVolumesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudVolume**](CloudVolumesApi.md#getCloudVolume) | **GET** /v1/cloud-volumes/{cloud_volume_id} | 
[**listCloudVolumes**](CloudVolumesApi.md#listCloudVolumes) | **GET** /v1/cloud-volumes/ | 

<a name="getCloudVolume"></a>
# **getCloudVolume**
> CloudVolumeResp getCloudVolume(cloudVolumeId)



Get a cloud volume

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudVolumesApi;

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

CloudVolumesApi apiInstance = new CloudVolumesApi();
Long cloudVolumeId = 789L; // Long | cloud volume id
try {
    CloudVolumeResp result = apiInstance.getCloudVolume(cloudVolumeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudVolumesApi#getCloudVolume");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudVolumeId** | **Long**| cloud volume id |

### Return type

[**CloudVolumeResp**](CloudVolumeResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCloudVolumes"></a>
# **listCloudVolumes**
> CloudVolumesResp listCloudVolumes(limit, offset, cloudInstanceId)



List cloud volumes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudVolumesApi;

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

CloudVolumesApi apiInstance = new CloudVolumesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long cloudInstanceId = 789L; // Long | cloud instance id
try {
    CloudVolumesResp result = apiInstance.listCloudVolumes(limit, offset, cloudInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudVolumesApi#listCloudVolumes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **cloudInstanceId** | **Long**| cloud instance id | [optional]

### Return type

[**CloudVolumesResp**](CloudVolumesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

