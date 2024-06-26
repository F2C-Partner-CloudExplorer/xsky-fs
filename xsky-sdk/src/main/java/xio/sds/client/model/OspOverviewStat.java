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
 * OspOverviewStat
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspOverviewStat {
  @SerializedName("rx_ops_pm")
  private Double rxOpsPm = null;

  @SerializedName("raw_data_backend_bytes")
  private Long rawDataBackendBytes = null;

  @SerializedName("file_data_backend_bytes")
  private Long fileDataBackendBytes = null;

  @SerializedName("up_latency_us")
  private Double upLatencyUs = null;

  @SerializedName("object_data_backend_object_num")
  private Long objectDataBackendObjectNum = null;

  @SerializedName("object_num")
  private Long objectNum = null;

  @SerializedName("cold_data_backend_bytes")
  private Long coldDataBackendBytes = null;

  @SerializedName("local_data_used_capacity")
  private Long localDataUsedCapacity = null;

  @SerializedName("raw_data_backend_object_num")
  private Long rawDataBackendObjectNum = null;

  @SerializedName("list_latency_us")
  private Double listLatencyUs = null;

  @SerializedName("file_data_backend_object_num")
  private Long fileDataBackendObjectNum = null;

  @SerializedName("tx_ops_pm")
  private Double txOpsPm = null;

  @SerializedName("object_data_backend_bytes")
  private Long objectDataBackendBytes = null;

  @SerializedName("rx_bandwidth_kbyte")
  private Double rxBandwidthKbyte = null;

  @SerializedName("del_latency_us")
  private Double delLatencyUs = null;

  @SerializedName("data_bytes")
  private Long dataBytes = null;

  @SerializedName("external_data_used_capacity")
  private Long externalDataUsedCapacity = null;

  @SerializedName("down_latency_us")
  private Double downLatencyUs = null;

  @SerializedName("list_ops_pm")
  private Double listOpsPm = null;

  @SerializedName("cold_data_backend_object_num")
  private Long coldDataBackendObjectNum = null;

  @SerializedName("tx_bandwidth_kbyte")
  private Double txBandwidthKbyte = null;

  @SerializedName("del_ops_pm")
  private Double delOpsPm = null;

  @SerializedName("time")
  private String time = null;

  public OspOverviewStat rxOpsPm(Double rxOpsPm) {
    this.rxOpsPm = rxOpsPm;
    return this;
  }

   /**
   * Get rxOpsPm
   * @return rxOpsPm
  **/
  @Schema(description = "")
  public Double getRxOpsPm() {
    return rxOpsPm;
  }

  public void setRxOpsPm(Double rxOpsPm) {
    this.rxOpsPm = rxOpsPm;
  }

  public OspOverviewStat rawDataBackendBytes(Long rawDataBackendBytes) {
    this.rawDataBackendBytes = rawDataBackendBytes;
    return this;
  }

   /**
   * Get rawDataBackendBytes
   * @return rawDataBackendBytes
  **/
  @Schema(description = "")
  public Long getRawDataBackendBytes() {
    return rawDataBackendBytes;
  }

  public void setRawDataBackendBytes(Long rawDataBackendBytes) {
    this.rawDataBackendBytes = rawDataBackendBytes;
  }

  public OspOverviewStat fileDataBackendBytes(Long fileDataBackendBytes) {
    this.fileDataBackendBytes = fileDataBackendBytes;
    return this;
  }

   /**
   * Get fileDataBackendBytes
   * @return fileDataBackendBytes
  **/
  @Schema(description = "")
  public Long getFileDataBackendBytes() {
    return fileDataBackendBytes;
  }

  public void setFileDataBackendBytes(Long fileDataBackendBytes) {
    this.fileDataBackendBytes = fileDataBackendBytes;
  }

  public OspOverviewStat upLatencyUs(Double upLatencyUs) {
    this.upLatencyUs = upLatencyUs;
    return this;
  }

   /**
   * Get upLatencyUs
   * @return upLatencyUs
  **/
  @Schema(description = "")
  public Double getUpLatencyUs() {
    return upLatencyUs;
  }

  public void setUpLatencyUs(Double upLatencyUs) {
    this.upLatencyUs = upLatencyUs;
  }

  public OspOverviewStat objectDataBackendObjectNum(Long objectDataBackendObjectNum) {
    this.objectDataBackendObjectNum = objectDataBackendObjectNum;
    return this;
  }

   /**
   * Get objectDataBackendObjectNum
   * @return objectDataBackendObjectNum
  **/
  @Schema(description = "")
  public Long getObjectDataBackendObjectNum() {
    return objectDataBackendObjectNum;
  }

  public void setObjectDataBackendObjectNum(Long objectDataBackendObjectNum) {
    this.objectDataBackendObjectNum = objectDataBackendObjectNum;
  }

  public OspOverviewStat objectNum(Long objectNum) {
    this.objectNum = objectNum;
    return this;
  }

   /**
   * Get objectNum
   * @return objectNum
  **/
  @Schema(description = "")
  public Long getObjectNum() {
    return objectNum;
  }

  public void setObjectNum(Long objectNum) {
    this.objectNum = objectNum;
  }

  public OspOverviewStat coldDataBackendBytes(Long coldDataBackendBytes) {
    this.coldDataBackendBytes = coldDataBackendBytes;
    return this;
  }

   /**
   * Get coldDataBackendBytes
   * @return coldDataBackendBytes
  **/
  @Schema(description = "")
  public Long getColdDataBackendBytes() {
    return coldDataBackendBytes;
  }

  public void setColdDataBackendBytes(Long coldDataBackendBytes) {
    this.coldDataBackendBytes = coldDataBackendBytes;
  }

  public OspOverviewStat localDataUsedCapacity(Long localDataUsedCapacity) {
    this.localDataUsedCapacity = localDataUsedCapacity;
    return this;
  }

   /**
   * Get localDataUsedCapacity
   * @return localDataUsedCapacity
  **/
  @Schema(description = "")
  public Long getLocalDataUsedCapacity() {
    return localDataUsedCapacity;
  }

  public void setLocalDataUsedCapacity(Long localDataUsedCapacity) {
    this.localDataUsedCapacity = localDataUsedCapacity;
  }

  public OspOverviewStat rawDataBackendObjectNum(Long rawDataBackendObjectNum) {
    this.rawDataBackendObjectNum = rawDataBackendObjectNum;
    return this;
  }

   /**
   * Get rawDataBackendObjectNum
   * @return rawDataBackendObjectNum
  **/
  @Schema(description = "")
  public Long getRawDataBackendObjectNum() {
    return rawDataBackendObjectNum;
  }

  public void setRawDataBackendObjectNum(Long rawDataBackendObjectNum) {
    this.rawDataBackendObjectNum = rawDataBackendObjectNum;
  }

  public OspOverviewStat listLatencyUs(Double listLatencyUs) {
    this.listLatencyUs = listLatencyUs;
    return this;
  }

   /**
   * Get listLatencyUs
   * @return listLatencyUs
  **/
  @Schema(description = "")
  public Double getListLatencyUs() {
    return listLatencyUs;
  }

  public void setListLatencyUs(Double listLatencyUs) {
    this.listLatencyUs = listLatencyUs;
  }

  public OspOverviewStat fileDataBackendObjectNum(Long fileDataBackendObjectNum) {
    this.fileDataBackendObjectNum = fileDataBackendObjectNum;
    return this;
  }

   /**
   * Get fileDataBackendObjectNum
   * @return fileDataBackendObjectNum
  **/
  @Schema(description = "")
  public Long getFileDataBackendObjectNum() {
    return fileDataBackendObjectNum;
  }

  public void setFileDataBackendObjectNum(Long fileDataBackendObjectNum) {
    this.fileDataBackendObjectNum = fileDataBackendObjectNum;
  }

  public OspOverviewStat txOpsPm(Double txOpsPm) {
    this.txOpsPm = txOpsPm;
    return this;
  }

   /**
   * Get txOpsPm
   * @return txOpsPm
  **/
  @Schema(description = "")
  public Double getTxOpsPm() {
    return txOpsPm;
  }

  public void setTxOpsPm(Double txOpsPm) {
    this.txOpsPm = txOpsPm;
  }

  public OspOverviewStat objectDataBackendBytes(Long objectDataBackendBytes) {
    this.objectDataBackendBytes = objectDataBackendBytes;
    return this;
  }

   /**
   * Get objectDataBackendBytes
   * @return objectDataBackendBytes
  **/
  @Schema(description = "")
  public Long getObjectDataBackendBytes() {
    return objectDataBackendBytes;
  }

  public void setObjectDataBackendBytes(Long objectDataBackendBytes) {
    this.objectDataBackendBytes = objectDataBackendBytes;
  }

  public OspOverviewStat rxBandwidthKbyte(Double rxBandwidthKbyte) {
    this.rxBandwidthKbyte = rxBandwidthKbyte;
    return this;
  }

   /**
   * Get rxBandwidthKbyte
   * @return rxBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getRxBandwidthKbyte() {
    return rxBandwidthKbyte;
  }

  public void setRxBandwidthKbyte(Double rxBandwidthKbyte) {
    this.rxBandwidthKbyte = rxBandwidthKbyte;
  }

  public OspOverviewStat delLatencyUs(Double delLatencyUs) {
    this.delLatencyUs = delLatencyUs;
    return this;
  }

   /**
   * Get delLatencyUs
   * @return delLatencyUs
  **/
  @Schema(description = "")
  public Double getDelLatencyUs() {
    return delLatencyUs;
  }

  public void setDelLatencyUs(Double delLatencyUs) {
    this.delLatencyUs = delLatencyUs;
  }

  public OspOverviewStat dataBytes(Long dataBytes) {
    this.dataBytes = dataBytes;
    return this;
  }

   /**
   * Get dataBytes
   * @return dataBytes
  **/
  @Schema(description = "")
  public Long getDataBytes() {
    return dataBytes;
  }

  public void setDataBytes(Long dataBytes) {
    this.dataBytes = dataBytes;
  }

  public OspOverviewStat externalDataUsedCapacity(Long externalDataUsedCapacity) {
    this.externalDataUsedCapacity = externalDataUsedCapacity;
    return this;
  }

   /**
   * Get externalDataUsedCapacity
   * @return externalDataUsedCapacity
  **/
  @Schema(description = "")
  public Long getExternalDataUsedCapacity() {
    return externalDataUsedCapacity;
  }

  public void setExternalDataUsedCapacity(Long externalDataUsedCapacity) {
    this.externalDataUsedCapacity = externalDataUsedCapacity;
  }

  public OspOverviewStat downLatencyUs(Double downLatencyUs) {
    this.downLatencyUs = downLatencyUs;
    return this;
  }

   /**
   * Get downLatencyUs
   * @return downLatencyUs
  **/
  @Schema(description = "")
  public Double getDownLatencyUs() {
    return downLatencyUs;
  }

  public void setDownLatencyUs(Double downLatencyUs) {
    this.downLatencyUs = downLatencyUs;
  }

  public OspOverviewStat listOpsPm(Double listOpsPm) {
    this.listOpsPm = listOpsPm;
    return this;
  }

   /**
   * Get listOpsPm
   * @return listOpsPm
  **/
  @Schema(description = "")
  public Double getListOpsPm() {
    return listOpsPm;
  }

  public void setListOpsPm(Double listOpsPm) {
    this.listOpsPm = listOpsPm;
  }

  public OspOverviewStat coldDataBackendObjectNum(Long coldDataBackendObjectNum) {
    this.coldDataBackendObjectNum = coldDataBackendObjectNum;
    return this;
  }

   /**
   * Get coldDataBackendObjectNum
   * @return coldDataBackendObjectNum
  **/
  @Schema(description = "")
  public Long getColdDataBackendObjectNum() {
    return coldDataBackendObjectNum;
  }

  public void setColdDataBackendObjectNum(Long coldDataBackendObjectNum) {
    this.coldDataBackendObjectNum = coldDataBackendObjectNum;
  }

  public OspOverviewStat txBandwidthKbyte(Double txBandwidthKbyte) {
    this.txBandwidthKbyte = txBandwidthKbyte;
    return this;
  }

   /**
   * Get txBandwidthKbyte
   * @return txBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getTxBandwidthKbyte() {
    return txBandwidthKbyte;
  }

  public void setTxBandwidthKbyte(Double txBandwidthKbyte) {
    this.txBandwidthKbyte = txBandwidthKbyte;
  }

  public OspOverviewStat delOpsPm(Double delOpsPm) {
    this.delOpsPm = delOpsPm;
    return this;
  }

   /**
   * Get delOpsPm
   * @return delOpsPm
  **/
  @Schema(description = "")
  public Double getDelOpsPm() {
    return delOpsPm;
  }

  public void setDelOpsPm(Double delOpsPm) {
    this.delOpsPm = delOpsPm;
  }

  public OspOverviewStat time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @Schema(description = "")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspOverviewStat ospOverviewStat = (OspOverviewStat) o;
    return Objects.equals(this.rxOpsPm, ospOverviewStat.rxOpsPm) &&
        Objects.equals(this.rawDataBackendBytes, ospOverviewStat.rawDataBackendBytes) &&
        Objects.equals(this.fileDataBackendBytes, ospOverviewStat.fileDataBackendBytes) &&
        Objects.equals(this.upLatencyUs, ospOverviewStat.upLatencyUs) &&
        Objects.equals(this.objectDataBackendObjectNum, ospOverviewStat.objectDataBackendObjectNum) &&
        Objects.equals(this.objectNum, ospOverviewStat.objectNum) &&
        Objects.equals(this.coldDataBackendBytes, ospOverviewStat.coldDataBackendBytes) &&
        Objects.equals(this.localDataUsedCapacity, ospOverviewStat.localDataUsedCapacity) &&
        Objects.equals(this.rawDataBackendObjectNum, ospOverviewStat.rawDataBackendObjectNum) &&
        Objects.equals(this.listLatencyUs, ospOverviewStat.listLatencyUs) &&
        Objects.equals(this.fileDataBackendObjectNum, ospOverviewStat.fileDataBackendObjectNum) &&
        Objects.equals(this.txOpsPm, ospOverviewStat.txOpsPm) &&
        Objects.equals(this.objectDataBackendBytes, ospOverviewStat.objectDataBackendBytes) &&
        Objects.equals(this.rxBandwidthKbyte, ospOverviewStat.rxBandwidthKbyte) &&
        Objects.equals(this.delLatencyUs, ospOverviewStat.delLatencyUs) &&
        Objects.equals(this.dataBytes, ospOverviewStat.dataBytes) &&
        Objects.equals(this.externalDataUsedCapacity, ospOverviewStat.externalDataUsedCapacity) &&
        Objects.equals(this.downLatencyUs, ospOverviewStat.downLatencyUs) &&
        Objects.equals(this.listOpsPm, ospOverviewStat.listOpsPm) &&
        Objects.equals(this.coldDataBackendObjectNum, ospOverviewStat.coldDataBackendObjectNum) &&
        Objects.equals(this.txBandwidthKbyte, ospOverviewStat.txBandwidthKbyte) &&
        Objects.equals(this.delOpsPm, ospOverviewStat.delOpsPm) &&
        Objects.equals(this.time, ospOverviewStat.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rxOpsPm, rawDataBackendBytes, fileDataBackendBytes, upLatencyUs, objectDataBackendObjectNum, objectNum, coldDataBackendBytes, localDataUsedCapacity, rawDataBackendObjectNum, listLatencyUs, fileDataBackendObjectNum, txOpsPm, objectDataBackendBytes, rxBandwidthKbyte, delLatencyUs, dataBytes, externalDataUsedCapacity, downLatencyUs, listOpsPm, coldDataBackendObjectNum, txBandwidthKbyte, delOpsPm, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspOverviewStat {\n");
    
    sb.append("    rxOpsPm: ").append(toIndentedString(rxOpsPm)).append("\n");
    sb.append("    rawDataBackendBytes: ").append(toIndentedString(rawDataBackendBytes)).append("\n");
    sb.append("    fileDataBackendBytes: ").append(toIndentedString(fileDataBackendBytes)).append("\n");
    sb.append("    upLatencyUs: ").append(toIndentedString(upLatencyUs)).append("\n");
    sb.append("    objectDataBackendObjectNum: ").append(toIndentedString(objectDataBackendObjectNum)).append("\n");
    sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
    sb.append("    coldDataBackendBytes: ").append(toIndentedString(coldDataBackendBytes)).append("\n");
    sb.append("    localDataUsedCapacity: ").append(toIndentedString(localDataUsedCapacity)).append("\n");
    sb.append("    rawDataBackendObjectNum: ").append(toIndentedString(rawDataBackendObjectNum)).append("\n");
    sb.append("    listLatencyUs: ").append(toIndentedString(listLatencyUs)).append("\n");
    sb.append("    fileDataBackendObjectNum: ").append(toIndentedString(fileDataBackendObjectNum)).append("\n");
    sb.append("    txOpsPm: ").append(toIndentedString(txOpsPm)).append("\n");
    sb.append("    objectDataBackendBytes: ").append(toIndentedString(objectDataBackendBytes)).append("\n");
    sb.append("    rxBandwidthKbyte: ").append(toIndentedString(rxBandwidthKbyte)).append("\n");
    sb.append("    delLatencyUs: ").append(toIndentedString(delLatencyUs)).append("\n");
    sb.append("    dataBytes: ").append(toIndentedString(dataBytes)).append("\n");
    sb.append("    externalDataUsedCapacity: ").append(toIndentedString(externalDataUsedCapacity)).append("\n");
    sb.append("    downLatencyUs: ").append(toIndentedString(downLatencyUs)).append("\n");
    sb.append("    listOpsPm: ").append(toIndentedString(listOpsPm)).append("\n");
    sb.append("    coldDataBackendObjectNum: ").append(toIndentedString(coldDataBackendObjectNum)).append("\n");
    sb.append("    txBandwidthKbyte: ").append(toIndentedString(txBandwidthKbyte)).append("\n");
    sb.append("    delOpsPm: ").append(toIndentedString(delOpsPm)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
