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
import xio.sds.client.model.OspZoneStat;
/**
 * OspZoneSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspZoneSamplesResp {
  @SerializedName("zone_samples")
  private List<OspZoneStat> zoneSamples = null;

  public OspZoneSamplesResp zoneSamples(List<OspZoneStat> zoneSamples) {
    this.zoneSamples = zoneSamples;
    return this;
  }

  public OspZoneSamplesResp addZoneSamplesItem(OspZoneStat zoneSamplesItem) {
    if (this.zoneSamples == null) {
      this.zoneSamples = new ArrayList<OspZoneStat>();
    }
    this.zoneSamples.add(zoneSamplesItem);
    return this;
  }

   /**
   * Get zoneSamples
   * @return zoneSamples
  **/
  @Schema(description = "")
  public List<OspZoneStat> getZoneSamples() {
    return zoneSamples;
  }

  public void setZoneSamples(List<OspZoneStat> zoneSamples) {
    this.zoneSamples = zoneSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspZoneSamplesResp ospZoneSamplesResp = (OspZoneSamplesResp) o;
    return Objects.equals(this.zoneSamples, ospZoneSamplesResp.zoneSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zoneSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspZoneSamplesResp {\n");
    
    sb.append("    zoneSamples: ").append(toIndentedString(zoneSamples)).append("\n");
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
