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
import xio.sds.client.model.BucketFlag;
import xio.sds.client.model.OSBucketObjectCoverConf;
import xio.sds.client.model.OSBucketObjectStorageClass;
/**
 * ObjectStorageBucketCreateReqBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageBucketCreateReqBucket {
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
  private BucketFlag flag = null;

  @SerializedName("local_quota_max_objects")
  private Long localQuotaMaxObjects = null;

  @SerializedName("local_quota_max_size")
  private Long localQuotaMaxSize = null;

  @SerializedName("log_delivery_permission")
  private String logDeliveryPermission = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("object_cover")
  private OSBucketObjectCoverConf objectCover = null;

  @SerializedName("object_storage_class")
  private OSBucketObjectStorageClass objectStorageClass = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("owner_permission")
  private String ownerPermission = null;

  @SerializedName("policy_id")
  private Long policyId = null;

  @SerializedName("quota_max_objects")
  private Long quotaMaxObjects = null;

  @SerializedName("quota_max_size")
  private Long quotaMaxSize = null;

  @SerializedName("restore_days")
  private Long restoreDays = null;

  @SerializedName("specification_objects")
  private Long specificationObjects = null;

  public ObjectStorageBucketCreateReqBucket allUserPermission(String allUserPermission) {
    this.allUserPermission = allUserPermission;
    return this;
  }

   /**
   * permission setting of all users
   * @return allUserPermission
  **/
  @Schema(description = "permission setting of all users")
  public String getAllUserPermission() {
    return allUserPermission;
  }

  public void setAllUserPermission(String allUserPermission) {
    this.allUserPermission = allUserPermission;
  }

  public ObjectStorageBucketCreateReqBucket authUserPermission(String authUserPermission) {
    this.authUserPermission = authUserPermission;
    return this;
  }

   /**
   * permission setting of authenticated users
   * @return authUserPermission
  **/
  @Schema(description = "permission setting of authenticated users")
  public String getAuthUserPermission() {
    return authUserPermission;
  }

  public void setAuthUserPermission(String authUserPermission) {
    this.authUserPermission = authUserPermission;
  }

  public ObjectStorageBucketCreateReqBucket deleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
    return this;
  }

   /**
   * delete archive storage class
   * @return deleteArchiveStorageClass
  **/
  @Schema(description = "delete archive storage class")
  public String getDeleteArchiveStorageClass() {
    return deleteArchiveStorageClass;
  }

  public void setDeleteArchiveStorageClass(String deleteArchiveStorageClass) {
    this.deleteArchiveStorageClass = deleteArchiveStorageClass;
  }

  public ObjectStorageBucketCreateReqBucket description(String description) {
    this.description = description;
    return this;
  }

   /**
   * bucket description
   * @return description
  **/
  @Schema(description = "bucket description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObjectStorageBucketCreateReqBucket externalQuotaMaxObjects(Long externalQuotaMaxObjects) {
    this.externalQuotaMaxObjects = externalQuotaMaxObjects;
    return this;
  }

   /**
   * max number of external storage objects
   * @return externalQuotaMaxObjects
  **/
  @Schema(description = "max number of external storage objects")
  public Long getExternalQuotaMaxObjects() {
    return externalQuotaMaxObjects;
  }

  public void setExternalQuotaMaxObjects(Long externalQuotaMaxObjects) {
    this.externalQuotaMaxObjects = externalQuotaMaxObjects;
  }

  public ObjectStorageBucketCreateReqBucket externalQuotaMaxSize(Long externalQuotaMaxSize) {
    this.externalQuotaMaxSize = externalQuotaMaxSize;
    return this;
  }

   /**
   * max size of external storage objects
   * @return externalQuotaMaxSize
  **/
  @Schema(description = "max size of external storage objects")
  public Long getExternalQuotaMaxSize() {
    return externalQuotaMaxSize;
  }

  public void setExternalQuotaMaxSize(Long externalQuotaMaxSize) {
    this.externalQuotaMaxSize = externalQuotaMaxSize;
  }

  public ObjectStorageBucketCreateReqBucket flag(BucketFlag flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @Schema(description = "")
  public BucketFlag getFlag() {
    return flag;
  }

  public void setFlag(BucketFlag flag) {
    this.flag = flag;
  }

  public ObjectStorageBucketCreateReqBucket localQuotaMaxObjects(Long localQuotaMaxObjects) {
    this.localQuotaMaxObjects = localQuotaMaxObjects;
    return this;
  }

   /**
   * max number of local storage objects
   * @return localQuotaMaxObjects
  **/
  @Schema(description = "max number of local storage objects")
  public Long getLocalQuotaMaxObjects() {
    return localQuotaMaxObjects;
  }

  public void setLocalQuotaMaxObjects(Long localQuotaMaxObjects) {
    this.localQuotaMaxObjects = localQuotaMaxObjects;
  }

  public ObjectStorageBucketCreateReqBucket localQuotaMaxSize(Long localQuotaMaxSize) {
    this.localQuotaMaxSize = localQuotaMaxSize;
    return this;
  }

   /**
   * max size of local storage objects
   * @return localQuotaMaxSize
  **/
  @Schema(description = "max size of local storage objects")
  public Long getLocalQuotaMaxSize() {
    return localQuotaMaxSize;
  }

  public void setLocalQuotaMaxSize(Long localQuotaMaxSize) {
    this.localQuotaMaxSize = localQuotaMaxSize;
  }

  public ObjectStorageBucketCreateReqBucket logDeliveryPermission(String logDeliveryPermission) {
    this.logDeliveryPermission = logDeliveryPermission;
    return this;
  }

   /**
   * permission setting of log delivery group
   * @return logDeliveryPermission
  **/
  @Schema(description = "permission setting of log delivery group")
  public String getLogDeliveryPermission() {
    return logDeliveryPermission;
  }

  public void setLogDeliveryPermission(String logDeliveryPermission) {
    this.logDeliveryPermission = logDeliveryPermission;
  }

  public ObjectStorageBucketCreateReqBucket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * bucket name
   * @return name
  **/
  @Schema(required = true, description = "bucket name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObjectStorageBucketCreateReqBucket objectCover(OSBucketObjectCoverConf objectCover) {
    this.objectCover = objectCover;
    return this;
  }

   /**
   * Get objectCover
   * @return objectCover
  **/
  @Schema(description = "")
  public OSBucketObjectCoverConf getObjectCover() {
    return objectCover;
  }

  public void setObjectCover(OSBucketObjectCoverConf objectCover) {
    this.objectCover = objectCover;
  }

  public ObjectStorageBucketCreateReqBucket objectStorageClass(OSBucketObjectStorageClass objectStorageClass) {
    this.objectStorageClass = objectStorageClass;
    return this;
  }

   /**
   * Get objectStorageClass
   * @return objectStorageClass
  **/
  @Schema(description = "")
  public OSBucketObjectStorageClass getObjectStorageClass() {
    return objectStorageClass;
  }

  public void setObjectStorageClass(OSBucketObjectStorageClass objectStorageClass) {
    this.objectStorageClass = objectStorageClass;
  }

  public ObjectStorageBucketCreateReqBucket ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * bucket owner
   * @return ownerId
  **/
  @Schema(required = true, description = "bucket owner")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public ObjectStorageBucketCreateReqBucket ownerPermission(String ownerPermission) {
    this.ownerPermission = ownerPermission;
    return this;
  }

   /**
   * permission setting of owner
   * @return ownerPermission
  **/
  @Schema(description = "permission setting of owner")
  public String getOwnerPermission() {
    return ownerPermission;
  }

  public void setOwnerPermission(String ownerPermission) {
    this.ownerPermission = ownerPermission;
  }

  public ObjectStorageBucketCreateReqBucket policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * storage policy
   * @return policyId
  **/
  @Schema(required = true, description = "storage policy")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public ObjectStorageBucketCreateReqBucket quotaMaxObjects(Long quotaMaxObjects) {
    this.quotaMaxObjects = quotaMaxObjects;
    return this;
  }

   /**
   * max number of objects
   * @return quotaMaxObjects
  **/
  @Schema(description = "max number of objects")
  public Long getQuotaMaxObjects() {
    return quotaMaxObjects;
  }

  public void setQuotaMaxObjects(Long quotaMaxObjects) {
    this.quotaMaxObjects = quotaMaxObjects;
  }

  public ObjectStorageBucketCreateReqBucket quotaMaxSize(Long quotaMaxSize) {
    this.quotaMaxSize = quotaMaxSize;
    return this;
  }

   /**
   * max size of all objects
   * @return quotaMaxSize
  **/
  @Schema(description = "max size of all objects")
  public Long getQuotaMaxSize() {
    return quotaMaxSize;
  }

  public void setQuotaMaxSize(Long quotaMaxSize) {
    this.quotaMaxSize = quotaMaxSize;
  }

  public ObjectStorageBucketCreateReqBucket restoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
    return this;
  }

   /**
   * restore expiration days
   * @return restoreDays
  **/
  @Schema(description = "restore expiration days")
  public Long getRestoreDays() {
    return restoreDays;
  }

  public void setRestoreDays(Long restoreDays) {
    this.restoreDays = restoreDays;
  }

  public ObjectStorageBucketCreateReqBucket specificationObjects(Long specificationObjects) {
    this.specificationObjects = specificationObjects;
    return this;
  }

   /**
   * specification objects
   * @return specificationObjects
  **/
  @Schema(description = "specification objects")
  public Long getSpecificationObjects() {
    return specificationObjects;
  }

  public void setSpecificationObjects(Long specificationObjects) {
    this.specificationObjects = specificationObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageBucketCreateReqBucket objectStorageBucketCreateReqBucket = (ObjectStorageBucketCreateReqBucket) o;
    return Objects.equals(this.allUserPermission, objectStorageBucketCreateReqBucket.allUserPermission) &&
        Objects.equals(this.authUserPermission, objectStorageBucketCreateReqBucket.authUserPermission) &&
        Objects.equals(this.deleteArchiveStorageClass, objectStorageBucketCreateReqBucket.deleteArchiveStorageClass) &&
        Objects.equals(this.description, objectStorageBucketCreateReqBucket.description) &&
        Objects.equals(this.externalQuotaMaxObjects, objectStorageBucketCreateReqBucket.externalQuotaMaxObjects) &&
        Objects.equals(this.externalQuotaMaxSize, objectStorageBucketCreateReqBucket.externalQuotaMaxSize) &&
        Objects.equals(this.flag, objectStorageBucketCreateReqBucket.flag) &&
        Objects.equals(this.localQuotaMaxObjects, objectStorageBucketCreateReqBucket.localQuotaMaxObjects) &&
        Objects.equals(this.localQuotaMaxSize, objectStorageBucketCreateReqBucket.localQuotaMaxSize) &&
        Objects.equals(this.logDeliveryPermission, objectStorageBucketCreateReqBucket.logDeliveryPermission) &&
        Objects.equals(this.name, objectStorageBucketCreateReqBucket.name) &&
        Objects.equals(this.objectCover, objectStorageBucketCreateReqBucket.objectCover) &&
        Objects.equals(this.objectStorageClass, objectStorageBucketCreateReqBucket.objectStorageClass) &&
        Objects.equals(this.ownerId, objectStorageBucketCreateReqBucket.ownerId) &&
        Objects.equals(this.ownerPermission, objectStorageBucketCreateReqBucket.ownerPermission) &&
        Objects.equals(this.policyId, objectStorageBucketCreateReqBucket.policyId) &&
        Objects.equals(this.quotaMaxObjects, objectStorageBucketCreateReqBucket.quotaMaxObjects) &&
        Objects.equals(this.quotaMaxSize, objectStorageBucketCreateReqBucket.quotaMaxSize) &&
        Objects.equals(this.restoreDays, objectStorageBucketCreateReqBucket.restoreDays) &&
        Objects.equals(this.specificationObjects, objectStorageBucketCreateReqBucket.specificationObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allUserPermission, authUserPermission, deleteArchiveStorageClass, description, externalQuotaMaxObjects, externalQuotaMaxSize, flag, localQuotaMaxObjects, localQuotaMaxSize, logDeliveryPermission, name, objectCover, objectStorageClass, ownerId, ownerPermission, policyId, quotaMaxObjects, quotaMaxSize, restoreDays, specificationObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageBucketCreateReqBucket {\n");
    
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectCover: ").append(toIndentedString(objectCover)).append("\n");
    sb.append("    objectStorageClass: ").append(toIndentedString(objectStorageClass)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerPermission: ").append(toIndentedString(ownerPermission)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    quotaMaxObjects: ").append(toIndentedString(quotaMaxObjects)).append("\n");
    sb.append("    quotaMaxSize: ").append(toIndentedString(quotaMaxSize)).append("\n");
    sb.append("    restoreDays: ").append(toIndentedString(restoreDays)).append("\n");
    sb.append("    specificationObjects: ").append(toIndentedString(specificationObjects)).append("\n");
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
