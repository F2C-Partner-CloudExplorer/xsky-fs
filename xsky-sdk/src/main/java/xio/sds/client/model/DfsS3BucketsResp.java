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
import xio.sds.client.model.DfsS3BucketRecord;
/**
 * DfsS3BucketsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3BucketsResp {
  @SerializedName("dfs_s3_buckets")
  private List<DfsS3BucketRecord> dfsS3Buckets = new ArrayList<DfsS3BucketRecord>();

  public DfsS3BucketsResp dfsS3Buckets(List<DfsS3BucketRecord> dfsS3Buckets) {
    this.dfsS3Buckets = dfsS3Buckets;
    return this;
  }

  public DfsS3BucketsResp addDfsS3BucketsItem(DfsS3BucketRecord dfsS3BucketsItem) {
    this.dfsS3Buckets.add(dfsS3BucketsItem);
    return this;
  }

   /**
   * dfs s3 bucket list
   * @return dfsS3Buckets
  **/
  @Schema(required = true, description = "dfs s3 bucket list")
  public List<DfsS3BucketRecord> getDfsS3Buckets() {
    return dfsS3Buckets;
  }

  public void setDfsS3Buckets(List<DfsS3BucketRecord> dfsS3Buckets) {
    this.dfsS3Buckets = dfsS3Buckets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsS3BucketsResp dfsS3BucketsResp = (DfsS3BucketsResp) o;
    return Objects.equals(this.dfsS3Buckets, dfsS3BucketsResp.dfsS3Buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsS3Buckets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3BucketsResp {\n");
    
    sb.append("    dfsS3Buckets: ").append(toIndentedString(dfsS3Buckets)).append("\n");
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