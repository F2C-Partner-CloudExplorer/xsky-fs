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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.DfsFileQos;
import xio.sds.client.model.DfsFileTrash;
import xio.sds.client.model.DfsFileWorm;
import xio.sds.client.model.DfsStoragePolicy;
import xio.sds.client.model.LocalGroupInfo;
import xio.sds.client.model.LocalUserInfo;
import xio.sds.client.model.NestedRootfs;
/**
 * DfsFile defines response for rmdir
 */
@Schema(description = "DfsFile defines response for rmdir")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsFile {
  @SerializedName("access")
  private OffsetDateTime access = null;

  @SerializedName("change")
  private OffsetDateTime change = null;

  @SerializedName("dfs_path_id")
  private Long dfsPathId = null;

  @SerializedName("dfs_path_performance_id")
  private Long dfsPathPerformanceId = null;

  @SerializedName("dfs_rootfs")
  private NestedRootfs dfsRootfs = null;

  @SerializedName("dfs_storage_policies")
  private List<DfsStoragePolicy> dfsStoragePolicies = null;

  @SerializedName("dp_snapshot_num")
  private Long dpSnapshotNum = null;

  @SerializedName("files")
  private Long files = null;

  @SerializedName("group")
  private Long group = null;

  @SerializedName("hdfs_num")
  private Long hdfsNum = null;

  @SerializedName("inode")
  private Long inode = null;

  @SerializedName("is_bucket")
  private Boolean isBucket = null;

  @SerializedName("is_bucket_parent")
  private Boolean isBucketParent = null;

  @SerializedName("local_group_info")
  private LocalGroupInfo localGroupInfo = null;

  @SerializedName("local_user_info")
  private LocalUserInfo localUserInfo = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("modify")
  private OffsetDateTime modify = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("original_name")
  private String originalName = null;

  @SerializedName("owner")
  private Long owner = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("parent_path_storage_policies")
  private List<DfsStoragePolicy> parentPathStoragePolicies = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("qos")
  private DfsFileQos qos = null;

  @SerializedName("quota_num")
  private Long quotaNum = null;

  @SerializedName("shared")
  private Boolean shared = null;

  @SerializedName("shares")
  private List<String> shares = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("snapshot_num")
  private Long snapshotNum = null;

  @SerializedName("stretched")
  private Boolean stretched = null;

  @SerializedName("total_snapshot_num")
  private Long totalSnapshotNum = null;

  @SerializedName("trash")
  private DfsFileTrash trash = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("worm")
  private DfsFileWorm worm = null;

  public DfsFile access(OffsetDateTime access) {
    this.access = access;
    return this;
  }

   /**
   * access time
   * @return access
  **/
  @Schema(description = "access time")
  public OffsetDateTime getAccess() {
    return access;
  }

  public void setAccess(OffsetDateTime access) {
    this.access = access;
  }

  public DfsFile change(OffsetDateTime change) {
    this.change = change;
    return this;
  }

   /**
   * change time
   * @return change
  **/
  @Schema(description = "change time")
  public OffsetDateTime getChange() {
    return change;
  }

  public void setChange(OffsetDateTime change) {
    this.change = change;
  }

  public DfsFile dfsPathId(Long dfsPathId) {
    this.dfsPathId = dfsPathId;
    return this;
  }

   /**
   * dfs path id
   * @return dfsPathId
  **/
  @Schema(description = "dfs path id")
  public Long getDfsPathId() {
    return dfsPathId;
  }

  public void setDfsPathId(Long dfsPathId) {
    this.dfsPathId = dfsPathId;
  }

  public DfsFile dfsPathPerformanceId(Long dfsPathPerformanceId) {
    this.dfsPathPerformanceId = dfsPathPerformanceId;
    return this;
  }

   /**
   * dfs path performance id
   * @return dfsPathPerformanceId
  **/
  @Schema(description = "dfs path performance id")
  public Long getDfsPathPerformanceId() {
    return dfsPathPerformanceId;
  }

  public void setDfsPathPerformanceId(Long dfsPathPerformanceId) {
    this.dfsPathPerformanceId = dfsPathPerformanceId;
  }

  public DfsFile dfsRootfs(NestedRootfs dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
    return this;
  }

   /**
   * Get dfsRootfs
   * @return dfsRootfs
  **/
  @Schema(description = "")
  public NestedRootfs getDfsRootfs() {
    return dfsRootfs;
  }

  public void setDfsRootfs(NestedRootfs dfsRootfs) {
    this.dfsRootfs = dfsRootfs;
  }

  public DfsFile dfsStoragePolicies(List<DfsStoragePolicy> dfsStoragePolicies) {
    this.dfsStoragePolicies = dfsStoragePolicies;
    return this;
  }

  public DfsFile addDfsStoragePoliciesItem(DfsStoragePolicy dfsStoragePoliciesItem) {
    if (this.dfsStoragePolicies == null) {
      this.dfsStoragePolicies = new ArrayList<DfsStoragePolicy>();
    }
    this.dfsStoragePolicies.add(dfsStoragePoliciesItem);
    return this;
  }

   /**
   * dfs storage policies
   * @return dfsStoragePolicies
  **/
  @Schema(description = "dfs storage policies")
  public List<DfsStoragePolicy> getDfsStoragePolicies() {
    return dfsStoragePolicies;
  }

  public void setDfsStoragePolicies(List<DfsStoragePolicy> dfsStoragePolicies) {
    this.dfsStoragePolicies = dfsStoragePolicies;
  }

  public DfsFile dpSnapshotNum(Long dpSnapshotNum) {
    this.dpSnapshotNum = dpSnapshotNum;
    return this;
  }

   /**
   * count of data protection snapshot
   * @return dpSnapshotNum
  **/
  @Schema(description = "count of data protection snapshot")
  public Long getDpSnapshotNum() {
    return dpSnapshotNum;
  }

  public void setDpSnapshotNum(Long dpSnapshotNum) {
    this.dpSnapshotNum = dpSnapshotNum;
  }

  public DfsFile files(Long files) {
    this.files = files;
    return this;
  }

   /**
   * sub file count when it is a directory
   * @return files
  **/
  @Schema(description = "sub file count when it is a directory")
  public Long getFiles() {
    return files;
  }

  public void setFiles(Long files) {
    this.files = files;
  }

  public DfsFile group(Long group) {
    this.group = group;
    return this;
  }

   /**
   * owner group
   * @return group
  **/
  @Schema(description = "owner group")
  public Long getGroup() {
    return group;
  }

  public void setGroup(Long group) {
    this.group = group;
  }

  public DfsFile hdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
    return this;
  }

   /**
   * count of hdfs
   * @return hdfsNum
  **/
  @Schema(description = "count of hdfs")
  public Long getHdfsNum() {
    return hdfsNum;
  }

  public void setHdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
  }

  public DfsFile inode(Long inode) {
    this.inode = inode;
    return this;
  }

   /**
   * inode count
   * @return inode
  **/
  @Schema(description = "inode count")
  public Long getInode() {
    return inode;
  }

  public void setInode(Long inode) {
    this.inode = inode;
  }

  public DfsFile isBucket(Boolean isBucket) {
    this.isBucket = isBucket;
    return this;
  }

   /**
   * is bucket path
   * @return isBucket
  **/
  @Schema(description = "is bucket path")
  public Boolean isIsBucket() {
    return isBucket;
  }

  public void setIsBucket(Boolean isBucket) {
    this.isBucket = isBucket;
  }

  public DfsFile isBucketParent(Boolean isBucketParent) {
    this.isBucketParent = isBucketParent;
    return this;
  }

   /**
   * is bucked parent path
   * @return isBucketParent
  **/
  @Schema(description = "is bucked parent path")
  public Boolean isIsBucketParent() {
    return isBucketParent;
  }

  public void setIsBucketParent(Boolean isBucketParent) {
    this.isBucketParent = isBucketParent;
  }

  public DfsFile localGroupInfo(LocalGroupInfo localGroupInfo) {
    this.localGroupInfo = localGroupInfo;
    return this;
  }

   /**
   * Get localGroupInfo
   * @return localGroupInfo
  **/
  @Schema(description = "")
  public LocalGroupInfo getLocalGroupInfo() {
    return localGroupInfo;
  }

  public void setLocalGroupInfo(LocalGroupInfo localGroupInfo) {
    this.localGroupInfo = localGroupInfo;
  }

  public DfsFile localUserInfo(LocalUserInfo localUserInfo) {
    this.localUserInfo = localUserInfo;
    return this;
  }

   /**
   * Get localUserInfo
   * @return localUserInfo
  **/
  @Schema(description = "")
  public LocalUserInfo getLocalUserInfo() {
    return localUserInfo;
  }

  public void setLocalUserInfo(LocalUserInfo localUserInfo) {
    this.localUserInfo = localUserInfo;
  }

  public DfsFile mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * file mode
   * @return mode
  **/
  @Schema(description = "file mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public DfsFile modify(OffsetDateTime modify) {
    this.modify = modify;
    return this;
  }

   /**
   * modify time
   * @return modify
  **/
  @Schema(description = "modify time")
  public OffsetDateTime getModify() {
    return modify;
  }

  public void setModify(OffsetDateTime modify) {
    this.modify = modify;
  }

  public DfsFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * file name
   * @return name
  **/
  @Schema(description = "file name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DfsFile originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * original name before file moved to trash
   * @return originalName
  **/
  @Schema(description = "original name before file moved to trash")
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public DfsFile owner(Long owner) {
    this.owner = owner;
    return this;
  }

   /**
   * owner user
   * @return owner
  **/
  @Schema(description = "owner user")
  public Long getOwner() {
    return owner;
  }

  public void setOwner(Long owner) {
    this.owner = owner;
  }

  public DfsFile parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * parent path
   * @return parent
  **/
  @Schema(description = "parent path")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public DfsFile parentPathStoragePolicies(List<DfsStoragePolicy> parentPathStoragePolicies) {
    this.parentPathStoragePolicies = parentPathStoragePolicies;
    return this;
  }

  public DfsFile addParentPathStoragePoliciesItem(DfsStoragePolicy parentPathStoragePoliciesItem) {
    if (this.parentPathStoragePolicies == null) {
      this.parentPathStoragePolicies = new ArrayList<DfsStoragePolicy>();
    }
    this.parentPathStoragePolicies.add(parentPathStoragePoliciesItem);
    return this;
  }

   /**
   * par path link dfs storage policies
   * @return parentPathStoragePolicies
  **/
  @Schema(description = "par path link dfs storage policies")
  public List<DfsStoragePolicy> getParentPathStoragePolicies() {
    return parentPathStoragePolicies;
  }

  public void setParentPathStoragePolicies(List<DfsStoragePolicy> parentPathStoragePolicies) {
    this.parentPathStoragePolicies = parentPathStoragePolicies;
  }

  public DfsFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * full path
   * @return path
  **/
  @Schema(description = "full path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsFile qos(DfsFileQos qos) {
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @Schema(description = "")
  public DfsFileQos getQos() {
    return qos;
  }

  public void setQos(DfsFileQos qos) {
    this.qos = qos;
  }

  public DfsFile quotaNum(Long quotaNum) {
    this.quotaNum = quotaNum;
    return this;
  }

   /**
   * count of quota
   * @return quotaNum
  **/
  @Schema(description = "count of quota")
  public Long getQuotaNum() {
    return quotaNum;
  }

  public void setQuotaNum(Long quotaNum) {
    this.quotaNum = quotaNum;
  }

  public DfsFile shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * shared
   * @return shared
  **/
  @Schema(description = "shared")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public DfsFile shares(List<String> shares) {
    this.shares = shares;
    return this;
  }

  public DfsFile addSharesItem(String sharesItem) {
    if (this.shares == null) {
      this.shares = new ArrayList<String>();
    }
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * share types
   * @return shares
  **/
  @Schema(description = "share types")
  public List<String> getShares() {
    return shares;
  }

  public void setShares(List<String> shares) {
    this.shares = shares;
  }

  public DfsFile size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * file size
   * @return size
  **/
  @Schema(description = "file size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DfsFile snapshotNum(Long snapshotNum) {
    this.snapshotNum = snapshotNum;
    return this;
  }

   /**
   * count of snapshot
   * @return snapshotNum
  **/
  @Schema(description = "count of snapshot")
  public Long getSnapshotNum() {
    return snapshotNum;
  }

  public void setSnapshotNum(Long snapshotNum) {
    this.snapshotNum = snapshotNum;
  }

  public DfsFile stretched(Boolean stretched) {
    this.stretched = stretched;
    return this;
  }

   /**
   * is stretched directory
   * @return stretched
  **/
  @Schema(description = "is stretched directory")
  public Boolean isStretched() {
    return stretched;
  }

  public void setStretched(Boolean stretched) {
    this.stretched = stretched;
  }

  public DfsFile totalSnapshotNum(Long totalSnapshotNum) {
    this.totalSnapshotNum = totalSnapshotNum;
    return this;
  }

   /**
   * count of total snapshot
   * @return totalSnapshotNum
  **/
  @Schema(description = "count of total snapshot")
  public Long getTotalSnapshotNum() {
    return totalSnapshotNum;
  }

  public void setTotalSnapshotNum(Long totalSnapshotNum) {
    this.totalSnapshotNum = totalSnapshotNum;
  }

  public DfsFile trash(DfsFileTrash trash) {
    this.trash = trash;
    return this;
  }

   /**
   * Get trash
   * @return trash
  **/
  @Schema(description = "")
  public DfsFileTrash getTrash() {
    return trash;
  }

  public void setTrash(DfsFileTrash trash) {
    this.trash = trash;
  }

  public DfsFile type(String type) {
    this.type = type;
    return this;
  }

   /**
   * file type
   * @return type
  **/
  @Schema(description = "file type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DfsFile worm(DfsFileWorm worm) {
    this.worm = worm;
    return this;
  }

   /**
   * Get worm
   * @return worm
  **/
  @Schema(description = "")
  public DfsFileWorm getWorm() {
    return worm;
  }

  public void setWorm(DfsFileWorm worm) {
    this.worm = worm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsFile dfsFile = (DfsFile) o;
    return Objects.equals(this.access, dfsFile.access) &&
        Objects.equals(this.change, dfsFile.change) &&
        Objects.equals(this.dfsPathId, dfsFile.dfsPathId) &&
        Objects.equals(this.dfsPathPerformanceId, dfsFile.dfsPathPerformanceId) &&
        Objects.equals(this.dfsRootfs, dfsFile.dfsRootfs) &&
        Objects.equals(this.dfsStoragePolicies, dfsFile.dfsStoragePolicies) &&
        Objects.equals(this.dpSnapshotNum, dfsFile.dpSnapshotNum) &&
        Objects.equals(this.files, dfsFile.files) &&
        Objects.equals(this.group, dfsFile.group) &&
        Objects.equals(this.hdfsNum, dfsFile.hdfsNum) &&
        Objects.equals(this.inode, dfsFile.inode) &&
        Objects.equals(this.isBucket, dfsFile.isBucket) &&
        Objects.equals(this.isBucketParent, dfsFile.isBucketParent) &&
        Objects.equals(this.localGroupInfo, dfsFile.localGroupInfo) &&
        Objects.equals(this.localUserInfo, dfsFile.localUserInfo) &&
        Objects.equals(this.mode, dfsFile.mode) &&
        Objects.equals(this.modify, dfsFile.modify) &&
        Objects.equals(this.name, dfsFile.name) &&
        Objects.equals(this.originalName, dfsFile.originalName) &&
        Objects.equals(this.owner, dfsFile.owner) &&
        Objects.equals(this.parent, dfsFile.parent) &&
        Objects.equals(this.parentPathStoragePolicies, dfsFile.parentPathStoragePolicies) &&
        Objects.equals(this.path, dfsFile.path) &&
        Objects.equals(this.qos, dfsFile.qos) &&
        Objects.equals(this.quotaNum, dfsFile.quotaNum) &&
        Objects.equals(this.shared, dfsFile.shared) &&
        Objects.equals(this.shares, dfsFile.shares) &&
        Objects.equals(this.size, dfsFile.size) &&
        Objects.equals(this.snapshotNum, dfsFile.snapshotNum) &&
        Objects.equals(this.stretched, dfsFile.stretched) &&
        Objects.equals(this.totalSnapshotNum, dfsFile.totalSnapshotNum) &&
        Objects.equals(this.trash, dfsFile.trash) &&
        Objects.equals(this.type, dfsFile.type) &&
        Objects.equals(this.worm, dfsFile.worm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(access, change, dfsPathId, dfsPathPerformanceId, dfsRootfs, dfsStoragePolicies, dpSnapshotNum, files, group, hdfsNum, inode, isBucket, isBucketParent, localGroupInfo, localUserInfo, mode, modify, name, originalName, owner, parent, parentPathStoragePolicies, path, qos, quotaNum, shared, shares, size, snapshotNum, stretched, totalSnapshotNum, trash, type, worm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsFile {\n");
    
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    dfsPathId: ").append(toIndentedString(dfsPathId)).append("\n");
    sb.append("    dfsPathPerformanceId: ").append(toIndentedString(dfsPathPerformanceId)).append("\n");
    sb.append("    dfsRootfs: ").append(toIndentedString(dfsRootfs)).append("\n");
    sb.append("    dfsStoragePolicies: ").append(toIndentedString(dfsStoragePolicies)).append("\n");
    sb.append("    dpSnapshotNum: ").append(toIndentedString(dpSnapshotNum)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    hdfsNum: ").append(toIndentedString(hdfsNum)).append("\n");
    sb.append("    inode: ").append(toIndentedString(inode)).append("\n");
    sb.append("    isBucket: ").append(toIndentedString(isBucket)).append("\n");
    sb.append("    isBucketParent: ").append(toIndentedString(isBucketParent)).append("\n");
    sb.append("    localGroupInfo: ").append(toIndentedString(localGroupInfo)).append("\n");
    sb.append("    localUserInfo: ").append(toIndentedString(localUserInfo)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    parentPathStoragePolicies: ").append(toIndentedString(parentPathStoragePolicies)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    quotaNum: ").append(toIndentedString(quotaNum)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
    sb.append("    stretched: ").append(toIndentedString(stretched)).append("\n");
    sb.append("    totalSnapshotNum: ").append(toIndentedString(totalSnapshotNum)).append("\n");
    sb.append("    trash: ").append(toIndentedString(trash)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    worm: ").append(toIndentedString(worm)).append("\n");
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