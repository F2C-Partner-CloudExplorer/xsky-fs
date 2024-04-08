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
import xio.sds.client.model.DfsHdfsNestview;
/**
 * DfsHdfsProxyUser define dfs hdfs proxy user list +X:model:generate;etcd_lock;
 */
@Schema(description = "DfsHdfsProxyUser define dfs hdfs proxy user list +X:model:generate;etcd_lock;")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsHdfsProxyUser {
  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dfs_hdfs")
  private DfsHdfsNestview dfsHdfs = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("proxy_user_name")
  private String proxyUserName = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("user_group")
  private String userGroup = null;

  public DfsHdfsProxyUser cluster(ClusterNestview cluster) {
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

  public DfsHdfsProxyUser create(OffsetDateTime create) {
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

  public DfsHdfsProxyUser dfsHdfs(DfsHdfsNestview dfsHdfs) {
    this.dfsHdfs = dfsHdfs;
    return this;
  }

   /**
   * Get dfsHdfs
   * @return dfsHdfs
  **/
  @Schema(description = "")
  public DfsHdfsNestview getDfsHdfs() {
    return dfsHdfs;
  }

  public void setDfsHdfs(DfsHdfsNestview dfsHdfs) {
    this.dfsHdfs = dfsHdfs;
  }

  public DfsHdfsProxyUser host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public DfsHdfsProxyUser id(Long id) {
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

  public DfsHdfsProxyUser proxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
    return this;
  }

   /**
   * Get proxyUserName
   * @return proxyUserName
  **/
  @Schema(description = "")
  public String getProxyUserName() {
    return proxyUserName;
  }

  public void setProxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
  }

  public DfsHdfsProxyUser status(String status) {
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

  public DfsHdfsProxyUser update(OffsetDateTime update) {
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

  public DfsHdfsProxyUser user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DfsHdfsProxyUser userGroup(String userGroup) {
    this.userGroup = userGroup;
    return this;
  }

   /**
   * Get userGroup
   * @return userGroup
  **/
  @Schema(description = "")
  public String getUserGroup() {
    return userGroup;
  }

  public void setUserGroup(String userGroup) {
    this.userGroup = userGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsHdfsProxyUser dfsHdfsProxyUser = (DfsHdfsProxyUser) o;
    return Objects.equals(this.cluster, dfsHdfsProxyUser.cluster) &&
        Objects.equals(this.create, dfsHdfsProxyUser.create) &&
        Objects.equals(this.dfsHdfs, dfsHdfsProxyUser.dfsHdfs) &&
        Objects.equals(this.host, dfsHdfsProxyUser.host) &&
        Objects.equals(this.id, dfsHdfsProxyUser.id) &&
        Objects.equals(this.proxyUserName, dfsHdfsProxyUser.proxyUserName) &&
        Objects.equals(this.status, dfsHdfsProxyUser.status) &&
        Objects.equals(this.update, dfsHdfsProxyUser.update) &&
        Objects.equals(this.user, dfsHdfsProxyUser.user) &&
        Objects.equals(this.userGroup, dfsHdfsProxyUser.userGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, dfsHdfs, host, id, proxyUserName, status, update, user, userGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsHdfsProxyUser {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsHdfs: ").append(toIndentedString(dfsHdfs)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proxyUserName: ").append(toIndentedString(proxyUserName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
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
