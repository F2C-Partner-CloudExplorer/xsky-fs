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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xio.sds.client.model.OsdQos;
import xio.sds.client.model.PoolRuleReq;
import xio.sds.client.model.RawMessage;
/**
 * PoolUpdateReqPool
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class PoolUpdateReqPool {
  @SerializedName("compress_algorithm")
  private String compressAlgorithm = null;

  @SerializedName("compressed")
  private Boolean compressed = null;

  @SerializedName("default_managed_volume_format")
  private Long defaultManagedVolumeFormat = null;

  @SerializedName("failure_domain_type")
  private String failureDomainType = null;

  @SerializedName("io_bypass_enabled")
  private Boolean ioBypassEnabled = null;

  @SerializedName("io_bypass_mode")
  private String ioBypassMode = null;

  @SerializedName("io_bypass_threshold")
  private Long ioBypassThreshold = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("out_failure_domain_num")
  private Long outFailureDomainNum = null;

  @SerializedName("primary_placement_node_id")
  private Long primaryPlacementNodeId = null;

  @SerializedName("property")
  private Map<String, RawMessage> property = null;

  @SerializedName("qos")
  private OsdQos qos = null;

  @SerializedName("ruleset")
  private List<PoolRuleReq> ruleset = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("thin_provisioned")
  private Boolean thinProvisioned = null;

  public PoolUpdateReqPool compressAlgorithm(String compressAlgorithm) {
    this.compressAlgorithm = compressAlgorithm;
    return this;
  }

   /**
   * Get compressAlgorithm
   * @return compressAlgorithm
  **/
  @Schema(description = "")
  public String getCompressAlgorithm() {
    return compressAlgorithm;
  }

  public void setCompressAlgorithm(String compressAlgorithm) {
    this.compressAlgorithm = compressAlgorithm;
  }

  public PoolUpdateReqPool compressed(Boolean compressed) {
    this.compressed = compressed;
    return this;
  }

   /**
   * Get compressed
   * @return compressed
  **/
  @Schema(description = "")
  public Boolean isCompressed() {
    return compressed;
  }

  public void setCompressed(Boolean compressed) {
    this.compressed = compressed;
  }

  public PoolUpdateReqPool defaultManagedVolumeFormat(Long defaultManagedVolumeFormat) {
    this.defaultManagedVolumeFormat = defaultManagedVolumeFormat;
    return this;
  }

   /**
   * default managed volume format: 128 or 129
   * @return defaultManagedVolumeFormat
  **/
  @Schema(description = "default managed volume format: 128 or 129")
  public Long getDefaultManagedVolumeFormat() {
    return defaultManagedVolumeFormat;
  }

  public void setDefaultManagedVolumeFormat(Long defaultManagedVolumeFormat) {
    this.defaultManagedVolumeFormat = defaultManagedVolumeFormat;
  }

  public PoolUpdateReqPool failureDomainType(String failureDomainType) {
    this.failureDomainType = failureDomainType;
    return this;
  }

   /**
   * Get failureDomainType
   * @return failureDomainType
  **/
  @Schema(description = "")
  public String getFailureDomainType() {
    return failureDomainType;
  }

  public void setFailureDomainType(String failureDomainType) {
    this.failureDomainType = failureDomainType;
  }

  public PoolUpdateReqPool ioBypassEnabled(Boolean ioBypassEnabled) {
    this.ioBypassEnabled = ioBypassEnabled;
    return this;
  }

   /**
   * Get ioBypassEnabled
   * @return ioBypassEnabled
  **/
  @Schema(description = "")
  public Boolean isIoBypassEnabled() {
    return ioBypassEnabled;
  }

  public void setIoBypassEnabled(Boolean ioBypassEnabled) {
    this.ioBypassEnabled = ioBypassEnabled;
  }

  public PoolUpdateReqPool ioBypassMode(String ioBypassMode) {
    this.ioBypassMode = ioBypassMode;
    return this;
  }

   /**
   * Get ioBypassMode
   * @return ioBypassMode
  **/
  @Schema(description = "")
  public String getIoBypassMode() {
    return ioBypassMode;
  }

  public void setIoBypassMode(String ioBypassMode) {
    this.ioBypassMode = ioBypassMode;
  }

  public PoolUpdateReqPool ioBypassThreshold(Long ioBypassThreshold) {
    this.ioBypassThreshold = ioBypassThreshold;
    return this;
  }

   /**
   * Get ioBypassThreshold
   * @return ioBypassThreshold
  **/
  @Schema(description = "")
  public Long getIoBypassThreshold() {
    return ioBypassThreshold;
  }

  public void setIoBypassThreshold(Long ioBypassThreshold) {
    this.ioBypassThreshold = ioBypassThreshold;
  }

  public PoolUpdateReqPool name(String name) {
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

  public PoolUpdateReqPool outFailureDomainNum(Long outFailureDomainNum) {
    this.outFailureDomainNum = outFailureDomainNum;
    return this;
  }

   /**
   * ec k+m:h&lt;-&gt;k+m
   * @return outFailureDomainNum
  **/
  @Schema(description = "ec k+m:h<->k+m")
  public Long getOutFailureDomainNum() {
    return outFailureDomainNum;
  }

  public void setOutFailureDomainNum(Long outFailureDomainNum) {
    this.outFailureDomainNum = outFailureDomainNum;
  }

  public PoolUpdateReqPool primaryPlacementNodeId(Long primaryPlacementNodeId) {
    this.primaryPlacementNodeId = primaryPlacementNodeId;
    return this;
  }

   /**
   * Get primaryPlacementNodeId
   * @return primaryPlacementNodeId
  **/
  @Schema(description = "")
  public Long getPrimaryPlacementNodeId() {
    return primaryPlacementNodeId;
  }

  public void setPrimaryPlacementNodeId(Long primaryPlacementNodeId) {
    this.primaryPlacementNodeId = primaryPlacementNodeId;
  }

  public PoolUpdateReqPool property(Map<String, RawMessage> property) {
    this.property = property;
    return this;
  }

  public PoolUpdateReqPool putPropertyItem(String key, RawMessage propertyItem) {
    if (this.property == null) {
      this.property = new HashMap<String, RawMessage>();
    }
    this.property.put(key, propertyItem);
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @Schema(description = "")
  public Map<String, RawMessage> getProperty() {
    return property;
  }

  public void setProperty(Map<String, RawMessage> property) {
    this.property = property;
  }

  public PoolUpdateReqPool qos(OsdQos qos) {
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @Schema(description = "")
  public OsdQos getQos() {
    return qos;
  }

  public void setQos(OsdQos qos) {
    this.qos = qos;
  }

  public PoolUpdateReqPool ruleset(List<PoolRuleReq> ruleset) {
    this.ruleset = ruleset;
    return this;
  }

  public PoolUpdateReqPool addRulesetItem(PoolRuleReq rulesetItem) {
    if (this.ruleset == null) {
      this.ruleset = new ArrayList<PoolRuleReq>();
    }
    this.ruleset.add(rulesetItem);
    return this;
  }

   /**
   * Get ruleset
   * @return ruleset
  **/
  @Schema(description = "")
  public List<PoolRuleReq> getRuleset() {
    return ruleset;
  }

  public void setRuleset(List<PoolRuleReq> ruleset) {
    this.ruleset = ruleset;
  }

  public PoolUpdateReqPool size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public PoolUpdateReqPool thinProvisioned(Boolean thinProvisioned) {
    this.thinProvisioned = thinProvisioned;
    return this;
  }

   /**
   * Get thinProvisioned
   * @return thinProvisioned
  **/
  @Schema(description = "")
  public Boolean isThinProvisioned() {
    return thinProvisioned;
  }

  public void setThinProvisioned(Boolean thinProvisioned) {
    this.thinProvisioned = thinProvisioned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolUpdateReqPool poolUpdateReqPool = (PoolUpdateReqPool) o;
    return Objects.equals(this.compressAlgorithm, poolUpdateReqPool.compressAlgorithm) &&
        Objects.equals(this.compressed, poolUpdateReqPool.compressed) &&
        Objects.equals(this.defaultManagedVolumeFormat, poolUpdateReqPool.defaultManagedVolumeFormat) &&
        Objects.equals(this.failureDomainType, poolUpdateReqPool.failureDomainType) &&
        Objects.equals(this.ioBypassEnabled, poolUpdateReqPool.ioBypassEnabled) &&
        Objects.equals(this.ioBypassMode, poolUpdateReqPool.ioBypassMode) &&
        Objects.equals(this.ioBypassThreshold, poolUpdateReqPool.ioBypassThreshold) &&
        Objects.equals(this.name, poolUpdateReqPool.name) &&
        Objects.equals(this.outFailureDomainNum, poolUpdateReqPool.outFailureDomainNum) &&
        Objects.equals(this.primaryPlacementNodeId, poolUpdateReqPool.primaryPlacementNodeId) &&
        Objects.equals(this.property, poolUpdateReqPool.property) &&
        Objects.equals(this.qos, poolUpdateReqPool.qos) &&
        Objects.equals(this.ruleset, poolUpdateReqPool.ruleset) &&
        Objects.equals(this.size, poolUpdateReqPool.size) &&
        Objects.equals(this.thinProvisioned, poolUpdateReqPool.thinProvisioned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compressAlgorithm, compressed, defaultManagedVolumeFormat, failureDomainType, ioBypassEnabled, ioBypassMode, ioBypassThreshold, name, outFailureDomainNum, primaryPlacementNodeId, property, qos, ruleset, size, thinProvisioned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolUpdateReqPool {\n");
    
    sb.append("    compressAlgorithm: ").append(toIndentedString(compressAlgorithm)).append("\n");
    sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
    sb.append("    defaultManagedVolumeFormat: ").append(toIndentedString(defaultManagedVolumeFormat)).append("\n");
    sb.append("    failureDomainType: ").append(toIndentedString(failureDomainType)).append("\n");
    sb.append("    ioBypassEnabled: ").append(toIndentedString(ioBypassEnabled)).append("\n");
    sb.append("    ioBypassMode: ").append(toIndentedString(ioBypassMode)).append("\n");
    sb.append("    ioBypassThreshold: ").append(toIndentedString(ioBypassThreshold)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outFailureDomainNum: ").append(toIndentedString(outFailureDomainNum)).append("\n");
    sb.append("    primaryPlacementNodeId: ").append(toIndentedString(primaryPlacementNodeId)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    ruleset: ").append(toIndentedString(ruleset)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thinProvisioned: ").append(toIndentedString(thinProvisioned)).append("\n");
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