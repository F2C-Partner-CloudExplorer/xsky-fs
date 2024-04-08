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
import xio.sds.client.model.OSUserPropertiesReq;
import xio.sds.client.model.ObjectStorageKey;
/**
 * ObjectStorageUserCreateReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageUserCreateReqInfo {
  @SerializedName("bucket_quota_max_objects")
  private Long bucketQuotaMaxObjects = null;

  @SerializedName("bucket_quota_max_size")
  private Long bucketQuotaMaxSize = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("external_bucket_quota_max_objects")
  private Long externalBucketQuotaMaxObjects = null;

  @SerializedName("external_bucket_quota_max_size")
  private Long externalBucketQuotaMaxSize = null;

  @SerializedName("external_user_quota_max_objects")
  private Long externalUserQuotaMaxObjects = null;

  @SerializedName("external_user_quota_max_size")
  private Long externalUserQuotaMaxSize = null;

  @SerializedName("keys")
  private List<ObjectStorageKey> keys = null;

  @SerializedName("local_bucket_quota_max_objects")
  private Long localBucketQuotaMaxObjects = null;

  @SerializedName("local_bucket_quota_max_size")
  private Long localBucketQuotaMaxSize = null;

  @SerializedName("local_user_quota_max_objects")
  private Long localUserQuotaMaxObjects = null;

  @SerializedName("local_user_quota_max_size")
  private Long localUserQuotaMaxSize = null;

  @SerializedName("location_constraint_enabled")
  private Boolean locationConstraintEnabled = null;

  @SerializedName("max_buckets")
  private Long maxBuckets = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("op_mask")
  private String opMask = null;

  @SerializedName("policy_id")
  private Long policyId = null;

  @SerializedName("policy_polling_enabled")
  private Boolean policyPollingEnabled = null;

  @SerializedName("properties")
  private OSUserPropertiesReq properties = null;

  @SerializedName("user_quota_max_objects")
  private Long userQuotaMaxObjects = null;

  @SerializedName("user_quota_max_size")
  private Long userQuotaMaxSize = null;

  public ObjectStorageUserCreateReqInfo bucketQuotaMaxObjects(Long bucketQuotaMaxObjects) {
    this.bucketQuotaMaxObjects = bucketQuotaMaxObjects;
    return this;
  }

   /**
   * Get bucketQuotaMaxObjects
   * @return bucketQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getBucketQuotaMaxObjects() {
    return bucketQuotaMaxObjects;
  }

  public void setBucketQuotaMaxObjects(Long bucketQuotaMaxObjects) {
    this.bucketQuotaMaxObjects = bucketQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo bucketQuotaMaxSize(Long bucketQuotaMaxSize) {
    this.bucketQuotaMaxSize = bucketQuotaMaxSize;
    return this;
  }

   /**
   * Get bucketQuotaMaxSize
   * @return bucketQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getBucketQuotaMaxSize() {
    return bucketQuotaMaxSize;
  }

  public void setBucketQuotaMaxSize(Long bucketQuotaMaxSize) {
    this.bucketQuotaMaxSize = bucketQuotaMaxSize;
  }

  public ObjectStorageUserCreateReqInfo description(String description) {
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

  public ObjectStorageUserCreateReqInfo displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ObjectStorageUserCreateReqInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ObjectStorageUserCreateReqInfo externalBucketQuotaMaxObjects(Long externalBucketQuotaMaxObjects) {
    this.externalBucketQuotaMaxObjects = externalBucketQuotaMaxObjects;
    return this;
  }

   /**
   * Get externalBucketQuotaMaxObjects
   * @return externalBucketQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getExternalBucketQuotaMaxObjects() {
    return externalBucketQuotaMaxObjects;
  }

  public void setExternalBucketQuotaMaxObjects(Long externalBucketQuotaMaxObjects) {
    this.externalBucketQuotaMaxObjects = externalBucketQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo externalBucketQuotaMaxSize(Long externalBucketQuotaMaxSize) {
    this.externalBucketQuotaMaxSize = externalBucketQuotaMaxSize;
    return this;
  }

   /**
   * Get externalBucketQuotaMaxSize
   * @return externalBucketQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getExternalBucketQuotaMaxSize() {
    return externalBucketQuotaMaxSize;
  }

  public void setExternalBucketQuotaMaxSize(Long externalBucketQuotaMaxSize) {
    this.externalBucketQuotaMaxSize = externalBucketQuotaMaxSize;
  }

  public ObjectStorageUserCreateReqInfo externalUserQuotaMaxObjects(Long externalUserQuotaMaxObjects) {
    this.externalUserQuotaMaxObjects = externalUserQuotaMaxObjects;
    return this;
  }

   /**
   * Get externalUserQuotaMaxObjects
   * @return externalUserQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getExternalUserQuotaMaxObjects() {
    return externalUserQuotaMaxObjects;
  }

  public void setExternalUserQuotaMaxObjects(Long externalUserQuotaMaxObjects) {
    this.externalUserQuotaMaxObjects = externalUserQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo externalUserQuotaMaxSize(Long externalUserQuotaMaxSize) {
    this.externalUserQuotaMaxSize = externalUserQuotaMaxSize;
    return this;
  }

   /**
   * Get externalUserQuotaMaxSize
   * @return externalUserQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getExternalUserQuotaMaxSize() {
    return externalUserQuotaMaxSize;
  }

  public void setExternalUserQuotaMaxSize(Long externalUserQuotaMaxSize) {
    this.externalUserQuotaMaxSize = externalUserQuotaMaxSize;
  }

  public ObjectStorageUserCreateReqInfo keys(List<ObjectStorageKey> keys) {
    this.keys = keys;
    return this;
  }

  public ObjectStorageUserCreateReqInfo addKeysItem(ObjectStorageKey keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<ObjectStorageKey>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @Schema(description = "")
  public List<ObjectStorageKey> getKeys() {
    return keys;
  }

  public void setKeys(List<ObjectStorageKey> keys) {
    this.keys = keys;
  }

  public ObjectStorageUserCreateReqInfo localBucketQuotaMaxObjects(Long localBucketQuotaMaxObjects) {
    this.localBucketQuotaMaxObjects = localBucketQuotaMaxObjects;
    return this;
  }

   /**
   * Get localBucketQuotaMaxObjects
   * @return localBucketQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getLocalBucketQuotaMaxObjects() {
    return localBucketQuotaMaxObjects;
  }

  public void setLocalBucketQuotaMaxObjects(Long localBucketQuotaMaxObjects) {
    this.localBucketQuotaMaxObjects = localBucketQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo localBucketQuotaMaxSize(Long localBucketQuotaMaxSize) {
    this.localBucketQuotaMaxSize = localBucketQuotaMaxSize;
    return this;
  }

   /**
   * Get localBucketQuotaMaxSize
   * @return localBucketQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getLocalBucketQuotaMaxSize() {
    return localBucketQuotaMaxSize;
  }

  public void setLocalBucketQuotaMaxSize(Long localBucketQuotaMaxSize) {
    this.localBucketQuotaMaxSize = localBucketQuotaMaxSize;
  }

  public ObjectStorageUserCreateReqInfo localUserQuotaMaxObjects(Long localUserQuotaMaxObjects) {
    this.localUserQuotaMaxObjects = localUserQuotaMaxObjects;
    return this;
  }

   /**
   * Get localUserQuotaMaxObjects
   * @return localUserQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getLocalUserQuotaMaxObjects() {
    return localUserQuotaMaxObjects;
  }

  public void setLocalUserQuotaMaxObjects(Long localUserQuotaMaxObjects) {
    this.localUserQuotaMaxObjects = localUserQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo localUserQuotaMaxSize(Long localUserQuotaMaxSize) {
    this.localUserQuotaMaxSize = localUserQuotaMaxSize;
    return this;
  }

   /**
   * Get localUserQuotaMaxSize
   * @return localUserQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getLocalUserQuotaMaxSize() {
    return localUserQuotaMaxSize;
  }

  public void setLocalUserQuotaMaxSize(Long localUserQuotaMaxSize) {
    this.localUserQuotaMaxSize = localUserQuotaMaxSize;
  }

  public ObjectStorageUserCreateReqInfo locationConstraintEnabled(Boolean locationConstraintEnabled) {
    this.locationConstraintEnabled = locationConstraintEnabled;
    return this;
  }

   /**
   * Get locationConstraintEnabled
   * @return locationConstraintEnabled
  **/
  @Schema(description = "")
  public Boolean isLocationConstraintEnabled() {
    return locationConstraintEnabled;
  }

  public void setLocationConstraintEnabled(Boolean locationConstraintEnabled) {
    this.locationConstraintEnabled = locationConstraintEnabled;
  }

  public ObjectStorageUserCreateReqInfo maxBuckets(Long maxBuckets) {
    this.maxBuckets = maxBuckets;
    return this;
  }

   /**
   * Get maxBuckets
   * @return maxBuckets
  **/
  @Schema(description = "")
  public Long getMaxBuckets() {
    return maxBuckets;
  }

  public void setMaxBuckets(Long maxBuckets) {
    this.maxBuckets = maxBuckets;
  }

  public ObjectStorageUserCreateReqInfo name(String name) {
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

  public ObjectStorageUserCreateReqInfo opMask(String opMask) {
    this.opMask = opMask;
    return this;
  }

   /**
   * Get opMask
   * @return opMask
  **/
  @Schema(description = "")
  public String getOpMask() {
    return opMask;
  }

  public void setOpMask(String opMask) {
    this.opMask = opMask;
  }

  public ObjectStorageUserCreateReqInfo policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @Schema(description = "")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public ObjectStorageUserCreateReqInfo policyPollingEnabled(Boolean policyPollingEnabled) {
    this.policyPollingEnabled = policyPollingEnabled;
    return this;
  }

   /**
   * Get policyPollingEnabled
   * @return policyPollingEnabled
  **/
  @Schema(description = "")
  public Boolean isPolicyPollingEnabled() {
    return policyPollingEnabled;
  }

  public void setPolicyPollingEnabled(Boolean policyPollingEnabled) {
    this.policyPollingEnabled = policyPollingEnabled;
  }

  public ObjectStorageUserCreateReqInfo properties(OSUserPropertiesReq properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public OSUserPropertiesReq getProperties() {
    return properties;
  }

  public void setProperties(OSUserPropertiesReq properties) {
    this.properties = properties;
  }

  public ObjectStorageUserCreateReqInfo userQuotaMaxObjects(Long userQuotaMaxObjects) {
    this.userQuotaMaxObjects = userQuotaMaxObjects;
    return this;
  }

   /**
   * Get userQuotaMaxObjects
   * @return userQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getUserQuotaMaxObjects() {
    return userQuotaMaxObjects;
  }

  public void setUserQuotaMaxObjects(Long userQuotaMaxObjects) {
    this.userQuotaMaxObjects = userQuotaMaxObjects;
  }

  public ObjectStorageUserCreateReqInfo userQuotaMaxSize(Long userQuotaMaxSize) {
    this.userQuotaMaxSize = userQuotaMaxSize;
    return this;
  }

   /**
   * Get userQuotaMaxSize
   * @return userQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getUserQuotaMaxSize() {
    return userQuotaMaxSize;
  }

  public void setUserQuotaMaxSize(Long userQuotaMaxSize) {
    this.userQuotaMaxSize = userQuotaMaxSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageUserCreateReqInfo objectStorageUserCreateReqInfo = (ObjectStorageUserCreateReqInfo) o;
    return Objects.equals(this.bucketQuotaMaxObjects, objectStorageUserCreateReqInfo.bucketQuotaMaxObjects) &&
        Objects.equals(this.bucketQuotaMaxSize, objectStorageUserCreateReqInfo.bucketQuotaMaxSize) &&
        Objects.equals(this.description, objectStorageUserCreateReqInfo.description) &&
        Objects.equals(this.displayName, objectStorageUserCreateReqInfo.displayName) &&
        Objects.equals(this.email, objectStorageUserCreateReqInfo.email) &&
        Objects.equals(this.externalBucketQuotaMaxObjects, objectStorageUserCreateReqInfo.externalBucketQuotaMaxObjects) &&
        Objects.equals(this.externalBucketQuotaMaxSize, objectStorageUserCreateReqInfo.externalBucketQuotaMaxSize) &&
        Objects.equals(this.externalUserQuotaMaxObjects, objectStorageUserCreateReqInfo.externalUserQuotaMaxObjects) &&
        Objects.equals(this.externalUserQuotaMaxSize, objectStorageUserCreateReqInfo.externalUserQuotaMaxSize) &&
        Objects.equals(this.keys, objectStorageUserCreateReqInfo.keys) &&
        Objects.equals(this.localBucketQuotaMaxObjects, objectStorageUserCreateReqInfo.localBucketQuotaMaxObjects) &&
        Objects.equals(this.localBucketQuotaMaxSize, objectStorageUserCreateReqInfo.localBucketQuotaMaxSize) &&
        Objects.equals(this.localUserQuotaMaxObjects, objectStorageUserCreateReqInfo.localUserQuotaMaxObjects) &&
        Objects.equals(this.localUserQuotaMaxSize, objectStorageUserCreateReqInfo.localUserQuotaMaxSize) &&
        Objects.equals(this.locationConstraintEnabled, objectStorageUserCreateReqInfo.locationConstraintEnabled) &&
        Objects.equals(this.maxBuckets, objectStorageUserCreateReqInfo.maxBuckets) &&
        Objects.equals(this.name, objectStorageUserCreateReqInfo.name) &&
        Objects.equals(this.opMask, objectStorageUserCreateReqInfo.opMask) &&
        Objects.equals(this.policyId, objectStorageUserCreateReqInfo.policyId) &&
        Objects.equals(this.policyPollingEnabled, objectStorageUserCreateReqInfo.policyPollingEnabled) &&
        Objects.equals(this.properties, objectStorageUserCreateReqInfo.properties) &&
        Objects.equals(this.userQuotaMaxObjects, objectStorageUserCreateReqInfo.userQuotaMaxObjects) &&
        Objects.equals(this.userQuotaMaxSize, objectStorageUserCreateReqInfo.userQuotaMaxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketQuotaMaxObjects, bucketQuotaMaxSize, description, displayName, email, externalBucketQuotaMaxObjects, externalBucketQuotaMaxSize, externalUserQuotaMaxObjects, externalUserQuotaMaxSize, keys, localBucketQuotaMaxObjects, localBucketQuotaMaxSize, localUserQuotaMaxObjects, localUserQuotaMaxSize, locationConstraintEnabled, maxBuckets, name, opMask, policyId, policyPollingEnabled, properties, userQuotaMaxObjects, userQuotaMaxSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageUserCreateReqInfo {\n");
    
    sb.append("    bucketQuotaMaxObjects: ").append(toIndentedString(bucketQuotaMaxObjects)).append("\n");
    sb.append("    bucketQuotaMaxSize: ").append(toIndentedString(bucketQuotaMaxSize)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalBucketQuotaMaxObjects: ").append(toIndentedString(externalBucketQuotaMaxObjects)).append("\n");
    sb.append("    externalBucketQuotaMaxSize: ").append(toIndentedString(externalBucketQuotaMaxSize)).append("\n");
    sb.append("    externalUserQuotaMaxObjects: ").append(toIndentedString(externalUserQuotaMaxObjects)).append("\n");
    sb.append("    externalUserQuotaMaxSize: ").append(toIndentedString(externalUserQuotaMaxSize)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    localBucketQuotaMaxObjects: ").append(toIndentedString(localBucketQuotaMaxObjects)).append("\n");
    sb.append("    localBucketQuotaMaxSize: ").append(toIndentedString(localBucketQuotaMaxSize)).append("\n");
    sb.append("    localUserQuotaMaxObjects: ").append(toIndentedString(localUserQuotaMaxObjects)).append("\n");
    sb.append("    localUserQuotaMaxSize: ").append(toIndentedString(localUserQuotaMaxSize)).append("\n");
    sb.append("    locationConstraintEnabled: ").append(toIndentedString(locationConstraintEnabled)).append("\n");
    sb.append("    maxBuckets: ").append(toIndentedString(maxBuckets)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opMask: ").append(toIndentedString(opMask)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyPollingEnabled: ").append(toIndentedString(policyPollingEnabled)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    userQuotaMaxObjects: ").append(toIndentedString(userQuotaMaxObjects)).append("\n");
    sb.append("    userQuotaMaxSize: ").append(toIndentedString(userQuotaMaxSize)).append("\n");
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