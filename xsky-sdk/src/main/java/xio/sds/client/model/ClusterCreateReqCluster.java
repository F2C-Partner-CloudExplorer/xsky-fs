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
import xio.sds.client.model.ClusterCreateBootNodeReq;
import xio.sds.client.model.ClusterCreateNetworkReq;
/**
 * ClusterCreateReqCluster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ClusterCreateReqCluster {
  @SerializedName("bootnode")
  private ClusterCreateBootNodeReq bootnode = null;

  @SerializedName("fs_id")
  private String fsId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("network")
  private ClusterCreateNetworkReq network = null;

  @SerializedName("type")
  private String type = null;

  public ClusterCreateReqCluster bootnode(ClusterCreateBootNodeReq bootnode) {
    this.bootnode = bootnode;
    return this;
  }

   /**
   * Get bootnode
   * @return bootnode
  **/
  @Schema(description = "")
  public ClusterCreateBootNodeReq getBootnode() {
    return bootnode;
  }

  public void setBootnode(ClusterCreateBootNodeReq bootnode) {
    this.bootnode = bootnode;
  }

  public ClusterCreateReqCluster fsId(String fsId) {
    this.fsId = fsId;
    return this;
  }

   /**
   * cluster fs id
   * @return fsId
  **/
  @Schema(required = true, description = "cluster fs id")
  public String getFsId() {
    return fsId;
  }

  public void setFsId(String fsId) {
    this.fsId = fsId;
  }

  public ClusterCreateReqCluster name(String name) {
    this.name = name;
    return this;
  }

   /**
   * cluster name
   * @return name
  **/
  @Schema(required = true, description = "cluster name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClusterCreateReqCluster network(ClusterCreateNetworkReq network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @Schema(description = "")
  public ClusterCreateNetworkReq getNetwork() {
    return network;
  }

  public void setNetwork(ClusterCreateNetworkReq network) {
    this.network = network;
  }

  public ClusterCreateReqCluster type(String type) {
    this.type = type;
    return this;
  }

   /**
   * cluster type: ceph or osp
   * @return type
  **/
  @Schema(description = "cluster type: ceph or osp")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterCreateReqCluster clusterCreateReqCluster = (ClusterCreateReqCluster) o;
    return Objects.equals(this.bootnode, clusterCreateReqCluster.bootnode) &&
        Objects.equals(this.fsId, clusterCreateReqCluster.fsId) &&
        Objects.equals(this.name, clusterCreateReqCluster.name) &&
        Objects.equals(this.network, clusterCreateReqCluster.network) &&
        Objects.equals(this.type, clusterCreateReqCluster.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootnode, fsId, name, network, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterCreateReqCluster {\n");
    
    sb.append("    bootnode: ").append(toIndentedString(bootnode)).append("\n");
    sb.append("    fsId: ").append(toIndentedString(fsId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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