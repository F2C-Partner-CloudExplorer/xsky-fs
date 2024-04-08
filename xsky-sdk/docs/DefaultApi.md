# DefaultApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ospAccessSecretKeyConfigResp**](DefaultApi.md#ospAccessSecretKeyConfigResp) | **POST** /v2/os/access-keys/access-keys-config/ | 
[**ospAddDataBackendsToZone**](DefaultApi.md#ospAddDataBackendsToZone) | **POST** /v2/os/zones/{id}:add-data-backends | 
[**ospAddHostsIntoZone**](DefaultApi.md#ospAddHostsIntoZone) | **POST** /v2/os/zones/{id}:add-hosts | 
[**ospCheckDataBackendUnique**](DefaultApi.md#ospCheckDataBackendUnique) | **POST** /v2/os/data-backends/:check-unique | 
[**ospCleanRecycleBuckets**](DefaultApi.md#ospCleanRecycleBuckets) | **DELETE** /v2/os/bucket-recycle-bin/ | 
[**ospCompactTakeover**](DefaultApi.md#ospCompactTakeover) | **GET** /v2/os/admin-command[Post] | 
[**ospCreateAccessKey**](DefaultApi.md#ospCreateAccessKey) | **POST** /v2/os/access-keys/access-keys/ | 
[**ospCreateAccessKeyByUserName**](DefaultApi.md#ospCreateAccessKeyByUserName) | **POST** /v2/os/access-keys/access-keys/by-user-name/ | 
[**ospCreateBucket**](DefaultApi.md#ospCreateBucket) | **POST** /v2/os/buckets/ | 
[**ospCreateBucketNFSGatewayMap**](DefaultApi.md#ospCreateBucketNFSGatewayMap) | **POST** /v2/os/buckets/{id}/nfs-gateway-maps | 
[**ospCreateBucketOriginRule**](DefaultApi.md#ospCreateBucketOriginRule) | **POST** /v2/os/buckets/{id}/origin-rules | 
[**ospCreateBucketRebuildRule**](DefaultApi.md#ospCreateBucketRebuildRule) | **POST** /v2/os/buckets/{id}/rebuild-rules | 
[**ospCreateBucketReplicationRule**](DefaultApi.md#ospCreateBucketReplicationRule) | **POST** /v2/os/buckets/{id}/replication-rules | 
[**ospCreateBucketSnapshot**](DefaultApi.md#ospCreateBucketSnapshot) | **POST** /v2/os/buckets/{id}:create-snapshot | 
[**ospCreateBucketSyncReplicationGroup**](DefaultApi.md#ospCreateBucketSyncReplicationGroup) | **POST** /v2/os/buckets/{id}/sync-replication-groups | 
[**ospCreateBucketSyncRule**](DefaultApi.md#ospCreateBucketSyncRule) | **POST** /v2/os/buckets/{id}/sync-rules | 
[**ospCreateClusterWithOutside**](DefaultApi.md#ospCreateClusterWithOutside) | **POST** /v2/os/clusters-outside/ | 
[**ospCreateDataBackend**](DefaultApi.md#ospCreateDataBackend) | **POST** /v2/os/data-backends/ | 
[**ospCreateDataBackendValidator**](DefaultApi.md#ospCreateDataBackendValidator) | **POST** /v2/os/data-backend-validators/ | 
[**ospCreateEventTarget**](DefaultApi.md#ospCreateEventTarget) | **POST** /v2/os/event-target/ | 
[**ospCreateRole**](DefaultApi.md#ospCreateRole) | **POST** /v2/os/ | 
[**ospCreateStoragePolicy**](DefaultApi.md#ospCreateStoragePolicy) | **POST** /v2/os/storage-policies/ | 
[**ospCreateUser**](DefaultApi.md#ospCreateUser) | **POST** /v2/os/users/ | 
[**ospCreateZone**](DefaultApi.md#ospCreateZone) | **POST** /v2/os/zones/ | 
[**ospCreateZoneGroup**](DefaultApi.md#ospCreateZoneGroup) | **POST** /v2/os/zone-groups/ | 
[**ospDeleteAccessKey**](DefaultApi.md#ospDeleteAccessKey) | **DELETE** /v2/os/access-keys/access-keys/{id} | 
[**ospDeleteBucket**](DefaultApi.md#ospDeleteBucket) | **DELETE** /v2/os/buckets/{id} | 
[**ospDeleteBucketByName**](DefaultApi.md#ospDeleteBucketByName) | **DELETE** /v2/os/buckets/bucket-name/{name} | 
[**ospDeleteBucketNFSGatewayMap**](DefaultApi.md#ospDeleteBucketNFSGatewayMap) | **DELETE** /v2/os/buckets/{id}/nfs-gateway-maps/{map_id} | 
[**ospDeleteBucketNFSGatewayMaps**](DefaultApi.md#ospDeleteBucketNFSGatewayMaps) | **DELETE** /v2/os/ | 
[**ospDeleteBucketOriginRule**](DefaultApi.md#ospDeleteBucketOriginRule) | **DELETE** /v2/os/buckets/{id}/origin-rules/{rule_id} | 
[**ospDeleteBucketRebuildRule**](DefaultApi.md#ospDeleteBucketRebuildRule) | **DELETE** /v2/os/buckets/{id}/rebuild-rules/{rule_id} | 
[**ospDeleteBucketReplicationRule**](DefaultApi.md#ospDeleteBucketReplicationRule) | **DELETE** /v2/os/buckets/{id}/replication-rules/{rule_id} | 
[**ospDeleteBucketSnapshots**](DefaultApi.md#ospDeleteBucketSnapshots) | **POST** /v2/os/buckets/{id}/delete-snapshots | 
[**ospDeleteBucketSyncReplicationGroup**](DefaultApi.md#ospDeleteBucketSyncReplicationGroup) | **DELETE** /v2/os/buckets/{id}/sync-replication-groups/{group_id} | 
[**ospDeleteBucketSyncRule**](DefaultApi.md#ospDeleteBucketSyncRule) | **DELETE** /v2/os/buckets/{id}/sync-rules/{rule_id} | 
[**ospDeleteDataBackend**](DefaultApi.md#ospDeleteDataBackend) | **DELETE** /v2/os/data-backends/{id} | 
[**ospDeleteEventTarget**](DefaultApi.md#ospDeleteEventTarget) | **DELETE** /v2/os/event-target/{id} | 
[**ospDeleteRecycleBucket**](DefaultApi.md#ospDeleteRecycleBucket) | **DELETE** /v2/os/bucket-recycle-bin/{bucket_id} | 
[**ospDeleteRole**](DefaultApi.md#ospDeleteRole) | **DELETE** /v2/os/{id} | 
[**ospDeleteStorageClass**](DefaultApi.md#ospDeleteStorageClass) | **POST** /v2/os/storage-policies/{id}:delete-storage-class | 
[**ospDeleteStoragePolicy**](DefaultApi.md#ospDeleteStoragePolicy) | **DELETE** /v2/os/storage-policies/{id} | 
[**ospDeleteUser**](DefaultApi.md#ospDeleteUser) | **DELETE** /v2/os/users/{id} | 
[**ospDeleteUserByName**](DefaultApi.md#ospDeleteUserByName) | **DELETE** /v2/os/users/user-name/{name} | 
[**ospDeleteZone**](DefaultApi.md#ospDeleteZone) | **DELETE** /v2/os/zones/{id} | 
[**ospDeleteZoneGroup**](DefaultApi.md#ospDeleteZoneGroup) | **DELETE** /v2/os/zone-groups/{id} | 
[**ospDisableStorageClass**](DefaultApi.md#ospDisableStorageClass) | **POST** /v2/os/storage-policies/{id}:disabled | 
[**ospEnableStorageClass**](DefaultApi.md#ospEnableStorageClass) | **POST** /v2/os/storage-policies/{id}:enabled | 
[**ospGetAccessKey**](DefaultApi.md#ospGetAccessKey) | **GET** /v2/os/access-keys/access-keys/{id} | 
[**ospGetAccessSecretKeyConfig**](DefaultApi.md#ospGetAccessSecretKeyConfig) | **GET** /v2/os/access-keys/access-keys-config/ | 
[**ospGetAdminGateway**](DefaultApi.md#ospGetAdminGateway) | **GET** /v2/os/admin-gateways/{id} | 
[**ospGetBucket**](DefaultApi.md#ospGetBucket) | **GET** /v2/os/buckets/{id} | 
[**ospGetBucketFlowSamples**](DefaultApi.md#ospGetBucketFlowSamples) | **GET** /v2/os/buckets/{id}/flow/samples | 
[**ospGetBucketLifecycleProgress**](DefaultApi.md#ospGetBucketLifecycleProgress) | **GET** /v2/os/buckets/{id}/lifecycle-progress | 
[**ospGetBucketNFSGatewayMap**](DefaultApi.md#ospGetBucketNFSGatewayMap) | **GET** /v2/os/buckets/{id}/nfs-gateway-maps/{map_id} | 
[**ospGetBucketOriginPullSamples**](DefaultApi.md#ospGetBucketOriginPullSamples) | **GET** /v2/os/buckets/{id}/origin-pull/samples | 
[**ospGetBucketOriginRule**](DefaultApi.md#ospGetBucketOriginRule) | **GET** /v2/os/buckets/{id}/origin-rules/{rule_id} | 
[**ospGetBucketRebuildProgress**](DefaultApi.md#ospGetBucketRebuildProgress) | **POST** /v2/os/buckets/{id}/rebuild-progress/{rule_id} | 
[**ospGetBucketRebuildRule**](DefaultApi.md#ospGetBucketRebuildRule) | **GET** /v2/os/buckets/{id}/rebuild-rules/{rule_id} | 
[**ospGetBucketReplicationSamples**](DefaultApi.md#ospGetBucketReplicationSamples) | **GET** /v2/os/buckets/{id}/replication/samples | 
[**ospGetBucketReplicationStats**](DefaultApi.md#ospGetBucketReplicationStats) | **GET** /v2/os/buckets/{id}/replication-stats | 
[**ospGetBucketSamples**](DefaultApi.md#ospGetBucketSamples) | **GET** /v2/os/buckets/{id}/samples | 
[**ospGetBucketSyncProgress**](DefaultApi.md#ospGetBucketSyncProgress) | **GET** /v2/os/buckets/{id}/sync-progress | 
[**ospGetBucketSyncReplicationGroup**](DefaultApi.md#ospGetBucketSyncReplicationGroup) | **GET** /v2/os/buckets/{id}/sync-replication-groups/{group_id} | 
[**ospGetBucketSyncRule**](DefaultApi.md#ospGetBucketSyncRule) | **GET** /v2/os/buckets/{id}/sync-rules/{rule_id} | 
[**ospGetBucketSyncSamples**](DefaultApi.md#ospGetBucketSyncSamples) | **GET** /v2/os/buckets/{id}/sync/samples | 
[**ospGetBucketTagging**](DefaultApi.md#ospGetBucketTagging) | **GET** /v2/os/buckets/{id}/tags | 
[**ospGetCluster**](DefaultApi.md#ospGetCluster) | **GET** /v2/os/clusters/{uuid} | 
[**ospGetDataBackend**](DefaultApi.md#ospGetDataBackend) | **GET** /v2/os/data-backends/{id} | 
[**ospGetDataBackendSamples**](DefaultApi.md#ospGetDataBackendSamples) | **GET** /v2/os/data-backends/{id}/samples | 
[**ospGetDataBackendStorageClassUsages**](DefaultApi.md#ospGetDataBackendStorageClassUsages) | **GET** /v2/os/data-backends/class-usage | 
[**ospGetDataBackendStrategyInfo**](DefaultApi.md#ospGetDataBackendStrategyInfo) | **GET** /v2/os/data-backends/{id}/strategy-info | 
[**ospGetDataBackendValidator**](DefaultApi.md#ospGetDataBackendValidator) | **GET** /v2/os/data-backend-validators/{id} | 
[**ospGetEventTarget**](DefaultApi.md#ospGetEventTarget) | **GET** /v2/os/event-target/{id} | 
[**ospGetGatewayStats**](DefaultApi.md#ospGetGatewayStats) | **GET** /v2/os/stats/ | 
[**ospGetGlobalConf**](DefaultApi.md#ospGetGlobalConf) | **GET** /v2/os/global-conf/ | 
[**ospGetObjectGateway**](DefaultApi.md#ospGetObjectGateway) | **GET** /v2/os/object-gateways/{id} | 
[**ospGetOverview**](DefaultApi.md#ospGetOverview) | **GET** /v2/os/overview/ | 
[**ospGetOverviewSamples**](DefaultApi.md#ospGetOverviewSamples) | **GET** /v2/os/overview/samples | 
[**ospGetRecycleBucket**](DefaultApi.md#ospGetRecycleBucket) | **GET** /v2/os/bucket-recycle-bin/{bucket_id} | 
[**ospGetRole**](DefaultApi.md#ospGetRole) | **GET** /v2/os/{id} | 
[**ospGetStoragePolicy**](DefaultApi.md#ospGetStoragePolicy) | **GET** /v2/os/storage-policies/{id} | 
[**ospGetUser**](DefaultApi.md#ospGetUser) | **GET** /v2/os/users/{id} | 
[**ospGetUserFlowSamples**](DefaultApi.md#ospGetUserFlowSamples) | **GET** /v2/os/users/{id}/flow/samples | 
[**ospGetUserOriginPullSamples**](DefaultApi.md#ospGetUserOriginPullSamples) | **GET** /v2/os/users/{id}/origin-pull/samples | 
[**ospGetUserReplicationSamples**](DefaultApi.md#ospGetUserReplicationSamples) | **GET** /v2/os/users/{id}/replication/samples | 
[**ospGetUserSamples**](DefaultApi.md#ospGetUserSamples) | **GET** /v2/os/users/{id}/samples | 
[**ospGetUserSyncSamples**](DefaultApi.md#ospGetUserSyncSamples) | **GET** /v2/os/users/{id}/sync/samples | 
[**ospGetZone**](DefaultApi.md#ospGetZone) | **GET** /v2/os/zones/{id} | 
[**ospGetZoneGroup**](DefaultApi.md#ospGetZoneGroup) | **GET** /v2/os/zone-groups/{id} | 
[**ospGetZonePairSamples**](DefaultApi.md#ospGetZonePairSamples) | **GET** /v2/os/zone-pairs//{id}/samples | 
[**ospGetZoneSamples**](DefaultApi.md#ospGetZoneSamples) | **GET** /v2/os/zones/{id}/samples | 
[**ospListAccessKeys**](DefaultApi.md#ospListAccessKeys) | **GET** /v2/os/access-keys/access-keys/ | 
[**ospListAdminGateways**](DefaultApi.md#ospListAdminGateways) | **GET** /v2/os/admin-gateways/ | 
[**ospListBucketLoggings**](DefaultApi.md#ospListBucketLoggings) | **GET** /v2/os/bucket-loggings/ | 
[**ospListBucketNFSGatewayMaps**](DefaultApi.md#ospListBucketNFSGatewayMaps) | **GET** /v2/os/ | 
[**ospListBucketOriginRules**](DefaultApi.md#ospListBucketOriginRules) | **GET** /v2/os/buckets/{id}/origin-rules | 
[**ospListBucketRebuildRules**](DefaultApi.md#ospListBucketRebuildRules) | **GET** /v2/os/buckets/{id}/rebuild-rules | 
[**ospListBucketReplicationRules**](DefaultApi.md#ospListBucketReplicationRules) | **GET** /v2/os/buckets/{id}/replication-rules | 
[**ospListBucketSnapshot**](DefaultApi.md#ospListBucketSnapshot) | **GET** /v2/os/buckets/{id}/snapshots | 
[**ospListBucketSyncReplicationGroups**](DefaultApi.md#ospListBucketSyncReplicationGroups) | **GET** /v2/os/buckets/{id}/sync-replication-groups | 
[**ospListBucketSyncRules**](DefaultApi.md#ospListBucketSyncRules) | **GET** /v2/os/buckets/{id}/sync-rules | 
[**ospListBuckets**](DefaultApi.md#ospListBuckets) | **GET** /v2/os/buckets/ | 
[**ospListClusters**](DefaultApi.md#ospListClusters) | **GET** /v2/os/clusters/ | 
[**ospListDataBackendTargets**](DefaultApi.md#ospListDataBackendTargets) | **GET** /v2/os/data-backends/{id}/targets | 
[**ospListDataBackendZoneRelations**](DefaultApi.md#ospListDataBackendZoneRelations) | **GET** /v2/os/data-backend-zone-relations/ | 
[**ospListDataBackends**](DefaultApi.md#ospListDataBackends) | **GET** /v2/os/data-backends/ | 
[**ospListEventTargets**](DefaultApi.md#ospListEventTargets) | **GET** /v2/os/event-target/ | 
[**ospListObjectGateways**](DefaultApi.md#ospListObjectGateways) | **GET** /v2/os/object-gateways/ | 
[**ospListOriginRules**](DefaultApi.md#ospListOriginRules) | **GET** /v2/os/buckets/origin-rules | 
[**ospListRecycleBuckets**](DefaultApi.md#ospListRecycleBuckets) | **GET** /v2/os/bucket-recycle-bin/ | 
[**ospListStoragePolicies**](DefaultApi.md#ospListStoragePolicies) | **GET** /v2/os/storage-policies/ | 
[**ospListUserKeys**](DefaultApi.md#ospListUserKeys) | **GET** /v2/os/users/user-keys | 
[**ospListUsers**](DefaultApi.md#ospListUsers) | **GET** /v2/os/users/ | 
[**ospListZoneGroups**](DefaultApi.md#ospListZoneGroups) | **GET** /v2/os/zone-groups/ | 
[**ospListZonePairs**](DefaultApi.md#ospListZonePairs) | **GET** /v2/os/zone-pairs// | 
[**ospListZones**](DefaultApi.md#ospListZones) | **GET** /v2/os/zones/ | 
[**ospRecoveryRecycleBucket**](DefaultApi.md#ospRecoveryRecycleBucket) | **POST** /v2/os/bucket-recycle-bin/{bucket_id} | 
[**ospRemoveBucketLoggings**](DefaultApi.md#ospRemoveBucketLoggings) | **POST** /v2/os/buckets/{id}:remove-bucket-loggings | 
[**ospRemoveDataBackendsFromZone**](DefaultApi.md#ospRemoveDataBackendsFromZone) | **POST** /v2/os/zones/{id}:remove-data-backends | 
[**ospRemoveHostsFromZone**](DefaultApi.md#ospRemoveHostsFromZone) | **POST** /v2/os/zones/{id}:remove-hosts | 
[**ospSetBucketACL**](DefaultApi.md#ospSetBucketACL) | **POST** /v2/os/buckets/{id}:set-acl | 
[**ospSetBucketCompact**](DefaultApi.md#ospSetBucketCompact) | **POST** /v2/os/buckets/{id}:set-compact | 
[**ospSetBucketCompression**](DefaultApi.md#ospSetBucketCompression) | **POST** /v2/os/buckets/{id}:set-compression | 
[**ospSetBucketCors**](DefaultApi.md#ospSetBucketCors) | **POST** /v2/os/buckets/{id}:set-cors | 
[**ospSetBucketDefaultReadMode**](DefaultApi.md#ospSetBucketDefaultReadMode) | **POST** /v2/os/buckets/{id}:set-default-read-mode | 
[**ospSetBucketDescription**](DefaultApi.md#ospSetBucketDescription) | **POST** /v2/os/buckets/{id}:set-description | 
[**ospSetBucketEncryptionDefault**](DefaultApi.md#ospSetBucketEncryptionDefault) | **POST** /v2/os/buckets/{id}:set-encryption-default | 
[**ospSetBucketLifecycleRules**](DefaultApi.md#ospSetBucketLifecycleRules) | **POST** /v2/os/buckets/{id}:set-lifecycle-rules | 
[**ospSetBucketLifecycleRunningConf**](DefaultApi.md#ospSetBucketLifecycleRunningConf) | **POST** /v2/os/buckets/{id}:set-lifecycle-running-conf | 
[**ospSetBucketLock**](DefaultApi.md#ospSetBucketLock) | **POST** /v2/os/buckets/{id}:set-lock | 
[**ospSetBucketLogging**](DefaultApi.md#ospSetBucketLogging) | **POST** /v2/os/buckets/{id}:set-logging | 
[**ospSetBucketObjectDeleteMode**](DefaultApi.md#ospSetBucketObjectDeleteMode) | **POST** /v2/os/buckets/{id}:set-object-delete-mode | 
[**ospSetBucketObjectInheritACL**](DefaultApi.md#ospSetBucketObjectInheritACL) | **POST** /v2/os/buckets/{id}:set-object-inherit-acl | 
[**ospSetBucketObjectRecycle**](DefaultApi.md#ospSetBucketObjectRecycle) | **POST** /v2/os/buckets/{id}:set-object-recycle | 
[**ospSetBucketOwner**](DefaultApi.md#ospSetBucketOwner) | **POST** /v2/os/buckets/{id}:set-owner | 
[**ospSetBucketPolicy**](DefaultApi.md#ospSetBucketPolicy) | **POST** /v2/os/buckets/{id}:set-policy | 
[**ospSetBucketQos**](DefaultApi.md#ospSetBucketQos) | **POST** /v2/os/buckets/{id}:set-qos | 
[**ospSetBucketQuota**](DefaultApi.md#ospSetBucketQuota) | **POST** /v2/os/buckets/{id}:set-quota | 
[**ospSetBucketQuotaRule**](DefaultApi.md#ospSetBucketQuotaRule) | **POST** /v2/os/buckets/{id}:set-quota-rule | 
[**ospSetBucketReadonlyZones**](DefaultApi.md#ospSetBucketReadonlyZones) | **POST** /v2/os/buckets/{id}:set-readonly-zones | 
[**ospSetBucketRebuildZone**](DefaultApi.md#ospSetBucketRebuildZone) | **POST** /v2/os/buckets/{id}:set-rebuild-zone | 
[**ospSetBucketReplicationStatus**](DefaultApi.md#ospSetBucketReplicationStatus) | **POST** /v2/os/buckets/{id}/replication-rules/{rule_id}:set-status | 
[**ospSetBucketReplicationZone**](DefaultApi.md#ospSetBucketReplicationZone) | **POST** /v2/os/buckets/{id}:set-replication-zone | 
[**ospSetBucketSnapshot**](DefaultApi.md#ospSetBucketSnapshot) | **PATCH** /v2/os/buckets/{id}/snapshots/{snapshot_id} | 
[**ospSetBucketSnapshotLimit**](DefaultApi.md#ospSetBucketSnapshotLimit) | **POST** /v2/os/buckets/{id}:set-snapshot-limit | 
[**ospSetBucketStorageClassRule**](DefaultApi.md#ospSetBucketStorageClassRule) | **POST** /v2/os/buckets/{id}:set-storage-class-rule | 
[**ospSetBucketSyncStatus**](DefaultApi.md#ospSetBucketSyncStatus) | **POST** /v2/os/buckets/{id}:set-sync-status | 
[**ospSetBucketTags**](DefaultApi.md#ospSetBucketTags) | **POST** /v2/os/buckets/{id}:set-tags | 
[**ospSetBucketTierAccessMode**](DefaultApi.md#ospSetBucketTierAccessMode) | **POST** /v2/os/buckets/{id}:set-tier-access-mode | 
[**ospSetBucketTierWorm**](DefaultApi.md#ospSetBucketTierWorm) | **POST** /v2/os/buckets/{id}:set-tier-worm | 
[**ospSetBucketVersioning**](DefaultApi.md#ospSetBucketVersioning) | **POST** /v2/os/buckets/{id}:set-versioning | 
[**ospSetDefaultStoragePolicy**](DefaultApi.md#ospSetDefaultStoragePolicy) | **POST** /v2/os/storage-policies/{id}:set-default | 
[**ospSetLifecycleZone**](DefaultApi.md#ospSetLifecycleZone) | **POST** /v2/os/storage-policies/{id}:set-lifecycle-zone | 
[**ospSetOpMask**](DefaultApi.md#ospSetOpMask) | **POST** /v2/os/users/{id}:set-op-mask | 
[**ospSetRebuildZone**](DefaultApi.md#ospSetRebuildZone) | **POST** /v2/os/storage-policies/{id}:set-rebuild-zone | 
[**ospSetReplicationZone**](DefaultApi.md#ospSetReplicationZone) | **POST** /v2/os/storage-policies/{id}:set-replication-zone | 
[**ospSetSecondCompactRatio**](DefaultApi.md#ospSetSecondCompactRatio) | **POST** /v2/os/storage-policies/{id}:set-second-compact-ratio | 
[**ospSetStorageClassBalanceMode**](DefaultApi.md#ospSetStorageClassBalanceMode) | **POST** /v2/os/storage-policies/{id}:set-balance-mode | 
[**ospSetStoragePolicyCompact**](DefaultApi.md#ospSetStoragePolicyCompact) | **POST** /v2/os/storage-policies/{id}:set-compact | 
[**ospSetStoragePolicyCompress**](DefaultApi.md#ospSetStoragePolicyCompress) | **POST** /v2/os/storage-policies/{id}:set-compress | 
[**ospSetStoragePolicyCrypto**](DefaultApi.md#ospSetStoragePolicyCrypto) | **POST** /v2/os/storage-policies/{id}:set-crypto | 
[**ospSetStoragePolicyDataSC**](DefaultApi.md#ospSetStoragePolicyDataSC) | **POST** /v2/os/storage-policies/{id}:set-data-storage-classes | 
[**ospSetStoragePolicyDedup**](DefaultApi.md#ospSetStoragePolicyDedup) | **POST** /v2/os/storage-policies/{id}:set-dedup | 
[**ospSetStoragePolicyDescription**](DefaultApi.md#ospSetStoragePolicyDescription) | **POST** /v2/os/storage-policies/{id}:set-description | 
[**ospSetStoragePolicyExternalSC**](DefaultApi.md#ospSetStoragePolicyExternalSC) | **POST** /v2/os/storage-policies/{id}:set-external-storage-classes | 
[**ospSetStoragePolicyMultiProtocol**](DefaultApi.md#ospSetStoragePolicyMultiProtocol) | **POST** /v2/os/storage-policies/{id}:set-multi-protocol | 
[**ospSetTrustPolicy**](DefaultApi.md#ospSetTrustPolicy) | **POST** /v2/os/{id}:set-trust-policy | 
[**ospSetUserDescription**](DefaultApi.md#ospSetUserDescription) | **POST** /v2/os/users/{id}:set-description | 
[**ospSetUserDetail**](DefaultApi.md#ospSetUserDetail) | **POST** /v2/os/users/{id}:set-detail | 
[**ospSetUserEmail**](DefaultApi.md#ospSetUserEmail) | **POST** /v2/os/users/{id}:set-email | 
[**ospSetUserName**](DefaultApi.md#ospSetUserName) | **POST** /v2/os/users/{id}:set-name | 
[**ospSetUserPolicy**](DefaultApi.md#ospSetUserPolicy) | **POST** /v2/os/users/{id}:set-policy | 
[**ospSetUserProperties**](DefaultApi.md#ospSetUserProperties) | **POST** /v2/os/users/{id}:set-properties | 
[**ospSetUserQos**](DefaultApi.md#ospSetUserQos) | **POST** /v2/os/users/{id}:set-qos | 
[**ospSetUserQuota**](DefaultApi.md#ospSetUserQuota) | **POST** /v2/os/users/{id}:set-quota | 
[**ospSetUserSelectStoragePolicies**](DefaultApi.md#ospSetUserSelectStoragePolicies) | **POST** /v2/os/users/{id}:set-select-storage-policies | 
[**ospSetUserSuspended**](DefaultApi.md#ospSetUserSuspended) | **POST** /v2/os/users/set-suspended | 
[**ospSetZoneName**](DefaultApi.md#ospSetZoneName) | **POST** /v2/os/zones/{id}:set-name | 
[**ospSuspendBucketLogging**](DefaultApi.md#ospSuspendBucketLogging) | **POST** /v2/os/buckets/{id}:suspend-logging | 
[**ospUnsetBucketLogging**](DefaultApi.md#ospUnsetBucketLogging) | **POST** /v2/os/buckets/{id}:unset-logging | 
[**ospUnsetBucketPolicy**](DefaultApi.md#ospUnsetBucketPolicy) | **POST** /v2/os/buckets/{id}:unset-policy | 
[**ospUnsuspendBucketLogging**](DefaultApi.md#ospUnsuspendBucketLogging) | **POST** /v2/os/buckets/{id}:unsuspend-logging | 
[**ospUpdateBucketNFSGatewayMap**](DefaultApi.md#ospUpdateBucketNFSGatewayMap) | **PATCH** /v2/os/buckets/{id}/nfs-gateway-maps/{map_id} | 
[**ospUpdateBucketOriginRule**](DefaultApi.md#ospUpdateBucketOriginRule) | **PATCH** /v2/os/buckets/{id}/origin-rules/{rule_id} | 
[**ospUpdateBucketReplicationRule**](DefaultApi.md#ospUpdateBucketReplicationRule) | **PATCH** /v2/os/buckets/{id}/replication-rules/{rule_id} | 
[**ospUpdateBucketSyncReplicationGroup**](DefaultApi.md#ospUpdateBucketSyncReplicationGroup) | **PATCH** /v2/os/buckets/{id}/sync-replication-groups/{group_id} | 
[**ospUpdateBucketSyncRule**](DefaultApi.md#ospUpdateBucketSyncRule) | **PATCH** /v2/os/buckets/{id}/sync-rules/{rule_id} | 
[**ospUpdateCluster**](DefaultApi.md#ospUpdateCluster) | **PATCH** /v2/os/clusters/{uuid} | 
[**ospUpdateDataBackend**](DefaultApi.md#ospUpdateDataBackend) | **PATCH** /v2/os/data-backends/{id} | 
[**ospUpdateEventTarget**](DefaultApi.md#ospUpdateEventTarget) | **PATCH** /v2/os/event-target/{id} | 
[**ospUpdateGlobalConf**](DefaultApi.md#ospUpdateGlobalConf) | **PATCH** /v2/os/global-conf/ | 
[**ospUpdateRecycleBucket**](DefaultApi.md#ospUpdateRecycleBucket) | **PATCH** /v2/os/bucket-recycle-bin/{bucket_id} | 
[**ospUpdateSecretKey**](DefaultApi.md#ospUpdateSecretKey) | **POST** /v2/os/access-keys/access-keys/{id}:update-secret-key | 

<a name="ospAccessSecretKeyConfigResp"></a>
# **ospAccessSecretKeyConfigResp**
> OspAccessSecretKeyConfigResp ospAccessSecretKeyConfigResp(body)



Set access key and secret key config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspAccessSecretKeyConfigReq body = new OspAccessSecretKeyConfigReq(); // OspAccessSecretKeyConfigReq | access key and  secret key config
try {
    OspAccessSecretKeyConfigResp result = apiInstance.ospAccessSecretKeyConfigResp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospAccessSecretKeyConfigResp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspAccessSecretKeyConfigReq**](OspAccessSecretKeyConfigReq.md)| access key and  secret key config |

### Return type

[**OspAccessSecretKeyConfigResp**](OspAccessSecretKeyConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospAddDataBackendsToZone"></a>
# **ospAddDataBackendsToZone**
> OspZoneResp ospAddDataBackendsToZone(body, id)



add dateBackends to a zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneAddDataBackendsReq body = new OspZoneAddDataBackendsReq(); // OspZoneAddDataBackendsReq | zone data backends info
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospAddDataBackendsToZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospAddDataBackendsToZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneAddDataBackendsReq**](OspZoneAddDataBackendsReq.md)| zone data backends info |
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospAddHostsIntoZone"></a>
# **ospAddHostsIntoZone**
> OspZoneResp ospAddHostsIntoZone(body, id)



add hosts into a zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneHostsOpReq body = new OspZoneHostsOpReq(); // OspZoneHostsOpReq | zone hosts info
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospAddHostsIntoZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospAddHostsIntoZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneHostsOpReq**](OspZoneHostsOpReq.md)| zone hosts info |
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCheckDataBackendUnique"></a>
# **ospCheckDataBackendUnique**
> ospCheckDataBackendUnique(body)



Check a data backend exists

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDataBackendUniqueCheckReq body = new OspDataBackendUniqueCheckReq(); // OspDataBackendUniqueCheckReq | data backend info
try {
    apiInstance.ospCheckDataBackendUnique(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCheckDataBackendUnique");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendUniqueCheckReq**](OspDataBackendUniqueCheckReq.md)| data backend info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="ospCleanRecycleBuckets"></a>
# **ospCleanRecycleBuckets**
> ospCleanRecycleBuckets()



clean up all recycle buckets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.ospCleanRecycleBuckets();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCleanRecycleBuckets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospCompactTakeover"></a>
# **ospCompactTakeover**
> ospCompactTakeover(body)



compact takeover command

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspCompactTakeOverReq body = new OspCompactTakeOverReq(); // OspCompactTakeOverReq | command info
try {
    apiInstance.ospCompactTakeover(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCompactTakeover");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspCompactTakeOverReq**](OspCompactTakeOverReq.md)| command info |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="ospCreateAccessKey"></a>
# **ospCreateAccessKey**
> OspAccessKeyResp ospCreateAccessKey(body)



Create access key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspAccessKeyCreateReq body = new OspAccessKeyCreateReq(); // OspAccessKeyCreateReq | access key info
try {
    OspAccessKeyResp result = apiInstance.ospCreateAccessKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspAccessKeyCreateReq**](OspAccessKeyCreateReq.md)| access key info |

### Return type

[**OspAccessKeyResp**](OspAccessKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateAccessKeyByUserName"></a>
# **ospCreateAccessKeyByUserName**
> OspAccessKeyResp ospCreateAccessKeyByUserName(body)



Create access key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspAccessKeyCreateByUserNameReq body = new OspAccessKeyCreateByUserNameReq(); // OspAccessKeyCreateByUserNameReq | access key info
try {
    OspAccessKeyResp result = apiInstance.ospCreateAccessKeyByUserName(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateAccessKeyByUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspAccessKeyCreateByUserNameReq**](OspAccessKeyCreateByUserNameReq.md)| access key info |

### Return type

[**OspAccessKeyResp**](OspAccessKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucket"></a>
# **ospCreateBucket**
> OspBucketResp ospCreateBucket(body)



Creates a bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketCreateReq body = new OspBucketCreateReq(); // OspBucketCreateReq | bucket info
try {
    OspBucketResp result = apiInstance.ospCreateBucket(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketCreateReq**](OspBucketCreateReq.md)| bucket info |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketNFSGatewayMap"></a>
# **ospCreateBucketNFSGatewayMap**
> OspBucketNFSGatewayMapResp ospCreateBucketNFSGatewayMap(body, id)



Creates a bucket nfs gateway map

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketNFSGatewayMapCreateReq body = new OspBucketNFSGatewayMapCreateReq(); // OspBucketNFSGatewayMapCreateReq | bucket nfs gateway map info
Long id = 789L; // Long | bucket id
try {
    OspBucketNFSGatewayMapResp result = apiInstance.ospCreateBucketNFSGatewayMap(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketNFSGatewayMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketNFSGatewayMapCreateReq**](OspBucketNFSGatewayMapCreateReq.md)| bucket nfs gateway map info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketNFSGatewayMapResp**](OspBucketNFSGatewayMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketOriginRule"></a>
# **ospCreateBucketOriginRule**
> OspBucketOriginRuleResp ospCreateBucketOriginRule(body, id)



Create bucket origin rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketCreateOriginRuleReq body = new OspBucketCreateOriginRuleReq(); // OspBucketCreateOriginRuleReq | origin rule info
Long id = 789L; // Long | bucket id
try {
    OspBucketOriginRuleResp result = apiInstance.ospCreateBucketOriginRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketOriginRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketCreateOriginRuleReq**](OspBucketCreateOriginRuleReq.md)| origin rule info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketOriginRuleResp**](OspBucketOriginRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketRebuildRule"></a>
# **ospCreateBucketRebuildRule**
> OspBucketRebuildRuleResp ospCreateBucketRebuildRule(body, id)



Create bucket rebuild rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketCreateRebuildRuleReq body = new OspBucketCreateRebuildRuleReq(); // OspBucketCreateRebuildRuleReq | rebuild rule info
Long id = 789L; // Long | bucket id
try {
    OspBucketRebuildRuleResp result = apiInstance.ospCreateBucketRebuildRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketRebuildRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketCreateRebuildRuleReq**](OspBucketCreateRebuildRuleReq.md)| rebuild rule info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketRebuildRuleResp**](OspBucketRebuildRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketReplicationRule"></a>
# **ospCreateBucketReplicationRule**
> OspBucketReplicationResp ospCreateBucketReplicationRule(body, id)



Create bucket replication rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketReplicationRuleCreateReq body = new OspBucketReplicationRuleCreateReq(); // OspBucketReplicationRuleCreateReq | replication rule info
Long id = 789L; // Long | bucket id
try {
    OspBucketReplicationResp result = apiInstance.ospCreateBucketReplicationRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketReplicationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketReplicationRuleCreateReq**](OspBucketReplicationRuleCreateReq.md)| replication rule info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketReplicationResp**](OspBucketReplicationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketSnapshot"></a>
# **ospCreateBucketSnapshot**
> OspSnapshotsResp ospCreateBucketSnapshot(body, id)



Creates bucket snapshot

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSnapshotCreateReq body = new OspBucketSnapshotCreateReq(); // OspBucketSnapshotCreateReq | bucket snapshot info
Long id = 789L; // Long | bucket id
try {
    OspSnapshotsResp result = apiInstance.ospCreateBucketSnapshot(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSnapshotCreateReq**](OspBucketSnapshotCreateReq.md)| bucket snapshot info |
 **id** | **Long**| bucket id |

### Return type

[**OspSnapshotsResp**](OspSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketSyncReplicationGroup"></a>
# **ospCreateBucketSyncReplicationGroup**
> OspBucketSyncReplicationGroupResp ospCreateBucketSyncReplicationGroup(body, id)



Creates a bucket sync replication group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSyncReplicationGroupCreateReq body = new OspBucketSyncReplicationGroupCreateReq(); // OspBucketSyncReplicationGroupCreateReq | bucket sync replication group info
Long id = 789L; // Long | bucket id
try {
    OspBucketSyncReplicationGroupResp result = apiInstance.ospCreateBucketSyncReplicationGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketSyncReplicationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSyncReplicationGroupCreateReq**](OspBucketSyncReplicationGroupCreateReq.md)| bucket sync replication group info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketSyncReplicationGroupResp**](OspBucketSyncReplicationGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateBucketSyncRule"></a>
# **ospCreateBucketSyncRule**
> OspBucketSyncRuleResp ospCreateBucketSyncRule(body, id)



Creates a bucket sync rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSyncRuleCreateReq body = new OspBucketSyncRuleCreateReq(); // OspBucketSyncRuleCreateReq | bucket sync rule info
Long id = 789L; // Long | bucket id
try {
    OspBucketSyncRuleResp result = apiInstance.ospCreateBucketSyncRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateBucketSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSyncRuleCreateReq**](OspBucketSyncRuleCreateReq.md)| bucket sync rule info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketSyncRuleResp**](OspBucketSyncRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateClusterWithOutside"></a>
# **ospCreateClusterWithOutside**
> OspClusterResp ospCreateClusterWithOutside(body)



Create outside cluster

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspClusterOutsideReq body = new OspClusterOutsideReq(); // OspClusterOutsideReq | cluster info
try {
    OspClusterResp result = apiInstance.ospCreateClusterWithOutside(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateClusterWithOutside");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspClusterOutsideReq**](OspClusterOutsideReq.md)| cluster info | [optional]

### Return type

[**OspClusterResp**](OspClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateDataBackend"></a>
# **ospCreateDataBackend**
> OspDataBackendResp ospCreateDataBackend(body)



Creates a data backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDataBackendCreateReq body = new OspDataBackendCreateReq(); // OspDataBackendCreateReq | data backend info
try {
    OspDataBackendResp result = apiInstance.ospCreateDataBackend(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendCreateReq**](OspDataBackendCreateReq.md)| data backend info |

### Return type

[**OspDataBackendResp**](OspDataBackendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateDataBackendValidator"></a>
# **ospCreateDataBackendValidator**
> OspDataBackendValidatorResp ospCreateDataBackendValidator(body, clusterId)



Create data backend validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDataBackendValidatorCreateReq body = new OspDataBackendValidatorCreateReq(); // OspDataBackendValidatorCreateReq | data backend validator info
String clusterId = "clusterId_example"; // String | cluster id
try {
    OspDataBackendValidatorResp result = apiInstance.ospCreateDataBackendValidator(body, clusterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateDataBackendValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendValidatorCreateReq**](OspDataBackendValidatorCreateReq.md)| data backend validator info |
 **clusterId** | **String**| cluster id | [optional]

### Return type

[**OspDataBackendValidatorResp**](OspDataBackendValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateEventTarget"></a>
# **ospCreateEventTarget**
> OspEventTargetResp ospCreateEventTarget(body)



create event target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspEventTargetReq body = new OspEventTargetReq(); // OspEventTargetReq | event target info
try {
    OspEventTargetResp result = apiInstance.ospCreateEventTarget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateEventTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspEventTargetReq**](OspEventTargetReq.md)| event target info |

### Return type

[**OspEventTargetResp**](OspEventTargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateRole"></a>
# **ospCreateRole**
> OspRoleResp ospCreateRole(body)



creates role

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspRoleCreateReq body = new OspRoleCreateReq(); // OspRoleCreateReq | role info
try {
    OspRoleResp result = apiInstance.ospCreateRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspRoleCreateReq**](OspRoleCreateReq.md)| role info |

### Return type

[**OspRoleResp**](OspRoleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateStoragePolicy"></a>
# **ospCreateStoragePolicy**
> OspStoragePolicyResp ospCreateStoragePolicy(body)



Creates Storage Policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicyCreateReq body = new OspStoragePolicyCreateReq(); // OspStoragePolicyCreateReq | storage policy info
try {
    OspStoragePolicyResp result = apiInstance.ospCreateStoragePolicy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicyCreateReq**](OspStoragePolicyCreateReq.md)| storage policy info |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateUser"></a>
# **ospCreateUser**
> OspUserResp ospCreateUser(body)



Creates user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserCreateReq body = new OspUserCreateReq(); // OspUserCreateReq | user info
try {
    OspUserResp result = apiInstance.ospCreateUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserCreateReq**](OspUserCreateReq.md)| user info |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateZone"></a>
# **ospCreateZone**
> OspZoneResp ospCreateZone(body)



Creates a zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneCreateReq body = new OspZoneCreateReq(); // OspZoneCreateReq | zone info
try {
    OspZoneResp result = apiInstance.ospCreateZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneCreateReq**](OspZoneCreateReq.md)| zone info |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospCreateZoneGroup"></a>
# **ospCreateZoneGroup**
> OspZoneGroupResp ospCreateZoneGroup(body)



Creates a zone group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneGroupCreateReq body = new OspZoneGroupCreateReq(); // OspZoneGroupCreateReq | zone group info
try {
    OspZoneGroupResp result = apiInstance.ospCreateZoneGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospCreateZoneGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneGroupCreateReq**](OspZoneGroupCreateReq.md)| zone group info |

### Return type

[**OspZoneGroupResp**](OspZoneGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospDeleteAccessKey"></a>
# **ospDeleteAccessKey**
> ospDeleteAccessKey(id)



Delete an access key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | access key id
try {
    apiInstance.ospDeleteAccessKey(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| access key id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucket"></a>
# **ospDeleteBucket**
> OspBucketResp ospDeleteBucket(id)



Deletes a bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospDeleteBucket(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteBucketByName"></a>
# **ospDeleteBucketByName**
> OspBucketResp ospDeleteBucketByName(name)



Deletes a bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | bucket name
try {
    OspBucketResp result = apiInstance.ospDeleteBucketByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| bucket name |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteBucketNFSGatewayMap"></a>
# **ospDeleteBucketNFSGatewayMap**
> OspBucketNFSGatewayMapResp ospDeleteBucketNFSGatewayMap(id, mapId)



Deletes a bucket nfs gateway map

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long mapId = 789L; // Long | bucket nfs gateway map id
try {
    OspBucketNFSGatewayMapResp result = apiInstance.ospDeleteBucketNFSGatewayMap(id, mapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketNFSGatewayMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **mapId** | **Long**| bucket nfs gateway map id |

### Return type

[**OspBucketNFSGatewayMapResp**](OspBucketNFSGatewayMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteBucketNFSGatewayMaps"></a>
# **ospDeleteBucketNFSGatewayMaps**
> ospDeleteBucketNFSGatewayMaps(region, zoneId, nfsGatewayId)



Deletes bucket nfs gateway maps by nfs gateway (internal api)

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long region = 789L; // Long | region uuid
Long zoneId = 789L; // Long | zone id
Long nfsGatewayId = 789L; // Long | nfs gateway id
try {
    apiInstance.ospDeleteBucketNFSGatewayMaps(region, zoneId, nfsGatewayId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketNFSGatewayMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | **Long**| region uuid |
 **zoneId** | **Long**| zone id |
 **nfsGatewayId** | **Long**| nfs gateway id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucketOriginRule"></a>
# **ospDeleteBucketOriginRule**
> ospDeleteBucketOriginRule(id, ruleId)



Delete bucket origin rule status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String ruleId = "ruleId_example"; // String | rule id
try {
    apiInstance.ospDeleteBucketOriginRule(id, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketOriginRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **String**| rule id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucketRebuildRule"></a>
# **ospDeleteBucketRebuildRule**
> ospDeleteBucketRebuildRule(id, ruleId)



Delete bucket rebuild rule status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | rule id
try {
    apiInstance.ospDeleteBucketRebuildRule(id, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketRebuildRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| rule id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucketReplicationRule"></a>
# **ospDeleteBucketReplicationRule**
> ospDeleteBucketReplicationRule(id, ruleId)



Delete bucket replication rule status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | rule id
try {
    apiInstance.ospDeleteBucketReplicationRule(id, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketReplicationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| rule id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucketSnapshots"></a>
# **ospDeleteBucketSnapshots**
> OspSnapshotsResp ospDeleteBucketSnapshots(body, id)



Deletes bucket snapshots

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketDeleteSnapshotsReq body = new OspBucketDeleteSnapshotsReq(); // OspBucketDeleteSnapshotsReq | bucket deleted snapshot ids
Long id = 789L; // Long | bucket id
try {
    OspSnapshotsResp result = apiInstance.ospDeleteBucketSnapshots(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketDeleteSnapshotsReq**](OspBucketDeleteSnapshotsReq.md)| bucket deleted snapshot ids |
 **id** | **Long**| bucket id |

### Return type

[**OspSnapshotsResp**](OspSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospDeleteBucketSyncReplicationGroup"></a>
# **ospDeleteBucketSyncReplicationGroup**
> ospDeleteBucketSyncReplicationGroup(id, groupId)



Deletes a bucket sync replication group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long groupId = 789L; // Long | bucket sync replication group id
try {
    apiInstance.ospDeleteBucketSyncReplicationGroup(id, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketSyncReplicationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **groupId** | **Long**| bucket sync replication group id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteBucketSyncRule"></a>
# **ospDeleteBucketSyncRule**
> ospDeleteBucketSyncRule(id, ruleId)



Deletes a bucket sync rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | bucket sync rule id
try {
    apiInstance.ospDeleteBucketSyncRule(id, ruleId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteBucketSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| bucket sync rule id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteDataBackend"></a>
# **ospDeleteDataBackend**
> OspDataBackendResp ospDeleteDataBackend(id)



Deletes a data backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend id
try {
    OspDataBackendResp result = apiInstance.ospDeleteDataBackend(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend id |

### Return type

[**OspDataBackendResp**](OspDataBackendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteEventTarget"></a>
# **ospDeleteEventTarget**
> ospDeleteEventTarget(id)



delete event target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | event id
try {
    apiInstance.ospDeleteEventTarget(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteEventTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| event id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDeleteRecycleBucket"></a>
# **ospDeleteRecycleBucket**
> OspBucketsResp ospDeleteRecycleBucket(bucketId)



Deletes a recycle bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long bucketId = 789L; // Long | bucket id
try {
    OspBucketsResp result = apiInstance.ospDeleteRecycleBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteRecycleBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**OspBucketsResp**](OspBucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteRole"></a>
# **ospDeleteRole**
> OspRoleResp ospDeleteRole(id)



Deletes a role

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | role id
try {
    OspRoleResp result = apiInstance.ospDeleteRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| role id |

### Return type

[**OspRoleResp**](OspRoleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteStorageClass"></a>
# **ospDeleteStorageClass**
> OspStoragePolicyResp ospDeleteStorageClass(id)



Deletes a storage class

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospDeleteStorageClass(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteStoragePolicy"></a>
# **ospDeleteStoragePolicy**
> OspStoragePolicyResp ospDeleteStoragePolicy(id)



Deletes a storage policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospDeleteStoragePolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteUser"></a>
# **ospDeleteUser**
> OspUsersResp ospDeleteUser(id)



Deletes a user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
try {
    OspUsersResp result = apiInstance.ospDeleteUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |

### Return type

[**OspUsersResp**](OspUsersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteUserByName"></a>
# **ospDeleteUserByName**
> OspUsersResp ospDeleteUserByName(name)



Deletes a user

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | user name
try {
    OspUsersResp result = apiInstance.ospDeleteUserByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteUserByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| user name |

### Return type

[**OspUsersResp**](OspUsersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteZone"></a>
# **ospDeleteZone**
> OspZoneResp ospDeleteZone(id)



Deletes a zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospDeleteZone(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospDeleteZoneGroup"></a>
# **ospDeleteZoneGroup**
> ospDeleteZoneGroup(id)



Deletes a zone group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone group id
try {
    apiInstance.ospDeleteZoneGroup(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDeleteZoneGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone group id |

### Return type

null (empty response body)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="ospDisableStorageClass"></a>
# **ospDisableStorageClass**
> OspStoragePolicyResp ospDisableStorageClass(body, id)



Updates storage class status config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDisableStorageClassReq body = new OspDisableStorageClassReq(); // OspDisableStorageClassReq | storage class status info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospDisableStorageClass(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospDisableStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDisableStorageClassReq**](OspDisableStorageClassReq.md)| storage class status info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospEnableStorageClass"></a>
# **ospEnableStorageClass**
> OspStoragePolicyResp ospEnableStorageClass(body, id)



Updates storage class status config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspEnableStorageClassReq body = new OspEnableStorageClassReq(); // OspEnableStorageClassReq | storage class status info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospEnableStorageClass(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospEnableStorageClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspEnableStorageClassReq**](OspEnableStorageClassReq.md)| storage class status info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospGetAccessKey"></a>
# **ospGetAccessKey**
> OspAccessKeyResp ospGetAccessKey(id)



Returns access key info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | access key id
try {
    OspAccessKeyResp result = apiInstance.ospGetAccessKey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetAccessKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| access key id |

### Return type

[**OspAccessKeyResp**](OspAccessKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetAccessSecretKeyConfig"></a>
# **ospGetAccessSecretKeyConfig**
> OspAccessSecretKeyConfigResp ospGetAccessSecretKeyConfig()



Returns access and secret key config info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspAccessSecretKeyConfigResp result = apiInstance.ospGetAccessSecretKeyConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetAccessSecretKeyConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspAccessSecretKeyConfigResp**](OspAccessSecretKeyConfigResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetAdminGateway"></a>
# **ospGetAdminGateway**
> OspAdminGatewayResp ospGetAdminGateway(id)



Returns admin gateway info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | admin gateway id
try {
    OspAdminGatewayResp result = apiInstance.ospGetAdminGateway(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetAdminGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| admin gateway id |

### Return type

[**OspAdminGatewayResp**](OspAdminGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucket"></a>
# **ospGetBucket**
> OspBucketResp ospGetBucket(id)



Returns bucket info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospGetBucket(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketFlowSamples"></a>
# **ospGetBucketFlowSamples**
> OspBucketFlowSamplesResp ospGetBucketFlowSamples(id, durationBegin, durationEnd, period)



Returns bucket flow&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspBucketFlowSamplesResp result = apiInstance.ospGetBucketFlowSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketFlowSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspBucketFlowSamplesResp**](OspBucketFlowSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketLifecycleProgress"></a>
# **ospGetBucketLifecycleProgress**
> OspBucketLifecycleProgressResp ospGetBucketLifecycleProgress(id)



Returns bucket lifecycle progress info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketLifecycleProgressResp result = apiInstance.ospGetBucketLifecycleProgress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketLifecycleProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketLifecycleProgressResp**](OspBucketLifecycleProgressResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketNFSGatewayMap"></a>
# **ospGetBucketNFSGatewayMap**
> OspBucketNFSGatewayMapResp ospGetBucketNFSGatewayMap(id, mapId)



Returns bucket nfs gateway map info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long mapId = 789L; // Long | bucket nfs gateway map id
try {
    OspBucketNFSGatewayMapResp result = apiInstance.ospGetBucketNFSGatewayMap(id, mapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketNFSGatewayMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **mapId** | **Long**| bucket nfs gateway map id |

### Return type

[**OspBucketNFSGatewayMapResp**](OspBucketNFSGatewayMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketOriginPullSamples"></a>
# **ospGetBucketOriginPullSamples**
> OspBucketOriginPullSamplesResp ospGetBucketOriginPullSamples(id, originMode, durationBegin, durationEnd, period)



Returns bucket origin pull samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String originMode = "originMode_example"; // String | origin mode
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspBucketOriginPullSamplesResp result = apiInstance.ospGetBucketOriginPullSamples(id, originMode, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketOriginPullSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **originMode** | **String**| origin mode | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspBucketOriginPullSamplesResp**](OspBucketOriginPullSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketOriginRule"></a>
# **ospGetBucketOriginRule**
> OspBucketOriginRuleResp ospGetBucketOriginRule(id, ruleId)



Returns bucket origin rule info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | bucket origin rule id
try {
    OspBucketOriginRuleResp result = apiInstance.ospGetBucketOriginRule(id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketOriginRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| bucket origin rule id |

### Return type

[**OspBucketOriginRuleResp**](OspBucketOriginRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketRebuildProgress"></a>
# **ospGetBucketRebuildProgress**
> OspBucketRebuildProgressResp ospGetBucketRebuildProgress(id, ruleId)



Returns bucket rebuild progress

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | rule id
try {
    OspBucketRebuildProgressResp result = apiInstance.ospGetBucketRebuildProgress(id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketRebuildProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| rule id |

### Return type

[**OspBucketRebuildProgressResp**](OspBucketRebuildProgressResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketRebuildRule"></a>
# **ospGetBucketRebuildRule**
> OspBucketRebuildRuleResp ospGetBucketRebuildRule(id, ruleId)



Returns bucket rebuild rule info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | bucket rebuild rule id
try {
    OspBucketRebuildRuleResp result = apiInstance.ospGetBucketRebuildRule(id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketRebuildRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| bucket rebuild rule id |

### Return type

[**OspBucketRebuildRuleResp**](OspBucketRebuildRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketReplicationSamples"></a>
# **ospGetBucketReplicationSamples**
> OspBucketReplicationSamplesResp ospGetBucketReplicationSamples(id, durationBegin, durationEnd, period)



Returns bucket replication&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspBucketReplicationSamplesResp result = apiInstance.ospGetBucketReplicationSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketReplicationSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspBucketReplicationSamplesResp**](OspBucketReplicationSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketReplicationStats"></a>
# **ospGetBucketReplicationStats**
> OspBucketReplicationStatsResp ospGetBucketReplicationStats(id)



Returns bucket replication stats

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketReplicationStatsResp result = apiInstance.ospGetBucketReplicationStats(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketReplicationStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketReplicationStatsResp**](OspBucketReplicationStatsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketSamples"></a>
# **ospGetBucketSamples**
> OspBucketSamplesResp ospGetBucketSamples(id, durationBegin, durationEnd, period)



Returns bucket&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspBucketSamplesResp result = apiInstance.ospGetBucketSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspBucketSamplesResp**](OspBucketSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketSyncProgress"></a>
# **ospGetBucketSyncProgress**
> OspBucketLifecycleProgressResp ospGetBucketSyncProgress(id)



Returns bucket lifecycle sync info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketLifecycleProgressResp result = apiInstance.ospGetBucketSyncProgress(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketSyncProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketLifecycleProgressResp**](OspBucketLifecycleProgressResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketSyncReplicationGroup"></a>
# **ospGetBucketSyncReplicationGroup**
> OspBucketSyncReplicationGroupResp ospGetBucketSyncReplicationGroup(id, groupId)



Returns bucket sync replication group info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long groupId = 789L; // Long | bucket sync replication group id
try {
    OspBucketSyncReplicationGroupResp result = apiInstance.ospGetBucketSyncReplicationGroup(id, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketSyncReplicationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **groupId** | **Long**| bucket sync replication group id |

### Return type

[**OspBucketSyncReplicationGroupResp**](OspBucketSyncReplicationGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketSyncRule"></a>
# **ospGetBucketSyncRule**
> OspBucketSyncRuleResp ospGetBucketSyncRule(id, ruleId)



Returns bucket sync rule info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | bucket sync rule id
try {
    OspBucketSyncRuleResp result = apiInstance.ospGetBucketSyncRule(id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| bucket sync rule id |

### Return type

[**OspBucketSyncRuleResp**](OspBucketSyncRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketSyncSamples"></a>
# **ospGetBucketSyncSamples**
> OspBucketSyncSamplesResp ospGetBucketSyncSamples(id, durationBegin, durationEnd, period)



Returns bucket sync&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspBucketSyncSamplesResp result = apiInstance.ospGetBucketSyncSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketSyncSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspBucketSyncSamplesResp**](OspBucketSyncSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetBucketTagging"></a>
# **ospGetBucketTagging**
> OspBucketTagsResp ospGetBucketTagging(id)



Returns a bucket&#x27;s tagging setting

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketTagsResp result = apiInstance.ospGetBucketTagging(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetBucketTagging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketTagsResp**](OspBucketTagsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetCluster"></a>
# **ospGetCluster**
> OspClustersResp ospGetCluster(uuid)



Returns cluster info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String uuid = "uuid_example"; // String | cluster uuid
try {
    OspClustersResp result = apiInstance.ospGetCluster(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| cluster uuid |

### Return type

[**OspClustersResp**](OspClustersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetDataBackend"></a>
# **ospGetDataBackend**
> OspDataBackendResp ospGetDataBackend(id)



Returns data backend info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend id
try {
    OspDataBackendResp result = apiInstance.ospGetDataBackend(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend id |

### Return type

[**OspDataBackendResp**](OspDataBackendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetDataBackendSamples"></a>
# **ospGetDataBackendSamples**
> OspDataBackendSamplesResp ospGetDataBackendSamples(id, durationBegin, durationEnd, period)



Get data backend&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspDataBackendSamplesResp result = apiInstance.ospGetDataBackendSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetDataBackendSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspDataBackendSamplesResp**](OspDataBackendSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetDataBackendStorageClassUsages"></a>
# **ospGetDataBackendStorageClassUsages**
> OspDataBackendStorageClassUsagesResp ospGetDataBackendStorageClassUsages(id, targetId, policyId, zoneId)



Get data backend&#x27;s storage class level usages

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend id
Long targetId = 789L; // Long | target id
Long policyId = 789L; // Long | storage policy id
Long zoneId = 789L; // Long | zone id
try {
    OspDataBackendStorageClassUsagesResp result = apiInstance.ospGetDataBackendStorageClassUsages(id, targetId, policyId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetDataBackendStorageClassUsages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend id | [optional]
 **targetId** | **Long**| target id | [optional]
 **policyId** | **Long**| storage policy id | [optional]
 **zoneId** | **Long**| zone id | [optional]

### Return type

[**OspDataBackendStorageClassUsagesResp**](OspDataBackendStorageClassUsagesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetDataBackendStrategyInfo"></a>
# **ospGetDataBackendStrategyInfo**
> OspDataBackendResp ospGetDataBackendStrategyInfo(id)



Returns data backend strategy status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend id
try {
    OspDataBackendResp result = apiInstance.ospGetDataBackendStrategyInfo(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetDataBackendStrategyInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend id |

### Return type

[**OspDataBackendResp**](OspDataBackendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetDataBackendValidator"></a>
# **ospGetDataBackendValidator**
> OspDataBackendValidatorResp ospGetDataBackendValidator(id)



Get a data backend validator

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | data backend validator id
try {
    OspDataBackendValidatorResp result = apiInstance.ospGetDataBackendValidator(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetDataBackendValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| data backend validator id |

### Return type

[**OspDataBackendValidatorResp**](OspDataBackendValidatorResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetEventTarget"></a>
# **ospGetEventTarget**
> OspEventTargetResp ospGetEventTarget(id)



get event target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | event id
try {
    OspEventTargetResp result = apiInstance.ospGetEventTarget(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetEventTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| event id |

### Return type

[**OspEventTargetResp**](OspEventTargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetGatewayStats"></a>
# **ospGetGatewayStats**
> OspGatewayStatsResp ospGetGatewayStats()



Returns internal gateway stats key info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspGatewayStatsResp result = apiInstance.ospGetGatewayStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetGatewayStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspGatewayStatsResp**](OspGatewayStatsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetGlobalConf"></a>
# **ospGetGlobalConf**
> OspGlobalConfResp ospGetGlobalConf()



Returns global conf info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspGlobalConfResp result = apiInstance.ospGetGlobalConf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetGlobalConf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspGlobalConfResp**](OspGlobalConfResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetObjectGateway"></a>
# **ospGetObjectGateway**
> OspObjectGatewayResp ospGetObjectGateway(id)



Returns object gateway info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | object gateway id
try {
    OspObjectGatewayResp result = apiInstance.ospGetObjectGateway(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetObjectGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| object gateway id |

### Return type

[**OspObjectGatewayResp**](OspObjectGatewayResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetOverview"></a>
# **ospGetOverview**
> OspOverviewResp ospGetOverview()



Returns arthas cluster overview info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspOverviewResp result = apiInstance.ospGetOverview();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetOverview");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspOverviewResp**](OspOverviewResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetOverviewSamples"></a>
# **ospGetOverviewSamples**
> OspOverviewSamplesResp ospGetOverviewSamples(durationBegin, durationEnd, period)



Returns overview&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspOverviewSamplesResp result = apiInstance.ospGetOverviewSamples(durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetOverviewSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspOverviewSamplesResp**](OspOverviewSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetRecycleBucket"></a>
# **ospGetRecycleBucket**
> OspBucketResp ospGetRecycleBucket(bucketId)



Returns recycle bucket info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long bucketId = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospGetRecycleBucket(bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetRecycleBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetRole"></a>
# **ospGetRole**
> OspRoleResp ospGetRole(id)



Returns role info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | role id
try {
    OspRoleResp result = apiInstance.ospGetRole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| role id |

### Return type

[**OspRoleResp**](OspRoleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetStoragePolicy"></a>
# **ospGetStoragePolicy**
> OspStoragePolicyResp ospGetStoragePolicy(id)



Returns storage policy info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospGetStoragePolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUser"></a>
# **ospGetUser**
> OspUserResp ospGetUser(id)



Returns user info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospGetUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUserFlowSamples"></a>
# **ospGetUserFlowSamples**
> OspUserFlowSamplesResp ospGetUserFlowSamples(id, durationBegin, durationEnd, period)



Returns user flow&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspUserFlowSamplesResp result = apiInstance.ospGetUserFlowSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUserFlowSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspUserFlowSamplesResp**](OspUserFlowSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUserOriginPullSamples"></a>
# **ospGetUserOriginPullSamples**
> OspUserOriginPullSamplesResp ospGetUserOriginPullSamples(id, originMode, durationBegin, durationEnd, period)



Returns user origin pull samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
String originMode = "originMode_example"; // String | origin mode
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspUserOriginPullSamplesResp result = apiInstance.ospGetUserOriginPullSamples(id, originMode, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUserOriginPullSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |
 **originMode** | **String**| origin mode | [optional]
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspUserOriginPullSamplesResp**](OspUserOriginPullSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUserReplicationSamples"></a>
# **ospGetUserReplicationSamples**
> OspUserReplicationSamplesResp ospGetUserReplicationSamples(id, durationBegin, durationEnd, period)



Returns user replication&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspUserReplicationSamplesResp result = apiInstance.ospGetUserReplicationSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUserReplicationSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspUserReplicationSamplesResp**](OspUserReplicationSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUserSamples"></a>
# **ospGetUserSamples**
> OspUserSamplesResp ospGetUserSamples(id, durationBegin, durationEnd, period)



Returns user&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspUserSamplesResp result = apiInstance.ospGetUserSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUserSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspUserSamplesResp**](OspUserSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetUserSyncSamples"></a>
# **ospGetUserSyncSamples**
> OspUserSyncSamplesResp ospGetUserSyncSamples(id, durationBegin, durationEnd, period)



Returns user sync&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | user id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspUserSyncSamplesResp result = apiInstance.ospGetUserSyncSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetUserSyncSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| user id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspUserSyncSamplesResp**](OspUserSyncSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetZone"></a>
# **ospGetZone**
> OspZoneResp ospGetZone(id)



Returns zone info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospGetZone(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetZoneGroup"></a>
# **ospGetZoneGroup**
> OspZoneGroupResp ospGetZoneGroup(id)



Returns zone group info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone group id
try {
    OspZoneGroupResp result = apiInstance.ospGetZoneGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetZoneGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone group id |

### Return type

[**OspZoneGroupResp**](OspZoneGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetZonePairSamples"></a>
# **ospGetZonePairSamples**
> OspZonePairSamplesResp ospGetZonePairSamples(id, durationBegin, durationEnd, period)



Returns zonePair&#x27;s samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone pair id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspZonePairSamplesResp result = apiInstance.ospGetZonePairSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetZonePairSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone pair id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspZonePairSamplesResp**](OspZonePairSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospGetZoneSamples"></a>
# **ospGetZoneSamples**
> OspZoneSamplesResp ospGetZoneSamples(id, durationBegin, durationEnd, period)



Get zone samples

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | zone id
String durationBegin = "durationBegin_example"; // String | duration begin timestamp
String durationEnd = "durationEnd_example"; // String | duration end timestamp
String period = "period_example"; // String | samples period
try {
    OspZoneSamplesResp result = apiInstance.ospGetZoneSamples(id, durationBegin, durationEnd, period);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospGetZoneSamples");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| zone id |
 **durationBegin** | **String**| duration begin timestamp | [optional]
 **durationEnd** | **String**| duration end timestamp | [optional]
 **period** | **String**| samples period | [optional]

### Return type

[**OspZoneSamplesResp**](OspZoneSamplesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListAccessKeys"></a>
# **ospListAccessKeys**
> OspAccessKeysResp ospListAccessKeys(userId)



List access keys

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long userId = 789L; // Long | The id of user that access key belong to
try {
    OspAccessKeysResp result = apiInstance.ospListAccessKeys(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListAccessKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| The id of user that access key belong to | [optional]

### Return type

[**OspAccessKeysResp**](OspAccessKeysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListAdminGateways"></a>
# **ospListAdminGateways**
> OspAdminGatewaysResp ospListAdminGateways()



Returns admin gateways info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspAdminGatewaysResp result = apiInstance.ospListAdminGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListAdminGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspAdminGatewaysResp**](OspAdminGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketLoggings"></a>
# **ospListBucketLoggings**
> OspBucketLoggingsResp ospListBucketLoggings(limit, offset, sourceBucketName, targetBucketName)



List bucket loggings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
String sourceBucketName = "sourceBucketName_example"; // String | source bucket name
String targetBucketName = "targetBucketName_example"; // String | target bucket name
try {
    OspBucketLoggingsResp result = apiInstance.ospListBucketLoggings(limit, offset, sourceBucketName, targetBucketName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketLoggings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **sourceBucketName** | **String**| source bucket name | [optional]
 **targetBucketName** | **String**| target bucket name | [optional]

### Return type

[**OspBucketLoggingsResp**](OspBucketLoggingsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketNFSGatewayMaps"></a>
# **ospListBucketNFSGatewayMaps**
> OspBucketNFSGatewayMapsResp ospListBucketNFSGatewayMaps(bucketName, region, zoneId, nfsGatewayId)



Returns bucket nfs gateway maps info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long bucketName = 789L; // Long | bucket name
Long region = 789L; // Long | region uuid
Long zoneId = 789L; // Long | zone id
Long nfsGatewayId = 789L; // Long | nfs gateway id
try {
    OspBucketNFSGatewayMapsResp result = apiInstance.ospListBucketNFSGatewayMaps(bucketName, region, zoneId, nfsGatewayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketNFSGatewayMaps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketName** | **Long**| bucket name |
 **region** | **Long**| region uuid |
 **zoneId** | **Long**| zone id |
 **nfsGatewayId** | **Long**| nfs gateway id |

### Return type

[**OspBucketNFSGatewayMapsResp**](OspBucketNFSGatewayMapsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketOriginRules"></a>
# **ospListBucketOriginRules**
> OspBucketOriginRulesResp ospListBucketOriginRules(id)



Lists bucket origin rules info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketOriginRulesResp result = apiInstance.ospListBucketOriginRules(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketOriginRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketOriginRulesResp**](OspBucketOriginRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketRebuildRules"></a>
# **ospListBucketRebuildRules**
> OspBucketRebuildRulesResp ospListBucketRebuildRules(id)



Lists bucket rebuild rules info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketRebuildRulesResp result = apiInstance.ospListBucketRebuildRules(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketRebuildRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketRebuildRulesResp**](OspBucketRebuildRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketReplicationRules"></a>
# **ospListBucketReplicationRules**
> OspBucketReplicationResp ospListBucketReplicationRules(id)



Lists bucket replication rules info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketReplicationResp result = apiInstance.ospListBucketReplicationRules(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketReplicationRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketReplicationResp**](OspBucketReplicationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketSnapshot"></a>
# **ospListBucketSnapshot**
> OspSnapshotsResp ospListBucketSnapshot(id, type)



Lists bucket snapshots info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
String type = "type_example"; // String | snapshot type
try {
    OspSnapshotsResp result = apiInstance.ospListBucketSnapshot(id, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **type** | **String**| snapshot type | [optional]

### Return type

[**OspSnapshotsResp**](OspSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketSyncReplicationGroups"></a>
# **ospListBucketSyncReplicationGroups**
> OspBucketSyncReplicationGroupsResp ospListBucketSyncReplicationGroups(id)



Returns bucket sync replication groups info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketSyncReplicationGroupsResp result = apiInstance.ospListBucketSyncReplicationGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketSyncReplicationGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketSyncReplicationGroupsResp**](OspBucketSyncReplicationGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBucketSyncRules"></a>
# **ospListBucketSyncRules**
> OspBucketSyncRulesResp ospListBucketSyncRules(id)



Returns bucket sync rules info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketSyncRulesResp result = apiInstance.ospListBucketSyncRules(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBucketSyncRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketSyncRulesResp**](OspBucketSyncRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListBuckets"></a>
# **ospListBuckets**
> OspBucketsResp ospListBuckets(name, userId, policyId, logDeliveryEnabled, containRecycle, queryMode, ids)



Returns buckets info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | The name of bucket
Long userId = 789L; // Long | The id of user that buckets belong to
Long policyId = 789L; // Long | The id of storage policy that buckets belong to
Boolean logDeliveryEnabled = true; // Boolean | logging delivery permission enabled
Boolean containRecycle = true; // Boolean | contain enabled
String queryMode = "queryMode_example"; // String | query mode
Long ids = 789L; // Long | bucket ids
try {
    OspBucketsResp result = apiInstance.ospListBuckets(name, userId, policyId, logDeliveryEnabled, containRecycle, queryMode, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of bucket | [optional]
 **userId** | **Long**| The id of user that buckets belong to | [optional]
 **policyId** | **Long**| The id of storage policy that buckets belong to | [optional]
 **logDeliveryEnabled** | **Boolean**| logging delivery permission enabled | [optional]
 **containRecycle** | **Boolean**| contain enabled | [optional]
 **queryMode** | **String**| query mode | [optional]
 **ids** | **Long**| bucket ids | [optional]

### Return type

[**OspBucketsResp**](OspBucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListClusters"></a>
# **ospListClusters**
> OspClusterResp ospListClusters()



Returns clusters info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspClusterResp result = apiInstance.ospListClusters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListClusters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspClusterResp**](OspClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListDataBackendTargets"></a>
# **ospListDataBackendTargets**
> OspDataBackendListTargetsResp ospListDataBackendTargets(body, id)



List data backend all targets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDataBackendListTargetsReq body = new OspDataBackendListTargetsReq(); // OspDataBackendListTargetsReq | data backend info
Long id = 789L; // Long | data backend id
try {
    OspDataBackendListTargetsResp result = apiInstance.ospListDataBackendTargets(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListDataBackendTargets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendListTargetsReq**](OspDataBackendListTargetsReq.md)| data backend info |
 **id** | **Long**| data backend id |

### Return type

[**OspDataBackendListTargetsResp**](OspDataBackendListTargetsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospListDataBackendZoneRelations"></a>
# **ospListDataBackendZoneRelations**
> OspDataBackendZoneRelationsResp ospListDataBackendZoneRelations(limit, offset, zoneId, dataBackendId, platformType, platform)



Lists data backend zone relations

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long zoneId = 789L; // Long | zone id
Long dataBackendId = 789L; // Long | data backend id
String platformType = "platformType_example"; // String | platform type
String platform = "platform_example"; // String | platform
try {
    OspDataBackendZoneRelationsResp result = apiInstance.ospListDataBackendZoneRelations(limit, offset, zoneId, dataBackendId, platformType, platform);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListDataBackendZoneRelations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **zoneId** | **Long**| zone id | [optional]
 **dataBackendId** | **Long**| data backend id | [optional]
 **platformType** | **String**| platform type | [optional]
 **platform** | **String**| platform | [optional]

### Return type

[**OspDataBackendZoneRelationsResp**](OspDataBackendZoneRelationsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListDataBackends"></a>
# **ospListDataBackends**
> OspDataBackendsResp ospListDataBackends(type, platform, name, status)



Returns data backends info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String type = "type_example"; // String | data backend type
String platform = "platform_example"; // String | data backend platform
String name = "name_example"; // String | data backend name
String status = "status_example"; // String | data backend status
try {
    OspDataBackendsResp result = apiInstance.ospListDataBackends(type, platform, name, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListDataBackends");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| data backend type | [optional]
 **platform** | **String**| data backend platform | [optional]
 **name** | **String**| data backend name | [optional]
 **status** | **String**| data backend status | [optional]

### Return type

[**OspDataBackendsResp**](OspDataBackendsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListEventTargets"></a>
# **ospListEventTargets**
> OspEventTargetsResp ospListEventTargets(marker, maxKeys)



list event targets

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String marker = "marker_example"; // String | target id
Long maxKeys = 789L; // Long | max keys
try {
    OspEventTargetsResp result = apiInstance.ospListEventTargets(marker, maxKeys);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListEventTargets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marker** | **String**| target id | [optional]
 **maxKeys** | **Long**| max keys | [optional]

### Return type

[**OspEventTargetsResp**](OspEventTargetsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListObjectGateways"></a>
# **ospListObjectGateways**
> OspObjectGatewaysResp ospListObjectGateways()



Returns object gateways info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspObjectGatewaysResp result = apiInstance.ospListObjectGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListObjectGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspObjectGatewaysResp**](OspObjectGatewaysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListOriginRules"></a>
# **ospListOriginRules**
> OspBucketOriginRulesResp ospListOriginRules(bucketId, ngosDataBackendId)



Lists all bucket origin rules info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long bucketId = 789L; // Long | bucket id
Long ngosDataBackendId = 789L; // Long | ngos data backend id
try {
    OspBucketOriginRulesResp result = apiInstance.ospListOriginRules(bucketId, ngosDataBackendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListOriginRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bucketId** | **Long**| bucket id | [optional]
 **ngosDataBackendId** | **Long**| ngos data backend id | [optional]

### Return type

[**OspBucketOriginRulesResp**](OspBucketOriginRulesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListRecycleBuckets"></a>
# **ospListRecycleBuckets**
> OspBucketsResp ospListRecycleBuckets()



Returns recycle buckets info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
try {
    OspBucketsResp result = apiInstance.ospListRecycleBuckets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListRecycleBuckets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OspBucketsResp**](OspBucketsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListStoragePolicies"></a>
# **ospListStoragePolicies**
> OspStoragePoliciesResp ospListStoragePolicies(zoneId, dataBackendId, name)



Returns storage policies info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long zoneId = 789L; // Long | The id of zone that policy used
Long dataBackendId = 789L; // Long | The id of data backend that policy used
String name = "name_example"; // String | query param of search
try {
    OspStoragePoliciesResp result = apiInstance.ospListStoragePolicies(zoneId, dataBackendId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListStoragePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Long**| The id of zone that policy used | [optional]
 **dataBackendId** | **Long**| The id of data backend that policy used | [optional]
 **name** | **String**| query param of search | [optional]

### Return type

[**OspStoragePoliciesResp**](OspStoragePoliciesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListUserKeys"></a>
# **ospListUserKeys**
> OspUsersKeysResp ospListUserKeys(name, admin)



Returns users info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | The name of user
Boolean admin = true; // Boolean | The user authority type
try {
    OspUsersKeysResp result = apiInstance.ospListUserKeys(name, admin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListUserKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of user | [optional]
 **admin** | **Boolean**| The user authority type | [optional]

### Return type

[**OspUsersKeysResp**](OspUsersKeysResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListUsers"></a>
# **ospListUsers**
> OspUsersResp ospListUsers(name, admin)



Returns users info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | The name of user
Boolean admin = true; // Boolean | The user authority type
try {
    OspUsersResp result = apiInstance.ospListUsers(name, admin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of user | [optional]
 **admin** | **Boolean**| The user authority type | [optional]

### Return type

[**OspUsersResp**](OspUsersResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListZoneGroups"></a>
# **ospListZoneGroups**
> OspZoneGroupsResp ospListZoneGroups(limit, offset)



Returns zone groups info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
try {
    OspZoneGroupsResp result = apiInstance.ospListZoneGroups(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListZoneGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]

### Return type

[**OspZoneGroupsResp**](OspZoneGroupsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListZonePairs"></a>
# **ospListZonePairs**
> OspZonePairsResp ospListZonePairs(limit, offset, sourceZoneId, destinationZoneId)



Lists zone pairs

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long limit = 789L; // Long | paging param
Long offset = 789L; // Long | paging param
Long sourceZoneId = 789L; // Long | source zone id
Long destinationZoneId = 789L; // Long | destination zone id
try {
    OspZonePairsResp result = apiInstance.ospListZonePairs(limit, offset, sourceZoneId, destinationZoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListZonePairs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Long**| paging param | [optional]
 **offset** | **Long**| paging param | [optional]
 **sourceZoneId** | **Long**| source zone id | [optional]
 **destinationZoneId** | **Long**| destination zone id | [optional]

### Return type

[**OspZonePairsResp**](OspZonePairsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospListZones"></a>
# **ospListZones**
> OspZonesResp ospListZones(policyId, name)



Returns zones info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long policyId = 789L; // Long | storage policy id
String name = "name_example"; // String | zone name
try {
    OspZonesResp result = apiInstance.ospListZones(policyId, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospListZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **Long**| storage policy id | [optional]
 **name** | **String**| zone name | [optional]

### Return type

[**OspZonesResp**](OspZonesResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospRecoveryRecycleBucket"></a>
# **ospRecoveryRecycleBucket**
> OspBucketResp ospRecoveryRecycleBucket(body, bucketId)



recovery recycle bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspRecoveryBucketReq body = new OspRecoveryBucketReq(); // OspRecoveryBucketReq | recovery recycle
Long bucketId = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospRecoveryRecycleBucket(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospRecoveryRecycleBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspRecoveryBucketReq**](OspRecoveryBucketReq.md)| recovery recycle |
 **bucketId** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospRemoveBucketLoggings"></a>
# **ospRemoveBucketLoggings**
> OspBucketResp ospRemoveBucketLoggings(id)



Remove a bucket&#x27;s logging info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospRemoveBucketLoggings(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospRemoveBucketLoggings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospRemoveDataBackendsFromZone"></a>
# **ospRemoveDataBackendsFromZone**
> OspZoneResp ospRemoveDataBackendsFromZone(body, id)



remove dateBackends from zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneRemoveDataBackendsReq body = new OspZoneRemoveDataBackendsReq(); // OspZoneRemoveDataBackendsReq | zone data backends info
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospRemoveDataBackendsFromZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospRemoveDataBackendsFromZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneRemoveDataBackendsReq**](OspZoneRemoveDataBackendsReq.md)| zone data backends info |
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospRemoveHostsFromZone"></a>
# **ospRemoveHostsFromZone**
> OspZoneResp ospRemoveHostsFromZone(body, id)



remove hosts from a zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneHostsOpReq body = new OspZoneHostsOpReq(); // OspZoneHostsOpReq | zone hosts info
Long id = 789L; // Long | zone id
try {
    OspZoneResp result = apiInstance.ospRemoveHostsFromZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospRemoveHostsFromZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneHostsOpReq**](OspZoneHostsOpReq.md)| zone hosts info |
 **id** | **Long**| zone id |

### Return type

[**OspZoneResp**](OspZoneResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketACL"></a>
# **ospSetBucketACL**
> OspBucketResp ospSetBucketACL(id, body)



Updates a bucket&#x27;s acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
OspBucketSetACLReq body = new OspBucketSetACLReq(); // OspBucketSetACLReq | true
try {
    OspBucketResp result = apiInstance.ospSetBucketACL(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **body** | [**OspBucketSetACLReq**](OspBucketSetACLReq.md)| true | [optional]

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketCompact"></a>
# **ospSetBucketCompact**
> OspBucketResp ospSetBucketCompact(body, id)



set a bucket&#x27;s compact configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetCompactReq body = new OspBucketSetCompactReq(); // OspBucketSetCompactReq | bucket compact config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketCompact(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketCompact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetCompactReq**](OspBucketSetCompactReq.md)| bucket compact config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketCompression"></a>
# **ospSetBucketCompression**
> OspBucketResp ospSetBucketCompression(body, id)



Updates a bucket&#x27;s compression configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetCompressionReq body = new OspBucketSetCompressionReq(); // OspBucketSetCompressionReq | bucket compression config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketCompression(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketCompression");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetCompressionReq**](OspBucketSetCompressionReq.md)| bucket compression config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketCors"></a>
# **ospSetBucketCors**
> OspBucketResp ospSetBucketCors(body, id)



Updates a bucket&#x27;s cors configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetCorsReq body = new OspBucketSetCorsReq(); // OspBucketSetCorsReq | bucket cors config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketCors(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketCors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetCorsReq**](OspBucketSetCorsReq.md)| bucket cors config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketDefaultReadMode"></a>
# **ospSetBucketDefaultReadMode**
> OspBucketResp ospSetBucketDefaultReadMode(body, id)



set a bucket&#x27;s default read mode configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetDefaultReadModeReq body = new OspBucketSetDefaultReadModeReq(); // OspBucketSetDefaultReadModeReq | bucket default-read-mode config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketDefaultReadMode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketDefaultReadMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetDefaultReadModeReq**](OspBucketSetDefaultReadModeReq.md)| bucket default-read-mode config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketDescription"></a>
# **ospSetBucketDescription**
> OspBucketResp ospSetBucketDescription(body, id)



Updates a bucket&#x27;s description

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetDescriptionReq body = new OspBucketSetDescriptionReq(); // OspBucketSetDescriptionReq | bucket tags config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketDescription(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketDescription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetDescriptionReq**](OspBucketSetDescriptionReq.md)| bucket tags config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketEncryptionDefault"></a>
# **ospSetBucketEncryptionDefault**
> OspBucketResp ospSetBucketEncryptionDefault(body, id)



Updates a bucket&#x27;s encryption default configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetEncryptionDefaultReq body = new OspBucketSetEncryptionDefaultReq(); // OspBucketSetEncryptionDefaultReq | bucket encryption config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketEncryptionDefault(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketEncryptionDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetEncryptionDefaultReq**](OspBucketSetEncryptionDefaultReq.md)| bucket encryption config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketLifecycleRules"></a>
# **ospSetBucketLifecycleRules**
> OspBucketResp ospSetBucketLifecycleRules(body, id)



Updates a bucket&#x27;s lifecycle rules

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetLifecycleRulesReq body = new OspBucketSetLifecycleRulesReq(); // OspBucketSetLifecycleRulesReq | bucket lifecycle rules'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketLifecycleRules(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketLifecycleRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetLifecycleRulesReq**](OspBucketSetLifecycleRulesReq.md)| bucket lifecycle rules&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketLifecycleRunningConf"></a>
# **ospSetBucketLifecycleRunningConf**
> OspBucketResp ospSetBucketLifecycleRunningConf(body, id)



Updates a bucket&#x27;s lifecycle running config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetLifecycleRunningConfReq body = new OspBucketSetLifecycleRunningConfReq(); // OspBucketSetLifecycleRunningConfReq | bucket lifecycle running info'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketLifecycleRunningConf(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketLifecycleRunningConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetLifecycleRunningConfReq**](OspBucketSetLifecycleRunningConfReq.md)| bucket lifecycle running info&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketLock"></a>
# **ospSetBucketLock**
> OspBucketResp ospSetBucketLock(body, id)



Updates a bucket&#x27;s lock configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetLockReq body = new OspBucketSetLockReq(); // OspBucketSetLockReq | bucket lock config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketLock(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetLockReq**](OspBucketSetLockReq.md)| bucket lock config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketLogging"></a>
# **ospSetBucketLogging**
> OspBucketResp ospSetBucketLogging(body, id)



Updates a bucket&#x27;s logging configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetLoggingReq body = new OspBucketSetLoggingReq(); // OspBucketSetLoggingReq | bucket logging config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketLogging(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetLoggingReq**](OspBucketSetLoggingReq.md)| bucket logging config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketObjectDeleteMode"></a>
# **ospSetBucketObjectDeleteMode**
> OspBucketResp ospSetBucketObjectDeleteMode(body, id)



set a bucket&#x27;s object delete mode configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetObjectDeleteModeReq body = new OspBucketSetObjectDeleteModeReq(); // OspBucketSetObjectDeleteModeReq | bucket object delete mode config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketObjectDeleteMode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketObjectDeleteMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetObjectDeleteModeReq**](OspBucketSetObjectDeleteModeReq.md)| bucket object delete mode config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketObjectInheritACL"></a>
# **ospSetBucketObjectInheritACL**
> OspBucketResp ospSetBucketObjectInheritACL(id, body)



Updates a bucket&#x27;s object inherit acl

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
OspBucketSetObjectInheritACLReq body = new OspBucketSetObjectInheritACLReq(); // OspBucketSetObjectInheritACLReq | true
try {
    OspBucketResp result = apiInstance.ospSetBucketObjectInheritACL(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketObjectInheritACL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |
 **body** | [**OspBucketSetObjectInheritACLReq**](OspBucketSetObjectInheritACLReq.md)| true | [optional]

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketObjectRecycle"></a>
# **ospSetBucketObjectRecycle**
> OspBucketResp ospSetBucketObjectRecycle(body, id)



set a bucket&#x27;s object recycle configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetObjectRecycleReq body = new OspBucketSetObjectRecycleReq(); // OspBucketSetObjectRecycleReq | bucket object recycle config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketObjectRecycle(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketObjectRecycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetObjectRecycleReq**](OspBucketSetObjectRecycleReq.md)| bucket object recycle config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketOwner"></a>
# **ospSetBucketOwner**
> OspBucketResp ospSetBucketOwner(body, id)



Updates a bucket&#x27;s owner

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetOwnerReq body = new OspBucketSetOwnerReq(); // OspBucketSetOwnerReq | bucket owner'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketOwner(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketOwner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetOwnerReq**](OspBucketSetOwnerReq.md)| bucket owner&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketPolicy"></a>
# **ospSetBucketPolicy**
> OspBucketResp ospSetBucketPolicy(body, id)



Updates a bucket&#x27;s policy configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetPolicyReq body = new OspBucketSetPolicyReq(); // OspBucketSetPolicyReq | bucket policy config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketPolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetPolicyReq**](OspBucketSetPolicyReq.md)| bucket policy config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketQos"></a>
# **ospSetBucketQos**
> OspBucketResp ospSetBucketQos(body, id)



Updates bucket qos info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetQosReq body = new OspBucketSetQosReq(); // OspBucketSetQosReq | bucket qos config
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketQos(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetQosReq**](OspBucketSetQosReq.md)| bucket qos config |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketQuota"></a>
# **ospSetBucketQuota**
> OspBucketResp ospSetBucketQuota(body, id)



Updates a bucket&#x27;s quota configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetQuotaReq body = new OspBucketSetQuotaReq(); // OspBucketSetQuotaReq | bucket quota config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketQuota(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetQuotaReq**](OspBucketSetQuotaReq.md)| bucket quota config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketQuotaRule"></a>
# **ospSetBucketQuotaRule**
> OspBucketResp ospSetBucketQuotaRule(body, id)



Updates a bucket&#x27;s quota rule configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetQuotaRuleReq body = new OspBucketSetQuotaRuleReq(); // OspBucketSetQuotaRuleReq | bucket quota rule config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketQuotaRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketQuotaRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetQuotaRuleReq**](OspBucketSetQuotaRuleReq.md)| bucket quota rule config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketReadonlyZones"></a>
# **ospSetBucketReadonlyZones**
> OspBucketResp ospSetBucketReadonlyZones(body, id)



set a bucket&#x27;s readonly zones configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetReadonlyZonesReq body = new OspBucketSetReadonlyZonesReq(); // OspBucketSetReadonlyZonesReq | bucket readonly zone config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketReadonlyZones(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketReadonlyZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetReadonlyZonesReq**](OspBucketSetReadonlyZonesReq.md)| bucket readonly zone config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketRebuildZone"></a>
# **ospSetBucketRebuildZone**
> OspBucketResp ospSetBucketRebuildZone(body, id)



Set bucket rebuild zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetRebuildZoneReq body = new OspBucketSetRebuildZoneReq(); // OspBucketSetRebuildZoneReq | rebuild zone info
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketRebuildZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketRebuildZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetRebuildZoneReq**](OspBucketSetRebuildZoneReq.md)| rebuild zone info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketReplicationStatus"></a>
# **ospSetBucketReplicationStatus**
> OspBucketReplicationResp ospSetBucketReplicationStatus(body, id, ruleId)



Set bucket replication rule status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetReplicationStatusReq body = new OspBucketSetReplicationStatusReq(); // OspBucketSetReplicationStatusReq | replication rule conf info
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | rule id
try {
    OspBucketReplicationResp result = apiInstance.ospSetBucketReplicationStatus(body, id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketReplicationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetReplicationStatusReq**](OspBucketSetReplicationStatusReq.md)| replication rule conf info |
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| rule id |

### Return type

[**OspBucketReplicationResp**](OspBucketReplicationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketReplicationZone"></a>
# **ospSetBucketReplicationZone**
> OspBucketResp ospSetBucketReplicationZone(body, id)



Set bucket replication zone

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetReplicationZoneReq body = new OspBucketSetReplicationZoneReq(); // OspBucketSetReplicationZoneReq | replication zone info
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketReplicationZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetReplicationZoneReq**](OspBucketSetReplicationZoneReq.md)| replication zone info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketSnapshot"></a>
# **ospSetBucketSnapshot**
> OspSnapshotsResp ospSetBucketSnapshot(body, id, snapshotId)



set bucket snapshot info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSnapshotSetReq body = new OspBucketSnapshotSetReq(); // OspBucketSnapshotSetReq | bucket snapshot info
Long id = 789L; // Long | bucket id
Long snapshotId = 789L; // Long | snapshot id
try {
    OspSnapshotsResp result = apiInstance.ospSetBucketSnapshot(body, id, snapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSnapshotSetReq**](OspBucketSnapshotSetReq.md)| bucket snapshot info |
 **id** | **Long**| bucket id |
 **snapshotId** | **Long**| snapshot id |

### Return type

[**OspSnapshotsResp**](OspSnapshotsResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketSnapshotLimit"></a>
# **ospSetBucketSnapshotLimit**
> OspBucketResp ospSetBucketSnapshotLimit(body, id)



Updates a bucket&#x27;s snapshot limit configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetSnapshotLimitReq body = new OspBucketSetSnapshotLimitReq(); // OspBucketSetSnapshotLimitReq | bucket snapshot limit config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketSnapshotLimit(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketSnapshotLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetSnapshotLimitReq**](OspBucketSetSnapshotLimitReq.md)| bucket snapshot limit config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketStorageClassRule"></a>
# **ospSetBucketStorageClassRule**
> OspBucketResp ospSetBucketStorageClassRule(body, id)



Set bucket storage class rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetStorageClassRuleReq body = new OspBucketSetStorageClassRuleReq(); // OspBucketSetStorageClassRuleReq | bucket storage class rule info
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketStorageClassRule(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketStorageClassRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetStorageClassRuleReq**](OspBucketSetStorageClassRuleReq.md)| bucket storage class rule info |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketSyncStatus"></a>
# **ospSetBucketSyncStatus**
> OspBucketResp ospSetBucketSyncStatus(body, id)



Updates a bucket&#x27;s sync status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetSyncStatusReq body = new OspBucketSetSyncStatusReq(); // OspBucketSetSyncStatusReq | bucket sync status'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketSyncStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketSyncStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetSyncStatusReq**](OspBucketSetSyncStatusReq.md)| bucket sync status&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketTags"></a>
# **ospSetBucketTags**
> OspBucketResp ospSetBucketTags(body, id)



Updates a bucket&#x27;s tags

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetTagsReq body = new OspBucketSetTagsReq(); // OspBucketSetTagsReq | bucket tags config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketTags(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetTagsReq**](OspBucketSetTagsReq.md)| bucket tags config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketTierAccessMode"></a>
# **ospSetBucketTierAccessMode**
> OspBucketResp ospSetBucketTierAccessMode(body, id)



Updates a bucket&#x27;s tier access mode configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetTierAccessModeReq body = new OspBucketSetTierAccessModeReq(); // OspBucketSetTierAccessModeReq | bucket tier access mode config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketTierAccessMode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketTierAccessMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetTierAccessModeReq**](OspBucketSetTierAccessModeReq.md)| bucket tier access mode config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketTierWorm"></a>
# **ospSetBucketTierWorm**
> OspBucketResp ospSetBucketTierWorm(body, id)



Updates a bucket&#x27;s tier worm configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetTierWormReq body = new OspBucketSetTierWormReq(); // OspBucketSetTierWormReq | bucket tier worm config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketTierWorm(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketTierWorm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetTierWormReq**](OspBucketSetTierWormReq.md)| bucket tier worm config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetBucketVersioning"></a>
# **ospSetBucketVersioning**
> OspBucketResp ospSetBucketVersioning(body, id)



Updates a bucket&#x27;s versioning status

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSetVersioningReq body = new OspBucketSetVersioningReq(); // OspBucketSetVersioningReq | bucket versioning config'
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSetBucketVersioning(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetBucketVersioning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSetVersioningReq**](OspBucketSetVersioningReq.md)| bucket versioning config&#x27; |
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetDefaultStoragePolicy"></a>
# **ospSetDefaultStoragePolicy**
> OspStoragePolicyResp ospSetDefaultStoragePolicy(body, id)



Updates storage policy default config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetDefaultReq body = new OspStoragePolicySetDefaultReq(); // OspStoragePolicySetDefaultReq | storage policy default info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetDefaultStoragePolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetDefaultStoragePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetDefaultReq**](OspStoragePolicySetDefaultReq.md)| storage policy default info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetLifecycleZone"></a>
# **ospSetLifecycleZone**
> OspStoragePolicyResp ospSetLifecycleZone(body, id)



Updates policy Lifecycle zone config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetLifecycleZone body = new OspStoragePolicySetLifecycleZone(); // OspStoragePolicySetLifecycleZone | storage policy lifecycle zone info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetLifecycleZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetLifecycleZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetLifecycleZone**](OspStoragePolicySetLifecycleZone.md)| storage policy lifecycle zone info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetOpMask"></a>
# **ospSetOpMask**
> OspUserResp ospSetOpMask(body, id)



Updates user op mask info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetOpMaskReq body = new OspUserSetOpMaskReq(); // OspUserSetOpMaskReq | user op mask config
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetOpMask(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetOpMask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetOpMaskReq**](OspUserSetOpMaskReq.md)| user op mask config |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetRebuildZone"></a>
# **ospSetRebuildZone**
> OspStoragePolicyResp ospSetRebuildZone(body, id)



Updates policy rebuild zone config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetRebuildZone body = new OspStoragePolicySetRebuildZone(); // OspStoragePolicySetRebuildZone | storage policy rebuild zone info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetRebuildZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetRebuildZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetRebuildZone**](OspStoragePolicySetRebuildZone.md)| storage policy rebuild zone info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetReplicationZone"></a>
# **ospSetReplicationZone**
> OspStoragePolicyResp ospSetReplicationZone(body, id)



Updates policy replication zone config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetReplicationZone body = new OspStoragePolicySetReplicationZone(); // OspStoragePolicySetReplicationZone | storage policy replication zone info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetReplicationZone(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetReplicationZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetReplicationZone**](OspStoragePolicySetReplicationZone.md)| storage policy replication zone info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetSecondCompactRatio"></a>
# **ospSetSecondCompactRatio**
> OspStoragePolicyResp ospSetSecondCompactRatio(body, id)



Updates policy SecondCompactRatio config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetSecondCompactRatioReq body = new OspStoragePolicySetSecondCompactRatioReq(); // OspStoragePolicySetSecondCompactRatioReq | storage policy second compact ratio info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetSecondCompactRatio(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetSecondCompactRatio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetSecondCompactRatioReq**](OspStoragePolicySetSecondCompactRatioReq.md)| storage policy second compact ratio info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStorageClassBalanceMode"></a>
# **ospSetStorageClassBalanceMode**
> OspStoragePolicyResp ospSetStorageClassBalanceMode(body, id)



Set storage class balance mode

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspSetBalanceModeReq body = new OspSetBalanceModeReq(); // OspSetBalanceModeReq | storage class balance mode
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStorageClassBalanceMode(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStorageClassBalanceMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspSetBalanceModeReq**](OspSetBalanceModeReq.md)| storage class balance mode |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyCompact"></a>
# **ospSetStoragePolicyCompact**
> OspStoragePolicyResp ospSetStoragePolicyCompact(body, id)



Updates storage policy compact and cache storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetCompactReq body = new OspStoragePolicySetCompactReq(); // OspStoragePolicySetCompactReq | storage policy compact info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyCompact(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyCompact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetCompactReq**](OspStoragePolicySetCompactReq.md)| storage policy compact info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyCompress"></a>
# **ospSetStoragePolicyCompress**
> OspStoragePolicyResp ospSetStoragePolicyCompress(body, id)



Updates storage policy compress config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetCompressReq body = new OspStoragePolicySetCompressReq(); // OspStoragePolicySetCompressReq | storage policy compress info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyCompress(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyCompress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetCompressReq**](OspStoragePolicySetCompressReq.md)| storage policy compress info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyCrypto"></a>
# **ospSetStoragePolicyCrypto**
> OspStoragePolicyResp ospSetStoragePolicyCrypto(body, id)



Updates storage policy crypto config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetCryptoReq body = new OspStoragePolicySetCryptoReq(); // OspStoragePolicySetCryptoReq | storage policy crypto info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyCrypto(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyCrypto");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetCryptoReq**](OspStoragePolicySetCryptoReq.md)| storage policy crypto info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyDataSC"></a>
# **ospSetStoragePolicyDataSC**
> OspStoragePolicyResp ospSetStoragePolicyDataSC(body, id)



Updates data storage policy storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetDataSCReq body = new OspStoragePolicySetDataSCReq(); // OspStoragePolicySetDataSCReq | policy storage classes info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyDataSC(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyDataSC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetDataSCReq**](OspStoragePolicySetDataSCReq.md)| policy storage classes info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyDedup"></a>
# **ospSetStoragePolicyDedup**
> OspStoragePolicyResp ospSetStoragePolicyDedup(body, id)



Updates storage policy dedup config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetDedupReq body = new OspStoragePolicySetDedupReq(); // OspStoragePolicySetDedupReq | storage policy dedup info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyDedup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyDedup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetDedupReq**](OspStoragePolicySetDedupReq.md)| storage policy dedup info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyDescription"></a>
# **ospSetStoragePolicyDescription**
> OspStoragePolicyResp ospSetStoragePolicyDescription(body, id)



Set storage policy description

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetDescriptionReq body = new OspStoragePolicySetDescriptionReq(); // OspStoragePolicySetDescriptionReq | storage policy description
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyDescription(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyDescription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetDescriptionReq**](OspStoragePolicySetDescriptionReq.md)| storage policy description |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyExternalSC"></a>
# **ospSetStoragePolicyExternalSC**
> OspStoragePolicyResp ospSetStoragePolicyExternalSC(body, id)



Updates external storage policy storage classes

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetExternalSCReq body = new OspStoragePolicySetExternalSCReq(); // OspStoragePolicySetExternalSCReq | policy storage classes info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyExternalSC(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyExternalSC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetExternalSCReq**](OspStoragePolicySetExternalSCReq.md)| policy storage classes info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetStoragePolicyMultiProtocol"></a>
# **ospSetStoragePolicyMultiProtocol**
> OspStoragePolicyResp ospSetStoragePolicyMultiProtocol(body, id)



Updates storage policy MultiProtocol config

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspStoragePolicySetMultiProtocolReq body = new OspStoragePolicySetMultiProtocolReq(); // OspStoragePolicySetMultiProtocolReq | storage policy MultiProtocol info
Long id = 789L; // Long | storage policy id
try {
    OspStoragePolicyResp result = apiInstance.ospSetStoragePolicyMultiProtocol(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetStoragePolicyMultiProtocol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspStoragePolicySetMultiProtocolReq**](OspStoragePolicySetMultiProtocolReq.md)| storage policy MultiProtocol info |
 **id** | **Long**| storage policy id |

### Return type

[**OspStoragePolicyResp**](OspStoragePolicyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetTrustPolicy"></a>
# **ospSetTrustPolicy**
> OspRoleResp ospSetTrustPolicy(body, id)



Updates role AssumeRolePolicyDocument info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspRoleSetTrustPolicyReq body = new OspRoleSetTrustPolicyReq(); // OspRoleSetTrustPolicyReq | role trust policy config
Long id = 789L; // Long | role id
try {
    OspRoleResp result = apiInstance.ospSetTrustPolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetTrustPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspRoleSetTrustPolicyReq**](OspRoleSetTrustPolicyReq.md)| role trust policy config |
 **id** | **Long**| role id |

### Return type

[**OspRoleResp**](OspRoleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserDescription"></a>
# **ospSetUserDescription**
> OspUserResp ospSetUserDescription(body, id)



Updates user description

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetDescriptionReq body = new OspUserSetDescriptionReq(); // OspUserSetDescriptionReq | user description info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserDescription(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserDescription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetDescriptionReq**](OspUserSetDescriptionReq.md)| user description info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserDetail"></a>
# **ospSetUserDetail**
> OspUserResp ospSetUserDetail(body, id)



Updates user description, email and other detail

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetDetailReq body = new OspUserSetDetailReq(); // OspUserSetDetailReq | user detail info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserDetail(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetDetailReq**](OspUserSetDetailReq.md)| user detail info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserEmail"></a>
# **ospSetUserEmail**
> OspUserResp ospSetUserEmail(body, id)



Updates user email

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetEmailReq body = new OspUserSetEmailReq(); // OspUserSetEmailReq | user email info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserEmail(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetEmailReq**](OspUserSetEmailReq.md)| user email info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserName"></a>
# **ospSetUserName**
> OspUserResp ospSetUserName(body, id)



Updates user name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetNameReq body = new OspUserSetNameReq(); // OspUserSetNameReq | user name info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserName(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetNameReq**](OspUserSetNameReq.md)| user name info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserPolicy"></a>
# **ospSetUserPolicy**
> OspUserResp ospSetUserPolicy(body, id)



Updates user policy

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetPolicyReq body = new OspUserSetPolicyReq(); // OspUserSetPolicyReq | user policy info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserPolicy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetPolicyReq**](OspUserSetPolicyReq.md)| user policy info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserProperties"></a>
# **ospSetUserProperties**
> OspUserResp ospSetUserProperties(body, id)



Updates user properties

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetPropertiesReq body = new OspUserSetPropertiesReq(); // OspUserSetPropertiesReq | user properties info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserProperties(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetPropertiesReq**](OspUserSetPropertiesReq.md)| user properties info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserQos"></a>
# **ospSetUserQos**
> OspUserResp ospSetUserQos(body, id)



Updates user qos info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetQosReq body = new OspUserSetQosReq(); // OspUserSetQosReq | user qos info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserQos(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserQos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetQosReq**](OspUserSetQosReq.md)| user qos info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserQuota"></a>
# **ospSetUserQuota**
> OspUserResp ospSetUserQuota(body, id)



Updates user quota settings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetQuotaReq body = new OspUserSetQuotaReq(); // OspUserSetQuotaReq | user quota info
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserQuota(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetQuotaReq**](OspUserSetQuotaReq.md)| user quota info |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserSelectStoragePolicies"></a>
# **ospSetUserSelectStoragePolicies**
> OspUserResp ospSetUserSelectStoragePolicies(body, id)



Updates user select storage policies settings

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetSelectStoragePoliciesReq body = new OspUserSetSelectStoragePoliciesReq(); // OspUserSetSelectStoragePoliciesReq | user select storage policies config
Long id = 789L; // Long | user id
try {
    OspUserResp result = apiInstance.ospSetUserSelectStoragePolicies(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserSelectStoragePolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetSelectStoragePoliciesReq**](OspUserSetSelectStoragePoliciesReq.md)| user select storage policies config |
 **id** | **Long**| user id |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetUserSuspended"></a>
# **ospSetUserSuspended**
> OspUserResp ospSetUserSuspended(body)



Updates user suspended info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUserSetSuspendedReq body = new OspUserSetSuspendedReq(); // OspUserSetSuspendedReq | user suspended config
try {
    OspUserResp result = apiInstance.ospSetUserSuspended(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetUserSuspended");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUserSetSuspendedReq**](OspUserSetSuspendedReq.md)| user suspended config |

### Return type

[**OspUserResp**](OspUserResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSetZoneName"></a>
# **ospSetZoneName**
> OspZoneSetNameResp ospSetZoneName(body, id)



set zone name

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspZoneSetNameReq body = new OspZoneSetNameReq(); // OspZoneSetNameReq | zone name info
Long id = 789L; // Long | zone id
try {
    OspZoneSetNameResp result = apiInstance.ospSetZoneName(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSetZoneName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspZoneSetNameReq**](OspZoneSetNameReq.md)| zone name info |
 **id** | **Long**| zone id |

### Return type

[**OspZoneSetNameResp**](OspZoneSetNameResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospSuspendBucketLogging"></a>
# **ospSuspendBucketLogging**
> OspBucketResp ospSuspendBucketLogging(id)



Updates a bucket&#x27;s logging configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospSuspendBucketLogging(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospSuspendBucketLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospUnsetBucketLogging"></a>
# **ospUnsetBucketLogging**
> OspBucketResp ospUnsetBucketLogging(id)



Updates a bucket&#x27;s logging configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospUnsetBucketLogging(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUnsetBucketLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospUnsetBucketPolicy"></a>
# **ospUnsetBucketPolicy**
> OspBucketResp ospUnsetBucketPolicy(id)



Updates a bucket&#x27;s policy configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospUnsetBucketPolicy(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUnsetBucketPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospUnsuspendBucketLogging"></a>
# **ospUnsuspendBucketLogging**
> OspBucketResp ospUnsuspendBucketLogging(id)



Updates a bucket&#x27;s logging configuration

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
Long id = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospUnsuspendBucketLogging(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUnsuspendBucketLogging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="ospUpdateBucketNFSGatewayMap"></a>
# **ospUpdateBucketNFSGatewayMap**
> OspBucketNFSGatewayMapResp ospUpdateBucketNFSGatewayMap(body, id, mapId)



Updates a bucket nfs gateway map

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketNFSGatewayMapUpdateReq body = new OspBucketNFSGatewayMapUpdateReq(); // OspBucketNFSGatewayMapUpdateReq | bucket nfs gateway map info
Long id = 789L; // Long | bucket id
Long mapId = 789L; // Long | bucket nfs gateway map id
try {
    OspBucketNFSGatewayMapResp result = apiInstance.ospUpdateBucketNFSGatewayMap(body, id, mapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateBucketNFSGatewayMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketNFSGatewayMapUpdateReq**](OspBucketNFSGatewayMapUpdateReq.md)| bucket nfs gateway map info |
 **id** | **Long**| bucket id |
 **mapId** | **Long**| bucket nfs gateway map id |

### Return type

[**OspBucketNFSGatewayMapResp**](OspBucketNFSGatewayMapResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateBucketOriginRule"></a>
# **ospUpdateBucketOriginRule**
> OspBucketOriginRuleResp ospUpdateBucketOriginRule(body, id, ruleId)



Update bucket origin rule conf

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketUpdateOriginRuleReq body = new OspBucketUpdateOriginRuleReq(); // OspBucketUpdateOriginRuleReq | origin rule conf info
Long id = 789L; // Long | bucket id
String ruleId = "ruleId_example"; // String | rule id
try {
    OspBucketOriginRuleResp result = apiInstance.ospUpdateBucketOriginRule(body, id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateBucketOriginRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketUpdateOriginRuleReq**](OspBucketUpdateOriginRuleReq.md)| origin rule conf info |
 **id** | **Long**| bucket id |
 **ruleId** | **String**| rule id |

### Return type

[**OspBucketOriginRuleResp**](OspBucketOriginRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateBucketReplicationRule"></a>
# **ospUpdateBucketReplicationRule**
> OspBucketReplicationResp ospUpdateBucketReplicationRule(body, id, ruleId)



Update bucket replication rule conf

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketUpdateReplicationRuleReq body = new OspBucketUpdateReplicationRuleReq(); // OspBucketUpdateReplicationRuleReq | replication rule conf info
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | rule id
try {
    OspBucketReplicationResp result = apiInstance.ospUpdateBucketReplicationRule(body, id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateBucketReplicationRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketUpdateReplicationRuleReq**](OspBucketUpdateReplicationRuleReq.md)| replication rule conf info |
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| rule id |

### Return type

[**OspBucketReplicationResp**](OspBucketReplicationResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateBucketSyncReplicationGroup"></a>
# **ospUpdateBucketSyncReplicationGroup**
> OspBucketSyncReplicationGroupResp ospUpdateBucketSyncReplicationGroup(body, id, groupId)



Updates a bucket sync replication group

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSyncReplicationGroupUpdateReq body = new OspBucketSyncReplicationGroupUpdateReq(); // OspBucketSyncReplicationGroupUpdateReq | bucket sync replication group info
Long id = 789L; // Long | bucket id
Long groupId = 789L; // Long | bucket sync replication group id
try {
    OspBucketSyncReplicationGroupResp result = apiInstance.ospUpdateBucketSyncReplicationGroup(body, id, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateBucketSyncReplicationGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSyncReplicationGroupUpdateReq**](OspBucketSyncReplicationGroupUpdateReq.md)| bucket sync replication group info |
 **id** | **Long**| bucket id |
 **groupId** | **Long**| bucket sync replication group id |

### Return type

[**OspBucketSyncReplicationGroupResp**](OspBucketSyncReplicationGroupResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateBucketSyncRule"></a>
# **ospUpdateBucketSyncRule**
> OspBucketSyncRuleResp ospUpdateBucketSyncRule(body, id, ruleId)



Updates a bucket sync rule

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspBucketSyncRuleUpdateReq body = new OspBucketSyncRuleUpdateReq(); // OspBucketSyncRuleUpdateReq | bucket sync rule info
Long id = 789L; // Long | bucket id
Long ruleId = 789L; // Long | bucket sync rule id
try {
    OspBucketSyncRuleResp result = apiInstance.ospUpdateBucketSyncRule(body, id, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateBucketSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspBucketSyncRuleUpdateReq**](OspBucketSyncRuleUpdateReq.md)| bucket sync rule info |
 **id** | **Long**| bucket id |
 **ruleId** | **Long**| bucket sync rule id |

### Return type

[**OspBucketSyncRuleResp**](OspBucketSyncRuleResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateCluster"></a>
# **ospUpdateCluster**
> OspClusterResp ospUpdateCluster(uuid, body)



Updates cluster info

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
String uuid = "uuid_example"; // String | cluster uuid
OspClusterUpdateReq body = new OspClusterUpdateReq(); // OspClusterUpdateReq | cluster info
try {
    OspClusterResp result = apiInstance.ospUpdateCluster(uuid, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| cluster uuid |
 **body** | [**OspClusterUpdateReq**](OspClusterUpdateReq.md)| cluster info | [optional]

### Return type

[**OspClusterResp**](OspClusterResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateDataBackend"></a>
# **ospUpdateDataBackend**
> OspDataBackendResp ospUpdateDataBackend(body, id)



Updates a data backend

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspDataBackendUpdateReq body = new OspDataBackendUpdateReq(); // OspDataBackendUpdateReq | data backend info
Long id = 789L; // Long | data backend id
try {
    OspDataBackendResp result = apiInstance.ospUpdateDataBackend(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateDataBackend");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspDataBackendUpdateReq**](OspDataBackendUpdateReq.md)| data backend info |
 **id** | **Long**| data backend id |

### Return type

[**OspDataBackendResp**](OspDataBackendResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateEventTarget"></a>
# **ospUpdateEventTarget**
> OspEventTargetResp ospUpdateEventTarget(body, id)



update event target

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspEventTargetReq body = new OspEventTargetReq(); // OspEventTargetReq | event target info
Long id = 789L; // Long | event id
try {
    OspEventTargetResp result = apiInstance.ospUpdateEventTarget(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateEventTarget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspEventTargetReq**](OspEventTargetReq.md)| event target info |
 **id** | **Long**| event id |

### Return type

[**OspEventTargetResp**](OspEventTargetResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateGlobalConf"></a>
# **ospUpdateGlobalConf**
> OspGlobalConfResp ospUpdateGlobalConf(body)



update global conf

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUpdateGlobalConfReq body = new OspUpdateGlobalConfReq(); // OspUpdateGlobalConfReq | true
try {
    OspGlobalConfResp result = apiInstance.ospUpdateGlobalConf(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateGlobalConf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUpdateGlobalConfReq**](OspUpdateGlobalConfReq.md)| true | [optional]

### Return type

[**OspGlobalConfResp**](OspGlobalConfResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateRecycleBucket"></a>
# **ospUpdateRecycleBucket**
> OspBucketResp ospUpdateRecycleBucket(body, bucketId)



Updates recycle bucket

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspUpdateBucketReq body = new OspUpdateBucketReq(); // OspUpdateBucketReq | bucket config
Long bucketId = 789L; // Long | bucket id
try {
    OspBucketResp result = apiInstance.ospUpdateRecycleBucket(body, bucketId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateRecycleBucket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspUpdateBucketReq**](OspUpdateBucketReq.md)| bucket config |
 **bucketId** | **Long**| bucket id |

### Return type

[**OspBucketResp**](OspBucketResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="ospUpdateSecretKey"></a>
# **ospUpdateSecretKey**
> OspAccessKeyResp ospUpdateSecretKey(body, id)



Updates user key secret key

### Example
```java
// Import classes:
//import xio.sds.client.ApiClient;
//import xio.sds.client.ApiException;
//import xio.sds.client.Configuration;
//import xio.sds.client.auth.*;
//import xio.sds.client.api.DefaultApi;

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

DefaultApi apiInstance = new DefaultApi();
OspAccessKeyUpdateSecretKeyReq body = new OspAccessKeyUpdateSecretKeyReq(); // OspAccessKeyUpdateSecretKeyReq | access key secret
String id = "id_example"; // String | access key id
try {
    OspAccessKeyResp result = apiInstance.ospUpdateSecretKey(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ospUpdateSecretKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OspAccessKeyUpdateSecretKeyReq**](OspAccessKeyUpdateSecretKeyReq.md)| access key secret |
 **id** | **String**| access key id |

### Return type

[**OspAccessKeyResp**](OspAccessKeyResp.md)

### Authorization

[tokenInHeader](../README.md#tokenInHeader)[tokenInQuery](../README.md#tokenInQuery)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

