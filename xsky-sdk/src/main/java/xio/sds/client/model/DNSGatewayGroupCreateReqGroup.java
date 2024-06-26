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
import xio.sds.client.model.DNSGatewayGroupCreateReqGroupVIPGroupsElt;
/**
 * DNSGatewayGroupCreateReqGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DNSGatewayGroupCreateReqGroup {
  @SerializedName("host_ids")
  private List<Long> hostIds = new ArrayList<Long>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("ttl")
  private Long ttl = null;

  @SerializedName("vip_groups")
  private List<DNSGatewayGroupCreateReqGroupVIPGroupsElt> vipGroups = null;

  public DNSGatewayGroupCreateReqGroup hostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
    return this;
  }

  public DNSGatewayGroupCreateReqGroup addHostIdsItem(Long hostIdsItem) {
    this.hostIds.add(hostIdsItem);
    return this;
  }

   /**
   * dns gateway id list
   * @return hostIds
  **/
  @Schema(required = true, description = "dns gateway id list")
  public List<Long> getHostIds() {
    return hostIds;
  }

  public void setHostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
  }

  public DNSGatewayGroupCreateReqGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * dns gateway group name
   * @return name
  **/
  @Schema(required = true, description = "dns gateway group name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DNSGatewayGroupCreateReqGroup origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * dns origin
   * @return origin
  **/
  @Schema(required = true, description = "dns origin")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public DNSGatewayGroupCreateReqGroup port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * dns service port
   * @return port
  **/
  @Schema(required = true, description = "dns service port")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public DNSGatewayGroupCreateReqGroup ttl(Long ttl) {
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

  public DNSGatewayGroupCreateReqGroup vipGroups(List<DNSGatewayGroupCreateReqGroupVIPGroupsElt> vipGroups) {
    this.vipGroups = vipGroups;
    return this;
  }

  public DNSGatewayGroupCreateReqGroup addVipGroupsItem(DNSGatewayGroupCreateReqGroupVIPGroupsElt vipGroupsItem) {
    if (this.vipGroups == null) {
      this.vipGroups = new ArrayList<DNSGatewayGroupCreateReqGroupVIPGroupsElt>();
    }
    this.vipGroups.add(vipGroupsItem);
    return this;
  }

   /**
   * dns vip groups
   * @return vipGroups
  **/
  @Schema(description = "dns vip groups")
  public List<DNSGatewayGroupCreateReqGroupVIPGroupsElt> getVipGroups() {
    return vipGroups;
  }

  public void setVipGroups(List<DNSGatewayGroupCreateReqGroupVIPGroupsElt> vipGroups) {
    this.vipGroups = vipGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSGatewayGroupCreateReqGroup dnSGatewayGroupCreateReqGroup = (DNSGatewayGroupCreateReqGroup) o;
    return Objects.equals(this.hostIds, dnSGatewayGroupCreateReqGroup.hostIds) &&
        Objects.equals(this.name, dnSGatewayGroupCreateReqGroup.name) &&
        Objects.equals(this.origin, dnSGatewayGroupCreateReqGroup.origin) &&
        Objects.equals(this.port, dnSGatewayGroupCreateReqGroup.port) &&
        Objects.equals(this.ttl, dnSGatewayGroupCreateReqGroup.ttl) &&
        Objects.equals(this.vipGroups, dnSGatewayGroupCreateReqGroup.vipGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIds, name, origin, port, ttl, vipGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSGatewayGroupCreateReqGroup {\n");
    
    sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    vipGroups: ").append(toIndentedString(vipGroups)).append("\n");
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
