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
import xio.sds.client.model.HostNestview;
import xio.sds.client.model.SSLCertificateNestview;
/**
 * Service defines basic install task, used to as API +X:model:generate&#x3D;UD
 */
@Schema(description = "Service defines basic install task, used to as API +X:model:generate=UD")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class Service {
  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("heartbeat")
  private OffsetDateTime heartbeat = null;

  @SerializedName("host")
  private HostNestview host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("pid")
  private Integer pid = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("ssl_certificate")
  private SSLCertificateNestview sslCertificate = null;

  @SerializedName("started_time")
  private OffsetDateTime startedTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("up")
  private Boolean up = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public Service cluster(ClusterNestview cluster) {
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

  public Service create(OffsetDateTime create) {
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

  public Service enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Service etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * Get etag
   * @return etag
  **/
  @Schema(description = "")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Service heartbeat(OffsetDateTime heartbeat) {
    this.heartbeat = heartbeat;
    return this;
  }

   /**
   * Get heartbeat
   * @return heartbeat
  **/
  @Schema(description = "")
  public OffsetDateTime getHeartbeat() {
    return heartbeat;
  }

  public void setHeartbeat(OffsetDateTime heartbeat) {
    this.heartbeat = heartbeat;
  }

  public Service host(HostNestview host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public HostNestview getHost() {
    return host;
  }

  public void setHost(HostNestview host) {
    this.host = host;
  }

  public Service id(Long id) {
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

  public Service name(String name) {
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

  public Service pid(Integer pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @Schema(description = "")
  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public Service primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @Schema(description = "")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Service sslCertificate(SSLCertificateNestview sslCertificate) {
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

  public Service startedTime(OffsetDateTime startedTime) {
    this.startedTime = startedTime;
    return this;
  }

   /**
   * Get startedTime
   * @return startedTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartedTime() {
    return startedTime;
  }

  public void setStartedTime(OffsetDateTime startedTime) {
    this.startedTime = startedTime;
  }

  public Service status(String status) {
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

  public Service type(String type) {
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

  public Service up(Boolean up) {
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @Schema(description = "")
  public Boolean isUp() {
    return up;
  }

  public void setUp(Boolean up) {
    this.up = up;
  }

  public Service update(OffsetDateTime update) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.cluster, service.cluster) &&
        Objects.equals(this.create, service.create) &&
        Objects.equals(this.enabled, service.enabled) &&
        Objects.equals(this.etag, service.etag) &&
        Objects.equals(this.heartbeat, service.heartbeat) &&
        Objects.equals(this.host, service.host) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.pid, service.pid) &&
        Objects.equals(this.primary, service.primary) &&
        Objects.equals(this.sslCertificate, service.sslCertificate) &&
        Objects.equals(this.startedTime, service.startedTime) &&
        Objects.equals(this.status, service.status) &&
        Objects.equals(this.type, service.type) &&
        Objects.equals(this.up, service.up) &&
        Objects.equals(this.update, service.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, enabled, etag, heartbeat, host, id, name, pid, primary, sslCertificate, startedTime, status, type, up, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
    sb.append("    startedTime: ").append(toIndentedString(startedTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
