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
 * SumOspGatewayStat defines response for sum of osp gateways stat
 */
@Schema(description = "SumOspGatewayStat defines response for sum of osp gateways stat")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SumOspGatewayStat {
  @SerializedName("down_bandwidth_kbyte")
  private Double downBandwidthKbyte = null;

  @SerializedName("down_latency")
  private Double downLatency = null;

  @SerializedName("down_ops")
  private Double downOps = null;

  @SerializedName("sync_down_bandwidth_kbyte")
  private Double syncDownBandwidthKbyte = null;

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

  @SerializedName("up_latency")
  private Double upLatency = null;

  @SerializedName("up_ops")
  private Double upOps = null;

  public SumOspGatewayStat downBandwidthKbyte(Double downBandwidthKbyte) {
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

  public SumOspGatewayStat downLatency(Double downLatency) {
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

  public SumOspGatewayStat downOps(Double downOps) {
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

  public SumOspGatewayStat syncDownBandwidthKbyte(Double syncDownBandwidthKbyte) {
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

  public SumOspGatewayStat syncDownLatency(Double syncDownLatency) {
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

  public SumOspGatewayStat syncDownOps(Double syncDownOps) {
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

  public SumOspGatewayStat syncUpBandwidthKbyte(Double syncUpBandwidthKbyte) {
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

  public SumOspGatewayStat syncUpLatency(Double syncUpLatency) {
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

  public SumOspGatewayStat syncUpOps(Double syncUpOps) {
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

  public SumOspGatewayStat upBandwidthKbyte(Double upBandwidthKbyte) {
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

  public SumOspGatewayStat upLatency(Double upLatency) {
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

  public SumOspGatewayStat upOps(Double upOps) {
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
    SumOspGatewayStat sumOspGatewayStat = (SumOspGatewayStat) o;
    return Objects.equals(this.downBandwidthKbyte, sumOspGatewayStat.downBandwidthKbyte) &&
        Objects.equals(this.downLatency, sumOspGatewayStat.downLatency) &&
        Objects.equals(this.downOps, sumOspGatewayStat.downOps) &&
        Objects.equals(this.syncDownBandwidthKbyte, sumOspGatewayStat.syncDownBandwidthKbyte) &&
        Objects.equals(this.syncDownLatency, sumOspGatewayStat.syncDownLatency) &&
        Objects.equals(this.syncDownOps, sumOspGatewayStat.syncDownOps) &&
        Objects.equals(this.syncUpBandwidthKbyte, sumOspGatewayStat.syncUpBandwidthKbyte) &&
        Objects.equals(this.syncUpLatency, sumOspGatewayStat.syncUpLatency) &&
        Objects.equals(this.syncUpOps, sumOspGatewayStat.syncUpOps) &&
        Objects.equals(this.upBandwidthKbyte, sumOspGatewayStat.upBandwidthKbyte) &&
        Objects.equals(this.upLatency, sumOspGatewayStat.upLatency) &&
        Objects.equals(this.upOps, sumOspGatewayStat.upOps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downBandwidthKbyte, downLatency, downOps, syncDownBandwidthKbyte, syncDownLatency, syncDownOps, syncUpBandwidthKbyte, syncUpLatency, syncUpOps, upBandwidthKbyte, upLatency, upOps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumOspGatewayStat {\n");
    
    sb.append("    downBandwidthKbyte: ").append(toIndentedString(downBandwidthKbyte)).append("\n");
    sb.append("    downLatency: ").append(toIndentedString(downLatency)).append("\n");
    sb.append("    downOps: ").append(toIndentedString(downOps)).append("\n");
    sb.append("    syncDownBandwidthKbyte: ").append(toIndentedString(syncDownBandwidthKbyte)).append("\n");
    sb.append("    syncDownLatency: ").append(toIndentedString(syncDownLatency)).append("\n");
    sb.append("    syncDownOps: ").append(toIndentedString(syncDownOps)).append("\n");
    sb.append("    syncUpBandwidthKbyte: ").append(toIndentedString(syncUpBandwidthKbyte)).append("\n");
    sb.append("    syncUpLatency: ").append(toIndentedString(syncUpLatency)).append("\n");
    sb.append("    syncUpOps: ").append(toIndentedString(syncUpOps)).append("\n");
    sb.append("    upBandwidthKbyte: ").append(toIndentedString(upBandwidthKbyte)).append("\n");
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