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
 * OspUserSetSelectStoragePoliciesReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspUserSetSelectStoragePoliciesReqInfo {
  @SerializedName("location_constraint_enabled")
  private Boolean locationConstraintEnabled = null;

  @SerializedName("select_storage_policies")
  private List<Long> selectStoragePolicies = null;

  public OspUserSetSelectStoragePoliciesReqInfo locationConstraintEnabled(Boolean locationConstraintEnabled) {
    this.locationConstraintEnabled = locationConstraintEnabled;
    return this;
  }

   /**
   * Get locationConstraintEnabled
   * @return locationConstraintEnabled
  **/
  @Schema(description = "")
  public Boolean isLocationConstraintEnabled() {
    return locationConstraintEnabled;
  }

  public void setLocationConstraintEnabled(Boolean locationConstraintEnabled) {
    this.locationConstraintEnabled = locationConstraintEnabled;
  }

  public OspUserSetSelectStoragePoliciesReqInfo selectStoragePolicies(List<Long> selectStoragePolicies) {
    this.selectStoragePolicies = selectStoragePolicies;
    return this;
  }

  public OspUserSetSelectStoragePoliciesReqInfo addSelectStoragePoliciesItem(Long selectStoragePoliciesItem) {
    if (this.selectStoragePolicies == null) {
      this.selectStoragePolicies = new ArrayList<Long>();
    }
    this.selectStoragePolicies.add(selectStoragePoliciesItem);
    return this;
  }

   /**
   * Get selectStoragePolicies
   * @return selectStoragePolicies
  **/
  @Schema(description = "")
  public List<Long> getSelectStoragePolicies() {
    return selectStoragePolicies;
  }

  public void setSelectStoragePolicies(List<Long> selectStoragePolicies) {
    this.selectStoragePolicies = selectStoragePolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspUserSetSelectStoragePoliciesReqInfo ospUserSetSelectStoragePoliciesReqInfo = (OspUserSetSelectStoragePoliciesReqInfo) o;
    return Objects.equals(this.locationConstraintEnabled, ospUserSetSelectStoragePoliciesReqInfo.locationConstraintEnabled) &&
        Objects.equals(this.selectStoragePolicies, ospUserSetSelectStoragePoliciesReqInfo.selectStoragePolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationConstraintEnabled, selectStoragePolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspUserSetSelectStoragePoliciesReqInfo {\n");
    
    sb.append("    locationConstraintEnabled: ").append(toIndentedString(locationConstraintEnabled)).append("\n");
    sb.append("    selectStoragePolicies: ").append(toIndentedString(selectStoragePolicies)).append("\n");
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
