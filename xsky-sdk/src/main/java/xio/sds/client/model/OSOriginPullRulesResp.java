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
import xio.sds.client.model.OSOriginPullRule;
/**
 * OSOriginPullRulesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSOriginPullRulesResp {
  @SerializedName("os_origin_pull_rules")
  private List<OSOriginPullRule> osOriginPullRules = null;

  public OSOriginPullRulesResp osOriginPullRules(List<OSOriginPullRule> osOriginPullRules) {
    this.osOriginPullRules = osOriginPullRules;
    return this;
  }

  public OSOriginPullRulesResp addOsOriginPullRulesItem(OSOriginPullRule osOriginPullRulesItem) {
    if (this.osOriginPullRules == null) {
      this.osOriginPullRules = new ArrayList<OSOriginPullRule>();
    }
    this.osOriginPullRules.add(osOriginPullRulesItem);
    return this;
  }

   /**
   * Get osOriginPullRules
   * @return osOriginPullRules
  **/
  @Schema(description = "")
  public List<OSOriginPullRule> getOsOriginPullRules() {
    return osOriginPullRules;
  }

  public void setOsOriginPullRules(List<OSOriginPullRule> osOriginPullRules) {
    this.osOriginPullRules = osOriginPullRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSOriginPullRulesResp osOriginPullRulesResp = (OSOriginPullRulesResp) o;
    return Objects.equals(this.osOriginPullRules, osOriginPullRulesResp.osOriginPullRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osOriginPullRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSOriginPullRulesResp {\n");
    
    sb.append("    osOriginPullRules: ").append(toIndentedString(osOriginPullRules)).append("\n");
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
