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
import xio.sds.client.model.S3LoadBalancerRecord;
/**
 * S3LoadBalancersResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancersResp {
  @SerializedName("s3_load_balancers")
  private List<S3LoadBalancerRecord> s3LoadBalancers = new ArrayList<S3LoadBalancerRecord>();

  public S3LoadBalancersResp s3LoadBalancers(List<S3LoadBalancerRecord> s3LoadBalancers) {
    this.s3LoadBalancers = s3LoadBalancers;
    return this;
  }

  public S3LoadBalancersResp addS3LoadBalancersItem(S3LoadBalancerRecord s3LoadBalancersItem) {
    this.s3LoadBalancers.add(s3LoadBalancersItem);
    return this;
  }

   /**
   * s3 load balancers
   * @return s3LoadBalancers
  **/
  @Schema(required = true, description = "s3 load balancers")
  public List<S3LoadBalancerRecord> getS3LoadBalancers() {
    return s3LoadBalancers;
  }

  public void setS3LoadBalancers(List<S3LoadBalancerRecord> s3LoadBalancers) {
    this.s3LoadBalancers = s3LoadBalancers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancersResp s3LoadBalancersResp = (S3LoadBalancersResp) o;
    return Objects.equals(this.s3LoadBalancers, s3LoadBalancersResp.s3LoadBalancers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3LoadBalancers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancersResp {\n");
    
    sb.append("    s3LoadBalancers: ").append(toIndentedString(s3LoadBalancers)).append("\n");
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