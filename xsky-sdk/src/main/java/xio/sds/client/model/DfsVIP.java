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
import xio.sds.client.model.DfsGatewayGroupNestview;
import xio.sds.client.model.DfsGatewayNestview;
import xio.sds.client.model.DfsGatewayZoneNestview;
/**
 * DfsVIP defines model of dfs vip +X:model:generate;order_by&#x3D;-ID;etcd_lock; +X:benchmark:
 */
@Schema(description = "DfsVIP defines model of dfs vip +X:model:generate;order_by=-ID;etcd_lock; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsVIP {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dfs_gateway_group")
  private DfsGatewayGroupNestview dfsGatewayGroup = null;

  @SerializedName("dfs_gateway_zone")
  private DfsGatewayZoneNestview dfsGatewayZone = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("primary_gateway")
  private DfsGatewayNestview primaryGateway = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("vip")
  private String vip = null;

  @SerializedName("vip_mask")
  private Long vipMask = null;

  public DfsVIP actionStatus(String actionStatus) {
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

  public DfsVIP cluster(ClusterNestview cluster) {
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

  public DfsVIP create(OffsetDateTime create) {
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

  public DfsVIP dfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
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

  public DfsVIP dfsGatewayZone(DfsGatewayZoneNestview dfsGatewayZone) {
    this.dfsGatewayZone = dfsGatewayZone;
    return this;
  }

   /**
   * Get dfsGatewayZone
   * @return dfsGatewayZone
  **/
  @Schema(description = "")
  public DfsGatewayZoneNestview getDfsGatewayZone() {
    return dfsGatewayZone;
  }

  public void setDfsGatewayZone(DfsGatewayZoneNestview dfsGatewayZone) {
    this.dfsGatewayZone = dfsGatewayZone;
  }

  public DfsVIP id(Long id) {
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

  public DfsVIP primaryGateway(DfsGatewayNestview primaryGateway) {
    this.primaryGateway = primaryGateway;
    return this;
  }

   /**
   * Get primaryGateway
   * @return primaryGateway
  **/
  @Schema(description = "")
  public DfsGatewayNestview getPrimaryGateway() {
    return primaryGateway;
  }

  public void setPrimaryGateway(DfsGatewayNestview primaryGateway) {
    this.primaryGateway = primaryGateway;
  }

  public DfsVIP update(OffsetDateTime update) {
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

  public DfsVIP vip(String vip) {
    this.vip = vip;
    return this;
  }

   /**
   * Get vip
   * @return vip
  **/
  @Schema(description = "")
  public String getVip() {
    return vip;
  }

  public void setVip(String vip) {
    this.vip = vip;
  }

  public DfsVIP vipMask(Long vipMask) {
    this.vipMask = vipMask;
    return this;
  }

   /**
   * Get vipMask
   * @return vipMask
  **/
  @Schema(description = "")
  public Long getVipMask() {
    return vipMask;
  }

  public void setVipMask(Long vipMask) {
    this.vipMask = vipMask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsVIP dfsVIP = (DfsVIP) o;
    return Objects.equals(this.actionStatus, dfsVIP.actionStatus) &&
        Objects.equals(this.cluster, dfsVIP.cluster) &&
        Objects.equals(this.create, dfsVIP.create) &&
        Objects.equals(this.dfsGatewayGroup, dfsVIP.dfsGatewayGroup) &&
        Objects.equals(this.dfsGatewayZone, dfsVIP.dfsGatewayZone) &&
        Objects.equals(this.id, dfsVIP.id) &&
        Objects.equals(this.primaryGateway, dfsVIP.primaryGateway) &&
        Objects.equals(this.update, dfsVIP.update) &&
        Objects.equals(this.vip, dfsVIP.vip) &&
        Objects.equals(this.vipMask, dfsVIP.vipMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, create, dfsGatewayGroup, dfsGatewayZone, id, primaryGateway, update, vip, vipMask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsVIP {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsGatewayGroup: ").append(toIndentedString(dfsGatewayGroup)).append("\n");
    sb.append("    dfsGatewayZone: ").append(toIndentedString(dfsGatewayZone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primaryGateway: ").append(toIndentedString(primaryGateway)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    vipMask: ").append(toIndentedString(vipMask)).append("\n");
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
