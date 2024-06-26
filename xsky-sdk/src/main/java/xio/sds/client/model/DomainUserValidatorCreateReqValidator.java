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
 * DomainUserValidatorCreateReqValidator
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DomainUserValidatorCreateReqValidator {
  @SerializedName("gateway_group_id")
  private Long gatewayGroupId = null;

  @SerializedName("gateway_group_type")
  private String gatewayGroupType = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("users")
  private List<String> users = null;

  public DomainUserValidatorCreateReqValidator gatewayGroupId(Long gatewayGroupId) {
    this.gatewayGroupId = gatewayGroupId;
    return this;
  }

   /**
   * Gateway Group ID
   * @return gatewayGroupId
  **/
  @Schema(description = "Gateway Group ID")
  public Long getGatewayGroupId() {
    return gatewayGroupId;
  }

  public void setGatewayGroupId(Long gatewayGroupId) {
    this.gatewayGroupId = gatewayGroupId;
  }

  public DomainUserValidatorCreateReqValidator gatewayGroupType(String gatewayGroupType) {
    this.gatewayGroupType = gatewayGroupType;
    return this;
  }

   /**
   * Gateway Group type
   * @return gatewayGroupType
  **/
  @Schema(description = "Gateway Group type")
  public String getGatewayGroupType() {
    return gatewayGroupType;
  }

  public void setGatewayGroupType(String gatewayGroupType) {
    this.gatewayGroupType = gatewayGroupType;
  }

  public DomainUserValidatorCreateReqValidator groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public DomainUserValidatorCreateReqValidator addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Domain groups
   * @return groups
  **/
  @Schema(description = "Domain groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public DomainUserValidatorCreateReqValidator type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Domain type
   * @return type
  **/
  @Schema(required = true, description = "Domain type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DomainUserValidatorCreateReqValidator users(List<String> users) {
    this.users = users;
    return this;
  }

  public DomainUserValidatorCreateReqValidator addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Domain users
   * @return users
  **/
  @Schema(description = "Domain users")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUserValidatorCreateReqValidator domainUserValidatorCreateReqValidator = (DomainUserValidatorCreateReqValidator) o;
    return Objects.equals(this.gatewayGroupId, domainUserValidatorCreateReqValidator.gatewayGroupId) &&
        Objects.equals(this.gatewayGroupType, domainUserValidatorCreateReqValidator.gatewayGroupType) &&
        Objects.equals(this.groups, domainUserValidatorCreateReqValidator.groups) &&
        Objects.equals(this.type, domainUserValidatorCreateReqValidator.type) &&
        Objects.equals(this.users, domainUserValidatorCreateReqValidator.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayGroupId, gatewayGroupType, groups, type, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUserValidatorCreateReqValidator {\n");
    
    sb.append("    gatewayGroupId: ").append(toIndentedString(gatewayGroupId)).append("\n");
    sb.append("    gatewayGroupType: ").append(toIndentedString(gatewayGroupType)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
