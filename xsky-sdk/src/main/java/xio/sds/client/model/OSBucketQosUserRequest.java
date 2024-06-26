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
/**
 * OSBucketQosUserRequest defines os bucket user request qos info
 */
@Schema(description = "OSBucketQosUserRequest defines os bucket user request qos info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSBucketQosUserRequest {
  @SerializedName("max_bandwidth_bytes")
  private Long maxBandwidthBytes = null;

  @SerializedName("requests_per_second")
  private Long requestsPerSecond = null;

  @SerializedName("sudden_bandwidth_bytes")
  private Long suddenBandwidthBytes = null;

  public OSBucketQosUserRequest maxBandwidthBytes(Long maxBandwidthBytes) {
    this.maxBandwidthBytes = maxBandwidthBytes;
    return this;
  }

   /**
   * Get maxBandwidthBytes
   * @return maxBandwidthBytes
  **/
  @Schema(required = true, description = "")
  public Long getMaxBandwidthBytes() {
    return maxBandwidthBytes;
  }

  public void setMaxBandwidthBytes(Long maxBandwidthBytes) {
    this.maxBandwidthBytes = maxBandwidthBytes;
  }

  public OSBucketQosUserRequest requestsPerSecond(Long requestsPerSecond) {
    this.requestsPerSecond = requestsPerSecond;
    return this;
  }

   /**
   * Get requestsPerSecond
   * @return requestsPerSecond
  **/
  @Schema(required = true, description = "")
  public Long getRequestsPerSecond() {
    return requestsPerSecond;
  }

  public void setRequestsPerSecond(Long requestsPerSecond) {
    this.requestsPerSecond = requestsPerSecond;
  }

  public OSBucketQosUserRequest suddenBandwidthBytes(Long suddenBandwidthBytes) {
    this.suddenBandwidthBytes = suddenBandwidthBytes;
    return this;
  }

   /**
   * Get suddenBandwidthBytes
   * @return suddenBandwidthBytes
  **/
  @Schema(description = "")
  public Long getSuddenBandwidthBytes() {
    return suddenBandwidthBytes;
  }

  public void setSuddenBandwidthBytes(Long suddenBandwidthBytes) {
    this.suddenBandwidthBytes = suddenBandwidthBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSBucketQosUserRequest osBucketQosUserRequest = (OSBucketQosUserRequest) o;
    return Objects.equals(this.maxBandwidthBytes, osBucketQosUserRequest.maxBandwidthBytes) &&
        Objects.equals(this.requestsPerSecond, osBucketQosUserRequest.requestsPerSecond) &&
        Objects.equals(this.suddenBandwidthBytes, osBucketQosUserRequest.suddenBandwidthBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBandwidthBytes, requestsPerSecond, suddenBandwidthBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSBucketQosUserRequest {\n");
    
    sb.append("    maxBandwidthBytes: ").append(toIndentedString(maxBandwidthBytes)).append("\n");
    sb.append("    requestsPerSecond: ").append(toIndentedString(requestsPerSecond)).append("\n");
    sb.append("    suddenBandwidthBytes: ").append(toIndentedString(suddenBandwidthBytes)).append("\n");
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
