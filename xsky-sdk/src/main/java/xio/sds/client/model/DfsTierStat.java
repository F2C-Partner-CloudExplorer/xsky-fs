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
 * DfsTierStat records dfs tier stat info
 */
@Schema(description = "DfsTierStat records dfs tier stat info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsTierStat {
  @SerializedName("actual_kbyte")
  private Long actualKbyte = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("data_kbyte")
  private Long dataKbyte = null;

  @SerializedName("degraded_percent")
  private Double degradedPercent = null;

  @SerializedName("healthy_percent")
  private Double healthyPercent = null;

  @SerializedName("read_bandwidth_kbyte")
  private Double readBandwidthKbyte = null;

  @SerializedName("read_iops")
  private Double readIops = null;

  @SerializedName("read_latency_us")
  private Double readLatencyUs = null;

  @SerializedName("recovery_bandwidth_kbyte")
  private Double recoveryBandwidthKbyte = null;

  @SerializedName("recovery_iops")
  private Double recoveryIops = null;

  @SerializedName("recovery_percent")
  private Double recoveryPercent = null;

  @SerializedName("total_kbyte")
  private Long totalKbyte = null;

  @SerializedName("unavailable_percent")
  private Double unavailablePercent = null;

  @SerializedName("used_kbyte")
  private Long usedKbyte = null;

  @SerializedName("write_bandwidth_kbyte")
  private Double writeBandwidthKbyte = null;

  @SerializedName("write_iops")
  private Double writeIops = null;

  @SerializedName("write_latency_us")
  private Double writeLatencyUs = null;

  public DfsTierStat actualKbyte(Long actualKbyte) {
    this.actualKbyte = actualKbyte;
    return this;
  }

   /**
   * Get actualKbyte
   * @return actualKbyte
  **/
  @Schema(description = "")
  public Long getActualKbyte() {
    return actualKbyte;
  }

  public void setActualKbyte(Long actualKbyte) {
    this.actualKbyte = actualKbyte;
  }

  public DfsTierStat create(OffsetDateTime create) {
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

  public DfsTierStat dataKbyte(Long dataKbyte) {
    this.dataKbyte = dataKbyte;
    return this;
  }

   /**
   * Get dataKbyte
   * @return dataKbyte
  **/
  @Schema(description = "")
  public Long getDataKbyte() {
    return dataKbyte;
  }

  public void setDataKbyte(Long dataKbyte) {
    this.dataKbyte = dataKbyte;
  }

  public DfsTierStat degradedPercent(Double degradedPercent) {
    this.degradedPercent = degradedPercent;
    return this;
  }

   /**
   * Get degradedPercent
   * @return degradedPercent
  **/
  @Schema(description = "")
  public Double getDegradedPercent() {
    return degradedPercent;
  }

  public void setDegradedPercent(Double degradedPercent) {
    this.degradedPercent = degradedPercent;
  }

  public DfsTierStat healthyPercent(Double healthyPercent) {
    this.healthyPercent = healthyPercent;
    return this;
  }

   /**
   * Get healthyPercent
   * @return healthyPercent
  **/
  @Schema(description = "")
  public Double getHealthyPercent() {
    return healthyPercent;
  }

  public void setHealthyPercent(Double healthyPercent) {
    this.healthyPercent = healthyPercent;
  }

  public DfsTierStat readBandwidthKbyte(Double readBandwidthKbyte) {
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

  public DfsTierStat readIops(Double readIops) {
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

  public DfsTierStat readLatencyUs(Double readLatencyUs) {
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

  public DfsTierStat recoveryBandwidthKbyte(Double recoveryBandwidthKbyte) {
    this.recoveryBandwidthKbyte = recoveryBandwidthKbyte;
    return this;
  }

   /**
   * Get recoveryBandwidthKbyte
   * @return recoveryBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getRecoveryBandwidthKbyte() {
    return recoveryBandwidthKbyte;
  }

  public void setRecoveryBandwidthKbyte(Double recoveryBandwidthKbyte) {
    this.recoveryBandwidthKbyte = recoveryBandwidthKbyte;
  }

  public DfsTierStat recoveryIops(Double recoveryIops) {
    this.recoveryIops = recoveryIops;
    return this;
  }

   /**
   * Get recoveryIops
   * @return recoveryIops
  **/
  @Schema(description = "")
  public Double getRecoveryIops() {
    return recoveryIops;
  }

  public void setRecoveryIops(Double recoveryIops) {
    this.recoveryIops = recoveryIops;
  }

  public DfsTierStat recoveryPercent(Double recoveryPercent) {
    this.recoveryPercent = recoveryPercent;
    return this;
  }

   /**
   * Get recoveryPercent
   * @return recoveryPercent
  **/
  @Schema(description = "")
  public Double getRecoveryPercent() {
    return recoveryPercent;
  }

  public void setRecoveryPercent(Double recoveryPercent) {
    this.recoveryPercent = recoveryPercent;
  }

  public DfsTierStat totalKbyte(Long totalKbyte) {
    this.totalKbyte = totalKbyte;
    return this;
  }

   /**
   * Get totalKbyte
   * @return totalKbyte
  **/
  @Schema(description = "")
  public Long getTotalKbyte() {
    return totalKbyte;
  }

  public void setTotalKbyte(Long totalKbyte) {
    this.totalKbyte = totalKbyte;
  }

  public DfsTierStat unavailablePercent(Double unavailablePercent) {
    this.unavailablePercent = unavailablePercent;
    return this;
  }

   /**
   * Get unavailablePercent
   * @return unavailablePercent
  **/
  @Schema(description = "")
  public Double getUnavailablePercent() {
    return unavailablePercent;
  }

  public void setUnavailablePercent(Double unavailablePercent) {
    this.unavailablePercent = unavailablePercent;
  }

  public DfsTierStat usedKbyte(Long usedKbyte) {
    this.usedKbyte = usedKbyte;
    return this;
  }

   /**
   * Get usedKbyte
   * @return usedKbyte
  **/
  @Schema(description = "")
  public Long getUsedKbyte() {
    return usedKbyte;
  }

  public void setUsedKbyte(Long usedKbyte) {
    this.usedKbyte = usedKbyte;
  }

  public DfsTierStat writeBandwidthKbyte(Double writeBandwidthKbyte) {
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

  public DfsTierStat writeIops(Double writeIops) {
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

  public DfsTierStat writeLatencyUs(Double writeLatencyUs) {
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
    DfsTierStat dfsTierStat = (DfsTierStat) o;
    return Objects.equals(this.actualKbyte, dfsTierStat.actualKbyte) &&
        Objects.equals(this.create, dfsTierStat.create) &&
        Objects.equals(this.dataKbyte, dfsTierStat.dataKbyte) &&
        Objects.equals(this.degradedPercent, dfsTierStat.degradedPercent) &&
        Objects.equals(this.healthyPercent, dfsTierStat.healthyPercent) &&
        Objects.equals(this.readBandwidthKbyte, dfsTierStat.readBandwidthKbyte) &&
        Objects.equals(this.readIops, dfsTierStat.readIops) &&
        Objects.equals(this.readLatencyUs, dfsTierStat.readLatencyUs) &&
        Objects.equals(this.recoveryBandwidthKbyte, dfsTierStat.recoveryBandwidthKbyte) &&
        Objects.equals(this.recoveryIops, dfsTierStat.recoveryIops) &&
        Objects.equals(this.recoveryPercent, dfsTierStat.recoveryPercent) &&
        Objects.equals(this.totalKbyte, dfsTierStat.totalKbyte) &&
        Objects.equals(this.unavailablePercent, dfsTierStat.unavailablePercent) &&
        Objects.equals(this.usedKbyte, dfsTierStat.usedKbyte) &&
        Objects.equals(this.writeBandwidthKbyte, dfsTierStat.writeBandwidthKbyte) &&
        Objects.equals(this.writeIops, dfsTierStat.writeIops) &&
        Objects.equals(this.writeLatencyUs, dfsTierStat.writeLatencyUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualKbyte, create, dataKbyte, degradedPercent, healthyPercent, readBandwidthKbyte, readIops, readLatencyUs, recoveryBandwidthKbyte, recoveryIops, recoveryPercent, totalKbyte, unavailablePercent, usedKbyte, writeBandwidthKbyte, writeIops, writeLatencyUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsTierStat {\n");
    
    sb.append("    actualKbyte: ").append(toIndentedString(actualKbyte)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dataKbyte: ").append(toIndentedString(dataKbyte)).append("\n");
    sb.append("    degradedPercent: ").append(toIndentedString(degradedPercent)).append("\n");
    sb.append("    healthyPercent: ").append(toIndentedString(healthyPercent)).append("\n");
    sb.append("    readBandwidthKbyte: ").append(toIndentedString(readBandwidthKbyte)).append("\n");
    sb.append("    readIops: ").append(toIndentedString(readIops)).append("\n");
    sb.append("    readLatencyUs: ").append(toIndentedString(readLatencyUs)).append("\n");
    sb.append("    recoveryBandwidthKbyte: ").append(toIndentedString(recoveryBandwidthKbyte)).append("\n");
    sb.append("    recoveryIops: ").append(toIndentedString(recoveryIops)).append("\n");
    sb.append("    recoveryPercent: ").append(toIndentedString(recoveryPercent)).append("\n");
    sb.append("    totalKbyte: ").append(toIndentedString(totalKbyte)).append("\n");
    sb.append("    unavailablePercent: ").append(toIndentedString(unavailablePercent)).append("\n");
    sb.append("    usedKbyte: ").append(toIndentedString(usedKbyte)).append("\n");
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
