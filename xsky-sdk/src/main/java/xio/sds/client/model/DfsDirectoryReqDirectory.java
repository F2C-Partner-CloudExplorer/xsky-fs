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
 * DfsDirectoryReqDirectory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsDirectoryReqDirectory {
  @SerializedName("clean")
  private Boolean clean = null;

  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("recursive")
  private Boolean recursive = null;

  @SerializedName("storage_policy_ids")
  private List<Long> storagePolicyIds = null;

  public DfsDirectoryReqDirectory clean(Boolean clean) {
    this.clean = clean;
    return this;
  }

   /**
   * clean resources with directory, used when deleting
   * @return clean
  **/
  @Schema(description = "clean resources with directory, used when deleting")
  public Boolean isClean() {
    return clean;
  }

  public void setClean(Boolean clean) {
    this.clean = clean;
  }

  public DfsDirectoryReqDirectory dfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
    return this;
  }

   /**
   * dfs rootfs id
   * @return dfsRootfsId
  **/
  @Schema(required = true, description = "dfs rootfs id")
  public Long getDfsRootfsId() {
    return dfsRootfsId;
  }

  public void setDfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
  }

  public DfsDirectoryReqDirectory path(String path) {
    this.path = path;
    return this;
  }

   /**
   * directory path
   * @return path
  **/
  @Schema(required = true, description = "directory path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsDirectoryReqDirectory recursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

   /**
   * recursive create directory, used when creating
   * @return recursive
  **/
  @Schema(description = "recursive create directory, used when creating")
  public Boolean isRecursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  public DfsDirectoryReqDirectory storagePolicyIds(List<Long> storagePolicyIds) {
    this.storagePolicyIds = storagePolicyIds;
    return this;
  }

  public DfsDirectoryReqDirectory addStoragePolicyIdsItem(Long storagePolicyIdsItem) {
    if (this.storagePolicyIds == null) {
      this.storagePolicyIds = new ArrayList<Long>();
    }
    this.storagePolicyIds.add(storagePolicyIdsItem);
    return this;
  }

   /**
   * storage policy id array
   * @return storagePolicyIds
  **/
  @Schema(description = "storage policy id array")
  public List<Long> getStoragePolicyIds() {
    return storagePolicyIds;
  }

  public void setStoragePolicyIds(List<Long> storagePolicyIds) {
    this.storagePolicyIds = storagePolicyIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsDirectoryReqDirectory dfsDirectoryReqDirectory = (DfsDirectoryReqDirectory) o;
    return Objects.equals(this.clean, dfsDirectoryReqDirectory.clean) &&
        Objects.equals(this.dfsRootfsId, dfsDirectoryReqDirectory.dfsRootfsId) &&
        Objects.equals(this.path, dfsDirectoryReqDirectory.path) &&
        Objects.equals(this.recursive, dfsDirectoryReqDirectory.recursive) &&
        Objects.equals(this.storagePolicyIds, dfsDirectoryReqDirectory.storagePolicyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clean, dfsRootfsId, path, recursive, storagePolicyIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsDirectoryReqDirectory {\n");
    
    sb.append("    clean: ").append(toIndentedString(clean)).append("\n");
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
    sb.append("    storagePolicyIds: ").append(toIndentedString(storagePolicyIds)).append("\n");
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