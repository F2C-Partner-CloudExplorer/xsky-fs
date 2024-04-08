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
import xio.sds.client.model.OspReplicationDestination;
import xio.sds.client.model.OspReplicationRuleStatus;
import xio.sds.client.model.OspTargetNamingRule;
/**
 * OspBucketUpdateReplicationRuleReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketUpdateReplicationRuleReqInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("internal_replication")
  private Boolean internalReplication = null;

  @SerializedName("destination")
  private List<OspReplicationDestination> destination = null;

  @SerializedName("delete_replication")
  private OspReplicationRuleStatus deleteReplication = null;

  @SerializedName("filter")
  private OspBucketFilter filter = null;

  @SerializedName("exist_obj_replication")
  private OspReplicationRuleStatus existObjReplication = null;

  @SerializedName("encrypted_obj_replication")
  private OspReplicationRuleStatus encryptedObjReplication = null;

  @SerializedName("naming_rule")
  private OspTargetNamingRule namingRule = null;

  @SerializedName("accurate_replication")
  private Boolean accurateReplication = null;

  public OspBucketUpdateReplicationRuleReqInfo name(String name) {
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

  public OspBucketUpdateReplicationRuleReqInfo internalReplication(Boolean internalReplication) {
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

  public OspBucketUpdateReplicationRuleReqInfo destination(List<OspReplicationDestination> destination) {
    this.destination = destination;
    return this;
  }

  public OspBucketUpdateReplicationRuleReqInfo addDestinationItem(OspReplicationDestination destinationItem) {
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

  public OspBucketUpdateReplicationRuleReqInfo deleteReplication(OspReplicationRuleStatus deleteReplication) {
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

  public OspBucketUpdateReplicationRuleReqInfo filter(OspBucketFilter filter) {
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

  public OspBucketUpdateReplicationRuleReqInfo existObjReplication(OspReplicationRuleStatus existObjReplication) {
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

  public OspBucketUpdateReplicationRuleReqInfo encryptedObjReplication(OspReplicationRuleStatus encryptedObjReplication) {
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

  public OspBucketUpdateReplicationRuleReqInfo namingRule(OspTargetNamingRule namingRule) {
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

  public OspBucketUpdateReplicationRuleReqInfo accurateReplication(Boolean accurateReplication) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketUpdateReplicationRuleReqInfo ospBucketUpdateReplicationRuleReqInfo = (OspBucketUpdateReplicationRuleReqInfo) o;
    return Objects.equals(this.name, ospBucketUpdateReplicationRuleReqInfo.name) &&
        Objects.equals(this.internalReplication, ospBucketUpdateReplicationRuleReqInfo.internalReplication) &&
        Objects.equals(this.destination, ospBucketUpdateReplicationRuleReqInfo.destination) &&
        Objects.equals(this.deleteReplication, ospBucketUpdateReplicationRuleReqInfo.deleteReplication) &&
        Objects.equals(this.filter, ospBucketUpdateReplicationRuleReqInfo.filter) &&
        Objects.equals(this.existObjReplication, ospBucketUpdateReplicationRuleReqInfo.existObjReplication) &&
        Objects.equals(this.encryptedObjReplication, ospBucketUpdateReplicationRuleReqInfo.encryptedObjReplication) &&
        Objects.equals(this.namingRule, ospBucketUpdateReplicationRuleReqInfo.namingRule) &&
        Objects.equals(this.accurateReplication, ospBucketUpdateReplicationRuleReqInfo.accurateReplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, internalReplication, destination, deleteReplication, filter, existObjReplication, encryptedObjReplication, namingRule, accurateReplication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketUpdateReplicationRuleReqInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    internalReplication: ").append(toIndentedString(internalReplication)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    deleteReplication: ").append(toIndentedString(deleteReplication)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    existObjReplication: ").append(toIndentedString(existObjReplication)).append("\n");
    sb.append("    encryptedObjReplication: ").append(toIndentedString(encryptedObjReplication)).append("\n");
    sb.append("    namingRule: ").append(toIndentedString(namingRule)).append("\n");
    sb.append("    accurateReplication: ").append(toIndentedString(accurateReplication)).append("\n");
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