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
/**
 * RemoteCluster remote clusters communicated via public API
 */
@Schema(description = "RemoteCluster remote clusters communicated via public API")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RemoteCluster {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("block_replication_num")
  private Long blockReplicationNum = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("fs_id")
  private String fsId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("os_zone_num")
  private Long osZoneNum = null;

  @SerializedName("remote_cluster_id")
  private Long remoteClusterId = null;

  @SerializedName("snapshot_replication_num")
  private Long snapshotReplicationNum = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("version")
  private String version = null;

  public RemoteCluster accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @Schema(description = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public RemoteCluster blockReplicationNum(Long blockReplicationNum) {
    this.blockReplicationNum = blockReplicationNum;
    return this;
  }

   /**
   * Get blockReplicationNum
   * @return blockReplicationNum
  **/
  @Schema(description = "")
  public Long getBlockReplicationNum() {
    return blockReplicationNum;
  }

  public void setBlockReplicationNum(Long blockReplicationNum) {
    this.blockReplicationNum = blockReplicationNum;
  }

  public RemoteCluster connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @Schema(description = "")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public RemoteCluster create(OffsetDateTime create) {
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

  public RemoteCluster fsId(String fsId) {
    this.fsId = fsId;
    return this;
  }

   /**
   * Get fsId
   * @return fsId
  **/
  @Schema(description = "")
  public String getFsId() {
    return fsId;
  }

  public void setFsId(String fsId) {
    this.fsId = fsId;
  }

  public RemoteCluster id(Long id) {
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

  public RemoteCluster name(String name) {
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

  public RemoteCluster osZoneNum(Long osZoneNum) {
    this.osZoneNum = osZoneNum;
    return this;
  }

   /**
   * Get osZoneNum
   * @return osZoneNum
  **/
  @Schema(description = "")
  public Long getOsZoneNum() {
    return osZoneNum;
  }

  public void setOsZoneNum(Long osZoneNum) {
    this.osZoneNum = osZoneNum;
  }

  public RemoteCluster remoteClusterId(Long remoteClusterId) {
    this.remoteClusterId = remoteClusterId;
    return this;
  }

   /**
   * Get remoteClusterId
   * @return remoteClusterId
  **/
  @Schema(description = "")
  public Long getRemoteClusterId() {
    return remoteClusterId;
  }

  public void setRemoteClusterId(Long remoteClusterId) {
    this.remoteClusterId = remoteClusterId;
  }

  public RemoteCluster snapshotReplicationNum(Long snapshotReplicationNum) {
    this.snapshotReplicationNum = snapshotReplicationNum;
    return this;
  }

   /**
   * Get snapshotReplicationNum
   * @return snapshotReplicationNum
  **/
  @Schema(description = "")
  public Long getSnapshotReplicationNum() {
    return snapshotReplicationNum;
  }

  public void setSnapshotReplicationNum(Long snapshotReplicationNum) {
    this.snapshotReplicationNum = snapshotReplicationNum;
  }

  public RemoteCluster status(String status) {
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

  public RemoteCluster update(OffsetDateTime update) {
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

  public RemoteCluster url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RemoteCluster version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteCluster remoteCluster = (RemoteCluster) o;
    return Objects.equals(this.accessToken, remoteCluster.accessToken) &&
        Objects.equals(this.blockReplicationNum, remoteCluster.blockReplicationNum) &&
        Objects.equals(this.connected, remoteCluster.connected) &&
        Objects.equals(this.create, remoteCluster.create) &&
        Objects.equals(this.fsId, remoteCluster.fsId) &&
        Objects.equals(this.id, remoteCluster.id) &&
        Objects.equals(this.name, remoteCluster.name) &&
        Objects.equals(this.osZoneNum, remoteCluster.osZoneNum) &&
        Objects.equals(this.remoteClusterId, remoteCluster.remoteClusterId) &&
        Objects.equals(this.snapshotReplicationNum, remoteCluster.snapshotReplicationNum) &&
        Objects.equals(this.status, remoteCluster.status) &&
        Objects.equals(this.update, remoteCluster.update) &&
        Objects.equals(this.url, remoteCluster.url) &&
        Objects.equals(this.version, remoteCluster.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, blockReplicationNum, connected, create, fsId, id, name, osZoneNum, remoteClusterId, snapshotReplicationNum, status, update, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteCluster {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    blockReplicationNum: ").append(toIndentedString(blockReplicationNum)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    fsId: ").append(toIndentedString(fsId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osZoneNum: ").append(toIndentedString(osZoneNum)).append("\n");
    sb.append("    remoteClusterId: ").append(toIndentedString(remoteClusterId)).append("\n");
    sb.append("    snapshotReplicationNum: ").append(toIndentedString(snapshotReplicationNum)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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