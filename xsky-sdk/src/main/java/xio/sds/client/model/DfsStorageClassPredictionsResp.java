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
import xio.sds.client.model.DfsTierPrediction;
/**
 * DfsStorageClassPredictionsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsStorageClassPredictionsResp {
  @SerializedName("dfs_storage_class_predictions")
  private List<DfsTierPrediction> dfsStorageClassPredictions = new ArrayList<DfsTierPrediction>();

  public DfsStorageClassPredictionsResp dfsStorageClassPredictions(List<DfsTierPrediction> dfsStorageClassPredictions) {
    this.dfsStorageClassPredictions = dfsStorageClassPredictions;
    return this;
  }

  public DfsStorageClassPredictionsResp addDfsStorageClassPredictionsItem(DfsTierPrediction dfsStorageClassPredictionsItem) {
    this.dfsStorageClassPredictions.add(dfsStorageClassPredictionsItem);
    return this;
  }

   /**
   * class predictions
   * @return dfsStorageClassPredictions
  **/
  @Schema(required = true, description = "class predictions")
  public List<DfsTierPrediction> getDfsStorageClassPredictions() {
    return dfsStorageClassPredictions;
  }

  public void setDfsStorageClassPredictions(List<DfsTierPrediction> dfsStorageClassPredictions) {
    this.dfsStorageClassPredictions = dfsStorageClassPredictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsStorageClassPredictionsResp dfsStorageClassPredictionsResp = (DfsStorageClassPredictionsResp) o;
    return Objects.equals(this.dfsStorageClassPredictions, dfsStorageClassPredictionsResp.dfsStorageClassPredictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsStorageClassPredictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsStorageClassPredictionsResp {\n");
    
    sb.append("    dfsStorageClassPredictions: ").append(toIndentedString(dfsStorageClassPredictions)).append("\n");
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
