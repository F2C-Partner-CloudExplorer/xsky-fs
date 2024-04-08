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
/**
 * ObjectStorageGatewayStat is the model of object_storage_gateway_stat
 */
@Schema(description = "ObjectStorageGatewayStat is the model of object_storage_gateway_stat")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageGatewayStat {
  @SerializedName("cpu_util")
  private Double cpuUtil = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("down_bandwidth_kbyte")
  private Double downBandwidthKbyte = null;

  @SerializedName("down_ops")
  private Double downOps = null;

  @SerializedName("mem_usage_percent")
  private Double memUsagePercent = null;

  @SerializedName("merge_speed")
  private Long mergeSpeed = null;

  @SerializedName("requests")
  private Long requests = null;

  @SerializedName("sync_down_bandwidth_kbyte")
  private Double syncDownBandwidthKbyte = null;

  @SerializedName("sync_down_ops")
  private Double syncDownOps = null;

  @SerializedName("up_bandwidth_kbyte")
  private Double upBandwidthKbyte = null;

  @SerializedName("up_ops")
  private Double upOps = null;

  public ObjectStorageGatewayStat cpuUtil(Double cpuUtil) {
    this.cpuUtil = cpuUtil;
    return this;
  }

   /**
   * Get cpuUtil
   * @return cpuUtil
  **/
  @Schema(description = "")
  public Double getCpuUtil() {
    return cpuUtil;
  }

  public void setCpuUtil(Double cpuUtil) {
    this.cpuUtil = cpuUtil;
  }

  public ObjectStorageGatewayStat create(OffsetDateTime create) {
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

  public ObjectStorageGatewayStat downBandwidthKbyte(Double downBandwidthKbyte) {
    this.downBandwidthKbyte = downBandwidthKbyte;
    return this;
  }

   /**
   * Get downBandwidthKbyte
   * @return downBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getDownBandwidthKbyte() {
    return downBandwidthKbyte;
  }

  public void setDownBandwidthKbyte(Double downBandwidthKbyte) {
    this.downBandwidthKbyte = downBandwidthKbyte;
  }

  public ObjectStorageGatewayStat downOps(Double downOps) {
    this.downOps = downOps;
    return this;
  }

   /**
   * Get downOps
   * @return downOps
  **/
  @Schema(description = "")
  public Double getDownOps() {
    return downOps;
  }

  public void setDownOps(Double downOps) {
    this.downOps = downOps;
  }

  public ObjectStorageGatewayStat memUsagePercent(Double memUsagePercent) {
    this.memUsagePercent = memUsagePercent;
    return this;
  }

   /**
   * Get memUsagePercent
   * @return memUsagePercent
  **/
  @Schema(description = "")
  public Double getMemUsagePercent() {
    return memUsagePercent;
  }

  public void setMemUsagePercent(Double memUsagePercent) {
    this.memUsagePercent = memUsagePercent;
  }

  public ObjectStorageGatewayStat mergeSpeed(Long mergeSpeed) {
    this.mergeSpeed = mergeSpeed;
    return this;
  }

   /**
   * Get mergeSpeed
   * @return mergeSpeed
  **/
  @Schema(description = "")
  public Long getMergeSpeed() {
    return mergeSpeed;
  }

  public void setMergeSpeed(Long mergeSpeed) {
    this.mergeSpeed = mergeSpeed;
  }

  public ObjectStorageGatewayStat requests(Long requests) {
    this.requests = requests;
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @Schema(description = "")
  public Long getRequests() {
    return requests;
  }

  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public ObjectStorageGatewayStat syncDownBandwidthKbyte(Double syncDownBandwidthKbyte) {
    this.syncDownBandwidthKbyte = syncDownBandwidthKbyte;
    return this;
  }

   /**
   * Get syncDownBandwidthKbyte
   * @return syncDownBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getSyncDownBandwidthKbyte() {
    return syncDownBandwidthKbyte;
  }

  public void setSyncDownBandwidthKbyte(Double syncDownBandwidthKbyte) {
    this.syncDownBandwidthKbyte = syncDownBandwidthKbyte;
  }

  public ObjectStorageGatewayStat syncDownOps(Double syncDownOps) {
    this.syncDownOps = syncDownOps;
    return this;
  }

   /**
   * Get syncDownOps
   * @return syncDownOps
  **/
  @Schema(description = "")
  public Double getSyncDownOps() {
    return syncDownOps;
  }

  public void setSyncDownOps(Double syncDownOps) {
    this.syncDownOps = syncDownOps;
  }

  public ObjectStorageGatewayStat upBandwidthKbyte(Double upBandwidthKbyte) {
    this.upBandwidthKbyte = upBandwidthKbyte;
    return this;
  }

   /**
   * Get upBandwidthKbyte
   * @return upBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getUpBandwidthKbyte() {
    return upBandwidthKbyte;
  }

  public void setUpBandwidthKbyte(Double upBandwidthKbyte) {
    this.upBandwidthKbyte = upBandwidthKbyte;
  }

  public ObjectStorageGatewayStat upOps(Double upOps) {
    this.upOps = upOps;
    return this;
  }

   /**
   * Get upOps
   * @return upOps
  **/
  @Schema(description = "")
  public Double getUpOps() {
    return upOps;
  }

  public void setUpOps(Double upOps) {
    this.upOps = upOps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageGatewayStat objectStorageGatewayStat = (ObjectStorageGatewayStat) o;
    return Objects.equals(this.cpuUtil, objectStorageGatewayStat.cpuUtil) &&
        Objects.equals(this.create, objectStorageGatewayStat.create) &&
        Objects.equals(this.downBandwidthKbyte, objectStorageGatewayStat.downBandwidthKbyte) &&
        Objects.equals(this.downOps, objectStorageGatewayStat.downOps) &&
        Objects.equals(this.memUsagePercent, objectStorageGatewayStat.memUsagePercent) &&
        Objects.equals(this.mergeSpeed, objectStorageGatewayStat.mergeSpeed) &&
        Objects.equals(this.requests, objectStorageGatewayStat.requests) &&
        Objects.equals(this.syncDownBandwidthKbyte, objectStorageGatewayStat.syncDownBandwidthKbyte) &&
        Objects.equals(this.syncDownOps, objectStorageGatewayStat.syncDownOps) &&
        Objects.equals(this.upBandwidthKbyte, objectStorageGatewayStat.upBandwidthKbyte) &&
        Objects.equals(this.upOps, objectStorageGatewayStat.upOps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUtil, create, downBandwidthKbyte, downOps, memUsagePercent, mergeSpeed, requests, syncDownBandwidthKbyte, syncDownOps, upBandwidthKbyte, upOps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageGatewayStat {\n");
    
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    downBandwidthKbyte: ").append(toIndentedString(downBandwidthKbyte)).append("\n");
    sb.append("    downOps: ").append(toIndentedString(downOps)).append("\n");
    sb.append("    memUsagePercent: ").append(toIndentedString(memUsagePercent)).append("\n");
    sb.append("    mergeSpeed: ").append(toIndentedString(mergeSpeed)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    syncDownBandwidthKbyte: ").append(toIndentedString(syncDownBandwidthKbyte)).append("\n");
    sb.append("    syncDownOps: ").append(toIndentedString(syncDownOps)).append("\n");
    sb.append("    upBandwidthKbyte: ").append(toIndentedString(upBandwidthKbyte)).append("\n");
    sb.append("    upOps: ").append(toIndentedString(upOps)).append("\n");
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
