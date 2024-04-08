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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.DfsPathPerformance;
import xio.sds.client.model.DfsPathStat;
import xio.sds.client.model.DfsRootfsNestview;
import xio.sds.client.model.DpDfsSnapshotPolicy;
/**
 * DfsPath defines the model of dfs path +X:model:generate;plur&#x3D;DfsPaths;with_detailed; +X:benchmark:
 */
@Schema(description = "DfsPath defines the model of dfs path +X:model:generate;plur=DfsPaths;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsPath {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dfs_path_performance")
  private DfsPathPerformance dfsPathPerformance = null;

  @SerializedName("dfs_path_stat")
  private DfsPathStat dfsPathStat = null;

  @SerializedName("dfs_storage_policy_num")
  private Long dfsStoragePolicyNum = null;

  @SerializedName("dp_dfs_snapshot_policy")
  private DpDfsSnapshotPolicy dpDfsSnapshotPolicy = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rootfs")
  private DfsRootfsNestview rootfs = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("storage_policy_ids")
  private List<Long> storagePolicyIds = null;

  @SerializedName("stretched")
  private Boolean stretched = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public DfsPath actionStatus(String actionStatus) {
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

  public DfsPath cluster(ClusterNestview cluster) {
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

  public DfsPath create(OffsetDateTime create) {
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

  public DfsPath dfsPathPerformance(DfsPathPerformance dfsPathPerformance) {
    this.dfsPathPerformance = dfsPathPerformance;
    return this;
  }

   /**
   * Get dfsPathPerformance
   * @return dfsPathPerformance
  **/
  @Schema(description = "")
  public DfsPathPerformance getDfsPathPerformance() {
    return dfsPathPerformance;
  }

  public void setDfsPathPerformance(DfsPathPerformance dfsPathPerformance) {
    this.dfsPathPerformance = dfsPathPerformance;
  }

  public DfsPath dfsPathStat(DfsPathStat dfsPathStat) {
    this.dfsPathStat = dfsPathStat;
    return this;
  }

   /**
   * Get dfsPathStat
   * @return dfsPathStat
  **/
  @Schema(description = "")
  public DfsPathStat getDfsPathStat() {
    return dfsPathStat;
  }

  public void setDfsPathStat(DfsPathStat dfsPathStat) {
    this.dfsPathStat = dfsPathStat;
  }

  public DfsPath dfsStoragePolicyNum(Long dfsStoragePolicyNum) {
    this.dfsStoragePolicyNum = dfsStoragePolicyNum;
    return this;
  }

   /**
   * Get dfsStoragePolicyNum
   * @return dfsStoragePolicyNum
  **/
  @Schema(description = "")
  public Long getDfsStoragePolicyNum() {
    return dfsStoragePolicyNum;
  }

  public void setDfsStoragePolicyNum(Long dfsStoragePolicyNum) {
    this.dfsStoragePolicyNum = dfsStoragePolicyNum;
  }

  public DfsPath dpDfsSnapshotPolicy(DpDfsSnapshotPolicy dpDfsSnapshotPolicy) {
    this.dpDfsSnapshotPolicy = dpDfsSnapshotPolicy;
    return this;
  }

   /**
   * Get dpDfsSnapshotPolicy
   * @return dpDfsSnapshotPolicy
  **/
  @Schema(description = "")
  public DpDfsSnapshotPolicy getDpDfsSnapshotPolicy() {
    return dpDfsSnapshotPolicy;
  }

  public void setDpDfsSnapshotPolicy(DpDfsSnapshotPolicy dpDfsSnapshotPolicy) {
    this.dpDfsSnapshotPolicy = dpDfsSnapshotPolicy;
  }

  public DfsPath id(Long id) {
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

  public DfsPath name(String name) {
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

  public DfsPath rootfs(DfsRootfsNestview rootfs) {
    this.rootfs = rootfs;
    return this;
  }

   /**
   * Get rootfs
   * @return rootfs
  **/
  @Schema(description = "")
  public DfsRootfsNestview getRootfs() {
    return rootfs;
  }

  public void setRootfs(DfsRootfsNestview rootfs) {
    this.rootfs = rootfs;
  }

  public DfsPath status(String status) {
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

  public DfsPath storagePolicyIds(List<Long> storagePolicyIds) {
    this.storagePolicyIds = storagePolicyIds;
    return this;
  }

  public DfsPath addStoragePolicyIdsItem(Long storagePolicyIdsItem) {
    if (this.storagePolicyIds == null) {
      this.storagePolicyIds = new ArrayList<Long>();
    }
    this.storagePolicyIds.add(storagePolicyIdsItem);
    return this;
  }

   /**
   * Get storagePolicyIds
   * @return storagePolicyIds
  **/
  @Schema(description = "")
  public List<Long> getStoragePolicyIds() {
    return storagePolicyIds;
  }

  public void setStoragePolicyIds(List<Long> storagePolicyIds) {
    this.storagePolicyIds = storagePolicyIds;
  }

  public DfsPath stretched(Boolean stretched) {
    this.stretched = stretched;
    return this;
  }

   /**
   * Get stretched
   * @return stretched
  **/
  @Schema(description = "")
  public Boolean isStretched() {
    return stretched;
  }

  public void setStretched(Boolean stretched) {
    this.stretched = stretched;
  }

  public DfsPath update(OffsetDateTime update) {
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
    DfsPath dfsPath = (DfsPath) o;
    return Objects.equals(this.actionStatus, dfsPath.actionStatus) &&
        Objects.equals(this.cluster, dfsPath.cluster) &&
        Objects.equals(this.create, dfsPath.create) &&
        Objects.equals(this.dfsPathPerformance, dfsPath.dfsPathPerformance) &&
        Objects.equals(this.dfsPathStat, dfsPath.dfsPathStat) &&
        Objects.equals(this.dfsStoragePolicyNum, dfsPath.dfsStoragePolicyNum) &&
        Objects.equals(this.dpDfsSnapshotPolicy, dfsPath.dpDfsSnapshotPolicy) &&
        Objects.equals(this.id, dfsPath.id) &&
        Objects.equals(this.name, dfsPath.name) &&
        Objects.equals(this.rootfs, dfsPath.rootfs) &&
        Objects.equals(this.status, dfsPath.status) &&
        Objects.equals(this.storagePolicyIds, dfsPath.storagePolicyIds) &&
        Objects.equals(this.stretched, dfsPath.stretched) &&
        Objects.equals(this.update, dfsPath.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, create, dfsPathPerformance, dfsPathStat, dfsStoragePolicyNum, dpDfsSnapshotPolicy, id, name, rootfs, status, storagePolicyIds, stretched, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsPath {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsPathPerformance: ").append(toIndentedString(dfsPathPerformance)).append("\n");
    sb.append("    dfsPathStat: ").append(toIndentedString(dfsPathStat)).append("\n");
    sb.append("    dfsStoragePolicyNum: ").append(toIndentedString(dfsStoragePolicyNum)).append("\n");
    sb.append("    dpDfsSnapshotPolicy: ").append(toIndentedString(dpDfsSnapshotPolicy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storagePolicyIds: ").append(toIndentedString(storagePolicyIds)).append("\n");
    sb.append("    stretched: ").append(toIndentedString(stretched)).append("\n");
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
