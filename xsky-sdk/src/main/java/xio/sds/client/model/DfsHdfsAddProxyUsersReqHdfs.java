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
import xio.sds.client.model.DfsHdfsProxyUserReq;
/**
 * DfsHdfsAddProxyUsersReqHdfs
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsHdfsAddProxyUsersReqHdfs {
  @SerializedName("dfs_hdfs_proxy_users")
  private List<DfsHdfsProxyUserReq> dfsHdfsProxyUsers = new ArrayList<DfsHdfsProxyUserReq>();

  public DfsHdfsAddProxyUsersReqHdfs dfsHdfsProxyUsers(List<DfsHdfsProxyUserReq> dfsHdfsProxyUsers) {
    this.dfsHdfsProxyUsers = dfsHdfsProxyUsers;
    return this;
  }

  public DfsHdfsAddProxyUsersReqHdfs addDfsHdfsProxyUsersItem(DfsHdfsProxyUserReq dfsHdfsProxyUsersItem) {
    this.dfsHdfsProxyUsers.add(dfsHdfsProxyUsersItem);
    return this;
  }

   /**
   * Get dfsHdfsProxyUsers
   * @return dfsHdfsProxyUsers
  **/
  @Schema(required = true, description = "")
  public List<DfsHdfsProxyUserReq> getDfsHdfsProxyUsers() {
    return dfsHdfsProxyUsers;
  }

  public void setDfsHdfsProxyUsers(List<DfsHdfsProxyUserReq> dfsHdfsProxyUsers) {
    this.dfsHdfsProxyUsers = dfsHdfsProxyUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsHdfsAddProxyUsersReqHdfs dfsHdfsAddProxyUsersReqHdfs = (DfsHdfsAddProxyUsersReqHdfs) o;
    return Objects.equals(this.dfsHdfsProxyUsers, dfsHdfsAddProxyUsersReqHdfs.dfsHdfsProxyUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsHdfsProxyUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsHdfsAddProxyUsersReqHdfs {\n");
    
    sb.append("    dfsHdfsProxyUsers: ").append(toIndentedString(dfsHdfsProxyUsers)).append("\n");
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
