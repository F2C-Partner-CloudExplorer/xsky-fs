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
import xio.sds.client.model.VolumeGroupNestview;
/**
 * VolumeGroupSnapshot defines the model of volume group snapshot +X:model:generate;plur&#x3D;VolumeGroupSnapshots;with_detailed; +X:benchmark:
 */
@Schema(description = "VolumeGroupSnapshot defines the model of volume group snapshot +X:model:generate;plur=VolumeGroupSnapshots;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeGroupSnapshot {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("block_snapshot_num")
  private Long blockSnapshotNum = null;

  @SerializedName("block_volume_group")
  private VolumeGroupNestview blockVolumeGroup = null;

  @SerializedName("cloned_block_volume_group_num")
  private Long clonedBlockVolumeGroupNum = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("group_snapshot_name")
  private String groupSnapshotName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("passive")
  private Boolean passive = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public VolumeGroupSnapshot actionStatus(String actionStatus) {
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

  public VolumeGroupSnapshot blockSnapshotNum(Long blockSnapshotNum) {
    this.blockSnapshotNum = blockSnapshotNum;
    return this;
  }

   /**
   * Get blockSnapshotNum
   * @return blockSnapshotNum
  **/
  @Schema(description = "")
  public Long getBlockSnapshotNum() {
    return blockSnapshotNum;
  }

  public void setBlockSnapshotNum(Long blockSnapshotNum) {
    this.blockSnapshotNum = blockSnapshotNum;
  }

  public VolumeGroupSnapshot blockVolumeGroup(VolumeGroupNestview blockVolumeGroup) {
    this.blockVolumeGroup = blockVolumeGroup;
    return this;
  }

   /**
   * Get blockVolumeGroup
   * @return blockVolumeGroup
  **/
  @Schema(description = "")
  public VolumeGroupNestview getBlockVolumeGroup() {
    return blockVolumeGroup;
  }

  public void setBlockVolumeGroup(VolumeGroupNestview blockVolumeGroup) {
    this.blockVolumeGroup = blockVolumeGroup;
  }

  public VolumeGroupSnapshot clonedBlockVolumeGroupNum(Long clonedBlockVolumeGroupNum) {
    this.clonedBlockVolumeGroupNum = clonedBlockVolumeGroupNum;
    return this;
  }

   /**
   * Get clonedBlockVolumeGroupNum
   * @return clonedBlockVolumeGroupNum
  **/
  @Schema(description = "")
  public Long getClonedBlockVolumeGroupNum() {
    return clonedBlockVolumeGroupNum;
  }

  public void setClonedBlockVolumeGroupNum(Long clonedBlockVolumeGroupNum) {
    this.clonedBlockVolumeGroupNum = clonedBlockVolumeGroupNum;
  }

  public VolumeGroupSnapshot cluster(ClusterNestview cluster) {
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

  public VolumeGroupSnapshot create(OffsetDateTime create) {
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

  public VolumeGroupSnapshot creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @Schema(description = "")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public VolumeGroupSnapshot description(String description) {
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

  public VolumeGroupSnapshot groupSnapshotName(String groupSnapshotName) {
    this.groupSnapshotName = groupSnapshotName;
    return this;
  }

   /**
   * Get groupSnapshotName
   * @return groupSnapshotName
  **/
  @Schema(description = "")
  public String getGroupSnapshotName() {
    return groupSnapshotName;
  }

  public void setGroupSnapshotName(String groupSnapshotName) {
    this.groupSnapshotName = groupSnapshotName;
  }

  public VolumeGroupSnapshot id(Long id) {
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

  public VolumeGroupSnapshot name(String name) {
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

  public VolumeGroupSnapshot passive(Boolean passive) {
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

  public VolumeGroupSnapshot status(String status) {
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

  public VolumeGroupSnapshot update(OffsetDateTime update) {
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
    VolumeGroupSnapshot volumeGroupSnapshot = (VolumeGroupSnapshot) o;
    return Objects.equals(this.actionStatus, volumeGroupSnapshot.actionStatus) &&
        Objects.equals(this.blockSnapshotNum, volumeGroupSnapshot.blockSnapshotNum) &&
        Objects.equals(this.blockVolumeGroup, volumeGroupSnapshot.blockVolumeGroup) &&
        Objects.equals(this.clonedBlockVolumeGroupNum, volumeGroupSnapshot.clonedBlockVolumeGroupNum) &&
        Objects.equals(this.cluster, volumeGroupSnapshot.cluster) &&
        Objects.equals(this.create, volumeGroupSnapshot.create) &&
        Objects.equals(this.creator, volumeGroupSnapshot.creator) &&
        Objects.equals(this.description, volumeGroupSnapshot.description) &&
        Objects.equals(this.groupSnapshotName, volumeGroupSnapshot.groupSnapshotName) &&
        Objects.equals(this.id, volumeGroupSnapshot.id) &&
        Objects.equals(this.name, volumeGroupSnapshot.name) &&
        Objects.equals(this.passive, volumeGroupSnapshot.passive) &&
        Objects.equals(this.status, volumeGroupSnapshot.status) &&
        Objects.equals(this.update, volumeGroupSnapshot.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, blockSnapshotNum, blockVolumeGroup, clonedBlockVolumeGroupNum, cluster, create, creator, description, groupSnapshotName, id, name, passive, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupSnapshot {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    blockSnapshotNum: ").append(toIndentedString(blockSnapshotNum)).append("\n");
    sb.append("    blockVolumeGroup: ").append(toIndentedString(blockVolumeGroup)).append("\n");
    sb.append("    clonedBlockVolumeGroupNum: ").append(toIndentedString(clonedBlockVolumeGroupNum)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupSnapshotName: ").append(toIndentedString(groupSnapshotName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passive: ").append(toIndentedString(passive)).append("\n");
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