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
import xio.sds.client.model.S3LoadBalancerGroup;
/**
 * S3LoadBalancerGroupResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancerGroupResp {
  @SerializedName("s3_load_balancer_group")
  private S3LoadBalancerGroup s3LoadBalancerGroup = null;

  public S3LoadBalancerGroupResp s3LoadBalancerGroup(S3LoadBalancerGroup s3LoadBalancerGroup) {
    this.s3LoadBalancerGroup = s3LoadBalancerGroup;
    return this;
  }

   /**
   * Get s3LoadBalancerGroup
   * @return s3LoadBalancerGroup
  **/
  @Schema(required = true, description = "")
  public S3LoadBalancerGroup getS3LoadBalancerGroup() {
    return s3LoadBalancerGroup;
  }

  public void setS3LoadBalancerGroup(S3LoadBalancerGroup s3LoadBalancerGroup) {
    this.s3LoadBalancerGroup = s3LoadBalancerGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancerGroupResp s3LoadBalancerGroupResp = (S3LoadBalancerGroupResp) o;
    return Objects.equals(this.s3LoadBalancerGroup, s3LoadBalancerGroupResp.s3LoadBalancerGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(s3LoadBalancerGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancerGroupResp {\n");
    
    sb.append("    s3LoadBalancerGroup: ").append(toIndentedString(s3LoadBalancerGroup)).append("\n");
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
