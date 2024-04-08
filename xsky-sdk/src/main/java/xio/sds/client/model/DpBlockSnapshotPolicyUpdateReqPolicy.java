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
 * DpBlockSnapshotPolicyUpdateReqPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockSnapshotPolicyUpdateReqPolicy {
  @SerializedName("cron_expr")
  private String cronExpr = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("retained_max")
  private Long retainedMax = null;

  public DpBlockSnapshotPolicyUpdateReqPolicy cronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
    return this;
  }

   /**
   * cron expression
   * @return cronExpr
  **/
  @Schema(description = "cron expression")
  public String getCronExpr() {
    return cronExpr;
  }

  public void setCronExpr(String cronExpr) {
    this.cronExpr = cronExpr;
  }

  public DpBlockSnapshotPolicyUpdateReqPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @Schema(description = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DpBlockSnapshotPolicyUpdateReqPolicy retainedMax(Long retainedMax) {
    this.retainedMax = retainedMax;
    return this;
  }

   /**
   * retained max number of snapshots
   * @return retainedMax
  **/
  @Schema(description = "retained max number of snapshots")
  public Long getRetainedMax() {
    return retainedMax;
  }

  public void setRetainedMax(Long retainedMax) {
    this.retainedMax = retainedMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpBlockSnapshotPolicyUpdateReqPolicy dpBlockSnapshotPolicyUpdateReqPolicy = (DpBlockSnapshotPolicyUpdateReqPolicy) o;
    return Objects.equals(this.cronExpr, dpBlockSnapshotPolicyUpdateReqPolicy.cronExpr) &&
        Objects.equals(this.name, dpBlockSnapshotPolicyUpdateReqPolicy.name) &&
        Objects.equals(this.retainedMax, dpBlockSnapshotPolicyUpdateReqPolicy.retainedMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpr, name, retainedMax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockSnapshotPolicyUpdateReqPolicy {\n");
    
    sb.append("    cronExpr: ").append(toIndentedString(cronExpr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retainedMax: ").append(toIndentedString(retainedMax)).append("\n");
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