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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.Cluster;
/**
 * HostInitialization is the model of host initialization +X:model:etcd_lock;
 */
@Schema(description = "HostInitialization is the model of host initialization +X:model:etcd_lock;")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class HostInitialization {
  @SerializedName("admin_ips")
  private List<String> adminIps = null;

  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("disable_firewalld")
  private Boolean disableFirewalld = null;

  @SerializedName("hostname_prefix")
  private String hostnamePrefix = null;

  @SerializedName("hostname_suffix_len")
  private Long hostnameSuffixLen = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("set_hostname")
  private Boolean setHostname = null;

  @SerializedName("ssh_user")
  private String sshUser = null;

  @SerializedName("status")
  private String status = null;

  public HostInitialization adminIps(List<String> adminIps) {
    this.adminIps = adminIps;
    return this;
  }

  public HostInitialization addAdminIpsItem(String adminIpsItem) {
    if (this.adminIps == null) {
      this.adminIps = new ArrayList<String>();
    }
    this.adminIps.add(adminIpsItem);
    return this;
  }

   /**
   * Get adminIps
   * @return adminIps
  **/
  @Schema(description = "")
  public List<String> getAdminIps() {
    return adminIps;
  }

  public void setAdminIps(List<String> adminIps) {
    this.adminIps = adminIps;
  }

  public HostInitialization cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public HostInitialization create(OffsetDateTime create) {
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

  public HostInitialization disableFirewalld(Boolean disableFirewalld) {
    this.disableFirewalld = disableFirewalld;
    return this;
  }

   /**
   * Get disableFirewalld
   * @return disableFirewalld
  **/
  @Schema(description = "")
  public Boolean isDisableFirewalld() {
    return disableFirewalld;
  }

  public void setDisableFirewalld(Boolean disableFirewalld) {
    this.disableFirewalld = disableFirewalld;
  }

  public HostInitialization hostnamePrefix(String hostnamePrefix) {
    this.hostnamePrefix = hostnamePrefix;
    return this;
  }

   /**
   * Get hostnamePrefix
   * @return hostnamePrefix
  **/
  @Schema(description = "")
  public String getHostnamePrefix() {
    return hostnamePrefix;
  }

  public void setHostnamePrefix(String hostnamePrefix) {
    this.hostnamePrefix = hostnamePrefix;
  }

  public HostInitialization hostnameSuffixLen(Long hostnameSuffixLen) {
    this.hostnameSuffixLen = hostnameSuffixLen;
    return this;
  }

   /**
   * Get hostnameSuffixLen
   * @return hostnameSuffixLen
  **/
  @Schema(description = "")
  public Long getHostnameSuffixLen() {
    return hostnameSuffixLen;
  }

  public void setHostnameSuffixLen(Long hostnameSuffixLen) {
    this.hostnameSuffixLen = hostnameSuffixLen;
  }

  public HostInitialization id(Long id) {
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

  public HostInitialization message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HostInitialization setHostname(Boolean setHostname) {
    this.setHostname = setHostname;
    return this;
  }

   /**
   * Get setHostname
   * @return setHostname
  **/
  @Schema(description = "")
  public Boolean isSetHostname() {
    return setHostname;
  }

  public void setSetHostname(Boolean setHostname) {
    this.setHostname = setHostname;
  }

  public HostInitialization sshUser(String sshUser) {
    this.sshUser = sshUser;
    return this;
  }

   /**
   * Get sshUser
   * @return sshUser
  **/
  @Schema(description = "")
  public String getSshUser() {
    return sshUser;
  }

  public void setSshUser(String sshUser) {
    this.sshUser = sshUser;
  }

  public HostInitialization status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostInitialization hostInitialization = (HostInitialization) o;
    return Objects.equals(this.adminIps, hostInitialization.adminIps) &&
        Objects.equals(this.cluster, hostInitialization.cluster) &&
        Objects.equals(this.create, hostInitialization.create) &&
        Objects.equals(this.disableFirewalld, hostInitialization.disableFirewalld) &&
        Objects.equals(this.hostnamePrefix, hostInitialization.hostnamePrefix) &&
        Objects.equals(this.hostnameSuffixLen, hostInitialization.hostnameSuffixLen) &&
        Objects.equals(this.id, hostInitialization.id) &&
        Objects.equals(this.message, hostInitialization.message) &&
        Objects.equals(this.setHostname, hostInitialization.setHostname) &&
        Objects.equals(this.sshUser, hostInitialization.sshUser) &&
        Objects.equals(this.status, hostInitialization.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminIps, cluster, create, disableFirewalld, hostnamePrefix, hostnameSuffixLen, id, message, setHostname, sshUser, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostInitialization {\n");
    
    sb.append("    adminIps: ").append(toIndentedString(adminIps)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    disableFirewalld: ").append(toIndentedString(disableFirewalld)).append("\n");
    sb.append("    hostnamePrefix: ").append(toIndentedString(hostnamePrefix)).append("\n");
    sb.append("    hostnameSuffixLen: ").append(toIndentedString(hostnameSuffixLen)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    setHostname: ").append(toIndentedString(setHostname)).append("\n");
    sb.append("    sshUser: ").append(toIndentedString(sshUser)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
