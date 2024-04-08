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
import xio.sds.client.model.OspOverviewStat;
/**
 * OspOverviewResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspOverviewResp {
  @SerializedName("data_backends")
  private Long dataBackends = null;

  @SerializedName("building_data_backends")
  private Long buildingDataBackends = null;

  @SerializedName("zones")
  private Long zones = null;

  @SerializedName("deleting_users")
  private Long deletingUsers = null;

  @SerializedName("warning_zones")
  private Long warningZones = null;

  @SerializedName("deleting_error_users")
  private Long deletingErrorUsers = null;

  @SerializedName("deleting_buckets")
  private Long deletingBuckets = null;

  @SerializedName("building_error_data_backends")
  private Long buildingErrorDataBackends = null;

  @SerializedName("building_error_zones")
  private Long buildingErrorZones = null;

  @SerializedName("storage_policies")
  private Long storagePolicies = null;

  @SerializedName("building_zones")
  private Long buildingZones = null;

  @SerializedName("error_data_backends")
  private Long errorDataBackends = null;

  @SerializedName("deleting_zones")
  private Long deletingZones = null;

  @SerializedName("stat")
  private OspOverviewStat stat = null;

  @SerializedName("users")
  private Long users = null;

  @SerializedName("error_zones")
  private Long errorZones = null;

  @SerializedName("buckets")
  private Long buckets = null;

  @SerializedName("deleting_data_backends")
  private Long deletingDataBackends = null;

  @SerializedName("buckets_in_recycle")
  private Long bucketsInRecycle = null;

  @SerializedName("deleting_error_data_backends")
  private Long deletingErrorDataBackends = null;

  @SerializedName("deleting_error_storage_policies")
  private Long deletingErrorStoragePolicies = null;

  @SerializedName("deleting_storage_policies")
  private Long deletingStoragePolicies = null;

  @SerializedName("deleting_error_buckets")
  private Long deletingErrorBuckets = null;

  @SerializedName("deleting_error_zones")
  private Long deletingErrorZones = null;

  public OspOverviewResp dataBackends(Long dataBackends) {
    this.dataBackends = dataBackends;
    return this;
  }

   /**
   * Get dataBackends
   * @return dataBackends
  **/
  @Schema(description = "")
  public Long getDataBackends() {
    return dataBackends;
  }

  public void setDataBackends(Long dataBackends) {
    this.dataBackends = dataBackends;
  }

  public OspOverviewResp buildingDataBackends(Long buildingDataBackends) {
    this.buildingDataBackends = buildingDataBackends;
    return this;
  }

   /**
   * Get buildingDataBackends
   * @return buildingDataBackends
  **/
  @Schema(description = "")
  public Long getBuildingDataBackends() {
    return buildingDataBackends;
  }

  public void setBuildingDataBackends(Long buildingDataBackends) {
    this.buildingDataBackends = buildingDataBackends;
  }

  public OspOverviewResp zones(Long zones) {
    this.zones = zones;
    return this;
  }

   /**
   * Get zones
   * @return zones
  **/
  @Schema(description = "")
  public Long getZones() {
    return zones;
  }

  public void setZones(Long zones) {
    this.zones = zones;
  }

  public OspOverviewResp deletingUsers(Long deletingUsers) {
    this.deletingUsers = deletingUsers;
    return this;
  }

   /**
   * Get deletingUsers
   * @return deletingUsers
  **/
  @Schema(description = "")
  public Long getDeletingUsers() {
    return deletingUsers;
  }

  public void setDeletingUsers(Long deletingUsers) {
    this.deletingUsers = deletingUsers;
  }

  public OspOverviewResp warningZones(Long warningZones) {
    this.warningZones = warningZones;
    return this;
  }

   /**
   * Get warningZones
   * @return warningZones
  **/
  @Schema(description = "")
  public Long getWarningZones() {
    return warningZones;
  }

  public void setWarningZones(Long warningZones) {
    this.warningZones = warningZones;
  }

  public OspOverviewResp deletingErrorUsers(Long deletingErrorUsers) {
    this.deletingErrorUsers = deletingErrorUsers;
    return this;
  }

   /**
   * Get deletingErrorUsers
   * @return deletingErrorUsers
  **/
  @Schema(description = "")
  public Long getDeletingErrorUsers() {
    return deletingErrorUsers;
  }

  public void setDeletingErrorUsers(Long deletingErrorUsers) {
    this.deletingErrorUsers = deletingErrorUsers;
  }

  public OspOverviewResp deletingBuckets(Long deletingBuckets) {
    this.deletingBuckets = deletingBuckets;
    return this;
  }

   /**
   * Get deletingBuckets
   * @return deletingBuckets
  **/
  @Schema(description = "")
  public Long getDeletingBuckets() {
    return deletingBuckets;
  }

  public void setDeletingBuckets(Long deletingBuckets) {
    this.deletingBuckets = deletingBuckets;
  }

  public OspOverviewResp buildingErrorDataBackends(Long buildingErrorDataBackends) {
    this.buildingErrorDataBackends = buildingErrorDataBackends;
    return this;
  }

   /**
   * Get buildingErrorDataBackends
   * @return buildingErrorDataBackends
  **/
  @Schema(description = "")
  public Long getBuildingErrorDataBackends() {
    return buildingErrorDataBackends;
  }

  public void setBuildingErrorDataBackends(Long buildingErrorDataBackends) {
    this.buildingErrorDataBackends = buildingErrorDataBackends;
  }

  public OspOverviewResp buildingErrorZones(Long buildingErrorZones) {
    this.buildingErrorZones = buildingErrorZones;
    return this;
  }

   /**
   * Get buildingErrorZones
   * @return buildingErrorZones
  **/
  @Schema(description = "")
  public Long getBuildingErrorZones() {
    return buildingErrorZones;
  }

  public void setBuildingErrorZones(Long buildingErrorZones) {
    this.buildingErrorZones = buildingErrorZones;
  }

  public OspOverviewResp storagePolicies(Long storagePolicies) {
    this.storagePolicies = storagePolicies;
    return this;
  }

   /**
   * Get storagePolicies
   * @return storagePolicies
  **/
  @Schema(description = "")
  public Long getStoragePolicies() {
    return storagePolicies;
  }

  public void setStoragePolicies(Long storagePolicies) {
    this.storagePolicies = storagePolicies;
  }

  public OspOverviewResp buildingZones(Long buildingZones) {
    this.buildingZones = buildingZones;
    return this;
  }

   /**
   * Get buildingZones
   * @return buildingZones
  **/
  @Schema(description = "")
  public Long getBuildingZones() {
    return buildingZones;
  }

  public void setBuildingZones(Long buildingZones) {
    this.buildingZones = buildingZones;
  }

  public OspOverviewResp errorDataBackends(Long errorDataBackends) {
    this.errorDataBackends = errorDataBackends;
    return this;
  }

   /**
   * Get errorDataBackends
   * @return errorDataBackends
  **/
  @Schema(description = "")
  public Long getErrorDataBackends() {
    return errorDataBackends;
  }

  public void setErrorDataBackends(Long errorDataBackends) {
    this.errorDataBackends = errorDataBackends;
  }

  public OspOverviewResp deletingZones(Long deletingZones) {
    this.deletingZones = deletingZones;
    return this;
  }

   /**
   * Get deletingZones
   * @return deletingZones
  **/
  @Schema(description = "")
  public Long getDeletingZones() {
    return deletingZones;
  }

  public void setDeletingZones(Long deletingZones) {
    this.deletingZones = deletingZones;
  }

  public OspOverviewResp stat(OspOverviewStat stat) {
    this.stat = stat;
    return this;
  }

   /**
   * Get stat
   * @return stat
  **/
  @Schema(description = "")
  public OspOverviewStat getStat() {
    return stat;
  }

  public void setStat(OspOverviewStat stat) {
    this.stat = stat;
  }

  public OspOverviewResp users(Long users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public Long getUsers() {
    return users;
  }

  public void setUsers(Long users) {
    this.users = users;
  }

  public OspOverviewResp errorZones(Long errorZones) {
    this.errorZones = errorZones;
    return this;
  }

   /**
   * Get errorZones
   * @return errorZones
  **/
  @Schema(description = "")
  public Long getErrorZones() {
    return errorZones;
  }

  public void setErrorZones(Long errorZones) {
    this.errorZones = errorZones;
  }

  public OspOverviewResp buckets(Long buckets) {
    this.buckets = buckets;
    return this;
  }

   /**
   * Get buckets
   * @return buckets
  **/
  @Schema(description = "")
  public Long getBuckets() {
    return buckets;
  }

  public void setBuckets(Long buckets) {
    this.buckets = buckets;
  }

  public OspOverviewResp deletingDataBackends(Long deletingDataBackends) {
    this.deletingDataBackends = deletingDataBackends;
    return this;
  }

   /**
   * Get deletingDataBackends
   * @return deletingDataBackends
  **/
  @Schema(description = "")
  public Long getDeletingDataBackends() {
    return deletingDataBackends;
  }

  public void setDeletingDataBackends(Long deletingDataBackends) {
    this.deletingDataBackends = deletingDataBackends;
  }

  public OspOverviewResp bucketsInRecycle(Long bucketsInRecycle) {
    this.bucketsInRecycle = bucketsInRecycle;
    return this;
  }

   /**
   * Get bucketsInRecycle
   * @return bucketsInRecycle
  **/
  @Schema(description = "")
  public Long getBucketsInRecycle() {
    return bucketsInRecycle;
  }

  public void setBucketsInRecycle(Long bucketsInRecycle) {
    this.bucketsInRecycle = bucketsInRecycle;
  }

  public OspOverviewResp deletingErrorDataBackends(Long deletingErrorDataBackends) {
    this.deletingErrorDataBackends = deletingErrorDataBackends;
    return this;
  }

   /**
   * Get deletingErrorDataBackends
   * @return deletingErrorDataBackends
  **/
  @Schema(description = "")
  public Long getDeletingErrorDataBackends() {
    return deletingErrorDataBackends;
  }

  public void setDeletingErrorDataBackends(Long deletingErrorDataBackends) {
    this.deletingErrorDataBackends = deletingErrorDataBackends;
  }

  public OspOverviewResp deletingErrorStoragePolicies(Long deletingErrorStoragePolicies) {
    this.deletingErrorStoragePolicies = deletingErrorStoragePolicies;
    return this;
  }

   /**
   * Get deletingErrorStoragePolicies
   * @return deletingErrorStoragePolicies
  **/
  @Schema(description = "")
  public Long getDeletingErrorStoragePolicies() {
    return deletingErrorStoragePolicies;
  }

  public void setDeletingErrorStoragePolicies(Long deletingErrorStoragePolicies) {
    this.deletingErrorStoragePolicies = deletingErrorStoragePolicies;
  }

  public OspOverviewResp deletingStoragePolicies(Long deletingStoragePolicies) {
    this.deletingStoragePolicies = deletingStoragePolicies;
    return this;
  }

   /**
   * Get deletingStoragePolicies
   * @return deletingStoragePolicies
  **/
  @Schema(description = "")
  public Long getDeletingStoragePolicies() {
    return deletingStoragePolicies;
  }

  public void setDeletingStoragePolicies(Long deletingStoragePolicies) {
    this.deletingStoragePolicies = deletingStoragePolicies;
  }

  public OspOverviewResp deletingErrorBuckets(Long deletingErrorBuckets) {
    this.deletingErrorBuckets = deletingErrorBuckets;
    return this;
  }

   /**
   * Get deletingErrorBuckets
   * @return deletingErrorBuckets
  **/
  @Schema(description = "")
  public Long getDeletingErrorBuckets() {
    return deletingErrorBuckets;
  }

  public void setDeletingErrorBuckets(Long deletingErrorBuckets) {
    this.deletingErrorBuckets = deletingErrorBuckets;
  }

  public OspOverviewResp deletingErrorZones(Long deletingErrorZones) {
    this.deletingErrorZones = deletingErrorZones;
    return this;
  }

   /**
   * Get deletingErrorZones
   * @return deletingErrorZones
  **/
  @Schema(description = "")
  public Long getDeletingErrorZones() {
    return deletingErrorZones;
  }

  public void setDeletingErrorZones(Long deletingErrorZones) {
    this.deletingErrorZones = deletingErrorZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspOverviewResp ospOverviewResp = (OspOverviewResp) o;
    return Objects.equals(this.dataBackends, ospOverviewResp.dataBackends) &&
        Objects.equals(this.buildingDataBackends, ospOverviewResp.buildingDataBackends) &&
        Objects.equals(this.zones, ospOverviewResp.zones) &&
        Objects.equals(this.deletingUsers, ospOverviewResp.deletingUsers) &&
        Objects.equals(this.warningZones, ospOverviewResp.warningZones) &&
        Objects.equals(this.deletingErrorUsers, ospOverviewResp.deletingErrorUsers) &&
        Objects.equals(this.deletingBuckets, ospOverviewResp.deletingBuckets) &&
        Objects.equals(this.buildingErrorDataBackends, ospOverviewResp.buildingErrorDataBackends) &&
        Objects.equals(this.buildingErrorZones, ospOverviewResp.buildingErrorZones) &&
        Objects.equals(this.storagePolicies, ospOverviewResp.storagePolicies) &&
        Objects.equals(this.buildingZones, ospOverviewResp.buildingZones) &&
        Objects.equals(this.errorDataBackends, ospOverviewResp.errorDataBackends) &&
        Objects.equals(this.deletingZones, ospOverviewResp.deletingZones) &&
        Objects.equals(this.stat, ospOverviewResp.stat) &&
        Objects.equals(this.users, ospOverviewResp.users) &&
        Objects.equals(this.errorZones, ospOverviewResp.errorZones) &&
        Objects.equals(this.buckets, ospOverviewResp.buckets) &&
        Objects.equals(this.deletingDataBackends, ospOverviewResp.deletingDataBackends) &&
        Objects.equals(this.bucketsInRecycle, ospOverviewResp.bucketsInRecycle) &&
        Objects.equals(this.deletingErrorDataBackends, ospOverviewResp.deletingErrorDataBackends) &&
        Objects.equals(this.deletingErrorStoragePolicies, ospOverviewResp.deletingErrorStoragePolicies) &&
        Objects.equals(this.deletingStoragePolicies, ospOverviewResp.deletingStoragePolicies) &&
        Objects.equals(this.deletingErrorBuckets, ospOverviewResp.deletingErrorBuckets) &&
        Objects.equals(this.deletingErrorZones, ospOverviewResp.deletingErrorZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataBackends, buildingDataBackends, zones, deletingUsers, warningZones, deletingErrorUsers, deletingBuckets, buildingErrorDataBackends, buildingErrorZones, storagePolicies, buildingZones, errorDataBackends, deletingZones, stat, users, errorZones, buckets, deletingDataBackends, bucketsInRecycle, deletingErrorDataBackends, deletingErrorStoragePolicies, deletingStoragePolicies, deletingErrorBuckets, deletingErrorZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspOverviewResp {\n");
    
    sb.append("    dataBackends: ").append(toIndentedString(dataBackends)).append("\n");
    sb.append("    buildingDataBackends: ").append(toIndentedString(buildingDataBackends)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    deletingUsers: ").append(toIndentedString(deletingUsers)).append("\n");
    sb.append("    warningZones: ").append(toIndentedString(warningZones)).append("\n");
    sb.append("    deletingErrorUsers: ").append(toIndentedString(deletingErrorUsers)).append("\n");
    sb.append("    deletingBuckets: ").append(toIndentedString(deletingBuckets)).append("\n");
    sb.append("    buildingErrorDataBackends: ").append(toIndentedString(buildingErrorDataBackends)).append("\n");
    sb.append("    buildingErrorZones: ").append(toIndentedString(buildingErrorZones)).append("\n");
    sb.append("    storagePolicies: ").append(toIndentedString(storagePolicies)).append("\n");
    sb.append("    buildingZones: ").append(toIndentedString(buildingZones)).append("\n");
    sb.append("    errorDataBackends: ").append(toIndentedString(errorDataBackends)).append("\n");
    sb.append("    deletingZones: ").append(toIndentedString(deletingZones)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    errorZones: ").append(toIndentedString(errorZones)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
    sb.append("    deletingDataBackends: ").append(toIndentedString(deletingDataBackends)).append("\n");
    sb.append("    bucketsInRecycle: ").append(toIndentedString(bucketsInRecycle)).append("\n");
    sb.append("    deletingErrorDataBackends: ").append(toIndentedString(deletingErrorDataBackends)).append("\n");
    sb.append("    deletingErrorStoragePolicies: ").append(toIndentedString(deletingErrorStoragePolicies)).append("\n");
    sb.append("    deletingStoragePolicies: ").append(toIndentedString(deletingStoragePolicies)).append("\n");
    sb.append("    deletingErrorBuckets: ").append(toIndentedString(deletingErrorBuckets)).append("\n");
    sb.append("    deletingErrorZones: ").append(toIndentedString(deletingErrorZones)).append("\n");
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
