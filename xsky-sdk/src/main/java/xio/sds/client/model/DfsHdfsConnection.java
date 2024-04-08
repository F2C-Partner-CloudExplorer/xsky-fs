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
import xio.sds.client.model.DfsGatewayNestview;
import xio.sds.client.model.DfsGatewayZoneNestview;
import xio.sds.client.model.DfsHdfsNestview;
/**
 * DfsHdfsConnection defines model of dfs hdfs connection +X:model:generate;order_by&#x3D;-ID;related_depth&#x3D;1
 */
@Schema(description = "DfsHdfsConnection defines model of dfs hdfs connection +X:model:generate;order_by=-ID;related_depth=1")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsHdfsConnection {
  @SerializedName("client_ip")
  private String clientIp = null;

  @SerializedName("client_port")
  private Long clientPort = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("connected_at")
  private OffsetDateTime connectedAt = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dfs_gateway")
  private DfsGatewayNestview dfsGateway = null;

  @SerializedName("dfs_gateway_zone")
  private DfsGatewayZoneNestview dfsGatewayZone = null;

  @SerializedName("hdfs")
  private DfsHdfsNestview hdfs = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("protocol_version")
  private String protocolVersion = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("username")
  private String username = null;

  public DfsHdfsConnection clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

   /**
   * Get clientIp
   * @return clientIp
  **/
  @Schema(description = "")
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public DfsHdfsConnection clientPort(Long clientPort) {
    this.clientPort = clientPort;
    return this;
  }

   /**
   * Get clientPort
   * @return clientPort
  **/
  @Schema(description = "")
  public Long getClientPort() {
    return clientPort;
  }

  public void setClientPort(Long clientPort) {
    this.clientPort = clientPort;
  }

  public DfsHdfsConnection cluster(ClusterNestview cluster) {
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

  public DfsHdfsConnection connectedAt(OffsetDateTime connectedAt) {
    this.connectedAt = connectedAt;
    return this;
  }

   /**
   * Get connectedAt
   * @return connectedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getConnectedAt() {
    return connectedAt;
  }

  public void setConnectedAt(OffsetDateTime connectedAt) {
    this.connectedAt = connectedAt;
  }

  public DfsHdfsConnection create(OffsetDateTime create) {
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

  public DfsHdfsConnection dfsGateway(DfsGatewayNestview dfsGateway) {
    this.dfsGateway = dfsGateway;
    return this;
  }

   /**
   * Get dfsGateway
   * @return dfsGateway
  **/
  @Schema(description = "")
  public DfsGatewayNestview getDfsGateway() {
    return dfsGateway;
  }

  public void setDfsGateway(DfsGatewayNestview dfsGateway) {
    this.dfsGateway = dfsGateway;
  }

  public DfsHdfsConnection dfsGatewayZone(DfsGatewayZoneNestview dfsGatewayZone) {
    this.dfsGatewayZone = dfsGatewayZone;
    return this;
  }

   /**
   * Get dfsGatewayZone
   * @return dfsGatewayZone
  **/
  @Schema(description = "")
  public DfsGatewayZoneNestview getDfsGatewayZone() {
    return dfsGatewayZone;
  }

  public void setDfsGatewayZone(DfsGatewayZoneNestview dfsGatewayZone) {
    this.dfsGatewayZone = dfsGatewayZone;
  }

  public DfsHdfsConnection hdfs(DfsHdfsNestview hdfs) {
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @Schema(description = "")
  public DfsHdfsNestview getHdfs() {
    return hdfs;
  }

  public void setHdfs(DfsHdfsNestview hdfs) {
    this.hdfs = hdfs;
  }

  public DfsHdfsConnection id(Long id) {
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

  public DfsHdfsConnection protocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * Get protocolVersion
   * @return protocolVersion
  **/
  @Schema(description = "")
  public String getProtocolVersion() {
    return protocolVersion;
  }

  public void setProtocolVersion(String protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  public DfsHdfsConnection update(OffsetDateTime update) {
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

  public DfsHdfsConnection username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
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
    DfsHdfsConnection dfsHdfsConnection = (DfsHdfsConnection) o;
    return Objects.equals(this.clientIp, dfsHdfsConnection.clientIp) &&
        Objects.equals(this.clientPort, dfsHdfsConnection.clientPort) &&
        Objects.equals(this.cluster, dfsHdfsConnection.cluster) &&
        Objects.equals(this.connectedAt, dfsHdfsConnection.connectedAt) &&
        Objects.equals(this.create, dfsHdfsConnection.create) &&
        Objects.equals(this.dfsGateway, dfsHdfsConnection.dfsGateway) &&
        Objects.equals(this.dfsGatewayZone, dfsHdfsConnection.dfsGatewayZone) &&
        Objects.equals(this.hdfs, dfsHdfsConnection.hdfs) &&
        Objects.equals(this.id, dfsHdfsConnection.id) &&
        Objects.equals(this.protocolVersion, dfsHdfsConnection.protocolVersion) &&
        Objects.equals(this.update, dfsHdfsConnection.update) &&
        Objects.equals(this.username, dfsHdfsConnection.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIp, clientPort, cluster, connectedAt, create, dfsGateway, dfsGatewayZone, hdfs, id, protocolVersion, update, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsHdfsConnection {\n");
    
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    connectedAt: ").append(toIndentedString(connectedAt)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsGateway: ").append(toIndentedString(dfsGateway)).append("\n");
    sb.append("    dfsGatewayZone: ").append(toIndentedString(dfsGatewayZone)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
