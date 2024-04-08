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
import xio.sds.client.model.OspDataBackendRelation;
/**
 * OspZoneCreateReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspZoneCreateReqInfo {
  @SerializedName("host_ids")
  private List<Long> hostIds = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("datacenter_ids")
  private List<Long> datacenterIds = null;

  @SerializedName("data_backend_relations")
  private List<OspDataBackendRelation> dataBackendRelations = null;

  @SerializedName("cluster_id")
  private Long clusterId = null;

  @SerializedName("region")
  private String region = null;

  public OspZoneCreateReqInfo hostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
    return this;
  }

  public OspZoneCreateReqInfo addHostIdsItem(Long hostIdsItem) {
    if (this.hostIds == null) {
      this.hostIds = new ArrayList<Long>();
    }
    this.hostIds.add(hostIdsItem);
    return this;
  }

   /**
   * Get hostIds
   * @return hostIds
  **/
  @Schema(description = "")
  public List<Long> getHostIds() {
    return hostIds;
  }

  public void setHostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
  }

  public OspZoneCreateReqInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OspZoneCreateReqInfo datacenterIds(List<Long> datacenterIds) {
    this.datacenterIds = datacenterIds;
    return this;
  }

  public OspZoneCreateReqInfo addDatacenterIdsItem(Long datacenterIdsItem) {
    if (this.datacenterIds == null) {
      this.datacenterIds = new ArrayList<Long>();
    }
    this.datacenterIds.add(datacenterIdsItem);
    return this;
  }

   /**
   * Get datacenterIds
   * @return datacenterIds
  **/
  @Schema(description = "")
  public List<Long> getDatacenterIds() {
    return datacenterIds;
  }

  public void setDatacenterIds(List<Long> datacenterIds) {
    this.datacenterIds = datacenterIds;
  }

  public OspZoneCreateReqInfo dataBackendRelations(List<OspDataBackendRelation> dataBackendRelations) {
    this.dataBackendRelations = dataBackendRelations;
    return this;
  }

  public OspZoneCreateReqInfo addDataBackendRelationsItem(OspDataBackendRelation dataBackendRelationsItem) {
    if (this.dataBackendRelations == null) {
      this.dataBackendRelations = new ArrayList<OspDataBackendRelation>();
    }
    this.dataBackendRelations.add(dataBackendRelationsItem);
    return this;
  }

   /**
   * Get dataBackendRelations
   * @return dataBackendRelations
  **/
  @Schema(description = "")
  public List<OspDataBackendRelation> getDataBackendRelations() {
    return dataBackendRelations;
  }

  public void setDataBackendRelations(List<OspDataBackendRelation> dataBackendRelations) {
    this.dataBackendRelations = dataBackendRelations;
  }

  public OspZoneCreateReqInfo clusterId(Long clusterId) {
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

  public OspZoneCreateReqInfo region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspZoneCreateReqInfo ospZoneCreateReqInfo = (OspZoneCreateReqInfo) o;
    return Objects.equals(this.hostIds, ospZoneCreateReqInfo.hostIds) &&
        Objects.equals(this.name, ospZoneCreateReqInfo.name) &&
        Objects.equals(this.datacenterIds, ospZoneCreateReqInfo.datacenterIds) &&
        Objects.equals(this.dataBackendRelations, ospZoneCreateReqInfo.dataBackendRelations) &&
        Objects.equals(this.clusterId, ospZoneCreateReqInfo.clusterId) &&
        Objects.equals(this.region, ospZoneCreateReqInfo.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIds, name, datacenterIds, dataBackendRelations, clusterId, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspZoneCreateReqInfo {\n");
    
    sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    datacenterIds: ").append(toIndentedString(datacenterIds)).append("\n");
    sb.append("    dataBackendRelations: ").append(toIndentedString(dataBackendRelations)).append("\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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