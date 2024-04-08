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
import xio.sds.client.model.FSKerberosUpdateReqInfo;
/**
 * FSKerberosUpdateReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class FSKerberosUpdateReq {
  @SerializedName("fs_kerberos")
  private FSKerberosUpdateReqInfo fsKerberos = null;

  public FSKerberosUpdateReq fsKerberos(FSKerberosUpdateReqInfo fsKerberos) {
    this.fsKerberos = fsKerberos;
    return this;
  }

   /**
   * Get fsKerberos
   * @return fsKerberos
  **/
  @Schema(required = true, description = "")
  public FSKerberosUpdateReqInfo getFsKerberos() {
    return fsKerberos;
  }

  public void setFsKerberos(FSKerberosUpdateReqInfo fsKerberos) {
    this.fsKerberos = fsKerberos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FSKerberosUpdateReq fsKerberosUpdateReq = (FSKerberosUpdateReq) o;
    return Objects.equals(this.fsKerberos, fsKerberosUpdateReq.fsKerberos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsKerberos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FSKerberosUpdateReq {\n");
    
    sb.append("    fsKerberos: ").append(toIndentedString(fsKerberos)).append("\n");
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
