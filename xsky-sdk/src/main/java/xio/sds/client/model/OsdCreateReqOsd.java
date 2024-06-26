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
 * OsdCreateReqOsd
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OsdCreateReqOsd {
  @SerializedName("bind_pool_id")
  private Long bindPoolId = null;

  @SerializedName("disk_id")
  private Long diskId = null;

  @SerializedName("min_alloc_size")
  private Long minAllocSize = null;

  @SerializedName("omap_byte")
  private Long omapByte = null;

  @SerializedName("partition_id")
  private Long partitionId = null;

  @SerializedName("read_cache_size")
  private Long readCacheSize = null;

  @SerializedName("role")
  private String role = null;

  public OsdCreateReqOsd bindPoolId(Long bindPoolId) {
    this.bindPoolId = bindPoolId;
    return this;
  }

   /**
   * bind pool id
   * @return bindPoolId
  **/
  @Schema(description = "bind pool id")
  public Long getBindPoolId() {
    return bindPoolId;
  }

  public void setBindPoolId(Long bindPoolId) {
    this.bindPoolId = bindPoolId;
  }

  public OsdCreateReqOsd diskId(Long diskId) {
    this.diskId = diskId;
    return this;
  }

   /**
   * data disk id
   * @return diskId
  **/
  @Schema(description = "data disk id")
  public Long getDiskId() {
    return diskId;
  }

  public void setDiskId(Long diskId) {
    this.diskId = diskId;
  }

  public OsdCreateReqOsd minAllocSize(Long minAllocSize) {
    this.minAllocSize = minAllocSize;
    return this;
  }

   /**
   * for xstore_min_alloc_size_hdd/xstore_min_alloc_size_ssd
   * @return minAllocSize
  **/
  @Schema(description = "for xstore_min_alloc_size_hdd/xstore_min_alloc_size_ssd")
  public Long getMinAllocSize() {
    return minAllocSize;
  }

  public void setMinAllocSize(Long minAllocSize) {
    this.minAllocSize = minAllocSize;
  }

  public OsdCreateReqOsd omapByte(Long omapByte) {
    this.omapByte = omapByte;
    return this;
  }

   /**
   * size of omap partition
   * @return omapByte
  **/
  @Schema(description = "size of omap partition")
  public Long getOmapByte() {
    return omapByte;
  }

  public void setOmapByte(Long omapByte) {
    this.omapByte = omapByte;
  }

  public OsdCreateReqOsd partitionId(Long partitionId) {
    this.partitionId = partitionId;
    return this;
  }

   /**
   * cache partition id
   * @return partitionId
  **/
  @Schema(description = "cache partition id")
  public Long getPartitionId() {
    return partitionId;
  }

  public void setPartitionId(Long partitionId) {
    this.partitionId = partitionId;
  }

  public OsdCreateReqOsd readCacheSize(Long readCacheSize) {
    this.readCacheSize = readCacheSize;
    return this;
  }

   /**
   * read cache size in bytes
   * @return readCacheSize
  **/
  @Schema(description = "read cache size in bytes")
  public Long getReadCacheSize() {
    return readCacheSize;
  }

  public void setReadCacheSize(Long readCacheSize) {
    this.readCacheSize = readCacheSize;
  }

  public OsdCreateReqOsd role(String role) {
    this.role = role;
    return this;
  }

   /**
   * osd role: \&quot;data\&quot; or \&quot;index\&quot;, default is \&quot;data\&quot;
   * @return role
  **/
  @Schema(description = "osd role: \"data\" or \"index\", default is \"data\"")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OsdCreateReqOsd osdCreateReqOsd = (OsdCreateReqOsd) o;
    return Objects.equals(this.bindPoolId, osdCreateReqOsd.bindPoolId) &&
        Objects.equals(this.diskId, osdCreateReqOsd.diskId) &&
        Objects.equals(this.minAllocSize, osdCreateReqOsd.minAllocSize) &&
        Objects.equals(this.omapByte, osdCreateReqOsd.omapByte) &&
        Objects.equals(this.partitionId, osdCreateReqOsd.partitionId) &&
        Objects.equals(this.readCacheSize, osdCreateReqOsd.readCacheSize) &&
        Objects.equals(this.role, osdCreateReqOsd.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindPoolId, diskId, minAllocSize, omapByte, partitionId, readCacheSize, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OsdCreateReqOsd {\n");
    
    sb.append("    bindPoolId: ").append(toIndentedString(bindPoolId)).append("\n");
    sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
    sb.append("    minAllocSize: ").append(toIndentedString(minAllocSize)).append("\n");
    sb.append("    omapByte: ").append(toIndentedString(omapByte)).append("\n");
    sb.append("    partitionId: ").append(toIndentedString(partitionId)).append("\n");
    sb.append("    readCacheSize: ").append(toIndentedString(readCacheSize)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
