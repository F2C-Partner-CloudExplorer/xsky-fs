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
import xio.sds.client.model.DfsS3BucketPolicySetReqBucket;
/**
 * DfsS3BucketPolicySetReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3BucketPolicySetReq {
  @SerializedName("dfs_s3_bucket")
  private DfsS3BucketPolicySetReqBucket dfsS3Bucket = null;

  public DfsS3BucketPolicySetReq dfsS3Bucket(DfsS3BucketPolicySetReqBucket dfsS3Bucket) {
    this.dfsS3Bucket = dfsS3Bucket;
    return this;
  }

   /**
   * Get dfsS3Bucket
   * @return dfsS3Bucket
  **/
  @Schema(description = "")
  public DfsS3BucketPolicySetReqBucket getDfsS3Bucket() {
    return dfsS3Bucket;
  }

  public void setDfsS3Bucket(DfsS3BucketPolicySetReqBucket dfsS3Bucket) {
    this.dfsS3Bucket = dfsS3Bucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsS3BucketPolicySetReq dfsS3BucketPolicySetReq = (DfsS3BucketPolicySetReq) o;
    return Objects.equals(this.dfsS3Bucket, dfsS3BucketPolicySetReq.dfsS3Bucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsS3Bucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3BucketPolicySetReq {\n");
    
    sb.append("    dfsS3Bucket: ").append(toIndentedString(dfsS3Bucket)).append("\n");
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
