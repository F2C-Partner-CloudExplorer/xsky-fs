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
 * OspSetBalanceModeReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspSetBalanceModeReqInfo {
  @SerializedName("storage_class_id")
  private Long storageClassId = null;

  @SerializedName("balance_mode")
  private String balanceMode = null;

  public OspSetBalanceModeReqInfo storageClassId(Long storageClassId) {
    this.storageClassId = storageClassId;
    return this;
  }

   /**
   * Get storageClassId
   * @return storageClassId
  **/
  @Schema(description = "")
  public Long getStorageClassId() {
    return storageClassId;
  }

  public void setStorageClassId(Long storageClassId) {
    this.storageClassId = storageClassId;
  }

  public OspSetBalanceModeReqInfo balanceMode(String balanceMode) {
    this.balanceMode = balanceMode;
    return this;
  }

   /**
   * Get balanceMode
   * @return balanceMode
  **/
  @Schema(description = "")
  public String getBalanceMode() {
    return balanceMode;
  }

  public void setBalanceMode(String balanceMode) {
    this.balanceMode = balanceMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspSetBalanceModeReqInfo ospSetBalanceModeReqInfo = (OspSetBalanceModeReqInfo) o;
    return Objects.equals(this.storageClassId, ospSetBalanceModeReqInfo.storageClassId) &&
        Objects.equals(this.balanceMode, ospSetBalanceModeReqInfo.balanceMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageClassId, balanceMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspSetBalanceModeReqInfo {\n");
    
    sb.append("    storageClassId: ").append(toIndentedString(storageClassId)).append("\n");
    sb.append("    balanceMode: ").append(toIndentedString(balanceMode)).append("\n");
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
