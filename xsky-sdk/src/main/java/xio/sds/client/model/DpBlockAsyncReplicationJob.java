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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.Cluster;
import xio.sds.client.model.DpBlockAsyncReplicationPairNestview;
import xio.sds.client.model.DpVolumeGroupSnapshotReplicationJobNestview;
import xio.sds.client.model.SnapshotNestview;
/**
 * DpBlockAsyncReplicationJob is one execution of a dp block replication protection +X:model:generate;plur&#x3D;DpBlockAsyncReplicationJobs;order_by&#x3D;-ID;with_detailed; +X:benchmark:
 */
@Schema(description = "DpBlockAsyncReplicationJob is one execution of a dp block replication protection +X:model:generate;plur=DpBlockAsyncReplicationJobs;order_by=-ID;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockAsyncReplicationJob {
  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("diff_type")
  private String diffType = null;

  @SerializedName("dp_block_async_replication_pair")
  private DpBlockAsyncReplicationPairNestview dpBlockAsyncReplicationPair = null;

  @SerializedName("dp_volume_group_snapshot_replication_job")
  private DpVolumeGroupSnapshotReplicationJobNestview dpVolumeGroupSnapshotReplicationJob = null;

  @SerializedName("finished_at")
  private OffsetDateTime finishedAt = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("max_retry_times")
  private Long maxRetryTimes = null;

  @SerializedName("progress")
  private Double progress = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("snapshot")
  private SnapshotNestview snapshot = null;

  @SerializedName("started_at")
  private OffsetDateTime startedAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("volume_name")
  private String volumeName = null;

  public DpBlockAsyncReplicationJob cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public DpBlockAsyncReplicationJob diffType(String diffType) {
    this.diffType = diffType;
    return this;
  }

   /**
   * Get diffType
   * @return diffType
  **/
  @Schema(description = "")
  public String getDiffType() {
    return diffType;
  }

  public void setDiffType(String diffType) {
    this.diffType = diffType;
  }

  public DpBlockAsyncReplicationJob dpBlockAsyncReplicationPair(DpBlockAsyncReplicationPairNestview dpBlockAsyncReplicationPair) {
    this.dpBlockAsyncReplicationPair = dpBlockAsyncReplicationPair;
    return this;
  }

   /**
   * Get dpBlockAsyncReplicationPair
   * @return dpBlockAsyncReplicationPair
  **/
  @Schema(description = "")
  public DpBlockAsyncReplicationPairNestview getDpBlockAsyncReplicationPair() {
    return dpBlockAsyncReplicationPair;
  }

  public void setDpBlockAsyncReplicationPair(DpBlockAsyncReplicationPairNestview dpBlockAsyncReplicationPair) {
    this.dpBlockAsyncReplicationPair = dpBlockAsyncReplicationPair;
  }

  public DpBlockAsyncReplicationJob dpVolumeGroupSnapshotReplicationJob(DpVolumeGroupSnapshotReplicationJobNestview dpVolumeGroupSnapshotReplicationJob) {
    this.dpVolumeGroupSnapshotReplicationJob = dpVolumeGroupSnapshotReplicationJob;
    return this;
  }

   /**
   * Get dpVolumeGroupSnapshotReplicationJob
   * @return dpVolumeGroupSnapshotReplicationJob
  **/
  @Schema(description = "")
  public DpVolumeGroupSnapshotReplicationJobNestview getDpVolumeGroupSnapshotReplicationJob() {
    return dpVolumeGroupSnapshotReplicationJob;
  }

  public void setDpVolumeGroupSnapshotReplicationJob(DpVolumeGroupSnapshotReplicationJobNestview dpVolumeGroupSnapshotReplicationJob) {
    this.dpVolumeGroupSnapshotReplicationJob = dpVolumeGroupSnapshotReplicationJob;
  }

  public DpBlockAsyncReplicationJob finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * Get finishedAt
   * @return finishedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }

  public DpBlockAsyncReplicationJob id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DpBlockAsyncReplicationJob maxRetryTimes(Long maxRetryTimes) {
    this.maxRetryTimes = maxRetryTimes;
    return this;
  }

   /**
   * Get maxRetryTimes
   * @return maxRetryTimes
  **/
  @Schema(description = "")
  public Long getMaxRetryTimes() {
    return maxRetryTimes;
  }

  public void setMaxRetryTimes(Long maxRetryTimes) {
    this.maxRetryTimes = maxRetryTimes;
  }

  public DpBlockAsyncReplicationJob progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @Schema(description = "")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public DpBlockAsyncReplicationJob size(Long size) {
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

  public DpBlockAsyncReplicationJob snapshot(SnapshotNestview snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @Schema(description = "")
  public SnapshotNestview getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(SnapshotNestview snapshot) {
    this.snapshot = snapshot;
  }

  public DpBlockAsyncReplicationJob startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public DpBlockAsyncReplicationJob status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DpBlockAsyncReplicationJob updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DpBlockAsyncReplicationJob volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * Get volumeName
   * @return volumeName
  **/
  @Schema(description = "")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpBlockAsyncReplicationJob dpBlockAsyncReplicationJob = (DpBlockAsyncReplicationJob) o;
    return Objects.equals(this.cluster, dpBlockAsyncReplicationJob.cluster) &&
        Objects.equals(this.diffType, dpBlockAsyncReplicationJob.diffType) &&
        Objects.equals(this.dpBlockAsyncReplicationPair, dpBlockAsyncReplicationJob.dpBlockAsyncReplicationPair) &&
        Objects.equals(this.dpVolumeGroupSnapshotReplicationJob, dpBlockAsyncReplicationJob.dpVolumeGroupSnapshotReplicationJob) &&
        Objects.equals(this.finishedAt, dpBlockAsyncReplicationJob.finishedAt) &&
        Objects.equals(this.id, dpBlockAsyncReplicationJob.id) &&
        Objects.equals(this.maxRetryTimes, dpBlockAsyncReplicationJob.maxRetryTimes) &&
        Objects.equals(this.progress, dpBlockAsyncReplicationJob.progress) &&
        Objects.equals(this.size, dpBlockAsyncReplicationJob.size) &&
        Objects.equals(this.snapshot, dpBlockAsyncReplicationJob.snapshot) &&
        Objects.equals(this.startedAt, dpBlockAsyncReplicationJob.startedAt) &&
        Objects.equals(this.status, dpBlockAsyncReplicationJob.status) &&
        Objects.equals(this.updatedAt, dpBlockAsyncReplicationJob.updatedAt) &&
        Objects.equals(this.volumeName, dpBlockAsyncReplicationJob.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, diffType, dpBlockAsyncReplicationPair, dpVolumeGroupSnapshotReplicationJob, finishedAt, id, maxRetryTimes, progress, size, snapshot, startedAt, status, updatedAt, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockAsyncReplicationJob {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    diffType: ").append(toIndentedString(diffType)).append("\n");
    sb.append("    dpBlockAsyncReplicationPair: ").append(toIndentedString(dpBlockAsyncReplicationPair)).append("\n");
    sb.append("    dpVolumeGroupSnapshotReplicationJob: ").append(toIndentedString(dpVolumeGroupSnapshotReplicationJob)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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
