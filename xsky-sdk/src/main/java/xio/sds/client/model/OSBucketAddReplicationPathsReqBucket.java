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
import xio.sds.client.model.OSReplicationPathReq;
/**
 * OSBucketAddReplicationPathsReqBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSBucketAddReplicationPathsReqBucket {
  @SerializedName("os_replication_path_uuids")
  private List<String> osReplicationPathUuids = null;

  @SerializedName("os_replication_paths")
  private List<OSReplicationPathReq> osReplicationPaths = null;

  public OSBucketAddReplicationPathsReqBucket osReplicationPathUuids(List<String> osReplicationPathUuids) {
    this.osReplicationPathUuids = osReplicationPathUuids;
    return this;
  }

  public OSBucketAddReplicationPathsReqBucket addOsReplicationPathUuidsItem(String osReplicationPathUuidsItem) {
    if (this.osReplicationPathUuids == null) {
      this.osReplicationPathUuids = new ArrayList<String>();
    }
    this.osReplicationPathUuids.add(osReplicationPathUuidsItem);
    return this;
  }

   /**
   * Get osReplicationPathUuids
   * @return osReplicationPathUuids
  **/
  @Schema(description = "")
  public List<String> getOsReplicationPathUuids() {
    return osReplicationPathUuids;
  }

  public void setOsReplicationPathUuids(List<String> osReplicationPathUuids) {
    this.osReplicationPathUuids = osReplicationPathUuids;
  }

  public OSBucketAddReplicationPathsReqBucket osReplicationPaths(List<OSReplicationPathReq> osReplicationPaths) {
    this.osReplicationPaths = osReplicationPaths;
    return this;
  }

  public OSBucketAddReplicationPathsReqBucket addOsReplicationPathsItem(OSReplicationPathReq osReplicationPathsItem) {
    if (this.osReplicationPaths == null) {
      this.osReplicationPaths = new ArrayList<OSReplicationPathReq>();
    }
    this.osReplicationPaths.add(osReplicationPathsItem);
    return this;
  }

   /**
   * Get osReplicationPaths
   * @return osReplicationPaths
  **/
  @Schema(description = "")
  public List<OSReplicationPathReq> getOsReplicationPaths() {
    return osReplicationPaths;
  }

  public void setOsReplicationPaths(List<OSReplicationPathReq> osReplicationPaths) {
    this.osReplicationPaths = osReplicationPaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSBucketAddReplicationPathsReqBucket osBucketAddReplicationPathsReqBucket = (OSBucketAddReplicationPathsReqBucket) o;
    return Objects.equals(this.osReplicationPathUuids, osBucketAddReplicationPathsReqBucket.osReplicationPathUuids) &&
        Objects.equals(this.osReplicationPaths, osBucketAddReplicationPathsReqBucket.osReplicationPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osReplicationPathUuids, osReplicationPaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSBucketAddReplicationPathsReqBucket {\n");
    
    sb.append("    osReplicationPathUuids: ").append(toIndentedString(osReplicationPathUuids)).append("\n");
    sb.append("    osReplicationPaths: ").append(toIndentedString(osReplicationPaths)).append("\n");
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