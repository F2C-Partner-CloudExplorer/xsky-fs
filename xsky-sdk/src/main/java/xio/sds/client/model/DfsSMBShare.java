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
import xio.sds.client.model.DfsGatewayGroupNestview;
import xio.sds.client.model.DfsPathNestview;
import xio.sds.client.model.DfsRootfsNestview;
/**
 * DfsSMBShare defines model of dfs smb share +X:model:generate;order_by&#x3D;-ID;with_detailed; +X:benchmark:
 */
@Schema(description = "DfsSMBShare defines model of dfs smb share +X:model:generate;order_by=-ID;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBShare {
  @SerializedName("access_based_share_enum")
  private Boolean accessBasedShareEnum = null;

  @SerializedName("acl_inherited")
  private Boolean aclInherited = null;

  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("case_sensitive")
  private Boolean caseSensitive = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dfs_gateway_group")
  private DfsGatewayGroupNestview dfsGatewayGroup = null;

  @SerializedName("dfs_path")
  private DfsPathNestview dfsPath = null;

  @SerializedName("dfs_rootfs")
  private DfsRootfsNestview dfsRootfs = null;

  @SerializedName("hosts_allow")
  private String hostsAllow = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("oplocks")
  private Boolean oplocks = null;

  @SerializedName("recycled")
  private Boolean recycled = null;

  @SerializedName("securities")
  private List<String> securities = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("total_snapshot_num")
  private Long totalSnapshotNum = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("windows_acl")
  private Boolean windowsAcl = null;

  public DfsSMBShare accessBasedShareEnum(Boolean accessBasedShareEnum) {
    this.accessBasedShareEnum = accessBasedShareEnum;
    return this;
  }

   /**
   * Get accessBasedShareEnum
   * @return accessBasedShareEnum
  **/
  @Schema(description = "")
  public Boolean isAccessBasedShareEnum() {
    return accessBasedShareEnum;
  }

  public void setAccessBasedShareEnum(Boolean accessBasedShareEnum) {
    this.accessBasedShareEnum = accessBasedShareEnum;
  }

  public DfsSMBShare aclInherited(Boolean aclInherited) {
    this.aclInherited = aclInherited;
    return this;
  }

   /**
   * Get aclInherited
   * @return aclInherited
  **/
  @Schema(description = "")
  public Boolean isAclInherited() {
    return aclInherited;
  }

  public void setAclInherited(Boolean aclInherited) {
    this.aclInherited = aclInherited;
  }

  public DfsSMBShare actionStatus(String actionStatus) {
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

  public DfsSMBShare caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Get caseSensitive
   * @return caseSensitive
  **/
  @Schema(description = "")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public DfsSMBShare cluster(ClusterNestview cluster) {
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

  public DfsSMBShare create(OffsetDateTime create) {
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

  public DfsSMBShare description(String description) {
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

  public DfsSMBShare dfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
    return this;
  }

   /**
   * Get dfsGatewayGroup
   * @return dfsGatewayGroup
  **/
  @Schema(description = "")
  public DfsGatewayGroupNestview getDfsGatewayGroup() {
    return dfsGatewayGroup;
  }

  public void setDfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
  }

  public DfsSMBShare dfsPath(DfsPathNestview dfsPath) {
    this.dfsPath = dfsPath;
    return this;
  }

   /**
   * Get dfsPath
   * @return dfsPath
  **/
  @Schema(description = "")
  public DfsPathNestview getDfsPath() {
    return dfsPath;
  }

  public void setDfsPath(DfsPathNestview dfsPath) {
    this.dfsPath = dfsPath;
  }

  public DfsSMBShare dfsRootfs(DfsRootfsNestview dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
    return this;
  }

   /**
   * Get dfsRootfs
   * @return dfsRootfs
  **/
  @Schema(description = "")
  public DfsRootfsNestview getDfsRootfs() {
    return dfsRootfs;
  }

  public void setDfsRootfs(DfsRootfsNestview dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
  }

  public DfsSMBShare hostsAllow(String hostsAllow) {
    this.hostsAllow = hostsAllow;
    return this;
  }

   /**
   * Get hostsAllow
   * @return hostsAllow
  **/
  @Schema(description = "")
  public String getHostsAllow() {
    return hostsAllow;
  }

  public void setHostsAllow(String hostsAllow) {
    this.hostsAllow = hostsAllow;
  }

  public DfsSMBShare id(Long id) {
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

  public DfsSMBShare name(String name) {
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

  public DfsSMBShare oplocks(Boolean oplocks) {
    this.oplocks = oplocks;
    return this;
  }

   /**
   * Get oplocks
   * @return oplocks
  **/
  @Schema(description = "")
  public Boolean isOplocks() {
    return oplocks;
  }

  public void setOplocks(Boolean oplocks) {
    this.oplocks = oplocks;
  }

  public DfsSMBShare recycled(Boolean recycled) {
    this.recycled = recycled;
    return this;
  }

   /**
   * Get recycled
   * @return recycled
  **/
  @Schema(description = "")
  public Boolean isRecycled() {
    return recycled;
  }

  public void setRecycled(Boolean recycled) {
    this.recycled = recycled;
  }

  public DfsSMBShare securities(List<String> securities) {
    this.securities = securities;
    return this;
  }

  public DfsSMBShare addSecuritiesItem(String securitiesItem) {
    if (this.securities == null) {
      this.securities = new ArrayList<String>();
    }
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * Get securities
   * @return securities
  **/
  @Schema(description = "")
  public List<String> getSecurities() {
    return securities;
  }

  public void setSecurities(List<String> securities) {
    this.securities = securities;
  }

  public DfsSMBShare status(String status) {
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

  public DfsSMBShare totalSnapshotNum(Long totalSnapshotNum) {
    this.totalSnapshotNum = totalSnapshotNum;
    return this;
  }

   /**
   * Get totalSnapshotNum
   * @return totalSnapshotNum
  **/
  @Schema(description = "")
  public Long getTotalSnapshotNum() {
    return totalSnapshotNum;
  }

  public void setTotalSnapshotNum(Long totalSnapshotNum) {
    this.totalSnapshotNum = totalSnapshotNum;
  }

  public DfsSMBShare update(OffsetDateTime update) {
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

  public DfsSMBShare windowsAcl(Boolean windowsAcl) {
    this.windowsAcl = windowsAcl;
    return this;
  }

   /**
   * Get windowsAcl
   * @return windowsAcl
  **/
  @Schema(description = "")
  public Boolean isWindowsAcl() {
    return windowsAcl;
  }

  public void setWindowsAcl(Boolean windowsAcl) {
    this.windowsAcl = windowsAcl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBShare dfsSMBShare = (DfsSMBShare) o;
    return Objects.equals(this.accessBasedShareEnum, dfsSMBShare.accessBasedShareEnum) &&
        Objects.equals(this.aclInherited, dfsSMBShare.aclInherited) &&
        Objects.equals(this.actionStatus, dfsSMBShare.actionStatus) &&
        Objects.equals(this.caseSensitive, dfsSMBShare.caseSensitive) &&
        Objects.equals(this.cluster, dfsSMBShare.cluster) &&
        Objects.equals(this.create, dfsSMBShare.create) &&
        Objects.equals(this.description, dfsSMBShare.description) &&
        Objects.equals(this.dfsGatewayGroup, dfsSMBShare.dfsGatewayGroup) &&
        Objects.equals(this.dfsPath, dfsSMBShare.dfsPath) &&
        Objects.equals(this.dfsRootfs, dfsSMBShare.dfsRootfs) &&
        Objects.equals(this.hostsAllow, dfsSMBShare.hostsAllow) &&
        Objects.equals(this.id, dfsSMBShare.id) &&
        Objects.equals(this.name, dfsSMBShare.name) &&
        Objects.equals(this.oplocks, dfsSMBShare.oplocks) &&
        Objects.equals(this.recycled, dfsSMBShare.recycled) &&
        Objects.equals(this.securities, dfsSMBShare.securities) &&
        Objects.equals(this.status, dfsSMBShare.status) &&
        Objects.equals(this.totalSnapshotNum, dfsSMBShare.totalSnapshotNum) &&
        Objects.equals(this.update, dfsSMBShare.update) &&
        Objects.equals(this.windowsAcl, dfsSMBShare.windowsAcl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessBasedShareEnum, aclInherited, actionStatus, caseSensitive, cluster, create, description, dfsGatewayGroup, dfsPath, dfsRootfs, hostsAllow, id, name, oplocks, recycled, securities, status, totalSnapshotNum, update, windowsAcl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBShare {\n");
    
    sb.append("    accessBasedShareEnum: ").append(toIndentedString(accessBasedShareEnum)).append("\n");
    sb.append("    aclInherited: ").append(toIndentedString(aclInherited)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dfsGatewayGroup: ").append(toIndentedString(dfsGatewayGroup)).append("\n");
    sb.append("    dfsPath: ").append(toIndentedString(dfsPath)).append("\n");
    sb.append("    dfsRootfs: ").append(toIndentedString(dfsRootfs)).append("\n");
    sb.append("    hostsAllow: ").append(toIndentedString(hostsAllow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oplocks: ").append(toIndentedString(oplocks)).append("\n");
    sb.append("    recycled: ").append(toIndentedString(recycled)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSnapshotNum: ").append(toIndentedString(totalSnapshotNum)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    windowsAcl: ").append(toIndentedString(windowsAcl)).append("\n");
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