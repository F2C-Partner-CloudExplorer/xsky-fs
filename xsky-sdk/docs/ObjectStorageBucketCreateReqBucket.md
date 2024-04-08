# ObjectStorageBucketCreateReqBucket

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allUserPermission** | **String** | permission setting of all users |  [optional]
**authUserPermission** | **String** | permission setting of authenticated users |  [optional]
**deleteArchiveStorageClass** | **String** | delete archive storage class |  [optional]
**description** | **String** | bucket description |  [optional]
**externalQuotaMaxObjects** | **Long** | max number of external storage objects |  [optional]
**externalQuotaMaxSize** | **Long** | max size of external storage objects |  [optional]
**flag** | [**BucketFlag**](BucketFlag.md) |  |  [optional]
**localQuotaMaxObjects** | **Long** | max number of local storage objects |  [optional]
**localQuotaMaxSize** | **Long** | max size of local storage objects |  [optional]
**logDeliveryPermission** | **String** | permission setting of log delivery group |  [optional]
**name** | **String** | bucket name | 
**objectCover** | [**OSBucketObjectCoverConf**](OSBucketObjectCoverConf.md) |  |  [optional]
**objectStorageClass** | [**OSBucketObjectStorageClass**](OSBucketObjectStorageClass.md) |  |  [optional]
**ownerId** | **Long** | bucket owner | 
**ownerPermission** | **String** | permission setting of owner |  [optional]
**policyId** | **Long** | storage policy | 
**quotaMaxObjects** | **Long** | max number of objects |  [optional]
**quotaMaxSize** | **Long** | max size of all objects |  [optional]
**restoreDays** | **Long** | restore expiration days |  [optional]
**specificationObjects** | **Long** | specification objects |  [optional]
