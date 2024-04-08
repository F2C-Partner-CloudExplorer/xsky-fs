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
import xio.sds.client.model.OspzoneBackendRelationsReq;
/**
 * OspZoneAddDataBackendsReqZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspZoneAddDataBackendsReqZone {
  @SerializedName("data_backend_relations")
  private List<OspzoneBackendRelationsReq> dataBackendRelations = null;

  public OspZoneAddDataBackendsReqZone dataBackendRelations(List<OspzoneBackendRelationsReq> dataBackendRelations) {
    this.dataBackendRelations = dataBackendRelations;
    return this;
  }

  public OspZoneAddDataBackendsReqZone addDataBackendRelationsItem(OspzoneBackendRelationsReq dataBackendRelationsItem) {
    if (this.dataBackendRelations == null) {
      this.dataBackendRelations = new ArrayList<OspzoneBackendRelationsReq>();
    }
    this.dataBackendRelations.add(dataBackendRelationsItem);
    return this;
  }

   /**
   * Get dataBackendRelations
   * @return dataBackendRelations
  **/
  @Schema(description = "")
  public List<OspzoneBackendRelationsReq> getDataBackendRelations() {
    return dataBackendRelations;
  }

  public void setDataBackendRelations(List<OspzoneBackendRelationsReq> dataBackendRelations) {
    this.dataBackendRelations = dataBackendRelations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspZoneAddDataBackendsReqZone ospZoneAddDataBackendsReqZone = (OspZoneAddDataBackendsReqZone) o;
    return Objects.equals(this.dataBackendRelations, ospZoneAddDataBackendsReqZone.dataBackendRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataBackendRelations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspZoneAddDataBackendsReqZone {\n");
    
    sb.append("    dataBackendRelations: ").append(toIndentedString(dataBackendRelations)).append("\n");
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