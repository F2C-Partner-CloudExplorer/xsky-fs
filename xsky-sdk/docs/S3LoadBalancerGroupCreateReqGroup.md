# S3LoadBalancerGroupCreateReqGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | group description |  [optional]
**httpsPort** | **Long** | group access https port |  [optional]
**name** | **String** | group name | 
**ospZoneId** | **Long** | osp zone id |  [optional]
**ossApiEnabled** | **Boolean** |  |  [optional]
**port** | **Long** | group access http port |  [optional]
**roles** | **List&lt;String&gt;** | group roles |  [optional]
**s3LoadBalancers** | [**List&lt;S3LoadBalancerGroupCreateReqGroupLoadBalancersElt&gt;**](S3LoadBalancerGroupCreateReqGroupLoadBalancersElt.md) | s3 load balancers | 
**searchHttpsPort** | **Long** | group search https port |  [optional]
**searchPort** | **Long** | group search http port |  [optional]
**syncPort** | **Long** | group sync http port |  [optional]
**webServiceConfig** | [**S3LbGroupWebServiceConfig**](S3LbGroupWebServiceConfig.md) |  |  [optional]
**webServicePort** | **Long** | group web service http port |  [optional]
