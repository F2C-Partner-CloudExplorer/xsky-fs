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
import xio.sds.client.model.DNSGatewayGroup;
/**
 * DNSGatewayGroupsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSGatewayGroupsResp {
  @SerializedName("dns_gateway_groups")
  private List<DNSGatewayGroup> dnsGatewayGroups = null;

  public DNSGatewayGroupsResp dnsGatewayGroups(List<DNSGatewayGroup> dnsGatewayGroups) {
    this.dnsGatewayGroups = dnsGatewayGroups;
    return this;
  }

  public DNSGatewayGroupsResp addDnsGatewayGroupsItem(DNSGatewayGroup dnsGatewayGroupsItem) {
    if (this.dnsGatewayGroups == null) {
      this.dnsGatewayGroups = new ArrayList<DNSGatewayGroup>();
    }
    this.dnsGatewayGroups.add(dnsGatewayGroupsItem);
    return this;
  }

   /**
   * dns gateway group list
   * @return dnsGatewayGroups
  **/
  @Schema(description = "dns gateway group list")
  public List<DNSGatewayGroup> getDnsGatewayGroups() {
    return dnsGatewayGroups;
  }

  public void setDnsGatewayGroups(List<DNSGatewayGroup> dnsGatewayGroups) {
    this.dnsGatewayGroups = dnsGatewayGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSGatewayGroupsResp dnSGatewayGroupsResp = (DNSGatewayGroupsResp) o;
    return Objects.equals(this.dnsGatewayGroups, dnSGatewayGroupsResp.dnsGatewayGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsGatewayGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSGatewayGroupsResp {\n");
    
    sb.append("    dnsGatewayGroups: ").append(toIndentedString(dnsGatewayGroups)).append("\n");
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
