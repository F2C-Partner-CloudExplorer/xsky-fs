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
import xio.sds.client.model.OspBucketQuota;
import xio.sds.client.model.OspBucketStat;
import xio.sds.client.model.OspNestedUser;
/**
 * OspNestedBucketNoSearch
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspNestedBucketNoSearch {
  @SerializedName("status")
  private String status = null;

  @SerializedName("ctime")
  private String ctime = null;

  @SerializedName("quota")
  private OspBucketQuota quota = null;

  @SerializedName("samples")
  private List<OspBucketStat> samples = null;

  @SerializedName("mtime")
  private String mtime = null;

  @SerializedName("owner")
  private OspNestedUser owner = null;

  @SerializedName("num_shards")
  private Long numShards = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public OspNestedBucketNoSearch status(String status) {
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

  public OspNestedBucketNoSearch ctime(String ctime) {
    this.ctime = ctime;
    return this;
  }

   /**
   * Get ctime
   * @return ctime
  **/
  @Schema(description = "")
  public String getCtime() {
    return ctime;
  }

  public void setCtime(String ctime) {
    this.ctime = ctime;
  }

  public OspNestedBucketNoSearch quota(OspBucketQuota quota) {
    this.quota = quota;
    return this;
  }

   /**
   * Get quota
   * @return quota
  **/
  @Schema(description = "")
  public OspBucketQuota getQuota() {
    return quota;
  }

  public void setQuota(OspBucketQuota quota) {
    this.quota = quota;
  }

  public OspNestedBucketNoSearch samples(List<OspBucketStat> samples) {
    this.samples = samples;
    return this;
  }

  public OspNestedBucketNoSearch addSamplesItem(OspBucketStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<OspBucketStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<OspBucketStat> getSamples() {
    return samples;
  }

  public void setSamples(List<OspBucketStat> samples) {
    this.samples = samples;
  }

  public OspNestedBucketNoSearch mtime(String mtime) {
    this.mtime = mtime;
    return this;
  }

   /**
   * Get mtime
   * @return mtime
  **/
  @Schema(description = "")
  public String getMtime() {
    return mtime;
  }

  public void setMtime(String mtime) {
    this.mtime = mtime;
  }

  public OspNestedBucketNoSearch owner(OspNestedUser owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public OspNestedUser getOwner() {
    return owner;
  }

  public void setOwner(OspNestedUser owner) {
    this.owner = owner;
  }

  public OspNestedBucketNoSearch numShards(Long numShards) {
    this.numShards = numShards;
    return this;
  }

   /**
   * Get numShards
   * @return numShards
  **/
  @Schema(description = "")
  public Long getNumShards() {
    return numShards;
  }

  public void setNumShards(Long numShards) {
    this.numShards = numShards;
  }

  public OspNestedBucketNoSearch id(Long id) {
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

  public OspNestedBucketNoSearch name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspNestedBucketNoSearch ospNestedBucketNoSearch = (OspNestedBucketNoSearch) o;
    return Objects.equals(this.status, ospNestedBucketNoSearch.status) &&
        Objects.equals(this.ctime, ospNestedBucketNoSearch.ctime) &&
        Objects.equals(this.quota, ospNestedBucketNoSearch.quota) &&
        Objects.equals(this.samples, ospNestedBucketNoSearch.samples) &&
        Objects.equals(this.mtime, ospNestedBucketNoSearch.mtime) &&
        Objects.equals(this.owner, ospNestedBucketNoSearch.owner) &&
        Objects.equals(this.numShards, ospNestedBucketNoSearch.numShards) &&
        Objects.equals(this.id, ospNestedBucketNoSearch.id) &&
        Objects.equals(this.name, ospNestedBucketNoSearch.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, ctime, quota, samples, mtime, owner, numShards, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspNestedBucketNoSearch {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    mtime: ").append(toIndentedString(mtime)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    numShards: ").append(toIndentedString(numShards)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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