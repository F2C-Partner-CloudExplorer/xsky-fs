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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.Cluster;
import xio.sds.client.model.PlacementNode;
import xio.sds.client.model.PlacementNodeProperties;
/**
 * parent of placement node
 */
@Schema(description = "parent of placement node")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class PlacementNodeNestviewParent {
  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("orig_id")
  private Long origId = null;

  @SerializedName("parent")
  private PlacementNode parent = null;

  @SerializedName("properties")
  private PlacementNodeProperties properties = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public PlacementNodeNestviewParent cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public PlacementNodeNestviewParent create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * time of creating placement node
   * @return create
  **/
  @Schema(description = "time of creating placement node")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public PlacementNodeNestviewParent id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id of placement node
   * @return id
  **/
  @Schema(description = "id of placement node")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PlacementNodeNestviewParent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of placement node
   * @return name
  **/
  @Schema(description = "name of placement node")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlacementNodeNestviewParent origId(Long origId) {
    this.origId = origId;
    return this;
  }

   /**
   * old id of placement node
   * @return origId
  **/
  @Schema(description = "old id of placement node")
  public Long getOrigId() {
    return origId;
  }

  public void setOrigId(Long origId) {
    this.origId = origId;
  }

  public PlacementNodeNestviewParent parent(PlacementNode parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public PlacementNode getParent() {
    return parent;
  }

  public void setParent(PlacementNode parent) {
    this.parent = parent;
  }

  public PlacementNodeNestviewParent properties(PlacementNodeProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public PlacementNodeProperties getProperties() {
    return properties;
  }

  public void setProperties(PlacementNodeProperties properties) {
    this.properties = properties;
  }

  public PlacementNodeNestviewParent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of placement node
   * @return type
  **/
  @Schema(description = "type of placement node")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PlacementNodeNestviewParent update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * time of updating placement node
   * @return update
  **/
  @Schema(description = "time of updating placement node")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementNodeNestviewParent placementNodeNestviewParent = (PlacementNodeNestviewParent) o;
    return Objects.equals(this.cluster, placementNodeNestviewParent.cluster) &&
        Objects.equals(this.create, placementNodeNestviewParent.create) &&
        Objects.equals(this.id, placementNodeNestviewParent.id) &&
        Objects.equals(this.name, placementNodeNestviewParent.name) &&
        Objects.equals(this.origId, placementNodeNestviewParent.origId) &&
        Objects.equals(this.parent, placementNodeNestviewParent.parent) &&
        Objects.equals(this.properties, placementNodeNestviewParent.properties) &&
        Objects.equals(this.type, placementNodeNestviewParent.type) &&
        Objects.equals(this.update, placementNodeNestviewParent.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, id, name, origId, parent, properties, type, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlacementNodeNestviewParent {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origId: ").append(toIndentedString(origId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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