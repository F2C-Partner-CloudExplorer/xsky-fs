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
import xio.sds.client.model.OSSearchGatewayReq;
/**
 * OSSearchEngineCreateReqSearchEngine
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSSearchEngineCreateReqSearchEngine {
  @SerializedName("gateway_data_size")
  private Long gatewayDataSize = null;

  @SerializedName("gateway_flavor_id")
  private Long gatewayFlavorId = null;

  @SerializedName("gateway_http_port")
  private Long gatewayHttpPort = null;

  @SerializedName("gateway_transport_port")
  private Long gatewayTransportPort = null;

  @SerializedName("os_search_gateways")
  private List<OSSearchGatewayReq> osSearchGateways = new ArrayList<OSSearchGatewayReq>();

  public OSSearchEngineCreateReqSearchEngine gatewayDataSize(Long gatewayDataSize) {
    this.gatewayDataSize = gatewayDataSize;
    return this;
  }

   /**
   * Get gatewayDataSize
   * @return gatewayDataSize
  **/
  @Schema(required = true, description = "")
  public Long getGatewayDataSize() {
    return gatewayDataSize;
  }

  public void setGatewayDataSize(Long gatewayDataSize) {
    this.gatewayDataSize = gatewayDataSize;
  }

  public OSSearchEngineCreateReqSearchEngine gatewayFlavorId(Long gatewayFlavorId) {
    this.gatewayFlavorId = gatewayFlavorId;
    return this;
  }

   /**
   * Get gatewayFlavorId
   * @return gatewayFlavorId
  **/
  @Schema(required = true, description = "")
  public Long getGatewayFlavorId() {
    return gatewayFlavorId;
  }

  public void setGatewayFlavorId(Long gatewayFlavorId) {
    this.gatewayFlavorId = gatewayFlavorId;
  }

  public OSSearchEngineCreateReqSearchEngine gatewayHttpPort(Long gatewayHttpPort) {
    this.gatewayHttpPort = gatewayHttpPort;
    return this;
  }

   /**
   * Get gatewayHttpPort
   * @return gatewayHttpPort
  **/
  @Schema(description = "")
  public Long getGatewayHttpPort() {
    return gatewayHttpPort;
  }

  public void setGatewayHttpPort(Long gatewayHttpPort) {
    this.gatewayHttpPort = gatewayHttpPort;
  }

  public OSSearchEngineCreateReqSearchEngine gatewayTransportPort(Long gatewayTransportPort) {
    this.gatewayTransportPort = gatewayTransportPort;
    return this;
  }

   /**
   * Get gatewayTransportPort
   * @return gatewayTransportPort
  **/
  @Schema(description = "")
  public Long getGatewayTransportPort() {
    return gatewayTransportPort;
  }

  public void setGatewayTransportPort(Long gatewayTransportPort) {
    this.gatewayTransportPort = gatewayTransportPort;
  }

  public OSSearchEngineCreateReqSearchEngine osSearchGateways(List<OSSearchGatewayReq> osSearchGateways) {
    this.osSearchGateways = osSearchGateways;
    return this;
  }

  public OSSearchEngineCreateReqSearchEngine addOsSearchGatewaysItem(OSSearchGatewayReq osSearchGatewaysItem) {
    this.osSearchGateways.add(osSearchGatewaysItem);
    return this;
  }

   /**
   * Get osSearchGateways
   * @return osSearchGateways
  **/
  @Schema(required = true, description = "")
  public List<OSSearchGatewayReq> getOsSearchGateways() {
    return osSearchGateways;
  }

  public void setOsSearchGateways(List<OSSearchGatewayReq> osSearchGateways) {
    this.osSearchGateways = osSearchGateways;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSearchEngineCreateReqSearchEngine osSearchEngineCreateReqSearchEngine = (OSSearchEngineCreateReqSearchEngine) o;
    return Objects.equals(this.gatewayDataSize, osSearchEngineCreateReqSearchEngine.gatewayDataSize) &&
        Objects.equals(this.gatewayFlavorId, osSearchEngineCreateReqSearchEngine.gatewayFlavorId) &&
        Objects.equals(this.gatewayHttpPort, osSearchEngineCreateReqSearchEngine.gatewayHttpPort) &&
        Objects.equals(this.gatewayTransportPort, osSearchEngineCreateReqSearchEngine.gatewayTransportPort) &&
        Objects.equals(this.osSearchGateways, osSearchEngineCreateReqSearchEngine.osSearchGateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayDataSize, gatewayFlavorId, gatewayHttpPort, gatewayTransportPort, osSearchGateways);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSearchEngineCreateReqSearchEngine {\n");
    
    sb.append("    gatewayDataSize: ").append(toIndentedString(gatewayDataSize)).append("\n");
    sb.append("    gatewayFlavorId: ").append(toIndentedString(gatewayFlavorId)).append("\n");
    sb.append("    gatewayHttpPort: ").append(toIndentedString(gatewayHttpPort)).append("\n");
    sb.append("    gatewayTransportPort: ").append(toIndentedString(gatewayTransportPort)).append("\n");
    sb.append("    osSearchGateways: ").append(toIndentedString(osSearchGateways)).append("\n");
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
