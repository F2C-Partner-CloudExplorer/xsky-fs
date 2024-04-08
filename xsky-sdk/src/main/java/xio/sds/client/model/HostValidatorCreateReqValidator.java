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
 * HostValidatorCreateReqValidator
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class HostValidatorCreateReqValidator {
  @SerializedName("admin_ip")
  private String adminIp = null;

  @SerializedName("check_types")
  private List<String> checkTypes = null;

  @SerializedName("cluster_id")
  private Long clusterId = null;

  @SerializedName("gateway_ips")
  private List<String> gatewayIps = null;

  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("host_roles")
  private List<String> hostRoles = null;

  @SerializedName("host_type")
  private String hostType = null;

  @SerializedName("osp_cluster_ip")
  private String ospClusterIp = null;

  @SerializedName("osp_gateway_ips")
  private List<String> ospGatewayIps = null;

  @SerializedName("private_ip")
  private String privateIp = null;

  @SerializedName("public_ip")
  private String publicIp = null;

  public HostValidatorCreateReqValidator adminIp(String adminIp) {
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

  public HostValidatorCreateReqValidator checkTypes(List<String> checkTypes) {
    this.checkTypes = checkTypes;
    return this;
  }

  public HostValidatorCreateReqValidator addCheckTypesItem(String checkTypesItem) {
    if (this.checkTypes == null) {
      this.checkTypes = new ArrayList<String>();
    }
    this.checkTypes.add(checkTypesItem);
    return this;
  }

   /**
   * Get checkTypes
   * @return checkTypes
  **/
  @Schema(description = "")
  public List<String> getCheckTypes() {
    return checkTypes;
  }

  public void setCheckTypes(List<String> checkTypes) {
    this.checkTypes = checkTypes;
  }

  public HostValidatorCreateReqValidator clusterId(Long clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public Long getClusterId() {
    return clusterId;
  }

  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }

  public HostValidatorCreateReqValidator gatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
    return this;
  }

  public HostValidatorCreateReqValidator addGatewayIpsItem(String gatewayIpsItem) {
    if (this.gatewayIps == null) {
      this.gatewayIps = new ArrayList<String>();
    }
    this.gatewayIps.add(gatewayIpsItem);
    return this;
  }

   /**
   * Get gatewayIps
   * @return gatewayIps
  **/
  @Schema(description = "")
  public List<String> getGatewayIps() {
    return gatewayIps;
  }

  public void setGatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
  }

  public HostValidatorCreateReqValidator hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @Schema(description = "")
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public HostValidatorCreateReqValidator hostRoles(List<String> hostRoles) {
    this.hostRoles = hostRoles;
    return this;
  }

  public HostValidatorCreateReqValidator addHostRolesItem(String hostRolesItem) {
    if (this.hostRoles == null) {
      this.hostRoles = new ArrayList<String>();
    }
    this.hostRoles.add(hostRolesItem);
    return this;
  }

   /**
   * Get hostRoles
   * @return hostRoles
  **/
  @Schema(description = "")
  public List<String> getHostRoles() {
    return hostRoles;
  }

  public void setHostRoles(List<String> hostRoles) {
    this.hostRoles = hostRoles;
  }

  public HostValidatorCreateReqValidator hostType(String hostType) {
    this.hostType = hostType;
    return this;
  }

   /**
   * Get hostType
   * @return hostType
  **/
  @Schema(description = "")
  public String getHostType() {
    return hostType;
  }

  public void setHostType(String hostType) {
    this.hostType = hostType;
  }

  public HostValidatorCreateReqValidator ospClusterIp(String ospClusterIp) {
    this.ospClusterIp = ospClusterIp;
    return this;
  }

   /**
   * Get ospClusterIp
   * @return ospClusterIp
  **/
  @Schema(description = "")
  public String getOspClusterIp() {
    return ospClusterIp;
  }

  public void setOspClusterIp(String ospClusterIp) {
    this.ospClusterIp = ospClusterIp;
  }

  public HostValidatorCreateReqValidator ospGatewayIps(List<String> ospGatewayIps) {
    this.ospGatewayIps = ospGatewayIps;
    return this;
  }

  public HostValidatorCreateReqValidator addOspGatewayIpsItem(String ospGatewayIpsItem) {
    if (this.ospGatewayIps == null) {
      this.ospGatewayIps = new ArrayList<String>();
    }
    this.ospGatewayIps.add(ospGatewayIpsItem);
    return this;
  }

   /**
   * Get ospGatewayIps
   * @return ospGatewayIps
  **/
  @Schema(description = "")
  public List<String> getOspGatewayIps() {
    return ospGatewayIps;
  }

  public void setOspGatewayIps(List<String> ospGatewayIps) {
    this.ospGatewayIps = ospGatewayIps;
  }

  public HostValidatorCreateReqValidator privateIp(String privateIp) {
    this.privateIp = privateIp;
    return this;
  }

   /**
   * Get privateIp
   * @return privateIp
  **/
  @Schema(description = "")
  public String getPrivateIp() {
    return privateIp;
  }

  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }

  public HostValidatorCreateReqValidator publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * Get publicIp
   * @return publicIp
  **/
  @Schema(description = "")
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostValidatorCreateReqValidator hostValidatorCreateReqValidator = (HostValidatorCreateReqValidator) o;
    return Objects.equals(this.adminIp, hostValidatorCreateReqValidator.adminIp) &&
        Objects.equals(this.checkTypes, hostValidatorCreateReqValidator.checkTypes) &&
        Objects.equals(this.clusterId, hostValidatorCreateReqValidator.clusterId) &&
        Objects.equals(this.gatewayIps, hostValidatorCreateReqValidator.gatewayIps) &&
        Objects.equals(this.hostId, hostValidatorCreateReqValidator.hostId) &&
        Objects.equals(this.hostRoles, hostValidatorCreateReqValidator.hostRoles) &&
        Objects.equals(this.hostType, hostValidatorCreateReqValidator.hostType) &&
        Objects.equals(this.ospClusterIp, hostValidatorCreateReqValidator.ospClusterIp) &&
        Objects.equals(this.ospGatewayIps, hostValidatorCreateReqValidator.ospGatewayIps) &&
        Objects.equals(this.privateIp, hostValidatorCreateReqValidator.privateIp) &&
        Objects.equals(this.publicIp, hostValidatorCreateReqValidator.publicIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminIp, checkTypes, clusterId, gatewayIps, hostId, hostRoles, hostType, ospClusterIp, ospGatewayIps, privateIp, publicIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostValidatorCreateReqValidator {\n");
    
    sb.append("    adminIp: ").append(toIndentedString(adminIp)).append("\n");
    sb.append("    checkTypes: ").append(toIndentedString(checkTypes)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    hostRoles: ").append(toIndentedString(hostRoles)).append("\n");
    sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
    sb.append("    ospClusterIp: ").append(toIndentedString(ospClusterIp)).append("\n");
    sb.append("    ospGatewayIps: ").append(toIndentedString(ospGatewayIps)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
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