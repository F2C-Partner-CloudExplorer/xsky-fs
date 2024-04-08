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
import xio.sds.client.model.OspBucketRuleTarget;
/**
 * OspBucketCreateRebuildRuleReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketCreateRebuildRuleReqInfo {
  @SerializedName("description")
  private String description = null;

  @SerializedName("accurate_rebuild")
  private Boolean accurateRebuild = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("filter")
  private OspBucketFilter filter = null;

  @SerializedName("object_name")
  private Boolean objectName = null;

  @SerializedName("zone_id")
  private Long zoneId = null;

  @SerializedName("origin_storage_class")
  private Long originStorageClass = null;

  @SerializedName("targets")
  private List<OspBucketRuleTarget> targets = null;

  @SerializedName("mode")
  private String mode = null;

  public OspBucketCreateRebuildRuleReqInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OspBucketCreateRebuildRuleReqInfo accurateRebuild(Boolean accurateRebuild) {
    this.accurateRebuild = accurateRebuild;
    return this;
  }

   /**
   * Get accurateRebuild
   * @return accurateRebuild
  **/
  @Schema(description = "")
  public Boolean isAccurateRebuild() {
    return accurateRebuild;
  }

  public void setAccurateRebuild(Boolean accurateRebuild) {
    this.accurateRebuild = accurateRebuild;
  }

  public OspBucketCreateRebuildRuleReqInfo prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public OspBucketCreateRebuildRuleReqInfo filter(OspBucketFilter filter) {
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

  public OspBucketCreateRebuildRuleReqInfo objectName(Boolean objectName) {
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @Schema(description = "")
  public Boolean isObjectName() {
    return objectName;
  }

  public void setObjectName(Boolean objectName) {
    this.objectName = objectName;
  }

  public OspBucketCreateRebuildRuleReqInfo zoneId(Long zoneId) {
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

  public OspBucketCreateRebuildRuleReqInfo originStorageClass(Long originStorageClass) {
    this.originStorageClass = originStorageClass;
    return this;
  }

   /**
   * Get originStorageClass
   * @return originStorageClass
  **/
  @Schema(description = "")
  public Long getOriginStorageClass() {
    return originStorageClass;
  }

  public void setOriginStorageClass(Long originStorageClass) {
    this.originStorageClass = originStorageClass;
  }

  public OspBucketCreateRebuildRuleReqInfo targets(List<OspBucketRuleTarget> targets) {
    this.targets = targets;
    return this;
  }

  public OspBucketCreateRebuildRuleReqInfo addTargetsItem(OspBucketRuleTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<OspBucketRuleTarget>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(description = "")
  public List<OspBucketRuleTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<OspBucketRuleTarget> targets) {
    this.targets = targets;
  }

  public OspBucketCreateRebuildRuleReqInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(description = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketCreateRebuildRuleReqInfo ospBucketCreateRebuildRuleReqInfo = (OspBucketCreateRebuildRuleReqInfo) o;
    return Objects.equals(this.description, ospBucketCreateRebuildRuleReqInfo.description) &&
        Objects.equals(this.accurateRebuild, ospBucketCreateRebuildRuleReqInfo.accurateRebuild) &&
        Objects.equals(this.prefix, ospBucketCreateRebuildRuleReqInfo.prefix) &&
        Objects.equals(this.filter, ospBucketCreateRebuildRuleReqInfo.filter) &&
        Objects.equals(this.objectName, ospBucketCreateRebuildRuleReqInfo.objectName) &&
        Objects.equals(this.zoneId, ospBucketCreateRebuildRuleReqInfo.zoneId) &&
        Objects.equals(this.originStorageClass, ospBucketCreateRebuildRuleReqInfo.originStorageClass) &&
        Objects.equals(this.targets, ospBucketCreateRebuildRuleReqInfo.targets) &&
        Objects.equals(this.mode, ospBucketCreateRebuildRuleReqInfo.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, accurateRebuild, prefix, filter, objectName, zoneId, originStorageClass, targets, mode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketCreateRebuildRuleReqInfo {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accurateRebuild: ").append(toIndentedString(accurateRebuild)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    originStorageClass: ").append(toIndentedString(originStorageClass)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
