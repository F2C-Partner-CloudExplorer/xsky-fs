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
import xio.sds.client.model.DfsPathNestview;
import xio.sds.client.model.DfsRootfsNestview;
/**
 * DfsWorm defines model of dfs worm +X:model:generate;order_by&#x3D;-ID +X:benchmark:
 */
@Schema(description = "DfsWorm defines model of dfs worm +X:model:generate;order_by=-ID +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsWorm {
  @SerializedName("auto_lock_period")
  private String autoLockPeriod = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("default_protect_period")
  private String defaultProtectPeriod = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("max_protect_period")
  private String maxProtectPeriod = null;

  @SerializedName("min_protect_period")
  private String minProtectPeriod = null;

  @SerializedName("path")
  private DfsPathNestview path = null;

  @SerializedName("rootfs")
  private DfsRootfsNestview rootfs = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public DfsWorm autoLockPeriod(String autoLockPeriod) {
    this.autoLockPeriod = autoLockPeriod;
    return this;
  }

   /**
   * Get autoLockPeriod
   * @return autoLockPeriod
  **/
  @Schema(description = "")
  public String getAutoLockPeriod() {
    return autoLockPeriod;
  }

  public void setAutoLockPeriod(String autoLockPeriod) {
    this.autoLockPeriod = autoLockPeriod;
  }

  public DfsWorm cluster(ClusterNestview cluster) {
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

  public DfsWorm create(OffsetDateTime create) {
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

  public DfsWorm defaultProtectPeriod(String defaultProtectPeriod) {
    this.defaultProtectPeriod = defaultProtectPeriod;
    return this;
  }

   /**
   * Get defaultProtectPeriod
   * @return defaultProtectPeriod
  **/
  @Schema(description = "")
  public String getDefaultProtectPeriod() {
    return defaultProtectPeriod;
  }

  public void setDefaultProtectPeriod(String defaultProtectPeriod) {
    this.defaultProtectPeriod = defaultProtectPeriod;
  }

  public DfsWorm id(Long id) {
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

  public DfsWorm maxProtectPeriod(String maxProtectPeriod) {
    this.maxProtectPeriod = maxProtectPeriod;
    return this;
  }

   /**
   * Get maxProtectPeriod
   * @return maxProtectPeriod
  **/
  @Schema(description = "")
  public String getMaxProtectPeriod() {
    return maxProtectPeriod;
  }

  public void setMaxProtectPeriod(String maxProtectPeriod) {
    this.maxProtectPeriod = maxProtectPeriod;
  }

  public DfsWorm minProtectPeriod(String minProtectPeriod) {
    this.minProtectPeriod = minProtectPeriod;
    return this;
  }

   /**
   * Get minProtectPeriod
   * @return minProtectPeriod
  **/
  @Schema(description = "")
  public String getMinProtectPeriod() {
    return minProtectPeriod;
  }

  public void setMinProtectPeriod(String minProtectPeriod) {
    this.minProtectPeriod = minProtectPeriod;
  }

  public DfsWorm path(DfsPathNestview path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public DfsPathNestview getPath() {
    return path;
  }

  public void setPath(DfsPathNestview path) {
    this.path = path;
  }

  public DfsWorm rootfs(DfsRootfsNestview rootfs) {
    this.rootfs = rootfs;
    return this;
  }

   /**
   * Get rootfs
   * @return rootfs
  **/
  @Schema(description = "")
  public DfsRootfsNestview getRootfs() {
    return rootfs;
  }

  public void setRootfs(DfsRootfsNestview rootfs) {
    this.rootfs = rootfs;
  }

  public DfsWorm status(String status) {
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

  public DfsWorm update(OffsetDateTime update) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsWorm dfsWorm = (DfsWorm) o;
    return Objects.equals(this.autoLockPeriod, dfsWorm.autoLockPeriod) &&
        Objects.equals(this.cluster, dfsWorm.cluster) &&
        Objects.equals(this.create, dfsWorm.create) &&
        Objects.equals(this.defaultProtectPeriod, dfsWorm.defaultProtectPeriod) &&
        Objects.equals(this.id, dfsWorm.id) &&
        Objects.equals(this.maxProtectPeriod, dfsWorm.maxProtectPeriod) &&
        Objects.equals(this.minProtectPeriod, dfsWorm.minProtectPeriod) &&
        Objects.equals(this.path, dfsWorm.path) &&
        Objects.equals(this.rootfs, dfsWorm.rootfs) &&
        Objects.equals(this.status, dfsWorm.status) &&
        Objects.equals(this.update, dfsWorm.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLockPeriod, cluster, create, defaultProtectPeriod, id, maxProtectPeriod, minProtectPeriod, path, rootfs, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsWorm {\n");
    
    sb.append("    autoLockPeriod: ").append(toIndentedString(autoLockPeriod)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    defaultProtectPeriod: ").append(toIndentedString(defaultProtectPeriod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxProtectPeriod: ").append(toIndentedString(maxProtectPeriod)).append("\n");
    sb.append("    minProtectPeriod: ").append(toIndentedString(minProtectPeriod)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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