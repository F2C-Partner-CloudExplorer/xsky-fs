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
import xio.sds.client.model.FSActiveDirectory;
import xio.sds.client.model.FSUser;
import xio.sds.client.model.FSUserGroup;
import xio.sds.client.model.WindowsACLInheritance;
import xio.sds.client.model.WindowsACLPermission;
/**
 * DfsSMBWindowsACE
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBWindowsACE {
  @SerializedName("ace_type")
  private String aceType = null;

  @SerializedName("fs_active_directory")
  private FSActiveDirectory fsActiveDirectory = null;

  @SerializedName("fs_user_group")
  private FSUserGroup fsUserGroup = null;

  @SerializedName("inheritance")
  private WindowsACLInheritance inheritance = null;

  @SerializedName("original_permission")
  private String originalPermission = null;

  @SerializedName("permissions")
  private List<WindowsACLPermission> permissions = null;

  @SerializedName("principal")
  private String principal = null;

  @SerializedName("principal_type")
  private String principalType = null;

  @SerializedName("security_type")
  private String securityType = null;

  @SerializedName("user")
  private FSUser user = null;

  @SerializedName("user_group_name")
  private String userGroupName = null;

  @SerializedName("user_name")
  private String userName = null;

  public DfsSMBWindowsACE aceType(String aceType) {
    this.aceType = aceType;
    return this;
  }

   /**
   * Get aceType
   * @return aceType
  **/
  @Schema(description = "")
  public String getAceType() {
    return aceType;
  }

  public void setAceType(String aceType) {
    this.aceType = aceType;
  }

  public DfsSMBWindowsACE fsActiveDirectory(FSActiveDirectory fsActiveDirectory) {
    this.fsActiveDirectory = fsActiveDirectory;
    return this;
  }

   /**
   * Get fsActiveDirectory
   * @return fsActiveDirectory
  **/
  @Schema(description = "")
  public FSActiveDirectory getFsActiveDirectory() {
    return fsActiveDirectory;
  }

  public void setFsActiveDirectory(FSActiveDirectory fsActiveDirectory) {
    this.fsActiveDirectory = fsActiveDirectory;
  }

  public DfsSMBWindowsACE fsUserGroup(FSUserGroup fsUserGroup) {
    this.fsUserGroup = fsUserGroup;
    return this;
  }

   /**
   * Get fsUserGroup
   * @return fsUserGroup
  **/
  @Schema(description = "")
  public FSUserGroup getFsUserGroup() {
    return fsUserGroup;
  }

  public void setFsUserGroup(FSUserGroup fsUserGroup) {
    this.fsUserGroup = fsUserGroup;
  }

  public DfsSMBWindowsACE inheritance(WindowsACLInheritance inheritance) {
    this.inheritance = inheritance;
    return this;
  }

   /**
   * Get inheritance
   * @return inheritance
  **/
  @Schema(description = "")
  public WindowsACLInheritance getInheritance() {
    return inheritance;
  }

  public void setInheritance(WindowsACLInheritance inheritance) {
    this.inheritance = inheritance;
  }

  public DfsSMBWindowsACE originalPermission(String originalPermission) {
    this.originalPermission = originalPermission;
    return this;
  }

   /**
   * original permission is convenient in the xms-cli output
   * @return originalPermission
  **/
  @Schema(description = "original permission is convenient in the xms-cli output")
  public String getOriginalPermission() {
    return originalPermission;
  }

  public void setOriginalPermission(String originalPermission) {
    this.originalPermission = originalPermission;
  }

  public DfsSMBWindowsACE permissions(List<WindowsACLPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DfsSMBWindowsACE addPermissionsItem(WindowsACLPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<WindowsACLPermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public List<WindowsACLPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<WindowsACLPermission> permissions) {
    this.permissions = permissions;
  }

  public DfsSMBWindowsACE principal(String principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @Schema(description = "")
  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public DfsSMBWindowsACE principalType(String principalType) {
    this.principalType = principalType;
    return this;
  }

   /**
   * Get principalType
   * @return principalType
  **/
  @Schema(description = "")
  public String getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(String principalType) {
    this.principalType = principalType;
  }

  public DfsSMBWindowsACE securityType(String securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * Get securityType
   * @return securityType
  **/
  @Schema(description = "")
  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }

  public DfsSMBWindowsACE user(FSUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public FSUser getUser() {
    return user;
  }

  public void setUser(FSUser user) {
    this.user = user;
  }

  public DfsSMBWindowsACE userGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
    return this;
  }

   /**
   * Get userGroupName
   * @return userGroupName
  **/
  @Schema(description = "")
  public String getUserGroupName() {
    return userGroupName;
  }

  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }

  public DfsSMBWindowsACE userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBWindowsACE dfsSMBWindowsACE = (DfsSMBWindowsACE) o;
    return Objects.equals(this.aceType, dfsSMBWindowsACE.aceType) &&
        Objects.equals(this.fsActiveDirectory, dfsSMBWindowsACE.fsActiveDirectory) &&
        Objects.equals(this.fsUserGroup, dfsSMBWindowsACE.fsUserGroup) &&
        Objects.equals(this.inheritance, dfsSMBWindowsACE.inheritance) &&
        Objects.equals(this.originalPermission, dfsSMBWindowsACE.originalPermission) &&
        Objects.equals(this.permissions, dfsSMBWindowsACE.permissions) &&
        Objects.equals(this.principal, dfsSMBWindowsACE.principal) &&
        Objects.equals(this.principalType, dfsSMBWindowsACE.principalType) &&
        Objects.equals(this.securityType, dfsSMBWindowsACE.securityType) &&
        Objects.equals(this.user, dfsSMBWindowsACE.user) &&
        Objects.equals(this.userGroupName, dfsSMBWindowsACE.userGroupName) &&
        Objects.equals(this.userName, dfsSMBWindowsACE.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aceType, fsActiveDirectory, fsUserGroup, inheritance, originalPermission, permissions, principal, principalType, securityType, user, userGroupName, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBWindowsACE {\n");
    
    sb.append("    aceType: ").append(toIndentedString(aceType)).append("\n");
    sb.append("    fsActiveDirectory: ").append(toIndentedString(fsActiveDirectory)).append("\n");
    sb.append("    fsUserGroup: ").append(toIndentedString(fsUserGroup)).append("\n");
    sb.append("    inheritance: ").append(toIndentedString(inheritance)).append("\n");
    sb.append("    originalPermission: ").append(toIndentedString(originalPermission)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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