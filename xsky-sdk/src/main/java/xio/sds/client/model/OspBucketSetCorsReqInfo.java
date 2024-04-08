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
import xio.sds.client.model.OspBucketCorsRule;
/**
 * OspBucketSetCorsReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketSetCorsReqInfo {
  @SerializedName("cors")
  private List<OspBucketCorsRule> cors = null;

  public OspBucketSetCorsReqInfo cors(List<OspBucketCorsRule> cors) {
    this.cors = cors;
    return this;
  }

  public OspBucketSetCorsReqInfo addCorsItem(OspBucketCorsRule corsItem) {
    if (this.cors == null) {
      this.cors = new ArrayList<OspBucketCorsRule>();
    }
    this.cors.add(corsItem);
    return this;
  }

   /**
   * Get cors
   * @return cors
  **/
  @Schema(description = "")
  public List<OspBucketCorsRule> getCors() {
    return cors;
  }

  public void setCors(List<OspBucketCorsRule> cors) {
    this.cors = cors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketSetCorsReqInfo ospBucketSetCorsReqInfo = (OspBucketSetCorsReqInfo) o;
    return Objects.equals(this.cors, ospBucketSetCorsReqInfo.cors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketSetCorsReqInfo {\n");
    
    sb.append("    cors: ").append(toIndentedString(cors)).append("\n");
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
