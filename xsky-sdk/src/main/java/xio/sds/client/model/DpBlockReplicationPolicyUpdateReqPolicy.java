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
 * DpBlockReplicationPolicyUpdateReqPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockReplicationPolicyUpdateReqPolicy {
  @SerializedName("name")
  private String name = null;

  @SerializedName("timeout_seconds")
  private Long timeoutSeconds = null;

  public DpBlockReplicationPolicyUpdateReqPolicy name(String name) {
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

  public DpBlockReplicationPolicyUpdateReqPolicy timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * replication timeout seconds
   * @return timeoutSeconds
  **/
  @Schema(description = "replication timeout seconds")
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
    DpBlockReplicationPolicyUpdateReqPolicy dpBlockReplicationPolicyUpdateReqPolicy = (DpBlockReplicationPolicyUpdateReqPolicy) o;
    return Objects.equals(this.name, dpBlockReplicationPolicyUpdateReqPolicy.name) &&
        Objects.equals(this.timeoutSeconds, dpBlockReplicationPolicyUpdateReqPolicy.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockReplicationPolicyUpdateReqPolicy {\n");
    
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