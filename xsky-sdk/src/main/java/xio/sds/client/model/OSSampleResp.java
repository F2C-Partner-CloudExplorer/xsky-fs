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
import java.util.Map;
import xio.sds.client.model.OSSample;
/**
 * OSSampleResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSSampleResp {
  @SerializedName("os_samples")
  private List<Map<String, List<Map<String, OSSample>>>> osSamples = null;

  public OSSampleResp osSamples(List<Map<String, List<Map<String, OSSample>>>> osSamples) {
    this.osSamples = osSamples;
    return this;
  }

  public OSSampleResp addOsSamplesItem(Map<String, List<Map<String, OSSample>>> osSamplesItem) {
    if (this.osSamples == null) {
      this.osSamples = new ArrayList<Map<String, List<Map<String, OSSample>>>>();
    }
    this.osSamples.add(osSamplesItem);
    return this;
  }

   /**
   * Get osSamples
   * @return osSamples
  **/
  @Schema(description = "")
  public List<Map<String, List<Map<String, OSSample>>>> getOsSamples() {
    return osSamples;
  }

  public void setOsSamples(List<Map<String, List<Map<String, OSSample>>>> osSamples) {
    this.osSamples = osSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSampleResp osSampleResp = (OSSampleResp) o;
    return Objects.equals(this.osSamples, osSampleResp.osSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSampleResp {\n");
    
    sb.append("    osSamples: ").append(toIndentedString(osSamples)).append("\n");
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
