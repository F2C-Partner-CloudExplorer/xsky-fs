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
import xio.sds.client.model.Cluster;
import xio.sds.client.model.DpGatewayNestview;
import xio.sds.client.model.DpSiteNestview;
/**
 * DpBlockBackupPolicy protects a block volume by backup snapshot to remote site
 */
@Schema(description = "DpBlockBackupPolicy protects a block volume by backup snapshot to remote site")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockBackupPolicy {
  @SerializedName("block_volume_num")
  private Long blockVolumeNum = null;

  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dp_gateway")
  private DpGatewayNestview dpGateway = null;

  @SerializedName("dp_site")
  private DpSiteNestview dpSite = null;

  @SerializedName("encrypted")
  private Boolean encrypted = null;

  @SerializedName("full_cron_expr")
  private String fullCronExpr = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("inc_cron_expr")
  private String incCronExpr = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("retained_max")
  private Long retainedMax = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public DpBlockBackupPolicy blockVolumeNum(Long blockVolumeNum) {
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

  public DpBlockBackupPolicy cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public DpBlockBackupPolicy create(OffsetDateTime create) {
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

  public DpBlockBackupPolicy dpGateway(DpGatewayNestview dpGateway) {
    this.dpGateway = dpGateway;
    return this;
  }

   /**
   * Get dpGateway
   * @return dpGateway
  **/
  @Schema(description = "")
  public DpGatewayNestview getDpGateway() {
    return dpGateway;
  }

  public void setDpGateway(DpGatewayNestview dpGateway) {
    this.dpGateway = dpGateway;
  }

  public DpBlockBackupPolicy dpSite(DpSiteNestview dpSite) {
    this.dpSite = dpSite;
    return this;
  }

   /**
   * Get dpSite
   * @return dpSite
  **/
  @Schema(description = "")
  public DpSiteNestview getDpSite() {
    return dpSite;
  }

  public void setDpSite(DpSiteNestview dpSite) {
    this.dpSite = dpSite;
  }

  public DpBlockBackupPolicy encrypted(Boolean encrypted) {
    this.encrypted = encrypted;
    return this;
  }

   /**
   * Get encrypted
   * @return encrypted
  **/
  @Schema(description = "")
  public Boolean isEncrypted() {
    return encrypted;
  }

  public void setEncrypted(Boolean encrypted) {
    this.encrypted = encrypted;
  }

  public DpBlockBackupPolicy fullCronExpr(String fullCronExpr) {
    this.fullCronExpr = fullCronExpr;
    return this;
  }

   /**
   * Get fullCronExpr
   * @return fullCronExpr
  **/
  @Schema(description = "")
  public String getFullCronExpr() {
    return fullCronExpr;
  }

  public void setFullCronExpr(String fullCronExpr) {
    this.fullCronExpr = fullCronExpr;
  }

  public DpBlockBackupPolicy id(Long id) {
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

  public DpBlockBackupPolicy incCronExpr(String incCronExpr) {
    this.incCronExpr = incCronExpr;
    return this;
  }

   /**
   * Get incCronExpr
   * @return incCronExpr
  **/
  @Schema(description = "")
  public String getIncCronExpr() {
    return incCronExpr;
  }

  public void setIncCronExpr(String incCronExpr) {
    this.incCronExpr = incCronExpr;
  }

  public DpBlockBackupPolicy name(String name) {
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

  public DpBlockBackupPolicy retainedMax(Long retainedMax) {
    this.retainedMax = retainedMax;
    return this;
  }

   /**
   * Get retainedMax
   * @return retainedMax
  **/
  @Schema(description = "")
  public Long getRetainedMax() {
    return retainedMax;
  }

  public void setRetainedMax(Long retainedMax) {
    this.retainedMax = retainedMax;
  }

  public DpBlockBackupPolicy status(String status) {
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

  public DpBlockBackupPolicy update(OffsetDateTime update) {
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
    DpBlockBackupPolicy dpBlockBackupPolicy = (DpBlockBackupPolicy) o;
    return Objects.equals(this.blockVolumeNum, dpBlockBackupPolicy.blockVolumeNum) &&
        Objects.equals(this.cluster, dpBlockBackupPolicy.cluster) &&
        Objects.equals(this.create, dpBlockBackupPolicy.create) &&
        Objects.equals(this.dpGateway, dpBlockBackupPolicy.dpGateway) &&
        Objects.equals(this.dpSite, dpBlockBackupPolicy.dpSite) &&
        Objects.equals(this.encrypted, dpBlockBackupPolicy.encrypted) &&
        Objects.equals(this.fullCronExpr, dpBlockBackupPolicy.fullCronExpr) &&
        Objects.equals(this.id, dpBlockBackupPolicy.id) &&
        Objects.equals(this.incCronExpr, dpBlockBackupPolicy.incCronExpr) &&
        Objects.equals(this.name, dpBlockBackupPolicy.name) &&
        Objects.equals(this.retainedMax, dpBlockBackupPolicy.retainedMax) &&
        Objects.equals(this.status, dpBlockBackupPolicy.status) &&
        Objects.equals(this.update, dpBlockBackupPolicy.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVolumeNum, cluster, create, dpGateway, dpSite, encrypted, fullCronExpr, id, incCronExpr, name, retainedMax, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockBackupPolicy {\n");
    
    sb.append("    blockVolumeNum: ").append(toIndentedString(blockVolumeNum)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dpGateway: ").append(toIndentedString(dpGateway)).append("\n");
    sb.append("    dpSite: ").append(toIndentedString(dpSite)).append("\n");
    sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
    sb.append("    fullCronExpr: ").append(toIndentedString(fullCronExpr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incCronExpr: ").append(toIndentedString(incCronExpr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retainedMax: ").append(toIndentedString(retainedMax)).append("\n");
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
