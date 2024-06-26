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
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.DfsFTPShareNestview;
import xio.sds.client.model.FSUserNestview;
/**
 * DfsFTPShareACL defines model of dfs ftp share ACL +X:model:generate;order_by&#x3D;-ID +X:benchmark:
 */
@Schema(description = "DfsFTPShareACL defines model of dfs ftp share ACL +X:model:generate;order_by=-ID +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsFTPShareACL {
  @SerializedName("admin_enabled")
  private Boolean adminEnabled = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("create_enabled")
  private Boolean createEnabled = null;

  @SerializedName("delete_enabled")
  private Boolean deleteEnabled = null;

  @SerializedName("dfs_ftp_share")
  private DfsFTPShareNestview dfsFtpShare = null;

  @SerializedName("download_bandwidth")
  private Long downloadBandwidth = null;

  @SerializedName("download_enabled")
  private Boolean downloadEnabled = null;

  @SerializedName("fs_user")
  private FSUserNestview fsUser = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("list_enabled")
  private Boolean listEnabled = null;

  @SerializedName("rename_enabled")
  private Boolean renameEnabled = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("upload_bandwidth")
  private Long uploadBandwidth = null;

  @SerializedName("upload_enabled")
  private Boolean uploadEnabled = null;

  public DfsFTPShareACL adminEnabled(Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
    return this;
  }

   /**
   * Get adminEnabled
   * @return adminEnabled
  **/
  @Schema(description = "")
  public Boolean isAdminEnabled() {
    return adminEnabled;
  }

  public void setAdminEnabled(Boolean adminEnabled) {
    this.adminEnabled = adminEnabled;
  }

  public DfsFTPShareACL cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public DfsFTPShareACL create(OffsetDateTime create) {
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

  public DfsFTPShareACL createEnabled(Boolean createEnabled) {
    this.createEnabled = createEnabled;
    return this;
  }

   /**
   * Get createEnabled
   * @return createEnabled
  **/
  @Schema(description = "")
  public Boolean isCreateEnabled() {
    return createEnabled;
  }

  public void setCreateEnabled(Boolean createEnabled) {
    this.createEnabled = createEnabled;
  }

  public DfsFTPShareACL deleteEnabled(Boolean deleteEnabled) {
    this.deleteEnabled = deleteEnabled;
    return this;
  }

   /**
   * Get deleteEnabled
   * @return deleteEnabled
  **/
  @Schema(description = "")
  public Boolean isDeleteEnabled() {
    return deleteEnabled;
  }

  public void setDeleteEnabled(Boolean deleteEnabled) {
    this.deleteEnabled = deleteEnabled;
  }

  public DfsFTPShareACL dfsFtpShare(DfsFTPShareNestview dfsFtpShare) {
    this.dfsFtpShare = dfsFtpShare;
    return this;
  }

   /**
   * Get dfsFtpShare
   * @return dfsFtpShare
  **/
  @Schema(description = "")
  public DfsFTPShareNestview getDfsFtpShare() {
    return dfsFtpShare;
  }

  public void setDfsFtpShare(DfsFTPShareNestview dfsFtpShare) {
    this.dfsFtpShare = dfsFtpShare;
  }

  public DfsFTPShareACL downloadBandwidth(Long downloadBandwidth) {
    this.downloadBandwidth = downloadBandwidth;
    return this;
  }

   /**
   * Get downloadBandwidth
   * @return downloadBandwidth
  **/
  @Schema(description = "")
  public Long getDownloadBandwidth() {
    return downloadBandwidth;
  }

  public void setDownloadBandwidth(Long downloadBandwidth) {
    this.downloadBandwidth = downloadBandwidth;
  }

  public DfsFTPShareACL downloadEnabled(Boolean downloadEnabled) {
    this.downloadEnabled = downloadEnabled;
    return this;
  }

   /**
   * Get downloadEnabled
   * @return downloadEnabled
  **/
  @Schema(description = "")
  public Boolean isDownloadEnabled() {
    return downloadEnabled;
  }

  public void setDownloadEnabled(Boolean downloadEnabled) {
    this.downloadEnabled = downloadEnabled;
  }

  public DfsFTPShareACL fsUser(FSUserNestview fsUser) {
    this.fsUser = fsUser;
    return this;
  }

   /**
   * Get fsUser
   * @return fsUser
  **/
  @Schema(description = "")
  public FSUserNestview getFsUser() {
    return fsUser;
  }

  public void setFsUser(FSUserNestview fsUser) {
    this.fsUser = fsUser;
  }

  public DfsFTPShareACL id(Long id) {
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

  public DfsFTPShareACL listEnabled(Boolean listEnabled) {
    this.listEnabled = listEnabled;
    return this;
  }

   /**
   * Get listEnabled
   * @return listEnabled
  **/
  @Schema(description = "")
  public Boolean isListEnabled() {
    return listEnabled;
  }

  public void setListEnabled(Boolean listEnabled) {
    this.listEnabled = listEnabled;
  }

  public DfsFTPShareACL renameEnabled(Boolean renameEnabled) {
    this.renameEnabled = renameEnabled;
    return this;
  }

   /**
   * Get renameEnabled
   * @return renameEnabled
  **/
  @Schema(description = "")
  public Boolean isRenameEnabled() {
    return renameEnabled;
  }

  public void setRenameEnabled(Boolean renameEnabled) {
    this.renameEnabled = renameEnabled;
  }

  public DfsFTPShareACL type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DfsFTPShareACL update(OffsetDateTime update) {
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

  public DfsFTPShareACL uploadBandwidth(Long uploadBandwidth) {
    this.uploadBandwidth = uploadBandwidth;
    return this;
  }

   /**
   * Get uploadBandwidth
   * @return uploadBandwidth
  **/
  @Schema(description = "")
  public Long getUploadBandwidth() {
    return uploadBandwidth;
  }

  public void setUploadBandwidth(Long uploadBandwidth) {
    this.uploadBandwidth = uploadBandwidth;
  }

  public DfsFTPShareACL uploadEnabled(Boolean uploadEnabled) {
    this.uploadEnabled = uploadEnabled;
    return this;
  }

   /**
   * Get uploadEnabled
   * @return uploadEnabled
  **/
  @Schema(description = "")
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
    DfsFTPShareACL dfsFTPShareACL = (DfsFTPShareACL) o;
    return Objects.equals(this.adminEnabled, dfsFTPShareACL.adminEnabled) &&
        Objects.equals(this.cluster, dfsFTPShareACL.cluster) &&
        Objects.equals(this.create, dfsFTPShareACL.create) &&
        Objects.equals(this.createEnabled, dfsFTPShareACL.createEnabled) &&
        Objects.equals(this.deleteEnabled, dfsFTPShareACL.deleteEnabled) &&
        Objects.equals(this.dfsFtpShare, dfsFTPShareACL.dfsFtpShare) &&
        Objects.equals(this.downloadBandwidth, dfsFTPShareACL.downloadBandwidth) &&
        Objects.equals(this.downloadEnabled, dfsFTPShareACL.downloadEnabled) &&
        Objects.equals(this.fsUser, dfsFTPShareACL.fsUser) &&
        Objects.equals(this.id, dfsFTPShareACL.id) &&
        Objects.equals(this.listEnabled, dfsFTPShareACL.listEnabled) &&
        Objects.equals(this.renameEnabled, dfsFTPShareACL.renameEnabled) &&
        Objects.equals(this.type, dfsFTPShareACL.type) &&
        Objects.equals(this.update, dfsFTPShareACL.update) &&
        Objects.equals(this.uploadBandwidth, dfsFTPShareACL.uploadBandwidth) &&
        Objects.equals(this.uploadEnabled, dfsFTPShareACL.uploadEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminEnabled, cluster, create, createEnabled, deleteEnabled, dfsFtpShare, downloadBandwidth, downloadEnabled, fsUser, id, listEnabled, renameEnabled, type, update, uploadBandwidth, uploadEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsFTPShareACL {\n");
    
    sb.append("    adminEnabled: ").append(toIndentedString(adminEnabled)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    createEnabled: ").append(toIndentedString(createEnabled)).append("\n");
    sb.append("    deleteEnabled: ").append(toIndentedString(deleteEnabled)).append("\n");
    sb.append("    dfsFtpShare: ").append(toIndentedString(dfsFtpShare)).append("\n");
    sb.append("    downloadBandwidth: ").append(toIndentedString(downloadBandwidth)).append("\n");
    sb.append("    downloadEnabled: ").append(toIndentedString(downloadEnabled)).append("\n");
    sb.append("    fsUser: ").append(toIndentedString(fsUser)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listEnabled: ").append(toIndentedString(listEnabled)).append("\n");
    sb.append("    renameEnabled: ").append(toIndentedString(renameEnabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
