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
 * OSZonePeriod records progressing of a zone group operation. +X:model:generate; +X:benchmark:
 */
@Schema(description = "OSZonePeriod records progressing of a zone group operation. +X:model:generate; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSZonePeriod {
  @SerializedName("action")
  private String action = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("master_os_zone_uuid")
  private String masterOsZoneUuid = null;

  @SerializedName("next_master_os_zone_uuid")
  private String nextMasterOsZoneUuid = null;

  @SerializedName("period_id")
  private String periodId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("uuid")
  private String uuid = null;

  public OSZonePeriod action(String action) {
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

  public OSZonePeriod cluster(ClusterNestview cluster) {
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

  public OSZonePeriod create(OffsetDateTime create) {
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

  public OSZonePeriod id(Long id) {
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

  public OSZonePeriod masterOsZoneUuid(String masterOsZoneUuid) {
    this.masterOsZoneUuid = masterOsZoneUuid;
    return this;
  }

   /**
   * Get masterOsZoneUuid
   * @return masterOsZoneUuid
  **/
  @Schema(description = "")
  public String getMasterOsZoneUuid() {
    return masterOsZoneUuid;
  }

  public void setMasterOsZoneUuid(String masterOsZoneUuid) {
    this.masterOsZoneUuid = masterOsZoneUuid;
  }

  public OSZonePeriod nextMasterOsZoneUuid(String nextMasterOsZoneUuid) {
    this.nextMasterOsZoneUuid = nextMasterOsZoneUuid;
    return this;
  }

   /**
   * Get nextMasterOsZoneUuid
   * @return nextMasterOsZoneUuid
  **/
  @Schema(description = "")
  public String getNextMasterOsZoneUuid() {
    return nextMasterOsZoneUuid;
  }

  public void setNextMasterOsZoneUuid(String nextMasterOsZoneUuid) {
    this.nextMasterOsZoneUuid = nextMasterOsZoneUuid;
  }

  public OSZonePeriod periodId(String periodId) {
    this.periodId = periodId;
    return this;
  }

   /**
   * Get periodId
   * @return periodId
  **/
  @Schema(description = "")
  public String getPeriodId() {
    return periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public OSZonePeriod status(String status) {
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

  public OSZonePeriod update(OffsetDateTime update) {
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

  public OSZonePeriod uuid(String uuid) {
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
    OSZonePeriod osZonePeriod = (OSZonePeriod) o;
    return Objects.equals(this.action, osZonePeriod.action) &&
        Objects.equals(this.cluster, osZonePeriod.cluster) &&
        Objects.equals(this.create, osZonePeriod.create) &&
        Objects.equals(this.id, osZonePeriod.id) &&
        Objects.equals(this.masterOsZoneUuid, osZonePeriod.masterOsZoneUuid) &&
        Objects.equals(this.nextMasterOsZoneUuid, osZonePeriod.nextMasterOsZoneUuid) &&
        Objects.equals(this.periodId, osZonePeriod.periodId) &&
        Objects.equals(this.status, osZonePeriod.status) &&
        Objects.equals(this.update, osZonePeriod.update) &&
        Objects.equals(this.uuid, osZonePeriod.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cluster, create, id, masterOsZoneUuid, nextMasterOsZoneUuid, periodId, status, update, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSZonePeriod {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    masterOsZoneUuid: ").append(toIndentedString(masterOsZoneUuid)).append("\n");
    sb.append("    nextMasterOsZoneUuid: ").append(toIndentedString(nextMasterOsZoneUuid)).append("\n");
    sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
