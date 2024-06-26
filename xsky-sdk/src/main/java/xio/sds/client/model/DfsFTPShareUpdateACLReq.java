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
 * DfsFTPShareUpdateACLReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsFTPShareUpdateACLReq {
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

  @SerializedName("id")
  private Long id = null;

  @SerializedName("list_enabled")
  private Boolean listEnabled = null;

  @SerializedName("rename_enabled")
  private Boolean renameEnabled = null;

  @SerializedName("upload_bandwidth")
  private Long uploadBandwidth = null;

  @SerializedName("upload_enabled")
  private Boolean uploadEnabled = null;

  public DfsFTPShareUpdateACLReq adminEnabled(Boolean adminEnabled) {
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

  public DfsFTPShareUpdateACLReq createEnabled(Boolean createEnabled) {
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

  public DfsFTPShareUpdateACLReq deleteEnabled(Boolean deleteEnabled) {
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

  public DfsFTPShareUpdateACLReq downloadBandwidth(Long downloadBandwidth) {
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

  public DfsFTPShareUpdateACLReq downloadEnabled(Boolean downloadEnabled) {
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

  public DfsFTPShareUpdateACLReq id(Long id) {
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

  public DfsFTPShareUpdateACLReq listEnabled(Boolean listEnabled) {
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

  public DfsFTPShareUpdateACLReq renameEnabled(Boolean renameEnabled) {
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

  public DfsFTPShareUpdateACLReq uploadBandwidth(Long uploadBandwidth) {
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

  public DfsFTPShareUpdateACLReq uploadEnabled(Boolean uploadEnabled) {
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
    DfsFTPShareUpdateACLReq dfsFTPShareUpdateACLReq = (DfsFTPShareUpdateACLReq) o;
    return Objects.equals(this.adminEnabled, dfsFTPShareUpdateACLReq.adminEnabled) &&
        Objects.equals(this.createEnabled, dfsFTPShareUpdateACLReq.createEnabled) &&
        Objects.equals(this.deleteEnabled, dfsFTPShareUpdateACLReq.deleteEnabled) &&
        Objects.equals(this.downloadBandwidth, dfsFTPShareUpdateACLReq.downloadBandwidth) &&
        Objects.equals(this.downloadEnabled, dfsFTPShareUpdateACLReq.downloadEnabled) &&
        Objects.equals(this.id, dfsFTPShareUpdateACLReq.id) &&
        Objects.equals(this.listEnabled, dfsFTPShareUpdateACLReq.listEnabled) &&
        Objects.equals(this.renameEnabled, dfsFTPShareUpdateACLReq.renameEnabled) &&
        Objects.equals(this.uploadBandwidth, dfsFTPShareUpdateACLReq.uploadBandwidth) &&
        Objects.equals(this.uploadEnabled, dfsFTPShareUpdateACLReq.uploadEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEnabled, createEnabled, deleteEnabled, downloadBandwidth, downloadEnabled, id, listEnabled, renameEnabled, uploadBandwidth, uploadEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsFTPShareUpdateACLReq {\n");
    
    sb.append("    adminEnabled: ").append(toIndentedString(adminEnabled)).append("\n");
    sb.append("    createEnabled: ").append(toIndentedString(createEnabled)).append("\n");
    sb.append("    deleteEnabled: ").append(toIndentedString(deleteEnabled)).append("\n");
    sb.append("    downloadBandwidth: ").append(toIndentedString(downloadBandwidth)).append("\n");
    sb.append("    downloadEnabled: ").append(toIndentedString(downloadEnabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listEnabled: ").append(toIndentedString(listEnabled)).append("\n");
    sb.append("    renameEnabled: ").append(toIndentedString(renameEnabled)).append("\n");
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
