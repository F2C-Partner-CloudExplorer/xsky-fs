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
import xio.sds.client.model.DfsTierStat;
/**
 * DfsStorageClassSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsStorageClassSamplesResp {
  @SerializedName("dfs_storage_class_samples")
  private List<DfsTierStat> dfsStorageClassSamples = null;

  public DfsStorageClassSamplesResp dfsStorageClassSamples(List<DfsTierStat> dfsStorageClassSamples) {
    this.dfsStorageClassSamples = dfsStorageClassSamples;
    return this;
  }

  public DfsStorageClassSamplesResp addDfsStorageClassSamplesItem(DfsTierStat dfsStorageClassSamplesItem) {
    if (this.dfsStorageClassSamples == null) {
      this.dfsStorageClassSamples = new ArrayList<DfsTierStat>();
    }
    this.dfsStorageClassSamples.add(dfsStorageClassSamplesItem);
    return this;
  }

   /**
   * Get dfsStorageClassSamples
   * @return dfsStorageClassSamples
  **/
  @Schema(description = "")
  public List<DfsTierStat> getDfsStorageClassSamples() {
    return dfsStorageClassSamples;
  }

  public void setDfsStorageClassSamples(List<DfsTierStat> dfsStorageClassSamples) {
    this.dfsStorageClassSamples = dfsStorageClassSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsStorageClassSamplesResp dfsStorageClassSamplesResp = (DfsStorageClassSamplesResp) o;
    return Objects.equals(this.dfsStorageClassSamples, dfsStorageClassSamplesResp.dfsStorageClassSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsStorageClassSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsStorageClassSamplesResp {\n");
    
    sb.append("    dfsStorageClassSamples: ").append(toIndentedString(dfsStorageClassSamples)).append("\n");
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