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
import xio.sds.client.model.OspOverviewStat;
/**
 * OspOverviewSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspOverviewSamplesResp {
  @SerializedName("overview_samples")
  private List<OspOverviewStat> overviewSamples = null;

  public OspOverviewSamplesResp overviewSamples(List<OspOverviewStat> overviewSamples) {
    this.overviewSamples = overviewSamples;
    return this;
  }

  public OspOverviewSamplesResp addOverviewSamplesItem(OspOverviewStat overviewSamplesItem) {
    if (this.overviewSamples == null) {
      this.overviewSamples = new ArrayList<OspOverviewStat>();
    }
    this.overviewSamples.add(overviewSamplesItem);
    return this;
  }

   /**
   * Get overviewSamples
   * @return overviewSamples
  **/
  @Schema(description = "")
  public List<OspOverviewStat> getOverviewSamples() {
    return overviewSamples;
  }

  public void setOverviewSamples(List<OspOverviewStat> overviewSamples) {
    this.overviewSamples = overviewSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspOverviewSamplesResp ospOverviewSamplesResp = (OspOverviewSamplesResp) o;
    return Objects.equals(this.overviewSamples, ospOverviewSamplesResp.overviewSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overviewSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspOverviewSamplesResp {\n");
    
    sb.append("    overviewSamples: ").append(toIndentedString(overviewSamples)).append("\n");
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