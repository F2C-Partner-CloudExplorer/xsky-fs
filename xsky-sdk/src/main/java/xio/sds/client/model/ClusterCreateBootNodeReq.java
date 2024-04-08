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
 * ClusterCreateBootNodeReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ClusterCreateBootNodeReq {
  @SerializedName("gateway_ips")
  private List<String> gatewayIps = null;

  @SerializedName("gateway_network")
  private String gatewayNetwork = null;

  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("private_ip")
  private String privateIp = null;

  @SerializedName("private_network")
  private String privateNetwork = null;

  @SerializedName("public_ip")
  private String publicIp = null;

  @SerializedName("public_network")
  private String publicNetwork = null;

  @SerializedName("roles")
  private List<String> roles = null;

  public ClusterCreateBootNodeReq gatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
    return this;
  }

  public ClusterCreateBootNodeReq addGatewayIpsItem(String gatewayIpsItem) {
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

  public ClusterCreateBootNodeReq gatewayNetwork(String gatewayNetwork) {
    this.gatewayNetwork = gatewayNetwork;
    return this;
  }

   /**
   * gateway network
   * @return gatewayNetwork
  **/
  @Schema(description = "gateway network")
  public String getGatewayNetwork() {
    return gatewayNetwork;
  }

  public void setGatewayNetwork(String gatewayNetwork) {
    this.gatewayNetwork = gatewayNetwork;
  }

  public ClusterCreateBootNodeReq hostId(Long hostId) {
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

  public ClusterCreateBootNodeReq privateIp(String privateIp) {
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

  public ClusterCreateBootNodeReq privateNetwork(String privateNetwork) {
    this.privateNetwork = privateNetwork;
    return this;
  }

   /**
   * private network
   * @return privateNetwork
  **/
  @Schema(required = true, description = "private network")
  public String getPrivateNetwork() {
    return privateNetwork;
  }

  public void setPrivateNetwork(String privateNetwork) {
    this.privateNetwork = privateNetwork;
  }

  public ClusterCreateBootNodeReq publicIp(String publicIp) {
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

  public ClusterCreateBootNodeReq publicNetwork(String publicNetwork) {
    this.publicNetwork = publicNetwork;
    return this;
  }

   /**
   * public network
   * @return publicNetwork
  **/
  @Schema(required = true, description = "public network")
  public String getPublicNetwork() {
    return publicNetwork;
  }

  public void setPublicNetwork(String publicNetwork) {
    this.publicNetwork = publicNetwork;
  }

  public ClusterCreateBootNodeReq roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public ClusterCreateBootNodeReq addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * host roles: admin,monitor,block_storage_gateway,file_storage_gateway,s3_gateway,nfs_gateway
   * @return roles
  **/
  @Schema(description = "host roles: admin,monitor,block_storage_gateway,file_storage_gateway,s3_gateway,nfs_gateway")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCreateBootNodeReq clusterCreateBootNodeReq = (ClusterCreateBootNodeReq) o;
    return Objects.equals(this.gatewayIps, clusterCreateBootNodeReq.gatewayIps) &&
        Objects.equals(this.gatewayNetwork, clusterCreateBootNodeReq.gatewayNetwork) &&
        Objects.equals(this.hostId, clusterCreateBootNodeReq.hostId) &&
        Objects.equals(this.privateIp, clusterCreateBootNodeReq.privateIp) &&
        Objects.equals(this.privateNetwork, clusterCreateBootNodeReq.privateNetwork) &&
        Objects.equals(this.publicIp, clusterCreateBootNodeReq.publicIp) &&
        Objects.equals(this.publicNetwork, clusterCreateBootNodeReq.publicNetwork) &&
        Objects.equals(this.roles, clusterCreateBootNodeReq.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayIps, gatewayNetwork, hostId, privateIp, privateNetwork, publicIp, publicNetwork, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCreateBootNodeReq {\n");
    
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
    sb.append("    gatewayNetwork: ").append(toIndentedString(gatewayNetwork)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    privateNetwork: ").append(toIndentedString(privateNetwork)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    publicNetwork: ").append(toIndentedString(publicNetwork)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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