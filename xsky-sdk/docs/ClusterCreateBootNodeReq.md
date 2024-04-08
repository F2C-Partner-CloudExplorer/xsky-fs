# ClusterCreateBootNodeReq

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gatewayIps** | **List&lt;String&gt;** | gateway ips for s3 |  [optional]
**gatewayNetwork** | **String** | gateway network |  [optional]
**hostId** | **Long** | boot node host id | 
**privateIp** | **String** | cluster private ip for internal data access |  [optional]
**privateNetwork** | **String** | private network | 
**publicIp** | **String** | public ip for outside data access |  [optional]
**publicNetwork** | **String** | public network | 
**roles** | **List&lt;String&gt;** | host roles: admin,monitor,block_storage_gateway,file_storage_gateway,s3_gateway,nfs_gateway |  [optional]
