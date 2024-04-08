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
import xio.sds.client.model.BucketFlagReq;
import xio.sds.client.model.OSBucketQos;
/**
 * ObjectStorageBucketUpdateReqBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageBucketUpdateReqBucket {
  @SerializedName("all_user_permission")
  private String allUserPermission = null;

  @SerializedName("auth_user_permission")
  private String authUserPermission = null;

  @SerializedName("delete_archive_storage_class")
  private String deleteArchiveStorageClass = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("external_quota_max_objects")
  private Long externalQuotaMaxObjects = null;

  @SerializedName("external_quota_max_size")
  private Long externalQuotaMaxSize = null;

  @SerializedName("flag")
  private BucketFlagReq flag = null;

  @SerializedName("local_quota_max_objects")
  private Long localQuotaMaxObjects = null;

  @SerializedName("local_quota_max_size")
  private Long localQuotaMaxSize = null;

  @SerializedName("log_delivery_permission")
  private String logDeliveryPermission = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("owner_permission")
  private String ownerPermission = null;

  @SerializedName("qos")
  private OSBucketQos qos = null;

  @SerializedName("quota_max_objects")
  private Long quotaMaxObjects = null;

  @SerializedName("quota_max_size")
  private Long quotaMaxSize = null;

  @SerializedName("restore_days")
  private Long restoreDays = null;

  public ObjectStorageBucketUpdateReqBucket allUserPermission(String allUserPermission) {
    this.allUserPermission = allUserPermission;
    return this;
  }

   /**
   * Get allUserPermission
   * @return allUserPermission
  **/
  @Schema(description = "")
  public String getAllUserPermission() {
    return allUserPermission;
  }

  public void setAllUserPermission(String allUserPermission) {
    this.allUserPermission = allUserPermission;
  }

  public ObjectStorageBucketUpdateReqBucket authUserPermission(String authUserPermission) {
    this.authUserPermission = authUserPermission;
    return this;
  }

   /**
   * Get authUserPermission
   * @return authUserPermission
  **/
  @Schema(description = "")
  public String getAuthUserPermission() {
    return authUserPermission;
  }

  public void setAuthUserPermission(String authUserPermission) {
    this.authUserPermission = authUserPermission;
  }

  public ObjectStorageBucketUpdateReqBucket deleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
    return this;
  }

   /**
   * Get deleteArchiveStorageClass
   * @return deleteArchiveStorageClass
  **/
  @Schema(description = "")
  public String getDeleteArchiveStorageClass() {
    return deleteArchiveStorageClass;
  }

  public void setDeleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
  }

  public ObjectStorageBucketUpdateReqBucket description(String description) {
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

  public ObjectStorageBucketUpdateReqBucket externalQuotaMaxObjects(Long externalQuotaMaxObjects) {
    this.externalQuotaMaxObjects = externalQuotaMaxObjects;
    return this;
  }

   /**
   * Get externalQuotaMaxObjects
   * @return externalQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getExternalQuotaMaxObjects() {
    return externalQuotaMaxObjects;
  }

  public void setExternalQuotaMaxObjects(Long externalQuotaMaxObjects) {
    this.externalQuotaMaxObjects = externalQuotaMaxObjects;
  }

  public ObjectStorageBucketUpdateReqBucket externalQuotaMaxSize(Long externalQuotaMaxSize) {
    this.externalQuotaMaxSize = externalQuotaMaxSize;
    return this;
  }

   /**
   * Get externalQuotaMaxSize
   * @return externalQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getExternalQuotaMaxSize() {
    return externalQuotaMaxSize;
  }

  public void setExternalQuotaMaxSize(Long externalQuotaMaxSize) {
    this.externalQuotaMaxSize = externalQuotaMaxSize;
  }

  public ObjectStorageBucketUpdateReqBucket flag(BucketFlagReq flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @Schema(description = "")
  public BucketFlagReq getFlag() {
    return flag;
  }

  public void setFlag(BucketFlagReq flag) {
    this.flag = flag;
  }

  public ObjectStorageBucketUpdateReqBucket localQuotaMaxObjects(Long localQuotaMaxObjects) {
    this.localQuotaMaxObjects = localQuotaMaxObjects;
    return this;
  }

   /**
   * Get localQuotaMaxObjects
   * @return localQuotaMaxObjects
  **/
  @Schema(description = "")
  public Long getLocalQuotaMaxObjects() {
    return localQuotaMaxObjects;
  }

  public void setLocalQuotaMaxObjects(Long localQuotaMaxObjects) {
    this.localQuotaMaxObjects = localQuotaMaxObjects;
  }

  public ObjectStorageBucketUpdateReqBucket localQuotaMaxSize(Long localQuotaMaxSize) {
    this.localQuotaMaxSize = localQuotaMaxSize;
    return this;
  }

   /**
   * Get localQuotaMaxSize
   * @return localQuotaMaxSize
  **/
  @Schema(description = "")
  public Long getLocalQuotaMaxSize() {
    return localQuotaMaxSize;
  }

  public void setLocalQuotaMaxSize(Long localQuotaMaxSize) {
    this.localQuotaMaxSize = localQuotaMaxSize;
  }

  public ObjectStorageBucketUpdateReqBucket logDeliveryPermission(String logDeliveryPermission) {
    this.logDeliveryPermission = logDeliveryPermission;
    return this;
  }

   /**
   * Get logDeliveryPermission
   * @return logDeliveryPermission
  **/
  @Schema(description = "")
  public String getLogDeliveryPermission() {
    return logDeliveryPermission;
  }

  public void setLogDeliveryPermission(String logDeliveryPermission) {
    this.logDeliveryPermission = logDeliveryPermission;
  }

  public ObjectStorageBucketUpdateReqBucket ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @Schema(description = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ObjectStorageBucketUpdateReqBucket ownerPermission(String ownerPermission) {
    this.ownerPermission = ownerPermission;
    return this;
  }

   /**
   * Get ownerPermission
   * @return ownerPermission
  **/
  @Schema(description = "")
  public String getOwnerPermission() {
    return ownerPermission;
  }

  public void setOwnerPermission(String ownerPermission) {
    this.ownerPermission = ownerPermission;
  }

  public ObjectStorageBucketUpdateReqBucket qos(OSBucketQos qos) {
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @Schema(description = "")
  public OSBucketQos getQos() {
    return qos;
  }

  public void setQos(OSBucketQos qos) {
    this.qos = qos;
  }

  public ObjectStorageBucketUpdateReqBucket quotaMaxObjects(Long quotaMaxObjects) {
    this.quotaMaxObjects = quotaMaxObjects;
    return this;
  }

   /**
   * Get quotaMaxObjects
   * @return quotaMaxObjects
  **/
  @Schema(description = "")
  public Long getQuotaMaxObjects() {
    return quotaMaxObjects;
  }

  public void setQuotaMaxObjects(Long quotaMaxObjects) {
    this.quotaMaxObjects = quotaMaxObjects;
  }

  public ObjectStorageBucketUpdateReqBucket quotaMaxSize(Long quotaMaxSize) {
    this.quotaMaxSize = quotaMaxSize;
    return this;
  }

   /**
   * Get quotaMaxSize
   * @return quotaMaxSize
  **/
  @Schema(description = "")
  public Long getQuotaMaxSize() {
    return quotaMaxSize;
  }

  public void setQuotaMaxSize(Long quotaMaxSize) {
    this.quotaMaxSize = quotaMaxSize;
  }

  public ObjectStorageBucketUpdateReqBucket restoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
    return this;
  }

   /**
   * Get restoreDays
   * @return restoreDays
  **/
  @Schema(description = "")
  public Long getRestoreDays() {
    return restoreDays;
  }

  public void setRestoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageBucketUpdateReqBucket objectStorageBucketUpdateReqBucket = (ObjectStorageBucketUpdateReqBucket) o;
    return Objects.equals(this.allUserPermission, objectStorageBucketUpdateReqBucket.allUserPermission) &&
        Objects.equals(this.authUserPermission, objectStorageBucketUpdateReqBucket.authUserPermission) &&
        Objects.equals(this.deleteArchiveStorageClass, objectStorageBucketUpdateReqBucket.deleteArchiveStorageClass) &&
        Objects.equals(this.description, objectStorageBucketUpdateReqBucket.description) &&
        Objects.equals(this.externalQuotaMaxObjects, objectStorageBucketUpdateReqBucket.externalQuotaMaxObjects) &&
        Objects.equals(this.externalQuotaMaxSize, objectStorageBucketUpdateReqBucket.externalQuotaMaxSize) &&
        Objects.equals(this.flag, objectStorageBucketUpdateReqBucket.flag) &&
        Objects.equals(this.localQuotaMaxObjects, objectStorageBucketUpdateReqBucket.localQuotaMaxObjects) &&
        Objects.equals(this.localQuotaMaxSize, objectStorageBucketUpdateReqBucket.localQuotaMaxSize) &&
        Objects.equals(this.logDeliveryPermission, objectStorageBucketUpdateReqBucket.logDeliveryPermission) &&
        Objects.equals(this.ownerId, objectStorageBucketUpdateReqBucket.ownerId) &&
        Objects.equals(this.ownerPermission, objectStorageBucketUpdateReqBucket.ownerPermission) &&
        Objects.equals(this.qos, objectStorageBucketUpdateReqBucket.qos) &&
        Objects.equals(this.quotaMaxObjects, objectStorageBucketUpdateReqBucket.quotaMaxObjects) &&
        Objects.equals(this.quotaMaxSize, objectStorageBucketUpdateReqBucket.quotaMaxSize) &&
        Objects.equals(this.restoreDays, objectStorageBucketUpdateReqBucket.restoreDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allUserPermission, authUserPermission, deleteArchiveStorageClass, description, externalQuotaMaxObjects, externalQuotaMaxSize, flag, localQuotaMaxObjects, localQuotaMaxSize, logDeliveryPermission, ownerId, ownerPermission, qos, quotaMaxObjects, quotaMaxSize, restoreDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageBucketUpdateReqBucket {\n");
    
    sb.append("    allUserPermission: ").append(toIndentedString(allUserPermission)).append("\n");
    sb.append("    authUserPermission: ").append(toIndentedString(authUserPermission)).append("\n");
    sb.append("    deleteArchiveStorageClass: ").append(toIndentedString(deleteArchiveStorageClass)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalQuotaMaxObjects: ").append(toIndentedString(externalQuotaMaxObjects)).append("\n");
    sb.append("    externalQuotaMaxSize: ").append(toIndentedString(externalQuotaMaxSize)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    localQuotaMaxObjects: ").append(toIndentedString(localQuotaMaxObjects)).append("\n");
    sb.append("    localQuotaMaxSize: ").append(toIndentedString(localQuotaMaxSize)).append("\n");
    sb.append("    logDeliveryPermission: ").append(toIndentedString(logDeliveryPermission)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerPermission: ").append(toIndentedString(ownerPermission)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    quotaMaxObjects: ").append(toIndentedString(quotaMaxObjects)).append("\n");
    sb.append("    quotaMaxSize: ").append(toIndentedString(quotaMaxSize)).append("\n");
    sb.append("    restoreDays: ").append(toIndentedString(restoreDays)).append("\n");
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
