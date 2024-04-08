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
import xio.sds.client.model.NFSGatewayNestview;
import xio.sds.client.model.ObjectStorageBucketNestview;
import xio.sds.client.model.ObjectStorageKeyNestview;
/**
 * NFSGatewayBucketMap defines nfs gateway bucket map
 */
@Schema(description = "NFSGatewayBucketMap defines nfs gateway bucket map")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NFSGatewayBucketMap {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("bucket")
  private ObjectStorageBucketNestview bucket = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("key")
  private ObjectStorageKeyNestview key = null;

  @SerializedName("mount_clients")
  private String mountClients = null;

  @SerializedName("mount_num")
  private Long mountNum = null;

  @SerializedName("nfs_gateway")
  private NFSGatewayNestview nfsGateway = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public NFSGatewayBucketMap actionStatus(String actionStatus) {
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

  public NFSGatewayBucketMap bucket(ObjectStorageBucketNestview bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(description = "")
  public ObjectStorageBucketNestview getBucket() {
    return bucket;
  }

  public void setBucket(ObjectStorageBucketNestview bucket) {
    this.bucket = bucket;
  }

  public NFSGatewayBucketMap cluster(ClusterNestview cluster) {
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

  public NFSGatewayBucketMap create(OffsetDateTime create) {
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

  public NFSGatewayBucketMap id(Long id) {
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

  public NFSGatewayBucketMap key(ObjectStorageKeyNestview key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public ObjectStorageKeyNestview getKey() {
    return key;
  }

  public void setKey(ObjectStorageKeyNestview key) {
    this.key = key;
  }

  public NFSGatewayBucketMap mountClients(String mountClients) {
    this.mountClients = mountClients;
    return this;
  }

   /**
   * Get mountClients
   * @return mountClients
  **/
  @Schema(description = "")
  public String getMountClients() {
    return mountClients;
  }

  public void setMountClients(String mountClients) {
    this.mountClients = mountClients;
  }

  public NFSGatewayBucketMap mountNum(Long mountNum) {
    this.mountNum = mountNum;
    return this;
  }

   /**
   * Get mountNum
   * @return mountNum
  **/
  @Schema(description = "")
  public Long getMountNum() {
    return mountNum;
  }

  public void setMountNum(Long mountNum) {
    this.mountNum = mountNum;
  }

  public NFSGatewayBucketMap nfsGateway(NFSGatewayNestview nfsGateway) {
    this.nfsGateway = nfsGateway;
    return this;
  }

   /**
   * Get nfsGateway
   * @return nfsGateway
  **/
  @Schema(description = "")
  public NFSGatewayNestview getNfsGateway() {
    return nfsGateway;
  }

  public void setNfsGateway(NFSGatewayNestview nfsGateway) {
    this.nfsGateway = nfsGateway;
  }

  public NFSGatewayBucketMap status(String status) {
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

  public NFSGatewayBucketMap update(OffsetDateTime update) {
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
    NFSGatewayBucketMap nfSGatewayBucketMap = (NFSGatewayBucketMap) o;
    return Objects.equals(this.actionStatus, nfSGatewayBucketMap.actionStatus) &&
        Objects.equals(this.bucket, nfSGatewayBucketMap.bucket) &&
        Objects.equals(this.cluster, nfSGatewayBucketMap.cluster) &&
        Objects.equals(this.create, nfSGatewayBucketMap.create) &&
        Objects.equals(this.id, nfSGatewayBucketMap.id) &&
        Objects.equals(this.key, nfSGatewayBucketMap.key) &&
        Objects.equals(this.mountClients, nfSGatewayBucketMap.mountClients) &&
        Objects.equals(this.mountNum, nfSGatewayBucketMap.mountNum) &&
        Objects.equals(this.nfsGateway, nfSGatewayBucketMap.nfsGateway) &&
        Objects.equals(this.status, nfSGatewayBucketMap.status) &&
        Objects.equals(this.update, nfSGatewayBucketMap.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, bucket, cluster, create, id, key, mountClients, mountNum, nfsGateway, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFSGatewayBucketMap {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mountClients: ").append(toIndentedString(mountClients)).append("\n");
    sb.append("    mountNum: ").append(toIndentedString(mountNum)).append("\n");
    sb.append("    nfsGateway: ").append(toIndentedString(nfsGateway)).append("\n");
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
