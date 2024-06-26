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
import xio.sds.client.model.AlertRule;
import xio.sds.client.model.AlertRuleGroup;
/**
 * AlertRuleGroupDetailResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertRuleGroupDetailResp {
  @SerializedName("alert_rule_group")
  private AlertRuleGroup alertRuleGroup = null;

  @SerializedName("alert_rules")
  private List<AlertRule> alertRules = new ArrayList<AlertRule>();

  public AlertRuleGroupDetailResp alertRuleGroup(AlertRuleGroup alertRuleGroup) {
    this.alertRuleGroup = alertRuleGroup;
    return this;
  }

   /**
   * Get alertRuleGroup
   * @return alertRuleGroup
  **/
  @Schema(required = true, description = "")
  public AlertRuleGroup getAlertRuleGroup() {
    return alertRuleGroup;
  }

  public void setAlertRuleGroup(AlertRuleGroup alertRuleGroup) {
    this.alertRuleGroup = alertRuleGroup;
  }

  public AlertRuleGroupDetailResp alertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public AlertRuleGroupDetailResp addAlertRulesItem(AlertRule alertRulesItem) {
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * alert rule group members
   * @return alertRules
  **/
  @Schema(required = true, description = "alert rule group members")
  public List<AlertRule> getAlertRules() {
    return alertRules;
  }

  public void setAlertRules(List<AlertRule> alertRules) {
    this.alertRules = alertRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleGroupDetailResp alertRuleGroupDetailResp = (AlertRuleGroupDetailResp) o;
    return Objects.equals(this.alertRuleGroup, alertRuleGroupDetailResp.alertRuleGroup) &&
        Objects.equals(this.alertRules, alertRuleGroupDetailResp.alertRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertRuleGroup, alertRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleGroupDetailResp {\n");
    
    sb.append("    alertRuleGroup: ").append(toIndentedString(alertRuleGroup)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
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
