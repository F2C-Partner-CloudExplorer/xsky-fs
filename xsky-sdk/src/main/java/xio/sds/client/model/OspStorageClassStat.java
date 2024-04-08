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
 * OspStorageClassStat
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspStorageClassStat {
  @SerializedName("cache_allocated_size")
  private Long cacheAllocatedSize = null;

  @SerializedName("fast_flow_allocated_objects")
  private Long fastFlowAllocatedObjects = null;

  @SerializedName("utilized_size")
  private Long utilizedSize = null;

  @SerializedName("origin_cdn_allocated_size")
  private Long originCdnAllocatedSize = null;

  @SerializedName("cache_utilized_size")
  private Long cacheUtilizedSize = null;

  @SerializedName("allocated_size")
  private Long allocatedSize = null;

  @SerializedName("class_name")
  private String className = null;

  @SerializedName("fast_flow_utilized_size")
  private Long fastFlowUtilizedSize = null;

  @SerializedName("origin_cdn_allocated_objects")
  private Long originCdnAllocatedObjects = null;

  @SerializedName("cache_allocated_objects")
  private Long cacheAllocatedObjects = null;

  @SerializedName("fast_flow_allocated_size")
  private Long fastFlowAllocatedSize = null;

  @SerializedName("allocated_objects")
  private Long allocatedObjects = null;

  @SerializedName("origin_cdn_utilized_size")
  private Long originCdnUtilizedSize = null;

  public OspStorageClassStat cacheAllocatedSize(Long cacheAllocatedSize) {
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

  public OspStorageClassStat fastFlowAllocatedObjects(Long fastFlowAllocatedObjects) {
    this.fastFlowAllocatedObjects = fastFlowAllocatedObjects;
    return this;
  }

   /**
   * Get fastFlowAllocatedObjects
   * @return fastFlowAllocatedObjects
  **/
  @Schema(description = "")
  public Long getFastFlowAllocatedObjects() {
    return fastFlowAllocatedObjects;
  }

  public void setFastFlowAllocatedObjects(Long fastFlowAllocatedObjects) {
    this.fastFlowAllocatedObjects = fastFlowAllocatedObjects;
  }

  public OspStorageClassStat utilizedSize(Long utilizedSize) {
    this.utilizedSize = utilizedSize;
    return this;
  }

   /**
   * Get utilizedSize
   * @return utilizedSize
  **/
  @Schema(description = "")
  public Long getUtilizedSize() {
    return utilizedSize;
  }

  public void setUtilizedSize(Long utilizedSize) {
    this.utilizedSize = utilizedSize;
  }

  public OspStorageClassStat originCdnAllocatedSize(Long originCdnAllocatedSize) {
    this.originCdnAllocatedSize = originCdnAllocatedSize;
    return this;
  }

   /**
   * Get originCdnAllocatedSize
   * @return originCdnAllocatedSize
  **/
  @Schema(description = "")
  public Long getOriginCdnAllocatedSize() {
    return originCdnAllocatedSize;
  }

  public void setOriginCdnAllocatedSize(Long originCdnAllocatedSize) {
    this.originCdnAllocatedSize = originCdnAllocatedSize;
  }

  public OspStorageClassStat cacheUtilizedSize(Long cacheUtilizedSize) {
    this.cacheUtilizedSize = cacheUtilizedSize;
    return this;
  }

   /**
   * Get cacheUtilizedSize
   * @return cacheUtilizedSize
  **/
  @Schema(description = "")
  public Long getCacheUtilizedSize() {
    return cacheUtilizedSize;
  }

  public void setCacheUtilizedSize(Long cacheUtilizedSize) {
    this.cacheUtilizedSize = cacheUtilizedSize;
  }

  public OspStorageClassStat allocatedSize(Long allocatedSize) {
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

  public OspStorageClassStat className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @Schema(description = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public OspStorageClassStat fastFlowUtilizedSize(Long fastFlowUtilizedSize) {
    this.fastFlowUtilizedSize = fastFlowUtilizedSize;
    return this;
  }

   /**
   * Get fastFlowUtilizedSize
   * @return fastFlowUtilizedSize
  **/
  @Schema(description = "")
  public Long getFastFlowUtilizedSize() {
    return fastFlowUtilizedSize;
  }

  public void setFastFlowUtilizedSize(Long fastFlowUtilizedSize) {
    this.fastFlowUtilizedSize = fastFlowUtilizedSize;
  }

  public OspStorageClassStat originCdnAllocatedObjects(Long originCdnAllocatedObjects) {
    this.originCdnAllocatedObjects = originCdnAllocatedObjects;
    return this;
  }

   /**
   * Get originCdnAllocatedObjects
   * @return originCdnAllocatedObjects
  **/
  @Schema(description = "")
  public Long getOriginCdnAllocatedObjects() {
    return originCdnAllocatedObjects;
  }

  public void setOriginCdnAllocatedObjects(Long originCdnAllocatedObjects) {
    this.originCdnAllocatedObjects = originCdnAllocatedObjects;
  }

  public OspStorageClassStat cacheAllocatedObjects(Long cacheAllocatedObjects) {
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

  public OspStorageClassStat fastFlowAllocatedSize(Long fastFlowAllocatedSize) {
    this.fastFlowAllocatedSize = fastFlowAllocatedSize;
    return this;
  }

   /**
   * Get fastFlowAllocatedSize
   * @return fastFlowAllocatedSize
  **/
  @Schema(description = "")
  public Long getFastFlowAllocatedSize() {
    return fastFlowAllocatedSize;
  }

  public void setFastFlowAllocatedSize(Long fastFlowAllocatedSize) {
    this.fastFlowAllocatedSize = fastFlowAllocatedSize;
  }

  public OspStorageClassStat allocatedObjects(Long allocatedObjects) {
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

  public OspStorageClassStat originCdnUtilizedSize(Long originCdnUtilizedSize) {
    this.originCdnUtilizedSize = originCdnUtilizedSize;
    return this;
  }

   /**
   * Get originCdnUtilizedSize
   * @return originCdnUtilizedSize
  **/
  @Schema(description = "")
  public Long getOriginCdnUtilizedSize() {
    return originCdnUtilizedSize;
  }

  public void setOriginCdnUtilizedSize(Long originCdnUtilizedSize) {
    this.originCdnUtilizedSize = originCdnUtilizedSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspStorageClassStat ospStorageClassStat = (OspStorageClassStat) o;
    return Objects.equals(this.cacheAllocatedSize, ospStorageClassStat.cacheAllocatedSize) &&
        Objects.equals(this.fastFlowAllocatedObjects, ospStorageClassStat.fastFlowAllocatedObjects) &&
        Objects.equals(this.utilizedSize, ospStorageClassStat.utilizedSize) &&
        Objects.equals(this.originCdnAllocatedSize, ospStorageClassStat.originCdnAllocatedSize) &&
        Objects.equals(this.cacheUtilizedSize, ospStorageClassStat.cacheUtilizedSize) &&
        Objects.equals(this.allocatedSize, ospStorageClassStat.allocatedSize) &&
        Objects.equals(this.className, ospStorageClassStat.className) &&
        Objects.equals(this.fastFlowUtilizedSize, ospStorageClassStat.fastFlowUtilizedSize) &&
        Objects.equals(this.originCdnAllocatedObjects, ospStorageClassStat.originCdnAllocatedObjects) &&
        Objects.equals(this.cacheAllocatedObjects, ospStorageClassStat.cacheAllocatedObjects) &&
        Objects.equals(this.fastFlowAllocatedSize, ospStorageClassStat.fastFlowAllocatedSize) &&
        Objects.equals(this.allocatedObjects, ospStorageClassStat.allocatedObjects) &&
        Objects.equals(this.originCdnUtilizedSize, ospStorageClassStat.originCdnUtilizedSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheAllocatedSize, fastFlowAllocatedObjects, utilizedSize, originCdnAllocatedSize, cacheUtilizedSize, allocatedSize, className, fastFlowUtilizedSize, originCdnAllocatedObjects, cacheAllocatedObjects, fastFlowAllocatedSize, allocatedObjects, originCdnUtilizedSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspStorageClassStat {\n");
    
    sb.append("    cacheAllocatedSize: ").append(toIndentedString(cacheAllocatedSize)).append("\n");
    sb.append("    fastFlowAllocatedObjects: ").append(toIndentedString(fastFlowAllocatedObjects)).append("\n");
    sb.append("    utilizedSize: ").append(toIndentedString(utilizedSize)).append("\n");
    sb.append("    originCdnAllocatedSize: ").append(toIndentedString(originCdnAllocatedSize)).append("\n");
    sb.append("    cacheUtilizedSize: ").append(toIndentedString(cacheUtilizedSize)).append("\n");
    sb.append("    allocatedSize: ").append(toIndentedString(allocatedSize)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    fastFlowUtilizedSize: ").append(toIndentedString(fastFlowUtilizedSize)).append("\n");
    sb.append("    originCdnAllocatedObjects: ").append(toIndentedString(originCdnAllocatedObjects)).append("\n");
    sb.append("    cacheAllocatedObjects: ").append(toIndentedString(cacheAllocatedObjects)).append("\n");
    sb.append("    fastFlowAllocatedSize: ").append(toIndentedString(fastFlowAllocatedSize)).append("\n");
    sb.append("    allocatedObjects: ").append(toIndentedString(allocatedObjects)).append("\n");
    sb.append("    originCdnUtilizedSize: ").append(toIndentedString(originCdnUtilizedSize)).append("\n");
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