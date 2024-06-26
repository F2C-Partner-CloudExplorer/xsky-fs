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
/**
 * DNSZoneUpdateReqZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSZoneUpdateReqZone {
  @SerializedName("origin")
  private String origin = null;

  @SerializedName("ttl")
  private Long ttl = null;

  public DNSZoneUpdateReqZone origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * dns origin in zone
   * @return origin
  **/
  @Schema(description = "dns origin in zone")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public DNSZoneUpdateReqZone ttl(Long ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * dns ttl with zone
   * @return ttl
  **/
  @Schema(description = "dns ttl with zone")
  public Long getTtl() {
    return ttl;
  }

  public void setTtl(Long ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSZoneUpdateReqZone dnSZoneUpdateReqZone = (DNSZoneUpdateReqZone) o;
    return Objects.equals(this.origin, dnSZoneUpdateReqZone.origin) &&
        Objects.equals(this.ttl, dnSZoneUpdateReqZone.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origin, ttl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSZoneUpdateReqZone {\n");
    
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
