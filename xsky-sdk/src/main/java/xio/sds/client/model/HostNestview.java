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
 * HostNestview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class HostNestview {
  @SerializedName("admin_ip")
  private String adminIp = null;

  @SerializedName("gateway_ips")
  private String gatewayIps = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numa_nodes")
  private String numaNodes = null;

  @SerializedName("up")
  private Boolean up = null;

  public HostNestview adminIp(String adminIp) {
    this.adminIp = adminIp;
    return this;
  }

   /**
   * Get adminIp
   * @return adminIp
  **/
  @Schema(required = true, description = "")
  public String getAdminIp() {
    return adminIp;
  }

  public void setAdminIp(String adminIp) {
    this.adminIp = adminIp;
  }

  public HostNestview gatewayIps(String gatewayIps) {
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

  public HostNestview id(Long id) {
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

  public HostNestview name(String name) {
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

  public HostNestview numaNodes(String numaNodes) {
    this.numaNodes = numaNodes;
    return this;
  }

   /**
   * Get numaNodes
   * @return numaNodes
  **/
  @Schema(description = "")
  public String getNumaNodes() {
    return numaNodes;
  }

  public void setNumaNodes(String numaNodes) {
    this.numaNodes = numaNodes;
  }

  public HostNestview up(Boolean up) {
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @Schema(description = "")
  public Boolean isUp() {
    return up;
  }

  public void setUp(Boolean up) {
    this.up = up;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostNestview hostNestview = (HostNestview) o;
    return Objects.equals(this.adminIp, hostNestview.adminIp) &&
        Objects.equals(this.gatewayIps, hostNestview.gatewayIps) &&
        Objects.equals(this.id, hostNestview.id) &&
        Objects.equals(this.name, hostNestview.name) &&
        Objects.equals(this.numaNodes, hostNestview.numaNodes) &&
        Objects.equals(this.up, hostNestview.up);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminIp, gatewayIps, id, name, numaNodes, up);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostNestview {\n");
    
    sb.append("    adminIp: ").append(toIndentedString(adminIp)).append("\n");
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numaNodes: ").append(toIndentedString(numaNodes)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
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