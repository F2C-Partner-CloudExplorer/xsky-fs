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
import xio.sds.client.model.OspBucketLockRetention;
/**
 * OspBucketLockRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketLockRule {
  @SerializedName("default_retention")
  private OspBucketLockRetention defaultRetention = null;

  public OspBucketLockRule defaultRetention(OspBucketLockRetention defaultRetention) {
    this.defaultRetention = defaultRetention;
    return this;
  }

   /**
   * Get defaultRetention
   * @return defaultRetention
  **/
  @Schema(description = "")
  public OspBucketLockRetention getDefaultRetention() {
    return defaultRetention;
  }

  public void setDefaultRetention(OspBucketLockRetention defaultRetention) {
    this.defaultRetention = defaultRetention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketLockRule ospBucketLockRule = (OspBucketLockRule) o;
    return Objects.equals(this.defaultRetention, ospBucketLockRule.defaultRetention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultRetention);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketLockRule {\n");
    
    sb.append("    defaultRetention: ").append(toIndentedString(defaultRetention)).append("\n");
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
