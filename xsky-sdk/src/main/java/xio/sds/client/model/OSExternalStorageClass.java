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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.OSExternalStoragePlatform;
import xio.sds.client.model.ObjectStoragePolicy;
/**
 * OSExternalStorageClass is the model of os external storage class +X:model:generate;plur&#x3D;OSExternalStorageClasses;with_detailed +X:benchmark:
 */
@Schema(description = "OSExternalStorageClass is the model of os external storage class +X:model:generate;plur=OSExternalStorageClasses;with_detailed +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSExternalStorageClass {
  @SerializedName("Create")
  private OffsetDateTime create = null;

  @SerializedName("class_id")
  private String classId = null;

  @SerializedName("class_status")
  private String classStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("external_storage_platforms")
  private List<OSExternalStoragePlatform> externalStoragePlatforms = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("os_policy")
  private ObjectStoragePolicy osPolicy = null;

  @SerializedName("os_policy_id")
  private Long osPolicyId = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("platform_type")
  private String platformType = null;

  @SerializedName("prefix_enabled")
  private Boolean prefixEnabled = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("storage_pattern")
  private List<String> storagePattern = null;

  public OSExternalStorageClass create(OffsetDateTime create) {
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

  public OSExternalStorageClass classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @Schema(description = "")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public OSExternalStorageClass classStatus(String classStatus) {
    this.classStatus = classStatus;
    return this;
  }

   /**
   * Get classStatus
   * @return classStatus
  **/
  @Schema(description = "")
  public String getClassStatus() {
    return classStatus;
  }

  public void setClassStatus(String classStatus) {
    this.classStatus = classStatus;
  }

  public OSExternalStorageClass cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public OSExternalStorageClass description(String description) {
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

  public OSExternalStorageClass externalStoragePlatforms(List<OSExternalStoragePlatform> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
    return this;
  }

  public OSExternalStorageClass addExternalStoragePlatformsItem(OSExternalStoragePlatform externalStoragePlatformsItem) {
    if (this.externalStoragePlatforms == null) {
      this.externalStoragePlatforms = new ArrayList<OSExternalStoragePlatform>();
    }
    this.externalStoragePlatforms.add(externalStoragePlatformsItem);
    return this;
  }

   /**
   * Get externalStoragePlatforms
   * @return externalStoragePlatforms
  **/
  @Schema(description = "")
  public List<OSExternalStoragePlatform> getExternalStoragePlatforms() {
    return externalStoragePlatforms;
  }

  public void setExternalStoragePlatforms(List<OSExternalStoragePlatform> externalStoragePlatforms) {
    this.externalStoragePlatforms = externalStoragePlatforms;
  }

  public OSExternalStorageClass id(Long id) {
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

  public OSExternalStorageClass name(String name) {
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

  public OSExternalStorageClass osPolicy(ObjectStoragePolicy osPolicy) {
    this.osPolicy = osPolicy;
    return this;
  }

   /**
   * Get osPolicy
   * @return osPolicy
  **/
  @Schema(description = "")
  public ObjectStoragePolicy getOsPolicy() {
    return osPolicy;
  }

  public void setOsPolicy(ObjectStoragePolicy osPolicy) {
    this.osPolicy = osPolicy;
  }

  public OSExternalStorageClass osPolicyId(Long osPolicyId) {
    this.osPolicyId = osPolicyId;
    return this;
  }

   /**
   * Get osPolicyId
   * @return osPolicyId
  **/
  @Schema(description = "")
  public Long getOsPolicyId() {
    return osPolicyId;
  }

  public void setOsPolicyId(Long osPolicyId) {
    this.osPolicyId = osPolicyId;
  }

  public OSExternalStorageClass platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public OSExternalStorageClass platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  @Schema(description = "")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public OSExternalStorageClass prefixEnabled(Boolean prefixEnabled) {
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

  public OSExternalStorageClass status(String status) {
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

  public OSExternalStorageClass storagePattern(List<String> storagePattern) {
    this.storagePattern = storagePattern;
    return this;
  }

  public OSExternalStorageClass addStoragePatternItem(String storagePatternItem) {
    if (this.storagePattern == null) {
      this.storagePattern = new ArrayList<String>();
    }
    this.storagePattern.add(storagePatternItem);
    return this;
  }

   /**
   * Get storagePattern
   * @return storagePattern
  **/
  @Schema(description = "")
  public List<String> getStoragePattern() {
    return storagePattern;
  }

  public void setStoragePattern(List<String> storagePattern) {
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
    OSExternalStorageClass osExternalStorageClass = (OSExternalStorageClass) o;
    return Objects.equals(this.create, osExternalStorageClass.create) &&
        Objects.equals(this.classId, osExternalStorageClass.classId) &&
        Objects.equals(this.classStatus, osExternalStorageClass.classStatus) &&
        Objects.equals(this.cluster, osExternalStorageClass.cluster) &&
        Objects.equals(this.description, osExternalStorageClass.description) &&
        Objects.equals(this.externalStoragePlatforms, osExternalStorageClass.externalStoragePlatforms) &&
        Objects.equals(this.id, osExternalStorageClass.id) &&
        Objects.equals(this.name, osExternalStorageClass.name) &&
        Objects.equals(this.osPolicy, osExternalStorageClass.osPolicy) &&
        Objects.equals(this.osPolicyId, osExternalStorageClass.osPolicyId) &&
        Objects.equals(this.platform, osExternalStorageClass.platform) &&
        Objects.equals(this.platformType, osExternalStorageClass.platformType) &&
        Objects.equals(this.prefixEnabled, osExternalStorageClass.prefixEnabled) &&
        Objects.equals(this.status, osExternalStorageClass.status) &&
        Objects.equals(this.storagePattern, osExternalStorageClass.storagePattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, classId, classStatus, cluster, description, externalStoragePlatforms, id, name, osPolicy, osPolicyId, platform, platformType, prefixEnabled, status, storagePattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSExternalStorageClass {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    classStatus: ").append(toIndentedString(classStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalStoragePlatforms: ").append(toIndentedString(externalStoragePlatforms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osPolicy: ").append(toIndentedString(osPolicy)).append("\n");
    sb.append("    osPolicyId: ").append(toIndentedString(osPolicyId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    prefixEnabled: ").append(toIndentedString(prefixEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
