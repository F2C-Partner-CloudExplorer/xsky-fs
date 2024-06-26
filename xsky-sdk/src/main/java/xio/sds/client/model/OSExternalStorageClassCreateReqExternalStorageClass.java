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
import xio.sds.client.model.OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt;
import xio.sds.client.model.SliceStringField;
/**
 * OSExternalStorageClassCreateReqExternalStorageClass
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSExternalStorageClassCreateReqExternalStorageClass {
  @SerializedName("class_id")
  private String classId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("external_storage_platforms")
  private List<OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt> externalStoragePlatforms = new ArrayList<OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("os_policy_id")
  private Long osPolicyId = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("platform_type")
  private String platformType = null;

  @SerializedName("prefix_enabled")
  private Boolean prefixEnabled = null;

  @SerializedName("storage_pattern")
  private SliceStringField storagePattern = null;

  public OSExternalStorageClassCreateReqExternalStorageClass classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @Schema(required = true, description = "")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass description(String description) {
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

  public OSExternalStorageClassCreateReqExternalStorageClass externalStoragePlatforms(List<OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
    return this;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass addExternalStoragePlatformsItem(OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt externalStoragePlatformsItem) {
    this.externalStoragePlatforms.add(externalStoragePlatformsItem);
    return this;
  }

   /**
   * Get externalStoragePlatforms
   * @return externalStoragePlatforms
  **/
  @Schema(required = true, description = "")
  public List<OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt> getExternalStoragePlatforms() {
    return externalStoragePlatforms;
  }

  public void setExternalStoragePlatforms(List<OSExternalStorageClassCreateReqExternalStorageClassExternalStoragePlatformsElt> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass osPolicyId(Long osPolicyId) {
    this.osPolicyId = osPolicyId;
    return this;
  }

   /**
   * Get osPolicyId
   * @return osPolicyId
  **/
  @Schema(required = true, description = "")
  public Long getOsPolicyId() {
    return osPolicyId;
  }

  public void setOsPolicyId(Long osPolicyId) {
    this.osPolicyId = osPolicyId;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(required = true, description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  @Schema(required = true, description = "")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public OSExternalStorageClassCreateReqExternalStorageClass prefixEnabled(Boolean prefixEnabled) {
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

  public OSExternalStorageClassCreateReqExternalStorageClass storagePattern(SliceStringField storagePattern) {
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
    OSExternalStorageClassCreateReqExternalStorageClass osExternalStorageClassCreateReqExternalStorageClass = (OSExternalStorageClassCreateReqExternalStorageClass) o;
    return Objects.equals(this.classId, osExternalStorageClassCreateReqExternalStorageClass.classId) &&
        Objects.equals(this.description, osExternalStorageClassCreateReqExternalStorageClass.description) &&
        Objects.equals(this.externalStoragePlatforms, osExternalStorageClassCreateReqExternalStorageClass.externalStoragePlatforms) &&
        Objects.equals(this.name, osExternalStorageClassCreateReqExternalStorageClass.name) &&
        Objects.equals(this.osPolicyId, osExternalStorageClassCreateReqExternalStorageClass.osPolicyId) &&
        Objects.equals(this.platform, osExternalStorageClassCreateReqExternalStorageClass.platform) &&
        Objects.equals(this.platformType, osExternalStorageClassCreateReqExternalStorageClass.platformType) &&
        Objects.equals(this.prefixEnabled, osExternalStorageClassCreateReqExternalStorageClass.prefixEnabled) &&
        Objects.equals(this.storagePattern, osExternalStorageClassCreateReqExternalStorageClass.storagePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, description, externalStoragePlatforms, name, osPolicyId, platform, platformType, prefixEnabled, storagePattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSExternalStorageClassCreateReqExternalStorageClass {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalStoragePlatforms: ").append(toIndentedString(externalStoragePlatforms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osPolicyId: ").append(toIndentedString(osPolicyId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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
