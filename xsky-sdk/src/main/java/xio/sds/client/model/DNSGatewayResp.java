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
import xio.sds.client.model.DNSGateway;
/**
 * DNSGatewayResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSGatewayResp {
  @SerializedName("dns_gateway")
  private DNSGateway dnsGateway = null;

  public DNSGatewayResp dnsGateway(DNSGateway dnsGateway) {
    this.dnsGateway = dnsGateway;
    return this;
  }

   /**
   * Get dnsGateway
   * @return dnsGateway
  **/
  @Schema(description = "")
  public DNSGateway getDnsGateway() {
    return dnsGateway;
  }

  public void setDnsGateway(DNSGateway dnsGateway) {
    this.dnsGateway = dnsGateway;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSGatewayResp dnSGatewayResp = (DNSGatewayResp) o;
    return Objects.equals(this.dnsGateway, dnSGatewayResp.dnsGateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsGateway);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSGatewayResp {\n");
    
    sb.append("    dnsGateway: ").append(toIndentedString(dnsGateway)).append("\n");
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
