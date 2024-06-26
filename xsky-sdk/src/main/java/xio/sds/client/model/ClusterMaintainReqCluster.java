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
 * ClusterMaintainReqCluster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ClusterMaintainReqCluster {
  @SerializedName("cluster_id")
  private Long clusterId = null;

  @SerializedName("maintained")
  private Boolean maintained = null;

  public ClusterMaintainReqCluster clusterId(Long clusterId) {
    this.clusterId = clusterId;
    return this;
  }

   /**
   * Get clusterId
   * @return clusterId
  **/
  @Schema(description = "")
  public Long getClusterId() {
    return clusterId;
  }

  public void setClusterId(Long clusterId) {
    this.clusterId = clusterId;
  }

  public ClusterMaintainReqCluster maintained(Boolean maintained) {
    this.maintained = maintained;
    return this;
  }

   /**
   * Get maintained
   * @return maintained
  **/
  @Schema(required = true, description = "")
  public Boolean isMaintained() {
    return maintained;
  }

  public void setMaintained(Boolean maintained) {
    this.maintained = maintained;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterMaintainReqCluster clusterMaintainReqCluster = (ClusterMaintainReqCluster) o;
    return Objects.equals(this.clusterId, clusterMaintainReqCluster.clusterId) &&
        Objects.equals(this.maintained, clusterMaintainReqCluster.maintained);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, maintained);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterMaintainReqCluster {\n");
    
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    maintained: ").append(toIndentedString(maintained)).append("\n");
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
