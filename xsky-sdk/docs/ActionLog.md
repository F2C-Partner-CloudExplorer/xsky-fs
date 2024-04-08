# ActionLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  |  [optional]
**clientIp** | **String** |  |  [optional]
**cluster** | [**ClusterNestview**](ClusterNestview.md) |  |  [optional]
**create** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**finish** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**message** | **String** |  |  [optional]
**newData** | **Object** |  |  [optional]
**oldData** | **Object** |  |  [optional]
**ospCluster** | [**ClusterNestview**](ClusterNestview.md) |  |  [optional]
**parameter** | **String** |  |  [optional]
**parent** | [**ActionLogNestview**](ActionLogNestview.md) |  |  [optional]
**relatedResources** | **List&lt;Object&gt;** |  |  [optional]
**resourceId** | **Long** |  |  [optional]
**resourceKey** | **String** | key for resources not managed by us, can be used as resource id |  [optional]
**resourceType** | **String** |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | **String** |  |  [optional]
**user** | [**UserNestview**](UserNestview.md) |  |  [optional]
