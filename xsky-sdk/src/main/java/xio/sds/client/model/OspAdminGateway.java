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
 * OspAdminGateway
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspAdminGateway {
  @SerializedName("s3_port")
  private Long s3Port = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("update")
  private String update = null;

  @SerializedName("xms_port")
  private Long xmsPort = null;

  @SerializedName("gateway_ip")
  private String gatewayIp = null;

  @SerializedName("admin_ip")
  private String adminIp = null;

  public OspAdminGateway s3Port(Long s3Port) {
    this.s3Port = s3Port;
    return this;
  }

   /**
   * Get s3Port
   * @return s3Port
  **/
  @Schema(description = "")
  public Long getS3Port() {
    return s3Port;
  }

  public void setS3Port(Long s3Port) {
    this.s3Port = s3Port;
  }

  public OspAdminGateway name(String name) {
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

  public OspAdminGateway create(String create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public OspAdminGateway update(String update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public String getUpdate() {
    return update;
  }

  public void setUpdate(String update) {
    this.update = update;
  }

  public OspAdminGateway xmsPort(Long xmsPort) {
    this.xmsPort = xmsPort;
    return this;
  }

   /**
   * Get xmsPort
   * @return xmsPort
  **/
  @Schema(description = "")
  public Long getXmsPort() {
    return xmsPort;
  }

  public void setXmsPort(Long xmsPort) {
    this.xmsPort = xmsPort;
  }

  public OspAdminGateway gatewayIp(String gatewayIp) {
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

  public OspAdminGateway adminIp(String adminIp) {
    this.adminIp = adminIp;
    return this;
  }

   /**
   * Get adminIp
   * @return adminIp
  **/
  @Schema(description = "")
  public String getAdminIp() {
    return adminIp;
  }

  public void setAdminIp(String adminIp) {
    this.adminIp = adminIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspAdminGateway ospAdminGateway = (OspAdminGateway) o;
    return Objects.equals(this.s3Port, ospAdminGateway.s3Port) &&
        Objects.equals(this.name, ospAdminGateway.name) &&
        Objects.equals(this.create, ospAdminGateway.create) &&
        Objects.equals(this.update, ospAdminGateway.update) &&
        Objects.equals(this.xmsPort, ospAdminGateway.xmsPort) &&
        Objects.equals(this.gatewayIp, ospAdminGateway.gatewayIp) &&
        Objects.equals(this.adminIp, ospAdminGateway.adminIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3Port, name, create, update, xmsPort, gatewayIp, adminIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspAdminGateway {\n");
    
    sb.append("    s3Port: ").append(toIndentedString(s3Port)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    xmsPort: ").append(toIndentedString(xmsPort)).append("\n");
    sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
    sb.append("    adminIp: ").append(toIndentedString(adminIp)).append("\n");
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
