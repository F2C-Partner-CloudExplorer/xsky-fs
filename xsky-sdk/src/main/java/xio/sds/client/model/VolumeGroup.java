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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.PoolNestview;
import xio.sds.client.model.VolumeGroupSnapshotNestview;
/**
 * VolumeGroup defines the model of volume group +X:model:generate;plur&#x3D;VolumeGroups;with_detailed; +X:benchmark:
 */
@Schema(description = "VolumeGroup defines the model of volume group +X:model:generate;plur=VolumeGroups;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeGroup {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("block_volume_group_snapshot")
  private VolumeGroupSnapshotNestview blockVolumeGroupSnapshot = null;

  @SerializedName("block_volume_group_snapshot_num")
  private Long blockVolumeGroupSnapshotNum = null;

  @SerializedName("block_volume_num")
  private Long blockVolumeNum = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("flattened")
  private Boolean flattened = null;

  @SerializedName("group_name")
  private String groupName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("latest_snapshot_time")
  private OffsetDateTime latestSnapshotTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("passive")
  private Boolean passive = null;

  @SerializedName("pool")
  private PoolNestview pool = null;

  @SerializedName("progress")
  private Double progress = null;

  @SerializedName("snapshot_replication_role")
  private String snapshotReplicationRole = null;

  @SerializedName("snapshot_replication_status")
  private String snapshotReplicationStatus = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public VolumeGroup actionStatus(String actionStatus) {
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

  public VolumeGroup blockVolumeGroupSnapshot(VolumeGroupSnapshotNestview blockVolumeGroupSnapshot) {
    this.blockVolumeGroupSnapshot = blockVolumeGroupSnapshot;
    return this;
  }

   /**
   * Get blockVolumeGroupSnapshot
   * @return blockVolumeGroupSnapshot
  **/
  @Schema(description = "")
  public VolumeGroupSnapshotNestview getBlockVolumeGroupSnapshot() {
    return blockVolumeGroupSnapshot;
  }

  public void setBlockVolumeGroupSnapshot(VolumeGroupSnapshotNestview blockVolumeGroupSnapshot) {
    this.blockVolumeGroupSnapshot = blockVolumeGroupSnapshot;
  }

  public VolumeGroup blockVolumeGroupSnapshotNum(Long blockVolumeGroupSnapshotNum) {
    this.blockVolumeGroupSnapshotNum = blockVolumeGroupSnapshotNum;
    return this;
  }

   /**
   * Get blockVolumeGroupSnapshotNum
   * @return blockVolumeGroupSnapshotNum
  **/
  @Schema(description = "")
  public Long getBlockVolumeGroupSnapshotNum() {
    return blockVolumeGroupSnapshotNum;
  }

  public void setBlockVolumeGroupSnapshotNum(Long blockVolumeGroupSnapshotNum) {
    this.blockVolumeGroupSnapshotNum = blockVolumeGroupSnapshotNum;
  }

  public VolumeGroup blockVolumeNum(Long blockVolumeNum) {
    this.blockVolumeNum = blockVolumeNum;
    return this;
  }

   /**
   * Get blockVolumeNum
   * @return blockVolumeNum
  **/
  @Schema(description = "")
  public Long getBlockVolumeNum() {
    return blockVolumeNum;
  }

  public void setBlockVolumeNum(Long blockVolumeNum) {
    this.blockVolumeNum = blockVolumeNum;
  }

  public VolumeGroup cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public VolumeGroup create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public VolumeGroup description(String description) {
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

  public VolumeGroup flattened(Boolean flattened) {
    this.flattened = flattened;
    return this;
  }

   /**
   * Get flattened
   * @return flattened
  **/
  @Schema(description = "")
  public Boolean isFlattened() {
    return flattened;
  }

  public void setFlattened(Boolean flattened) {
    this.flattened = flattened;
  }

  public VolumeGroup groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @Schema(description = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public VolumeGroup id(Long id) {
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

  public VolumeGroup latestSnapshotTime(OffsetDateTime latestSnapshotTime) {
    this.latestSnapshotTime = latestSnapshotTime;
    return this;
  }

   /**
   * Get latestSnapshotTime
   * @return latestSnapshotTime
  **/
  @Schema(description = "")
  public OffsetDateTime getLatestSnapshotTime() {
    return latestSnapshotTime;
  }

  public void setLatestSnapshotTime(OffsetDateTime latestSnapshotTime) {
    this.latestSnapshotTime = latestSnapshotTime;
  }

  public VolumeGroup name(String name) {
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

  public VolumeGroup passive(Boolean passive) {
    this.passive = passive;
    return this;
  }

   /**
   * Get passive
   * @return passive
  **/
  @Schema(description = "")
  public Boolean isPassive() {
    return passive;
  }

  public void setPassive(Boolean passive) {
    this.passive = passive;
  }

  public VolumeGroup pool(PoolNestview pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @Schema(description = "")
  public PoolNestview getPool() {
    return pool;
  }

  public void setPool(PoolNestview pool) {
    this.pool = pool;
  }

  public VolumeGroup progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public VolumeGroup snapshotReplicationRole(String snapshotReplicationRole) {
    this.snapshotReplicationRole = snapshotReplicationRole;
    return this;
  }

   /**
   * Get snapshotReplicationRole
   * @return snapshotReplicationRole
  **/
  @Schema(description = "")
  public String getSnapshotReplicationRole() {
    return snapshotReplicationRole;
  }

  public void setSnapshotReplicationRole(String snapshotReplicationRole) {
    this.snapshotReplicationRole = snapshotReplicationRole;
  }

  public VolumeGroup snapshotReplicationStatus(String snapshotReplicationStatus) {
    this.snapshotReplicationStatus = snapshotReplicationStatus;
    return this;
  }

   /**
   * Get snapshotReplicationStatus
   * @return snapshotReplicationStatus
  **/
  @Schema(description = "")
  public String getSnapshotReplicationStatus() {
    return snapshotReplicationStatus;
  }

  public void setSnapshotReplicationStatus(String snapshotReplicationStatus) {
    this.snapshotReplicationStatus = snapshotReplicationStatus;
  }

  public VolumeGroup status(String status) {
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

  public VolumeGroup update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeGroup volumeGroup = (VolumeGroup) o;
    return Objects.equals(this.actionStatus, volumeGroup.actionStatus) &&
        Objects.equals(this.blockVolumeGroupSnapshot, volumeGroup.blockVolumeGroupSnapshot) &&
        Objects.equals(this.blockVolumeGroupSnapshotNum, volumeGroup.blockVolumeGroupSnapshotNum) &&
        Objects.equals(this.blockVolumeNum, volumeGroup.blockVolumeNum) &&
        Objects.equals(this.cluster, volumeGroup.cluster) &&
        Objects.equals(this.create, volumeGroup.create) &&
        Objects.equals(this.description, volumeGroup.description) &&
        Objects.equals(this.flattened, volumeGroup.flattened) &&
        Objects.equals(this.groupName, volumeGroup.groupName) &&
        Objects.equals(this.id, volumeGroup.id) &&
        Objects.equals(this.latestSnapshotTime, volumeGroup.latestSnapshotTime) &&
        Objects.equals(this.name, volumeGroup.name) &&
        Objects.equals(this.passive, volumeGroup.passive) &&
        Objects.equals(this.pool, volumeGroup.pool) &&
        Objects.equals(this.progress, volumeGroup.progress) &&
        Objects.equals(this.snapshotReplicationRole, volumeGroup.snapshotReplicationRole) &&
        Objects.equals(this.snapshotReplicationStatus, volumeGroup.snapshotReplicationStatus) &&
        Objects.equals(this.status, volumeGroup.status) &&
        Objects.equals(this.update, volumeGroup.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, blockVolumeGroupSnapshot, blockVolumeGroupSnapshotNum, blockVolumeNum, cluster, create, description, flattened, groupName, id, latestSnapshotTime, name, passive, pool, progress, snapshotReplicationRole, snapshotReplicationStatus, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroup {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    blockVolumeGroupSnapshot: ").append(toIndentedString(blockVolumeGroupSnapshot)).append("\n");
    sb.append("    blockVolumeGroupSnapshotNum: ").append(toIndentedString(blockVolumeGroupSnapshotNum)).append("\n");
    sb.append("    blockVolumeNum: ").append(toIndentedString(blockVolumeNum)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flattened: ").append(toIndentedString(flattened)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestSnapshotTime: ").append(toIndentedString(latestSnapshotTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passive: ").append(toIndentedString(passive)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    snapshotReplicationRole: ").append(toIndentedString(snapshotReplicationRole)).append("\n");
    sb.append("    snapshotReplicationStatus: ").append(toIndentedString(snapshotReplicationStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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