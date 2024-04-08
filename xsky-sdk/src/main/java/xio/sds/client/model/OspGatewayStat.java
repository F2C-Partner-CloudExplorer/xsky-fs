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
 * OspGatewayStat is the model of osp_gateway_stat
 */
@Schema(description = "OspGatewayStat is the model of osp_gateway_stat")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspGatewayStat {
  @SerializedName("all_requests")
  private Long allRequests = null;

  @SerializedName("compact_bandwidth_kbyte")
  private Double compactBandwidthKbyte = null;

  @SerializedName("compact_ops")
  private Double compactOps = null;

  @SerializedName("cpu_util")
  private Double cpuUtil = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("delete_latency")
  private Double deleteLatency = null;

  @SerializedName("delete_ops")
  private Double deleteOps = null;

  @SerializedName("down_bandwidth_kbyte")
  private Double downBandwidthKbyte = null;

  @SerializedName("down_first_byte_latency")
  private Double downFirstByteLatency = null;

  @SerializedName("down_latency")
  private Double downLatency = null;

  @SerializedName("down_ops")
  private Double downOps = null;

  @SerializedName("list_latency")
  private Double listLatency = null;

  @SerializedName("list_ops")
  private Double listOps = null;

  @SerializedName("mem_usage_percent")
  private Double memUsagePercent = null;

  @SerializedName("merge_speed")
  private Long mergeSpeed = null;

  @SerializedName("replication_bandwidth_kbyte")
  private Double replicationBandwidthKbyte = null;

  @SerializedName("replication_ops")
  private Double replicationOps = null;

  @SerializedName("requests")
  private Long requests = null;

  @SerializedName("sync_down_bandwidth_kbyte")
  private Double syncDownBandwidthKbyte = null;

  @SerializedName("sync_down_last_byte_latency")
  private Double syncDownLastByteLatency = null;

  @SerializedName("sync_down_latency")
  private Double syncDownLatency = null;

  @SerializedName("sync_down_ops")
  private Double syncDownOps = null;

  @SerializedName("sync_up_bandwidth_kbyte")
  private Double syncUpBandwidthKbyte = null;

  @SerializedName("sync_up_latency")
  private Double syncUpLatency = null;

  @SerializedName("sync_up_ops")
  private Double syncUpOps = null;

  @SerializedName("up_bandwidth_kbyte")
  private Double upBandwidthKbyte = null;

  @SerializedName("up_last_byte_latency")
  private Double upLastByteLatency = null;

  @SerializedName("up_latency")
  private Double upLatency = null;

  @SerializedName("up_ops")
  private Double upOps = null;

  public OspGatewayStat allRequests(Long allRequests) {
    this.allRequests = allRequests;
    return this;
  }

   /**
   * Get allRequests
   * @return allRequests
  **/
  @Schema(description = "")
  public Long getAllRequests() {
    return allRequests;
  }

  public void setAllRequests(Long allRequests) {
    this.allRequests = allRequests;
  }

  public OspGatewayStat compactBandwidthKbyte(Double compactBandwidthKbyte) {
    this.compactBandwidthKbyte = compactBandwidthKbyte;
    return this;
  }

   /**
   * Get compactBandwidthKbyte
   * @return compactBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getCompactBandwidthKbyte() {
    return compactBandwidthKbyte;
  }

  public void setCompactBandwidthKbyte(Double compactBandwidthKbyte) {
    this.compactBandwidthKbyte = compactBandwidthKbyte;
  }

  public OspGatewayStat compactOps(Double compactOps) {
    this.compactOps = compactOps;
    return this;
  }

   /**
   * Get compactOps
   * @return compactOps
  **/
  @Schema(description = "")
  public Double getCompactOps() {
    return compactOps;
  }

  public void setCompactOps(Double compactOps) {
    this.compactOps = compactOps;
  }

  public OspGatewayStat cpuUtil(Double cpuUtil) {
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

  public OspGatewayStat create(OffsetDateTime create) {
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

  public OspGatewayStat deleteLatency(Double deleteLatency) {
    this.deleteLatency = deleteLatency;
    return this;
  }

   /**
   * Get deleteLatency
   * @return deleteLatency
  **/
  @Schema(description = "")
  public Double getDeleteLatency() {
    return deleteLatency;
  }

  public void setDeleteLatency(Double deleteLatency) {
    this.deleteLatency = deleteLatency;
  }

  public OspGatewayStat deleteOps(Double deleteOps) {
    this.deleteOps = deleteOps;
    return this;
  }

   /**
   * Get deleteOps
   * @return deleteOps
  **/
  @Schema(description = "")
  public Double getDeleteOps() {
    return deleteOps;
  }

  public void setDeleteOps(Double deleteOps) {
    this.deleteOps = deleteOps;
  }

  public OspGatewayStat downBandwidthKbyte(Double downBandwidthKbyte) {
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

  public OspGatewayStat downFirstByteLatency(Double downFirstByteLatency) {
    this.downFirstByteLatency = downFirstByteLatency;
    return this;
  }

   /**
   * Get downFirstByteLatency
   * @return downFirstByteLatency
  **/
  @Schema(description = "")
  public Double getDownFirstByteLatency() {
    return downFirstByteLatency;
  }

  public void setDownFirstByteLatency(Double downFirstByteLatency) {
    this.downFirstByteLatency = downFirstByteLatency;
  }

  public OspGatewayStat downLatency(Double downLatency) {
    this.downLatency = downLatency;
    return this;
  }

   /**
   * Get downLatency
   * @return downLatency
  **/
  @Schema(description = "")
  public Double getDownLatency() {
    return downLatency;
  }

  public void setDownLatency(Double downLatency) {
    this.downLatency = downLatency;
  }

  public OspGatewayStat downOps(Double downOps) {
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

  public OspGatewayStat listLatency(Double listLatency) {
    this.listLatency = listLatency;
    return this;
  }

   /**
   * Get listLatency
   * @return listLatency
  **/
  @Schema(description = "")
  public Double getListLatency() {
    return listLatency;
  }

  public void setListLatency(Double listLatency) {
    this.listLatency = listLatency;
  }

  public OspGatewayStat listOps(Double listOps) {
    this.listOps = listOps;
    return this;
  }

   /**
   * Get listOps
   * @return listOps
  **/
  @Schema(description = "")
  public Double getListOps() {
    return listOps;
  }

  public void setListOps(Double listOps) {
    this.listOps = listOps;
  }

  public OspGatewayStat memUsagePercent(Double memUsagePercent) {
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

  public OspGatewayStat mergeSpeed(Long mergeSpeed) {
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

  public OspGatewayStat replicationBandwidthKbyte(Double replicationBandwidthKbyte) {
    this.replicationBandwidthKbyte = replicationBandwidthKbyte;
    return this;
  }

   /**
   * Get replicationBandwidthKbyte
   * @return replicationBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getReplicationBandwidthKbyte() {
    return replicationBandwidthKbyte;
  }

  public void setReplicationBandwidthKbyte(Double replicationBandwidthKbyte) {
    this.replicationBandwidthKbyte = replicationBandwidthKbyte;
  }

  public OspGatewayStat replicationOps(Double replicationOps) {
    this.replicationOps = replicationOps;
    return this;
  }

   /**
   * Get replicationOps
   * @return replicationOps
  **/
  @Schema(description = "")
  public Double getReplicationOps() {
    return replicationOps;
  }

  public void setReplicationOps(Double replicationOps) {
    this.replicationOps = replicationOps;
  }

  public OspGatewayStat requests(Long requests) {
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

  public OspGatewayStat syncDownBandwidthKbyte(Double syncDownBandwidthKbyte) {
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

  public OspGatewayStat syncDownLastByteLatency(Double syncDownLastByteLatency) {
    this.syncDownLastByteLatency = syncDownLastByteLatency;
    return this;
  }

   /**
   * Get syncDownLastByteLatency
   * @return syncDownLastByteLatency
  **/
  @Schema(description = "")
  public Double getSyncDownLastByteLatency() {
    return syncDownLastByteLatency;
  }

  public void setSyncDownLastByteLatency(Double syncDownLastByteLatency) {
    this.syncDownLastByteLatency = syncDownLastByteLatency;
  }

  public OspGatewayStat syncDownLatency(Double syncDownLatency) {
    this.syncDownLatency = syncDownLatency;
    return this;
  }

   /**
   * Get syncDownLatency
   * @return syncDownLatency
  **/
  @Schema(description = "")
  public Double getSyncDownLatency() {
    return syncDownLatency;
  }

  public void setSyncDownLatency(Double syncDownLatency) {
    this.syncDownLatency = syncDownLatency;
  }

  public OspGatewayStat syncDownOps(Double syncDownOps) {
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

  public OspGatewayStat syncUpBandwidthKbyte(Double syncUpBandwidthKbyte) {
    this.syncUpBandwidthKbyte = syncUpBandwidthKbyte;
    return this;
  }

   /**
   * Get syncUpBandwidthKbyte
   * @return syncUpBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getSyncUpBandwidthKbyte() {
    return syncUpBandwidthKbyte;
  }

  public void setSyncUpBandwidthKbyte(Double syncUpBandwidthKbyte) {
    this.syncUpBandwidthKbyte = syncUpBandwidthKbyte;
  }

  public OspGatewayStat syncUpLatency(Double syncUpLatency) {
    this.syncUpLatency = syncUpLatency;
    return this;
  }

   /**
   * Get syncUpLatency
   * @return syncUpLatency
  **/
  @Schema(description = "")
  public Double getSyncUpLatency() {
    return syncUpLatency;
  }

  public void setSyncUpLatency(Double syncUpLatency) {
    this.syncUpLatency = syncUpLatency;
  }

  public OspGatewayStat syncUpOps(Double syncUpOps) {
    this.syncUpOps = syncUpOps;
    return this;
  }

   /**
   * Get syncUpOps
   * @return syncUpOps
  **/
  @Schema(description = "")
  public Double getSyncUpOps() {
    return syncUpOps;
  }

  public void setSyncUpOps(Double syncUpOps) {
    this.syncUpOps = syncUpOps;
  }

  public OspGatewayStat upBandwidthKbyte(Double upBandwidthKbyte) {
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

  public OspGatewayStat upLastByteLatency(Double upLastByteLatency) {
    this.upLastByteLatency = upLastByteLatency;
    return this;
  }

   /**
   * Get upLastByteLatency
   * @return upLastByteLatency
  **/
  @Schema(description = "")
  public Double getUpLastByteLatency() {
    return upLastByteLatency;
  }

  public void setUpLastByteLatency(Double upLastByteLatency) {
    this.upLastByteLatency = upLastByteLatency;
  }

  public OspGatewayStat upLatency(Double upLatency) {
    this.upLatency = upLatency;
    return this;
  }

   /**
   * Get upLatency
   * @return upLatency
  **/
  @Schema(description = "")
  public Double getUpLatency() {
    return upLatency;
  }

  public void setUpLatency(Double upLatency) {
    this.upLatency = upLatency;
  }

  public OspGatewayStat upOps(Double upOps) {
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
    OspGatewayStat ospGatewayStat = (OspGatewayStat) o;
    return Objects.equals(this.allRequests, ospGatewayStat.allRequests) &&
        Objects.equals(this.compactBandwidthKbyte, ospGatewayStat.compactBandwidthKbyte) &&
        Objects.equals(this.compactOps, ospGatewayStat.compactOps) &&
        Objects.equals(this.cpuUtil, ospGatewayStat.cpuUtil) &&
        Objects.equals(this.create, ospGatewayStat.create) &&
        Objects.equals(this.deleteLatency, ospGatewayStat.deleteLatency) &&
        Objects.equals(this.deleteOps, ospGatewayStat.deleteOps) &&
        Objects.equals(this.downBandwidthKbyte, ospGatewayStat.downBandwidthKbyte) &&
        Objects.equals(this.downFirstByteLatency, ospGatewayStat.downFirstByteLatency) &&
        Objects.equals(this.downLatency, ospGatewayStat.downLatency) &&
        Objects.equals(this.downOps, ospGatewayStat.downOps) &&
        Objects.equals(this.listLatency, ospGatewayStat.listLatency) &&
        Objects.equals(this.listOps, ospGatewayStat.listOps) &&
        Objects.equals(this.memUsagePercent, ospGatewayStat.memUsagePercent) &&
        Objects.equals(this.mergeSpeed, ospGatewayStat.mergeSpeed) &&
        Objects.equals(this.replicationBandwidthKbyte, ospGatewayStat.replicationBandwidthKbyte) &&
        Objects.equals(this.replicationOps, ospGatewayStat.replicationOps) &&
        Objects.equals(this.requests, ospGatewayStat.requests) &&
        Objects.equals(this.syncDownBandwidthKbyte, ospGatewayStat.syncDownBandwidthKbyte) &&
        Objects.equals(this.syncDownLastByteLatency, ospGatewayStat.syncDownLastByteLatency) &&
        Objects.equals(this.syncDownLatency, ospGatewayStat.syncDownLatency) &&
        Objects.equals(this.syncDownOps, ospGatewayStat.syncDownOps) &&
        Objects.equals(this.syncUpBandwidthKbyte, ospGatewayStat.syncUpBandwidthKbyte) &&
        Objects.equals(this.syncUpLatency, ospGatewayStat.syncUpLatency) &&
        Objects.equals(this.syncUpOps, ospGatewayStat.syncUpOps) &&
        Objects.equals(this.upBandwidthKbyte, ospGatewayStat.upBandwidthKbyte) &&
        Objects.equals(this.upLastByteLatency, ospGatewayStat.upLastByteLatency) &&
        Objects.equals(this.upLatency, ospGatewayStat.upLatency) &&
        Objects.equals(this.upOps, ospGatewayStat.upOps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allRequests, compactBandwidthKbyte, compactOps, cpuUtil, create, deleteLatency, deleteOps, downBandwidthKbyte, downFirstByteLatency, downLatency, downOps, listLatency, listOps, memUsagePercent, mergeSpeed, replicationBandwidthKbyte, replicationOps, requests, syncDownBandwidthKbyte, syncDownLastByteLatency, syncDownLatency, syncDownOps, syncUpBandwidthKbyte, syncUpLatency, syncUpOps, upBandwidthKbyte, upLastByteLatency, upLatency, upOps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspGatewayStat {\n");
    
    sb.append("    allRequests: ").append(toIndentedString(allRequests)).append("\n");
    sb.append("    compactBandwidthKbyte: ").append(toIndentedString(compactBandwidthKbyte)).append("\n");
    sb.append("    compactOps: ").append(toIndentedString(compactOps)).append("\n");
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    deleteLatency: ").append(toIndentedString(deleteLatency)).append("\n");
    sb.append("    deleteOps: ").append(toIndentedString(deleteOps)).append("\n");
    sb.append("    downBandwidthKbyte: ").append(toIndentedString(downBandwidthKbyte)).append("\n");
    sb.append("    downFirstByteLatency: ").append(toIndentedString(downFirstByteLatency)).append("\n");
    sb.append("    downLatency: ").append(toIndentedString(downLatency)).append("\n");
    sb.append("    downOps: ").append(toIndentedString(downOps)).append("\n");
    sb.append("    listLatency: ").append(toIndentedString(listLatency)).append("\n");
    sb.append("    listOps: ").append(toIndentedString(listOps)).append("\n");
    sb.append("    memUsagePercent: ").append(toIndentedString(memUsagePercent)).append("\n");
    sb.append("    mergeSpeed: ").append(toIndentedString(mergeSpeed)).append("\n");
    sb.append("    replicationBandwidthKbyte: ").append(toIndentedString(replicationBandwidthKbyte)).append("\n");
    sb.append("    replicationOps: ").append(toIndentedString(replicationOps)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    syncDownBandwidthKbyte: ").append(toIndentedString(syncDownBandwidthKbyte)).append("\n");
    sb.append("    syncDownLastByteLatency: ").append(toIndentedString(syncDownLastByteLatency)).append("\n");
    sb.append("    syncDownLatency: ").append(toIndentedString(syncDownLatency)).append("\n");
    sb.append("    syncDownOps: ").append(toIndentedString(syncDownOps)).append("\n");
    sb.append("    syncUpBandwidthKbyte: ").append(toIndentedString(syncUpBandwidthKbyte)).append("\n");
    sb.append("    syncUpLatency: ").append(toIndentedString(syncUpLatency)).append("\n");
    sb.append("    syncUpOps: ").append(toIndentedString(syncUpOps)).append("\n");
    sb.append("    upBandwidthKbyte: ").append(toIndentedString(upBandwidthKbyte)).append("\n");
    sb.append("    upLastByteLatency: ").append(toIndentedString(upLastByteLatency)).append("\n");
    sb.append("    upLatency: ").append(toIndentedString(upLatency)).append("\n");
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
