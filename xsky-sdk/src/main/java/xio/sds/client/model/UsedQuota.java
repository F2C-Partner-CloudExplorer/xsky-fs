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
 * UsedQuota
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class UsedQuota {
  @SerializedName("used_capacity")
  private Long usedCapacity = null;

  @SerializedName("used_hdd_capacity")
  private Long usedHddCapacity = null;

  @SerializedName("used_host_num")
  private Long usedHostNum = null;

  @SerializedName("used_ssd_capacity")
  private Long usedSsdCapacity = null;

  public UsedQuota usedCapacity(Long usedCapacity) {
    this.usedCapacity = usedCapacity;
    return this;
  }

   /**
   * Get usedCapacity
   * @return usedCapacity
  **/
  @Schema(required = true, description = "")
  public Long getUsedCapacity() {
    return usedCapacity;
  }

  public void setUsedCapacity(Long usedCapacity) {
    this.usedCapacity = usedCapacity;
  }

  public UsedQuota usedHddCapacity(Long usedHddCapacity) {
    this.usedHddCapacity = usedHddCapacity;
    return this;
  }

   /**
   * Get usedHddCapacity
   * @return usedHddCapacity
  **/
  @Schema(required = true, description = "")
  public Long getUsedHddCapacity() {
    return usedHddCapacity;
  }

  public void setUsedHddCapacity(Long usedHddCapacity) {
    this.usedHddCapacity = usedHddCapacity;
  }

  public UsedQuota usedHostNum(Long usedHostNum) {
    this.usedHostNum = usedHostNum;
    return this;
  }

   /**
   * Get usedHostNum
   * @return usedHostNum
  **/
  @Schema(required = true, description = "")
  public Long getUsedHostNum() {
    return usedHostNum;
  }

  public void setUsedHostNum(Long usedHostNum) {
    this.usedHostNum = usedHostNum;
  }

  public UsedQuota usedSsdCapacity(Long usedSsdCapacity) {
    this.usedSsdCapacity = usedSsdCapacity;
    return this;
  }

   /**
   * Get usedSsdCapacity
   * @return usedSsdCapacity
  **/
  @Schema(required = true, description = "")
  public Long getUsedSsdCapacity() {
    return usedSsdCapacity;
  }

  public void setUsedSsdCapacity(Long usedSsdCapacity) {
    this.usedSsdCapacity = usedSsdCapacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsedQuota usedQuota = (UsedQuota) o;
    return Objects.equals(this.usedCapacity, usedQuota.usedCapacity) &&
        Objects.equals(this.usedHddCapacity, usedQuota.usedHddCapacity) &&
        Objects.equals(this.usedHostNum, usedQuota.usedHostNum) &&
        Objects.equals(this.usedSsdCapacity, usedQuota.usedSsdCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usedCapacity, usedHddCapacity, usedHostNum, usedSsdCapacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsedQuota {\n");
    
    sb.append("    usedCapacity: ").append(toIndentedString(usedCapacity)).append("\n");
    sb.append("    usedHddCapacity: ").append(toIndentedString(usedHddCapacity)).append("\n");
    sb.append("    usedHostNum: ").append(toIndentedString(usedHostNum)).append("\n");
    sb.append("    usedSsdCapacity: ").append(toIndentedString(usedSsdCapacity)).append("\n");
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
