# CloudVolumeAttachmentsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCloudVolumeAttachments**](CloudVolumeAttachmentsApi.md#listCloudVolumeAttachments) | **GET** /v1/cloud-volume-attachments/ | 

<a name="listCloudVolumeAttachments"></a>
# **listCloudVolumeAttachments**
> CloudVolumeAttachmentsResp listCloudVolumeAttachments(limit, offset, cloudInstanceId)



List cloud volume attachments

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.CloudVolumeAttachmentsApi;

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

CloudVolumeAttachmentsApi apiInstance = new CloudVolumeAttachmentsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long cloudInstanceId = 789L; // Long | cloud instance id
try {
    CloudVolumeAttachmentsResp result = apiInstance.listCloudVolumeAttachments(limit, offset, cloudInstanceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudVolumeAttachmentsApi#listCloudVolumeAttachments");
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

[**CloudVolumeAttachmentsResp**](CloudVolumeAttachmentsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

