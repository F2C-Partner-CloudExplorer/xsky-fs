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
/**
 * OSBucketSetAccessLoggingReqBucket
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSBucketSetAccessLoggingReqBucket {
  @SerializedName("logging_grants")
  private List<Object> loggingGrants = null;

  @SerializedName("logging_owner_id")
  private Long loggingOwnerId = null;

  @SerializedName("logging_prefix")
  private String loggingPrefix = null;

  @SerializedName("logging_target_bucket_id")
  private Long loggingTargetBucketId = null;

  public OSBucketSetAccessLoggingReqBucket loggingGrants(List<Object> loggingGrants) {
    this.loggingGrants = loggingGrants;
    return this;
  }

  public OSBucketSetAccessLoggingReqBucket addLoggingGrantsItem(Object loggingGrantsItem) {
    if (this.loggingGrants == null) {
      this.loggingGrants = new ArrayList<Object>();
    }
    this.loggingGrants.add(loggingGrantsItem);
    return this;
  }

   /**
   * Get loggingGrants
   * @return loggingGrants
  **/
  @Schema(description = "")
  public List<Object> getLoggingGrants() {
    return loggingGrants;
  }

  public void setLoggingGrants(List<Object> loggingGrants) {
    this.loggingGrants = loggingGrants;
  }

  public OSBucketSetAccessLoggingReqBucket loggingOwnerId(Long loggingOwnerId) {
    this.loggingOwnerId = loggingOwnerId;
    return this;
  }

   /**
   * Get loggingOwnerId
   * @return loggingOwnerId
  **/
  @Schema(description = "")
  public Long getLoggingOwnerId() {
    return loggingOwnerId;
  }

  public void setLoggingOwnerId(Long loggingOwnerId) {
    this.loggingOwnerId = loggingOwnerId;
  }

  public OSBucketSetAccessLoggingReqBucket loggingPrefix(String loggingPrefix) {
    this.loggingPrefix = loggingPrefix;
    return this;
  }

   /**
   * Get loggingPrefix
   * @return loggingPrefix
  **/
  @Schema(description = "")
  public String getLoggingPrefix() {
    return loggingPrefix;
  }

  public void setLoggingPrefix(String loggingPrefix) {
    this.loggingPrefix = loggingPrefix;
  }

  public OSBucketSetAccessLoggingReqBucket loggingTargetBucketId(Long loggingTargetBucketId) {
    this.loggingTargetBucketId = loggingTargetBucketId;
    return this;
  }

   /**
   * Get loggingTargetBucketId
   * @return loggingTargetBucketId
  **/
  @Schema(description = "")
  public Long getLoggingTargetBucketId() {
    return loggingTargetBucketId;
  }

  public void setLoggingTargetBucketId(Long loggingTargetBucketId) {
    this.loggingTargetBucketId = loggingTargetBucketId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSBucketSetAccessLoggingReqBucket osBucketSetAccessLoggingReqBucket = (OSBucketSetAccessLoggingReqBucket) o;
    return Objects.equals(this.loggingGrants, osBucketSetAccessLoggingReqBucket.loggingGrants) &&
        Objects.equals(this.loggingOwnerId, osBucketSetAccessLoggingReqBucket.loggingOwnerId) &&
        Objects.equals(this.loggingPrefix, osBucketSetAccessLoggingReqBucket.loggingPrefix) &&
        Objects.equals(this.loggingTargetBucketId, osBucketSetAccessLoggingReqBucket.loggingTargetBucketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggingGrants, loggingOwnerId, loggingPrefix, loggingTargetBucketId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSBucketSetAccessLoggingReqBucket {\n");
    
    sb.append("    loggingGrants: ").append(toIndentedString(loggingGrants)).append("\n");
    sb.append("    loggingOwnerId: ").append(toIndentedString(loggingOwnerId)).append("\n");
    sb.append("    loggingPrefix: ").append(toIndentedString(loggingPrefix)).append("\n");
    sb.append("    loggingTargetBucketId: ").append(toIndentedString(loggingTargetBucketId)).append("\n");
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