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
 * DfsSMBWindowsACLCreateReqWindowsACL
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBWindowsACLCreateReqWindowsACL {
  @SerializedName("ace_type")
  private String aceType = null;

  @SerializedName("apply_to")
  private String applyTo = null;

  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("fs_active_directory_id")
  private Long fsActiveDirectoryId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("permissions")
  private List<String> permissions = new ArrayList<String>();

  @SerializedName("principal_type")
  private String principalType = null;

  @SerializedName("security_type")
  private String securityType = null;

  @SerializedName("user_group_id")
  private Long userGroupId = null;

  @SerializedName("user_group_name")
  private String userGroupName = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("username")
  private String username = null;

  public DfsSMBWindowsACLCreateReqWindowsACL aceType(String aceType) {
    this.aceType = aceType;
    return this;
  }

   /**
   * type of acl, allowed or denied
   * @return aceType
  **/
  @Schema(required = true, description = "type of acl, allowed or denied")
  public String getAceType() {
    return aceType;
  }

  public void setAceType(String aceType) {
    this.aceType = aceType;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL applyTo(String applyTo) {
    this.applyTo = applyTo;
    return this;
  }

   /**
   * inherited information
   * @return applyTo
  **/
  @Schema(required = true, description = "inherited information")
  public String getApplyTo() {
    return applyTo;
  }

  public void setApplyTo(String applyTo) {
    this.applyTo = applyTo;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL dfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
    return this;
  }

   /**
   * id of rootfs
   * @return dfsRootfsId
  **/
  @Schema(required = true, description = "id of rootfs")
  public Long getDfsRootfsId() {
    return dfsRootfsId;
  }

  public void setDfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL fsActiveDirectoryId(Long fsActiveDirectoryId) {
    this.fsActiveDirectoryId = fsActiveDirectoryId;
    return this;
  }

   /**
   * fs active directory id
   * @return fsActiveDirectoryId
  **/
  @Schema(description = "fs active directory id")
  public Long getFsActiveDirectoryId() {
    return fsActiveDirectoryId;
  }

  public void setFsActiveDirectoryId(Long fsActiveDirectoryId) {
    this.fsActiveDirectoryId = fsActiveDirectoryId;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL path(String path) {
    this.path = path;
    return this;
  }

   /**
   * subdirectory or sub file of share path
   * @return path
  **/
  @Schema(required = true, description = "subdirectory or sub file of share path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * principal access permissions
   * @return permissions
  **/
  @Schema(required = true, description = "principal access permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL principalType(String principalType) {
    this.principalType = principalType;
    return this;
  }

   /**
   * principal type such as Everyone, user, user_group
   * @return principalType
  **/
  @Schema(required = true, description = "principal type such as Everyone, user, user_group")
  public String getPrincipalType() {
    return principalType;
  }

  public void setPrincipalType(String principalType) {
    this.principalType = principalType;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL securityType(String securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * security type like local, ad
   * @return securityType
  **/
  @Schema(required = true, description = "security type like local, ad")
  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL userGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
    return this;
  }

   /**
   * local fs user group id
   * @return userGroupId
  **/
  @Schema(description = "local fs user group id")
  public Long getUserGroupId() {
    return userGroupId;
  }

  public void setUserGroupId(Long userGroupId) {
    this.userGroupId = userGroupId;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL userGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
    return this;
  }

   /**
   * domain user_group_name
   * @return userGroupName
  **/
  @Schema(description = "domain user_group_name")
  public String getUserGroupName() {
    return userGroupName;
  }

  public void setUserGroupName(String userGroupName) {
    this.userGroupName = userGroupName;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * local fs user id
   * @return userId
  **/
  @Schema(description = "local fs user id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public DfsSMBWindowsACLCreateReqWindowsACL username(String username) {
    this.username = username;
    return this;
  }

   /**
   * domain username
   * @return username
  **/
  @Schema(description = "domain username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBWindowsACLCreateReqWindowsACL dfsSMBWindowsACLCreateReqWindowsACL = (DfsSMBWindowsACLCreateReqWindowsACL) o;
    return Objects.equals(this.aceType, dfsSMBWindowsACLCreateReqWindowsACL.aceType) &&
        Objects.equals(this.applyTo, dfsSMBWindowsACLCreateReqWindowsACL.applyTo) &&
        Objects.equals(this.dfsRootfsId, dfsSMBWindowsACLCreateReqWindowsACL.dfsRootfsId) &&
        Objects.equals(this.fsActiveDirectoryId, dfsSMBWindowsACLCreateReqWindowsACL.fsActiveDirectoryId) &&
        Objects.equals(this.path, dfsSMBWindowsACLCreateReqWindowsACL.path) &&
        Objects.equals(this.permissions, dfsSMBWindowsACLCreateReqWindowsACL.permissions) &&
        Objects.equals(this.principalType, dfsSMBWindowsACLCreateReqWindowsACL.principalType) &&
        Objects.equals(this.securityType, dfsSMBWindowsACLCreateReqWindowsACL.securityType) &&
        Objects.equals(this.userGroupId, dfsSMBWindowsACLCreateReqWindowsACL.userGroupId) &&
        Objects.equals(this.userGroupName, dfsSMBWindowsACLCreateReqWindowsACL.userGroupName) &&
        Objects.equals(this.userId, dfsSMBWindowsACLCreateReqWindowsACL.userId) &&
        Objects.equals(this.username, dfsSMBWindowsACLCreateReqWindowsACL.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aceType, applyTo, dfsRootfsId, fsActiveDirectoryId, path, permissions, principalType, securityType, userGroupId, userGroupName, userId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBWindowsACLCreateReqWindowsACL {\n");
    
    sb.append("    aceType: ").append(toIndentedString(aceType)).append("\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    fsActiveDirectoryId: ").append(toIndentedString(fsActiveDirectoryId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    principalType: ").append(toIndentedString(principalType)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
