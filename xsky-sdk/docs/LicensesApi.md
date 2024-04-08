# LicensesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableLicense**](LicensesApi.md#disableLicense) | **POST** /v1/licenses/{license_id}:disable | 
[**downloadLicenseKey**](LicensesApi.md#downloadLicenseKey) | **GET** /v1/licenses/key | 
[**getLicense**](LicensesApi.md#getLicense) | **GET** /v1/licenses/{license_id} | 
[**getLicenseSummary**](LicensesApi.md#getLicenseSummary) | **GET** /v1/licenses/summary | 
[**listLicenses**](LicensesApi.md#listLicenses) | **GET** /v1/licenses/ | 
[**registerLicense**](LicensesApi.md#registerLicense) | **POST** /v1/licenses/ | 

<a name="disableLicense"></a>
# **disableLicense**
> LicenseResp disableLicense(licenseId, force)



disable license

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.LicensesApi;

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

LicensesApi apiInstance = new LicensesApi();
Long licenseId = 789L; // Long | the license id
Boolean force = true; // Boolean | force disable not expired license
try {
    LicenseResp result = apiInstance.disableLicense(licenseId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#disableLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseId** | **Long**| the license id |
 **force** | **Boolean**| force disable not expired license | [optional]

### Return type

[**LicenseResp**](LicenseResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadLicenseKey"></a>
# **downloadLicenseKey**
> File downloadLicenseKey()



get license key file

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.LicensesApi;


LicensesApi apiInstance = new LicensesApi();
try {
    File result = apiInstance.downloadLicenseKey();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#downloadLicenseKey");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getLicense"></a>
# **getLicense**
> LicenseResp getLicense(licenseId)



get license

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.LicensesApi;

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

LicensesApi apiInstance = new LicensesApi();
Long licenseId = 789L; // Long | the license id
try {
    LicenseResp result = apiInstance.getLicense(licenseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseId** | **Long**| the license id |

### Return type

[**LicenseResp**](LicenseResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLicenseSummary"></a>
# **getLicenseSummary**
> LicenseSummaryResp getLicenseSummary()



Get licenses sumary

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.LicensesApi;


LicensesApi apiInstance = new LicensesApi();
try {
    LicenseSummaryResp result = apiInstance.getLicenseSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#getLicenseSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseSummaryResp**](LicenseSummaryResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLicenses"></a>
# **listLicenses**
> LicensesResp listLicenses(limit, offset, q, sort, active)



List licenses

### Example
```java
// Import classes:
//import xio.sds.client.ApiException;
//import xio.sds.client.api.LicensesApi;


LicensesApi apiInstance = new LicensesApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
Boolean active = true; // Boolean | filter license by active status
try {
    LicensesResp result = apiInstance.listLicenses(limit, offset, q, sort, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#listLicenses");
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
 **active** | **Boolean**| filter license by active status | [optional]

### Return type

[**LicensesResp**](LicensesResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registerLicense"></a>
# **registerLicense**
> LicenseResp registerLicense(license, force, dryRun)



Activate product license

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.LicensesApi;

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

LicensesApi apiInstance = new LicensesApi();
File license = new File("license_example"); // File | 
Boolean force = true; // Boolean | force activate
Boolean dryRun = true; // Boolean | dry run upload license file
try {
    LicenseResp result = apiInstance.registerLicense(license, force, dryRun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicensesApi#registerLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **license** | **File**|  |
 **force** | **Boolean**| force activate | [optional]
 **dryRun** | **Boolean**| dry run upload license file | [optional]

### Return type

[**LicenseResp**](LicenseResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

