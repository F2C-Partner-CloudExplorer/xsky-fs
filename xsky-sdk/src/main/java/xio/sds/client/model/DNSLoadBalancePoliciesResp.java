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
import xio.sds.client.model.DNSLoadBalancePolicy;
/**
 * DNSLoadBalancePoliciesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSLoadBalancePoliciesResp {
  @SerializedName("dns_load_balance_policies")
  private List<DNSLoadBalancePolicy> dnsLoadBalancePolicies = null;

  public DNSLoadBalancePoliciesResp dnsLoadBalancePolicies(List<DNSLoadBalancePolicy> dnsLoadBalancePolicies) {
    this.dnsLoadBalancePolicies = dnsLoadBalancePolicies;
    return this;
  }

  public DNSLoadBalancePoliciesResp addDnsLoadBalancePoliciesItem(DNSLoadBalancePolicy dnsLoadBalancePoliciesItem) {
    if (this.dnsLoadBalancePolicies == null) {
      this.dnsLoadBalancePolicies = new ArrayList<DNSLoadBalancePolicy>();
    }
    this.dnsLoadBalancePolicies.add(dnsLoadBalancePoliciesItem);
    return this;
  }

   /**
   * dns load balance policy list
   * @return dnsLoadBalancePolicies
  **/
  @Schema(description = "dns load balance policy list")
  public List<DNSLoadBalancePolicy> getDnsLoadBalancePolicies() {
    return dnsLoadBalancePolicies;
  }

  public void setDnsLoadBalancePolicies(List<DNSLoadBalancePolicy> dnsLoadBalancePolicies) {
    this.dnsLoadBalancePolicies = dnsLoadBalancePolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSLoadBalancePoliciesResp dnSLoadBalancePoliciesResp = (DNSLoadBalancePoliciesResp) o;
    return Objects.equals(this.dnsLoadBalancePolicies, dnSLoadBalancePoliciesResp.dnsLoadBalancePolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsLoadBalancePolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSLoadBalancePoliciesResp {\n");
    
    sb.append("    dnsLoadBalancePolicies: ").append(toIndentedString(dnsLoadBalancePolicies)).append("\n");
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
