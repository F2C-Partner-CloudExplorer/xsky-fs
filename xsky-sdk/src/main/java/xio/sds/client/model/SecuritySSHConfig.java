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
import org.threeten.bp.OffsetDateTime;
/**
 * SecuritySSHConfig is the model of ssh config +X:model:generate;order_by&#x3D;-ID;etcd_lock
 */
@Schema(description = "SecuritySSHConfig is the model of ssh config +X:model:generate;order_by=-ID;etcd_lock")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SecuritySSHConfig {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("permit_root_login")
  private Boolean permitRootLogin = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("pub_key_authentication")
  private Boolean pubKeyAuthentication = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("timeout")
  private Long timeout = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("username")
  private String username = null;

  public SecuritySSHConfig actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public SecuritySSHConfig create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public SecuritySSHConfig id(Long id) {
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

  public SecuritySSHConfig message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SecuritySSHConfig permitRootLogin(Boolean permitRootLogin) {
    this.permitRootLogin = permitRootLogin;
    return this;
  }

   /**
   * Get permitRootLogin
   * @return permitRootLogin
  **/
  @Schema(description = "")
  public Boolean isPermitRootLogin() {
    return permitRootLogin;
  }

  public void setPermitRootLogin(Boolean permitRootLogin) {
    this.permitRootLogin = permitRootLogin;
  }

  public SecuritySSHConfig port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public SecuritySSHConfig pubKeyAuthentication(Boolean pubKeyAuthentication) {
    this.pubKeyAuthentication = pubKeyAuthentication;
    return this;
  }

   /**
   * Get pubKeyAuthentication
   * @return pubKeyAuthentication
  **/
  @Schema(description = "")
  public Boolean isPubKeyAuthentication() {
    return pubKeyAuthentication;
  }

  public void setPubKeyAuthentication(Boolean pubKeyAuthentication) {
    this.pubKeyAuthentication = pubKeyAuthentication;
  }

  public SecuritySSHConfig status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecuritySSHConfig timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public SecuritySSHConfig update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public SecuritySSHConfig username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySSHConfig securitySSHConfig = (SecuritySSHConfig) o;
    return Objects.equals(this.actionStatus, securitySSHConfig.actionStatus) &&
        Objects.equals(this.create, securitySSHConfig.create) &&
        Objects.equals(this.id, securitySSHConfig.id) &&
        Objects.equals(this.message, securitySSHConfig.message) &&
        Objects.equals(this.permitRootLogin, securitySSHConfig.permitRootLogin) &&
        Objects.equals(this.port, securitySSHConfig.port) &&
        Objects.equals(this.pubKeyAuthentication, securitySSHConfig.pubKeyAuthentication) &&
        Objects.equals(this.status, securitySSHConfig.status) &&
        Objects.equals(this.timeout, securitySSHConfig.timeout) &&
        Objects.equals(this.update, securitySSHConfig.update) &&
        Objects.equals(this.username, securitySSHConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, create, id, message, permitRootLogin, port, pubKeyAuthentication, status, timeout, update, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySSHConfig {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    permitRootLogin: ").append(toIndentedString(permitRootLogin)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    pubKeyAuthentication: ").append(toIndentedString(pubKeyAuthentication)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
