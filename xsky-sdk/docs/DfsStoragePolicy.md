# DfsStoragePolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionStatus** | **String** |  |  [optional]
**cluster** | [**ClusterNestview**](ClusterNestview.md) |  |  [optional]
**create** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**dfsPaths** | [**List&lt;DfsPathNestview&gt;**](DfsPathNestview.md) |  |  [optional]
**dfsRootfs** | [**DfsRootfs**](DfsRootfs.md) |  |  [optional]
**dfsStorageClass** | [**DfsTier**](DfsTier.md) |  |  [optional]
**fileCreate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**fileName** | **String** | useless fields, for compatability |  [optional]
**filePath** | **String** |  |  [optional]
**filter** | [**DfsPolicyFilter**](DfsPolicyFilter.md) |  |  [optional]
**fsUser** | [**FSUser**](FSUser.md) |  |  [optional]
**fsUserGroup** | [**FSUserGroup**](FSUserGroup.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**isDefault** | **Boolean** | common properties |  [optional]
**name** | **String** |  |  [optional]
**pathNum** | **Long** |  |  [optional]
**status** | **String** |  |  [optional]
**stretched** | **Boolean** | indicate that all pools under this policy is stretched pool |  [optional]
**type** | **String** |  |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
