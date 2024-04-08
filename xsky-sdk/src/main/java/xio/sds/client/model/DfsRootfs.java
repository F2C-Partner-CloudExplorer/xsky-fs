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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.DfsGatewayGroupNestview;
import xio.sds.client.model.MetadataClusterNestview;
import xio.sds.client.model.ProgressInfo;
/**
 * DfsRootfs contains information of a dfs rootfs and it&#x27;s stats.
 */
@Schema(description = "DfsRootfs contains information of a dfs rootfs and it's stats.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsRootfs {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dfs_gateway_group")
  private DfsGatewayGroupNestview dfsGatewayGroup = null;

  @SerializedName("gateway_group_ids")
  private List<Long> gatewayGroupIds = null;

  @SerializedName("gc_speed")
  private String gcSpeed = null;

  @SerializedName("hdfs_num")
  private Long hdfsNum = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("metadata_cluster")
  private MetadataClusterNestview metadataCluster = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority_policy_ids")
  private List<Long> priorityPolicyIds = null;

  @SerializedName("progress")
  private Double progress = null;

  @SerializedName("progress_info")
  private ProgressInfo progressInfo = null;

  @SerializedName("qos_num")
  private Long qosNum = null;

  @SerializedName("s3_bucket_num")
  private Long s3BucketNum = null;

  @SerializedName("share_nums")
  private Map<String, Long> shareNums = null;

  @SerializedName("shared")
  private Boolean shared = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("storage_policy_num")
  private Long storagePolicyNum = null;

  @SerializedName("tier_num")
  private Long tierNum = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("worm_log_path")
  private String wormLogPath = null;

  public DfsRootfs actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public DfsRootfs cluster(ClusterNestview cluster) {
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

  public DfsRootfs create(OffsetDateTime create) {
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

  public DfsRootfs description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DfsRootfs dfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
    return this;
  }

   /**
   * Get dfsGatewayGroup
   * @return dfsGatewayGroup
  **/
  @Schema(description = "")
  public DfsGatewayGroupNestview getDfsGatewayGroup() {
    return dfsGatewayGroup;
  }

  public void setDfsGatewayGroup(DfsGatewayGroupNestview dfsGatewayGroup) {
    this.dfsGatewayGroup = dfsGatewayGroup;
  }

  public DfsRootfs gatewayGroupIds(List<Long> gatewayGroupIds) {
    this.gatewayGroupIds = gatewayGroupIds;
    return this;
  }

  public DfsRootfs addGatewayGroupIdsItem(Long gatewayGroupIdsItem) {
    if (this.gatewayGroupIds == null) {
      this.gatewayGroupIds = new ArrayList<Long>();
    }
    this.gatewayGroupIds.add(gatewayGroupIdsItem);
    return this;
  }

   /**
   * Get gatewayGroupIds
   * @return gatewayGroupIds
  **/
  @Schema(description = "")
  public List<Long> getGatewayGroupIds() {
    return gatewayGroupIds;
  }

  public void setGatewayGroupIds(List<Long> gatewayGroupIds) {
    this.gatewayGroupIds = gatewayGroupIds;
  }

  public DfsRootfs gcSpeed(String gcSpeed) {
    this.gcSpeed = gcSpeed;
    return this;
  }

   /**
   * Get gcSpeed
   * @return gcSpeed
  **/
  @Schema(description = "")
  public String getGcSpeed() {
    return gcSpeed;
  }

  public void setGcSpeed(String gcSpeed) {
    this.gcSpeed = gcSpeed;
  }

  public DfsRootfs hdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
    return this;
  }

   /**
   * Get hdfsNum
   * @return hdfsNum
  **/
  @Schema(description = "")
  public Long getHdfsNum() {
    return hdfsNum;
  }

  public void setHdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
  }

  public DfsRootfs id(Long id) {
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

  public DfsRootfs metadataCluster(MetadataClusterNestview metadataCluster) {
    this.metadataCluster = metadataCluster;
    return this;
  }

   /**
   * Get metadataCluster
   * @return metadataCluster
  **/
  @Schema(description = "")
  public MetadataClusterNestview getMetadataCluster() {
    return metadataCluster;
  }

  public void setMetadataCluster(MetadataClusterNestview metadataCluster) {
    this.metadataCluster = metadataCluster;
  }

  public DfsRootfs name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DfsRootfs priorityPolicyIds(List<Long> priorityPolicyIds) {
    this.priorityPolicyIds = priorityPolicyIds;
    return this;
  }

  public DfsRootfs addPriorityPolicyIdsItem(Long priorityPolicyIdsItem) {
    if (this.priorityPolicyIds == null) {
      this.priorityPolicyIds = new ArrayList<Long>();
    }
    this.priorityPolicyIds.add(priorityPolicyIdsItem);
    return this;
  }

   /**
   * Get priorityPolicyIds
   * @return priorityPolicyIds
  **/
  @Schema(description = "")
  public List<Long> getPriorityPolicyIds() {
    return priorityPolicyIds;
  }

  public void setPriorityPolicyIds(List<Long> priorityPolicyIds) {
    this.priorityPolicyIds = priorityPolicyIds;
  }

  public DfsRootfs progress(Double progress) {
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

  public DfsRootfs progressInfo(ProgressInfo progressInfo) {
    this.progressInfo = progressInfo;
    return this;
  }

   /**
   * Get progressInfo
   * @return progressInfo
  **/
  @Schema(description = "")
  public ProgressInfo getProgressInfo() {
    return progressInfo;
  }

  public void setProgressInfo(ProgressInfo progressInfo) {
    this.progressInfo = progressInfo;
  }

  public DfsRootfs qosNum(Long qosNum) {
    this.qosNum = qosNum;
    return this;
  }

   /**
   * Get qosNum
   * @return qosNum
  **/
  @Schema(description = "")
  public Long getQosNum() {
    return qosNum;
  }

  public void setQosNum(Long qosNum) {
    this.qosNum = qosNum;
  }

  public DfsRootfs s3BucketNum(Long s3BucketNum) {
    this.s3BucketNum = s3BucketNum;
    return this;
  }

   /**
   * Get s3BucketNum
   * @return s3BucketNum
  **/
  @Schema(description = "")
  public Long getS3BucketNum() {
    return s3BucketNum;
  }

  public void setS3BucketNum(Long s3BucketNum) {
    this.s3BucketNum = s3BucketNum;
  }

  public DfsRootfs shareNums(Map<String, Long> shareNums) {
    this.shareNums = shareNums;
    return this;
  }

  public DfsRootfs putShareNumsItem(String key, Long shareNumsItem) {
    if (this.shareNums == null) {
      this.shareNums = new HashMap<String, Long>();
    }
    this.shareNums.put(key, shareNumsItem);
    return this;
  }

   /**
   * Get shareNums
   * @return shareNums
  **/
  @Schema(description = "")
  public Map<String, Long> getShareNums() {
    return shareNums;
  }

  public void setShareNums(Map<String, Long> shareNums) {
    this.shareNums = shareNums;
  }

  public DfsRootfs shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @Schema(description = "")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public DfsRootfs size(Long size) {
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

  public DfsRootfs status(String status) {
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

  public DfsRootfs storagePolicyNum(Long storagePolicyNum) {
    this.storagePolicyNum = storagePolicyNum;
    return this;
  }

   /**
   * Get storagePolicyNum
   * @return storagePolicyNum
  **/
  @Schema(description = "")
  public Long getStoragePolicyNum() {
    return storagePolicyNum;
  }

  public void setStoragePolicyNum(Long storagePolicyNum) {
    this.storagePolicyNum = storagePolicyNum;
  }

  public DfsRootfs tierNum(Long tierNum) {
    this.tierNum = tierNum;
    return this;
  }

   /**
   * Get tierNum
   * @return tierNum
  **/
  @Schema(description = "")
  public Long getTierNum() {
    return tierNum;
  }

  public void setTierNum(Long tierNum) {
    this.tierNum = tierNum;
  }

  public DfsRootfs update(OffsetDateTime update) {
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

  public DfsRootfs uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public DfsRootfs wormLogPath(String wormLogPath) {
    this.wormLogPath = wormLogPath;
    return this;
  }

   /**
   * Get wormLogPath
   * @return wormLogPath
  **/
  @Schema(description = "")
  public String getWormLogPath() {
    return wormLogPath;
  }

  public void setWormLogPath(String wormLogPath) {
    this.wormLogPath = wormLogPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsRootfs dfsRootfs = (DfsRootfs) o;
    return Objects.equals(this.actionStatus, dfsRootfs.actionStatus) &&
        Objects.equals(this.cluster, dfsRootfs.cluster) &&
        Objects.equals(this.create, dfsRootfs.create) &&
        Objects.equals(this.description, dfsRootfs.description) &&
        Objects.equals(this.dfsGatewayGroup, dfsRootfs.dfsGatewayGroup) &&
        Objects.equals(this.gatewayGroupIds, dfsRootfs.gatewayGroupIds) &&
        Objects.equals(this.gcSpeed, dfsRootfs.gcSpeed) &&
        Objects.equals(this.hdfsNum, dfsRootfs.hdfsNum) &&
        Objects.equals(this.id, dfsRootfs.id) &&
        Objects.equals(this.metadataCluster, dfsRootfs.metadataCluster) &&
        Objects.equals(this.name, dfsRootfs.name) &&
        Objects.equals(this.priorityPolicyIds, dfsRootfs.priorityPolicyIds) &&
        Objects.equals(this.progress, dfsRootfs.progress) &&
        Objects.equals(this.progressInfo, dfsRootfs.progressInfo) &&
        Objects.equals(this.qosNum, dfsRootfs.qosNum) &&
        Objects.equals(this.s3BucketNum, dfsRootfs.s3BucketNum) &&
        Objects.equals(this.shareNums, dfsRootfs.shareNums) &&
        Objects.equals(this.shared, dfsRootfs.shared) &&
        Objects.equals(this.size, dfsRootfs.size) &&
        Objects.equals(this.status, dfsRootfs.status) &&
        Objects.equals(this.storagePolicyNum, dfsRootfs.storagePolicyNum) &&
        Objects.equals(this.tierNum, dfsRootfs.tierNum) &&
        Objects.equals(this.update, dfsRootfs.update) &&
        Objects.equals(this.uuid, dfsRootfs.uuid) &&
        Objects.equals(this.wormLogPath, dfsRootfs.wormLogPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, create, description, dfsGatewayGroup, gatewayGroupIds, gcSpeed, hdfsNum, id, metadataCluster, name, priorityPolicyIds, progress, progressInfo, qosNum, s3BucketNum, shareNums, shared, size, status, storagePolicyNum, tierNum, update, uuid, wormLogPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsRootfs {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dfsGatewayGroup: ").append(toIndentedString(dfsGatewayGroup)).append("\n");
    sb.append("    gatewayGroupIds: ").append(toIndentedString(gatewayGroupIds)).append("\n");
    sb.append("    gcSpeed: ").append(toIndentedString(gcSpeed)).append("\n");
    sb.append("    hdfsNum: ").append(toIndentedString(hdfsNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataCluster: ").append(toIndentedString(metadataCluster)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priorityPolicyIds: ").append(toIndentedString(priorityPolicyIds)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    progressInfo: ").append(toIndentedString(progressInfo)).append("\n");
    sb.append("    qosNum: ").append(toIndentedString(qosNum)).append("\n");
    sb.append("    s3BucketNum: ").append(toIndentedString(s3BucketNum)).append("\n");
    sb.append("    shareNums: ").append(toIndentedString(shareNums)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storagePolicyNum: ").append(toIndentedString(storagePolicyNum)).append("\n");
    sb.append("    tierNum: ").append(toIndentedString(tierNum)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    wormLogPath: ").append(toIndentedString(wormLogPath)).append("\n");
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
