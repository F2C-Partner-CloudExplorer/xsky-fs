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
import xio.sds.client.model.DfsS3BucketStat;
/**
 * DfsS3BucketSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3BucketSamplesResp {
  @SerializedName("dfs_s3_bucket_samples")
  private List<DfsS3BucketStat> dfsS3BucketSamples = new ArrayList<DfsS3BucketStat>();

  public DfsS3BucketSamplesResp dfsS3BucketSamples(List<DfsS3BucketStat> dfsS3BucketSamples) {
    this.dfsS3BucketSamples = dfsS3BucketSamples;
    return this;
  }

  public DfsS3BucketSamplesResp addDfsS3BucketSamplesItem(DfsS3BucketStat dfsS3BucketSamplesItem) {
    this.dfsS3BucketSamples.add(dfsS3BucketSamplesItem);
    return this;
  }

   /**
   * Get dfsS3BucketSamples
   * @return dfsS3BucketSamples
  **/
  @Schema(required = true, description = "")
  public List<DfsS3BucketStat> getDfsS3BucketSamples() {
    return dfsS3BucketSamples;
  }

  public void setDfsS3BucketSamples(List<DfsS3BucketStat> dfsS3BucketSamples) {
    this.dfsS3BucketSamples = dfsS3BucketSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsS3BucketSamplesResp dfsS3BucketSamplesResp = (DfsS3BucketSamplesResp) o;
    return Objects.equals(this.dfsS3BucketSamples, dfsS3BucketSamplesResp.dfsS3BucketSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsS3BucketSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3BucketSamplesResp {\n");
    
    sb.append("    dfsS3BucketSamples: ").append(toIndentedString(dfsS3BucketSamples)).append("\n");
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