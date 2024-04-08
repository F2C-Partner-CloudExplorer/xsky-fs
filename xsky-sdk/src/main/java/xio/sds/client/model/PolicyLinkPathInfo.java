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
 * PolicyLinkPathInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class PolicyLinkPathInfo {
  @SerializedName("dfs_path_id")
  private Long dfsPathId = null;

  @SerializedName("hdfs_num")
  private Long hdfsNum = null;

  @SerializedName("is_bucket")
  private Boolean isBucket = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("shares")
  private List<String> shares = null;

  @SerializedName("storage_policy_ids")
  private List<Long> storagePolicyIds = null;

  public PolicyLinkPathInfo dfsPathId(Long dfsPathId) {
    this.dfsPathId = dfsPathId;
    return this;
  }

   /**
   * id of path
   * @return dfsPathId
  **/
  @Schema(description = "id of path")
  public Long getDfsPathId() {
    return dfsPathId;
  }

  public void setDfsPathId(Long dfsPathId) {
    this.dfsPathId = dfsPathId;
  }

  public PolicyLinkPathInfo hdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
    return this;
  }

   /**
   * hdfs num of path
   * @return hdfsNum
  **/
  @Schema(description = "hdfs num of path")
  public Long getHdfsNum() {
    return hdfsNum;
  }

  public void setHdfsNum(Long hdfsNum) {
    this.hdfsNum = hdfsNum;
  }

  public PolicyLinkPathInfo isBucket(Boolean isBucket) {
    this.isBucket = isBucket;
    return this;
  }

   /**
   * if bucket of path
   * @return isBucket
  **/
  @Schema(description = "if bucket of path")
  public Boolean isIsBucket() {
    return isBucket;
  }

  public void setIsBucket(Boolean isBucket) {
    this.isBucket = isBucket;
  }

  public PolicyLinkPathInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * name of path
   * @return path
  **/
  @Schema(description = "name of path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PolicyLinkPathInfo shares(List<String> shares) {
    this.shares = shares;
    return this;
  }

  public PolicyLinkPathInfo addSharesItem(String sharesItem) {
    if (this.shares == null) {
      this.shares = new ArrayList<String>();
    }
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * share type of path
   * @return shares
  **/
  @Schema(description = "share type of path")
  public List<String> getShares() {
    return shares;
  }

  public void setShares(List<String> shares) {
    this.shares = shares;
  }

  public PolicyLinkPathInfo storagePolicyIds(List<Long> storagePolicyIds) {
    this.storagePolicyIds = storagePolicyIds;
    return this;
  }

  public PolicyLinkPathInfo addStoragePolicyIdsItem(Long storagePolicyIdsItem) {
    if (this.storagePolicyIds == null) {
      this.storagePolicyIds = new ArrayList<Long>();
    }
    this.storagePolicyIds.add(storagePolicyIdsItem);
    return this;
  }

   /**
   * link storage policy ids
   * @return storagePolicyIds
  **/
  @Schema(description = "link storage policy ids")
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
    PolicyLinkPathInfo policyLinkPathInfo = (PolicyLinkPathInfo) o;
    return Objects.equals(this.dfsPathId, policyLinkPathInfo.dfsPathId) &&
        Objects.equals(this.hdfsNum, policyLinkPathInfo.hdfsNum) &&
        Objects.equals(this.isBucket, policyLinkPathInfo.isBucket) &&
        Objects.equals(this.path, policyLinkPathInfo.path) &&
        Objects.equals(this.shares, policyLinkPathInfo.shares) &&
        Objects.equals(this.storagePolicyIds, policyLinkPathInfo.storagePolicyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsPathId, hdfsNum, isBucket, path, shares, storagePolicyIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyLinkPathInfo {\n");
    
    sb.append("    dfsPathId: ").append(toIndentedString(dfsPathId)).append("\n");
    sb.append("    hdfsNum: ").append(toIndentedString(hdfsNum)).append("\n");
    sb.append("    isBucket: ").append(toIndentedString(isBucket)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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