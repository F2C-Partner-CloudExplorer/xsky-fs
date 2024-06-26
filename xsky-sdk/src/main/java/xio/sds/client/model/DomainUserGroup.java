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
import xio.sds.client.model.FSActiveDirectory;
import xio.sds.client.model.FSLdap;
/**
 * DomainUserGroup defines model of domain user group +X:model:generate +X:benchmark:
 */
@Schema(description = "DomainUserGroup defines model of domain user group +X:model:generate +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DomainUserGroup {
  @SerializedName("ad")
  private FSActiveDirectory ad = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ldap")
  private FSLdap ldap = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("security")
  private String security = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("user_group_id")
  private Long userGroupId = null;

  public DomainUserGroup ad(FSActiveDirectory ad) {
    this.ad = ad;
    return this;
  }

   /**
   * Get ad
   * @return ad
  **/
  @Schema(description = "")
  public FSActiveDirectory getAd() {
    return ad;
  }

  public void setAd(FSActiveDirectory ad) {
    this.ad = ad;
  }

  public DomainUserGroup create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public DomainUserGroup description(String description) {
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

  public DomainUserGroup id(Long id) {
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

  public DomainUserGroup ldap(FSLdap ldap) {
    this.ldap = ldap;
    return this;
  }

   /**
   * Get ldap
   * @return ldap
  **/
  @Schema(description = "")
  public FSLdap getLdap() {
    return ldap;
  }

  public void setLdap(FSLdap ldap) {
    this.ldap = ldap;
  }

  public DomainUserGroup name(String name) {
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

  public DomainUserGroup security(String security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @Schema(description = "")
  public String getSecurity() {
    return security;
  }

  public void setSecurity(String security) {
    this.security = security;
  }

  public DomainUserGroup update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public DomainUserGroup userGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

   /**
   * Get userGroupId
   * @return userGroupId
  **/
  @Schema(description = "")
  public Long getUserGroupId() {
    return userGroupId;
  }

  public void setUserGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUserGroup domainUserGroup = (DomainUserGroup) o;
    return Objects.equals(this.ad, domainUserGroup.ad) &&
        Objects.equals(this.create, domainUserGroup.create) &&
        Objects.equals(this.description, domainUserGroup.description) &&
        Objects.equals(this.id, domainUserGroup.id) &&
        Objects.equals(this.ldap, domainUserGroup.ldap) &&
        Objects.equals(this.name, domainUserGroup.name) &&
        Objects.equals(this.security, domainUserGroup.security) &&
        Objects.equals(this.update, domainUserGroup.update) &&
        Objects.equals(this.userGroupId, domainUserGroup.userGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ad, create, description, id, ldap, name, security, update, userGroupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUserGroup {\n");
    
    sb.append("    ad: ").append(toIndentedString(ad)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
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
