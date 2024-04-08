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
import xio.sds.client.model.ProductInfo;
import xio.sds.client.model.ProductLimits;
import xio.sds.client.model.UsedQuota;
/**
 * LicenseSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class LicenseSummary {
  @SerializedName("capacity_base")
  private Long capacityBase = null;

  @SerializedName("expired_features")
  private List<String> expiredFeatures = new ArrayList<String>();

  @SerializedName("expired_protocols")
  private List<String> expiredProtocols = new ArrayList<String>();

  @SerializedName("features")
  private List<String> features = new ArrayList<String>();

  @SerializedName("limits")
  private ProductLimits limits = null;

  @SerializedName("osp_capacity_base")
  private Long ospCapacityBase = null;

  @SerializedName("product_info")
  private ProductInfo productInfo = null;

  @SerializedName("protocols")
  private List<String> protocols = new ArrayList<String>();

  @SerializedName("used_quota")
  private UsedQuota usedQuota = null;

  public LicenseSummary capacityBase(Long capacityBase) {
    this.capacityBase = capacityBase;
    return this;
  }

   /**
   * Get capacityBase
   * @return capacityBase
  **/
  @Schema(required = true, description = "")
  public Long getCapacityBase() {
    return capacityBase;
  }

  public void setCapacityBase(Long capacityBase) {
    this.capacityBase = capacityBase;
  }

  public LicenseSummary expiredFeatures(List<String> expiredFeatures) {
    this.expiredFeatures = expiredFeatures;
    return this;
  }

  public LicenseSummary addExpiredFeaturesItem(String expiredFeaturesItem) {
    this.expiredFeatures.add(expiredFeaturesItem);
    return this;
  }

   /**
   * Get expiredFeatures
   * @return expiredFeatures
  **/
  @Schema(required = true, description = "")
  public List<String> getExpiredFeatures() {
    return expiredFeatures;
  }

  public void setExpiredFeatures(List<String> expiredFeatures) {
    this.expiredFeatures = expiredFeatures;
  }

  public LicenseSummary expiredProtocols(List<String> expiredProtocols) {
    this.expiredProtocols = expiredProtocols;
    return this;
  }

  public LicenseSummary addExpiredProtocolsItem(String expiredProtocolsItem) {
    this.expiredProtocols.add(expiredProtocolsItem);
    return this;
  }

   /**
   * Get expiredProtocols
   * @return expiredProtocols
  **/
  @Schema(required = true, description = "")
  public List<String> getExpiredProtocols() {
    return expiredProtocols;
  }

  public void setExpiredProtocols(List<String> expiredProtocols) {
    this.expiredProtocols = expiredProtocols;
  }

  public LicenseSummary features(List<String> features) {
    this.features = features;
    return this;
  }

  public LicenseSummary addFeaturesItem(String featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(required = true, description = "")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public LicenseSummary limits(ProductLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @Schema(required = true, description = "")
  public ProductLimits getLimits() {
    return limits;
  }

  public void setLimits(ProductLimits limits) {
    this.limits = limits;
  }

  public LicenseSummary ospCapacityBase(Long ospCapacityBase) {
    this.ospCapacityBase = ospCapacityBase;
    return this;
  }

   /**
   * Get ospCapacityBase
   * @return ospCapacityBase
  **/
  @Schema(required = true, description = "")
  public Long getOspCapacityBase() {
    return ospCapacityBase;
  }

  public void setOspCapacityBase(Long ospCapacityBase) {
    this.ospCapacityBase = ospCapacityBase;
  }

  public LicenseSummary productInfo(ProductInfo productInfo) {
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @Schema(required = true, description = "")
  public ProductInfo getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(ProductInfo productInfo) {
    this.productInfo = productInfo;
  }

  public LicenseSummary protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public LicenseSummary addProtocolsItem(String protocolsItem) {
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @Schema(required = true, description = "")
  public List<String> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }

  public LicenseSummary usedQuota(UsedQuota usedQuota) {
    this.usedQuota = usedQuota;
    return this;
  }

   /**
   * Get usedQuota
   * @return usedQuota
  **/
  @Schema(required = true, description = "")
  public UsedQuota getUsedQuota() {
    return usedQuota;
  }

  public void setUsedQuota(UsedQuota usedQuota) {
    this.usedQuota = usedQuota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseSummary licenseSummary = (LicenseSummary) o;
    return Objects.equals(this.capacityBase, licenseSummary.capacityBase) &&
        Objects.equals(this.expiredFeatures, licenseSummary.expiredFeatures) &&
        Objects.equals(this.expiredProtocols, licenseSummary.expiredProtocols) &&
        Objects.equals(this.features, licenseSummary.features) &&
        Objects.equals(this.limits, licenseSummary.limits) &&
        Objects.equals(this.ospCapacityBase, licenseSummary.ospCapacityBase) &&
        Objects.equals(this.productInfo, licenseSummary.productInfo) &&
        Objects.equals(this.protocols, licenseSummary.protocols) &&
        Objects.equals(this.usedQuota, licenseSummary.usedQuota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityBase, expiredFeatures, expiredProtocols, features, limits, ospCapacityBase, productInfo, protocols, usedQuota);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseSummary {\n");
    
    sb.append("    capacityBase: ").append(toIndentedString(capacityBase)).append("\n");
    sb.append("    expiredFeatures: ").append(toIndentedString(expiredFeatures)).append("\n");
    sb.append("    expiredProtocols: ").append(toIndentedString(expiredProtocols)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    ospCapacityBase: ").append(toIndentedString(ospCapacityBase)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    usedQuota: ").append(toIndentedString(usedQuota)).append("\n");
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
