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
 * HostUpdateReqHost
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class HostUpdateReqHost {
  @SerializedName("description")
  private String description = null;

  @SerializedName("gateway_ips")
  private List<String> gatewayIps = null;

  @SerializedName("roles")
  private List<String> roles = null;

  public HostUpdateReqHost description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HostUpdateReqHost gatewayIps(List<String> gatewayIps) {
    this.gatewayIps = gatewayIps;
    return this;
  }

  public HostUpdateReqHost addGatewayIpsItem(String gatewayIpsItem) {
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

  public HostUpdateReqHost roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public HostUpdateReqHost addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
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
    HostUpdateReqHost hostUpdateReqHost = (HostUpdateReqHost) o;
    return Objects.equals(this.description, hostUpdateReqHost.description) &&
        Objects.equals(this.gatewayIps, hostUpdateReqHost.gatewayIps) &&
        Objects.equals(this.roles, hostUpdateReqHost.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gatewayIps, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostUpdateReqHost {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gatewayIps: ").append(toIndentedString(gatewayIps)).append("\n");
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
