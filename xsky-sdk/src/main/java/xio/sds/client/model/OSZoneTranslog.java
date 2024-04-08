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
/**
 * OSZoneTranslog defines model of os zone translog. +X:model:generate;order_by&#x3D;ID;etcd_lock; +X:benchmark:
 */
@Schema(description = "OSZoneTranslog defines model of os zone translog. +X:model:generate;order_by=ID;etcd_lock; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSZoneTranslog {
  @SerializedName("action")
  private String action = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("resource_type")
  private String resourceType = null;

  @SerializedName("resource_uuid")
  private String resourceUuid = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("uuid")
  private String uuid = null;

  public OSZoneTranslog action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public OSZoneTranslog cluster(ClusterNestview cluster) {
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

  public OSZoneTranslog create(OffsetDateTime create) {
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

  public OSZoneTranslog resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public OSZoneTranslog resourceUuid(String resourceUuid) {
    this.resourceUuid = resourceUuid;
    return this;
  }

   /**
   * Get resourceUuid
   * @return resourceUuid
  **/
  @Schema(description = "")
  public String getResourceUuid() {
    return resourceUuid;
  }

  public void setResourceUuid(String resourceUuid) {
    this.resourceUuid = resourceUuid;
  }

  public OSZoneTranslog update(OffsetDateTime update) {
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

  public OSZoneTranslog uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSZoneTranslog osZoneTranslog = (OSZoneTranslog) o;
    return Objects.equals(this.action, osZoneTranslog.action) &&
        Objects.equals(this.cluster, osZoneTranslog.cluster) &&
        Objects.equals(this.create, osZoneTranslog.create) &&
        Objects.equals(this.resourceType, osZoneTranslog.resourceType) &&
        Objects.equals(this.resourceUuid, osZoneTranslog.resourceUuid) &&
        Objects.equals(this.update, osZoneTranslog.update) &&
        Objects.equals(this.uuid, osZoneTranslog.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cluster, create, resourceType, resourceUuid, update, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSZoneTranslog {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceUuid: ").append(toIndentedString(resourceUuid)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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