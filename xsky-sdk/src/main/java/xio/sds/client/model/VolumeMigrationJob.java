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
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.HostNestview;
import xio.sds.client.model.PoolNestview;
import xio.sds.client.model.Task;
import xio.sds.client.model.VolumeNestview;
/**
 * VolumeMigrationJob defines the volume migration job record
 */
@Schema(description = "VolumeMigrationJob defines the volume migration job record")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeMigrationJob {
  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dest_pool")
  private PoolNestview destPool = null;

  @SerializedName("finished_at")
  private OffsetDateTime finishedAt = null;

  @SerializedName("host")
  private HostNestview host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("remaining_time")
  private Long remainingTime = null;

  @SerializedName("source_pool")
  private PoolNestview sourcePool = null;

  @SerializedName("started_at")
  private OffsetDateTime startedAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("stripes")
  private Long stripes = null;

  @SerializedName("task")
  private Task task = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("volume")
  private VolumeNestview volume = null;

  public VolumeMigrationJob cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public VolumeMigrationJob create(OffsetDateTime create) {
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

  public VolumeMigrationJob destPool(PoolNestview destPool) {
    this.destPool = destPool;
    return this;
  }

   /**
   * Get destPool
   * @return destPool
  **/
  @Schema(description = "")
  public PoolNestview getDestPool() {
    return destPool;
  }

  public void setDestPool(PoolNestview destPool) {
    this.destPool = destPool;
  }

  public VolumeMigrationJob finishedAt(OffsetDateTime finishedAt) {
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

  public VolumeMigrationJob host(HostNestview host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public HostNestview getHost() {
    return host;
  }

  public void setHost(HostNestview host) {
    this.host = host;
  }

  public VolumeMigrationJob id(Long id) {
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

  public VolumeMigrationJob remainingTime(Long remainingTime) {
    this.remainingTime = remainingTime;
    return this;
  }

   /**
   * Get remainingTime
   * @return remainingTime
  **/
  @Schema(description = "")
  public Long getRemainingTime() {
    return remainingTime;
  }

  public void setRemainingTime(Long remainingTime) {
    this.remainingTime = remainingTime;
  }

  public VolumeMigrationJob sourcePool(PoolNestview sourcePool) {
    this.sourcePool = sourcePool;
    return this;
  }

   /**
   * Get sourcePool
   * @return sourcePool
  **/
  @Schema(description = "")
  public PoolNestview getSourcePool() {
    return sourcePool;
  }

  public void setSourcePool(PoolNestview sourcePool) {
    this.sourcePool = sourcePool;
  }

  public VolumeMigrationJob startedAt(OffsetDateTime startedAt) {
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

  public VolumeMigrationJob status(String status) {
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

  public VolumeMigrationJob stripes(Long stripes) {
    this.stripes = stripes;
    return this;
  }

   /**
   * Get stripes
   * @return stripes
  **/
  @Schema(description = "")
  public Long getStripes() {
    return stripes;
  }

  public void setStripes(Long stripes) {
    this.stripes = stripes;
  }

  public VolumeMigrationJob task(Task task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @Schema(description = "")
  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public VolumeMigrationJob update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public VolumeMigrationJob volume(VolumeNestview volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public VolumeNestview getVolume() {
    return volume;
  }

  public void setVolume(VolumeNestview volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeMigrationJob volumeMigrationJob = (VolumeMigrationJob) o;
    return Objects.equals(this.cluster, volumeMigrationJob.cluster) &&
        Objects.equals(this.create, volumeMigrationJob.create) &&
        Objects.equals(this.destPool, volumeMigrationJob.destPool) &&
        Objects.equals(this.finishedAt, volumeMigrationJob.finishedAt) &&
        Objects.equals(this.host, volumeMigrationJob.host) &&
        Objects.equals(this.id, volumeMigrationJob.id) &&
        Objects.equals(this.remainingTime, volumeMigrationJob.remainingTime) &&
        Objects.equals(this.sourcePool, volumeMigrationJob.sourcePool) &&
        Objects.equals(this.startedAt, volumeMigrationJob.startedAt) &&
        Objects.equals(this.status, volumeMigrationJob.status) &&
        Objects.equals(this.stripes, volumeMigrationJob.stripes) &&
        Objects.equals(this.task, volumeMigrationJob.task) &&
        Objects.equals(this.update, volumeMigrationJob.update) &&
        Objects.equals(this.volume, volumeMigrationJob.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, destPool, finishedAt, host, id, remainingTime, sourcePool, startedAt, status, stripes, task, update, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeMigrationJob {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    destPool: ").append(toIndentedString(destPool)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
    sb.append("    sourcePool: ").append(toIndentedString(sourcePool)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stripes: ").append(toIndentedString(stripes)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
