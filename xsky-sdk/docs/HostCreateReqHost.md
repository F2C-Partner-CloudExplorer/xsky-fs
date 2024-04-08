# HostCreateReqHost

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adminIp** | **String** | admin ip | 
**clusterId** | **Long** | cluster id | 
**description** | **String** | host description |  [optional]
**gatewayIps** | **List&lt;String&gt;** | gateway ips for s3 |  [optional]
**metaDevice** | **String** | meta device for docker |  [optional]
**ospClusterId** | **Long** | osp cluster id |  [optional]
**ospClusterIp** | **String** | osp cluster ip |  [optional]
**ospGatewayIps** | **List&lt;String&gt;** | osp gateway ips |  [optional]
**privateIp** | **String** | cluster private ip for internal data access |  [optional]
**protectionDomainId** | **Long** | deprecated |  [optional]
**publicIp** | **String** | public ip for outside data access |  [optional]
**roles** | **List&lt;String&gt;** | host roles: admin,monitor,block_storage_gateway,file_storage_gateway,s3_gateway,nfs_gateway |  [optional]
**type** | **String** | storage server or storage client |  [optional]
