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
import xio.sds.client.model.OspRebuildBucketInfo;
import xio.sds.client.model.OspRebuildProgresses;
/**
 * OspRebuildProgress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspRebuildProgress {
  @SerializedName("target_marker")
  private Long targetMarker = null;

  @SerializedName("task_id")
  private String taskId = null;

  @SerializedName("rebuild_versions")
  private Boolean rebuildVersions = null;

  @SerializedName("bucket")
  private OspRebuildBucketInfo bucket = null;

  @SerializedName("rebuild_id")
  private String rebuildId = null;

  @SerializedName("backend_marker")
  private Long backendMarker = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("progress")
  private List<OspRebuildProgresses> progress = null;

  public OspRebuildProgress targetMarker(Long targetMarker) {
    this.targetMarker = targetMarker;
    return this;
  }

   /**
   * Get targetMarker
   * @return targetMarker
  **/
  @Schema(description = "")
  public Long getTargetMarker() {
    return targetMarker;
  }

  public void setTargetMarker(Long targetMarker) {
    this.targetMarker = targetMarker;
  }

  public OspRebuildProgress taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public OspRebuildProgress rebuildVersions(Boolean rebuildVersions) {
    this.rebuildVersions = rebuildVersions;
    return this;
  }

   /**
   * Get rebuildVersions
   * @return rebuildVersions
  **/
  @Schema(description = "")
  public Boolean isRebuildVersions() {
    return rebuildVersions;
  }

  public void setRebuildVersions(Boolean rebuildVersions) {
    this.rebuildVersions = rebuildVersions;
  }

  public OspRebuildProgress bucket(OspRebuildBucketInfo bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(description = "")
  public OspRebuildBucketInfo getBucket() {
    return bucket;
  }

  public void setBucket(OspRebuildBucketInfo bucket) {
    this.bucket = bucket;
  }

  public OspRebuildProgress rebuildId(String rebuildId) {
    this.rebuildId = rebuildId;
    return this;
  }

   /**
   * Get rebuildId
   * @return rebuildId
  **/
  @Schema(description = "")
  public String getRebuildId() {
    return rebuildId;
  }

  public void setRebuildId(String rebuildId) {
    this.rebuildId = rebuildId;
  }

  public OspRebuildProgress backendMarker(Long backendMarker) {
    this.backendMarker = backendMarker;
    return this;
  }

   /**
   * Get backendMarker
   * @return backendMarker
  **/
  @Schema(description = "")
  public Long getBackendMarker() {
    return backendMarker;
  }

  public void setBackendMarker(Long backendMarker) {
    this.backendMarker = backendMarker;
  }

  public OspRebuildProgress mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public OspRebuildProgress progress(List<OspRebuildProgresses> progress) {
    this.progress = progress;
    return this;
  }

  public OspRebuildProgress addProgressItem(OspRebuildProgresses progressItem) {
    if (this.progress == null) {
      this.progress = new ArrayList<OspRebuildProgresses>();
    }
    this.progress.add(progressItem);
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public List<OspRebuildProgresses> getProgress() {
    return progress;
  }

  public void setProgress(List<OspRebuildProgresses> progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspRebuildProgress ospRebuildProgress = (OspRebuildProgress) o;
    return Objects.equals(this.targetMarker, ospRebuildProgress.targetMarker) &&
        Objects.equals(this.taskId, ospRebuildProgress.taskId) &&
        Objects.equals(this.rebuildVersions, ospRebuildProgress.rebuildVersions) &&
        Objects.equals(this.bucket, ospRebuildProgress.bucket) &&
        Objects.equals(this.rebuildId, ospRebuildProgress.rebuildId) &&
        Objects.equals(this.backendMarker, ospRebuildProgress.backendMarker) &&
        Objects.equals(this.mode, ospRebuildProgress.mode) &&
        Objects.equals(this.progress, ospRebuildProgress.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetMarker, taskId, rebuildVersions, bucket, rebuildId, backendMarker, mode, progress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspRebuildProgress {\n");
    
    sb.append("    targetMarker: ").append(toIndentedString(targetMarker)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    rebuildVersions: ").append(toIndentedString(rebuildVersions)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    rebuildId: ").append(toIndentedString(rebuildId)).append("\n");
    sb.append("    backendMarker: ").append(toIndentedString(backendMarker)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
