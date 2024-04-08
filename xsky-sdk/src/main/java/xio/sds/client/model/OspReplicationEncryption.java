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
import xio.sds.client.model.OspReplicationServerSide;
/**
 * OspReplicationEncryption
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspReplicationEncryption {
  @SerializedName("sse_c_customer_key")
  private String sseCCustomerKey = null;

  @SerializedName("backstage")
  private String backstage = null;

  @SerializedName("server_side")
  private OspReplicationServerSide serverSide = null;

  public OspReplicationEncryption sseCCustomerKey(String sseCCustomerKey) {
    this.sseCCustomerKey = sseCCustomerKey;
    return this;
  }

   /**
   * Get sseCCustomerKey
   * @return sseCCustomerKey
  **/
  @Schema(description = "")
  public String getSseCCustomerKey() {
    return sseCCustomerKey;
  }

  public void setSseCCustomerKey(String sseCCustomerKey) {
    this.sseCCustomerKey = sseCCustomerKey;
  }

  public OspReplicationEncryption backstage(String backstage) {
    this.backstage = backstage;
    return this;
  }

   /**
   * Get backstage
   * @return backstage
  **/
  @Schema(description = "")
  public String getBackstage() {
    return backstage;
  }

  public void setBackstage(String backstage) {
    this.backstage = backstage;
  }

  public OspReplicationEncryption serverSide(OspReplicationServerSide serverSide) {
    this.serverSide = serverSide;
    return this;
  }

   /**
   * Get serverSide
   * @return serverSide
  **/
  @Schema(description = "")
  public OspReplicationServerSide getServerSide() {
    return serverSide;
  }

  public void setServerSide(OspReplicationServerSide serverSide) {
    this.serverSide = serverSide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspReplicationEncryption ospReplicationEncryption = (OspReplicationEncryption) o;
    return Objects.equals(this.sseCCustomerKey, ospReplicationEncryption.sseCCustomerKey) &&
        Objects.equals(this.backstage, ospReplicationEncryption.backstage) &&
        Objects.equals(this.serverSide, ospReplicationEncryption.serverSide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sseCCustomerKey, backstage, serverSide);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspReplicationEncryption {\n");
    
    sb.append("    sseCCustomerKey: ").append(toIndentedString(sseCCustomerKey)).append("\n");
    sb.append("    backstage: ").append(toIndentedString(backstage)).append("\n");
    sb.append("    serverSide: ").append(toIndentedString(serverSide)).append("\n");
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
