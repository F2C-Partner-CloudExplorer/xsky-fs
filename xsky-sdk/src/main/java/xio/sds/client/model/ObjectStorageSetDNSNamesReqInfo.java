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
 * ObjectStorageSetDNSNamesReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageSetDNSNamesReqInfo {
  @SerializedName("cname_enabled")
  private Boolean cnameEnabled = null;

  @SerializedName("dns_names")
  private List<String> dnsNames = null;

  public ObjectStorageSetDNSNamesReqInfo cnameEnabled(Boolean cnameEnabled) {
    this.cnameEnabled = cnameEnabled;
    return this;
  }

   /**
   * Get cnameEnabled
   * @return cnameEnabled
  **/
  @Schema(description = "")
  public Boolean isCnameEnabled() {
    return cnameEnabled;
  }

  public void setCnameEnabled(Boolean cnameEnabled) {
    this.cnameEnabled = cnameEnabled;
  }

  public ObjectStorageSetDNSNamesReqInfo dnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
    return this;
  }

  public ObjectStorageSetDNSNamesReqInfo addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<String>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

   /**
   * Get dnsNames
   * @return dnsNames
  **/
  @Schema(description = "")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageSetDNSNamesReqInfo objectStorageSetDNSNamesReqInfo = (ObjectStorageSetDNSNamesReqInfo) o;
    return Objects.equals(this.cnameEnabled, objectStorageSetDNSNamesReqInfo.cnameEnabled) &&
        Objects.equals(this.dnsNames, objectStorageSetDNSNamesReqInfo.dnsNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnameEnabled, dnsNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageSetDNSNamesReqInfo {\n");
    
    sb.append("    cnameEnabled: ").append(toIndentedString(cnameEnabled)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
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
