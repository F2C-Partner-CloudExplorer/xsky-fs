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
import xio.sds.client.model.UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist;
/**
 * UpdateAlertRuleResourceBlacklistReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class UpdateAlertRuleResourceBlacklistReq {
  @SerializedName("alert_rule_resource_blacklist")
  private UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist alertRuleResourceBlacklist = null;

  public UpdateAlertRuleResourceBlacklistReq alertRuleResourceBlacklist(UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist alertRuleResourceBlacklist) {
    this.alertRuleResourceBlacklist = alertRuleResourceBlacklist;
    return this;
  }

   /**
   * Get alertRuleResourceBlacklist
   * @return alertRuleResourceBlacklist
  **/
  @Schema(required = true, description = "")
  public UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist getAlertRuleResourceBlacklist() {
    return alertRuleResourceBlacklist;
  }

  public void setAlertRuleResourceBlacklist(UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist alertRuleResourceBlacklist) {
    this.alertRuleResourceBlacklist = alertRuleResourceBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAlertRuleResourceBlacklistReq updateAlertRuleResourceBlacklistReq = (UpdateAlertRuleResourceBlacklistReq) o;
    return Objects.equals(this.alertRuleResourceBlacklist, updateAlertRuleResourceBlacklistReq.alertRuleResourceBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertRuleResourceBlacklist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAlertRuleResourceBlacklistReq {\n");
    
    sb.append("    alertRuleResourceBlacklist: ").append(toIndentedString(alertRuleResourceBlacklist)).append("\n");
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
