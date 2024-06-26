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
 * S3LoadBalancerStat define s3 load balancer stat info
 */
@Schema(description = "S3LoadBalancerStat define s3 load balancer stat info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancerStat {
  @SerializedName("active_connections")
  private Double activeConnections = null;

  @SerializedName("backend_down_bandwidth_kbyte")
  private Double backendDownBandwidthKbyte = null;

  @SerializedName("backend_download_iops")
  private Double backendDownloadIops = null;

  @SerializedName("backend_up_bandwidth_kbyte")
  private Double backendUpBandwidthKbyte = null;

  @SerializedName("backend_upload_iops")
  private Double backendUploadIops = null;

  @SerializedName("cpu_util")
  private Double cpuUtil = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("down_bandwidth_kbyte")
  private Double downBandwidthKbyte = null;

  @SerializedName("download_iops")
  private Double downloadIops = null;

  @SerializedName("failure_requests")
  private Double failureRequests = null;

  @SerializedName("mem_usage_percent")
  private Double memUsagePercent = null;

  @SerializedName("success_requests")
  private Double successRequests = null;

  @SerializedName("up_bandwidth_kbyte")
  private Double upBandwidthKbyte = null;

  @SerializedName("upload_iops")
  private Double uploadIops = null;

  public S3LoadBalancerStat activeConnections(Double activeConnections) {
    this.activeConnections = activeConnections;
    return this;
  }

   /**
   * Get activeConnections
   * @return activeConnections
  **/
  @Schema(description = "")
  public Double getActiveConnections() {
    return activeConnections;
  }

  public void setActiveConnections(Double activeConnections) {
    this.activeConnections = activeConnections;
  }

  public S3LoadBalancerStat backendDownBandwidthKbyte(Double backendDownBandwidthKbyte) {
    this.backendDownBandwidthKbyte = backendDownBandwidthKbyte;
    return this;
  }

   /**
   * Get backendDownBandwidthKbyte
   * @return backendDownBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getBackendDownBandwidthKbyte() {
    return backendDownBandwidthKbyte;
  }

  public void setBackendDownBandwidthKbyte(Double backendDownBandwidthKbyte) {
    this.backendDownBandwidthKbyte = backendDownBandwidthKbyte;
  }

  public S3LoadBalancerStat backendDownloadIops(Double backendDownloadIops) {
    this.backendDownloadIops = backendDownloadIops;
    return this;
  }

   /**
   * Get backendDownloadIops
   * @return backendDownloadIops
  **/
  @Schema(description = "")
  public Double getBackendDownloadIops() {
    return backendDownloadIops;
  }

  public void setBackendDownloadIops(Double backendDownloadIops) {
    this.backendDownloadIops = backendDownloadIops;
  }

  public S3LoadBalancerStat backendUpBandwidthKbyte(Double backendUpBandwidthKbyte) {
    this.backendUpBandwidthKbyte = backendUpBandwidthKbyte;
    return this;
  }

   /**
   * Get backendUpBandwidthKbyte
   * @return backendUpBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getBackendUpBandwidthKbyte() {
    return backendUpBandwidthKbyte;
  }

  public void setBackendUpBandwidthKbyte(Double backendUpBandwidthKbyte) {
    this.backendUpBandwidthKbyte = backendUpBandwidthKbyte;
  }

  public S3LoadBalancerStat backendUploadIops(Double backendUploadIops) {
    this.backendUploadIops = backendUploadIops;
    return this;
  }

   /**
   * Get backendUploadIops
   * @return backendUploadIops
  **/
  @Schema(description = "")
  public Double getBackendUploadIops() {
    return backendUploadIops;
  }

  public void setBackendUploadIops(Double backendUploadIops) {
    this.backendUploadIops = backendUploadIops;
  }

  public S3LoadBalancerStat cpuUtil(Double cpuUtil) {
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

  public S3LoadBalancerStat create(OffsetDateTime create) {
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

  public S3LoadBalancerStat downBandwidthKbyte(Double downBandwidthKbyte) {
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

  public S3LoadBalancerStat downloadIops(Double downloadIops) {
    this.downloadIops = downloadIops;
    return this;
  }

   /**
   * Get downloadIops
   * @return downloadIops
  **/
  @Schema(description = "")
  public Double getDownloadIops() {
    return downloadIops;
  }

  public void setDownloadIops(Double downloadIops) {
    this.downloadIops = downloadIops;
  }

  public S3LoadBalancerStat failureRequests(Double failureRequests) {
    this.failureRequests = failureRequests;
    return this;
  }

   /**
   * Get failureRequests
   * @return failureRequests
  **/
  @Schema(description = "")
  public Double getFailureRequests() {
    return failureRequests;
  }

  public void setFailureRequests(Double failureRequests) {
    this.failureRequests = failureRequests;
  }

  public S3LoadBalancerStat memUsagePercent(Double memUsagePercent) {
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

  public S3LoadBalancerStat successRequests(Double successRequests) {
    this.successRequests = successRequests;
    return this;
  }

   /**
   * Get successRequests
   * @return successRequests
  **/
  @Schema(description = "")
  public Double getSuccessRequests() {
    return successRequests;
  }

  public void setSuccessRequests(Double successRequests) {
    this.successRequests = successRequests;
  }

  public S3LoadBalancerStat upBandwidthKbyte(Double upBandwidthKbyte) {
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

  public S3LoadBalancerStat uploadIops(Double uploadIops) {
    this.uploadIops = uploadIops;
    return this;
  }

   /**
   * Get uploadIops
   * @return uploadIops
  **/
  @Schema(description = "")
  public Double getUploadIops() {
    return uploadIops;
  }

  public void setUploadIops(Double uploadIops) {
    this.uploadIops = uploadIops;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancerStat s3LoadBalancerStat = (S3LoadBalancerStat) o;
    return Objects.equals(this.activeConnections, s3LoadBalancerStat.activeConnections) &&
        Objects.equals(this.backendDownBandwidthKbyte, s3LoadBalancerStat.backendDownBandwidthKbyte) &&
        Objects.equals(this.backendDownloadIops, s3LoadBalancerStat.backendDownloadIops) &&
        Objects.equals(this.backendUpBandwidthKbyte, s3LoadBalancerStat.backendUpBandwidthKbyte) &&
        Objects.equals(this.backendUploadIops, s3LoadBalancerStat.backendUploadIops) &&
        Objects.equals(this.cpuUtil, s3LoadBalancerStat.cpuUtil) &&
        Objects.equals(this.create, s3LoadBalancerStat.create) &&
        Objects.equals(this.downBandwidthKbyte, s3LoadBalancerStat.downBandwidthKbyte) &&
        Objects.equals(this.downloadIops, s3LoadBalancerStat.downloadIops) &&
        Objects.equals(this.failureRequests, s3LoadBalancerStat.failureRequests) &&
        Objects.equals(this.memUsagePercent, s3LoadBalancerStat.memUsagePercent) &&
        Objects.equals(this.successRequests, s3LoadBalancerStat.successRequests) &&
        Objects.equals(this.upBandwidthKbyte, s3LoadBalancerStat.upBandwidthKbyte) &&
        Objects.equals(this.uploadIops, s3LoadBalancerStat.uploadIops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeConnections, backendDownBandwidthKbyte, backendDownloadIops, backendUpBandwidthKbyte, backendUploadIops, cpuUtil, create, downBandwidthKbyte, downloadIops, failureRequests, memUsagePercent, successRequests, upBandwidthKbyte, uploadIops);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancerStat {\n");
    
    sb.append("    activeConnections: ").append(toIndentedString(activeConnections)).append("\n");
    sb.append("    backendDownBandwidthKbyte: ").append(toIndentedString(backendDownBandwidthKbyte)).append("\n");
    sb.append("    backendDownloadIops: ").append(toIndentedString(backendDownloadIops)).append("\n");
    sb.append("    backendUpBandwidthKbyte: ").append(toIndentedString(backendUpBandwidthKbyte)).append("\n");
    sb.append("    backendUploadIops: ").append(toIndentedString(backendUploadIops)).append("\n");
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    downBandwidthKbyte: ").append(toIndentedString(downBandwidthKbyte)).append("\n");
    sb.append("    downloadIops: ").append(toIndentedString(downloadIops)).append("\n");
    sb.append("    failureRequests: ").append(toIndentedString(failureRequests)).append("\n");
    sb.append("    memUsagePercent: ").append(toIndentedString(memUsagePercent)).append("\n");
    sb.append("    successRequests: ").append(toIndentedString(successRequests)).append("\n");
    sb.append("    upBandwidthKbyte: ").append(toIndentedString(upBandwidthKbyte)).append("\n");
    sb.append("    uploadIops: ").append(toIndentedString(uploadIops)).append("\n");
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
