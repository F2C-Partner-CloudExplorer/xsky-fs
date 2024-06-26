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
 * OpHostsZoneReqHostsZoneInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OpHostsZoneReqHostsZoneInfo {
  @SerializedName("hosts")
  private List<Long> hosts = null;

  @SerializedName("zone")
  private Long zone = null;

  public OpHostsZoneReqHostsZoneInfo hosts(List<Long> hosts) {
    this.hosts = hosts;
    return this;
  }

  public OpHostsZoneReqHostsZoneInfo addHostsItem(Long hostsItem) {
    if (this.hosts == null) {
      this.hosts = new ArrayList<Long>();
    }
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @Schema(description = "")
  public List<Long> getHosts() {
    return hosts;
  }

  public void setHosts(List<Long> hosts) {
    this.hosts = hosts;
  }

  public OpHostsZoneReqHostsZoneInfo zone(Long zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public Long getZone() {
    return zone;
  }

  public void setZone(Long zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpHostsZoneReqHostsZoneInfo opHostsZoneReqHostsZoneInfo = (OpHostsZoneReqHostsZoneInfo) o;
    return Objects.equals(this.hosts, opHostsZoneReqHostsZoneInfo.hosts) &&
        Objects.equals(this.zone, opHostsZoneReqHostsZoneInfo.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hosts, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpHostsZoneReqHostsZoneInfo {\n");
    
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
