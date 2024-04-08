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
 * TopologyFromOsdReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class TopologyFromOsdReq {
  @SerializedName("osd_ids")
  private List<Long> osdIds = new ArrayList<Long>();

  @SerializedName("protect_domain_id")
  private Long protectDomainId = null;

  public TopologyFromOsdReq osdIds(List<Long> osdIds) {
    this.osdIds = osdIds;
    return this;
  }

  public TopologyFromOsdReq addOsdIdsItem(Long osdIdsItem) {
    this.osdIds.add(osdIdsItem);
    return this;
  }

   /**
   * Get osdIds
   * @return osdIds
  **/
  @Schema(required = true, description = "")
  public List<Long> getOsdIds() {
    return osdIds;
  }

  public void setOsdIds(List<Long> osdIds) {
    this.osdIds = osdIds;
  }

  public TopologyFromOsdReq protectDomainId(Long protectDomainId) {
    this.protectDomainId = protectDomainId;
    return this;
  }

   /**
   * Get protectDomainId
   * @return protectDomainId
  **/
  @Schema(description = "")
  public Long getProtectDomainId() {
    return protectDomainId;
  }

  public void setProtectDomainId(Long protectDomainId) {
    this.protectDomainId = protectDomainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopologyFromOsdReq topologyFromOsdReq = (TopologyFromOsdReq) o;
    return Objects.equals(this.osdIds, topologyFromOsdReq.osdIds) &&
        Objects.equals(this.protectDomainId, topologyFromOsdReq.protectDomainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osdIds, protectDomainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopologyFromOsdReq {\n");
    
    sb.append("    osdIds: ").append(toIndentedString(osdIds)).append("\n");
    sb.append("    protectDomainId: ").append(toIndentedString(protectDomainId)).append("\n");
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