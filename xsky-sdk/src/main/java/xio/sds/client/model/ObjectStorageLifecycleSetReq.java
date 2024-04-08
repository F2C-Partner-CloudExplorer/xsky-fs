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
import xio.sds.client.model.LifecycleRule;
/**
 * ObjectStorageLifecycleSetReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageLifecycleSetReq {
  @SerializedName("lifecycle_rules")
  private List<LifecycleRule> lifecycleRules = null;

  public ObjectStorageLifecycleSetReq lifecycleRules(List<LifecycleRule> lifecycleRules) {
    this.lifecycleRules = lifecycleRules;
    return this;
  }

  public ObjectStorageLifecycleSetReq addLifecycleRulesItem(LifecycleRule lifecycleRulesItem) {
    if (this.lifecycleRules == null) {
      this.lifecycleRules = new ArrayList<LifecycleRule>();
    }
    this.lifecycleRules.add(lifecycleRulesItem);
    return this;
  }

   /**
   * Get lifecycleRules
   * @return lifecycleRules
  **/
  @Schema(description = "")
  public List<LifecycleRule> getLifecycleRules() {
    return lifecycleRules;
  }

  public void setLifecycleRules(List<LifecycleRule> lifecycleRules) {
    this.lifecycleRules = lifecycleRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageLifecycleSetReq objectStorageLifecycleSetReq = (ObjectStorageLifecycleSetReq) o;
    return Objects.equals(this.lifecycleRules, objectStorageLifecycleSetReq.lifecycleRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifecycleRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageLifecycleSetReq {\n");
    
    sb.append("    lifecycleRules: ").append(toIndentedString(lifecycleRules)).append("\n");
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