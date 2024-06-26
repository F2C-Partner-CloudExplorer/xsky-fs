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
import xio.sds.client.model.Condition;
/**
 * MatchingRuleMatchCondition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class MatchingRuleMatchCondition {
  @SerializedName("cond_operator")
  private String condOperator = null;

  @SerializedName("conditions")
  private List<Condition> conditions = null;

  public MatchingRuleMatchCondition condOperator(String condOperator) {
    this.condOperator = condOperator;
    return this;
  }

   /**
   * Get condOperator
   * @return condOperator
  **/
  @Schema(description = "")
  public String getCondOperator() {
    return condOperator;
  }

  public void setCondOperator(String condOperator) {
    this.condOperator = condOperator;
  }

  public MatchingRuleMatchCondition conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public MatchingRuleMatchCondition addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @Schema(description = "")
  public List<Condition> getConditions() {
    return conditions;
  }

  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchingRuleMatchCondition matchingRuleMatchCondition = (MatchingRuleMatchCondition) o;
    return Objects.equals(this.condOperator, matchingRuleMatchCondition.condOperator) &&
        Objects.equals(this.conditions, matchingRuleMatchCondition.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condOperator, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingRuleMatchCondition {\n");
    
    sb.append("    condOperator: ").append(toIndentedString(condOperator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
