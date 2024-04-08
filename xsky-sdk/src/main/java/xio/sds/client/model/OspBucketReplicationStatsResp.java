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
import xio.sds.client.model.OspReplicationStatsRule;
/**
 * OspBucketReplicationStatsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketReplicationStatsResp {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("latest_mtime")
  private String latestMtime = null;

  @SerializedName("rules")
  private List<OspReplicationStatsRule> rules = null;

  @SerializedName("bucket_id")
  private String bucketId = null;

  @SerializedName("last_run_time")
  private String lastRunTime = null;

  @SerializedName("size")
  private Long size = null;

  public OspBucketReplicationStatsResp count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public OspBucketReplicationStatsResp latestMtime(String latestMtime) {
    this.latestMtime = latestMtime;
    return this;
  }

   /**
   * Get latestMtime
   * @return latestMtime
  **/
  @Schema(description = "")
  public String getLatestMtime() {
    return latestMtime;
  }

  public void setLatestMtime(String latestMtime) {
    this.latestMtime = latestMtime;
  }

  public OspBucketReplicationStatsResp rules(List<OspReplicationStatsRule> rules) {
    this.rules = rules;
    return this;
  }

  public OspBucketReplicationStatsResp addRulesItem(OspReplicationStatsRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<OspReplicationStatsRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<OspReplicationStatsRule> getRules() {
    return rules;
  }

  public void setRules(List<OspReplicationStatsRule> rules) {
    this.rules = rules;
  }

  public OspBucketReplicationStatsResp bucketId(String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

   /**
   * Get bucketId
   * @return bucketId
  **/
  @Schema(description = "")
  public String getBucketId() {
    return bucketId;
  }

  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }

  public OspBucketReplicationStatsResp lastRunTime(String lastRunTime) {
    this.lastRunTime = lastRunTime;
    return this;
  }

   /**
   * Get lastRunTime
   * @return lastRunTime
  **/
  @Schema(description = "")
  public String getLastRunTime() {
    return lastRunTime;
  }

  public void setLastRunTime(String lastRunTime) {
    this.lastRunTime = lastRunTime;
  }

  public OspBucketReplicationStatsResp size(Long size) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketReplicationStatsResp ospBucketReplicationStatsResp = (OspBucketReplicationStatsResp) o;
    return Objects.equals(this.count, ospBucketReplicationStatsResp.count) &&
        Objects.equals(this.latestMtime, ospBucketReplicationStatsResp.latestMtime) &&
        Objects.equals(this.rules, ospBucketReplicationStatsResp.rules) &&
        Objects.equals(this.bucketId, ospBucketReplicationStatsResp.bucketId) &&
        Objects.equals(this.lastRunTime, ospBucketReplicationStatsResp.lastRunTime) &&
        Objects.equals(this.size, ospBucketReplicationStatsResp.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, latestMtime, rules, bucketId, lastRunTime, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketReplicationStatsResp {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    latestMtime: ").append(toIndentedString(latestMtime)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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