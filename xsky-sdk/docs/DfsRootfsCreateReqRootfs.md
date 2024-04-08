# DfsRootfsCreateReqRootfs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activePoolIds** | **List&lt;Long&gt;** | id array of active pools |  [optional]
**defaultClassName** | **String** | name of default class |  [optional]
**defaultClassWritePolicy** | **String** | write policy of default class |  [optional]
**description** | **String** | description of rootfs |  [optional]
**dfsAuditLog** | [**DfsRootfsCreateReqRootfsAuditLog**](DfsRootfsCreateReqRootfsAuditLog.md) |  | 
**metadataClusterId** | **Long** | metadata cluster id | 
**name** | **String** | name of rootfs | 
**poolIds** | **List&lt;Long&gt;** | id array of pools |  [optional]
**poolPolicies** | [**List&lt;PoolPolicy&gt;**](PoolPolicy.md) | active pool policy array of default class |  [optional]
**storageClasses** | [**List&lt;CustomStorageClass&gt;**](CustomStorageClass.md) | CustomStorageClasses create custom dfs storage class |  [optional]
