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
 * DfsSMBWindowsACLDeleteReqWindowsACL
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBWindowsACLDeleteReqWindowsACL {
  @SerializedName("ace_type")
  private String aceType = null;

  @SerializedName("apply_to")
  private String applyTo = null;

  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("permissions")
  private List<String> permissions = new ArrayList<String>();

  @SerializedName("principal")
  private String principal = null;

  public DfsSMBWindowsACLDeleteReqWindowsACL aceType(String aceType) {
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

  public DfsSMBWindowsACLDeleteReqWindowsACL applyTo(String applyTo) {
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

  public DfsSMBWindowsACLDeleteReqWindowsACL dfsRootfsId(Long dfsRootfsId) {
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

  public DfsSMBWindowsACLDeleteReqWindowsACL path(String path) {
    this.path = path;
    return this;
  }

   /**
   * directory path
   * @return path
  **/
  @Schema(required = true, description = "directory path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DfsSMBWindowsACLDeleteReqWindowsACL permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DfsSMBWindowsACLDeleteReqWindowsACL addPermissionsItem(String permissionsItem) {
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

  public DfsSMBWindowsACLDeleteReqWindowsACL principal(String principal) {
    this.principal = principal;
    return this;
  }

   /**
   * the entity of performing access control
   * @return principal
  **/
  @Schema(required = true, description = "the entity of performing access control")
  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBWindowsACLDeleteReqWindowsACL dfsSMBWindowsACLDeleteReqWindowsACL = (DfsSMBWindowsACLDeleteReqWindowsACL) o;
    return Objects.equals(this.aceType, dfsSMBWindowsACLDeleteReqWindowsACL.aceType) &&
        Objects.equals(this.applyTo, dfsSMBWindowsACLDeleteReqWindowsACL.applyTo) &&
        Objects.equals(this.dfsRootfsId, dfsSMBWindowsACLDeleteReqWindowsACL.dfsRootfsId) &&
        Objects.equals(this.path, dfsSMBWindowsACLDeleteReqWindowsACL.path) &&
        Objects.equals(this.permissions, dfsSMBWindowsACLDeleteReqWindowsACL.permissions) &&
        Objects.equals(this.principal, dfsSMBWindowsACLDeleteReqWindowsACL.principal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aceType, applyTo, dfsRootfsId, path, permissions, principal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBWindowsACLDeleteReqWindowsACL {\n");
    
    sb.append("    aceType: ").append(toIndentedString(aceType)).append("\n");
    sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
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
