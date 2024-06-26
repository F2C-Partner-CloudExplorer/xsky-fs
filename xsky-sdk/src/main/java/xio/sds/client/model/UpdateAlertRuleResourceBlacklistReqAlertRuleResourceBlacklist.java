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
 * UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist {
  @SerializedName("resource_ids")
  private List<Long> resourceIds = null;

  public UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist resourceIds(List<Long> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist addResourceIdsItem(Long resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<Long>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

   /**
   * resource blacklist id must array, ex: [1, 2, 3]
   * @return resourceIds
  **/
  @Schema(description = "resource blacklist id must array, ex: [1, 2, 3]")
  public List<Long> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<Long> resourceIds) {
    this.resourceIds = resourceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist updateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist = (UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist) o;
    return Objects.equals(this.resourceIds, updateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAlertRuleResourceBlacklistReqAlertRuleResourceBlacklist {\n");
    
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
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
