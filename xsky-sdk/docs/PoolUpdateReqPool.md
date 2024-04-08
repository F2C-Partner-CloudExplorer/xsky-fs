# PoolUpdateReqPool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compressAlgorithm** | **String** |  |  [optional]
**compressed** | **Boolean** |  |  [optional]
**defaultManagedVolumeFormat** | **Long** | default managed volume format: 128 or 129 |  [optional]
**failureDomainType** | **String** |  |  [optional]
**ioBypassEnabled** | **Boolean** |  |  [optional]
**ioBypassMode** | **String** |  |  [optional]
**ioBypassThreshold** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**outFailureDomainNum** | **Long** | ec k+m:h&lt;-&gt;k+m |  [optional]
**primaryPlacementNodeId** | **Long** |  |  [optional]
**property** | [**Map&lt;String, RawMessage&gt;**](RawMessage.md) |  |  [optional]
**qos** | [**OsdQos**](OsdQos.md) |  |  [optional]
**ruleset** | [**List&lt;PoolRuleReq&gt;**](PoolRuleReq.md) |  |  [optional]
**size** | **Long** |  |  [optional]
**thinProvisioned** | **Boolean** |  |  [optional]
