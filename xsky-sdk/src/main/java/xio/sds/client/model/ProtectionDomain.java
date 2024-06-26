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
import xio.sds.client.model.PlacementNodeNestview;
/**
 * ProtectionDomain defines protection domain objects
 */
@Schema(description = "ProtectionDomain defines protection domain objects")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ProtectionDomain {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("placement_node")
  private PlacementNodeNestview placementNode = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public ProtectionDomain create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * time of creating protection domain
   * @return create
  **/
  @Schema(description = "time of creating protection domain")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public ProtectionDomain description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of protection domain
   * @return description
  **/
  @Schema(description = "description of protection domain")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProtectionDomain id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id of protection domain
   * @return id
  **/
  @Schema(description = "id of protection domain")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProtectionDomain name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of protection domain
   * @return name
  **/
  @Schema(description = "name of protection domain")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProtectionDomain placementNode(PlacementNodeNestview placementNode) {
    this.placementNode = placementNode;
    return this;
  }

   /**
   * Get placementNode
   * @return placementNode
  **/
  @Schema(description = "")
  public PlacementNodeNestview getPlacementNode() {
    return placementNode;
  }

  public void setPlacementNode(PlacementNodeNestview placementNode) {
    this.placementNode = placementNode;
  }

  public ProtectionDomain status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status protection domain
   * @return status
  **/
  @Schema(description = "status protection domain")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProtectionDomain update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * time of updating protection domain
   * @return update
  **/
  @Schema(description = "time of updating protection domain")
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
    ProtectionDomain protectionDomain = (ProtectionDomain) o;
    return Objects.equals(this.create, protectionDomain.create) &&
        Objects.equals(this.description, protectionDomain.description) &&
        Objects.equals(this.id, protectionDomain.id) &&
        Objects.equals(this.name, protectionDomain.name) &&
        Objects.equals(this.placementNode, protectionDomain.placementNode) &&
        Objects.equals(this.status, protectionDomain.status) &&
        Objects.equals(this.update, protectionDomain.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, description, id, name, placementNode, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectionDomain {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    placementNode: ").append(toIndentedString(placementNode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
