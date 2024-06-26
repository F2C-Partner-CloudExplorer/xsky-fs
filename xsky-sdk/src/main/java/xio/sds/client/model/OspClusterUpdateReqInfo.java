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
/**
 * OspClusterUpdateReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspClusterUpdateReqInfo {
  @SerializedName("metric_endpoints")
  private List<String> metricEndpoints = null;

  @SerializedName("xms_endpoints")
  private List<String> xmsEndpoints = null;

  @SerializedName("search_endpoints")
  private List<String> searchEndpoints = null;

  public OspClusterUpdateReqInfo metricEndpoints(List<String> metricEndpoints) {
    this.metricEndpoints = metricEndpoints;
    return this;
  }

  public OspClusterUpdateReqInfo addMetricEndpointsItem(String metricEndpointsItem) {
    if (this.metricEndpoints == null) {
      this.metricEndpoints = new ArrayList<String>();
    }
    this.metricEndpoints.add(metricEndpointsItem);
    return this;
  }

   /**
   * Get metricEndpoints
   * @return metricEndpoints
  **/
  @Schema(description = "")
  public List<String> getMetricEndpoints() {
    return metricEndpoints;
  }

  public void setMetricEndpoints(List<String> metricEndpoints) {
    this.metricEndpoints = metricEndpoints;
  }

  public OspClusterUpdateReqInfo xmsEndpoints(List<String> xmsEndpoints) {
    this.xmsEndpoints = xmsEndpoints;
    return this;
  }

  public OspClusterUpdateReqInfo addXmsEndpointsItem(String xmsEndpointsItem) {
    if (this.xmsEndpoints == null) {
      this.xmsEndpoints = new ArrayList<String>();
    }
    this.xmsEndpoints.add(xmsEndpointsItem);
    return this;
  }

   /**
   * Get xmsEndpoints
   * @return xmsEndpoints
  **/
  @Schema(description = "")
  public List<String> getXmsEndpoints() {
    return xmsEndpoints;
  }

  public void setXmsEndpoints(List<String> xmsEndpoints) {
    this.xmsEndpoints = xmsEndpoints;
  }

  public OspClusterUpdateReqInfo searchEndpoints(List<String> searchEndpoints) {
    this.searchEndpoints = searchEndpoints;
    return this;
  }

  public OspClusterUpdateReqInfo addSearchEndpointsItem(String searchEndpointsItem) {
    if (this.searchEndpoints == null) {
      this.searchEndpoints = new ArrayList<String>();
    }
    this.searchEndpoints.add(searchEndpointsItem);
    return this;
  }

   /**
   * Get searchEndpoints
   * @return searchEndpoints
  **/
  @Schema(description = "")
  public List<String> getSearchEndpoints() {
    return searchEndpoints;
  }

  public void setSearchEndpoints(List<String> searchEndpoints) {
    this.searchEndpoints = searchEndpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspClusterUpdateReqInfo ospClusterUpdateReqInfo = (OspClusterUpdateReqInfo) o;
    return Objects.equals(this.metricEndpoints, ospClusterUpdateReqInfo.metricEndpoints) &&
        Objects.equals(this.xmsEndpoints, ospClusterUpdateReqInfo.xmsEndpoints) &&
        Objects.equals(this.searchEndpoints, ospClusterUpdateReqInfo.searchEndpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricEndpoints, xmsEndpoints, searchEndpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspClusterUpdateReqInfo {\n");
    
    sb.append("    metricEndpoints: ").append(toIndentedString(metricEndpoints)).append("\n");
    sb.append("    xmsEndpoints: ").append(toIndentedString(xmsEndpoints)).append("\n");
    sb.append("    searchEndpoints: ").append(toIndentedString(searchEndpoints)).append("\n");
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
