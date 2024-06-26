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
 * OspSnapshot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspSnapshot {
  @SerializedName("retain_until_date")
  private String retainUntilDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("update")
  private String update = null;

  @SerializedName("rollback_version")
  private Long rollbackVersion = null;

  @SerializedName("delete")
  private String delete = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public OspSnapshot retainUntilDate(String retainUntilDate) {
    this.retainUntilDate = retainUntilDate;
    return this;
  }

   /**
   * Get retainUntilDate
   * @return retainUntilDate
  **/
  @Schema(description = "")
  public String getRetainUntilDate() {
    return retainUntilDate;
  }

  public void setRetainUntilDate(String retainUntilDate) {
    this.retainUntilDate = retainUntilDate;
  }

  public OspSnapshot description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OspSnapshot create(String create) {
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

  public OspSnapshot update(String update) {
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

  public OspSnapshot rollbackVersion(Long rollbackVersion) {
    this.rollbackVersion = rollbackVersion;
    return this;
  }

   /**
   * Get rollbackVersion
   * @return rollbackVersion
  **/
  @Schema(description = "")
  public Long getRollbackVersion() {
    return rollbackVersion;
  }

  public void setRollbackVersion(Long rollbackVersion) {
    this.rollbackVersion = rollbackVersion;
  }

  public OspSnapshot delete(String delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @Schema(description = "")
  public String getDelete() {
    return delete;
  }

  public void setDelete(String delete) {
    this.delete = delete;
  }

  public OspSnapshot type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OspSnapshot id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OspSnapshot name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspSnapshot ospSnapshot = (OspSnapshot) o;
    return Objects.equals(this.retainUntilDate, ospSnapshot.retainUntilDate) &&
        Objects.equals(this.description, ospSnapshot.description) &&
        Objects.equals(this.create, ospSnapshot.create) &&
        Objects.equals(this.update, ospSnapshot.update) &&
        Objects.equals(this.rollbackVersion, ospSnapshot.rollbackVersion) &&
        Objects.equals(this.delete, ospSnapshot.delete) &&
        Objects.equals(this.type, ospSnapshot.type) &&
        Objects.equals(this.id, ospSnapshot.id) &&
        Objects.equals(this.name, ospSnapshot.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainUntilDate, description, create, update, rollbackVersion, delete, type, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspSnapshot {\n");
    
    sb.append("    retainUntilDate: ").append(toIndentedString(retainUntilDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    rollbackVersion: ").append(toIndentedString(rollbackVersion)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
