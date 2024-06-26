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
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.DfsPath;
import xio.sds.client.model.DfsQos;
import xio.sds.client.model.DfsQosPolicy;
import xio.sds.client.model.DfsQosStat;
import xio.sds.client.model.DfsRootfs;
/**
 * DfsQosRecord combine DfsQos and DfsQosStat as API response
 */
@Schema(description = "DfsQosRecord combine DfsQos and DfsQosStat as API response")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsQosRecord extends DfsQos {
  @SerializedName("hdfs_num")
  private Long hdfsNum = null;

  @SerializedName("is_bucket")
  private Boolean isBucket = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("samples")
  private List<DfsQosStat> samples = null;

  @SerializedName("shares")
  private List<String> shares = null;

  public DfsQosRecord hdfsNum(Long hdfsNum) {
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

  public DfsQosRecord isBucket(Boolean isBucket) {
    this.isBucket = isBucket;
    return this;
  }

   /**
   * Get isBucket
   * @return isBucket
  **/
  @Schema(description = "")
  public Boolean isIsBucket() {
    return isBucket;
  }

  public void setIsBucket(Boolean isBucket) {
    this.isBucket = isBucket;
  }

  public DfsQosRecord path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsQosRecord samples(List<DfsQosStat> samples) {
    this.samples = samples;
    return this;
  }

  public DfsQosRecord addSamplesItem(DfsQosStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<DfsQosStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<DfsQosStat> getSamples() {
    return samples;
  }

  public void setSamples(List<DfsQosStat> samples) {
    this.samples = samples;
  }

  public DfsQosRecord shares(List<String> shares) {
    this.shares = shares;
    return this;
  }

  public DfsQosRecord addSharesItem(String sharesItem) {
    if (this.shares == null) {
      this.shares = new ArrayList<String>();
    }
    this.shares.add(sharesItem);
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @Schema(description = "")
  public List<String> getShares() {
    return shares;
  }

  public void setShares(List<String> shares) {
    this.shares = shares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsQosRecord dfsQosRecord = (DfsQosRecord) o;
    return Objects.equals(this.hdfsNum, dfsQosRecord.hdfsNum) &&
        Objects.equals(this.isBucket, dfsQosRecord.isBucket) &&
        Objects.equals(this.path, dfsQosRecord.path) &&
        Objects.equals(this.samples, dfsQosRecord.samples) &&
        Objects.equals(this.shares, dfsQosRecord.shares) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hdfsNum, isBucket, path, samples, shares, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsQosRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hdfsNum: ").append(toIndentedString(hdfsNum)).append("\n");
    sb.append("    isBucket: ").append(toIndentedString(isBucket)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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
