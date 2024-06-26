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
 * DfsS3BucketCreateReqBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3BucketCreateReqBucket {
  @SerializedName("all_user_permission")
  private String allUserPermission = null;

  @SerializedName("auth_user_permission")
  private String authUserPermission = null;

  @SerializedName("data_verify")
  private Boolean dataVerify = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enable_etag")
  private Boolean enableEtag = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("owner_permission")
  private String ownerPermission = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("rootfs_id")
  private Long rootfsId = null;

  public DfsS3BucketCreateReqBucket allUserPermission(String allUserPermission) {
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

  public DfsS3BucketCreateReqBucket authUserPermission(String authUserPermission) {
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

  public DfsS3BucketCreateReqBucket dataVerify(Boolean dataVerify) {
    this.dataVerify = dataVerify;
    return this;
  }

   /**
   * Get dataVerify
   * @return dataVerify
  **/
  @Schema(description = "")
  public Boolean isDataVerify() {
    return dataVerify;
  }

  public void setDataVerify(Boolean dataVerify) {
    this.dataVerify = dataVerify;
  }

  public DfsS3BucketCreateReqBucket description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of bucket
   * @return description
  **/
  @Schema(description = "description of bucket")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DfsS3BucketCreateReqBucket enableEtag(Boolean enableEtag) {
    this.enableEtag = enableEtag;
    return this;
  }

   /**
   * Get enableEtag
   * @return enableEtag
  **/
  @Schema(description = "")
  public Boolean isEnableEtag() {
    return enableEtag;
  }

  public void setEnableEtag(Boolean enableEtag) {
    this.enableEtag = enableEtag;
  }

  public DfsS3BucketCreateReqBucket name(String name) {
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

  public DfsS3BucketCreateReqBucket ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @Schema(required = true, description = "")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public DfsS3BucketCreateReqBucket ownerPermission(String ownerPermission) {
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

  public DfsS3BucketCreateReqBucket path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(required = true, description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsS3BucketCreateReqBucket rootfsId(Long rootfsId) {
    this.rootfsId = rootfsId;
    return this;
  }

   /**
   * Get rootfsId
   * @return rootfsId
  **/
  @Schema(required = true, description = "")
  public Long getRootfsId() {
    return rootfsId;
  }

  public void setRootfsId(Long rootfsId) {
    this.rootfsId = rootfsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsS3BucketCreateReqBucket dfsS3BucketCreateReqBucket = (DfsS3BucketCreateReqBucket) o;
    return Objects.equals(this.allUserPermission, dfsS3BucketCreateReqBucket.allUserPermission) &&
        Objects.equals(this.authUserPermission, dfsS3BucketCreateReqBucket.authUserPermission) &&
        Objects.equals(this.dataVerify, dfsS3BucketCreateReqBucket.dataVerify) &&
        Objects.equals(this.description, dfsS3BucketCreateReqBucket.description) &&
        Objects.equals(this.enableEtag, dfsS3BucketCreateReqBucket.enableEtag) &&
        Objects.equals(this.name, dfsS3BucketCreateReqBucket.name) &&
        Objects.equals(this.ownerId, dfsS3BucketCreateReqBucket.ownerId) &&
        Objects.equals(this.ownerPermission, dfsS3BucketCreateReqBucket.ownerPermission) &&
        Objects.equals(this.path, dfsS3BucketCreateReqBucket.path) &&
        Objects.equals(this.rootfsId, dfsS3BucketCreateReqBucket.rootfsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allUserPermission, authUserPermission, dataVerify, description, enableEtag, name, ownerId, ownerPermission, path, rootfsId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3BucketCreateReqBucket {\n");
    
    sb.append("    allUserPermission: ").append(toIndentedString(allUserPermission)).append("\n");
    sb.append("    authUserPermission: ").append(toIndentedString(authUserPermission)).append("\n");
    sb.append("    dataVerify: ").append(toIndentedString(dataVerify)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableEtag: ").append(toIndentedString(enableEtag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerPermission: ").append(toIndentedString(ownerPermission)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rootfsId: ").append(toIndentedString(rootfsId)).append("\n");
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
