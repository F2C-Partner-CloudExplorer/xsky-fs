# DnsGatewayGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDNSGatewayToGroup**](DnsGatewayGroupsApi.md#addDNSGatewayToGroup) | **POST** /v1/dns-gateway-groups/{group_id}:add-gateway | 
[**createDNSGatewayGroup**](DnsGatewayGroupsApi.md#createDNSGatewayGroup) | **POST** /v1/dns-gateway-groups/ | 
[**deleteDNSGatewayGroup**](DnsGatewayGroupsApi.md#deleteDNSGatewayGroup) | **DELETE** /v1/dns-gateway-groups/{group_id} | 
[**getDNSGatewayGroup**](DnsGatewayGroupsApi.md#getDNSGatewayGroup) | **GET** /v1/dns-gateway-groups/{group_id} | 
[**listDNSGatewayGroups**](DnsGatewayGroupsApi.md#listDNSGatewayGroups) | **GET** /v1/dns-gateway-groups/ | 
[**redeployDNSGatewayGroup**](DnsGatewayGroupsApi.md#redeployDNSGatewayGroup) | **POST** /v1/dns-gateway-groups/{group_id}:redeploy | 
[**removeDNSGatewayFromGroup**](DnsGatewayGroupsApi.md#removeDNSGatewayFromGroup) | **POST** /v1/dns-gateway-groups/{group_id}:remove-gateway | 

<a name="addDNSGatewayToGroup"></a>
# **addDNSGatewayToGroup**
> DNSGatewayGroupResp addDNSGatewayToGroup(body, groupId)



Add DNS gateways to DNS gateway group.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
DNSGatewayGroupAddGatewayReq body = new DNSGatewayGroupAddGatewayReq(); // DNSGatewayGroupAddGatewayReq | DNS gateway info
Long groupId = 789L; // Long | dns gateway group id
try {
    DNSGatewayGroupResp result = apiInstance.addDNSGatewayToGroup(body, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#addDNSGatewayToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSGatewayGroupAddGatewayReq**](DNSGatewayGroupAddGatewayReq.md)| DNS gateway info |
 **groupId** | **Long**| dns gateway group id |

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDNSGatewayGroup"></a>
# **createDNSGatewayGroup**
> DNSGatewayGroupResp createDNSGatewayGroup(body)



Create a DNS gateway group.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
DNSGatewayGroupCreateReq body = new DNSGatewayGroupCreateReq(); // DNSGatewayGroupCreateReq | DNS gateway group info
try {
    DNSGatewayGroupResp result = apiInstance.createDNSGatewayGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#createDNSGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSGatewayGroupCreateReq**](DNSGatewayGroupCreateReq.md)| DNS gateway group info |

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDNSGatewayGroup"></a>
# **deleteDNSGatewayGroup**
> DNSGatewayGroupResp deleteDNSGatewayGroup(groupId, force)



Delete a DNS gateway group.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
Long groupId = 789L; // Long | dns gateway group id
Boolean force = true; // Boolean | force delete or not
try {
    DNSGatewayGroupResp result = apiInstance.deleteDNSGatewayGroup(groupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#deleteDNSGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| dns gateway group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDNSGatewayGroup"></a>
# **getDNSGatewayGroup**
> DNSGatewayGroupResp getDNSGatewayGroup(groupId)



Get a dns gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
Long groupId = 789L; // Long | dns gateway group id
try {
    DNSGatewayGroupResp result = apiInstance.getDNSGatewayGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#getDNSGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| dns gateway group id |

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDNSGatewayGroups"></a>
# **listDNSGatewayGroups**
> DNSGatewayGroupsResp listDNSGatewayGroups(limit, offset, clusterId)



List dns gateway groups

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String clusterId = "clusterId_example"; // String | cluster id
try {
    DNSGatewayGroupsResp result = apiInstance.listDNSGatewayGroups(limit, offset, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#listDNSGatewayGroups");
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

[**DNSGatewayGroupsResp**](DNSGatewayGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redeployDNSGatewayGroup"></a>
# **redeployDNSGatewayGroup**
> DNSGatewayGroupResp redeployDNSGatewayGroup(groupId)



Redeploy a DNS gateway group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
Long groupId = 789L; // Long | dns gateway group id
try {
    DNSGatewayGroupResp result = apiInstance.redeployDNSGatewayGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#redeployDNSGatewayGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| dns gateway group id |

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDNSGatewayFromGroup"></a>
# **removeDNSGatewayFromGroup**
> DNSGatewayGroupResp removeDNSGatewayFromGroup(body, groupId, force)



Remove DNS gateways from group.

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DnsGatewayGroupsApi;

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

DnsGatewayGroupsApi apiInstance = new DnsGatewayGroupsApi();
DNSGatewayGroupRemoveGatewayReq body = new DNSGatewayGroupRemoveGatewayReq(); // DNSGatewayGroupRemoveGatewayReq | DNS gateway info
Long groupId = 789L; // Long | dns gateway group id
Boolean force = true; // Boolean | force delete or not
try {
    DNSGatewayGroupResp result = apiInstance.removeDNSGatewayFromGroup(body, groupId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsGatewayGroupsApi#removeDNSGatewayFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DNSGatewayGroupRemoveGatewayReq**](DNSGatewayGroupRemoveGatewayReq.md)| DNS gateway info |
 **groupId** | **Long**| dns gateway group id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**DNSGatewayGroupResp**](DNSGatewayGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

