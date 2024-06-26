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
/**
 * DfsGatewayReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsGatewayReq {
  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("network_address_id")
  private Long networkAddressId = null;

  public DfsGatewayReq hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * host id
   * @return hostId
  **/
  @Schema(required = true, description = "host id")
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public DfsGatewayReq networkAddressId(Long networkAddressId) {
    this.networkAddressId = networkAddressId;
    return this;
  }

   /**
   * network address id
   * @return networkAddressId
  **/
  @Schema(required = true, description = "network address id")
  public Long getNetworkAddressId() {
    return networkAddressId;
  }

  public void setNetworkAddressId(Long networkAddressId) {
    this.networkAddressId = networkAddressId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsGatewayReq dfsGatewayReq = (DfsGatewayReq) o;
    return Objects.equals(this.hostId, dfsGatewayReq.hostId) &&
        Objects.equals(this.networkAddressId, dfsGatewayReq.networkAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostId, networkAddressId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsGatewayReq {\n");
    
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    networkAddressId: ").append(toIndentedString(networkAddressId)).append("\n");
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
