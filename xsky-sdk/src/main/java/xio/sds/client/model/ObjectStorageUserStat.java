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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ObjectStoragePolicyStat;
/**
 * ObjectStorageUserStat define the object storage user statistics
 */
@Schema(description = "ObjectStorageUserStat define the object storage user statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageUserStat {
  @SerializedName("allocated_objects")
  private Long allocatedObjects = null;

  @SerializedName("allocated_size")
  private Long allocatedSize = null;

  @SerializedName("cache_allocated_objects")
  private Long cacheAllocatedObjects = null;

  @SerializedName("cache_allocated_size")
  private Long cacheAllocatedSize = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("del_ops_pm")
  private Double delOpsPm = null;

  @SerializedName("external_allocated_objects")
  private Long externalAllocatedObjects = null;

  @SerializedName("external_allocated_size")
  private Long externalAllocatedSize = null;

  @SerializedName("local_allocated_objects")
  private Long localAllocatedObjects = null;

  @SerializedName("local_allocated_size")
  private Long localAllocatedSize = null;

  @SerializedName("policies")
  private Map<String, ObjectStoragePolicyStat> policies = null;

  @SerializedName("rx_bandwidth_kbyte")
  private Double rxBandwidthKbyte = null;

  @SerializedName("rx_ops_pm")
  private Double rxOpsPm = null;

  @SerializedName("total_del_ops")
  private Long totalDelOps = null;

  @SerializedName("total_del_success_ops")
  private Long totalDelSuccessOps = null;

  @SerializedName("total_rx_bytes")
  private Long totalRxBytes = null;

  @SerializedName("total_rx_ops")
  private Long totalRxOps = null;

  @SerializedName("total_rx_success_ops")
  private Long totalRxSuccessOps = null;

  @SerializedName("total_tx_bytes")
  private Long totalTxBytes = null;

  @SerializedName("total_tx_ops")
  private Long totalTxOps = null;

  @SerializedName("total_tx_success_ops")
  private Long totalTxSuccessOps = null;

  @SerializedName("tx_bandwidth_kbyte")
  private Double txBandwidthKbyte = null;

  @SerializedName("tx_ops_pm")
  private Double txOpsPm = null;

  public ObjectStorageUserStat allocatedObjects(Long allocatedObjects) {
    this.allocatedObjects = allocatedObjects;
    return this;
  }

   /**
   * Get allocatedObjects
   * @return allocatedObjects
  **/
  @Schema(description = "")
  public Long getAllocatedObjects() {
    return allocatedObjects;
  }

  public void setAllocatedObjects(Long allocatedObjects) {
    this.allocatedObjects = allocatedObjects;
  }

  public ObjectStorageUserStat allocatedSize(Long allocatedSize) {
    this.allocatedSize = allocatedSize;
    return this;
  }

   /**
   * Get allocatedSize
   * @return allocatedSize
  **/
  @Schema(description = "")
  public Long getAllocatedSize() {
    return allocatedSize;
  }

  public void setAllocatedSize(Long allocatedSize) {
    this.allocatedSize = allocatedSize;
  }

  public ObjectStorageUserStat cacheAllocatedObjects(Long cacheAllocatedObjects) {
    this.cacheAllocatedObjects = cacheAllocatedObjects;
    return this;
  }

   /**
   * Get cacheAllocatedObjects
   * @return cacheAllocatedObjects
  **/
  @Schema(description = "")
  public Long getCacheAllocatedObjects() {
    return cacheAllocatedObjects;
  }

  public void setCacheAllocatedObjects(Long cacheAllocatedObjects) {
    this.cacheAllocatedObjects = cacheAllocatedObjects;
  }

  public ObjectStorageUserStat cacheAllocatedSize(Long cacheAllocatedSize) {
    this.cacheAllocatedSize = cacheAllocatedSize;
    return this;
  }

   /**
   * Get cacheAllocatedSize
   * @return cacheAllocatedSize
  **/
  @Schema(description = "")
  public Long getCacheAllocatedSize() {
    return cacheAllocatedSize;
  }

  public void setCacheAllocatedSize(Long cacheAllocatedSize) {
    this.cacheAllocatedSize = cacheAllocatedSize;
  }

  public ObjectStorageUserStat create(OffsetDateTime create) {
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

  public ObjectStorageUserStat delOpsPm(Double delOpsPm) {
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

  public ObjectStorageUserStat externalAllocatedObjects(Long externalAllocatedObjects) {
    this.externalAllocatedObjects = externalAllocatedObjects;
    return this;
  }

   /**
   * Get externalAllocatedObjects
   * @return externalAllocatedObjects
  **/
  @Schema(description = "")
  public Long getExternalAllocatedObjects() {
    return externalAllocatedObjects;
  }

  public void setExternalAllocatedObjects(Long externalAllocatedObjects) {
    this.externalAllocatedObjects = externalAllocatedObjects;
  }

  public ObjectStorageUserStat externalAllocatedSize(Long externalAllocatedSize) {
    this.externalAllocatedSize = externalAllocatedSize;
    return this;
  }

   /**
   * Get externalAllocatedSize
   * @return externalAllocatedSize
  **/
  @Schema(description = "")
  public Long getExternalAllocatedSize() {
    return externalAllocatedSize;
  }

  public void setExternalAllocatedSize(Long externalAllocatedSize) {
    this.externalAllocatedSize = externalAllocatedSize;
  }

  public ObjectStorageUserStat localAllocatedObjects(Long localAllocatedObjects) {
    this.localAllocatedObjects = localAllocatedObjects;
    return this;
  }

   /**
   * Get localAllocatedObjects
   * @return localAllocatedObjects
  **/
  @Schema(description = "")
  public Long getLocalAllocatedObjects() {
    return localAllocatedObjects;
  }

  public void setLocalAllocatedObjects(Long localAllocatedObjects) {
    this.localAllocatedObjects = localAllocatedObjects;
  }

  public ObjectStorageUserStat localAllocatedSize(Long localAllocatedSize) {
    this.localAllocatedSize = localAllocatedSize;
    return this;
  }

   /**
   * Get localAllocatedSize
   * @return localAllocatedSize
  **/
  @Schema(description = "")
  public Long getLocalAllocatedSize() {
    return localAllocatedSize;
  }

  public void setLocalAllocatedSize(Long localAllocatedSize) {
    this.localAllocatedSize = localAllocatedSize;
  }

  public ObjectStorageUserStat policies(Map<String, ObjectStoragePolicyStat> policies) {
    this.policies = policies;
    return this;
  }

  public ObjectStorageUserStat putPoliciesItem(String key, ObjectStoragePolicyStat policiesItem) {
    if (this.policies == null) {
      this.policies = new HashMap<String, ObjectStoragePolicyStat>();
    }
    this.policies.put(key, policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @Schema(description = "")
  public Map<String, ObjectStoragePolicyStat> getPolicies() {
    return policies;
  }

  public void setPolicies(Map<String, ObjectStoragePolicyStat> policies) {
    this.policies = policies;
  }

  public ObjectStorageUserStat rxBandwidthKbyte(Double rxBandwidthKbyte) {
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

  public ObjectStorageUserStat rxOpsPm(Double rxOpsPm) {
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

  public ObjectStorageUserStat totalDelOps(Long totalDelOps) {
    this.totalDelOps = totalDelOps;
    return this;
  }

   /**
   * Get totalDelOps
   * @return totalDelOps
  **/
  @Schema(description = "")
  public Long getTotalDelOps() {
    return totalDelOps;
  }

  public void setTotalDelOps(Long totalDelOps) {
    this.totalDelOps = totalDelOps;
  }

  public ObjectStorageUserStat totalDelSuccessOps(Long totalDelSuccessOps) {
    this.totalDelSuccessOps = totalDelSuccessOps;
    return this;
  }

   /**
   * Get totalDelSuccessOps
   * @return totalDelSuccessOps
  **/
  @Schema(description = "")
  public Long getTotalDelSuccessOps() {
    return totalDelSuccessOps;
  }

  public void setTotalDelSuccessOps(Long totalDelSuccessOps) {
    this.totalDelSuccessOps = totalDelSuccessOps;
  }

  public ObjectStorageUserStat totalRxBytes(Long totalRxBytes) {
    this.totalRxBytes = totalRxBytes;
    return this;
  }

   /**
   * Get totalRxBytes
   * @return totalRxBytes
  **/
  @Schema(description = "")
  public Long getTotalRxBytes() {
    return totalRxBytes;
  }

  public void setTotalRxBytes(Long totalRxBytes) {
    this.totalRxBytes = totalRxBytes;
  }

  public ObjectStorageUserStat totalRxOps(Long totalRxOps) {
    this.totalRxOps = totalRxOps;
    return this;
  }

   /**
   * Get totalRxOps
   * @return totalRxOps
  **/
  @Schema(description = "")
  public Long getTotalRxOps() {
    return totalRxOps;
  }

  public void setTotalRxOps(Long totalRxOps) {
    this.totalRxOps = totalRxOps;
  }

  public ObjectStorageUserStat totalRxSuccessOps(Long totalRxSuccessOps) {
    this.totalRxSuccessOps = totalRxSuccessOps;
    return this;
  }

   /**
   * Get totalRxSuccessOps
   * @return totalRxSuccessOps
  **/
  @Schema(description = "")
  public Long getTotalRxSuccessOps() {
    return totalRxSuccessOps;
  }

  public void setTotalRxSuccessOps(Long totalRxSuccessOps) {
    this.totalRxSuccessOps = totalRxSuccessOps;
  }

  public ObjectStorageUserStat totalTxBytes(Long totalTxBytes) {
    this.totalTxBytes = totalTxBytes;
    return this;
  }

   /**
   * Get totalTxBytes
   * @return totalTxBytes
  **/
  @Schema(description = "")
  public Long getTotalTxBytes() {
    return totalTxBytes;
  }

  public void setTotalTxBytes(Long totalTxBytes) {
    this.totalTxBytes = totalTxBytes;
  }

  public ObjectStorageUserStat totalTxOps(Long totalTxOps) {
    this.totalTxOps = totalTxOps;
    return this;
  }

   /**
   * Get totalTxOps
   * @return totalTxOps
  **/
  @Schema(description = "")
  public Long getTotalTxOps() {
    return totalTxOps;
  }

  public void setTotalTxOps(Long totalTxOps) {
    this.totalTxOps = totalTxOps;
  }

  public ObjectStorageUserStat totalTxSuccessOps(Long totalTxSuccessOps) {
    this.totalTxSuccessOps = totalTxSuccessOps;
    return this;
  }

   /**
   * Get totalTxSuccessOps
   * @return totalTxSuccessOps
  **/
  @Schema(description = "")
  public Long getTotalTxSuccessOps() {
    return totalTxSuccessOps;
  }

  public void setTotalTxSuccessOps(Long totalTxSuccessOps) {
    this.totalTxSuccessOps = totalTxSuccessOps;
  }

  public ObjectStorageUserStat txBandwidthKbyte(Double txBandwidthKbyte) {
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

  public ObjectStorageUserStat txOpsPm(Double txOpsPm) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageUserStat objectStorageUserStat = (ObjectStorageUserStat) o;
    return Objects.equals(this.allocatedObjects, objectStorageUserStat.allocatedObjects) &&
        Objects.equals(this.allocatedSize, objectStorageUserStat.allocatedSize) &&
        Objects.equals(this.cacheAllocatedObjects, objectStorageUserStat.cacheAllocatedObjects) &&
        Objects.equals(this.cacheAllocatedSize, objectStorageUserStat.cacheAllocatedSize) &&
        Objects.equals(this.create, objectStorageUserStat.create) &&
        Objects.equals(this.delOpsPm, objectStorageUserStat.delOpsPm) &&
        Objects.equals(this.externalAllocatedObjects, objectStorageUserStat.externalAllocatedObjects) &&
        Objects.equals(this.externalAllocatedSize, objectStorageUserStat.externalAllocatedSize) &&
        Objects.equals(this.localAllocatedObjects, objectStorageUserStat.localAllocatedObjects) &&
        Objects.equals(this.localAllocatedSize, objectStorageUserStat.localAllocatedSize) &&
        Objects.equals(this.policies, objectStorageUserStat.policies) &&
        Objects.equals(this.rxBandwidthKbyte, objectStorageUserStat.rxBandwidthKbyte) &&
        Objects.equals(this.rxOpsPm, objectStorageUserStat.rxOpsPm) &&
        Objects.equals(this.totalDelOps, objectStorageUserStat.totalDelOps) &&
        Objects.equals(this.totalDelSuccessOps, objectStorageUserStat.totalDelSuccessOps) &&
        Objects.equals(this.totalRxBytes, objectStorageUserStat.totalRxBytes) &&
        Objects.equals(this.totalRxOps, objectStorageUserStat.totalRxOps) &&
        Objects.equals(this.totalRxSuccessOps, objectStorageUserStat.totalRxSuccessOps) &&
        Objects.equals(this.totalTxBytes, objectStorageUserStat.totalTxBytes) &&
        Objects.equals(this.totalTxOps, objectStorageUserStat.totalTxOps) &&
        Objects.equals(this.totalTxSuccessOps, objectStorageUserStat.totalTxSuccessOps) &&
        Objects.equals(this.txBandwidthKbyte, objectStorageUserStat.txBandwidthKbyte) &&
        Objects.equals(this.txOpsPm, objectStorageUserStat.txOpsPm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedObjects, allocatedSize, cacheAllocatedObjects, cacheAllocatedSize, create, delOpsPm, externalAllocatedObjects, externalAllocatedSize, localAllocatedObjects, localAllocatedSize, policies, rxBandwidthKbyte, rxOpsPm, totalDelOps, totalDelSuccessOps, totalRxBytes, totalRxOps, totalRxSuccessOps, totalTxBytes, totalTxOps, totalTxSuccessOps, txBandwidthKbyte, txOpsPm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageUserStat {\n");
    
    sb.append("    allocatedObjects: ").append(toIndentedString(allocatedObjects)).append("\n");
    sb.append("    allocatedSize: ").append(toIndentedString(allocatedSize)).append("\n");
    sb.append("    cacheAllocatedObjects: ").append(toIndentedString(cacheAllocatedObjects)).append("\n");
    sb.append("    cacheAllocatedSize: ").append(toIndentedString(cacheAllocatedSize)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    delOpsPm: ").append(toIndentedString(delOpsPm)).append("\n");
    sb.append("    externalAllocatedObjects: ").append(toIndentedString(externalAllocatedObjects)).append("\n");
    sb.append("    externalAllocatedSize: ").append(toIndentedString(externalAllocatedSize)).append("\n");
    sb.append("    localAllocatedObjects: ").append(toIndentedString(localAllocatedObjects)).append("\n");
    sb.append("    localAllocatedSize: ").append(toIndentedString(localAllocatedSize)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    rxBandwidthKbyte: ").append(toIndentedString(rxBandwidthKbyte)).append("\n");
    sb.append("    rxOpsPm: ").append(toIndentedString(rxOpsPm)).append("\n");
    sb.append("    totalDelOps: ").append(toIndentedString(totalDelOps)).append("\n");
    sb.append("    totalDelSuccessOps: ").append(toIndentedString(totalDelSuccessOps)).append("\n");
    sb.append("    totalRxBytes: ").append(toIndentedString(totalRxBytes)).append("\n");
    sb.append("    totalRxOps: ").append(toIndentedString(totalRxOps)).append("\n");
    sb.append("    totalRxSuccessOps: ").append(toIndentedString(totalRxSuccessOps)).append("\n");
    sb.append("    totalTxBytes: ").append(toIndentedString(totalTxBytes)).append("\n");
    sb.append("    totalTxOps: ").append(toIndentedString(totalTxOps)).append("\n");
    sb.append("    totalTxSuccessOps: ").append(toIndentedString(totalTxSuccessOps)).append("\n");
    sb.append("    txBandwidthKbyte: ").append(toIndentedString(txBandwidthKbyte)).append("\n");
    sb.append("    txOpsPm: ").append(toIndentedString(txOpsPm)).append("\n");
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