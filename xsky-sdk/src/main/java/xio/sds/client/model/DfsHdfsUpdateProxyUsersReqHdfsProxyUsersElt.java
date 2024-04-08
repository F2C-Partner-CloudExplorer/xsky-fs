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
 * DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt {
  @SerializedName("host")
  private String host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("proxy_user_name")
  private String proxyUserName = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("user_group")
  private String userGroup = null;

  public DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt host(String host) {
    this.host = host;
    return this;
  }

   /**
   * host node that allows access to hdfs through proxy
   * @return host
  **/
  @Schema(description = "host node that allows access to hdfs through proxy")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * proxy user id
   * @return id
  **/
  @Schema(required = true, description = "proxy user id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt proxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
    return this;
  }

   /**
   * proxy user name of hdfs
   * @return proxyUserName
  **/
  @Schema(description = "proxy user name of hdfs")
  public String getProxyUserName() {
    return proxyUserName;
  }

  public void setProxyUserName(String proxyUserName) {
    this.proxyUserName = proxyUserName;
  }

  public DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt user(String user) {
    this.user = user;
    return this;
  }

   /**
   * users allowed to proxy
   * @return user
  **/
  @Schema(description = "users allowed to proxy")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt userGroup(String userGroup) {
    this.userGroup = userGroup;
    return this;
  }

   /**
   * users group allowed to proxy
   * @return userGroup
  **/
  @Schema(description = "users group allowed to proxy")
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
    DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt = (DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt) o;
    return Objects.equals(this.host, dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt.host) &&
        Objects.equals(this.id, dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt.id) &&
        Objects.equals(this.proxyUserName, dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt.proxyUserName) &&
        Objects.equals(this.user, dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt.user) &&
        Objects.equals(this.userGroup, dfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt.userGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, id, proxyUserName, user, userGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsHdfsUpdateProxyUsersReqHdfsProxyUsersElt {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proxyUserName: ").append(toIndentedString(proxyUserName)).append("\n");
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