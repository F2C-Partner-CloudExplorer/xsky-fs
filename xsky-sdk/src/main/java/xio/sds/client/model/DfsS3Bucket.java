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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.DfsGatewayGroupNestview;
import xio.sds.client.model.DfsPathNestview;
import xio.sds.client.model.DfsRootfsNestview;
import xio.sds.client.model.FSUserNestview;
/**
 * DfsS3Bucket contains information of a dfs s 3 bucket and it&#x27;s stats.
 */
@Schema(description = "DfsS3Bucket contains information of a dfs s 3 bucket and it's stats.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3Bucket {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("all_user_permission")
  private String allUserPermission = null;

  @SerializedName("auth_user_permission")
  private String authUserPermission = null;

  @SerializedName("bucket_policy")
  private String bucketPolicy = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("data_verify")
  private Boolean dataVerify = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dfs_gateway_group")
  private DfsGatewayGroupNestview dfsGatewayGroup = null;

  @SerializedName("dfs_rootfs")
  private DfsRootfsNestview dfsRootfs = null;

  @SerializedName("enable_etag")
  private Boolean enableEtag = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private FSUserNestview owner = null;

  @SerializedName("owner_permission")
  private String ownerPermission = null;

  @SerializedName("path")
  private DfsPathNestview path = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public DfsS3Bucket actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public DfsS3Bucket allUserPermission(String allUserPermission) {
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

  public DfsS3Bucket authUserPermission(String authUserPermission) {
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

  public DfsS3Bucket bucketPolicy(String bucketPolicy) {
    this.bucketPolicy = bucketPolicy;
    return this;
  }

   /**
   * Get bucketPolicy
   * @return bucketPolicy
  **/
  @Schema(description = "")
  public String getBucketPolicy() {
    return bucketPolicy;
  }

  public void setBucketPolicy(String bucketPolicy) {
    this.bucketPolicy = bucketPolicy;
  }

  public DfsS3Bucket cluster(ClusterNestview cluster) {
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

  public DfsS3Bucket create(OffsetDateTime create) {
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

  public DfsS3Bucket dataVerify(Boolean dataVerify) {
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

  public DfsS3Bucket description(String description) {
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

  public DfsS3Bucket dfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
    return this;
  }

   /**
   * Get dfsGatewayGroup
   * @return dfsGatewayGroup
  **/
  @Schema(description = "")
  public DfsGatewayGroupNestview getDfsGatewayGroup() {
    return dfsGatewayGroup;
  }

  public void setDfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
  }

  public DfsS3Bucket dfsRootfs(DfsRootfsNestview dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
    return this;
  }

   /**
   * Get dfsRootfs
   * @return dfsRootfs
  **/
  @Schema(description = "")
  public DfsRootfsNestview getDfsRootfs() {
    return dfsRootfs;
  }

  public void setDfsRootfs(DfsRootfsNestview dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
  }

  public DfsS3Bucket enableEtag(Boolean enableEtag) {
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

  public DfsS3Bucket id(Long id) {
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

  public DfsS3Bucket name(String name) {
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

  public DfsS3Bucket owner(FSUserNestview owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public FSUserNestview getOwner() {
    return owner;
  }

  public void setOwner(FSUserNestview owner) {
    this.owner = owner;
  }

  public DfsS3Bucket ownerPermission(String ownerPermission) {
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

  public DfsS3Bucket path(DfsPathNestview path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public DfsPathNestview getPath() {
    return path;
  }

  public void setPath(DfsPathNestview path) {
    this.path = path;
  }

  public DfsS3Bucket status(String status) {
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

  public DfsS3Bucket update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsS3Bucket dfsS3Bucket = (DfsS3Bucket) o;
    return Objects.equals(this.actionStatus, dfsS3Bucket.actionStatus) &&
        Objects.equals(this.allUserPermission, dfsS3Bucket.allUserPermission) &&
        Objects.equals(this.authUserPermission, dfsS3Bucket.authUserPermission) &&
        Objects.equals(this.bucketPolicy, dfsS3Bucket.bucketPolicy) &&
        Objects.equals(this.cluster, dfsS3Bucket.cluster) &&
        Objects.equals(this.create, dfsS3Bucket.create) &&
        Objects.equals(this.dataVerify, dfsS3Bucket.dataVerify) &&
        Objects.equals(this.description, dfsS3Bucket.description) &&
        Objects.equals(this.dfsGatewayGroup, dfsS3Bucket.dfsGatewayGroup) &&
        Objects.equals(this.dfsRootfs, dfsS3Bucket.dfsRootfs) &&
        Objects.equals(this.enableEtag, dfsS3Bucket.enableEtag) &&
        Objects.equals(this.id, dfsS3Bucket.id) &&
        Objects.equals(this.name, dfsS3Bucket.name) &&
        Objects.equals(this.owner, dfsS3Bucket.owner) &&
        Objects.equals(this.ownerPermission, dfsS3Bucket.ownerPermission) &&
        Objects.equals(this.path, dfsS3Bucket.path) &&
        Objects.equals(this.status, dfsS3Bucket.status) &&
        Objects.equals(this.update, dfsS3Bucket.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, allUserPermission, authUserPermission, bucketPolicy, cluster, create, dataVerify, description, dfsGatewayGroup, dfsRootfs, enableEtag, id, name, owner, ownerPermission, path, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3Bucket {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    allUserPermission: ").append(toIndentedString(allUserPermission)).append("\n");
    sb.append("    authUserPermission: ").append(toIndentedString(authUserPermission)).append("\n");
    sb.append("    bucketPolicy: ").append(toIndentedString(bucketPolicy)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dataVerify: ").append(toIndentedString(dataVerify)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dfsGatewayGroup: ").append(toIndentedString(dfsGatewayGroup)).append("\n");
    sb.append("    dfsRootfs: ").append(toIndentedString(dfsRootfs)).append("\n");
    sb.append("    enableEtag: ").append(toIndentedString(enableEtag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerPermission: ").append(toIndentedString(ownerPermission)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
