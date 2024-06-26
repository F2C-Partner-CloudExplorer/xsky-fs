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
 * DfsRootfsStat records dfs rootfs stat info
 */
@Schema(description = "DfsRootfsStat records dfs rootfs stat info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsRootfsStat {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("data_delete_bandwidth_kbyte")
  private Long dataDeleteBandwidthKbyte = null;

  @SerializedName("data_delete_iops")
  private Long dataDeleteIops = null;

  @SerializedName("data_delete_latency_us")
  private Long dataDeleteLatencyUs = null;

  @SerializedName("data_read_bandwidth_kbyte")
  private Long dataReadBandwidthKbyte = null;

  @SerializedName("data_read_iops")
  private Long dataReadIops = null;

  @SerializedName("data_read_latency_us")
  private Long dataReadLatencyUs = null;

  @SerializedName("data_write_bandwidth_kbyte")
  private Long dataWriteBandwidthKbyte = null;

  @SerializedName("data_write_iops")
  private Long dataWriteIops = null;

  @SerializedName("data_write_latency_us")
  private Long dataWriteLatencyUs = null;

  @SerializedName("meta_delete_iops")
  private Long metaDeleteIops = null;

  @SerializedName("meta_delete_latency_us")
  private Long metaDeleteLatencyUs = null;

  @SerializedName("meta_list_iops")
  private Long metaListIops = null;

  @SerializedName("meta_list_latency_us")
  private Long metaListLatencyUs = null;

  @SerializedName("meta_read_iops")
  private Long metaReadIops = null;

  @SerializedName("meta_read_latency_us")
  private Long metaReadLatencyUs = null;

  @SerializedName("meta_write_iops")
  private Long metaWriteIops = null;

  @SerializedName("meta_write_latency_us")
  private Long metaWriteLatencyUs = null;

  public DfsRootfsStat create(OffsetDateTime create) {
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

  public DfsRootfsStat dataDeleteBandwidthKbyte(Long dataDeleteBandwidthKbyte) {
    this.dataDeleteBandwidthKbyte = dataDeleteBandwidthKbyte;
    return this;
  }

   /**
   * Get dataDeleteBandwidthKbyte
   * @return dataDeleteBandwidthKbyte
  **/
  @Schema(description = "")
  public Long getDataDeleteBandwidthKbyte() {
    return dataDeleteBandwidthKbyte;
  }

  public void setDataDeleteBandwidthKbyte(Long dataDeleteBandwidthKbyte) {
    this.dataDeleteBandwidthKbyte = dataDeleteBandwidthKbyte;
  }

  public DfsRootfsStat dataDeleteIops(Long dataDeleteIops) {
    this.dataDeleteIops = dataDeleteIops;
    return this;
  }

   /**
   * Get dataDeleteIops
   * @return dataDeleteIops
  **/
  @Schema(description = "")
  public Long getDataDeleteIops() {
    return dataDeleteIops;
  }

  public void setDataDeleteIops(Long dataDeleteIops) {
    this.dataDeleteIops = dataDeleteIops;
  }

  public DfsRootfsStat dataDeleteLatencyUs(Long dataDeleteLatencyUs) {
    this.dataDeleteLatencyUs = dataDeleteLatencyUs;
    return this;
  }

   /**
   * Get dataDeleteLatencyUs
   * @return dataDeleteLatencyUs
  **/
  @Schema(description = "")
  public Long getDataDeleteLatencyUs() {
    return dataDeleteLatencyUs;
  }

  public void setDataDeleteLatencyUs(Long dataDeleteLatencyUs) {
    this.dataDeleteLatencyUs = dataDeleteLatencyUs;
  }

  public DfsRootfsStat dataReadBandwidthKbyte(Long dataReadBandwidthKbyte) {
    this.dataReadBandwidthKbyte = dataReadBandwidthKbyte;
    return this;
  }

   /**
   * Get dataReadBandwidthKbyte
   * @return dataReadBandwidthKbyte
  **/
  @Schema(description = "")
  public Long getDataReadBandwidthKbyte() {
    return dataReadBandwidthKbyte;
  }

  public void setDataReadBandwidthKbyte(Long dataReadBandwidthKbyte) {
    this.dataReadBandwidthKbyte = dataReadBandwidthKbyte;
  }

  public DfsRootfsStat dataReadIops(Long dataReadIops) {
    this.dataReadIops = dataReadIops;
    return this;
  }

   /**
   * Get dataReadIops
   * @return dataReadIops
  **/
  @Schema(description = "")
  public Long getDataReadIops() {
    return dataReadIops;
  }

  public void setDataReadIops(Long dataReadIops) {
    this.dataReadIops = dataReadIops;
  }

  public DfsRootfsStat dataReadLatencyUs(Long dataReadLatencyUs) {
    this.dataReadLatencyUs = dataReadLatencyUs;
    return this;
  }

   /**
   * Get dataReadLatencyUs
   * @return dataReadLatencyUs
  **/
  @Schema(description = "")
  public Long getDataReadLatencyUs() {
    return dataReadLatencyUs;
  }

  public void setDataReadLatencyUs(Long dataReadLatencyUs) {
    this.dataReadLatencyUs = dataReadLatencyUs;
  }

  public DfsRootfsStat dataWriteBandwidthKbyte(Long dataWriteBandwidthKbyte) {
    this.dataWriteBandwidthKbyte = dataWriteBandwidthKbyte;
    return this;
  }

   /**
   * Get dataWriteBandwidthKbyte
   * @return dataWriteBandwidthKbyte
  **/
  @Schema(description = "")
  public Long getDataWriteBandwidthKbyte() {
    return dataWriteBandwidthKbyte;
  }

  public void setDataWriteBandwidthKbyte(Long dataWriteBandwidthKbyte) {
    this.dataWriteBandwidthKbyte = dataWriteBandwidthKbyte;
  }

  public DfsRootfsStat dataWriteIops(Long dataWriteIops) {
    this.dataWriteIops = dataWriteIops;
    return this;
  }

   /**
   * Get dataWriteIops
   * @return dataWriteIops
  **/
  @Schema(description = "")
  public Long getDataWriteIops() {
    return dataWriteIops;
  }

  public void setDataWriteIops(Long dataWriteIops) {
    this.dataWriteIops = dataWriteIops;
  }

  public DfsRootfsStat dataWriteLatencyUs(Long dataWriteLatencyUs) {
    this.dataWriteLatencyUs = dataWriteLatencyUs;
    return this;
  }

   /**
   * Get dataWriteLatencyUs
   * @return dataWriteLatencyUs
  **/
  @Schema(description = "")
  public Long getDataWriteLatencyUs() {
    return dataWriteLatencyUs;
  }

  public void setDataWriteLatencyUs(Long dataWriteLatencyUs) {
    this.dataWriteLatencyUs = dataWriteLatencyUs;
  }

  public DfsRootfsStat metaDeleteIops(Long metaDeleteIops) {
    this.metaDeleteIops = metaDeleteIops;
    return this;
  }

   /**
   * Get metaDeleteIops
   * @return metaDeleteIops
  **/
  @Schema(description = "")
  public Long getMetaDeleteIops() {
    return metaDeleteIops;
  }

  public void setMetaDeleteIops(Long metaDeleteIops) {
    this.metaDeleteIops = metaDeleteIops;
  }

  public DfsRootfsStat metaDeleteLatencyUs(Long metaDeleteLatencyUs) {
    this.metaDeleteLatencyUs = metaDeleteLatencyUs;
    return this;
  }

   /**
   * Get metaDeleteLatencyUs
   * @return metaDeleteLatencyUs
  **/
  @Schema(description = "")
  public Long getMetaDeleteLatencyUs() {
    return metaDeleteLatencyUs;
  }

  public void setMetaDeleteLatencyUs(Long metaDeleteLatencyUs) {
    this.metaDeleteLatencyUs = metaDeleteLatencyUs;
  }

  public DfsRootfsStat metaListIops(Long metaListIops) {
    this.metaListIops = metaListIops;
    return this;
  }

   /**
   * Get metaListIops
   * @return metaListIops
  **/
  @Schema(description = "")
  public Long getMetaListIops() {
    return metaListIops;
  }

  public void setMetaListIops(Long metaListIops) {
    this.metaListIops = metaListIops;
  }

  public DfsRootfsStat metaListLatencyUs(Long metaListLatencyUs) {
    this.metaListLatencyUs = metaListLatencyUs;
    return this;
  }

   /**
   * Get metaListLatencyUs
   * @return metaListLatencyUs
  **/
  @Schema(description = "")
  public Long getMetaListLatencyUs() {
    return metaListLatencyUs;
  }

  public void setMetaListLatencyUs(Long metaListLatencyUs) {
    this.metaListLatencyUs = metaListLatencyUs;
  }

  public DfsRootfsStat metaReadIops(Long metaReadIops) {
    this.metaReadIops = metaReadIops;
    return this;
  }

   /**
   * Get metaReadIops
   * @return metaReadIops
  **/
  @Schema(description = "")
  public Long getMetaReadIops() {
    return metaReadIops;
  }

  public void setMetaReadIops(Long metaReadIops) {
    this.metaReadIops = metaReadIops;
  }

  public DfsRootfsStat metaReadLatencyUs(Long metaReadLatencyUs) {
    this.metaReadLatencyUs = metaReadLatencyUs;
    return this;
  }

   /**
   * Get metaReadLatencyUs
   * @return metaReadLatencyUs
  **/
  @Schema(description = "")
  public Long getMetaReadLatencyUs() {
    return metaReadLatencyUs;
  }

  public void setMetaReadLatencyUs(Long metaReadLatencyUs) {
    this.metaReadLatencyUs = metaReadLatencyUs;
  }

  public DfsRootfsStat metaWriteIops(Long metaWriteIops) {
    this.metaWriteIops = metaWriteIops;
    return this;
  }

   /**
   * Get metaWriteIops
   * @return metaWriteIops
  **/
  @Schema(description = "")
  public Long getMetaWriteIops() {
    return metaWriteIops;
  }

  public void setMetaWriteIops(Long metaWriteIops) {
    this.metaWriteIops = metaWriteIops;
  }

  public DfsRootfsStat metaWriteLatencyUs(Long metaWriteLatencyUs) {
    this.metaWriteLatencyUs = metaWriteLatencyUs;
    return this;
  }

   /**
   * Get metaWriteLatencyUs
   * @return metaWriteLatencyUs
  **/
  @Schema(description = "")
  public Long getMetaWriteLatencyUs() {
    return metaWriteLatencyUs;
  }

  public void setMetaWriteLatencyUs(Long metaWriteLatencyUs) {
    this.metaWriteLatencyUs = metaWriteLatencyUs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsRootfsStat dfsRootfsStat = (DfsRootfsStat) o;
    return Objects.equals(this.create, dfsRootfsStat.create) &&
        Objects.equals(this.dataDeleteBandwidthKbyte, dfsRootfsStat.dataDeleteBandwidthKbyte) &&
        Objects.equals(this.dataDeleteIops, dfsRootfsStat.dataDeleteIops) &&
        Objects.equals(this.dataDeleteLatencyUs, dfsRootfsStat.dataDeleteLatencyUs) &&
        Objects.equals(this.dataReadBandwidthKbyte, dfsRootfsStat.dataReadBandwidthKbyte) &&
        Objects.equals(this.dataReadIops, dfsRootfsStat.dataReadIops) &&
        Objects.equals(this.dataReadLatencyUs, dfsRootfsStat.dataReadLatencyUs) &&
        Objects.equals(this.dataWriteBandwidthKbyte, dfsRootfsStat.dataWriteBandwidthKbyte) &&
        Objects.equals(this.dataWriteIops, dfsRootfsStat.dataWriteIops) &&
        Objects.equals(this.dataWriteLatencyUs, dfsRootfsStat.dataWriteLatencyUs) &&
        Objects.equals(this.metaDeleteIops, dfsRootfsStat.metaDeleteIops) &&
        Objects.equals(this.metaDeleteLatencyUs, dfsRootfsStat.metaDeleteLatencyUs) &&
        Objects.equals(this.metaListIops, dfsRootfsStat.metaListIops) &&
        Objects.equals(this.metaListLatencyUs, dfsRootfsStat.metaListLatencyUs) &&
        Objects.equals(this.metaReadIops, dfsRootfsStat.metaReadIops) &&
        Objects.equals(this.metaReadLatencyUs, dfsRootfsStat.metaReadLatencyUs) &&
        Objects.equals(this.metaWriteIops, dfsRootfsStat.metaWriteIops) &&
        Objects.equals(this.metaWriteLatencyUs, dfsRootfsStat.metaWriteLatencyUs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, dataDeleteBandwidthKbyte, dataDeleteIops, dataDeleteLatencyUs, dataReadBandwidthKbyte, dataReadIops, dataReadLatencyUs, dataWriteBandwidthKbyte, dataWriteIops, dataWriteLatencyUs, metaDeleteIops, metaDeleteLatencyUs, metaListIops, metaListLatencyUs, metaReadIops, metaReadLatencyUs, metaWriteIops, metaWriteLatencyUs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsRootfsStat {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dataDeleteBandwidthKbyte: ").append(toIndentedString(dataDeleteBandwidthKbyte)).append("\n");
    sb.append("    dataDeleteIops: ").append(toIndentedString(dataDeleteIops)).append("\n");
    sb.append("    dataDeleteLatencyUs: ").append(toIndentedString(dataDeleteLatencyUs)).append("\n");
    sb.append("    dataReadBandwidthKbyte: ").append(toIndentedString(dataReadBandwidthKbyte)).append("\n");
    sb.append("    dataReadIops: ").append(toIndentedString(dataReadIops)).append("\n");
    sb.append("    dataReadLatencyUs: ").append(toIndentedString(dataReadLatencyUs)).append("\n");
    sb.append("    dataWriteBandwidthKbyte: ").append(toIndentedString(dataWriteBandwidthKbyte)).append("\n");
    sb.append("    dataWriteIops: ").append(toIndentedString(dataWriteIops)).append("\n");
    sb.append("    dataWriteLatencyUs: ").append(toIndentedString(dataWriteLatencyUs)).append("\n");
    sb.append("    metaDeleteIops: ").append(toIndentedString(metaDeleteIops)).append("\n");
    sb.append("    metaDeleteLatencyUs: ").append(toIndentedString(metaDeleteLatencyUs)).append("\n");
    sb.append("    metaListIops: ").append(toIndentedString(metaListIops)).append("\n");
    sb.append("    metaListLatencyUs: ").append(toIndentedString(metaListLatencyUs)).append("\n");
    sb.append("    metaReadIops: ").append(toIndentedString(metaReadIops)).append("\n");
    sb.append("    metaReadLatencyUs: ").append(toIndentedString(metaReadLatencyUs)).append("\n");
    sb.append("    metaWriteIops: ").append(toIndentedString(metaWriteIops)).append("\n");
    sb.append("    metaWriteLatencyUs: ").append(toIndentedString(metaWriteLatencyUs)).append("\n");
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
