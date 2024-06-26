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
import xio.sds.client.model.OspNestedZoneNoSearch;
/**
 * OspSyncReplicationPair
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspSyncReplicationPair {
  @SerializedName("src")
  private List<OspNestedZoneNoSearch> src = null;

  @SerializedName("dst")
  private List<OspNestedZoneNoSearch> dst = null;

  public OspSyncReplicationPair src(List<OspNestedZoneNoSearch> src) {
    this.src = src;
    return this;
  }

  public OspSyncReplicationPair addSrcItem(OspNestedZoneNoSearch srcItem) {
    if (this.src == null) {
      this.src = new ArrayList<OspNestedZoneNoSearch>();
    }
    this.src.add(srcItem);
    return this;
  }

   /**
   * Get src
   * @return src
  **/
  @Schema(description = "")
  public List<OspNestedZoneNoSearch> getSrc() {
    return src;
  }

  public void setSrc(List<OspNestedZoneNoSearch> src) {
    this.src = src;
  }

  public OspSyncReplicationPair dst(List<OspNestedZoneNoSearch> dst) {
    this.dst = dst;
    return this;
  }

  public OspSyncReplicationPair addDstItem(OspNestedZoneNoSearch dstItem) {
    if (this.dst == null) {
      this.dst = new ArrayList<OspNestedZoneNoSearch>();
    }
    this.dst.add(dstItem);
    return this;
  }

   /**
   * Get dst
   * @return dst
  **/
  @Schema(description = "")
  public List<OspNestedZoneNoSearch> getDst() {
    return dst;
  }

  public void setDst(List<OspNestedZoneNoSearch> dst) {
    this.dst = dst;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspSyncReplicationPair ospSyncReplicationPair = (OspSyncReplicationPair) o;
    return Objects.equals(this.src, ospSyncReplicationPair.src) &&
        Objects.equals(this.dst, ospSyncReplicationPair.dst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(src, dst);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspSyncReplicationPair {\n");
    
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    dst: ").append(toIndentedString(dst)).append("\n");
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
