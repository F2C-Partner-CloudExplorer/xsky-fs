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
import java.util.ArrayList;
import java.util.List;
/**
 * CephHostReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class CephHostReq {
  @SerializedName("gateway_ips")
  private List<String> gatewayIps = null;

  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("private_ip")
  private String privateIp = null;

  @SerializedName("public_ip")
  private String publicIp = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("type")
  private String type = null;

  public CephHostReq gatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
    return this;
  }

  public CephHostReq addGatewayIpsItem(String gatewayIpsItem) {
    if (this.gatewayIps == null) {
      this.gatewayIps = new ArrayList<String>();
    }
    this.gatewayIps.add(gatewayIpsItem);
    return this;
  }

   /**
   * gateway ips for s3
   * @return gatewayIps
  **/
  @Schema(description = "gateway ips for s3")
  public List<String> getGatewayIps() {
    return gatewayIps;
  }

  public void setGatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
  }

  public CephHostReq hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * boot node host id
   * @return hostId
  **/
  @Schema(required = true, description = "boot node host id")
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public CephHostReq privateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

   /**
   * cluster private ip for internal data access
   * @return privateIp
  **/
  @Schema(description = "cluster private ip for internal data access")
  public String getPrivateIp() {
    return privateIp;
  }

  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }

  public CephHostReq publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * public ip for outside data access
   * @return publicIp
  **/
  @Schema(description = "public ip for outside data access")
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }

  public CephHostReq roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CephHostReq addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * host roles
   * @return roles
  **/
  @Schema(description = "host roles")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public CephHostReq type(String type) {
    this.type = type;
    return this;
  }

   /**
   * storage server, storage client or storage witness
   * @return type
  **/
  @Schema(description = "storage server, storage client or storage witness")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CephHostReq cephHostReq = (CephHostReq) o;
    return Objects.equals(this.gatewayIps, cephHostReq.gatewayIps) &&
        Objects.equals(this.hostId, cephHostReq.hostId) &&
        Objects.equals(this.privateIp, cephHostReq.privateIp) &&
        Objects.equals(this.publicIp, cephHostReq.publicIp) &&
        Objects.equals(this.roles, cephHostReq.roles) &&
        Objects.equals(this.type, cephHostReq.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayIps, hostId, privateIp, publicIp, roles, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CephHostReq {\n");
    
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
