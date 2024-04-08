# VolumeCreateReqVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockSnapshotId** | **Long** | id of related block volume snapshot |  [optional]
**crcCheck** | **Boolean** | crc check or not |  [optional]
**description** | **String** | description of volume |  [optional]
**flattened** | **Boolean** | flatten or not flatten |  [optional]
**format** | **Long** | volume format: { 128 | 129 (advanced) }, default 128 |  [optional]
**name** | **String** | name of volume | 
**performancePriority** | **Long** | performance priority: { 0 | 1 }, default 0 |  [optional]
**poolId** | **Long** | id of pool belonged to | 
**qos** | [**VolumeQosSpec**](VolumeQosSpec.md) |  |  [optional]
**qosEnabled** | **Boolean** | enable or disable the qos |  [optional]
**remoteClusterFsId** | **String** | replication remote cluster fsid |  [optional]
**replicationPool** | **String** | replication peer pool |  [optional]
**replicationPoolId** | **Long** | replication peer pool id |  [optional]
**replicationPoolName** | **String** | replication peer pool name |  [optional]
**replicationVersion** | **Long** | replication version |  [optional]
**replicationVolume** | **String** | replication peer volume |  [optional]
**replicationVolumeId** | **Long** | replication peer volume id |  [optional]
**replicationVolumeName** | **String** | replication peer volume name |  [optional]
**size** | **Long** | size of volume |  [optional]
**sn** | **String** | volume sn, used when creating replication volume |  [optional]
**snapshotReplicationPool** | **String** | snapshot replication peer pool |  [optional]
**snapshotReplicationPoolId** | **Long** | snapshot replication peer pool id |  [optional]
**snapshotReplicationVolume** | **String** | snapshot replication peer volume |  [optional]
**snapshotReplicationVolumeId** | **Long** | snapshot replication peer volume id |  [optional]
**uid** | **String** | UID of volume |  [optional]
