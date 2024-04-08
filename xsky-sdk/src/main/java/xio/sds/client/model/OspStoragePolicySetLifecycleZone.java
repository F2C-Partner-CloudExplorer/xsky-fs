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
import xio.sds.client.model.OspStoragePolicySetLifecycleZoneInfo;
/**
 * OspStoragePolicySetLifecycleZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspStoragePolicySetLifecycleZone {
  @SerializedName("storage_policy")
  private OspStoragePolicySetLifecycleZoneInfo storagePolicy = null;

  public OspStoragePolicySetLifecycleZone storagePolicy(OspStoragePolicySetLifecycleZoneInfo storagePolicy) {
    this.storagePolicy = storagePolicy;
    return this;
  }

   /**
   * Get storagePolicy
   * @return storagePolicy
  **/
  @Schema(description = "")
  public OspStoragePolicySetLifecycleZoneInfo getStoragePolicy() {
    return storagePolicy;
  }

  public void setStoragePolicy(OspStoragePolicySetLifecycleZoneInfo storagePolicy) {
    this.storagePolicy = storagePolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspStoragePolicySetLifecycleZone ospStoragePolicySetLifecycleZone = (OspStoragePolicySetLifecycleZone) o;
    return Objects.equals(this.storagePolicy, ospStoragePolicySetLifecycleZone.storagePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storagePolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspStoragePolicySetLifecycleZone {\n");
    
    sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
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
