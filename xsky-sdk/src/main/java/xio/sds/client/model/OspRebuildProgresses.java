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
import xio.sds.client.model.OspRebuildVal;
/**
 * OspRebuildProgresses
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspRebuildProgresses {
  @SerializedName("val")
  private List<OspRebuildVal> val = null;

  @SerializedName("key")
  private Long key = null;

  public OspRebuildProgresses val(List<OspRebuildVal> val) {
    this.val = val;
    return this;
  }

  public OspRebuildProgresses addValItem(OspRebuildVal valItem) {
    if (this.val == null) {
      this.val = new ArrayList<OspRebuildVal>();
    }
    this.val.add(valItem);
    return this;
  }

   /**
   * Get val
   * @return val
  **/
  @Schema(description = "")
  public List<OspRebuildVal> getVal() {
    return val;
  }

  public void setVal(List<OspRebuildVal> val) {
    this.val = val;
  }

  public OspRebuildProgresses key(Long key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public Long getKey() {
    return key;
  }

  public void setKey(Long key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspRebuildProgresses ospRebuildProgresses = (OspRebuildProgresses) o;
    return Objects.equals(this.val, ospRebuildProgresses.val) &&
        Objects.equals(this.key, ospRebuildProgresses.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspRebuildProgresses {\n");
    
    sb.append("    val: ").append(toIndentedString(val)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
