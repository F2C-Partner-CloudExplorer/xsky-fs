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
import xio.sds.client.model.NgObjectStorageSetDomainNamesReqInfo;
/**
 * NgObjectStorageSetDomainNamesReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NgObjectStorageSetDomainNamesReq {
  @SerializedName("ng_object_storage")
  private NgObjectStorageSetDomainNamesReqInfo ngObjectStorage = null;

  public NgObjectStorageSetDomainNamesReq ngObjectStorage(NgObjectStorageSetDomainNamesReqInfo ngObjectStorage) {
    this.ngObjectStorage = ngObjectStorage;
    return this;
  }

   /**
   * Get ngObjectStorage
   * @return ngObjectStorage
  **/
  @Schema(description = "")
  public NgObjectStorageSetDomainNamesReqInfo getNgObjectStorage() {
    return ngObjectStorage;
  }

  public void setNgObjectStorage(NgObjectStorageSetDomainNamesReqInfo ngObjectStorage) {
    this.ngObjectStorage = ngObjectStorage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NgObjectStorageSetDomainNamesReq ngObjectStorageSetDomainNamesReq = (NgObjectStorageSetDomainNamesReq) o;
    return Objects.equals(this.ngObjectStorage, ngObjectStorageSetDomainNamesReq.ngObjectStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ngObjectStorage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NgObjectStorageSetDomainNamesReq {\n");
    
    sb.append("    ngObjectStorage: ").append(toIndentedString(ngObjectStorage)).append("\n");
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