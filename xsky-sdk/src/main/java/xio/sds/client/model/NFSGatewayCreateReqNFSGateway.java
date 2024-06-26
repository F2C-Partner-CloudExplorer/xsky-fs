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
 * NFSGatewayCreateReqNFSGateway
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NFSGatewayCreateReqNFSGateway {
  @SerializedName("description")
  private String description = null;

  @SerializedName("gateway_ip")
  private String gatewayIp = null;

  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("osp_zone_id")
  private Long ospZoneId = null;

  @SerializedName("port")
  private Long port = null;

  public NFSGatewayCreateReqNFSGateway description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NFSGatewayCreateReqNFSGateway gatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
    return this;
  }

   /**
   * Get gatewayIp
   * @return gatewayIp
  **/
  @Schema(description = "")
  public String getGatewayIp() {
    return gatewayIp;
  }

  public void setGatewayIp(String gatewayIp) {
    this.gatewayIp = gatewayIp;
  }

  public NFSGatewayCreateReqNFSGateway hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @Schema(required = true, description = "")
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public NFSGatewayCreateReqNFSGateway name(String name) {
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

  public NFSGatewayCreateReqNFSGateway ospZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
    return this;
  }

   /**
   * Get ospZoneId
   * @return ospZoneId
  **/
  @Schema(description = "")
  public Long getOspZoneId() {
    return ospZoneId;
  }

  public void setOspZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
  }

  public NFSGatewayCreateReqNFSGateway port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(required = true, description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFSGatewayCreateReqNFSGateway nfSGatewayCreateReqNFSGateway = (NFSGatewayCreateReqNFSGateway) o;
    return Objects.equals(this.description, nfSGatewayCreateReqNFSGateway.description) &&
        Objects.equals(this.gatewayIp, nfSGatewayCreateReqNFSGateway.gatewayIp) &&
        Objects.equals(this.hostId, nfSGatewayCreateReqNFSGateway.hostId) &&
        Objects.equals(this.name, nfSGatewayCreateReqNFSGateway.name) &&
        Objects.equals(this.ospZoneId, nfSGatewayCreateReqNFSGateway.ospZoneId) &&
        Objects.equals(this.port, nfSGatewayCreateReqNFSGateway.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gatewayIp, hostId, name, ospZoneId, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFSGatewayCreateReqNFSGateway {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ospZoneId: ").append(toIndentedString(ospZoneId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
