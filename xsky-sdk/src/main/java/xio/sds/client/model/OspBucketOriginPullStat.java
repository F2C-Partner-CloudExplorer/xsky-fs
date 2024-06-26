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
 * OspBucketOriginPullStat
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketOriginPullStat {
  @SerializedName("total_bandwidth_kbyte")
  private Double totalBandwidthKbyte = null;

  @SerializedName("total_ops")
  private Long totalOps = null;

  @SerializedName("total_latency_us")
  private Double totalLatencyUs = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("total_ops_pm")
  private Double totalOpsPm = null;

  @SerializedName("success_agent_ops")
  private Long successAgentOps = null;

  @SerializedName("agent_bandwidth_kbyte")
  private Double agentBandwidthKbyte = null;

  @SerializedName("agent_latency_us")
  private Double agentLatencyUs = null;

  @SerializedName("agent_latency")
  private Long agentLatency = null;

  @SerializedName("agent_ops")
  private Long agentOps = null;

  @SerializedName("total_latency")
  private Long totalLatency = null;

  @SerializedName("total_size_bytes")
  private Long totalSizeBytes = null;

  @SerializedName("success_ops")
  private Long successOps = null;

  @SerializedName("agent_ops_pm")
  private Double agentOpsPm = null;

  @SerializedName("agent_size_bytes")
  private Long agentSizeBytes = null;

  public OspBucketOriginPullStat totalBandwidthKbyte(Double totalBandwidthKbyte) {
    this.totalBandwidthKbyte = totalBandwidthKbyte;
    return this;
  }

   /**
   * Get totalBandwidthKbyte
   * @return totalBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getTotalBandwidthKbyte() {
    return totalBandwidthKbyte;
  }

  public void setTotalBandwidthKbyte(Double totalBandwidthKbyte) {
    this.totalBandwidthKbyte = totalBandwidthKbyte;
  }

  public OspBucketOriginPullStat totalOps(Long totalOps) {
    this.totalOps = totalOps;
    return this;
  }

   /**
   * Get totalOps
   * @return totalOps
  **/
  @Schema(description = "")
  public Long getTotalOps() {
    return totalOps;
  }

  public void setTotalOps(Long totalOps) {
    this.totalOps = totalOps;
  }

  public OspBucketOriginPullStat totalLatencyUs(Double totalLatencyUs) {
    this.totalLatencyUs = totalLatencyUs;
    return this;
  }

   /**
   * Get totalLatencyUs
   * @return totalLatencyUs
  **/
  @Schema(description = "")
  public Double getTotalLatencyUs() {
    return totalLatencyUs;
  }

  public void setTotalLatencyUs(Double totalLatencyUs) {
    this.totalLatencyUs = totalLatencyUs;
  }

  public OspBucketOriginPullStat create(String create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public OspBucketOriginPullStat totalOpsPm(Double totalOpsPm) {
    this.totalOpsPm = totalOpsPm;
    return this;
  }

   /**
   * Get totalOpsPm
   * @return totalOpsPm
  **/
  @Schema(description = "")
  public Double getTotalOpsPm() {
    return totalOpsPm;
  }

  public void setTotalOpsPm(Double totalOpsPm) {
    this.totalOpsPm = totalOpsPm;
  }

  public OspBucketOriginPullStat successAgentOps(Long successAgentOps) {
    this.successAgentOps = successAgentOps;
    return this;
  }

   /**
   * Get successAgentOps
   * @return successAgentOps
  **/
  @Schema(description = "")
  public Long getSuccessAgentOps() {
    return successAgentOps;
  }

  public void setSuccessAgentOps(Long successAgentOps) {
    this.successAgentOps = successAgentOps;
  }

  public OspBucketOriginPullStat agentBandwidthKbyte(Double agentBandwidthKbyte) {
    this.agentBandwidthKbyte = agentBandwidthKbyte;
    return this;
  }

   /**
   * Get agentBandwidthKbyte
   * @return agentBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getAgentBandwidthKbyte() {
    return agentBandwidthKbyte;
  }

  public void setAgentBandwidthKbyte(Double agentBandwidthKbyte) {
    this.agentBandwidthKbyte = agentBandwidthKbyte;
  }

  public OspBucketOriginPullStat agentLatencyUs(Double agentLatencyUs) {
    this.agentLatencyUs = agentLatencyUs;
    return this;
  }

   /**
   * Get agentLatencyUs
   * @return agentLatencyUs
  **/
  @Schema(description = "")
  public Double getAgentLatencyUs() {
    return agentLatencyUs;
  }

  public void setAgentLatencyUs(Double agentLatencyUs) {
    this.agentLatencyUs = agentLatencyUs;
  }

  public OspBucketOriginPullStat agentLatency(Long agentLatency) {
    this.agentLatency = agentLatency;
    return this;
  }

   /**
   * Get agentLatency
   * @return agentLatency
  **/
  @Schema(description = "")
  public Long getAgentLatency() {
    return agentLatency;
  }

  public void setAgentLatency(Long agentLatency) {
    this.agentLatency = agentLatency;
  }

  public OspBucketOriginPullStat agentOps(Long agentOps) {
    this.agentOps = agentOps;
    return this;
  }

   /**
   * Get agentOps
   * @return agentOps
  **/
  @Schema(description = "")
  public Long getAgentOps() {
    return agentOps;
  }

  public void setAgentOps(Long agentOps) {
    this.agentOps = agentOps;
  }

  public OspBucketOriginPullStat totalLatency(Long totalLatency) {
    this.totalLatency = totalLatency;
    return this;
  }

   /**
   * Get totalLatency
   * @return totalLatency
  **/
  @Schema(description = "")
  public Long getTotalLatency() {
    return totalLatency;
  }

  public void setTotalLatency(Long totalLatency) {
    this.totalLatency = totalLatency;
  }

  public OspBucketOriginPullStat totalSizeBytes(Long totalSizeBytes) {
    this.totalSizeBytes = totalSizeBytes;
    return this;
  }

   /**
   * Get totalSizeBytes
   * @return totalSizeBytes
  **/
  @Schema(description = "")
  public Long getTotalSizeBytes() {
    return totalSizeBytes;
  }

  public void setTotalSizeBytes(Long totalSizeBytes) {
    this.totalSizeBytes = totalSizeBytes;
  }

  public OspBucketOriginPullStat successOps(Long successOps) {
    this.successOps = successOps;
    return this;
  }

   /**
   * Get successOps
   * @return successOps
  **/
  @Schema(description = "")
  public Long getSuccessOps() {
    return successOps;
  }

  public void setSuccessOps(Long successOps) {
    this.successOps = successOps;
  }

  public OspBucketOriginPullStat agentOpsPm(Double agentOpsPm) {
    this.agentOpsPm = agentOpsPm;
    return this;
  }

   /**
   * Get agentOpsPm
   * @return agentOpsPm
  **/
  @Schema(description = "")
  public Double getAgentOpsPm() {
    return agentOpsPm;
  }

  public void setAgentOpsPm(Double agentOpsPm) {
    this.agentOpsPm = agentOpsPm;
  }

  public OspBucketOriginPullStat agentSizeBytes(Long agentSizeBytes) {
    this.agentSizeBytes = agentSizeBytes;
    return this;
  }

   /**
   * Get agentSizeBytes
   * @return agentSizeBytes
  **/
  @Schema(description = "")
  public Long getAgentSizeBytes() {
    return agentSizeBytes;
  }

  public void setAgentSizeBytes(Long agentSizeBytes) {
    this.agentSizeBytes = agentSizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketOriginPullStat ospBucketOriginPullStat = (OspBucketOriginPullStat) o;
    return Objects.equals(this.totalBandwidthKbyte, ospBucketOriginPullStat.totalBandwidthKbyte) &&
        Objects.equals(this.totalOps, ospBucketOriginPullStat.totalOps) &&
        Objects.equals(this.totalLatencyUs, ospBucketOriginPullStat.totalLatencyUs) &&
        Objects.equals(this.create, ospBucketOriginPullStat.create) &&
        Objects.equals(this.totalOpsPm, ospBucketOriginPullStat.totalOpsPm) &&
        Objects.equals(this.successAgentOps, ospBucketOriginPullStat.successAgentOps) &&
        Objects.equals(this.agentBandwidthKbyte, ospBucketOriginPullStat.agentBandwidthKbyte) &&
        Objects.equals(this.agentLatencyUs, ospBucketOriginPullStat.agentLatencyUs) &&
        Objects.equals(this.agentLatency, ospBucketOriginPullStat.agentLatency) &&
        Objects.equals(this.agentOps, ospBucketOriginPullStat.agentOps) &&
        Objects.equals(this.totalLatency, ospBucketOriginPullStat.totalLatency) &&
        Objects.equals(this.totalSizeBytes, ospBucketOriginPullStat.totalSizeBytes) &&
        Objects.equals(this.successOps, ospBucketOriginPullStat.successOps) &&
        Objects.equals(this.agentOpsPm, ospBucketOriginPullStat.agentOpsPm) &&
        Objects.equals(this.agentSizeBytes, ospBucketOriginPullStat.agentSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBandwidthKbyte, totalOps, totalLatencyUs, create, totalOpsPm, successAgentOps, agentBandwidthKbyte, agentLatencyUs, agentLatency, agentOps, totalLatency, totalSizeBytes, successOps, agentOpsPm, agentSizeBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketOriginPullStat {\n");
    
    sb.append("    totalBandwidthKbyte: ").append(toIndentedString(totalBandwidthKbyte)).append("\n");
    sb.append("    totalOps: ").append(toIndentedString(totalOps)).append("\n");
    sb.append("    totalLatencyUs: ").append(toIndentedString(totalLatencyUs)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    totalOpsPm: ").append(toIndentedString(totalOpsPm)).append("\n");
    sb.append("    successAgentOps: ").append(toIndentedString(successAgentOps)).append("\n");
    sb.append("    agentBandwidthKbyte: ").append(toIndentedString(agentBandwidthKbyte)).append("\n");
    sb.append("    agentLatencyUs: ").append(toIndentedString(agentLatencyUs)).append("\n");
    sb.append("    agentLatency: ").append(toIndentedString(agentLatency)).append("\n");
    sb.append("    agentOps: ").append(toIndentedString(agentOps)).append("\n");
    sb.append("    totalLatency: ").append(toIndentedString(totalLatency)).append("\n");
    sb.append("    totalSizeBytes: ").append(toIndentedString(totalSizeBytes)).append("\n");
    sb.append("    successOps: ").append(toIndentedString(successOps)).append("\n");
    sb.append("    agentOpsPm: ").append(toIndentedString(agentOpsPm)).append("\n");
    sb.append("    agentSizeBytes: ").append(toIndentedString(agentSizeBytes)).append("\n");
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
