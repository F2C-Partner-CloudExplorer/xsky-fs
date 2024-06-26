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
import xio.sds.client.model.IdentityPlatformNestview;
/**
 * RoleMapping defines role mappings for auth
 */
@Schema(description = "RoleMapping defines role mappings for auth")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RoleMapping {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("identity_platform")
  private IdentityPlatformNestview identityPlatform = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("value")
  private String value = null;

  public RoleMapping create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * time of creating identity platform
   * @return create
  **/
  @Schema(description = "time of creating identity platform")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public RoleMapping _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public RoleMapping id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id of role mapping
   * @return id
  **/
  @Schema(description = "id of role mapping")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RoleMapping identityPlatform(IdentityPlatformNestview identityPlatform) {
    this.identityPlatform = identityPlatform;
    return this;
  }

   /**
   * Get identityPlatform
   * @return identityPlatform
  **/
  @Schema(description = "")
  public IdentityPlatformNestview getIdentityPlatform() {
    return identityPlatform;
  }

  public void setIdentityPlatform(IdentityPlatformNestview identityPlatform) {
    this.identityPlatform = identityPlatform;
  }

  public RoleMapping role(String role) {
    this.role = role;
    return this;
  }

   /**
   * mapped role of sds platform
   * @return role
  **/
  @Schema(description = "mapped role of sds platform")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RoleMapping update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * time of updating identity platform
   * @return update
  **/
  @Schema(description = "time of updating identity platform")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public RoleMapping value(String value) {
    this.value = value;
    return this;
  }

   /**
   * roles of external identity platform
   * @return value
  **/
  @Schema(description = "roles of external identity platform")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleMapping roleMapping = (RoleMapping) o;
    return Objects.equals(this.create, roleMapping.create) &&
        Objects.equals(this._default, roleMapping._default) &&
        Objects.equals(this.id, roleMapping.id) &&
        Objects.equals(this.identityPlatform, roleMapping.identityPlatform) &&
        Objects.equals(this.role, roleMapping.role) &&
        Objects.equals(this.update, roleMapping.update) &&
        Objects.equals(this.value, roleMapping.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, _default, id, identityPlatform, role, update, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleMapping {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityPlatform: ").append(toIndentedString(identityPlatform)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
