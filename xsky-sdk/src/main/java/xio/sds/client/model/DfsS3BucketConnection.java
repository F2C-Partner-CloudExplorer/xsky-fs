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
import xio.sds.client.model.DfsS3BucketNestview;
/**
 * DfsS3BucketConnection defines model of dfs s3 bucket connection +X:model:generate;order_by&#x3D;-ID;related_depth&#x3D;1
 */
@Schema(description = "DfsS3BucketConnection defines model of dfs s3 bucket connection +X:model:generate;order_by=-ID;related_depth=1")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsS3BucketConnection {
  @SerializedName("api")
  private String api = null;

  @SerializedName("bucket")
  private DfsS3BucketNestview bucket = null;

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

  @SerializedName("id")
  private Long id = null;

  @SerializedName("protocol_version")
  private String protocolVersion = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("username")
  private String username = null;

  public DfsS3BucketConnection api(String api) {
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @Schema(description = "")
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public DfsS3BucketConnection bucket(DfsS3BucketNestview bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(description = "")
  public DfsS3BucketNestview getBucket() {
    return bucket;
  }

  public void setBucket(DfsS3BucketNestview bucket) {
    this.bucket = bucket;
  }

  public DfsS3BucketConnection clientIp(String clientIp) {
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

  public DfsS3BucketConnection clientPort(Long clientPort) {
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

  public DfsS3BucketConnection cluster(ClusterNestview cluster) {
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

  public DfsS3BucketConnection connectedAt(OffsetDateTime connectedAt) {
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

  public DfsS3BucketConnection create(OffsetDateTime create) {
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

  public DfsS3BucketConnection dfsGateway(DfsGatewayNestview dfsGateway) {
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

  public DfsS3BucketConnection id(Long id) {
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

  public DfsS3BucketConnection protocolVersion(String protocolVersion) {
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

  public DfsS3BucketConnection requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @Schema(description = "")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DfsS3BucketConnection update(OffsetDateTime update) {
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

  public DfsS3BucketConnection username(String username) {
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
    DfsS3BucketConnection dfsS3BucketConnection = (DfsS3BucketConnection) o;
    return Objects.equals(this.api, dfsS3BucketConnection.api) &&
        Objects.equals(this.bucket, dfsS3BucketConnection.bucket) &&
        Objects.equals(this.clientIp, dfsS3BucketConnection.clientIp) &&
        Objects.equals(this.clientPort, dfsS3BucketConnection.clientPort) &&
        Objects.equals(this.cluster, dfsS3BucketConnection.cluster) &&
        Objects.equals(this.connectedAt, dfsS3BucketConnection.connectedAt) &&
        Objects.equals(this.create, dfsS3BucketConnection.create) &&
        Objects.equals(this.dfsGateway, dfsS3BucketConnection.dfsGateway) &&
        Objects.equals(this.id, dfsS3BucketConnection.id) &&
        Objects.equals(this.protocolVersion, dfsS3BucketConnection.protocolVersion) &&
        Objects.equals(this.requestId, dfsS3BucketConnection.requestId) &&
        Objects.equals(this.update, dfsS3BucketConnection.update) &&
        Objects.equals(this.username, dfsS3BucketConnection.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, bucket, clientIp, clientPort, cluster, connectedAt, create, dfsGateway, id, protocolVersion, requestId, update, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsS3BucketConnection {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    connectedAt: ").append(toIndentedString(connectedAt)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsGateway: ").append(toIndentedString(dfsGateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
