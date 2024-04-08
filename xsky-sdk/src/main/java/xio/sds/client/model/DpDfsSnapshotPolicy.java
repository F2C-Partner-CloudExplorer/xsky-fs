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
/**
 * DpDfsSnapshotPolicy protects a dfs by snapshot +X:model:generate;plur&#x3D;DpDfsSnapshotPolicies;check_get&#x3D;i18n,detailed;etcd_lock&#x3D;with_get;with_detailed; +X:benchmark:
 */
@Schema(description = "DpDfsSnapshotPolicy protects a dfs by snapshot +X:model:generate;plur=DpDfsSnapshotPolicies;check_get=i18n,detailed;etcd_lock=with_get;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpDfsSnapshotPolicy {
  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("cron_expr")
  private String cronExpr = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("protected_path_num")
  private Long protectedPathNum = null;

  @SerializedName("retain_time")
  private String retainTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public DpDfsSnapshotPolicy cluster(Cluster cluster) {
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

  public DpDfsSnapshotPolicy create(OffsetDateTime create) {
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

  public DpDfsSnapshotPolicy cronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
    return this;
  }

   /**
   * Get cronExpr
   * @return cronExpr
  **/
  @Schema(description = "")
  public String getCronExpr() {
    return cronExpr;
  }

  public void setCronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
  }

  public DpDfsSnapshotPolicy description(String description) {
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

  public DpDfsSnapshotPolicy id(Long id) {
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

  public DpDfsSnapshotPolicy name(String name) {
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

  public DpDfsSnapshotPolicy protectedPathNum(Long protectedPathNum) {
    this.protectedPathNum = protectedPathNum;
    return this;
  }

   /**
   * Get protectedPathNum
   * @return protectedPathNum
  **/
  @Schema(description = "")
  public Long getProtectedPathNum() {
    return protectedPathNum;
  }

  public void setProtectedPathNum(Long protectedPathNum) {
    this.protectedPathNum = protectedPathNum;
  }

  public DpDfsSnapshotPolicy retainTime(String retainTime) {
    this.retainTime = retainTime;
    return this;
  }

   /**
   * Get retainTime
   * @return retainTime
  **/
  @Schema(description = "")
  public String getRetainTime() {
    return retainTime;
  }

  public void setRetainTime(String retainTime) {
    this.retainTime = retainTime;
  }

  public DpDfsSnapshotPolicy status(String status) {
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

  public DpDfsSnapshotPolicy update(OffsetDateTime update) {
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
    DpDfsSnapshotPolicy dpDfsSnapshotPolicy = (DpDfsSnapshotPolicy) o;
    return Objects.equals(this.cluster, dpDfsSnapshotPolicy.cluster) &&
        Objects.equals(this.create, dpDfsSnapshotPolicy.create) &&
        Objects.equals(this.cronExpr, dpDfsSnapshotPolicy.cronExpr) &&
        Objects.equals(this.description, dpDfsSnapshotPolicy.description) &&
        Objects.equals(this.id, dpDfsSnapshotPolicy.id) &&
        Objects.equals(this.name, dpDfsSnapshotPolicy.name) &&
        Objects.equals(this.protectedPathNum, dpDfsSnapshotPolicy.protectedPathNum) &&
        Objects.equals(this.retainTime, dpDfsSnapshotPolicy.retainTime) &&
        Objects.equals(this.status, dpDfsSnapshotPolicy.status) &&
        Objects.equals(this.update, dpDfsSnapshotPolicy.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, cronExpr, description, id, name, protectedPathNum, retainTime, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpDfsSnapshotPolicy {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    cronExpr: ").append(toIndentedString(cronExpr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protectedPathNum: ").append(toIndentedString(protectedPathNum)).append("\n");
    sb.append("    retainTime: ").append(toIndentedString(retainTime)).append("\n");
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