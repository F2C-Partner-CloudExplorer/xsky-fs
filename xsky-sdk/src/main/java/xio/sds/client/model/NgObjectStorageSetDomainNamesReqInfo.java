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
 * NgObjectStorageSetDomainNamesReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NgObjectStorageSetDomainNamesReqInfo {
  @SerializedName("cname_enabled")
  private Boolean cnameEnabled = null;

  @SerializedName("domain_names")
  private List<String> domainNames = null;

  public NgObjectStorageSetDomainNamesReqInfo cnameEnabled(Boolean cnameEnabled) {
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

  public NgObjectStorageSetDomainNamesReqInfo domainNames(List<String> domainNames) {
    this.domainNames = domainNames;
    return this;
  }

  public NgObjectStorageSetDomainNamesReqInfo addDomainNamesItem(String domainNamesItem) {
    if (this.domainNames == null) {
      this.domainNames = new ArrayList<String>();
    }
    this.domainNames.add(domainNamesItem);
    return this;
  }

   /**
   * Get domainNames
   * @return domainNames
  **/
  @Schema(description = "")
  public List<String> getDomainNames() {
    return domainNames;
  }

  public void setDomainNames(List<String> domainNames) {
    this.domainNames = domainNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NgObjectStorageSetDomainNamesReqInfo ngObjectStorageSetDomainNamesReqInfo = (NgObjectStorageSetDomainNamesReqInfo) o;
    return Objects.equals(this.cnameEnabled, ngObjectStorageSetDomainNamesReqInfo.cnameEnabled) &&
        Objects.equals(this.domainNames, ngObjectStorageSetDomainNamesReqInfo.domainNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cnameEnabled, domainNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NgObjectStorageSetDomainNamesReqInfo {\n");
    
    sb.append("    cnameEnabled: ").append(toIndentedString(cnameEnabled)).append("\n");
    sb.append("    domainNames: ").append(toIndentedString(domainNames)).append("\n");
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
