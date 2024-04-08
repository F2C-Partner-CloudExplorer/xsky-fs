# VolumeDpBlockBackupPolicyMappingsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listVolumeDpBlockBackupPolicyMappings**](VolumeDpBlockBackupPolicyMappingsApi.md#listVolumeDpBlockBackupPolicyMappings) | **GET** /v1/volume-dp-block-backup-policy-mappings/ | 

<a name="listVolumeDpBlockBackupPolicyMappings"></a>
# **listVolumeDpBlockBackupPolicyMappings**
> VolumeDpBlockBackupPolicyMappingsResp listVolumeDpBlockBackupPolicyMappings(blockVolumeId, dpBlockBackupPolicyId)



List volume dp block backup policy mapping

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.VolumeDpBlockBackupPolicyMappingsApi;

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

VolumeDpBlockBackupPolicyMappingsApi apiInstance = new VolumeDpBlockBackupPolicyMappingsApi();
Long blockVolumeId = 789L; // Long | show mappings of specific block volume
Long dpBlockBackupPolicyId = 789L; // Long | show mappings of specific block volume
try {
    VolumeDpBlockBackupPolicyMappingsResp result = apiInstance.listVolumeDpBlockBackupPolicyMappings(blockVolumeId, dpBlockBackupPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VolumeDpBlockBackupPolicyMappingsApi#listVolumeDpBlockBackupPolicyMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockVolumeId** | **Long**| show mappings of specific block volume | [optional]
 **dpBlockBackupPolicyId** | **Long**| show mappings of specific block volume | [optional]

### Return type

[**VolumeDpBlockBackupPolicyMappingsResp**](VolumeDpBlockBackupPolicyMappingsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

