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
 * OspQosItem
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspQosItem {
  @SerializedName("iops_permits")
  private Long iopsPermits = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("bw_permits")
  private Long bwPermits = null;

  @SerializedName("burst")
  private Float burst = null;

  public OspQosItem iopsPermits(Long iopsPermits) {
    this.iopsPermits = iopsPermits;
    return this;
  }

   /**
   * Get iopsPermits
   * @return iopsPermits
  **/
  @Schema(description = "")
  public Long getIopsPermits() {
    return iopsPermits;
  }

  public void setIopsPermits(Long iopsPermits) {
    this.iopsPermits = iopsPermits;
  }

  public OspQosItem type(String type) {
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

  public OspQosItem bwPermits(Long bwPermits) {
    this.bwPermits = bwPermits;
    return this;
  }

   /**
   * Get bwPermits
   * @return bwPermits
  **/
  @Schema(description = "")
  public Long getBwPermits() {
    return bwPermits;
  }

  public void setBwPermits(Long bwPermits) {
    this.bwPermits = bwPermits;
  }

  public OspQosItem burst(Float burst) {
    this.burst = burst;
    return this;
  }

   /**
   * Get burst
   * @return burst
  **/
  @Schema(description = "")
  public Float getBurst() {
    return burst;
  }

  public void setBurst(Float burst) {
    this.burst = burst;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspQosItem ospQosItem = (OspQosItem) o;
    return Objects.equals(this.iopsPermits, ospQosItem.iopsPermits) &&
        Objects.equals(this.type, ospQosItem.type) &&
        Objects.equals(this.bwPermits, ospQosItem.bwPermits) &&
        Objects.equals(this.burst, ospQosItem.burst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iopsPermits, type, bwPermits, burst);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspQosItem {\n");
    
    sb.append("    iopsPermits: ").append(toIndentedString(iopsPermits)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bwPermits: ").append(toIndentedString(bwPermits)).append("\n");
    sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
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