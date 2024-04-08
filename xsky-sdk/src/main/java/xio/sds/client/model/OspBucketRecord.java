/*
 * XMS API
 * XMS is the controller of distributed storage system
 *
 * OpenAPI spec version: XSCALEROS_6.2.000.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xio.sds.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xio.sds.client.model.OspBucketACL;
import xio.sds.client.model.OspBucketCompression;
import xio.sds.client.model.OspBucketCorsRule;
import xio.sds.client.model.OspBucketLifecycle;
import xio.sds.client.model.OspBucketLock;
import xio.sds.client.model.OspBucketLoggingResp;
import xio.sds.client.model.OspBucketNestedZone;
import xio.sds.client.model.OspBucketObjectRecycle;
import xio.sds.client.model.OspBucketQuota;
import xio.sds.client.model.OspBucketStat;
import xio.sds.client.model.OspBucketStorageClassRule;
import xio.sds.client.model.OspCurrentSnapshotInfo;
import xio.sds.client.model.OspNestedStoragePolicy;
import xio.sds.client.model.OspNestedUser;
import xio.sds.client.model.OspNestedZoneGroup;
import xio.sds.client.model.OspQos;
import xio.sds.client.model.OspVersioningStatus;
/**
 * OspBucketRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketRecord {
  @SerializedName("compact_by_bucket")
  private String compactByBucket = null;

  @SerializedName("qos")
  private OspQos qos = null;

  @SerializedName("readonly_all_zones")
  private Boolean readonlyAllZones = null;

  @SerializedName("lock")
  private OspBucketLock lock = null;

  @SerializedName("storage_policy")
  private OspNestedStoragePolicy storagePolicy = null;

  @SerializedName("specification_objects")
  private Long specificationObjects = null;

  @SerializedName("delete_archive_storage_class")
  private String deleteArchiveStorageClass = null;

  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("rebuild_status")
  private String rebuildStatus = null;

  @SerializedName("nfs_gateway_num")
  private Long nfsGatewayNum = null;

  @SerializedName("owner")
  private OspNestedUser owner = null;

  @SerializedName("readonly_zones")
  private List<Long> readonlyZones = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("compact")
  private String compact = null;

  @SerializedName("replication_rules_num")
  private Long replicationRulesNum = null;

  @SerializedName("compression")
  private OspBucketCompression compression = null;

  @SerializedName("encryption_type")
  private String encryptionType = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("zone_group")
  private OspNestedZoneGroup zoneGroup = null;

  @SerializedName("sse_kms_key")
  private String sseKmsKey = null;

  @SerializedName("default_read_mode")
  private String defaultReadMode = null;

  @SerializedName("samples")
  private List<OspBucketStat> samples = null;

  @SerializedName("sync_status")
  private String syncStatus = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("num_shards")
  private Long numShards = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("metric_enabled")
  private Boolean metricEnabled = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("encryption_default")
  private Boolean encryptionDefault = null;

  @SerializedName("snapshot_num")
  private Long snapshotNum = null;

  @SerializedName("update")
  private String update = null;

  @SerializedName("origin_rules_num")
  private Long originRulesNum = null;

  @SerializedName("quota")
  private OspBucketQuota quota = null;

  @SerializedName("object_delete_mode")
  private List<String> objectDeleteMode = null;

  @SerializedName("tier_cache")
  private Boolean tierCache = null;

  @SerializedName("delete_snapshot_num")
  private Long deleteSnapshotNum = null;

  @SerializedName("in_recycle")
  private Boolean inRecycle = null;

  @SerializedName("cors")
  private List<OspBucketCorsRule> cors = null;

  @SerializedName("lifecycle")
  private OspBucketLifecycle lifecycle = null;

  @SerializedName("get_trigger_restore")
  private Boolean getTriggerRestore = null;

  @SerializedName("is_recycle")
  private Boolean isRecycle = null;

  @SerializedName("bucket_type")
  private String bucketType = null;

  @SerializedName("replication_zone")
  private OspBucketNestedZone replicationZone = null;

  @SerializedName("logging")
  private OspBucketLoggingResp logging = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rebuild_zone")
  private OspBucketNestedZone rebuildZone = null;

  @SerializedName("storage_class_rule")
  private OspBucketStorageClassRule storageClassRule = null;

  @SerializedName("is_compatible")
  private Boolean isCompatible = null;

  @SerializedName("acl")
  private OspBucketACL acl = null;

  @SerializedName("replication_schedule_time")
  private String replicationScheduleTime = null;

  @SerializedName("snapshot")
  private OspCurrentSnapshotInfo snapshot = null;

  @SerializedName("versioning")
  private OspVersioningStatus versioning = null;

  @SerializedName("object_recycle")
  private OspBucketObjectRecycle objectRecycle = null;

  @SerializedName("tier_worm")
  private Boolean tierWorm = null;

  @SerializedName("restore_days")
  private Long restoreDays = null;

  @SerializedName("object_inherit_bucket_acl")
  private Boolean objectInheritBucketAcl = null;

  public OspBucketRecord compactByBucket(String compactByBucket) {
    this.compactByBucket = compactByBucket;
    return this;
  }

   /**
   * Get compactByBucket
   * @return compactByBucket
  **/
  @Schema(description = "")
  public String getCompactByBucket() {
    return compactByBucket;
  }

  public void setCompactByBucket(String compactByBucket) {
    this.compactByBucket = compactByBucket;
  }

  public OspBucketRecord qos(OspQos qos) {
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @Schema(description = "")
  public OspQos getQos() {
    return qos;
  }

  public void setQos(OspQos qos) {
    this.qos = qos;
  }

  public OspBucketRecord readonlyAllZones(Boolean readonlyAllZones) {
    this.readonlyAllZones = readonlyAllZones;
    return this;
  }

   /**
   * Get readonlyAllZones
   * @return readonlyAllZones
  **/
  @Schema(description = "")
  public Boolean isReadonlyAllZones() {
    return readonlyAllZones;
  }

  public void setReadonlyAllZones(Boolean readonlyAllZones) {
    this.readonlyAllZones = readonlyAllZones;
  }

  public OspBucketRecord lock(OspBucketLock lock) {
    this.lock = lock;
    return this;
  }

   /**
   * Get lock
   * @return lock
  **/
  @Schema(description = "")
  public OspBucketLock getLock() {
    return lock;
  }

  public void setLock(OspBucketLock lock) {
    this.lock = lock;
  }

  public OspBucketRecord storagePolicy(OspNestedStoragePolicy storagePolicy) {
    this.storagePolicy = storagePolicy;
    return this;
  }

   /**
   * Get storagePolicy
   * @return storagePolicy
  **/
  @Schema(description = "")
  public OspNestedStoragePolicy getStoragePolicy() {
    return storagePolicy;
  }

  public void setStoragePolicy(OspNestedStoragePolicy storagePolicy) {
    this.storagePolicy = storagePolicy;
  }

  public OspBucketRecord specificationObjects(Long specificationObjects) {
    this.specificationObjects = specificationObjects;
    return this;
  }

   /**
   * Get specificationObjects
   * @return specificationObjects
  **/
  @Schema(description = "")
  public Long getSpecificationObjects() {
    return specificationObjects;
  }

  public void setSpecificationObjects(Long specificationObjects) {
    this.specificationObjects = specificationObjects;
  }

  public OspBucketRecord deleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
    return this;
  }

   /**
   * Get deleteArchiveStorageClass
   * @return deleteArchiveStorageClass
  **/
  @Schema(description = "")
  public String getDeleteArchiveStorageClass() {
    return deleteArchiveStorageClass;
  }

  public void setDeleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
  }

  public OspBucketRecord actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public OspBucketRecord rebuildStatus(String rebuildStatus) {
    this.rebuildStatus = rebuildStatus;
    return this;
  }

   /**
   * Get rebuildStatus
   * @return rebuildStatus
  **/
  @Schema(description = "")
  public String getRebuildStatus() {
    return rebuildStatus;
  }

  public void setRebuildStatus(String rebuildStatus) {
    this.rebuildStatus = rebuildStatus;
  }

  public OspBucketRecord nfsGatewayNum(Long nfsGatewayNum) {
    this.nfsGatewayNum = nfsGatewayNum;
    return this;
  }

   /**
   * Get nfsGatewayNum
   * @return nfsGatewayNum
  **/
  @Schema(description = "")
  public Long getNfsGatewayNum() {
    return nfsGatewayNum;
  }

  public void setNfsGatewayNum(Long nfsGatewayNum) {
    this.nfsGatewayNum = nfsGatewayNum;
  }

  public OspBucketRecord owner(OspNestedUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public OspNestedUser getOwner() {
    return owner;
  }

  public void setOwner(OspNestedUser owner) {
    this.owner = owner;
  }

  public OspBucketRecord readonlyZones(List<Long> readonlyZones) {
    this.readonlyZones = readonlyZones;
    return this;
  }

  public OspBucketRecord addReadonlyZonesItem(Long readonlyZonesItem) {
    if (this.readonlyZones == null) {
      this.readonlyZones = new ArrayList<Long>();
    }
    this.readonlyZones.add(readonlyZonesItem);
    return this;
  }

   /**
   * Get readonlyZones
   * @return readonlyZones
  **/
  @Schema(description = "")
  public List<Long> getReadonlyZones() {
    return readonlyZones;
  }

  public void setReadonlyZones(List<Long> readonlyZones) {
    this.readonlyZones = readonlyZones;
  }

  public OspBucketRecord id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OspBucketRecord compact(String compact) {
    this.compact = compact;
    return this;
  }

   /**
   * Get compact
   * @return compact
  **/
  @Schema(description = "")
  public String getCompact() {
    return compact;
  }

  public void setCompact(String compact) {
    this.compact = compact;
  }

  public OspBucketRecord replicationRulesNum(Long replicationRulesNum) {
    this.replicationRulesNum = replicationRulesNum;
    return this;
  }

   /**
   * Get replicationRulesNum
   * @return replicationRulesNum
  **/
  @Schema(description = "")
  public Long getReplicationRulesNum() {
    return replicationRulesNum;
  }

  public void setReplicationRulesNum(Long replicationRulesNum) {
    this.replicationRulesNum = replicationRulesNum;
  }

  public OspBucketRecord compression(OspBucketCompression compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @Schema(description = "")
  public OspBucketCompression getCompression() {
    return compression;
  }

  public void setCompression(OspBucketCompression compression) {
    this.compression = compression;
  }

  public OspBucketRecord encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * Get encryptionType
   * @return encryptionType
  **/
  @Schema(description = "")
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }

  public OspBucketRecord create(String create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public OspBucketRecord zoneGroup(OspNestedZoneGroup zoneGroup) {
    this.zoneGroup = zoneGroup;
    return this;
  }

   /**
   * Get zoneGroup
   * @return zoneGroup
  **/
  @Schema(description = "")
  public OspNestedZoneGroup getZoneGroup() {
    return zoneGroup;
  }

  public void setZoneGroup(OspNestedZoneGroup zoneGroup) {
    this.zoneGroup = zoneGroup;
  }

  public OspBucketRecord sseKmsKey(String sseKmsKey) {
    this.sseKmsKey = sseKmsKey;
    return this;
  }

   /**
   * Get sseKmsKey
   * @return sseKmsKey
  **/
  @Schema(description = "")
  public String getSseKmsKey() {
    return sseKmsKey;
  }

  public void setSseKmsKey(String sseKmsKey) {
    this.sseKmsKey = sseKmsKey;
  }

  public OspBucketRecord defaultReadMode(String defaultReadMode) {
    this.defaultReadMode = defaultReadMode;
    return this;
  }

   /**
   * Get defaultReadMode
   * @return defaultReadMode
  **/
  @Schema(description = "")
  public String getDefaultReadMode() {
    return defaultReadMode;
  }

  public void setDefaultReadMode(String defaultReadMode) {
    this.defaultReadMode = defaultReadMode;
  }

  public OspBucketRecord samples(List<OspBucketStat> samples) {
    this.samples = samples;
    return this;
  }

  public OspBucketRecord addSamplesItem(OspBucketStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<OspBucketStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<OspBucketStat> getSamples() {
    return samples;
  }

  public void setSamples(List<OspBucketStat> samples) {
    this.samples = samples;
  }

  public OspBucketRecord syncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @Schema(description = "")
  public String getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(String syncStatus) {
    this.syncStatus = syncStatus;
  }

  public OspBucketRecord policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @Schema(description = "")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public OspBucketRecord numShards(Long numShards) {
    this.numShards = numShards;
    return this;
  }

   /**
   * Get numShards
   * @return numShards
  **/
  @Schema(description = "")
  public Long getNumShards() {
    return numShards;
  }

  public void setNumShards(Long numShards) {
    this.numShards = numShards;
  }

  public OspBucketRecord type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OspBucketRecord status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OspBucketRecord metricEnabled(Boolean metricEnabled) {
    this.metricEnabled = metricEnabled;
    return this;
  }

   /**
   * Get metricEnabled
   * @return metricEnabled
  **/
  @Schema(description = "")
  public Boolean isMetricEnabled() {
    return metricEnabled;
  }

  public void setMetricEnabled(Boolean metricEnabled) {
    this.metricEnabled = metricEnabled;
  }

  public OspBucketRecord description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OspBucketRecord encryptionDefault(Boolean encryptionDefault) {
    this.encryptionDefault = encryptionDefault;
    return this;
  }

   /**
   * Get encryptionDefault
   * @return encryptionDefault
  **/
  @Schema(description = "")
  public Boolean isEncryptionDefault() {
    return encryptionDefault;
  }

  public void setEncryptionDefault(Boolean encryptionDefault) {
    this.encryptionDefault = encryptionDefault;
  }

  public OspBucketRecord snapshotNum(Long snapshotNum) {
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * Get snapshotNum
   * @return snapshotNum
  **/
  @Schema(description = "")
  public Long getSnapshotNum() {
    return snapshotNum;
  }

  public void setSnapshotNum(Long snapshotNum) {
    this.snapshotNum = snapshotNum;
  }

  public OspBucketRecord update(String update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public String getUpdate() {
    return update;
  }

  public void setUpdate(String update) {
    this.update = update;
  }

  public OspBucketRecord originRulesNum(Long originRulesNum) {
    this.originRulesNum = originRulesNum;
    return this;
  }

   /**
   * Get originRulesNum
   * @return originRulesNum
  **/
  @Schema(description = "")
  public Long getOriginRulesNum() {
    return originRulesNum;
  }

  public void setOriginRulesNum(Long originRulesNum) {
    this.originRulesNum = originRulesNum;
  }

  public OspBucketRecord quota(OspBucketQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @Schema(description = "")
  public OspBucketQuota getQuota() {
    return quota;
  }

  public void setQuota(OspBucketQuota quota) {
    this.quota = quota;
  }

  public OspBucketRecord objectDeleteMode(List<String> objectDeleteMode) {
    this.objectDeleteMode = objectDeleteMode;
    return this;
  }

  public OspBucketRecord addObjectDeleteModeItem(String objectDeleteModeItem) {
    if (this.objectDeleteMode == null) {
      this.objectDeleteMode = new ArrayList<String>();
    }
    this.objectDeleteMode.add(objectDeleteModeItem);
    return this;
  }

   /**
   * Get objectDeleteMode
   * @return objectDeleteMode
  **/
  @Schema(description = "")
  public List<String> getObjectDeleteMode() {
    return objectDeleteMode;
  }

  public void setObjectDeleteMode(List<String> objectDeleteMode) {
    this.objectDeleteMode = objectDeleteMode;
  }

  public OspBucketRecord tierCache(Boolean tierCache) {
    this.tierCache = tierCache;
    return this;
  }

   /**
   * Get tierCache
   * @return tierCache
  **/
  @Schema(description = "")
  public Boolean isTierCache() {
    return tierCache;
  }

  public void setTierCache(Boolean tierCache) {
    this.tierCache = tierCache;
  }

  public OspBucketRecord deleteSnapshotNum(Long deleteSnapshotNum) {
    this.deleteSnapshotNum = deleteSnapshotNum;
    return this;
  }

   /**
   * Get deleteSnapshotNum
   * @return deleteSnapshotNum
  **/
  @Schema(description = "")
  public Long getDeleteSnapshotNum() {
    return deleteSnapshotNum;
  }

  public void setDeleteSnapshotNum(Long deleteSnapshotNum) {
    this.deleteSnapshotNum = deleteSnapshotNum;
  }

  public OspBucketRecord inRecycle(Boolean inRecycle) {
    this.inRecycle = inRecycle;
    return this;
  }

   /**
   * Get inRecycle
   * @return inRecycle
  **/
  @Schema(description = "")
  public Boolean isInRecycle() {
    return inRecycle;
  }

  public void setInRecycle(Boolean inRecycle) {
    this.inRecycle = inRecycle;
  }

  public OspBucketRecord cors(List<OspBucketCorsRule> cors) {
    this.cors = cors;
    return this;
  }

  public OspBucketRecord addCorsItem(OspBucketCorsRule corsItem) {
    if (this.cors == null) {
      this.cors = new ArrayList<OspBucketCorsRule>();
    }
    this.cors.add(corsItem);
    return this;
  }

   /**
   * Get cors
   * @return cors
  **/
  @Schema(description = "")
  public List<OspBucketCorsRule> getCors() {
    return cors;
  }

  public void setCors(List<OspBucketCorsRule> cors) {
    this.cors = cors;
  }

  public OspBucketRecord lifecycle(OspBucketLifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @Schema(description = "")
  public OspBucketLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(OspBucketLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public OspBucketRecord getTriggerRestore(Boolean getTriggerRestore) {
    this.getTriggerRestore = getTriggerRestore;
    return this;
  }

   /**
   * Get getTriggerRestore
   * @return getTriggerRestore
  **/
  @Schema(description = "")
  public Boolean isGetTriggerRestore() {
    return getTriggerRestore;
  }

  public void setGetTriggerRestore(Boolean getTriggerRestore) {
    this.getTriggerRestore = getTriggerRestore;
  }

  public OspBucketRecord isRecycle(Boolean isRecycle) {
    this.isRecycle = isRecycle;
    return this;
  }

   /**
   * Get isRecycle
   * @return isRecycle
  **/
  @Schema(description = "")
  public Boolean isIsRecycle() {
    return isRecycle;
  }

  public void setIsRecycle(Boolean isRecycle) {
    this.isRecycle = isRecycle;
  }

  public OspBucketRecord bucketType(String bucketType) {
    this.bucketType = bucketType;
    return this;
  }

   /**
   * Get bucketType
   * @return bucketType
  **/
  @Schema(description = "")
  public String getBucketType() {
    return bucketType;
  }

  public void setBucketType(String bucketType) {
    this.bucketType = bucketType;
  }

  public OspBucketRecord replicationZone(OspBucketNestedZone replicationZone) {
    this.replicationZone = replicationZone;
    return this;
  }

   /**
   * Get replicationZone
   * @return replicationZone
  **/
  @Schema(description = "")
  public OspBucketNestedZone getReplicationZone() {
    return replicationZone;
  }

  public void setReplicationZone(OspBucketNestedZone replicationZone) {
    this.replicationZone = replicationZone;
  }

  public OspBucketRecord logging(OspBucketLoggingResp logging) {
    this.logging = logging;
    return this;
  }

   /**
   * Get logging
   * @return logging
  **/
  @Schema(description = "")
  public OspBucketLoggingResp getLogging() {
    return logging;
  }

  public void setLogging(OspBucketLoggingResp logging) {
    this.logging = logging;
  }

  public OspBucketRecord name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OspBucketRecord rebuildZone(OspBucketNestedZone rebuildZone) {
    this.rebuildZone = rebuildZone;
    return this;
  }

   /**
   * Get rebuildZone
   * @return rebuildZone
  **/
  @Schema(description = "")
  public OspBucketNestedZone getRebuildZone() {
    return rebuildZone;
  }

  public void setRebuildZone(OspBucketNestedZone rebuildZone) {
    this.rebuildZone = rebuildZone;
  }

  public OspBucketRecord storageClassRule(OspBucketStorageClassRule storageClassRule) {
    this.storageClassRule = storageClassRule;
    return this;
  }

   /**
   * Get storageClassRule
   * @return storageClassRule
  **/
  @Schema(description = "")
  public OspBucketStorageClassRule getStorageClassRule() {
    return storageClassRule;
  }

  public void setStorageClassRule(OspBucketStorageClassRule storageClassRule) {
    this.storageClassRule = storageClassRule;
  }

  public OspBucketRecord isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

   /**
   * Get isCompatible
   * @return isCompatible
  **/
  @Schema(description = "")
  public Boolean isIsCompatible() {
    return isCompatible;
  }

  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  public OspBucketRecord acl(OspBucketACL acl) {
    this.acl = acl;
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @Schema(description = "")
  public OspBucketACL getAcl() {
    return acl;
  }

  public void setAcl(OspBucketACL acl) {
    this.acl = acl;
  }

  public OspBucketRecord replicationScheduleTime(String replicationScheduleTime) {
    this.replicationScheduleTime = replicationScheduleTime;
    return this;
  }

   /**
   * Get replicationScheduleTime
   * @return replicationScheduleTime
  **/
  @Schema(description = "")
  public String getReplicationScheduleTime() {
    return replicationScheduleTime;
  }

  public void setReplicationScheduleTime(String replicationScheduleTime) {
    this.replicationScheduleTime = replicationScheduleTime;
  }

  public OspBucketRecord snapshot(OspCurrentSnapshotInfo snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @Schema(description = "")
  public OspCurrentSnapshotInfo getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(OspCurrentSnapshotInfo snapshot) {
    this.snapshot = snapshot;
  }

  public OspBucketRecord versioning(OspVersioningStatus versioning) {
    this.versioning = versioning;
    return this;
  }

   /**
   * Get versioning
   * @return versioning
  **/
  @Schema(description = "")
  public OspVersioningStatus getVersioning() {
    return versioning;
  }

  public void setVersioning(OspVersioningStatus versioning) {
    this.versioning = versioning;
  }

  public OspBucketRecord objectRecycle(OspBucketObjectRecycle objectRecycle) {
    this.objectRecycle = objectRecycle;
    return this;
  }

   /**
   * Get objectRecycle
   * @return objectRecycle
  **/
  @Schema(description = "")
  public OspBucketObjectRecycle getObjectRecycle() {
    return objectRecycle;
  }

  public void setObjectRecycle(OspBucketObjectRecycle objectRecycle) {
    this.objectRecycle = objectRecycle;
  }

  public OspBucketRecord tierWorm(Boolean tierWorm) {
    this.tierWorm = tierWorm;
    return this;
  }

   /**
   * Get tierWorm
   * @return tierWorm
  **/
  @Schema(description = "")
  public Boolean isTierWorm() {
    return tierWorm;
  }

  public void setTierWorm(Boolean tierWorm) {
    this.tierWorm = tierWorm;
  }

  public OspBucketRecord restoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
    return this;
  }

   /**
   * Get restoreDays
   * @return restoreDays
  **/
  @Schema(description = "")
  public Long getRestoreDays() {
    return restoreDays;
  }

  public void setRestoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
  }

  public OspBucketRecord objectInheritBucketAcl(Boolean objectInheritBucketAcl) {
    this.objectInheritBucketAcl = objectInheritBucketAcl;
    return this;
  }

   /**
   * Get objectInheritBucketAcl
   * @return objectInheritBucketAcl
  **/
  @Schema(description = "")
  public Boolean isObjectInheritBucketAcl() {
    return objectInheritBucketAcl;
  }

  public void setObjectInheritBucketAcl(Boolean objectInheritBucketAcl) {
    this.objectInheritBucketAcl = objectInheritBucketAcl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketRecord ospBucketRecord = (OspBucketRecord) o;
    return Objects.equals(this.compactByBucket, ospBucketRecord.compactByBucket) &&
        Objects.equals(this.qos, ospBucketRecord.qos) &&
        Objects.equals(this.readonlyAllZones, ospBucketRecord.readonlyAllZones) &&
        Objects.equals(this.lock, ospBucketRecord.lock) &&
        Objects.equals(this.storagePolicy, ospBucketRecord.storagePolicy) &&
        Objects.equals(this.specificationObjects, ospBucketRecord.specificationObjects) &&
        Objects.equals(this.deleteArchiveStorageClass, ospBucketRecord.deleteArchiveStorageClass) &&
        Objects.equals(this.actionStatus, ospBucketRecord.actionStatus) &&
        Objects.equals(this.rebuildStatus, ospBucketRecord.rebuildStatus) &&
        Objects.equals(this.nfsGatewayNum, ospBucketRecord.nfsGatewayNum) &&
        Objects.equals(this.owner, ospBucketRecord.owner) &&
        Objects.equals(this.readonlyZones, ospBucketRecord.readonlyZones) &&
        Objects.equals(this.id, ospBucketRecord.id) &&
        Objects.equals(this.compact, ospBucketRecord.compact) &&
        Objects.equals(this.replicationRulesNum, ospBucketRecord.replicationRulesNum) &&
        Objects.equals(this.compression, ospBucketRecord.compression) &&
        Objects.equals(this.encryptionType, ospBucketRecord.encryptionType) &&
        Objects.equals(this.create, ospBucketRecord.create) &&
        Objects.equals(this.zoneGroup, ospBucketRecord.zoneGroup) &&
        Objects.equals(this.sseKmsKey, ospBucketRecord.sseKmsKey) &&
        Objects.equals(this.defaultReadMode, ospBucketRecord.defaultReadMode) &&
        Objects.equals(this.samples, ospBucketRecord.samples) &&
        Objects.equals(this.syncStatus, ospBucketRecord.syncStatus) &&
        Objects.equals(this.policy, ospBucketRecord.policy) &&
        Objects.equals(this.numShards, ospBucketRecord.numShards) &&
        Objects.equals(this.type, ospBucketRecord.type) &&
        Objects.equals(this.status, ospBucketRecord.status) &&
        Objects.equals(this.metricEnabled, ospBucketRecord.metricEnabled) &&
        Objects.equals(this.description, ospBucketRecord.description) &&
        Objects.equals(this.encryptionDefault, ospBucketRecord.encryptionDefault) &&
        Objects.equals(this.snapshotNum, ospBucketRecord.snapshotNum) &&
        Objects.equals(this.update, ospBucketRecord.update) &&
        Objects.equals(this.originRulesNum, ospBucketRecord.originRulesNum) &&
        Objects.equals(this.quota, ospBucketRecord.quota) &&
        Objects.equals(this.objectDeleteMode, ospBucketRecord.objectDeleteMode) &&
        Objects.equals(this.tierCache, ospBucketRecord.tierCache) &&
        Objects.equals(this.deleteSnapshotNum, ospBucketRecord.deleteSnapshotNum) &&
        Objects.equals(this.inRecycle, ospBucketRecord.inRecycle) &&
        Objects.equals(this.cors, ospBucketRecord.cors) &&
        Objects.equals(this.lifecycle, ospBucketRecord.lifecycle) &&
        Objects.equals(this.getTriggerRestore, ospBucketRecord.getTriggerRestore) &&
        Objects.equals(this.isRecycle, ospBucketRecord.isRecycle) &&
        Objects.equals(this.bucketType, ospBucketRecord.bucketType) &&
        Objects.equals(this.replicationZone, ospBucketRecord.replicationZone) &&
        Objects.equals(this.logging, ospBucketRecord.logging) &&
        Objects.equals(this.name, ospBucketRecord.name) &&
        Objects.equals(this.rebuildZone, ospBucketRecord.rebuildZone) &&
        Objects.equals(this.storageClassRule, ospBucketRecord.storageClassRule) &&
        Objects.equals(this.isCompatible, ospBucketRecord.isCompatible) &&
        Objects.equals(this.acl, ospBucketRecord.acl) &&
        Objects.equals(this.replicationScheduleTime, ospBucketRecord.replicationScheduleTime) &&
        Objects.equals(this.snapshot, ospBucketRecord.snapshot) &&
        Objects.equals(this.versioning, ospBucketRecord.versioning) &&
        Objects.equals(this.objectRecycle, ospBucketRecord.objectRecycle) &&
        Objects.equals(this.tierWorm, ospBucketRecord.tierWorm) &&
        Objects.equals(this.restoreDays, ospBucketRecord.restoreDays) &&
        Objects.equals(this.objectInheritBucketAcl, ospBucketRecord.objectInheritBucketAcl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compactByBucket, qos, readonlyAllZones, lock, storagePolicy, specificationObjects, deleteArchiveStorageClass, actionStatus, rebuildStatus, nfsGatewayNum, owner, readonlyZones, id, compact, replicationRulesNum, compression, encryptionType, create, zoneGroup, sseKmsKey, defaultReadMode, samples, syncStatus, policy, numShards, type, status, metricEnabled, description, encryptionDefault, snapshotNum, update, originRulesNum, quota, objectDeleteMode, tierCache, deleteSnapshotNum, inRecycle, cors, lifecycle, getTriggerRestore, isRecycle, bucketType, replicationZone, logging, name, rebuildZone, storageClassRule, isCompatible, acl, replicationScheduleTime, snapshot, versioning, objectRecycle, tierWorm, restoreDays, objectInheritBucketAcl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketRecord {\n");
    
    sb.append("    compactByBucket: ").append(toIndentedString(compactByBucket)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    readonlyAllZones: ").append(toIndentedString(readonlyAllZones)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
    sb.append("    specificationObjects: ").append(toIndentedString(specificationObjects)).append("\n");
    sb.append("    deleteArchiveStorageClass: ").append(toIndentedString(deleteArchiveStorageClass)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    rebuildStatus: ").append(toIndentedString(rebuildStatus)).append("\n");
    sb.append("    nfsGatewayNum: ").append(toIndentedString(nfsGatewayNum)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    readonlyZones: ").append(toIndentedString(readonlyZones)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compact: ").append(toIndentedString(compact)).append("\n");
    sb.append("    replicationRulesNum: ").append(toIndentedString(replicationRulesNum)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    zoneGroup: ").append(toIndentedString(zoneGroup)).append("\n");
    sb.append("    sseKmsKey: ").append(toIndentedString(sseKmsKey)).append("\n");
    sb.append("    defaultReadMode: ").append(toIndentedString(defaultReadMode)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    numShards: ").append(toIndentedString(numShards)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metricEnabled: ").append(toIndentedString(metricEnabled)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionDefault: ").append(toIndentedString(encryptionDefault)).append("\n");
    sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    originRulesNum: ").append(toIndentedString(originRulesNum)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    objectDeleteMode: ").append(toIndentedString(objectDeleteMode)).append("\n");
    sb.append("    tierCache: ").append(toIndentedString(tierCache)).append("\n");
    sb.append("    deleteSnapshotNum: ").append(toIndentedString(deleteSnapshotNum)).append("\n");
    sb.append("    inRecycle: ").append(toIndentedString(inRecycle)).append("\n");
    sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    getTriggerRestore: ").append(toIndentedString(getTriggerRestore)).append("\n");
    sb.append("    isRecycle: ").append(toIndentedString(isRecycle)).append("\n");
    sb.append("    bucketType: ").append(toIndentedString(bucketType)).append("\n");
    sb.append("    replicationZone: ").append(toIndentedString(replicationZone)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rebuildZone: ").append(toIndentedString(rebuildZone)).append("\n");
    sb.append("    storageClassRule: ").append(toIndentedString(storageClassRule)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    replicationScheduleTime: ").append(toIndentedString(replicationScheduleTime)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    versioning: ").append(toIndentedString(versioning)).append("\n");
    sb.append("    objectRecycle: ").append(toIndentedString(objectRecycle)).append("\n");
    sb.append("    tierWorm: ").append(toIndentedString(tierWorm)).append("\n");
    sb.append("    restoreDays: ").append(toIndentedString(restoreDays)).append("\n");
    sb.append("    objectInheritBucketAcl: ").append(toIndentedString(objectInheritBucketAcl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}