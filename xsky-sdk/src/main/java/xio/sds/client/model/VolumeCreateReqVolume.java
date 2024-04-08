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
import xio.sds.client.model.VolumeQosSpec;
/**
 * VolumeCreateReqVolume
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeCreateReqVolume {
  @SerializedName("block_snapshot_id")
  private Long blockSnapshotId = null;

  @SerializedName("crc_check")
  private Boolean crcCheck = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("flattened")
  private Boolean flattened = null;

  @SerializedName("format")
  private Long format = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("performance_priority")
  private Long performancePriority = null;

  @SerializedName("pool_id")
  private Long poolId = null;

  @SerializedName("qos")
  private VolumeQosSpec qos = null;

  @SerializedName("qos_enabled")
  private Boolean qosEnabled = null;

  @SerializedName("remote_cluster_fs_id")
  private String remoteClusterFsId = null;

  @SerializedName("replication_pool")
  private String replicationPool = null;

  @SerializedName("replication_pool_id")
  private Long replicationPoolId = null;

  @SerializedName("replication_pool_name")
  private String replicationPoolName = null;

  @SerializedName("replication_version")
  private Long replicationVersion = null;

  @SerializedName("replication_volume")
  private String replicationVolume = null;

  @SerializedName("replication_volume_id")
  private Long replicationVolumeId = null;

  @SerializedName("replication_volume_name")
  private String replicationVolumeName = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("sn")
  private String sn = null;

  @SerializedName("snapshot_replication_pool")
  private String snapshotReplicationPool = null;

  @SerializedName("snapshot_replication_pool_id")
  private Long snapshotReplicationPoolId = null;

  @SerializedName("snapshot_replication_volume")
  private String snapshotReplicationVolume = null;

  @SerializedName("snapshot_replication_volume_id")
  private Long snapshotReplicationVolumeId = null;

  @SerializedName("uid")
  private String uid = null;

  public VolumeCreateReqVolume blockSnapshotId(Long blockSnapshotId) {
    this.blockSnapshotId = blockSnapshotId;
    return this;
  }

   /**
   * id of related block volume snapshot
   * @return blockSnapshotId
  **/
  @Schema(description = "id of related block volume snapshot")
  public Long getBlockSnapshotId() {
    return blockSnapshotId;
  }

  public void setBlockSnapshotId(Long blockSnapshotId) {
    this.blockSnapshotId = blockSnapshotId;
  }

  public VolumeCreateReqVolume crcCheck(Boolean crcCheck) {
    this.crcCheck = crcCheck;
    return this;
  }

   /**
   * crc check or not
   * @return crcCheck
  **/
  @Schema(description = "crc check or not")
  public Boolean isCrcCheck() {
    return crcCheck;
  }

  public void setCrcCheck(Boolean crcCheck) {
    this.crcCheck = crcCheck;
  }

  public VolumeCreateReqVolume description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of volume
   * @return description
  **/
  @Schema(description = "description of volume")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VolumeCreateReqVolume flattened(Boolean flattened) {
    this.flattened = flattened;
    return this;
  }

   /**
   * flatten or not flatten
   * @return flattened
  **/
  @Schema(description = "flatten or not flatten")
  public Boolean isFlattened() {
    return flattened;
  }

  public void setFlattened(Boolean flattened) {
    this.flattened = flattened;
  }

  public VolumeCreateReqVolume format(Long format) {
    this.format = format;
    return this;
  }

   /**
   * volume format: { 128 | 129 (advanced) }, default 128
   * @return format
  **/
  @Schema(description = "volume format: { 128 | 129 (advanced) }, default 128")
  public Long getFormat() {
    return format;
  }

  public void setFormat(Long format) {
    this.format = format;
  }

  public VolumeCreateReqVolume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of volume
   * @return name
  **/
  @Schema(required = true, description = "name of volume")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VolumeCreateReqVolume performancePriority(Long performancePriority) {
    this.performancePriority = performancePriority;
    return this;
  }

   /**
   * performance priority: { 0 | 1 }, default 0
   * @return performancePriority
  **/
  @Schema(description = "performance priority: { 0 | 1 }, default 0")
  public Long getPerformancePriority() {
    return performancePriority;
  }

  public void setPerformancePriority(Long performancePriority) {
    this.performancePriority = performancePriority;
  }

  public VolumeCreateReqVolume poolId(Long poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * id of pool belonged to
   * @return poolId
  **/
  @Schema(required = true, description = "id of pool belonged to")
  public Long getPoolId() {
    return poolId;
  }

  public void setPoolId(Long poolId) {
    this.poolId = poolId;
  }

  public VolumeCreateReqVolume qos(VolumeQosSpec qos) {
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @Schema(description = "")
  public VolumeQosSpec getQos() {
    return qos;
  }

  public void setQos(VolumeQosSpec qos) {
    this.qos = qos;
  }

  public VolumeCreateReqVolume qosEnabled(Boolean qosEnabled) {
    this.qosEnabled = qosEnabled;
    return this;
  }

   /**
   * enable or disable the qos
   * @return qosEnabled
  **/
  @Schema(description = "enable or disable the qos")
  public Boolean isQosEnabled() {
    return qosEnabled;
  }

  public void setQosEnabled(Boolean qosEnabled) {
    this.qosEnabled = qosEnabled;
  }

  public VolumeCreateReqVolume remoteClusterFsId(String remoteClusterFsId) {
    this.remoteClusterFsId = remoteClusterFsId;
    return this;
  }

   /**
   * replication remote cluster fsid
   * @return remoteClusterFsId
  **/
  @Schema(description = "replication remote cluster fsid")
  public String getRemoteClusterFsId() {
    return remoteClusterFsId;
  }

  public void setRemoteClusterFsId(String remoteClusterFsId) {
    this.remoteClusterFsId = remoteClusterFsId;
  }

  public VolumeCreateReqVolume replicationPool(String replicationPool) {
    this.replicationPool = replicationPool;
    return this;
  }

   /**
   * replication peer pool
   * @return replicationPool
  **/
  @Schema(description = "replication peer pool")
  public String getReplicationPool() {
    return replicationPool;
  }

  public void setReplicationPool(String replicationPool) {
    this.replicationPool = replicationPool;
  }

  public VolumeCreateReqVolume replicationPoolId(Long replicationPoolId) {
    this.replicationPoolId = replicationPoolId;
    return this;
  }

   /**
   * replication peer pool id
   * @return replicationPoolId
  **/
  @Schema(description = "replication peer pool id")
  public Long getReplicationPoolId() {
    return replicationPoolId;
  }

  public void setReplicationPoolId(Long replicationPoolId) {
    this.replicationPoolId = replicationPoolId;
  }

  public VolumeCreateReqVolume replicationPoolName(String replicationPoolName) {
    this.replicationPoolName = replicationPoolName;
    return this;
  }

   /**
   * replication peer pool name
   * @return replicationPoolName
  **/
  @Schema(description = "replication peer pool name")
  public String getReplicationPoolName() {
    return replicationPoolName;
  }

  public void setReplicationPoolName(String replicationPoolName) {
    this.replicationPoolName = replicationPoolName;
  }

  public VolumeCreateReqVolume replicationVersion(Long replicationVersion) {
    this.replicationVersion = replicationVersion;
    return this;
  }

   /**
   * replication version
   * @return replicationVersion
  **/
  @Schema(description = "replication version")
  public Long getReplicationVersion() {
    return replicationVersion;
  }

  public void setReplicationVersion(Long replicationVersion) {
    this.replicationVersion = replicationVersion;
  }

  public VolumeCreateReqVolume replicationVolume(String replicationVolume) {
    this.replicationVolume = replicationVolume;
    return this;
  }

   /**
   * replication peer volume
   * @return replicationVolume
  **/
  @Schema(description = "replication peer volume")
  public String getReplicationVolume() {
    return replicationVolume;
  }

  public void setReplicationVolume(String replicationVolume) {
    this.replicationVolume = replicationVolume;
  }

  public VolumeCreateReqVolume replicationVolumeId(Long replicationVolumeId) {
    this.replicationVolumeId = replicationVolumeId;
    return this;
  }

   /**
   * replication peer volume id
   * @return replicationVolumeId
  **/
  @Schema(description = "replication peer volume id")
  public Long getReplicationVolumeId() {
    return replicationVolumeId;
  }

  public void setReplicationVolumeId(Long replicationVolumeId) {
    this.replicationVolumeId = replicationVolumeId;
  }

  public VolumeCreateReqVolume replicationVolumeName(String replicationVolumeName) {
    this.replicationVolumeName = replicationVolumeName;
    return this;
  }

   /**
   * replication peer volume name
   * @return replicationVolumeName
  **/
  @Schema(description = "replication peer volume name")
  public String getReplicationVolumeName() {
    return replicationVolumeName;
  }

  public void setReplicationVolumeName(String replicationVolumeName) {
    this.replicationVolumeName = replicationVolumeName;
  }

  public VolumeCreateReqVolume size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * size of volume
   * @return size
  **/
  @Schema(description = "size of volume")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public VolumeCreateReqVolume sn(String sn) {
    this.sn = sn;
    return this;
  }

   /**
   * volume sn, used when creating replication volume
   * @return sn
  **/
  @Schema(description = "volume sn, used when creating replication volume")
  public String getSn() {
    return sn;
  }

  public void setSn(String sn) {
    this.sn = sn;
  }

  public VolumeCreateReqVolume snapshotReplicationPool(String snapshotReplicationPool) {
    this.snapshotReplicationPool = snapshotReplicationPool;
    return this;
  }

   /**
   * snapshot replication peer pool
   * @return snapshotReplicationPool
  **/
  @Schema(description = "snapshot replication peer pool")
  public String getSnapshotReplicationPool() {
    return snapshotReplicationPool;
  }

  public void setSnapshotReplicationPool(String snapshotReplicationPool) {
    this.snapshotReplicationPool = snapshotReplicationPool;
  }

  public VolumeCreateReqVolume snapshotReplicationPoolId(Long snapshotReplicationPoolId) {
    this.snapshotReplicationPoolId = snapshotReplicationPoolId;
    return this;
  }

   /**
   * snapshot replication peer pool id
   * @return snapshotReplicationPoolId
  **/
  @Schema(description = "snapshot replication peer pool id")
  public Long getSnapshotReplicationPoolId() {
    return snapshotReplicationPoolId;
  }

  public void setSnapshotReplicationPoolId(Long snapshotReplicationPoolId) {
    this.snapshotReplicationPoolId = snapshotReplicationPoolId;
  }

  public VolumeCreateReqVolume snapshotReplicationVolume(String snapshotReplicationVolume) {
    this.snapshotReplicationVolume = snapshotReplicationVolume;
    return this;
  }

   /**
   * snapshot replication peer volume
   * @return snapshotReplicationVolume
  **/
  @Schema(description = "snapshot replication peer volume")
  public String getSnapshotReplicationVolume() {
    return snapshotReplicationVolume;
  }

  public void setSnapshotReplicationVolume(String snapshotReplicationVolume) {
    this.snapshotReplicationVolume = snapshotReplicationVolume;
  }

  public VolumeCreateReqVolume snapshotReplicationVolumeId(Long snapshotReplicationVolumeId) {
    this.snapshotReplicationVolumeId = snapshotReplicationVolumeId;
    return this;
  }

   /**
   * snapshot replication peer volume id
   * @return snapshotReplicationVolumeId
  **/
  @Schema(description = "snapshot replication peer volume id")
  public Long getSnapshotReplicationVolumeId() {
    return snapshotReplicationVolumeId;
  }

  public void setSnapshotReplicationVolumeId(Long snapshotReplicationVolumeId) {
    this.snapshotReplicationVolumeId = snapshotReplicationVolumeId;
  }

  public VolumeCreateReqVolume uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID of volume
   * @return uid
  **/
  @Schema(description = "UID of volume")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCreateReqVolume volumeCreateReqVolume = (VolumeCreateReqVolume) o;
    return Objects.equals(this.blockSnapshotId, volumeCreateReqVolume.blockSnapshotId) &&
        Objects.equals(this.crcCheck, volumeCreateReqVolume.crcCheck) &&
        Objects.equals(this.description, volumeCreateReqVolume.description) &&
        Objects.equals(this.flattened, volumeCreateReqVolume.flattened) &&
        Objects.equals(this.format, volumeCreateReqVolume.format) &&
        Objects.equals(this.name, volumeCreateReqVolume.name) &&
        Objects.equals(this.performancePriority, volumeCreateReqVolume.performancePriority) &&
        Objects.equals(this.poolId, volumeCreateReqVolume.poolId) &&
        Objects.equals(this.qos, volumeCreateReqVolume.qos) &&
        Objects.equals(this.qosEnabled, volumeCreateReqVolume.qosEnabled) &&
        Objects.equals(this.remoteClusterFsId, volumeCreateReqVolume.remoteClusterFsId) &&
        Objects.equals(this.replicationPool, volumeCreateReqVolume.replicationPool) &&
        Objects.equals(this.replicationPoolId, volumeCreateReqVolume.replicationPoolId) &&
        Objects.equals(this.replicationPoolName, volumeCreateReqVolume.replicationPoolName) &&
        Objects.equals(this.replicationVersion, volumeCreateReqVolume.replicationVersion) &&
        Objects.equals(this.replicationVolume, volumeCreateReqVolume.replicationVolume) &&
        Objects.equals(this.replicationVolumeId, volumeCreateReqVolume.replicationVolumeId) &&
        Objects.equals(this.replicationVolumeName, volumeCreateReqVolume.replicationVolumeName) &&
        Objects.equals(this.size, volumeCreateReqVolume.size) &&
        Objects.equals(this.sn, volumeCreateReqVolume.sn) &&
        Objects.equals(this.snapshotReplicationPool, volumeCreateReqVolume.snapshotReplicationPool) &&
        Objects.equals(this.snapshotReplicationPoolId, volumeCreateReqVolume.snapshotReplicationPoolId) &&
        Objects.equals(this.snapshotReplicationVolume, volumeCreateReqVolume.snapshotReplicationVolume) &&
        Objects.equals(this.snapshotReplicationVolumeId, volumeCreateReqVolume.snapshotReplicationVolumeId) &&
        Objects.equals(this.uid, volumeCreateReqVolume.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockSnapshotId, crcCheck, description, flattened, format, name, performancePriority, poolId, qos, qosEnabled, remoteClusterFsId, replicationPool, replicationPoolId, replicationPoolName, replicationVersion, replicationVolume, replicationVolumeId, replicationVolumeName, size, sn, snapshotReplicationPool, snapshotReplicationPoolId, snapshotReplicationVolume, snapshotReplicationVolumeId, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCreateReqVolume {\n");
    
    sb.append("    blockSnapshotId: ").append(toIndentedString(blockSnapshotId)).append("\n");
    sb.append("    crcCheck: ").append(toIndentedString(crcCheck)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flattened: ").append(toIndentedString(flattened)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    performancePriority: ").append(toIndentedString(performancePriority)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    qosEnabled: ").append(toIndentedString(qosEnabled)).append("\n");
    sb.append("    remoteClusterFsId: ").append(toIndentedString(remoteClusterFsId)).append("\n");
    sb.append("    replicationPool: ").append(toIndentedString(replicationPool)).append("\n");
    sb.append("    replicationPoolId: ").append(toIndentedString(replicationPoolId)).append("\n");
    sb.append("    replicationPoolName: ").append(toIndentedString(replicationPoolName)).append("\n");
    sb.append("    replicationVersion: ").append(toIndentedString(replicationVersion)).append("\n");
    sb.append("    replicationVolume: ").append(toIndentedString(replicationVolume)).append("\n");
    sb.append("    replicationVolumeId: ").append(toIndentedString(replicationVolumeId)).append("\n");
    sb.append("    replicationVolumeName: ").append(toIndentedString(replicationVolumeName)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sn: ").append(toIndentedString(sn)).append("\n");
    sb.append("    snapshotReplicationPool: ").append(toIndentedString(snapshotReplicationPool)).append("\n");
    sb.append("    snapshotReplicationPoolId: ").append(toIndentedString(snapshotReplicationPoolId)).append("\n");
    sb.append("    snapshotReplicationVolume: ").append(toIndentedString(snapshotReplicationVolume)).append("\n");
    sb.append("    snapshotReplicationVolumeId: ").append(toIndentedString(snapshotReplicationVolumeId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
