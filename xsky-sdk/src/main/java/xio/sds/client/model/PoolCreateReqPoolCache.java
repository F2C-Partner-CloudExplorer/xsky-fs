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
import java.util.ArrayList;
import java.util.List;
/**
 * PoolCreateReqPoolCache
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class PoolCreateReqPoolCache {
  @SerializedName("compress_algorithm")
  private String compressAlgorithm = null;

  @SerializedName("compressed")
  private Boolean compressed = null;

  @SerializedName("osd_ids")
  private List<Long> osdIds = null;

  @SerializedName("size")
  private Long size = null;

  public PoolCreateReqPoolCache compressAlgorithm(String compressAlgorithm) {
    this.compressAlgorithm = compressAlgorithm;
    return this;
  }

   /**
   * Get compressAlgorithm
   * @return compressAlgorithm
  **/
  @Schema(description = "")
  public String getCompressAlgorithm() {
    return compressAlgorithm;
  }

  public void setCompressAlgorithm(String compressAlgorithm) {
    this.compressAlgorithm = compressAlgorithm;
  }

  public PoolCreateReqPoolCache compressed(Boolean compressed) {
    this.compressed = compressed;
    return this;
  }

   /**
   * Get compressed
   * @return compressed
  **/
  @Schema(description = "")
  public Boolean isCompressed() {
    return compressed;
  }

  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }

  public PoolCreateReqPoolCache osdIds(List<Long> osdIds) {
    this.osdIds = osdIds;
    return this;
  }

  public PoolCreateReqPoolCache addOsdIdsItem(Long osdIdsItem) {
    if (this.osdIds == null) {
      this.osdIds = new ArrayList<Long>();
    }
    this.osdIds.add(osdIdsItem);
    return this;
  }

   /**
   * Get osdIds
   * @return osdIds
  **/
  @Schema(description = "")
  public List<Long> getOsdIds() {
    return osdIds;
  }

  public void setOsdIds(List<Long> osdIds) {
    this.osdIds = osdIds;
  }

  public PoolCreateReqPoolCache size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolCreateReqPoolCache poolCreateReqPoolCache = (PoolCreateReqPoolCache) o;
    return Objects.equals(this.compressAlgorithm, poolCreateReqPoolCache.compressAlgorithm) &&
        Objects.equals(this.compressed, poolCreateReqPoolCache.compressed) &&
        Objects.equals(this.osdIds, poolCreateReqPoolCache.osdIds) &&
        Objects.equals(this.size, poolCreateReqPoolCache.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressAlgorithm, compressed, osdIds, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolCreateReqPoolCache {\n");
    
    sb.append("    compressAlgorithm: ").append(toIndentedString(compressAlgorithm)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    osdIds: ").append(toIndentedString(osdIds)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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