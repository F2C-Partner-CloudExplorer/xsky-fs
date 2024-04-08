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
 * OSSearchGatewayStat defines model os OS search gateway stat
 */
@Schema(description = "OSSearchGatewayStat defines model os OS search gateway stat")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSSearchGatewayStat {
  @SerializedName("cpu_util")
  private Double cpuUtil = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("mem_usage_percent")
  private Double memUsagePercent = null;

  @SerializedName("read_bandwidth_kbyte")
  private Double readBandwidthKbyte = null;

  @SerializedName("read_iops")
  private Double readIops = null;

  @SerializedName("read_latency_us")
  private Double readLatencyUs = null;

  @SerializedName("write_bandwidth_kbyte")
  private Double writeBandwidthKbyte = null;

  @SerializedName("write_iops")
  private Double writeIops = null;

  @SerializedName("write_latency_us")
  private Double writeLatencyUs = null;

  public OSSearchGatewayStat cpuUtil(Double cpuUtil) {
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

  public OSSearchGatewayStat create(OffsetDateTime create) {
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

  public OSSearchGatewayStat memUsagePercent(Double memUsagePercent) {
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

  public OSSearchGatewayStat readBandwidthKbyte(Double readBandwidthKbyte) {
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

  public OSSearchGatewayStat readIops(Double readIops) {
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

  public OSSearchGatewayStat readLatencyUs(Double readLatencyUs) {
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

  public OSSearchGatewayStat writeBandwidthKbyte(Double writeBandwidthKbyte) {
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

  public OSSearchGatewayStat writeIops(Double writeIops) {
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

  public OSSearchGatewayStat writeLatencyUs(Double writeLatencyUs) {
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
    OSSearchGatewayStat osSearchGatewayStat = (OSSearchGatewayStat) o;
    return Objects.equals(this.cpuUtil, osSearchGatewayStat.cpuUtil) &&
        Objects.equals(this.create, osSearchGatewayStat.create) &&
        Objects.equals(this.memUsagePercent, osSearchGatewayStat.memUsagePercent) &&
        Objects.equals(this.readBandwidthKbyte, osSearchGatewayStat.readBandwidthKbyte) &&
        Objects.equals(this.readIops, osSearchGatewayStat.readIops) &&
        Objects.equals(this.readLatencyUs, osSearchGatewayStat.readLatencyUs) &&
        Objects.equals(this.writeBandwidthKbyte, osSearchGatewayStat.writeBandwidthKbyte) &&
        Objects.equals(this.writeIops, osSearchGatewayStat.writeIops) &&
        Objects.equals(this.writeLatencyUs, osSearchGatewayStat.writeLatencyUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUtil, create, memUsagePercent, readBandwidthKbyte, readIops, readLatencyUs, writeBandwidthKbyte, writeIops, writeLatencyUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSearchGatewayStat {\n");
    
    sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    memUsagePercent: ").append(toIndentedString(memUsagePercent)).append("\n");
    sb.append("    readBandwidthKbyte: ").append(toIndentedString(readBandwidthKbyte)).append("\n");
    sb.append("    readIops: ").append(toIndentedString(readIops)).append("\n");
    sb.append("    readLatencyUs: ").append(toIndentedString(readLatencyUs)).append("\n");
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