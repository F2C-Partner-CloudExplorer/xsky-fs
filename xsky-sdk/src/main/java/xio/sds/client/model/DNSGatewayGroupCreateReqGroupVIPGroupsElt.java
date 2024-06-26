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
import xio.sds.client.model.VIPArgs;
/**
 * DNSGatewayGroupCreateReqGroupVIPGroupsElt
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSGatewayGroupCreateReqGroupVIPGroupsElt {
  @SerializedName("network")
  private String network = null;

  @SerializedName("vips")
  private List<VIPArgs> vips = null;

  public DNSGatewayGroupCreateReqGroupVIPGroupsElt network(String network) {
    this.network = network;
    return this;
  }

   /**
   * network of vip group
   * @return network
  **/
  @Schema(required = true, description = "network of vip group")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public DNSGatewayGroupCreateReqGroupVIPGroupsElt vips(List<VIPArgs> vips) {
    this.vips = vips;
    return this;
  }

  public DNSGatewayGroupCreateReqGroupVIPGroupsElt addVipsItem(VIPArgs vipsItem) {
    if (this.vips == null) {
      this.vips = new ArrayList<VIPArgs>();
    }
    this.vips.add(vipsItem);
    return this;
  }

   /**
   * vip list
   * @return vips
  **/
  @Schema(description = "vip list")
  public List<VIPArgs> getVips() {
    return vips;
  }

  public void setVips(List<VIPArgs> vips) {
    this.vips = vips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSGatewayGroupCreateReqGroupVIPGroupsElt dnSGatewayGroupCreateReqGroupVIPGroupsElt = (DNSGatewayGroupCreateReqGroupVIPGroupsElt) o;
    return Objects.equals(this.network, dnSGatewayGroupCreateReqGroupVIPGroupsElt.network) &&
        Objects.equals(this.vips, dnSGatewayGroupCreateReqGroupVIPGroupsElt.vips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, vips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSGatewayGroupCreateReqGroupVIPGroupsElt {\n");
    
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    vips: ").append(toIndentedString(vips)).append("\n");
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
