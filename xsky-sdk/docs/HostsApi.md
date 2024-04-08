# HostsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHost**](HostsApi.md#createHost) | **POST** /v1/hosts/ | 
[**deleteHost**](HostsApi.md#deleteHost) | **DELETE** /v1/hosts/{host_id} | 
[**deleteHostsGatewayLbGroup**](HostsApi.md#deleteHostsGatewayLbGroup) | **POST** /v1/hosts/:delete-hosts-gateway-lb-group | 
[**getHost**](HostsApi.md#getHost) | **GET** /v1/hosts/{host_id} | 
[**getHostSamples**](HostsApi.md#getHostSamples) | **GET** /v1/hosts/{host_id}/samples | 
[**hostDeletable**](HostsApi.md#hostDeletable) | **GET** /v1/hosts/{host_id}:host-deletable | 
[**listHosts**](HostsApi.md#listHosts) | **GET** /v1/hosts/ | 
[**maintainHost**](HostsApi.md#maintainHost) | **POST** /v1/hosts/{host_id}:maintain | 
[**removeHostsFormOspZone**](HostsApi.md#removeHostsFormOspZone) | **POST** /v1/hosts/:remove-hosts-from-osp-zone | 
[**setHostsToOspZone**](HostsApi.md#setHostsToOspZone) | **POST** /v1/hosts/:add-hosts-to-osp-zone | 
[**unmaintainHost**](HostsApi.md#unmaintainHost) | **POST** /v1/hosts/{host_id}:unmaintain | 
[**updateHost**](HostsApi.md#updateHost) | **PATCH** /v1/hosts/{host_id} | 

<a name="createHost"></a>
# **createHost**
> HostResp createHost(body, clusterId)



check env and install packages

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
HostCreateReq body = new HostCreateReq(); // HostCreateReq | host info
String clusterId = "clusterId_example"; // String | cluster id
try {
    HostResp result = apiInstance.createHost(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#createHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostCreateReq**](HostCreateReq.md)| host info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHost"></a>
# **deleteHost**
> HostResp deleteHost(hostId, force)



delete host

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | host id
Boolean force = true; // Boolean | force delete or not
try {
    HostResp result = apiInstance.deleteHost(hostId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#deleteHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| host id |
 **force** | **Boolean**| force delete or not | [optional]

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteHostsGatewayLbGroup"></a>
# **deleteHostsGatewayLbGroup**
> deleteHostsGatewayLbGroup(body)



delete hosts gateway load balancer group from osp zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
DeleteHostsGatewayLbGroupOpReq body = new DeleteHostsGatewayLbGroupOpReq(); // DeleteHostsGatewayLbGroupOpReq | osp zone info
try {
    apiInstance.deleteHostsGatewayLbGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#deleteHostsGatewayLbGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteHostsGatewayLbGroupOpReq**](DeleteHostsGatewayLbGroupOpReq.md)| osp zone info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getHost"></a>
# **getHost**
> HostResp getHost(hostId)



get a host info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | the host id
try {
    HostResp result = apiInstance.getHost(hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#getHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| the host id |

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHostSamples"></a>
# **getHostSamples**
> HostSamplesResp getHostSamples(hostId, durationBegin, durationEnd, period)



get a host&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | host id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    HostSamplesResp result = apiInstance.getHostSamples(hostId, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#getHostSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| host id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**HostSamplesResp**](HostSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hostDeletable"></a>
# **hostDeletable**
> HostResp hostDeletable(hostId)



check host deletable

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | host id
try {
    HostResp result = apiInstance.hostDeletable(hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#hostDeletable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| host id |

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHosts"></a>
# **listHosts**
> HostsResp listHosts(limit, offset, protectionDomainId, clusterId, ospClusterId, hostname, type, role, fcAvailable, replicationGatewayAvailable, ospZoneId, datacenterIds, usage, withS3Lb, q, sort)



List hosts by fileter

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long protectionDomainId = 789L; // Long | protection domain id
String clusterId = "clusterId_example"; // String | cluster id
String ospClusterId = "ospClusterId_example"; // String | osp cluster id
String hostname = "hostname_example"; // String | host name
String type = "type_example"; // String | if it existed, value should be xdcactive
String role = "role_example"; // String | filter by host role
Boolean fcAvailable = true; // Boolean | available host with fc port
Boolean replicationGatewayAvailable = true; // Boolean | available host for replication gateway
Long ospZoneId = 789L; // Long | osp zone id
Long datacenterIds = 789L; // Long | datacenter ids
String usage = "usage_example"; // String | host usage
Boolean withS3Lb = true; // Boolean | host used by s3 load balancer
String q = "q_example"; // String | query param of search
String sort = "sort_example"; // String | sort param of search
try {
    HostsResp result = apiInstance.listHosts(limit, offset, protectionDomainId, clusterId, ospClusterId, hostname, type, role, fcAvailable, replicationGatewayAvailable, ospZoneId, datacenterIds, usage, withS3Lb, q, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#listHosts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **protectionDomainId** | **Long**| protection domain id | [optional]
 **clusterId** | **String**| cluster id | [optional]
 **ospClusterId** | **String**| osp cluster id | [optional]
 **hostname** | **String**| host name | [optional]
 **type** | **String**| if it existed, value should be xdcactive | [optional]
 **role** | **String**| filter by host role | [optional]
 **fcAvailable** | **Boolean**| available host with fc port | [optional]
 **replicationGatewayAvailable** | **Boolean**| available host for replication gateway | [optional]
 **ospZoneId** | **Long**| osp zone id | [optional]
 **datacenterIds** | **Long**| datacenter ids | [optional]
 **usage** | **String**| host usage | [optional]
 **withS3Lb** | **Boolean**| host used by s3 load balancer | [optional]
 **q** | **String**| query param of search | [optional]
 **sort** | **String**| sort param of search | [optional]

### Return type

[**HostsResp**](HostsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="maintainHost"></a>
# **maintainHost**
> HostResp maintainHost(hostId, force)



Put host in maintanence mode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | host id
Boolean force = true; // Boolean | force maintain
try {
    HostResp result = apiInstance.maintainHost(hostId, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#maintainHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| host id |
 **force** | **Boolean**| force maintain | [optional]

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeHostsFormOspZone"></a>
# **removeHostsFormOspZone**
> removeHostsFormOspZone(body)



remove hosts form osp zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
OpHostsZoneReq body = new OpHostsZoneReq(); // OpHostsZoneReq | hosts cluster osp zone info
try {
    apiInstance.removeHostsFormOspZone(body);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#removeHostsFormOspZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpHostsZoneReq**](OpHostsZoneReq.md)| hosts cluster osp zone info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="setHostsToOspZone"></a>
# **setHostsToOspZone**
> setHostsToOspZone(body)



Set hosts to osp zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
OpHostsZoneReq body = new OpHostsZoneReq(); // OpHostsZoneReq | hosts cluster osp zone info
try {
    apiInstance.setHostsToOspZone(body);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#setHostsToOspZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpHostsZoneReq**](OpHostsZoneReq.md)| hosts cluster osp zone info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="unmaintainHost"></a>
# **unmaintainHost**
> HostResp unmaintainHost(hostId)



Put host out of maintanence mode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
Long hostId = 789L; // Long | host id
try {
    HostResp result = apiInstance.unmaintainHost(hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#unmaintainHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostId** | **Long**| host id |

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHost"></a>
# **updateHost**
> HostResp updateHost(body, hostId)



update host info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.HostsApi;

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

HostsApi apiInstance = new HostsApi();
HostUpdateReq body = new HostUpdateReq(); // HostUpdateReq | host info
Long hostId = 789L; // Long | host id
try {
    HostResp result = apiInstance.updateHost(body, hostId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HostsApi#updateHost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostUpdateReq**](HostUpdateReq.md)| host info |
 **hostId** | **Long**| host id |

### Return type

[**HostResp**](HostResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

