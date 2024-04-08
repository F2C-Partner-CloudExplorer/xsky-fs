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
import xio.sds.client.model.OspNestedCluster;
import xio.sds.client.model.OspNestedZone;
import xio.sds.client.model.OspNestedZoneGroup;
import xio.sds.client.model.OspObjectGatewayType;
/**
 * OspObjectGateway
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspObjectGateway {
  @SerializedName("name")
  private String name = null;

  @SerializedName("zone")
  private OspNestedZone zone = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("zone_group")
  private OspNestedZoneGroup zoneGroup = null;

  @SerializedName("update")
  private String update = null;

  @SerializedName("cluster")
  private OspNestedCluster cluster = null;

  @SerializedName("type")
  private OspObjectGatewayType type = null;

  @SerializedName("frontends")
  private String frontends = null;

  public OspObjectGateway name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OspObjectGateway zone(OspNestedZone zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public OspNestedZone getZone() {
    return zone;
  }

  public void setZone(OspNestedZone zone) {
    this.zone = zone;
  }

  public OspObjectGateway create(String create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public OspObjectGateway zoneGroup(OspNestedZoneGroup zoneGroup) {
    this.zoneGroup = zoneGroup;
    return this;
  }

   /**
   * Get zoneGroup
   * @return zoneGroup
  **/
  @Schema(description = "")
  public OspNestedZoneGroup getZoneGroup() {
    return zoneGroup;
  }

  public void setZoneGroup(OspNestedZoneGroup zoneGroup) {
    this.zoneGroup = zoneGroup;
  }

  public OspObjectGateway update(String update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public String getUpdate() {
    return update;
  }

  public void setUpdate(String update) {
    this.update = update;
  }

  public OspObjectGateway cluster(OspNestedCluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public OspNestedCluster getCluster() {
    return cluster;
  }

  public void setCluster(OspNestedCluster cluster) {
    this.cluster = cluster;
  }

  public OspObjectGateway type(OspObjectGatewayType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public OspObjectGatewayType getType() {
    return type;
  }

  public void setType(OspObjectGatewayType type) {
    this.type = type;
  }

  public OspObjectGateway frontends(String frontends) {
    this.frontends = frontends;
    return this;
  }

   /**
   * Get frontends
   * @return frontends
  **/
  @Schema(description = "")
  public String getFrontends() {
    return frontends;
  }

  public void setFrontends(String frontends) {
    this.frontends = frontends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspObjectGateway ospObjectGateway = (OspObjectGateway) o;
    return Objects.equals(this.name, ospObjectGateway.name) &&
        Objects.equals(this.zone, ospObjectGateway.zone) &&
        Objects.equals(this.create, ospObjectGateway.create) &&
        Objects.equals(this.zoneGroup, ospObjectGateway.zoneGroup) &&
        Objects.equals(this.update, ospObjectGateway.update) &&
        Objects.equals(this.cluster, ospObjectGateway.cluster) &&
        Objects.equals(this.type, ospObjectGateway.type) &&
        Objects.equals(this.frontends, ospObjectGateway.frontends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, zone, create, zoneGroup, update, cluster, type, frontends);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspObjectGateway {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    zoneGroup: ").append(toIndentedString(zoneGroup)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frontends: ").append(toIndentedString(frontends)).append("\n");
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
