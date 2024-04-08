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
import xio.sds.client.model.OspReMinutes;
import xio.sds.client.model.OspReplicationRuleStatus;
/**
 * OspReTime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspReTime {
  @SerializedName("status")
  private OspReplicationRuleStatus status = null;

  @SerializedName("time")
  private OspReMinutes time = null;

  public OspReTime status(OspReplicationRuleStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public OspReplicationRuleStatus getStatus() {
    return status;
  }

  public void setStatus(OspReplicationRuleStatus status) {
    this.status = status;
  }

  public OspReTime time(OspReMinutes time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public OspReMinutes getTime() {
    return time;
  }

  public void setTime(OspReMinutes time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspReTime ospReTime = (OspReTime) o;
    return Objects.equals(this.status, ospReTime.status) &&
        Objects.equals(this.time, ospReTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspReTime {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
