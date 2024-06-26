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
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.S3LbGroupWebServiceConfig;
import xio.sds.client.model.SSLCertificateNestview;
/**
 * S3LoadBalancerGroup groups s3 load balancer with vips +X:model:etcd_lock;
 */
@Schema(description = "S3LoadBalancerGroup groups s3 load balancer with vips +X:model:etcd_lock;")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancerGroup {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("https_port")
  private Long httpsPort = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("osp_zone_id")
  private Long ospZoneId = null;

  @SerializedName("oss_api_enabled")
  private Boolean ossApiEnabled = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("search_https_port")
  private Long searchHttpsPort = null;

  @SerializedName("search_port")
  private Long searchPort = null;

  @SerializedName("ssl_certificate")
  private SSLCertificateNestview sslCertificate = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("sync_port")
  private Long syncPort = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("web_service_config")
  private S3LbGroupWebServiceConfig webServiceConfig = null;

  @SerializedName("web_service_port")
  private Long webServicePort = null;

  public S3LoadBalancerGroup actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public S3LoadBalancerGroup cluster(ClusterNestview cluster) {
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

  public S3LoadBalancerGroup create(OffsetDateTime create) {
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

  public S3LoadBalancerGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public S3LoadBalancerGroup httpsPort(Long httpsPort) {
    this.httpsPort = httpsPort;
    return this;
  }

   /**
   * Get httpsPort
   * @return httpsPort
  **/
  @Schema(description = "")
  public Long getHttpsPort() {
    return httpsPort;
  }

  public void setHttpsPort(Long httpsPort) {
    this.httpsPort = httpsPort;
  }

  public S3LoadBalancerGroup id(Long id) {
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

  public S3LoadBalancerGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public S3LoadBalancerGroup ospZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
    return this;
  }

   /**
   * Get ospZoneId
   * @return ospZoneId
  **/
  @Schema(description = "")
  public Long getOspZoneId() {
    return ospZoneId;
  }

  public void setOspZoneId(Long ospZoneId) {
    this.ospZoneId = ospZoneId;
  }

  public S3LoadBalancerGroup ossApiEnabled(Boolean ossApiEnabled) {
    this.ossApiEnabled = ossApiEnabled;
    return this;
  }

   /**
   * Get ossApiEnabled
   * @return ossApiEnabled
  **/
  @Schema(description = "")
  public Boolean isOssApiEnabled() {
    return ossApiEnabled;
  }

  public void setOssApiEnabled(Boolean ossApiEnabled) {
    this.ossApiEnabled = ossApiEnabled;
  }

  public S3LoadBalancerGroup port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public S3LoadBalancerGroup roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public S3LoadBalancerGroup addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public S3LoadBalancerGroup searchHttpsPort(Long searchHttpsPort) {
    this.searchHttpsPort = searchHttpsPort;
    return this;
  }

   /**
   * Get searchHttpsPort
   * @return searchHttpsPort
  **/
  @Schema(description = "")
  public Long getSearchHttpsPort() {
    return searchHttpsPort;
  }

  public void setSearchHttpsPort(Long searchHttpsPort) {
    this.searchHttpsPort = searchHttpsPort;
  }

  public S3LoadBalancerGroup searchPort(Long searchPort) {
    this.searchPort = searchPort;
    return this;
  }

   /**
   * Get searchPort
   * @return searchPort
  **/
  @Schema(description = "")
  public Long getSearchPort() {
    return searchPort;
  }

  public void setSearchPort(Long searchPort) {
    this.searchPort = searchPort;
  }

  public S3LoadBalancerGroup sslCertificate(SSLCertificateNestview sslCertificate) {
    this.sslCertificate = sslCertificate;
    return this;
  }

   /**
   * Get sslCertificate
   * @return sslCertificate
  **/
  @Schema(description = "")
  public SSLCertificateNestview getSslCertificate() {
    return sslCertificate;
  }

  public void setSslCertificate(SSLCertificateNestview sslCertificate) {
    this.sslCertificate = sslCertificate;
  }

  public S3LoadBalancerGroup status(String status) {
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

  public S3LoadBalancerGroup syncPort(Long syncPort) {
    this.syncPort = syncPort;
    return this;
  }

   /**
   * Get syncPort
   * @return syncPort
  **/
  @Schema(description = "")
  public Long getSyncPort() {
    return syncPort;
  }

  public void setSyncPort(Long syncPort) {
    this.syncPort = syncPort;
  }

  public S3LoadBalancerGroup update(OffsetDateTime update) {
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

  public S3LoadBalancerGroup webServiceConfig(S3LbGroupWebServiceConfig webServiceConfig) {
    this.webServiceConfig = webServiceConfig;
    return this;
  }

   /**
   * Get webServiceConfig
   * @return webServiceConfig
  **/
  @Schema(description = "")
  public S3LbGroupWebServiceConfig getWebServiceConfig() {
    return webServiceConfig;
  }

  public void setWebServiceConfig(S3LbGroupWebServiceConfig webServiceConfig) {
    this.webServiceConfig = webServiceConfig;
  }

  public S3LoadBalancerGroup webServicePort(Long webServicePort) {
    this.webServicePort = webServicePort;
    return this;
  }

   /**
   * Get webServicePort
   * @return webServicePort
  **/
  @Schema(description = "")
  public Long getWebServicePort() {
    return webServicePort;
  }

  public void setWebServicePort(Long webServicePort) {
    this.webServicePort = webServicePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancerGroup s3LoadBalancerGroup = (S3LoadBalancerGroup) o;
    return Objects.equals(this.actionStatus, s3LoadBalancerGroup.actionStatus) &&
        Objects.equals(this.cluster, s3LoadBalancerGroup.cluster) &&
        Objects.equals(this.create, s3LoadBalancerGroup.create) &&
        Objects.equals(this.description, s3LoadBalancerGroup.description) &&
        Objects.equals(this.httpsPort, s3LoadBalancerGroup.httpsPort) &&
        Objects.equals(this.id, s3LoadBalancerGroup.id) &&
        Objects.equals(this.name, s3LoadBalancerGroup.name) &&
        Objects.equals(this.ospZoneId, s3LoadBalancerGroup.ospZoneId) &&
        Objects.equals(this.ossApiEnabled, s3LoadBalancerGroup.ossApiEnabled) &&
        Objects.equals(this.port, s3LoadBalancerGroup.port) &&
        Objects.equals(this.roles, s3LoadBalancerGroup.roles) &&
        Objects.equals(this.searchHttpsPort, s3LoadBalancerGroup.searchHttpsPort) &&
        Objects.equals(this.searchPort, s3LoadBalancerGroup.searchPort) &&
        Objects.equals(this.sslCertificate, s3LoadBalancerGroup.sslCertificate) &&
        Objects.equals(this.status, s3LoadBalancerGroup.status) &&
        Objects.equals(this.syncPort, s3LoadBalancerGroup.syncPort) &&
        Objects.equals(this.update, s3LoadBalancerGroup.update) &&
        Objects.equals(this.webServiceConfig, s3LoadBalancerGroup.webServiceConfig) &&
        Objects.equals(this.webServicePort, s3LoadBalancerGroup.webServicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, create, description, httpsPort, id, name, ospZoneId, ossApiEnabled, port, roles, searchHttpsPort, searchPort, sslCertificate, status, syncPort, update, webServiceConfig, webServicePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancerGroup {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ospZoneId: ").append(toIndentedString(ospZoneId)).append("\n");
    sb.append("    ossApiEnabled: ").append(toIndentedString(ossApiEnabled)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    searchHttpsPort: ").append(toIndentedString(searchHttpsPort)).append("\n");
    sb.append("    searchPort: ").append(toIndentedString(searchPort)).append("\n");
    sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    syncPort: ").append(toIndentedString(syncPort)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    webServiceConfig: ").append(toIndentedString(webServiceConfig)).append("\n");
    sb.append("    webServicePort: ").append(toIndentedString(webServicePort)).append("\n");
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
