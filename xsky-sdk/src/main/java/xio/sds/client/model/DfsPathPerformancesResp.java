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
import xio.sds.client.model.DfsPathPerformance;
/**
 * DfsPathPerformancesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsPathPerformancesResp {
  @SerializedName("dfs_path_performances")
  private List<DfsPathPerformance> dfsPathPerformances = null;

  public DfsPathPerformancesResp dfsPathPerformances(List<DfsPathPerformance> dfsPathPerformances) {
    this.dfsPathPerformances = dfsPathPerformances;
    return this;
  }

  public DfsPathPerformancesResp addDfsPathPerformancesItem(DfsPathPerformance dfsPathPerformancesItem) {
    if (this.dfsPathPerformances == null) {
      this.dfsPathPerformances = new ArrayList<DfsPathPerformance>();
    }
    this.dfsPathPerformances.add(dfsPathPerformancesItem);
    return this;
  }

   /**
   * dfs trash records
   * @return dfsPathPerformances
  **/
  @Schema(description = "dfs trash records")
  public List<DfsPathPerformance> getDfsPathPerformances() {
    return dfsPathPerformances;
  }

  public void setDfsPathPerformances(List<DfsPathPerformance> dfsPathPerformances) {
    this.dfsPathPerformances = dfsPathPerformances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsPathPerformancesResp dfsPathPerformancesResp = (DfsPathPerformancesResp) o;
    return Objects.equals(this.dfsPathPerformances, dfsPathPerformancesResp.dfsPathPerformances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsPathPerformances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsPathPerformancesResp {\n");
    
    sb.append("    dfsPathPerformances: ").append(toIndentedString(dfsPathPerformances)).append("\n");
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
