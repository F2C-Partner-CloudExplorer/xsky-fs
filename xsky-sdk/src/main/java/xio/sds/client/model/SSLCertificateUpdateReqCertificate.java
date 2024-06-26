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
 * SSLCertificateUpdateReqCertificate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SSLCertificateUpdateReqCertificate {
  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("force_https")
  private Boolean forceHttps = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public SSLCertificateUpdateReqCertificate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * certificate description
   * @return description
  **/
  @Schema(description = "certificate description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SSLCertificateUpdateReqCertificate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * enabled or not
   * @return enabled
  **/
  @Schema(description = "enabled or not")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SSLCertificateUpdateReqCertificate forceHttps(Boolean forceHttps) {
    this.forceHttps = forceHttps;
    return this;
  }

   /**
   * redirect http request to https
   * @return forceHttps
  **/
  @Schema(description = "redirect http request to https")
  public Boolean isForceHttps() {
    return forceHttps;
  }

  public void setForceHttps(Boolean forceHttps) {
    this.forceHttps = forceHttps;
  }

  public SSLCertificateUpdateReqCertificate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * certificate name
   * @return name
  **/
  @Schema(description = "certificate name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SSLCertificateUpdateReqCertificate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * applied type: admin, s3, dfs_s3
   * @return type
  **/
  @Schema(description = "applied type: admin, s3, dfs_s3")
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
    SSLCertificateUpdateReqCertificate ssLCertificateUpdateReqCertificate = (SSLCertificateUpdateReqCertificate) o;
    return Objects.equals(this.description, ssLCertificateUpdateReqCertificate.description) &&
        Objects.equals(this.enabled, ssLCertificateUpdateReqCertificate.enabled) &&
        Objects.equals(this.forceHttps, ssLCertificateUpdateReqCertificate.forceHttps) &&
        Objects.equals(this.name, ssLCertificateUpdateReqCertificate.name) &&
        Objects.equals(this.type, ssLCertificateUpdateReqCertificate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, forceHttps, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLCertificateUpdateReqCertificate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    forceHttps: ").append(toIndentedString(forceHttps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
