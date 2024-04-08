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
 * DfsGatewayStat records dfs gateway stat info
 */
@Schema(description = "DfsGatewayStat records dfs gateway stat info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsGatewayStat {
  @SerializedName("conn_num")
  private Long connNum = null;

  @SerializedName("cpu_util")
  private Double cpuUtil = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("ftp_conn_num")
  private Long ftpConnNum = null;

  @SerializedName("hdfs_conn_num")
  private Long hdfsConnNum = null;

  @SerializedName("mem_usage_percent")
  private Double memUsagePercent = null;

  @SerializedName("meta_delete_latency_us")
  private Double metaDeleteLatencyUs = null;

  @SerializedName("meta_delete_ops")
  private Double metaDeleteOps = null;

  @SerializedName("meta_list_latency_us")
  private Double metaListLatencyUs = null;

  @SerializedName("meta_list_ops")
  private Double metaListOps = null;

  @SerializedName("meta_read_latency_us")
  private Double metaReadLatencyUs = null;

  @SerializedName("meta_read_ops")
  private Double metaReadOps = null;

  @SerializedName("meta_trunc_latency_us")
  private Double metaTruncLatencyUs = null;

  @SerializedName("meta_trunc_ops")
  private Double metaTruncOps = null;

  @SerializedName("meta_write_latency_us")
  private Double metaWriteLatencyUs = null;

  @SerializedName("meta_write_ops")
  private Double metaWriteOps = null;

  @SerializedName("nfs_conn_num")
  private Long nfsConnNum = null;

  @SerializedName("read_bandwidth_kbyte")
  private Double readBandwidthKbyte = null;

  @SerializedName("read_iops")
  private Double readIops = null;

  @SerializedName("read_latency_us")
  private Double readLatencyUs = null;

  @SerializedName("smb_session_num")
  private Long smbSessionNum = null;

  @SerializedName("write_bandwidth_kbyte")
  private Double writeBandwidthKbyte = null;

  @SerializedName("write_iops")
  private Double writeIops = null;

  @SerializedName("write_latency_us")
  private Double writeLatencyUs = null;

  public DfsGatewayStat connNum(Long connNum) {
    this.connNum = connNum;
    return this;
  }

   /**
   * Get connNum
   * @return connNum
  **/
  @Schema(description = "")
  public Long getConnNum() {
    return connNum;
  }

  public void setConnNum(Long connNum) {
    this.connNum = connNum;
  }

  public DfsGatewayStat cpuUtil(Double cpuUtil) {
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

  public DfsGatewayStat create(OffsetDateTime create) {
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

  public DfsGatewayStat ftpConnNum(Long ftpConnNum) {
    this.ftpConnNum = ftpConnNum;
    return this;
  }

   /**
   * Get ftpConnNum
   * @return ftpConnNum
  **/
  @Schema(description = "")
  public Long getFtpConnNum() {
    return ftpConnNum;
  }

  public void setFtpConnNum(Long ftpConnNum) {
    this.ftpConnNum = ftpConnNum;
  }

  public DfsGatewayStat hdfsConnNum(Long hdfsConnNum) {
    this.hdfsConnNum = hdfsConnNum;
    return this;
  }

   /**
   * Get hdfsConnNum
   * @return hdfsConnNum
  **/
  @Schema(description = "")
  public Long getHdfsConnNum() {
    return hdfsConnNum;
  }

  public void setHdfsConnNum(Long hdfsConnNum) {
    this.hdfsConnNum = hdfsConnNum;
  }

  public DfsGatewayStat memUsagePercent(Double memUsagePercent) {
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

  public DfsGatewayStat metaDeleteLatencyUs(Double metaDeleteLatencyUs) {
    this.metaDeleteLatencyUs = metaDeleteLatencyUs;
    return this;
  }

   /**
   * Get metaDeleteLatencyUs
   * @return metaDeleteLatencyUs
  **/
  @Schema(description = "")
  public Double getMetaDeleteLatencyUs() {
    return metaDeleteLatencyUs;
  }

  public void setMetaDeleteLatencyUs(Double metaDeleteLatencyUs) {
    this.metaDeleteLatencyUs = metaDeleteLatencyUs;
  }

  public DfsGatewayStat metaDeleteOps(Double metaDeleteOps) {
    this.metaDeleteOps = metaDeleteOps;
    return this;
  }

   /**
   * Get metaDeleteOps
   * @return metaDeleteOps
  **/
  @Schema(description = "")
  public Double getMetaDeleteOps() {
    return metaDeleteOps;
  }

  public void setMetaDeleteOps(Double metaDeleteOps) {
    this.metaDeleteOps = metaDeleteOps;
  }

  public DfsGatewayStat metaListLatencyUs(Double metaListLatencyUs) {
    this.metaListLatencyUs = metaListLatencyUs;
    return this;
  }

   /**
   * Get metaListLatencyUs
   * @return metaListLatencyUs
  **/
  @Schema(description = "")
  public Double getMetaListLatencyUs() {
    return metaListLatencyUs;
  }

  public void setMetaListLatencyUs(Double metaListLatencyUs) {
    this.metaListLatencyUs = metaListLatencyUs;
  }

  public DfsGatewayStat metaListOps(Double metaListOps) {
    this.metaListOps = metaListOps;
    return this;
  }

   /**
   * Get metaListOps
   * @return metaListOps
  **/
  @Schema(description = "")
  public Double getMetaListOps() {
    return metaListOps;
  }

  public void setMetaListOps(Double metaListOps) {
    this.metaListOps = metaListOps;
  }

  public DfsGatewayStat metaReadLatencyUs(Double metaReadLatencyUs) {
    this.metaReadLatencyUs = metaReadLatencyUs;
    return this;
  }

   /**
   * Get metaReadLatencyUs
   * @return metaReadLatencyUs
  **/
  @Schema(description = "")
  public Double getMetaReadLatencyUs() {
    return metaReadLatencyUs;
  }

  public void setMetaReadLatencyUs(Double metaReadLatencyUs) {
    this.metaReadLatencyUs = metaReadLatencyUs;
  }

  public DfsGatewayStat metaReadOps(Double metaReadOps) {
    this.metaReadOps = metaReadOps;
    return this;
  }

   /**
   * Get metaReadOps
   * @return metaReadOps
  **/
  @Schema(description = "")
  public Double getMetaReadOps() {
    return metaReadOps;
  }

  public void setMetaReadOps(Double metaReadOps) {
    this.metaReadOps = metaReadOps;
  }

  public DfsGatewayStat metaTruncLatencyUs(Double metaTruncLatencyUs) {
    this.metaTruncLatencyUs = metaTruncLatencyUs;
    return this;
  }

   /**
   * Get metaTruncLatencyUs
   * @return metaTruncLatencyUs
  **/
  @Schema(description = "")
  public Double getMetaTruncLatencyUs() {
    return metaTruncLatencyUs;
  }

  public void setMetaTruncLatencyUs(Double metaTruncLatencyUs) {
    this.metaTruncLatencyUs = metaTruncLatencyUs;
  }

  public DfsGatewayStat metaTruncOps(Double metaTruncOps) {
    this.metaTruncOps = metaTruncOps;
    return this;
  }

   /**
   * Get metaTruncOps
   * @return metaTruncOps
  **/
  @Schema(description = "")
  public Double getMetaTruncOps() {
    return metaTruncOps;
  }

  public void setMetaTruncOps(Double metaTruncOps) {
    this.metaTruncOps = metaTruncOps;
  }

  public DfsGatewayStat metaWriteLatencyUs(Double metaWriteLatencyUs) {
    this.metaWriteLatencyUs = metaWriteLatencyUs;
    return this;
  }

   /**
   * Get metaWriteLatencyUs
   * @return metaWriteLatencyUs
  **/
  @Schema(description = "")
  public Double getMetaWriteLatencyUs() {
    return metaWriteLatencyUs;
  }

  public void setMetaWriteLatencyUs(Double metaWriteLatencyUs) {
    this.metaWriteLatencyUs = metaWriteLatencyUs;
  }

  public DfsGatewayStat metaWriteOps(Double metaWriteOps) {
    this.metaWriteOps = metaWriteOps;
    return this;
  }

   /**
   * Get metaWriteOps
   * @return metaWriteOps
  **/
  @Schema(description = "")
  public Double getMetaWriteOps() {
    return metaWriteOps;
  }

  public void setMetaWriteOps(Double metaWriteOps) {
    this.metaWriteOps = metaWriteOps;
  }

  public DfsGatewayStat nfsConnNum(Long nfsConnNum) {
    this.nfsConnNum = nfsConnNum;
    return this;
  }

   /**
   * Get nfsConnNum
   * @return nfsConnNum
  **/
  @Schema(description = "")
  public Long getNfsConnNum() {
    return nfsConnNum;
  }

  public void setNfsConnNum(Long nfsConnNum) {
    this.nfsConnNum = nfsConnNum;
  }

  public DfsGatewayStat readBandwidthKbyte(Double readBandwidthKbyte) {
    this.readBandwidthKbyte = readBandwidthKbyte;
    return this;
  }

   /**
   * Get readBandwidthKbyte
   * @return readBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getReadBandwidthKbyte() {
    return readBandwidthKbyte;
  }

  public void setReadBandwidthKbyte(Double readBandwidthKbyte) {
    this.readBandwidthKbyte = readBandwidthKbyte;
  }

  public DfsGatewayStat readIops(Double readIops) {
    this.readIops = readIops;
    return this;
  }

   /**
   * Get readIops
   * @return readIops
  **/
  @Schema(description = "")
  public Double getReadIops() {
    return readIops;
  }

  public void setReadIops(Double readIops) {
    this.readIops = readIops;
  }

  public DfsGatewayStat readLatencyUs(Double readLatencyUs) {
    this.readLatencyUs = readLatencyUs;
    return this;
  }

   /**
   * Get readLatencyUs
   * @return readLatencyUs
  **/
  @Schema(description = "")
  public Double getReadLatencyUs() {
    return readLatencyUs;
  }

  public void setReadLatencyUs(Double readLatencyUs) {
    this.readLatencyUs = readLatencyUs;
  }

  public DfsGatewayStat smbSessionNum(Long smbSessionNum) {
    this.smbSessionNum = smbSessionNum;
    return this;
  }

   /**
   * Get smbSessionNum
   * @return smbSessionNum
  **/
  @Schema(description = "")
  public Long getSmbSessionNum() {
    return smbSessionNum;
  }

  public void setSmbSessionNum(Long smbSessionNum) {
    this.smbSessionNum = smbSessionNum;
  }

  public DfsGatewayStat writeBandwidthKbyte(Double writeBandwidthKbyte) {
    this.writeBandwidthKbyte = writeBandwidthKbyte;
    return this;
  }

   /**
   * Get writeBandwidthKbyte
   * @return writeBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getWriteBandwidthKbyte() {
    return writeBandwidthKbyte;
  }

  public void setWriteBandwidthKbyte(Double writeBandwidthKbyte) {
    this.writeBandwidthKbyte = writeBandwidthKbyte;
  }

  public DfsGatewayStat writeIops(Double writeIops) {
    this.writeIops = writeIops;
    return this;
  }

   /**
   * Get writeIops
   * @return writeIops
  **/
  @Schema(description = "")
  public Double getWriteIops() {
    return writeIops;
  }

  public void setWriteIops(Double writeIops) {
    this.writeIops = writeIops;
  }

  public DfsGatewayStat writeLatencyUs(Double writeLatencyUs) {
    this.writeLatencyUs = writeLatencyUs;
    return this;
  }

   /**
   * Get writeLatencyUs
   * @return writeLatencyUs
  **/
  @Schema(description = "")
  public Double getWriteLatencyUs() {
    return writeLatencyUs;
  }

  public void setWriteLatencyUs(Double writeLatencyUs) {
    this.writeLatencyUs = writeLatencyUs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsGatewayStat dfsGatewayStat = (DfsGatewayStat) o;
    return Objects.equals(this.connNum, dfsGatewayStat.connNum) &&
        Objects.equals(this.cpuUtil, dfsGatewayStat.cpuUtil) &&
        Objects.equals(this.create, dfsGatewayStat.create) &&
        Objects.equals(this.ftpConnNum, dfsGatewayStat.ftpConnNum) &&
        Objects.equals(this.hdfsConnNum, dfsGatewayStat.hdfsConnNum) &&
        Objects.equals(this.memUsagePercent, dfsGatewayStat.memUsagePercent) &&
        Objects.equals(this.metaDeleteLatencyUs, dfsGatewayStat.metaDeleteLatencyUs) &&
        Objects.equals(this.metaDeleteOps, dfsGatewayStat.metaDeleteOps) &&
        Objects.equals(this.metaListLatencyUs, dfsGatewayStat.metaListLatencyUs) &&
        Objects.equals(this.metaListOps, dfsGatewayStat.metaListOps) &&
        Objects.equals(this.metaReadLatencyUs, dfsGatewayStat.metaReadLatencyUs) &&
        Objects.equals(this.metaReadOps, dfsGatewayStat.metaReadOps) &&
        Objects.equals(this.metaTruncLatencyUs, dfsGatewayStat.metaTruncLatencyUs) &&
        Objects.equals(this.metaTruncOps, dfsGatewayStat.metaTruncOps) &&
        Objects.equals(this.metaWriteLatencyUs, dfsGatewayStat.metaWriteLatencyUs) &&
        Objects.equals(this.metaWriteOps, dfsGatewayStat.metaWriteOps) &&
        Objects.equals(this.nfsConnNum, dfsGatewayStat.nfsConnNum) &&
        Objects.equals(this.readBandwidthKbyte, dfsGatewayStat.readBandwidthKbyte) &&
        Objects.equals(this.readIops, dfsGatewayStat.readIops) &&
        Objects.equals(this.readLatencyUs, dfsGatewayStat.readLatencyUs) &&
        Objects.equals(this.smbSessionNum, dfsGatewayStat.smbSessionNum) &&
        Objects.equals(this.writeBandwidthKbyte, dfsGatewayStat.writeBandwidthKbyte) &&
        Objects.equals(this.writeIops, dfsGatewayStat.writeIops) &&
        Objects.equals(this.writeLatencyUs, dfsGatewayStat.writeLatencyUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connNum, cpuUtil, create, ftpConnNum, hdfsConnNum, memUsagePercent, metaDeleteLatencyUs, metaDeleteOps, metaListLatencyUs, metaListOps, metaReadLatencyUs, metaReadOps, metaTruncLatencyUs, metaTruncOps, metaWriteLatencyUs, metaWriteOps, nfsConnNum, readBandwidthKbyte, readIops, readLatencyUs, smbSessionNum, writeBandwidthKbyte, writeIops, writeLatencyUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsGatewayStat {\n");
    
    sb.append("    connNum: ").append(toIndentedString(connNum)).append("\n");
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    ftpConnNum: ").append(toIndentedString(ftpConnNum)).append("\n");
    sb.append("    hdfsConnNum: ").append(toIndentedString(hdfsConnNum)).append("\n");
    sb.append("    memUsagePercent: ").append(toIndentedString(memUsagePercent)).append("\n");
    sb.append("    metaDeleteLatencyUs: ").append(toIndentedString(metaDeleteLatencyUs)).append("\n");
    sb.append("    metaDeleteOps: ").append(toIndentedString(metaDeleteOps)).append("\n");
    sb.append("    metaListLatencyUs: ").append(toIndentedString(metaListLatencyUs)).append("\n");
    sb.append("    metaListOps: ").append(toIndentedString(metaListOps)).append("\n");
    sb.append("    metaReadLatencyUs: ").append(toIndentedString(metaReadLatencyUs)).append("\n");
    sb.append("    metaReadOps: ").append(toIndentedString(metaReadOps)).append("\n");
    sb.append("    metaTruncLatencyUs: ").append(toIndentedString(metaTruncLatencyUs)).append("\n");
    sb.append("    metaTruncOps: ").append(toIndentedString(metaTruncOps)).append("\n");
    sb.append("    metaWriteLatencyUs: ").append(toIndentedString(metaWriteLatencyUs)).append("\n");
    sb.append("    metaWriteOps: ").append(toIndentedString(metaWriteOps)).append("\n");
    sb.append("    nfsConnNum: ").append(toIndentedString(nfsConnNum)).append("\n");
    sb.append("    readBandwidthKbyte: ").append(toIndentedString(readBandwidthKbyte)).append("\n");
    sb.append("    readIops: ").append(toIndentedString(readIops)).append("\n");
    sb.append("    readLatencyUs: ").append(toIndentedString(readLatencyUs)).append("\n");
    sb.append("    smbSessionNum: ").append(toIndentedString(smbSessionNum)).append("\n");
    sb.append("    writeBandwidthKbyte: ").append(toIndentedString(writeBandwidthKbyte)).append("\n");
    sb.append("    writeIops: ").append(toIndentedString(writeIops)).append("\n");
    sb.append("    writeLatencyUs: ").append(toIndentedString(writeLatencyUs)).append("\n");
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