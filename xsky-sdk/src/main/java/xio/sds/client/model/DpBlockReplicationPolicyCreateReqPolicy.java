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
 * DpBlockReplicationPolicyCreateReqPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockReplicationPolicyCreateReqPolicy {
  @SerializedName("dp_site_id")
  private Long dpSiteId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("timeout_seconds")
  private Long timeoutSeconds = null;

  public DpBlockReplicationPolicyCreateReqPolicy dpSiteId(Long dpSiteId) {
    this.dpSiteId = dpSiteId;
    return this;
  }

   /**
   * protection site id
   * @return dpSiteId
  **/
  @Schema(required = true, description = "protection site id")
  public Long getDpSiteId() {
    return dpSiteId;
  }

  public void setDpSiteId(Long dpSiteId) {
    this.dpSiteId = dpSiteId;
  }

  public DpBlockReplicationPolicyCreateReqPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @Schema(required = true, description = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DpBlockReplicationPolicyCreateReqPolicy timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * replication timeout seconds
   * @return timeoutSeconds
  **/
  @Schema(required = true, description = "replication timeout seconds")
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpBlockReplicationPolicyCreateReqPolicy dpBlockReplicationPolicyCreateReqPolicy = (DpBlockReplicationPolicyCreateReqPolicy) o;
    return Objects.equals(this.dpSiteId, dpBlockReplicationPolicyCreateReqPolicy.dpSiteId) &&
        Objects.equals(this.name, dpBlockReplicationPolicyCreateReqPolicy.name) &&
        Objects.equals(this.timeoutSeconds, dpBlockReplicationPolicyCreateReqPolicy.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpSiteId, name, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockReplicationPolicyCreateReqPolicy {\n");
    
    sb.append("    dpSiteId: ").append(toIndentedString(dpSiteId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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