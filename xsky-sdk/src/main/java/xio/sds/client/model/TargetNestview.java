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
 * TargetNestview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class TargetNestview {
  @SerializedName("gateway_ips")
  private String gatewayIps = null;

  @SerializedName("id")
  private Long id = null;

  public TargetNestview gatewayIps(String gatewayIps) {
    this.gatewayIps = gatewayIps;
    return this;
  }

   /**
   * Get gatewayIps
   * @return gatewayIps
  **/
  @Schema(description = "")
  public String getGatewayIps() {
    return gatewayIps;
  }

  public void setGatewayIps(String gatewayIps) {
    this.gatewayIps = gatewayIps;
  }

  public TargetNestview id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetNestview targetNestview = (TargetNestview) o;
    return Objects.equals(this.gatewayIps, targetNestview.gatewayIps) &&
        Objects.equals(this.id, targetNestview.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayIps, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetNestview {\n");
    
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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