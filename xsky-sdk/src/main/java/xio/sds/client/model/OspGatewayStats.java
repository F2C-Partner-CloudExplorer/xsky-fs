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
 * OspGatewayStats
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspGatewayStats {
  @SerializedName("send_bytes")
  private Long sendBytes = null;

  @SerializedName("receive_bytes")
  private Long receiveBytes = null;

  @SerializedName("receive_op_counts")
  private Long receiveOpCounts = null;

  @SerializedName("send_op_counts")
  private Long sendOpCounts = null;

  public OspGatewayStats sendBytes(Long sendBytes) {
    this.sendBytes = sendBytes;
    return this;
  }

   /**
   * Get sendBytes
   * @return sendBytes
  **/
  @Schema(description = "")
  public Long getSendBytes() {
    return sendBytes;
  }

  public void setSendBytes(Long sendBytes) {
    this.sendBytes = sendBytes;
  }

  public OspGatewayStats receiveBytes(Long receiveBytes) {
    this.receiveBytes = receiveBytes;
    return this;
  }

   /**
   * Get receiveBytes
   * @return receiveBytes
  **/
  @Schema(description = "")
  public Long getReceiveBytes() {
    return receiveBytes;
  }

  public void setReceiveBytes(Long receiveBytes) {
    this.receiveBytes = receiveBytes;
  }

  public OspGatewayStats receiveOpCounts(Long receiveOpCounts) {
    this.receiveOpCounts = receiveOpCounts;
    return this;
  }

   /**
   * Get receiveOpCounts
   * @return receiveOpCounts
  **/
  @Schema(description = "")
  public Long getReceiveOpCounts() {
    return receiveOpCounts;
  }

  public void setReceiveOpCounts(Long receiveOpCounts) {
    this.receiveOpCounts = receiveOpCounts;
  }

  public OspGatewayStats sendOpCounts(Long sendOpCounts) {
    this.sendOpCounts = sendOpCounts;
    return this;
  }

   /**
   * Get sendOpCounts
   * @return sendOpCounts
  **/
  @Schema(description = "")
  public Long getSendOpCounts() {
    return sendOpCounts;
  }

  public void setSendOpCounts(Long sendOpCounts) {
    this.sendOpCounts = sendOpCounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspGatewayStats ospGatewayStats = (OspGatewayStats) o;
    return Objects.equals(this.sendBytes, ospGatewayStats.sendBytes) &&
        Objects.equals(this.receiveBytes, ospGatewayStats.receiveBytes) &&
        Objects.equals(this.receiveOpCounts, ospGatewayStats.receiveOpCounts) &&
        Objects.equals(this.sendOpCounts, ospGatewayStats.sendOpCounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendBytes, receiveBytes, receiveOpCounts, sendOpCounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspGatewayStats {\n");
    
    sb.append("    sendBytes: ").append(toIndentedString(sendBytes)).append("\n");
    sb.append("    receiveBytes: ").append(toIndentedString(receiveBytes)).append("\n");
    sb.append("    receiveOpCounts: ").append(toIndentedString(receiveOpCounts)).append("\n");
    sb.append("    sendOpCounts: ").append(toIndentedString(sendOpCounts)).append("\n");
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
