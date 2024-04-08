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
 * SsoType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SsoType {
  @SerializedName("type")
  private String type = null;

  @SerializedName("vendors")
  private List<String> vendors = null;

  public SsoType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SsoType vendors(List<String> vendors) {
    this.vendors = vendors;
    return this;
  }

  public SsoType addVendorsItem(String vendorsItem) {
    if (this.vendors == null) {
      this.vendors = new ArrayList<String>();
    }
    this.vendors.add(vendorsItem);
    return this;
  }

   /**
   * Get vendors
   * @return vendors
  **/
  @Schema(description = "")
  public List<String> getVendors() {
    return vendors;
  }

  public void setVendors(List<String> vendors) {
    this.vendors = vendors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SsoType ssoType = (SsoType) o;
    return Objects.equals(this.type, ssoType.type) &&
        Objects.equals(this.vendors, ssoType.vendors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, vendors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SsoType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendors: ").append(toIndentedString(vendors)).append("\n");
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