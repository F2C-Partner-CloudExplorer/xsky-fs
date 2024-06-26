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
/**
 * ClusterRemoveHostsReqCluster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ClusterRemoveHostsReqCluster {
  @SerializedName("ceph_host_ids")
  private List<Long> cephHostIds = null;

  @SerializedName("osp_host_ids")
  private List<Long> ospHostIds = null;

  public ClusterRemoveHostsReqCluster cephHostIds(List<Long> cephHostIds) {
    this.cephHostIds = cephHostIds;
    return this;
  }

  public ClusterRemoveHostsReqCluster addCephHostIdsItem(Long cephHostIdsItem) {
    if (this.cephHostIds == null) {
      this.cephHostIds = new ArrayList<Long>();
    }
    this.cephHostIds.add(cephHostIdsItem);
    return this;
  }

   /**
   * ceph host ids
   * @return cephHostIds
  **/
  @Schema(description = "ceph host ids")
  public List<Long> getCephHostIds() {
    return cephHostIds;
  }

  public void setCephHostIds(List<Long> cephHostIds) {
    this.cephHostIds = cephHostIds;
  }

  public ClusterRemoveHostsReqCluster ospHostIds(List<Long> ospHostIds) {
    this.ospHostIds = ospHostIds;
    return this;
  }

  public ClusterRemoveHostsReqCluster addOspHostIdsItem(Long ospHostIdsItem) {
    if (this.ospHostIds == null) {
      this.ospHostIds = new ArrayList<Long>();
    }
    this.ospHostIds.add(ospHostIdsItem);
    return this;
  }

   /**
   * osp host ids
   * @return ospHostIds
  **/
  @Schema(description = "osp host ids")
  public List<Long> getOspHostIds() {
    return ospHostIds;
  }

  public void setOspHostIds(List<Long> ospHostIds) {
    this.ospHostIds = ospHostIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterRemoveHostsReqCluster clusterRemoveHostsReqCluster = (ClusterRemoveHostsReqCluster) o;
    return Objects.equals(this.cephHostIds, clusterRemoveHostsReqCluster.cephHostIds) &&
        Objects.equals(this.ospHostIds, clusterRemoveHostsReqCluster.ospHostIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cephHostIds, ospHostIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterRemoveHostsReqCluster {\n");
    
    sb.append("    cephHostIds: ").append(toIndentedString(cephHostIds)).append("\n");
    sb.append("    ospHostIds: ").append(toIndentedString(ospHostIds)).append("\n");
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
