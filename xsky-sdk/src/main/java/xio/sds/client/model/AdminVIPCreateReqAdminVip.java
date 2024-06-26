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
 * AdminVIPCreateReqAdminVip
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AdminVIPCreateReqAdminVip {
  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("mask")
  private Long mask = null;

  public AdminVIPCreateReqAdminVip enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(required = true, description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public AdminVIPCreateReqAdminVip ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public AdminVIPCreateReqAdminVip mask(Long mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @Schema(description = "")
  public Long getMask() {
    return mask;
  }

  public void setMask(Long mask) {
    this.mask = mask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminVIPCreateReqAdminVip adminVIPCreateReqAdminVip = (AdminVIPCreateReqAdminVip) o;
    return Objects.equals(this.enable, adminVIPCreateReqAdminVip.enable) &&
        Objects.equals(this.ip, adminVIPCreateReqAdminVip.ip) &&
        Objects.equals(this.mask, adminVIPCreateReqAdminVip.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ip, mask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminVIPCreateReqAdminVip {\n");
    
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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
