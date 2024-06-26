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
/**
 * DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy {
  @SerializedName("cron_expr")
  private String cronExpr = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dp_gateway_id")
  private Long dpGatewayId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("retain_time")
  private String retainTime = null;

  public DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy cronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
    return this;
  }

   /**
   * Get cronExpr
   * @return cronExpr
  **/
  @Schema(required = true, description = "")
  public String getCronExpr() {
    return cronExpr;
  }

  public void setCronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
  }

  public DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy description(String description) {
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

  public DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy dpGatewayId(Long dpGatewayId) {
    this.dpGatewayId = dpGatewayId;
    return this;
  }

   /**
   * Get dpGatewayId
   * @return dpGatewayId
  **/
  @Schema(description = "")
  public Long getDpGatewayId() {
    return dpGatewayId;
  }

  public void setDpGatewayId(Long dpGatewayId) {
    this.dpGatewayId = dpGatewayId;
  }

  public DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy retainTime(String retainTime) {
    this.retainTime = retainTime;
    return this;
  }

   /**
   * Get retainTime
   * @return retainTime
  **/
  @Schema(required = true, description = "")
  public String getRetainTime() {
    return retainTime;
  }

  public void setRetainTime(String retainTime) {
    this.retainTime = retainTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy = (DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy) o;
    return Objects.equals(this.cronExpr, dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy.cronExpr) &&
        Objects.equals(this.description, dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy.description) &&
        Objects.equals(this.dpGatewayId, dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy.dpGatewayId) &&
        Objects.equals(this.name, dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy.name) &&
        Objects.equals(this.retainTime, dpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy.retainTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpr, description, dpGatewayId, name, retainTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpDfsSnapshotPolicyCreateReqDpDfsSnapshotPolicy {\n");
    
    sb.append("    cronExpr: ").append(toIndentedString(cronExpr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dpGatewayId: ").append(toIndentedString(dpGatewayId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retainTime: ").append(toIndentedString(retainTime)).append("\n");
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
