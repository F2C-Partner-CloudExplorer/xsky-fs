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
 * OspUserQuota
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspUserQuota {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("local_max_objects")
  private Long localMaxObjects = null;

  @SerializedName("max_objects")
  private Long maxObjects = null;

  @SerializedName("external_max_objects")
  private Long externalMaxObjects = null;

  @SerializedName("local_max_size")
  private Long localMaxSize = null;

  @SerializedName("max_size")
  private Long maxSize = null;

  @SerializedName("external_max_size")
  private Long externalMaxSize = null;

  public OspUserQuota enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public OspUserQuota localMaxObjects(Long localMaxObjects) {
    this.localMaxObjects = localMaxObjects;
    return this;
  }

   /**
   * Get localMaxObjects
   * @return localMaxObjects
  **/
  @Schema(description = "")
  public Long getLocalMaxObjects() {
    return localMaxObjects;
  }

  public void setLocalMaxObjects(Long localMaxObjects) {
    this.localMaxObjects = localMaxObjects;
  }

  public OspUserQuota maxObjects(Long maxObjects) {
    this.maxObjects = maxObjects;
    return this;
  }

   /**
   * Get maxObjects
   * @return maxObjects
  **/
  @Schema(description = "")
  public Long getMaxObjects() {
    return maxObjects;
  }

  public void setMaxObjects(Long maxObjects) {
    this.maxObjects = maxObjects;
  }

  public OspUserQuota externalMaxObjects(Long externalMaxObjects) {
    this.externalMaxObjects = externalMaxObjects;
    return this;
  }

   /**
   * Get externalMaxObjects
   * @return externalMaxObjects
  **/
  @Schema(description = "")
  public Long getExternalMaxObjects() {
    return externalMaxObjects;
  }

  public void setExternalMaxObjects(Long externalMaxObjects) {
    this.externalMaxObjects = externalMaxObjects;
  }

  public OspUserQuota localMaxSize(Long localMaxSize) {
    this.localMaxSize = localMaxSize;
    return this;
  }

   /**
   * Get localMaxSize
   * @return localMaxSize
  **/
  @Schema(description = "")
  public Long getLocalMaxSize() {
    return localMaxSize;
  }

  public void setLocalMaxSize(Long localMaxSize) {
    this.localMaxSize = localMaxSize;
  }

  public OspUserQuota maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public OspUserQuota externalMaxSize(Long externalMaxSize) {
    this.externalMaxSize = externalMaxSize;
    return this;
  }

   /**
   * Get externalMaxSize
   * @return externalMaxSize
  **/
  @Schema(description = "")
  public Long getExternalMaxSize() {
    return externalMaxSize;
  }

  public void setExternalMaxSize(Long externalMaxSize) {
    this.externalMaxSize = externalMaxSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspUserQuota ospUserQuota = (OspUserQuota) o;
    return Objects.equals(this.enabled, ospUserQuota.enabled) &&
        Objects.equals(this.localMaxObjects, ospUserQuota.localMaxObjects) &&
        Objects.equals(this.maxObjects, ospUserQuota.maxObjects) &&
        Objects.equals(this.externalMaxObjects, ospUserQuota.externalMaxObjects) &&
        Objects.equals(this.localMaxSize, ospUserQuota.localMaxSize) &&
        Objects.equals(this.maxSize, ospUserQuota.maxSize) &&
        Objects.equals(this.externalMaxSize, ospUserQuota.externalMaxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, localMaxObjects, maxObjects, externalMaxObjects, localMaxSize, maxSize, externalMaxSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspUserQuota {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    localMaxObjects: ").append(toIndentedString(localMaxObjects)).append("\n");
    sb.append("    maxObjects: ").append(toIndentedString(maxObjects)).append("\n");
    sb.append("    externalMaxObjects: ").append(toIndentedString(externalMaxObjects)).append("\n");
    sb.append("    localMaxSize: ").append(toIndentedString(localMaxSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    externalMaxSize: ").append(toIndentedString(externalMaxSize)).append("\n");
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
