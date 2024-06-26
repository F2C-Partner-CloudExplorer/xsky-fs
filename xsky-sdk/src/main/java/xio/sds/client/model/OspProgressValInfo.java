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
import xio.sds.client.model.OspProgressBucketStats;
/**
 * OspProgressValInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspProgressValInfo {
  @SerializedName("success")
  private Long success = null;

  @SerializedName("bucket_stats")
  private OspProgressBucketStats bucketStats = null;

  @SerializedName("deleted")
  private Long deleted = null;

  @SerializedName("skip")
  private Long skip = null;

  @SerializedName("version_id_marker")
  private String versionIdMarker = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("exist")
  private Long exist = null;

  @SerializedName("marker")
  private String marker = null;

  public OspProgressValInfo success(Long success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @Schema(description = "")
  public Long getSuccess() {
    return success;
  }

  public void setSuccess(Long success) {
    this.success = success;
  }

  public OspProgressValInfo bucketStats(OspProgressBucketStats bucketStats) {
    this.bucketStats = bucketStats;
    return this;
  }

   /**
   * Get bucketStats
   * @return bucketStats
  **/
  @Schema(description = "")
  public OspProgressBucketStats getBucketStats() {
    return bucketStats;
  }

  public void setBucketStats(OspProgressBucketStats bucketStats) {
    this.bucketStats = bucketStats;
  }

  public OspProgressValInfo deleted(Long deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Long getDeleted() {
    return deleted;
  }

  public void setDeleted(Long deleted) {
    this.deleted = deleted;
  }

  public OspProgressValInfo skip(Long skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Get skip
   * @return skip
  **/
  @Schema(description = "")
  public Long getSkip() {
    return skip;
  }

  public void setSkip(Long skip) {
    this.skip = skip;
  }

  public OspProgressValInfo versionIdMarker(String versionIdMarker) {
    this.versionIdMarker = versionIdMarker;
    return this;
  }

   /**
   * Get versionIdMarker
   * @return versionIdMarker
  **/
  @Schema(description = "")
  public String getVersionIdMarker() {
    return versionIdMarker;
  }

  public void setVersionIdMarker(String versionIdMarker) {
    this.versionIdMarker = versionIdMarker;
  }

  public OspProgressValInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(description = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OspProgressValInfo exist(Long exist) {
    this.exist = exist;
    return this;
  }

   /**
   * Get exist
   * @return exist
  **/
  @Schema(description = "")
  public Long getExist() {
    return exist;
  }

  public void setExist(Long exist) {
    this.exist = exist;
  }

  public OspProgressValInfo marker(String marker) {
    this.marker = marker;
    return this;
  }

   /**
   * Get marker
   * @return marker
  **/
  @Schema(description = "")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspProgressValInfo ospProgressValInfo = (OspProgressValInfo) o;
    return Objects.equals(this.success, ospProgressValInfo.success) &&
        Objects.equals(this.bucketStats, ospProgressValInfo.bucketStats) &&
        Objects.equals(this.deleted, ospProgressValInfo.deleted) &&
        Objects.equals(this.skip, ospProgressValInfo.skip) &&
        Objects.equals(this.versionIdMarker, ospProgressValInfo.versionIdMarker) &&
        Objects.equals(this.state, ospProgressValInfo.state) &&
        Objects.equals(this.exist, ospProgressValInfo.exist) &&
        Objects.equals(this.marker, ospProgressValInfo.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, bucketStats, deleted, skip, versionIdMarker, state, exist, marker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspProgressValInfo {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    bucketStats: ").append(toIndentedString(bucketStats)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    versionIdMarker: ").append(toIndentedString(versionIdMarker)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    exist: ").append(toIndentedString(exist)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
