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
 * DfsNFSShareUpdateACLReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsNFSShareUpdateACLReq {
  @SerializedName("all_squash")
  private Boolean allSquash = null;

  @SerializedName("clients")
  private String clients = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("permission")
  private String permission = null;

  @SerializedName("root_squash")
  private Boolean rootSquash = null;

  @SerializedName("sync")
  private Boolean sync = null;

  public DfsNFSShareUpdateACLReq allSquash(Boolean allSquash) {
    this.allSquash = allSquash;
    return this;
  }

   /**
   * all squash
   * @return allSquash
  **/
  @Schema(description = "all squash")
  public Boolean isAllSquash() {
    return allSquash;
  }

  public void setAllSquash(Boolean allSquash) {
    this.allSquash = allSquash;
  }

  public DfsNFSShareUpdateACLReq clients(String clients) {
    this.clients = clients;
    return this;
  }

   /**
   * ip or network list, separated by comma
   * @return clients
  **/
  @Schema(description = "ip or network list, separated by comma")
  public String getClients() {
    return clients;
  }

  public void setClients(String clients) {
    this.clients = clients;
  }

  public DfsNFSShareUpdateACLReq id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * id of user group
   * @return id
  **/
  @Schema(description = "id of user group")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DfsNFSShareUpdateACLReq permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * readonly or readwrite access
   * @return permission
  **/
  @Schema(description = "readonly or readwrite access")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public DfsNFSShareUpdateACLReq rootSquash(Boolean rootSquash) {
    this.rootSquash = rootSquash;
    return this;
  }

   /**
   * root squash
   * @return rootSquash
  **/
  @Schema(description = "root squash")
  public Boolean isRootSquash() {
    return rootSquash;
  }

  public void setRootSquash(Boolean rootSquash) {
    this.rootSquash = rootSquash;
  }

  public DfsNFSShareUpdateACLReq sync(Boolean sync) {
    this.sync = sync;
    return this;
  }

   /**
   * write to disk by sync or async
   * @return sync
  **/
  @Schema(description = "write to disk by sync or async")
  public Boolean isSync() {
    return sync;
  }

  public void setSync(Boolean sync) {
    this.sync = sync;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsNFSShareUpdateACLReq dfsNFSShareUpdateACLReq = (DfsNFSShareUpdateACLReq) o;
    return Objects.equals(this.allSquash, dfsNFSShareUpdateACLReq.allSquash) &&
        Objects.equals(this.clients, dfsNFSShareUpdateACLReq.clients) &&
        Objects.equals(this.id, dfsNFSShareUpdateACLReq.id) &&
        Objects.equals(this.permission, dfsNFSShareUpdateACLReq.permission) &&
        Objects.equals(this.rootSquash, dfsNFSShareUpdateACLReq.rootSquash) &&
        Objects.equals(this.sync, dfsNFSShareUpdateACLReq.sync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allSquash, clients, id, permission, rootSquash, sync);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsNFSShareUpdateACLReq {\n");
    
    sb.append("    allSquash: ").append(toIndentedString(allSquash)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    rootSquash: ").append(toIndentedString(rootSquash)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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