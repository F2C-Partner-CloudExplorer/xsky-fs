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
 * OSSearchEngineRemoveGatewaysReqSearchEngine
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSSearchEngineRemoveGatewaysReqSearchEngine {
  @SerializedName("os_search_gateway_ids")
  private List<Long> osSearchGatewayIds = new ArrayList<Long>();

  public OSSearchEngineRemoveGatewaysReqSearchEngine osSearchGatewayIds(List<Long> osSearchGatewayIds) {
    this.osSearchGatewayIds = osSearchGatewayIds;
    return this;
  }

  public OSSearchEngineRemoveGatewaysReqSearchEngine addOsSearchGatewayIdsItem(Long osSearchGatewayIdsItem) {
    this.osSearchGatewayIds.add(osSearchGatewayIdsItem);
    return this;
  }

   /**
   * Get osSearchGatewayIds
   * @return osSearchGatewayIds
  **/
  @Schema(required = true, description = "")
  public List<Long> getOsSearchGatewayIds() {
    return osSearchGatewayIds;
  }

  public void setOsSearchGatewayIds(List<Long> osSearchGatewayIds) {
    this.osSearchGatewayIds = osSearchGatewayIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSearchEngineRemoveGatewaysReqSearchEngine osSearchEngineRemoveGatewaysReqSearchEngine = (OSSearchEngineRemoveGatewaysReqSearchEngine) o;
    return Objects.equals(this.osSearchGatewayIds, osSearchEngineRemoveGatewaysReqSearchEngine.osSearchGatewayIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osSearchGatewayIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSearchEngineRemoveGatewaysReqSearchEngine {\n");
    
    sb.append("    osSearchGatewayIds: ").append(toIndentedString(osSearchGatewayIds)).append("\n");
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