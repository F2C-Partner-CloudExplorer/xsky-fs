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
import xio.sds.client.model.OspBucketScMatchingInfo;
/**
 * OspBucketStorageClassRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketStorageClassRule {
  @SerializedName("matching_info")
  private OspBucketScMatchingInfo matchingInfo = null;

  @SerializedName("x_amz_storage_class_enabled")
  private Boolean xAmzStorageClassEnabled = null;

  @SerializedName("type")
  private String type = null;

  public OspBucketStorageClassRule matchingInfo(OspBucketScMatchingInfo matchingInfo) {
    this.matchingInfo = matchingInfo;
    return this;
  }

   /**
   * Get matchingInfo
   * @return matchingInfo
  **/
  @Schema(description = "")
  public OspBucketScMatchingInfo getMatchingInfo() {
    return matchingInfo;
  }

  public void setMatchingInfo(OspBucketScMatchingInfo matchingInfo) {
    this.matchingInfo = matchingInfo;
  }

  public OspBucketStorageClassRule xAmzStorageClassEnabled(Boolean xAmzStorageClassEnabled) {
    this.xAmzStorageClassEnabled = xAmzStorageClassEnabled;
    return this;
  }

   /**
   * Get xAmzStorageClassEnabled
   * @return xAmzStorageClassEnabled
  **/
  @Schema(description = "")
  public Boolean isXAmzStorageClassEnabled() {
    return xAmzStorageClassEnabled;
  }

  public void setXAmzStorageClassEnabled(Boolean xAmzStorageClassEnabled) {
    this.xAmzStorageClassEnabled = xAmzStorageClassEnabled;
  }

  public OspBucketStorageClassRule type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketStorageClassRule ospBucketStorageClassRule = (OspBucketStorageClassRule) o;
    return Objects.equals(this.matchingInfo, ospBucketStorageClassRule.matchingInfo) &&
        Objects.equals(this.xAmzStorageClassEnabled, ospBucketStorageClassRule.xAmzStorageClassEnabled) &&
        Objects.equals(this.type, ospBucketStorageClassRule.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchingInfo, xAmzStorageClassEnabled, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketStorageClassRule {\n");
    
    sb.append("    matchingInfo: ").append(toIndentedString(matchingInfo)).append("\n");
    sb.append("    xAmzStorageClassEnabled: ").append(toIndentedString(xAmzStorageClassEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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