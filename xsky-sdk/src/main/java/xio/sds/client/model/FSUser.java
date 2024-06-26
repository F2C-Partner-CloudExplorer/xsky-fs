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
import xio.sds.client.model.DfsGatewayGroup;
import xio.sds.client.model.DfsPathNestview;
import xio.sds.client.model.FSUserGroupNestview;
/**
 * FSUser defines model of file storage user +X:model:generate;order_by&#x3D;-ID;with_detailed +X:benchmark:
 */
@Schema(description = "FSUser defines model of file storage user +X:model:generate;order_by=-ID;with_detailed +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class FSUser {
  @SerializedName("bucket_limit")
  private Long bucketLimit = null;

  @SerializedName("bucket_num")
  private Long bucketNum = null;

  @SerializedName("bucket_parent_path")
  private DfsPathNestview bucketParentPath = null;

  @SerializedName("bucket_permission")
  private String bucketPermission = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fs_user_group_num")
  private Long fsUserGroupNum = null;

  @SerializedName("fs_user_groups")
  private List<FSUserGroupNestview> fsUserGroups = null;

  @SerializedName("gateway_group")
  private DfsGatewayGroup gatewayGroup = null;

  @SerializedName("hdfs_num")
  private Long hdfsNum = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("policy_filter_num")
  private Long policyFilterNum = null;

  @SerializedName("primary_group")
  private FSUserGroupNestview primaryGroup = null;

  @SerializedName("quota_num")
  private Long quotaNum = null;

  @SerializedName("s3_enabled")
  private Boolean s3Enabled = null;

  @SerializedName("s3_status")
  private String s3Status = null;

  @SerializedName("share_nums")
  private Map<String, Long> shareNums = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("version")
  private Long version = null;

  public FSUser bucketLimit(Long bucketLimit) {
    this.bucketLimit = bucketLimit;
    return this;
  }

   /**
   * Get bucketLimit
   * @return bucketLimit
  **/
  @Schema(description = "")
  public Long getBucketLimit() {
    return bucketLimit;
  }

  public void setBucketLimit(Long bucketLimit) {
    this.bucketLimit = bucketLimit;
  }

  public FSUser bucketNum(Long bucketNum) {
    this.bucketNum = bucketNum;
    return this;
  }

   /**
   * Get bucketNum
   * @return bucketNum
  **/
  @Schema(description = "")
  public Long getBucketNum() {
    return bucketNum;
  }

  public void setBucketNum(Long bucketNum) {
    this.bucketNum = bucketNum;
  }

  public FSUser bucketParentPath(DfsPathNestview bucketParentPath) {
    this.bucketParentPath = bucketParentPath;
    return this;
  }

   /**
   * Get bucketParentPath
   * @return bucketParentPath
  **/
  @Schema(description = "")
  public DfsPathNestview getBucketParentPath() {
    return bucketParentPath;
  }

  public void setBucketParentPath(DfsPathNestview bucketParentPath) {
    this.bucketParentPath = bucketParentPath;
  }

  public FSUser bucketPermission(String bucketPermission) {
    this.bucketPermission = bucketPermission;
    return this;
  }

   /**
   * Get bucketPermission
   * @return bucketPermission
  **/
  @Schema(description = "")
  public String getBucketPermission() {
    return bucketPermission;
  }

  public void setBucketPermission(String bucketPermission) {
    this.bucketPermission = bucketPermission;
  }

  public FSUser cluster(ClusterNestview cluster) {
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

  public FSUser create(OffsetDateTime create) {
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

  public FSUser description(String description) {
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

  public FSUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FSUser fsUserGroupNum(Long fsUserGroupNum) {
    this.fsUserGroupNum = fsUserGroupNum;
    return this;
  }

   /**
   * Get fsUserGroupNum
   * @return fsUserGroupNum
  **/
  @Schema(description = "")
  public Long getFsUserGroupNum() {
    return fsUserGroupNum;
  }

  public void setFsUserGroupNum(Long fsUserGroupNum) {
    this.fsUserGroupNum = fsUserGroupNum;
  }

  public FSUser fsUserGroups(List<FSUserGroupNestview> fsUserGroups) {
    this.fsUserGroups = fsUserGroups;
    return this;
  }

  public FSUser addFsUserGroupsItem(FSUserGroupNestview fsUserGroupsItem) {
    if (this.fsUserGroups == null) {
      this.fsUserGroups = new ArrayList<FSUserGroupNestview>();
    }
    this.fsUserGroups.add(fsUserGroupsItem);
    return this;
  }

   /**
   * Get fsUserGroups
   * @return fsUserGroups
  **/
  @Schema(description = "")
  public List<FSUserGroupNestview> getFsUserGroups() {
    return fsUserGroups;
  }

  public void setFsUserGroups(List<FSUserGroupNestview> fsUserGroups) {
    this.fsUserGroups = fsUserGroups;
  }

  public FSUser gatewayGroup(DfsGatewayGroup gatewayGroup) {
    this.gatewayGroup = gatewayGroup;
    return this;
  }

   /**
   * Get gatewayGroup
   * @return gatewayGroup
  **/
  @Schema(description = "")
  public DfsGatewayGroup getGatewayGroup() {
    return gatewayGroup;
  }

  public void setGatewayGroup(DfsGatewayGroup gatewayGroup) {
    this.gatewayGroup = gatewayGroup;
  }

  public FSUser hdfsNum(Long hdfsNum) {
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

  public FSUser id(Long id) {
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

  public FSUser name(String name) {
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

  public FSUser policyFilterNum(Long policyFilterNum) {
    this.policyFilterNum = policyFilterNum;
    return this;
  }

   /**
   * Get policyFilterNum
   * @return policyFilterNum
  **/
  @Schema(description = "")
  public Long getPolicyFilterNum() {
    return policyFilterNum;
  }

  public void setPolicyFilterNum(Long policyFilterNum) {
    this.policyFilterNum = policyFilterNum;
  }

  public FSUser primaryGroup(FSUserGroupNestview primaryGroup) {
    this.primaryGroup = primaryGroup;
    return this;
  }

   /**
   * Get primaryGroup
   * @return primaryGroup
  **/
  @Schema(description = "")
  public FSUserGroupNestview getPrimaryGroup() {
    return primaryGroup;
  }

  public void setPrimaryGroup(FSUserGroupNestview primaryGroup) {
    this.primaryGroup = primaryGroup;
  }

  public FSUser quotaNum(Long quotaNum) {
    this.quotaNum = quotaNum;
    return this;
  }

   /**
   * Get quotaNum
   * @return quotaNum
  **/
  @Schema(description = "")
  public Long getQuotaNum() {
    return quotaNum;
  }

  public void setQuotaNum(Long quotaNum) {
    this.quotaNum = quotaNum;
  }

  public FSUser s3Enabled(Boolean s3Enabled) {
    this.s3Enabled = s3Enabled;
    return this;
  }

   /**
   * dfs s3 support
   * @return s3Enabled
  **/
  @Schema(description = "dfs s3 support")
  public Boolean isS3Enabled() {
    return s3Enabled;
  }

  public void setS3Enabled(Boolean s3Enabled) {
    this.s3Enabled = s3Enabled;
  }

  public FSUser s3Status(String s3Status) {
    this.s3Status = s3Status;
    return this;
  }

   /**
   * indicate that s3 service is ok or not
   * @return s3Status
  **/
  @Schema(description = "indicate that s3 service is ok or not")
  public String getS3Status() {
    return s3Status;
  }

  public void setS3Status(String s3Status) {
    this.s3Status = s3Status;
  }

  public FSUser shareNums(Map<String, Long> shareNums) {
    this.shareNums = shareNums;
    return this;
  }

  public FSUser putShareNumsItem(String key, Long shareNumsItem) {
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

  public FSUser update(OffsetDateTime update) {
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

  public FSUser userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @Schema(description = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public FSUser version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FSUser fsUser = (FSUser) o;
    return Objects.equals(this.bucketLimit, fsUser.bucketLimit) &&
        Objects.equals(this.bucketNum, fsUser.bucketNum) &&
        Objects.equals(this.bucketParentPath, fsUser.bucketParentPath) &&
        Objects.equals(this.bucketPermission, fsUser.bucketPermission) &&
        Objects.equals(this.cluster, fsUser.cluster) &&
        Objects.equals(this.create, fsUser.create) &&
        Objects.equals(this.description, fsUser.description) &&
        Objects.equals(this.email, fsUser.email) &&
        Objects.equals(this.fsUserGroupNum, fsUser.fsUserGroupNum) &&
        Objects.equals(this.fsUserGroups, fsUser.fsUserGroups) &&
        Objects.equals(this.gatewayGroup, fsUser.gatewayGroup) &&
        Objects.equals(this.hdfsNum, fsUser.hdfsNum) &&
        Objects.equals(this.id, fsUser.id) &&
        Objects.equals(this.name, fsUser.name) &&
        Objects.equals(this.policyFilterNum, fsUser.policyFilterNum) &&
        Objects.equals(this.primaryGroup, fsUser.primaryGroup) &&
        Objects.equals(this.quotaNum, fsUser.quotaNum) &&
        Objects.equals(this.s3Enabled, fsUser.s3Enabled) &&
        Objects.equals(this.s3Status, fsUser.s3Status) &&
        Objects.equals(this.shareNums, fsUser.shareNums) &&
        Objects.equals(this.update, fsUser.update) &&
        Objects.equals(this.userId, fsUser.userId) &&
        Objects.equals(this.version, fsUser.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketLimit, bucketNum, bucketParentPath, bucketPermission, cluster, create, description, email, fsUserGroupNum, fsUserGroups, gatewayGroup, hdfsNum, id, name, policyFilterNum, primaryGroup, quotaNum, s3Enabled, s3Status, shareNums, update, userId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FSUser {\n");
    
    sb.append("    bucketLimit: ").append(toIndentedString(bucketLimit)).append("\n");
    sb.append("    bucketNum: ").append(toIndentedString(bucketNum)).append("\n");
    sb.append("    bucketParentPath: ").append(toIndentedString(bucketParentPath)).append("\n");
    sb.append("    bucketPermission: ").append(toIndentedString(bucketPermission)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fsUserGroupNum: ").append(toIndentedString(fsUserGroupNum)).append("\n");
    sb.append("    fsUserGroups: ").append(toIndentedString(fsUserGroups)).append("\n");
    sb.append("    gatewayGroup: ").append(toIndentedString(gatewayGroup)).append("\n");
    sb.append("    hdfsNum: ").append(toIndentedString(hdfsNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyFilterNum: ").append(toIndentedString(policyFilterNum)).append("\n");
    sb.append("    primaryGroup: ").append(toIndentedString(primaryGroup)).append("\n");
    sb.append("    quotaNum: ").append(toIndentedString(quotaNum)).append("\n");
    sb.append("    s3Enabled: ").append(toIndentedString(s3Enabled)).append("\n");
    sb.append("    s3Status: ").append(toIndentedString(s3Status)).append("\n");
    sb.append("    shareNums: ").append(toIndentedString(shareNums)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
