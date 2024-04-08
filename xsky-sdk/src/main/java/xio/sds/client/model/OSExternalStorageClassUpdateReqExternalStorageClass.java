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
import xio.sds.client.model.OSExternalStoragePlatformInfo;
import xio.sds.client.model.SliceStringField;
/**
 * OSExternalStorageClassUpdateReqExternalStorageClass
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSExternalStorageClassUpdateReqExternalStorageClass {
  @SerializedName("description")
  private String description = null;

  @SerializedName("external_storage_platforms")
  private List<OSExternalStoragePlatformInfo> externalStoragePlatforms = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("prefix_enabled")
  private Boolean prefixEnabled = null;

  @SerializedName("storage_pattern")
  private SliceStringField storagePattern = null;

  public OSExternalStorageClassUpdateReqExternalStorageClass description(String description) {
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

  public OSExternalStorageClassUpdateReqExternalStorageClass externalStoragePlatforms(List<OSExternalStoragePlatformInfo> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
    return this;
  }

  public OSExternalStorageClassUpdateReqExternalStorageClass addExternalStoragePlatformsItem(OSExternalStoragePlatformInfo externalStoragePlatformsItem) {
    if (this.externalStoragePlatforms == null) {
      this.externalStoragePlatforms = new ArrayList<OSExternalStoragePlatformInfo>();
    }
    this.externalStoragePlatforms.add(externalStoragePlatformsItem);
    return this;
  }

   /**
   * Get externalStoragePlatforms
   * @return externalStoragePlatforms
  **/
  @Schema(description = "")
  public List<OSExternalStoragePlatformInfo> getExternalStoragePlatforms() {
    return externalStoragePlatforms;
  }

  public void setExternalStoragePlatforms(List<OSExternalStoragePlatformInfo> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
  }

  public OSExternalStorageClassUpdateReqExternalStorageClass name(String name) {
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

  public OSExternalStorageClassUpdateReqExternalStorageClass prefixEnabled(Boolean prefixEnabled) {
    this.prefixEnabled = prefixEnabled;
    return this;
  }

   /**
   * Get prefixEnabled
   * @return prefixEnabled
  **/
  @Schema(description = "")
  public Boolean isPrefixEnabled() {
    return prefixEnabled;
  }

  public void setPrefixEnabled(Boolean prefixEnabled) {
    this.prefixEnabled = prefixEnabled;
  }

  public OSExternalStorageClassUpdateReqExternalStorageClass storagePattern(SliceStringField storagePattern) {
    this.storagePattern = storagePattern;
    return this;
  }

   /**
   * Get storagePattern
   * @return storagePattern
  **/
  @Schema(description = "")
  public SliceStringField getStoragePattern() {
    return storagePattern;
  }

  public void setStoragePattern(SliceStringField storagePattern) {
    this.storagePattern = storagePattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSExternalStorageClassUpdateReqExternalStorageClass osExternalStorageClassUpdateReqExternalStorageClass = (OSExternalStorageClassUpdateReqExternalStorageClass) o;
    return Objects.equals(this.description, osExternalStorageClassUpdateReqExternalStorageClass.description) &&
        Objects.equals(this.externalStoragePlatforms, osExternalStorageClassUpdateReqExternalStorageClass.externalStoragePlatforms) &&
        Objects.equals(this.name, osExternalStorageClassUpdateReqExternalStorageClass.name) &&
        Objects.equals(this.prefixEnabled, osExternalStorageClassUpdateReqExternalStorageClass.prefixEnabled) &&
        Objects.equals(this.storagePattern, osExternalStorageClassUpdateReqExternalStorageClass.storagePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, externalStoragePlatforms, name, prefixEnabled, storagePattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSExternalStorageClassUpdateReqExternalStorageClass {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalStoragePlatforms: ").append(toIndentedString(externalStoragePlatforms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefixEnabled: ").append(toIndentedString(prefixEnabled)).append("\n");
    sb.append("    storagePattern: ").append(toIndentedString(storagePattern)).append("\n");
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
