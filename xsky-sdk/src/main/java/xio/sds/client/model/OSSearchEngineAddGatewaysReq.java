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
import xio.sds.client.model.OSSearchEngineAddGatewaysReqSearchEngine;
/**
 * OSSearchEngineAddGatewaysReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSSearchEngineAddGatewaysReq {
  @SerializedName("os_search_engine")
  private OSSearchEngineAddGatewaysReqSearchEngine osSearchEngine = null;

  public OSSearchEngineAddGatewaysReq osSearchEngine(OSSearchEngineAddGatewaysReqSearchEngine osSearchEngine) {
    this.osSearchEngine = osSearchEngine;
    return this;
  }

   /**
   * Get osSearchEngine
   * @return osSearchEngine
  **/
  @Schema(required = true, description = "")
  public OSSearchEngineAddGatewaysReqSearchEngine getOsSearchEngine() {
    return osSearchEngine;
  }

  public void setOsSearchEngine(OSSearchEngineAddGatewaysReqSearchEngine osSearchEngine) {
    this.osSearchEngine = osSearchEngine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSearchEngineAddGatewaysReq osSearchEngineAddGatewaysReq = (OSSearchEngineAddGatewaysReq) o;
    return Objects.equals(this.osSearchEngine, osSearchEngineAddGatewaysReq.osSearchEngine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osSearchEngine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSearchEngineAddGatewaysReq {\n");
    
    sb.append("    osSearchEngine: ").append(toIndentedString(osSearchEngine)).append("\n");
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
