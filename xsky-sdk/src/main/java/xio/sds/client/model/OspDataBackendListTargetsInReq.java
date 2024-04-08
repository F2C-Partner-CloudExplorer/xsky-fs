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
import xio.sds.client.model.OspDataBackendPlatformType;
/**
 * OspDataBackendListTargetsInReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspDataBackendListTargetsInReq {
  @SerializedName("access_key")
  private String accessKey = null;

  @SerializedName("secret_key")
  private String secretKey = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("type")
  private OspDataBackendPlatformType type = null;

  @SerializedName("id")
  private Long id = null;

  public OspDataBackendListTargetsInReq accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public OspDataBackendListTargetsInReq secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public OspDataBackendListTargetsInReq endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public OspDataBackendListTargetsInReq type(OspDataBackendPlatformType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public OspDataBackendPlatformType getType() {
    return type;
  }

  public void setType(OspDataBackendPlatformType type) {
    this.type = type;
  }

  public OspDataBackendListTargetsInReq id(Long id) {
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
    OspDataBackendListTargetsInReq ospDataBackendListTargetsInReq = (OspDataBackendListTargetsInReq) o;
    return Objects.equals(this.accessKey, ospDataBackendListTargetsInReq.accessKey) &&
        Objects.equals(this.secretKey, ospDataBackendListTargetsInReq.secretKey) &&
        Objects.equals(this.endpoint, ospDataBackendListTargetsInReq.endpoint) &&
        Objects.equals(this.type, ospDataBackendListTargetsInReq.type) &&
        Objects.equals(this.id, ospDataBackendListTargetsInReq.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, endpoint, type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspDataBackendListTargetsInReq {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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