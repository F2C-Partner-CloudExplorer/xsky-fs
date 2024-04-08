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
import xio.sds.client.model.S3LoadBalancerSamplesElem;
/**
 * MultiS3LoadBalancersSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class MultiS3LoadBalancersSamplesResp {
  @SerializedName("s3_load_balancers_samples")
  private List<S3LoadBalancerSamplesElem> s3LoadBalancersSamples = null;

  public MultiS3LoadBalancersSamplesResp s3LoadBalancersSamples(List<S3LoadBalancerSamplesElem> s3LoadBalancersSamples) {
    this.s3LoadBalancersSamples = s3LoadBalancersSamples;
    return this;
  }

  public MultiS3LoadBalancersSamplesResp addS3LoadBalancersSamplesItem(S3LoadBalancerSamplesElem s3LoadBalancersSamplesItem) {
    if (this.s3LoadBalancersSamples == null) {
      this.s3LoadBalancersSamples = new ArrayList<S3LoadBalancerSamplesElem>();
    }
    this.s3LoadBalancersSamples.add(s3LoadBalancersSamplesItem);
    return this;
  }

   /**
   * Get s3LoadBalancersSamples
   * @return s3LoadBalancersSamples
  **/
  @Schema(description = "")
  public List<S3LoadBalancerSamplesElem> getS3LoadBalancersSamples() {
    return s3LoadBalancersSamples;
  }

  public void setS3LoadBalancersSamples(List<S3LoadBalancerSamplesElem> s3LoadBalancersSamples) {
    this.s3LoadBalancersSamples = s3LoadBalancersSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiS3LoadBalancersSamplesResp multiS3LoadBalancersSamplesResp = (MultiS3LoadBalancersSamplesResp) o;
    return Objects.equals(this.s3LoadBalancersSamples, multiS3LoadBalancersSamplesResp.s3LoadBalancersSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3LoadBalancersSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiS3LoadBalancersSamplesResp {\n");
    
    sb.append("    s3LoadBalancersSamples: ").append(toIndentedString(s3LoadBalancersSamples)).append("\n");
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