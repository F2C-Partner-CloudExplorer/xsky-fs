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
 * DfsFTPShareACLReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsFTPShareACLReq {
  @SerializedName("admin_enabled")
  private Boolean adminEnabled = null;

  @SerializedName("create_enabled")
  private Boolean createEnabled = null;

  @SerializedName("delete_enabled")
  private Boolean deleteEnabled = null;

  @SerializedName("download_bandwidth")
  private Long downloadBandwidth = null;

  @SerializedName("download_enabled")
  private Boolean downloadEnabled = null;

  @SerializedName("fs_user_id")
  private Long fsUserId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("list_enabled")
  private Boolean listEnabled = null;

  @SerializedName("rename_enabled")
  private Boolean renameEnabled = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("upload_bandwidth")
  private Long uploadBandwidth = null;

  @SerializedName("upload_enabled")
  private Boolean uploadEnabled = null;

  public DfsFTPShareACLReq adminEnabled(Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
    return this;
  }

   /**
   * enable admin user permission
   * @return adminEnabled
  **/
  @Schema(description = "enable admin user permission")
  public Boolean isAdminEnabled() {
    return adminEnabled;
  }

  public void setAdminEnabled(Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
  }

  public DfsFTPShareACLReq createEnabled(Boolean createEnabled) {
    this.createEnabled = createEnabled;
    return this;
  }

   /**
   * enable creating files
   * @return createEnabled
  **/
  @Schema(description = "enable creating files")
  public Boolean isCreateEnabled() {
    return createEnabled;
  }

  public void setCreateEnabled(Boolean createEnabled) {
    this.createEnabled = createEnabled;
  }

  public DfsFTPShareACLReq deleteEnabled(Boolean deleteEnabled) {
    this.deleteEnabled = deleteEnabled;
    return this;
  }

   /**
   * enable deleting files
   * @return deleteEnabled
  **/
  @Schema(description = "enable deleting files")
  public Boolean isDeleteEnabled() {
    return deleteEnabled;
  }

  public void setDeleteEnabled(Boolean deleteEnabled) {
    this.deleteEnabled = deleteEnabled;
  }

  public DfsFTPShareACLReq downloadBandwidth(Long downloadBandwidth) {
    this.downloadBandwidth = downloadBandwidth;
    return this;
  }

   /**
   * max bandwidth of downloading
   * @return downloadBandwidth
  **/
  @Schema(description = "max bandwidth of downloading")
  public Long getDownloadBandwidth() {
    return downloadBandwidth;
  }

  public void setDownloadBandwidth(Long downloadBandwidth) {
    this.downloadBandwidth = downloadBandwidth;
  }

  public DfsFTPShareACLReq downloadEnabled(Boolean downloadEnabled) {
    this.downloadEnabled = downloadEnabled;
    return this;
  }

   /**
   * enable downloading files
   * @return downloadEnabled
  **/
  @Schema(description = "enable downloading files")
  public Boolean isDownloadEnabled() {
    return downloadEnabled;
  }

  public void setDownloadEnabled(Boolean downloadEnabled) {
    this.downloadEnabled = downloadEnabled;
  }

  public DfsFTPShareACLReq fsUserId(Long fsUserId) {
    this.fsUserId = fsUserId;
    return this;
  }

   /**
   * id of user
   * @return fsUserId
  **/
  @Schema(description = "id of user")
  public Long getFsUserId() {
    return fsUserId;
  }

  public void setFsUserId(Long fsUserId) {
    this.fsUserId = fsUserId;
  }

  public DfsFTPShareACLReq id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id of user group
   * @return id
  **/
  @Schema(description = "id of user group")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DfsFTPShareACLReq listEnabled(Boolean listEnabled) {
    this.listEnabled = listEnabled;
    return this;
  }

   /**
   * enable listing files
   * @return listEnabled
  **/
  @Schema(description = "enable listing files")
  public Boolean isListEnabled() {
    return listEnabled;
  }

  public void setListEnabled(Boolean listEnabled) {
    this.listEnabled = listEnabled;
  }

  public DfsFTPShareACLReq renameEnabled(Boolean renameEnabled) {
    this.renameEnabled = renameEnabled;
    return this;
  }

   /**
   * enable renaming files
   * @return renameEnabled
  **/
  @Schema(description = "enable renaming files")
  public Boolean isRenameEnabled() {
    return renameEnabled;
  }

  public void setRenameEnabled(Boolean renameEnabled) {
    this.renameEnabled = renameEnabled;
  }

  public DfsFTPShareACLReq type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of share acl
   * @return type
  **/
  @Schema(description = "type of share acl")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DfsFTPShareACLReq uploadBandwidth(Long uploadBandwidth) {
    this.uploadBandwidth = uploadBandwidth;
    return this;
  }

   /**
   * max bandwidth of uploading
   * @return uploadBandwidth
  **/
  @Schema(description = "max bandwidth of uploading")
  public Long getUploadBandwidth() {
    return uploadBandwidth;
  }

  public void setUploadBandwidth(Long uploadBandwidth) {
    this.uploadBandwidth = uploadBandwidth;
  }

  public DfsFTPShareACLReq uploadEnabled(Boolean uploadEnabled) {
    this.uploadEnabled = uploadEnabled;
    return this;
  }

   /**
   * enable uploading files
   * @return uploadEnabled
  **/
  @Schema(description = "enable uploading files")
  public Boolean isUploadEnabled() {
    return uploadEnabled;
  }

  public void setUploadEnabled(Boolean uploadEnabled) {
    this.uploadEnabled = uploadEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsFTPShareACLReq dfsFTPShareACLReq = (DfsFTPShareACLReq) o;
    return Objects.equals(this.adminEnabled, dfsFTPShareACLReq.adminEnabled) &&
        Objects.equals(this.createEnabled, dfsFTPShareACLReq.createEnabled) &&
        Objects.equals(this.deleteEnabled, dfsFTPShareACLReq.deleteEnabled) &&
        Objects.equals(this.downloadBandwidth, dfsFTPShareACLReq.downloadBandwidth) &&
        Objects.equals(this.downloadEnabled, dfsFTPShareACLReq.downloadEnabled) &&
        Objects.equals(this.fsUserId, dfsFTPShareACLReq.fsUserId) &&
        Objects.equals(this.id, dfsFTPShareACLReq.id) &&
        Objects.equals(this.listEnabled, dfsFTPShareACLReq.listEnabled) &&
        Objects.equals(this.renameEnabled, dfsFTPShareACLReq.renameEnabled) &&
        Objects.equals(this.type, dfsFTPShareACLReq.type) &&
        Objects.equals(this.uploadBandwidth, dfsFTPShareACLReq.uploadBandwidth) &&
        Objects.equals(this.uploadEnabled, dfsFTPShareACLReq.uploadEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEnabled, createEnabled, deleteEnabled, downloadBandwidth, downloadEnabled, fsUserId, id, listEnabled, renameEnabled, type, uploadBandwidth, uploadEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsFTPShareACLReq {\n");
    
    sb.append("    adminEnabled: ").append(toIndentedString(adminEnabled)).append("\n");
    sb.append("    createEnabled: ").append(toIndentedString(createEnabled)).append("\n");
    sb.append("    deleteEnabled: ").append(toIndentedString(deleteEnabled)).append("\n");
    sb.append("    downloadBandwidth: ").append(toIndentedString(downloadBandwidth)).append("\n");
    sb.append("    downloadEnabled: ").append(toIndentedString(downloadEnabled)).append("\n");
    sb.append("    fsUserId: ").append(toIndentedString(fsUserId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listEnabled: ").append(toIndentedString(listEnabled)).append("\n");
    sb.append("    renameEnabled: ").append(toIndentedString(renameEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uploadBandwidth: ").append(toIndentedString(uploadBandwidth)).append("\n");
    sb.append("    uploadEnabled: ").append(toIndentedString(uploadEnabled)).append("\n");
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
