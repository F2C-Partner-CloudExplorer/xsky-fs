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
 * OSBucketUsageCategory contain usage info
 */
@Schema(description = "OSBucketUsageCategory contain usage info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSBucketUsageCategory {
  @SerializedName("download_bytes")
  private Long downloadBytes = null;

  @SerializedName("ops")
  private Long ops = null;

  @SerializedName("upload_bytes")
  private Long uploadBytes = null;

  public OSBucketUsageCategory downloadBytes(Long downloadBytes) {
    this.downloadBytes = downloadBytes;
    return this;
  }

   /**
   * Get downloadBytes
   * @return downloadBytes
  **/
  @Schema(description = "")
  public Long getDownloadBytes() {
    return downloadBytes;
  }

  public void setDownloadBytes(Long downloadBytes) {
    this.downloadBytes = downloadBytes;
  }

  public OSBucketUsageCategory ops(Long ops) {
    this.ops = ops;
    return this;
  }

   /**
   * Get ops
   * @return ops
  **/
  @Schema(description = "")
  public Long getOps() {
    return ops;
  }

  public void setOps(Long ops) {
    this.ops = ops;
  }

  public OSBucketUsageCategory uploadBytes(Long uploadBytes) {
    this.uploadBytes = uploadBytes;
    return this;
  }

   /**
   * Get uploadBytes
   * @return uploadBytes
  **/
  @Schema(description = "")
  public Long getUploadBytes() {
    return uploadBytes;
  }

  public void setUploadBytes(Long uploadBytes) {
    this.uploadBytes = uploadBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSBucketUsageCategory osBucketUsageCategory = (OSBucketUsageCategory) o;
    return Objects.equals(this.downloadBytes, osBucketUsageCategory.downloadBytes) &&
        Objects.equals(this.ops, osBucketUsageCategory.ops) &&
        Objects.equals(this.uploadBytes, osBucketUsageCategory.uploadBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadBytes, ops, uploadBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSBucketUsageCategory {\n");
    
    sb.append("    downloadBytes: ").append(toIndentedString(downloadBytes)).append("\n");
    sb.append("    ops: ").append(toIndentedString(ops)).append("\n");
    sb.append("    uploadBytes: ").append(toIndentedString(uploadBytes)).append("\n");
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
