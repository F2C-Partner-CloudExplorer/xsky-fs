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
 * S3LoadBalancerRemoveServiceReqRemoveRulesElt
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancerRemoveServiceReqRemoveRulesElt {
  @SerializedName("osp_zone_id")
  private Long ospZoneId = null;

  @SerializedName("rules")
  private List<String> rules = new ArrayList<String>();

  public S3LoadBalancerRemoveServiceReqRemoveRulesElt ospZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
    return this;
  }

   /**
   * zone id of load balancers
   * @return ospZoneId
  **/
  @Schema(required = true, description = "zone id of load balancers")
  public Long getOspZoneId() {
    return ospZoneId;
  }

  public void setOspZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
  }

  public S3LoadBalancerRemoveServiceReqRemoveRulesElt rules(List<String> rules) {
    this.rules = rules;
    return this;
  }

  public S3LoadBalancerRemoveServiceReqRemoveRulesElt addRulesItem(String rulesItem) {
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * rules of service
   * @return rules
  **/
  @Schema(required = true, description = "rules of service")
  public List<String> getRules() {
    return rules;
  }

  public void setRules(List<String> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancerRemoveServiceReqRemoveRulesElt s3LoadBalancerRemoveServiceReqRemoveRulesElt = (S3LoadBalancerRemoveServiceReqRemoveRulesElt) o;
    return Objects.equals(this.ospZoneId, s3LoadBalancerRemoveServiceReqRemoveRulesElt.ospZoneId) &&
        Objects.equals(this.rules, s3LoadBalancerRemoveServiceReqRemoveRulesElt.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ospZoneId, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancerRemoveServiceReqRemoveRulesElt {\n");
    
    sb.append("    ospZoneId: ").append(toIndentedString(ospZoneId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
