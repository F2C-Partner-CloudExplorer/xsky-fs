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
 * SecuritySSHConfigReqConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SecuritySSHConfigReqConfig {
  @SerializedName("encrypted_password")
  private String encryptedPassword = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("permit_root_login")
  private Boolean permitRootLogin = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("pub_key_authentication")
  private Boolean pubKeyAuthentication = null;

  @SerializedName("rsa_key_id")
  private String rsaKeyId = null;

  @SerializedName("timeout")
  private Long timeout = null;

  @SerializedName("username")
  private String username = null;

  public SecuritySSHConfigReqConfig encryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
    return this;
  }

   /**
   * Get encryptedPassword
   * @return encryptedPassword
  **/
  @Schema(description = "")
  public String getEncryptedPassword() {
    return encryptedPassword;
  }

  public void setEncryptedPassword(String encryptedPassword) {
    this.encryptedPassword = encryptedPassword;
  }

  public SecuritySSHConfigReqConfig password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SecuritySSHConfigReqConfig permitRootLogin(Boolean permitRootLogin) {
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

  public SecuritySSHConfigReqConfig port(Long port) {
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

  public SecuritySSHConfigReqConfig pubKeyAuthentication(Boolean pubKeyAuthentication) {
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

  public SecuritySSHConfigReqConfig rsaKeyId(String rsaKeyId) {
    this.rsaKeyId = rsaKeyId;
    return this;
  }

   /**
   * Get rsaKeyId
   * @return rsaKeyId
  **/
  @Schema(description = "")
  public String getRsaKeyId() {
    return rsaKeyId;
  }

  public void setRsaKeyId(String rsaKeyId) {
    this.rsaKeyId = rsaKeyId;
  }

  public SecuritySSHConfigReqConfig timeout(Long timeout) {
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

  public SecuritySSHConfigReqConfig username(String username) {
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
    SecuritySSHConfigReqConfig securitySSHConfigReqConfig = (SecuritySSHConfigReqConfig) o;
    return Objects.equals(this.encryptedPassword, securitySSHConfigReqConfig.encryptedPassword) &&
        Objects.equals(this.password, securitySSHConfigReqConfig.password) &&
        Objects.equals(this.permitRootLogin, securitySSHConfigReqConfig.permitRootLogin) &&
        Objects.equals(this.port, securitySSHConfigReqConfig.port) &&
        Objects.equals(this.pubKeyAuthentication, securitySSHConfigReqConfig.pubKeyAuthentication) &&
        Objects.equals(this.rsaKeyId, securitySSHConfigReqConfig.rsaKeyId) &&
        Objects.equals(this.timeout, securitySSHConfigReqConfig.timeout) &&
        Objects.equals(this.username, securitySSHConfigReqConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedPassword, password, permitRootLogin, port, pubKeyAuthentication, rsaKeyId, timeout, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySSHConfigReqConfig {\n");
    
    sb.append("    encryptedPassword: ").append(toIndentedString(encryptedPassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    permitRootLogin: ").append(toIndentedString(permitRootLogin)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    pubKeyAuthentication: ").append(toIndentedString(pubKeyAuthentication)).append("\n");
    sb.append("    rsaKeyId: ").append(toIndentedString(rsaKeyId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
