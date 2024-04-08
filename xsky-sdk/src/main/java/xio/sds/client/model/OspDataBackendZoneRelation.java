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
import xio.sds.client.model.OspDataBackend;
import xio.sds.client.model.OspDataBackendZoneField;
import xio.sds.client.model.OspZoneDataBackendTargetState;
/**
 * OspDataBackendZoneRelation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspDataBackendZoneRelation {
  @SerializedName("status")
  private String status = null;

  @SerializedName("connected_host_ids")
  private List<Long> connectedHostIds = null;

  @SerializedName("zone")
  private OspDataBackendZoneField zone = null;

  @SerializedName("connect_type")
  private String connectType = null;

  @SerializedName("cluster")
  private String cluster = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("target_check_results")
  private List<OspZoneDataBackendTargetState> targetCheckResults = null;

  @SerializedName("data_backend")
  private OspDataBackend dataBackend = null;

  @SerializedName("id")
  private Long id = null;

  public OspDataBackendZoneRelation status(String status) {
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

  public OspDataBackendZoneRelation connectedHostIds(List<Long> connectedHostIds) {
    this.connectedHostIds = connectedHostIds;
    return this;
  }

  public OspDataBackendZoneRelation addConnectedHostIdsItem(Long connectedHostIdsItem) {
    if (this.connectedHostIds == null) {
      this.connectedHostIds = new ArrayList<Long>();
    }
    this.connectedHostIds.add(connectedHostIdsItem);
    return this;
  }

   /**
   * Get connectedHostIds
   * @return connectedHostIds
  **/
  @Schema(description = "")
  public List<Long> getConnectedHostIds() {
    return connectedHostIds;
  }

  public void setConnectedHostIds(List<Long> connectedHostIds) {
    this.connectedHostIds = connectedHostIds;
  }

  public OspDataBackendZoneRelation zone(OspDataBackendZoneField zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @Schema(description = "")
  public OspDataBackendZoneField getZone() {
    return zone;
  }

  public void setZone(OspDataBackendZoneField zone) {
    this.zone = zone;
  }

  public OspDataBackendZoneRelation connectType(String connectType) {
    this.connectType = connectType;
    return this;
  }

   /**
   * Get connectType
   * @return connectType
  **/
  @Schema(description = "")
  public String getConnectType() {
    return connectType;
  }

  public void setConnectType(String connectType) {
    this.connectType = connectType;
  }

  public OspDataBackendZoneRelation cluster(String cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public String getCluster() {
    return cluster;
  }

  public void setCluster(String cluster) {
    this.cluster = cluster;
  }

  public OspDataBackendZoneRelation connected(Boolean connected) {
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

  public OspDataBackendZoneRelation targetCheckResults(List<OspZoneDataBackendTargetState> targetCheckResults) {
    this.targetCheckResults = targetCheckResults;
    return this;
  }

  public OspDataBackendZoneRelation addTargetCheckResultsItem(OspZoneDataBackendTargetState targetCheckResultsItem) {
    if (this.targetCheckResults == null) {
      this.targetCheckResults = new ArrayList<OspZoneDataBackendTargetState>();
    }
    this.targetCheckResults.add(targetCheckResultsItem);
    return this;
  }

   /**
   * Get targetCheckResults
   * @return targetCheckResults
  **/
  @Schema(description = "")
  public List<OspZoneDataBackendTargetState> getTargetCheckResults() {
    return targetCheckResults;
  }

  public void setTargetCheckResults(List<OspZoneDataBackendTargetState> targetCheckResults) {
    this.targetCheckResults = targetCheckResults;
  }

  public OspDataBackendZoneRelation dataBackend(OspDataBackend dataBackend) {
    this.dataBackend = dataBackend;
    return this;
  }

   /**
   * Get dataBackend
   * @return dataBackend
  **/
  @Schema(description = "")
  public OspDataBackend getDataBackend() {
    return dataBackend;
  }

  public void setDataBackend(OspDataBackend dataBackend) {
    this.dataBackend = dataBackend;
  }

  public OspDataBackendZoneRelation id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspDataBackendZoneRelation ospDataBackendZoneRelation = (OspDataBackendZoneRelation) o;
    return Objects.equals(this.status, ospDataBackendZoneRelation.status) &&
        Objects.equals(this.connectedHostIds, ospDataBackendZoneRelation.connectedHostIds) &&
        Objects.equals(this.zone, ospDataBackendZoneRelation.zone) &&
        Objects.equals(this.connectType, ospDataBackendZoneRelation.connectType) &&
        Objects.equals(this.cluster, ospDataBackendZoneRelation.cluster) &&
        Objects.equals(this.connected, ospDataBackendZoneRelation.connected) &&
        Objects.equals(this.targetCheckResults, ospDataBackendZoneRelation.targetCheckResults) &&
        Objects.equals(this.dataBackend, ospDataBackendZoneRelation.dataBackend) &&
        Objects.equals(this.id, ospDataBackendZoneRelation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, connectedHostIds, zone, connectType, cluster, connected, targetCheckResults, dataBackend, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspDataBackendZoneRelation {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    connectedHostIds: ").append(toIndentedString(connectedHostIds)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    targetCheckResults: ").append(toIndentedString(targetCheckResults)).append("\n");
    sb.append("    dataBackend: ").append(toIndentedString(dataBackend)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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