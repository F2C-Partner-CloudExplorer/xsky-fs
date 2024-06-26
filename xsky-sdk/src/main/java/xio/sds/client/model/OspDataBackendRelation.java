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
 * OspDataBackendRelation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspDataBackendRelation {
  @SerializedName("data_backend_id")
  private Long dataBackendId = null;

  @SerializedName("connected_host_ids")
  private List<Long> connectedHostIds = null;

  @SerializedName("connect_type")
  private String connectType = null;

  public OspDataBackendRelation dataBackendId(Long dataBackendId) {
    this.dataBackendId = dataBackendId;
    return this;
  }

   /**
   * Get dataBackendId
   * @return dataBackendId
  **/
  @Schema(description = "")
  public Long getDataBackendId() {
    return dataBackendId;
  }

  public void setDataBackendId(Long dataBackendId) {
    this.dataBackendId = dataBackendId;
  }

  public OspDataBackendRelation connectedHostIds(List<Long> connectedHostIds) {
    this.connectedHostIds = connectedHostIds;
    return this;
  }

  public OspDataBackendRelation addConnectedHostIdsItem(Long connectedHostIdsItem) {
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

  public OspDataBackendRelation connectType(String connectType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspDataBackendRelation ospDataBackendRelation = (OspDataBackendRelation) o;
    return Objects.equals(this.dataBackendId, ospDataBackendRelation.dataBackendId) &&
        Objects.equals(this.connectedHostIds, ospDataBackendRelation.connectedHostIds) &&
        Objects.equals(this.connectType, ospDataBackendRelation.connectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataBackendId, connectedHostIds, connectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspDataBackendRelation {\n");
    
    sb.append("    dataBackendId: ").append(toIndentedString(dataBackendId)).append("\n");
    sb.append("    connectedHostIds: ").append(toIndentedString(connectedHostIds)).append("\n");
    sb.append("    connectType: ").append(toIndentedString(connectType)).append("\n");
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
