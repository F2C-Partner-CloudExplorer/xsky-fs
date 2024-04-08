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
import xio.sds.client.model.DfsSMBShareACLReq;
/**
 * DfsSMBShareCreateReqShare
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBShareCreateReqShare {
  @SerializedName("access_based_share_enum")
  private Boolean accessBasedShareEnum = null;

  @SerializedName("acl_inherited")
  private Boolean aclInherited = null;

  @SerializedName("case_sensitive")
  private Boolean caseSensitive = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dfs_gateway_group_id")
  private Long dfsGatewayGroupId = null;

  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("dfs_smb_share_acls")
  private List<DfsSMBShareACLReq> dfsSmbShareAcls = null;

  @SerializedName("hosts_allow")
  private String hostsAllow = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("oplocks")
  private Boolean oplocks = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("recycled")
  private Boolean recycled = null;

  @SerializedName("windows_acl")
  private Boolean windowsAcl = null;

  public DfsSMBShareCreateReqShare accessBasedShareEnum(Boolean accessBasedShareEnum) {
    this.accessBasedShareEnum = accessBasedShareEnum;
    return this;
  }

   /**
   * smb access-based-share-enum enable
   * @return accessBasedShareEnum
  **/
  @Schema(description = "smb access-based-share-enum enable")
  public Boolean isAccessBasedShareEnum() {
    return accessBasedShareEnum;
  }

  public void setAccessBasedShareEnum(Boolean accessBasedShareEnum) {
    this.accessBasedShareEnum = accessBasedShareEnum;
  }

  public DfsSMBShareCreateReqShare aclInherited(Boolean aclInherited) {
    this.aclInherited = aclInherited;
    return this;
  }

   /**
   * default acl status
   * @return aclInherited
  **/
  @Schema(description = "default acl status")
  public Boolean isAclInherited() {
    return aclInherited;
  }

  public void setAclInherited(Boolean aclInherited) {
    this.aclInherited = aclInherited;
  }

  public DfsSMBShareCreateReqShare caseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * case sensitive
   * @return caseSensitive
  **/
  @Schema(description = "case sensitive")
  public Boolean isCaseSensitive() {
    return caseSensitive;
  }

  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }

  public DfsSMBShareCreateReqShare description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of share
   * @return description
  **/
  @Schema(description = "description of share")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DfsSMBShareCreateReqShare dfsGatewayGroupId(Long dfsGatewayGroupId) {
    this.dfsGatewayGroupId = dfsGatewayGroupId;
    return this;
  }

   /**
   * gateway group id
   * @return dfsGatewayGroupId
  **/
  @Schema(description = "gateway group id")
  public Long getDfsGatewayGroupId() {
    return dfsGatewayGroupId;
  }

  public void setDfsGatewayGroupId(Long dfsGatewayGroupId) {
    this.dfsGatewayGroupId = dfsGatewayGroupId;
  }

  public DfsSMBShareCreateReqShare dfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
    return this;
  }

   /**
   * rootfs id
   * @return dfsRootfsId
  **/
  @Schema(required = true, description = "rootfs id")
  public Long getDfsRootfsId() {
    return dfsRootfsId;
  }

  public void setDfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
  }

  public DfsSMBShareCreateReqShare dfsSmbShareAcls(List<DfsSMBShareACLReq> dfsSmbShareAcls) {
    this.dfsSmbShareAcls = dfsSmbShareAcls;
    return this;
  }

  public DfsSMBShareCreateReqShare addDfsSmbShareAclsItem(DfsSMBShareACLReq dfsSmbShareAclsItem) {
    if (this.dfsSmbShareAcls == null) {
      this.dfsSmbShareAcls = new ArrayList<DfsSMBShareACLReq>();
    }
    this.dfsSmbShareAcls.add(dfsSmbShareAclsItem);
    return this;
  }

   /**
   * access control array
   * @return dfsSmbShareAcls
  **/
  @Schema(description = "access control array")
  public List<DfsSMBShareACLReq> getDfsSmbShareAcls() {
    return dfsSmbShareAcls;
  }

  public void setDfsSmbShareAcls(List<DfsSMBShareACLReq> dfsSmbShareAcls) {
    this.dfsSmbShareAcls = dfsSmbShareAcls;
  }

  public DfsSMBShareCreateReqShare hostsAllow(String hostsAllow) {
    this.hostsAllow = hostsAllow;
    return this;
  }

   /**
   * allow ips in share
   * @return hostsAllow
  **/
  @Schema(description = "allow ips in share")
  public String getHostsAllow() {
    return hostsAllow;
  }

  public void setHostsAllow(String hostsAllow) {
    this.hostsAllow = hostsAllow;
  }

  public DfsSMBShareCreateReqShare name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of share
   * @return name
  **/
  @Schema(required = true, description = "name of share")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DfsSMBShareCreateReqShare oplocks(Boolean oplocks) {
    this.oplocks = oplocks;
    return this;
  }

   /**
   * smb oplocks enable
   * @return oplocks
  **/
  @Schema(description = "smb oplocks enable")
  public Boolean isOplocks() {
    return oplocks;
  }

  public void setOplocks(Boolean oplocks) {
    this.oplocks = oplocks;
  }

  public DfsSMBShareCreateReqShare path(String path) {
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

  public DfsSMBShareCreateReqShare recycled(Boolean recycled) {
    this.recycled = recycled;
    return this;
  }

   /**
   * recycle status
   * @return recycled
  **/
  @Schema(description = "recycle status")
  public Boolean isRecycled() {
    return recycled;
  }

  public void setRecycled(Boolean recycled) {
    this.recycled = recycled;
  }

  public DfsSMBShareCreateReqShare windowsAcl(Boolean windowsAcl) {
    this.windowsAcl = windowsAcl;
    return this;
  }

   /**
   * windows acl status
   * @return windowsAcl
  **/
  @Schema(description = "windows acl status")
  public Boolean isWindowsAcl() {
    return windowsAcl;
  }

  public void setWindowsAcl(Boolean windowsAcl) {
    this.windowsAcl = windowsAcl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBShareCreateReqShare dfsSMBShareCreateReqShare = (DfsSMBShareCreateReqShare) o;
    return Objects.equals(this.accessBasedShareEnum, dfsSMBShareCreateReqShare.accessBasedShareEnum) &&
        Objects.equals(this.aclInherited, dfsSMBShareCreateReqShare.aclInherited) &&
        Objects.equals(this.caseSensitive, dfsSMBShareCreateReqShare.caseSensitive) &&
        Objects.equals(this.description, dfsSMBShareCreateReqShare.description) &&
        Objects.equals(this.dfsGatewayGroupId, dfsSMBShareCreateReqShare.dfsGatewayGroupId) &&
        Objects.equals(this.dfsRootfsId, dfsSMBShareCreateReqShare.dfsRootfsId) &&
        Objects.equals(this.dfsSmbShareAcls, dfsSMBShareCreateReqShare.dfsSmbShareAcls) &&
        Objects.equals(this.hostsAllow, dfsSMBShareCreateReqShare.hostsAllow) &&
        Objects.equals(this.name, dfsSMBShareCreateReqShare.name) &&
        Objects.equals(this.oplocks, dfsSMBShareCreateReqShare.oplocks) &&
        Objects.equals(this.path, dfsSMBShareCreateReqShare.path) &&
        Objects.equals(this.recycled, dfsSMBShareCreateReqShare.recycled) &&
        Objects.equals(this.windowsAcl, dfsSMBShareCreateReqShare.windowsAcl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessBasedShareEnum, aclInherited, caseSensitive, description, dfsGatewayGroupId, dfsRootfsId, dfsSmbShareAcls, hostsAllow, name, oplocks, path, recycled, windowsAcl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBShareCreateReqShare {\n");
    
    sb.append("    accessBasedShareEnum: ").append(toIndentedString(accessBasedShareEnum)).append("\n");
    sb.append("    aclInherited: ").append(toIndentedString(aclInherited)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dfsGatewayGroupId: ").append(toIndentedString(dfsGatewayGroupId)).append("\n");
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    dfsSmbShareAcls: ").append(toIndentedString(dfsSmbShareAcls)).append("\n");
    sb.append("    hostsAllow: ").append(toIndentedString(hostsAllow)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oplocks: ").append(toIndentedString(oplocks)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    recycled: ").append(toIndentedString(recycled)).append("\n");
    sb.append("    windowsAcl: ").append(toIndentedString(windowsAcl)).append("\n");
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