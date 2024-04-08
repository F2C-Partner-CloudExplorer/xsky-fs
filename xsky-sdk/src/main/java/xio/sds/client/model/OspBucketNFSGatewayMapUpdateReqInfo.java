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
import xio.sds.client.model.OspBucketNFSClient;
/**
 * OspBucketNFSGatewayMapUpdateReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketNFSGatewayMapUpdateReqInfo {
  @SerializedName("region")
  private String region = null;

  @SerializedName("clients")
  private List<OspBucketNFSClient> clients = null;

  @SerializedName("zone_id")
  private Long zoneId = null;

  @SerializedName("nfs_gateway_id")
  private Long nfsGatewayId = null;

  @SerializedName("access_key_id")
  private String accessKeyId = null;

  public OspBucketNFSGatewayMapUpdateReqInfo region(String region) {
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

  public OspBucketNFSGatewayMapUpdateReqInfo clients(List<OspBucketNFSClient> clients) {
    this.clients = clients;
    return this;
  }

  public OspBucketNFSGatewayMapUpdateReqInfo addClientsItem(OspBucketNFSClient clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<OspBucketNFSClient>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @Schema(description = "")
  public List<OspBucketNFSClient> getClients() {
    return clients;
  }

  public void setClients(List<OspBucketNFSClient> clients) {
    this.clients = clients;
  }

  public OspBucketNFSGatewayMapUpdateReqInfo zoneId(Long zoneId) {
    this.zoneId = zoneId;
    return this;
  }

   /**
   * Get zoneId
   * @return zoneId
  **/
  @Schema(description = "")
  public Long getZoneId() {
    return zoneId;
  }

  public void setZoneId(Long zoneId) {
    this.zoneId = zoneId;
  }

  public OspBucketNFSGatewayMapUpdateReqInfo nfsGatewayId(Long nfsGatewayId) {
    this.nfsGatewayId = nfsGatewayId;
    return this;
  }

   /**
   * Get nfsGatewayId
   * @return nfsGatewayId
  **/
  @Schema(description = "")
  public Long getNfsGatewayId() {
    return nfsGatewayId;
  }

  public void setNfsGatewayId(Long nfsGatewayId) {
    this.nfsGatewayId = nfsGatewayId;
  }

  public OspBucketNFSGatewayMapUpdateReqInfo accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * Get accessKeyId
   * @return accessKeyId
  **/
  @Schema(description = "")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketNFSGatewayMapUpdateReqInfo ospBucketNFSGatewayMapUpdateReqInfo = (OspBucketNFSGatewayMapUpdateReqInfo) o;
    return Objects.equals(this.region, ospBucketNFSGatewayMapUpdateReqInfo.region) &&
        Objects.equals(this.clients, ospBucketNFSGatewayMapUpdateReqInfo.clients) &&
        Objects.equals(this.zoneId, ospBucketNFSGatewayMapUpdateReqInfo.zoneId) &&
        Objects.equals(this.nfsGatewayId, ospBucketNFSGatewayMapUpdateReqInfo.nfsGatewayId) &&
        Objects.equals(this.accessKeyId, ospBucketNFSGatewayMapUpdateReqInfo.accessKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, clients, zoneId, nfsGatewayId, accessKeyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketNFSGatewayMapUpdateReqInfo {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    nfsGatewayId: ").append(toIndentedString(nfsGatewayId)).append("\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
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
