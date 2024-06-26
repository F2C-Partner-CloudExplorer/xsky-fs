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
import xio.sds.client.model.S3Key;
import xio.sds.client.model.S3Req;
/**
 * FSUserCreateReqUser
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class FSUserCreateReqUser extends S3Req {
  @SerializedName("description")
  private String description = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("primary_group_id")
  private Long primaryGroupId = null;

  @SerializedName("user_group_ids")
  private List<Long> userGroupIds = null;

  @SerializedName("user_id")
  private Long userId = null;

  public FSUserCreateReqUser description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of file storage user
   * @return description
  **/
  @Schema(description = "description of file storage user")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FSUserCreateReqUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email of file storage user
   * @return email
  **/
  @Schema(description = "email of file storage user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FSUserCreateReqUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of file storage user
   * @return name
  **/
  @Schema(description = "name of file storage user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FSUserCreateReqUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * password of file storage user
   * @return password
  **/
  @Schema(description = "password of file storage user")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FSUserCreateReqUser primaryGroupId(Long primaryGroupId) {
    this.primaryGroupId = primaryGroupId;
    return this;
  }

   /**
   * primary group of user
   * @return primaryGroupId
  **/
  @Schema(description = "primary group of user")
  public Long getPrimaryGroupId() {
    return primaryGroupId;
  }

  public void setPrimaryGroupId(Long primaryGroupId) {
    this.primaryGroupId = primaryGroupId;
  }

  public FSUserCreateReqUser userGroupIds(List<Long> userGroupIds) {
    this.userGroupIds = userGroupIds;
    return this;
  }

  public FSUserCreateReqUser addUserGroupIdsItem(Long userGroupIdsItem) {
    if (this.userGroupIds == null) {
      this.userGroupIds = new ArrayList<Long>();
    }
    this.userGroupIds.add(userGroupIdsItem);
    return this;
  }

   /**
   * secondary group of user
   * @return userGroupIds
  **/
  @Schema(description = "secondary group of user")
  public List<Long> getUserGroupIds() {
    return userGroupIds;
  }

  public void setUserGroupIds(List<Long> userGroupIds) {
    this.userGroupIds = userGroupIds;
  }

  public FSUserCreateReqUser userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * uid of file storage user
   * @return userId
  **/
  @Schema(description = "uid of file storage user")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FSUserCreateReqUser fsUserCreateReqUser = (FSUserCreateReqUser) o;
    return Objects.equals(this.description, fsUserCreateReqUser.description) &&
        Objects.equals(this.email, fsUserCreateReqUser.email) &&
        Objects.equals(this.name, fsUserCreateReqUser.name) &&
        Objects.equals(this.password, fsUserCreateReqUser.password) &&
        Objects.equals(this.primaryGroupId, fsUserCreateReqUser.primaryGroupId) &&
        Objects.equals(this.userGroupIds, fsUserCreateReqUser.userGroupIds) &&
        Objects.equals(this.userId, fsUserCreateReqUser.userId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, email, name, password, primaryGroupId, userGroupIds, userId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FSUserCreateReqUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    primaryGroupId: ").append(toIndentedString(primaryGroupId)).append("\n");
    sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
