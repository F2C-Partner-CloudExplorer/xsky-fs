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
import xio.sds.client.model.OspBucketLock;
import xio.sds.client.model.OspBucketObjectRecycle;
import xio.sds.client.model.OspBucketQuotaReq;
import xio.sds.client.model.OspBucketRepeatReq;
import xio.sds.client.model.OspBucketStorageClassRule;
import xio.sds.client.model.OspVersioningStatus;
/**
 * OspBucketCreateReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketCreateReqInfo {
  @SerializedName("compact_by_bucket")
  private String compactByBucket = null;

  @SerializedName("storage_policy_id")
  private Long storagePolicyId = null;

  @SerializedName("lock")
  private OspBucketLock lock = null;

  @SerializedName("delete_archive_storage_class")
  private String deleteArchiveStorageClass = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  @SerializedName("compact")
  private String compact = null;

  @SerializedName("compression")
  private OspBucketCompression compression = null;

  @SerializedName("encryption_type")
  private String encryptionType = null;

  @SerializedName("sse_kms_key")
  private String sseKmsKey = null;

  @SerializedName("storage_policy_name")
  private String storagePolicyName = null;

  @SerializedName("num_shards")
  private Long numShards = null;

  @SerializedName("name_prefix")
  private String namePrefix = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("repeat")
  private OspBucketRepeatReq repeat = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("encryption_default")
  private Boolean encryptionDefault = null;

  @SerializedName("quota")
  private OspBucketQuotaReq quota = null;

  @SerializedName("object_delete_mode")
  private List<String> objectDeleteMode = null;

  @SerializedName("tier_cache")
  private Boolean tierCache = null;

  @SerializedName("get_trigger_restore")
  private Boolean getTriggerRestore = null;

  @SerializedName("metric_enabled")
  private Boolean metricEnabled = null;

  @SerializedName("bucket_type")
  private String bucketType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("storage_class_rule")
  private OspBucketStorageClassRule storageClassRule = null;

  @SerializedName("acl")
  private OspBucketACL acl = null;

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

  public OspBucketCreateReqInfo compactByBucket(String compactByBucket) {
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

  public OspBucketCreateReqInfo storagePolicyId(Long storagePolicyId) {
    this.storagePolicyId = storagePolicyId;
    return this;
  }

   /**
   * Get storagePolicyId
   * @return storagePolicyId
  **/
  @Schema(description = "")
  public Long getStoragePolicyId() {
    return storagePolicyId;
  }

  public void setStoragePolicyId(Long storagePolicyId) {
    this.storagePolicyId = storagePolicyId;
  }

  public OspBucketCreateReqInfo lock(OspBucketLock lock) {
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

  public OspBucketCreateReqInfo deleteArchiveStorageClass(String deleteArchiveStorageClass) {
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

  public OspBucketCreateReqInfo ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @Schema(description = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public OspBucketCreateReqInfo compact(String compact) {
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

  public OspBucketCreateReqInfo compression(OspBucketCompression compression) {
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

  public OspBucketCreateReqInfo encryptionType(String encryptionType) {
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

  public OspBucketCreateReqInfo sseKmsKey(String sseKmsKey) {
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

  public OspBucketCreateReqInfo storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

   /**
   * Get storagePolicyName
   * @return storagePolicyName
  **/
  @Schema(description = "")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  public OspBucketCreateReqInfo numShards(Long numShards) {
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

  public OspBucketCreateReqInfo namePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @Schema(description = "")
  public String getNamePrefix() {
    return namePrefix;
  }

  public void setNamePrefix(String namePrefix) {
    this.namePrefix = namePrefix;
  }

  public OspBucketCreateReqInfo type(String type) {
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

  public OspBucketCreateReqInfo ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @Schema(description = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public OspBucketCreateReqInfo repeat(OspBucketRepeatReq repeat) {
    this.repeat = repeat;
    return this;
  }

   /**
   * Get repeat
   * @return repeat
  **/
  @Schema(description = "")
  public OspBucketRepeatReq getRepeat() {
    return repeat;
  }

  public void setRepeat(OspBucketRepeatReq repeat) {
    this.repeat = repeat;
  }

  public OspBucketCreateReqInfo description(String description) {
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

  public OspBucketCreateReqInfo encryptionDefault(Boolean encryptionDefault) {
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

  public OspBucketCreateReqInfo quota(OspBucketQuotaReq quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @Schema(description = "")
  public OspBucketQuotaReq getQuota() {
    return quota;
  }

  public void setQuota(OspBucketQuotaReq quota) {
    this.quota = quota;
  }

  public OspBucketCreateReqInfo objectDeleteMode(List<String> objectDeleteMode) {
    this.objectDeleteMode = objectDeleteMode;
    return this;
  }

  public OspBucketCreateReqInfo addObjectDeleteModeItem(String objectDeleteModeItem) {
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

  public OspBucketCreateReqInfo tierCache(Boolean tierCache) {
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

  public OspBucketCreateReqInfo getTriggerRestore(Boolean getTriggerRestore) {
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

  public OspBucketCreateReqInfo metricEnabled(Boolean metricEnabled) {
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

  public OspBucketCreateReqInfo bucketType(String bucketType) {
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

  public OspBucketCreateReqInfo name(String name) {
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

  public OspBucketCreateReqInfo storageClassRule(OspBucketStorageClassRule storageClassRule) {
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

  public OspBucketCreateReqInfo acl(OspBucketACL acl) {
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

  public OspBucketCreateReqInfo versioning(OspVersioningStatus versioning) {
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

  public OspBucketCreateReqInfo objectRecycle(OspBucketObjectRecycle objectRecycle) {
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

  public OspBucketCreateReqInfo tierWorm(Boolean tierWorm) {
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

  public OspBucketCreateReqInfo restoreDays(Long restoreDays) {
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

  public OspBucketCreateReqInfo objectInheritBucketAcl(Boolean objectInheritBucketAcl) {
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
    OspBucketCreateReqInfo ospBucketCreateReqInfo = (OspBucketCreateReqInfo) o;
    return Objects.equals(this.compactByBucket, ospBucketCreateReqInfo.compactByBucket) &&
        Objects.equals(this.storagePolicyId, ospBucketCreateReqInfo.storagePolicyId) &&
        Objects.equals(this.lock, ospBucketCreateReqInfo.lock) &&
        Objects.equals(this.deleteArchiveStorageClass, ospBucketCreateReqInfo.deleteArchiveStorageClass) &&
        Objects.equals(this.ownerName, ospBucketCreateReqInfo.ownerName) &&
        Objects.equals(this.compact, ospBucketCreateReqInfo.compact) &&
        Objects.equals(this.compression, ospBucketCreateReqInfo.compression) &&
        Objects.equals(this.encryptionType, ospBucketCreateReqInfo.encryptionType) &&
        Objects.equals(this.sseKmsKey, ospBucketCreateReqInfo.sseKmsKey) &&
        Objects.equals(this.storagePolicyName, ospBucketCreateReqInfo.storagePolicyName) &&
        Objects.equals(this.numShards, ospBucketCreateReqInfo.numShards) &&
        Objects.equals(this.namePrefix, ospBucketCreateReqInfo.namePrefix) &&
        Objects.equals(this.type, ospBucketCreateReqInfo.type) &&
        Objects.equals(this.ownerId, ospBucketCreateReqInfo.ownerId) &&
        Objects.equals(this.repeat, ospBucketCreateReqInfo.repeat) &&
        Objects.equals(this.description, ospBucketCreateReqInfo.description) &&
        Objects.equals(this.encryptionDefault, ospBucketCreateReqInfo.encryptionDefault) &&
        Objects.equals(this.quota, ospBucketCreateReqInfo.quota) &&
        Objects.equals(this.objectDeleteMode, ospBucketCreateReqInfo.objectDeleteMode) &&
        Objects.equals(this.tierCache, ospBucketCreateReqInfo.tierCache) &&
        Objects.equals(this.getTriggerRestore, ospBucketCreateReqInfo.getTriggerRestore) &&
        Objects.equals(this.metricEnabled, ospBucketCreateReqInfo.metricEnabled) &&
        Objects.equals(this.bucketType, ospBucketCreateReqInfo.bucketType) &&
        Objects.equals(this.name, ospBucketCreateReqInfo.name) &&
        Objects.equals(this.storageClassRule, ospBucketCreateReqInfo.storageClassRule) &&
        Objects.equals(this.acl, ospBucketCreateReqInfo.acl) &&
        Objects.equals(this.versioning, ospBucketCreateReqInfo.versioning) &&
        Objects.equals(this.objectRecycle, ospBucketCreateReqInfo.objectRecycle) &&
        Objects.equals(this.tierWorm, ospBucketCreateReqInfo.tierWorm) &&
        Objects.equals(this.restoreDays, ospBucketCreateReqInfo.restoreDays) &&
        Objects.equals(this.objectInheritBucketAcl, ospBucketCreateReqInfo.objectInheritBucketAcl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compactByBucket, storagePolicyId, lock, deleteArchiveStorageClass, ownerName, compact, compression, encryptionType, sseKmsKey, storagePolicyName, numShards, namePrefix, type, ownerId, repeat, description, encryptionDefault, quota, objectDeleteMode, tierCache, getTriggerRestore, metricEnabled, bucketType, name, storageClassRule, acl, versioning, objectRecycle, tierWorm, restoreDays, objectInheritBucketAcl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketCreateReqInfo {\n");
    
    sb.append("    compactByBucket: ").append(toIndentedString(compactByBucket)).append("\n");
    sb.append("    storagePolicyId: ").append(toIndentedString(storagePolicyId)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    deleteArchiveStorageClass: ").append(toIndentedString(deleteArchiveStorageClass)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    compact: ").append(toIndentedString(compact)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    sseKmsKey: ").append(toIndentedString(sseKmsKey)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    numShards: ").append(toIndentedString(numShards)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    encryptionDefault: ").append(toIndentedString(encryptionDefault)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    objectDeleteMode: ").append(toIndentedString(objectDeleteMode)).append("\n");
    sb.append("    tierCache: ").append(toIndentedString(tierCache)).append("\n");
    sb.append("    getTriggerRestore: ").append(toIndentedString(getTriggerRestore)).append("\n");
    sb.append("    metricEnabled: ").append(toIndentedString(metricEnabled)).append("\n");
    sb.append("    bucketType: ").append(toIndentedString(bucketType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storageClassRule: ").append(toIndentedString(storageClassRule)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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
