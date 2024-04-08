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
import xio.sds.client.model.VIPCreateReqVIP;
/**
 * VIPCreateReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VIPCreateReq {
  @SerializedName("vip")
  private VIPCreateReqVIP vip = null;

  public VIPCreateReq vip(VIPCreateReqVIP vip) {
    this.vip = vip;
    return this;
  }

   /**
   * Get vip
   * @return vip
  **/
  @Schema(required = true, description = "")
  public VIPCreateReqVIP getVip() {
    return vip;
  }

  public void setVip(VIPCreateReqVIP vip) {
    this.vip = vip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIPCreateReq viPCreateReq = (VIPCreateReq) o;
    return Objects.equals(this.vip, viPCreateReq.vip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIPCreateReq {\n");
    
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
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
