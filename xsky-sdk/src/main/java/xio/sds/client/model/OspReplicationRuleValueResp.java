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
import xio.sds.client.model.OspBucketFilter;
import xio.sds.client.model.OspNestedBucket;
import xio.sds.client.model.OspReplicationDestination;
import xio.sds.client.model.OspReplicationRuleStatus;
import xio.sds.client.model.OspTargetNamingRule;
/**
 * OspReplicationRuleValueResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspReplicationRuleValueResp {
  @SerializedName("status")
  private OspReplicationRuleStatus status = null;

  @SerializedName("zone_id")
  private Long zoneId = null;

  @SerializedName("ctime")
  private String ctime = null;

  @SerializedName("internal_replication")
  private Boolean internalReplication = null;

  @SerializedName("destination")
  private List<OspReplicationDestination> destination = null;

  @SerializedName("delete_replication")
  private OspReplicationRuleStatus deleteReplication = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("filter")
  private OspBucketFilter filter = null;

  @SerializedName("exist_obj_replication")
  private OspReplicationRuleStatus existObjReplication = null;

  @SerializedName("reinit_status")
  private String reinitStatus = null;

  @SerializedName("encrypted_obj_replication")
  private OspReplicationRuleStatus encryptedObjReplication = null;

  @SerializedName("naming_rule")
  private OspTargetNamingRule namingRule = null;

  @SerializedName("nested_bucket")
  private OspNestedBucket nestedBucket = null;

  @SerializedName("accurate_replication")
  private Boolean accurateReplication = null;

  @SerializedName("name")
  private String name = null;

  public OspReplicationRuleValueResp status(OspReplicationRuleStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public OspReplicationRuleStatus getStatus() {
    return status;
  }

  public void setStatus(OspReplicationRuleStatus status) {
    this.status = status;
  }

  public OspReplicationRuleValueResp zoneId(Long zoneId) {
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

  public OspReplicationRuleValueResp ctime(String ctime) {
    this.ctime = ctime;
    return this;
  }

   /**
   * Get ctime
   * @return ctime
  **/
  @Schema(description = "")
  public String getCtime() {
    return ctime;
  }

  public void setCtime(String ctime) {
    this.ctime = ctime;
  }

  public OspReplicationRuleValueResp internalReplication(Boolean internalReplication) {
    this.internalReplication = internalReplication;
    return this;
  }

   /**
   * Get internalReplication
   * @return internalReplication
  **/
  @Schema(description = "")
  public Boolean isInternalReplication() {
    return internalReplication;
  }

  public void setInternalReplication(Boolean internalReplication) {
    this.internalReplication = internalReplication;
  }

  public OspReplicationRuleValueResp destination(List<OspReplicationDestination> destination) {
    this.destination = destination;
    return this;
  }

  public OspReplicationRuleValueResp addDestinationItem(OspReplicationDestination destinationItem) {
    if (this.destination == null) {
      this.destination = new ArrayList<OspReplicationDestination>();
    }
    this.destination.add(destinationItem);
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public List<OspReplicationDestination> getDestination() {
    return destination;
  }

  public void setDestination(List<OspReplicationDestination> destination) {
    this.destination = destination;
  }

  public OspReplicationRuleValueResp deleteReplication(OspReplicationRuleStatus deleteReplication) {
    this.deleteReplication = deleteReplication;
    return this;
  }

   /**
   * Get deleteReplication
   * @return deleteReplication
  **/
  @Schema(description = "")
  public OspReplicationRuleStatus getDeleteReplication() {
    return deleteReplication;
  }

  public void setDeleteReplication(OspReplicationRuleStatus deleteReplication) {
    this.deleteReplication = deleteReplication;
  }

  public OspReplicationRuleValueResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OspReplicationRuleValueResp filter(OspBucketFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(description = "")
  public OspBucketFilter getFilter() {
    return filter;
  }

  public void setFilter(OspBucketFilter filter) {
    this.filter = filter;
  }

  public OspReplicationRuleValueResp existObjReplication(OspReplicationRuleStatus existObjReplication) {
    this.existObjReplication = existObjReplication;
    return this;
  }

   /**
   * Get existObjReplication
   * @return existObjReplication
  **/
  @Schema(description = "")
  public OspReplicationRuleStatus getExistObjReplication() {
    return existObjReplication;
  }

  public void setExistObjReplication(OspReplicationRuleStatus existObjReplication) {
    this.existObjReplication = existObjReplication;
  }

  public OspReplicationRuleValueResp reinitStatus(String reinitStatus) {
    this.reinitStatus = reinitStatus;
    return this;
  }

   /**
   * Get reinitStatus
   * @return reinitStatus
  **/
  @Schema(description = "")
  public String getReinitStatus() {
    return reinitStatus;
  }

  public void setReinitStatus(String reinitStatus) {
    this.reinitStatus = reinitStatus;
  }

  public OspReplicationRuleValueResp encryptedObjReplication(OspReplicationRuleStatus encryptedObjReplication) {
    this.encryptedObjReplication = encryptedObjReplication;
    return this;
  }

   /**
   * Get encryptedObjReplication
   * @return encryptedObjReplication
  **/
  @Schema(description = "")
  public OspReplicationRuleStatus getEncryptedObjReplication() {
    return encryptedObjReplication;
  }

  public void setEncryptedObjReplication(OspReplicationRuleStatus encryptedObjReplication) {
    this.encryptedObjReplication = encryptedObjReplication;
  }

  public OspReplicationRuleValueResp namingRule(OspTargetNamingRule namingRule) {
    this.namingRule = namingRule;
    return this;
  }

   /**
   * Get namingRule
   * @return namingRule
  **/
  @Schema(description = "")
  public OspTargetNamingRule getNamingRule() {
    return namingRule;
  }

  public void setNamingRule(OspTargetNamingRule namingRule) {
    this.namingRule = namingRule;
  }

  public OspReplicationRuleValueResp nestedBucket(OspNestedBucket nestedBucket) {
    this.nestedBucket = nestedBucket;
    return this;
  }

   /**
   * Get nestedBucket
   * @return nestedBucket
  **/
  @Schema(description = "")
  public OspNestedBucket getNestedBucket() {
    return nestedBucket;
  }

  public void setNestedBucket(OspNestedBucket nestedBucket) {
    this.nestedBucket = nestedBucket;
  }

  public OspReplicationRuleValueResp accurateReplication(Boolean accurateReplication) {
    this.accurateReplication = accurateReplication;
    return this;
  }

   /**
   * Get accurateReplication
   * @return accurateReplication
  **/
  @Schema(description = "")
  public Boolean isAccurateReplication() {
    return accurateReplication;
  }

  public void setAccurateReplication(Boolean accurateReplication) {
    this.accurateReplication = accurateReplication;
  }

  public OspReplicationRuleValueResp name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspReplicationRuleValueResp ospReplicationRuleValueResp = (OspReplicationRuleValueResp) o;
    return Objects.equals(this.status, ospReplicationRuleValueResp.status) &&
        Objects.equals(this.zoneId, ospReplicationRuleValueResp.zoneId) &&
        Objects.equals(this.ctime, ospReplicationRuleValueResp.ctime) &&
        Objects.equals(this.internalReplication, ospReplicationRuleValueResp.internalReplication) &&
        Objects.equals(this.destination, ospReplicationRuleValueResp.destination) &&
        Objects.equals(this.deleteReplication, ospReplicationRuleValueResp.deleteReplication) &&
        Objects.equals(this.id, ospReplicationRuleValueResp.id) &&
        Objects.equals(this.filter, ospReplicationRuleValueResp.filter) &&
        Objects.equals(this.existObjReplication, ospReplicationRuleValueResp.existObjReplication) &&
        Objects.equals(this.reinitStatus, ospReplicationRuleValueResp.reinitStatus) &&
        Objects.equals(this.encryptedObjReplication, ospReplicationRuleValueResp.encryptedObjReplication) &&
        Objects.equals(this.namingRule, ospReplicationRuleValueResp.namingRule) &&
        Objects.equals(this.nestedBucket, ospReplicationRuleValueResp.nestedBucket) &&
        Objects.equals(this.accurateReplication, ospReplicationRuleValueResp.accurateReplication) &&
        Objects.equals(this.name, ospReplicationRuleValueResp.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, zoneId, ctime, internalReplication, destination, deleteReplication, id, filter, existObjReplication, reinitStatus, encryptedObjReplication, namingRule, nestedBucket, accurateReplication, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspReplicationRuleValueResp {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    ctime: ").append(toIndentedString(ctime)).append("\n");
    sb.append("    internalReplication: ").append(toIndentedString(internalReplication)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    deleteReplication: ").append(toIndentedString(deleteReplication)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    existObjReplication: ").append(toIndentedString(existObjReplication)).append("\n");
    sb.append("    reinitStatus: ").append(toIndentedString(reinitStatus)).append("\n");
    sb.append("    encryptedObjReplication: ").append(toIndentedString(encryptedObjReplication)).append("\n");
    sb.append("    namingRule: ").append(toIndentedString(namingRule)).append("\n");
    sb.append("    nestedBucket: ").append(toIndentedString(nestedBucket)).append("\n");
    sb.append("    accurateReplication: ").append(toIndentedString(accurateReplication)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
