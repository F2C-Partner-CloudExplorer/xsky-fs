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
import xio.sds.client.model.OspDataBackendPlatformInfo;
import xio.sds.client.model.OspDataBackendPlatformType;
import xio.sds.client.model.OspDataBackendTarget;
/**
 * OspDataBackendUniqueCheckReqBackend
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspDataBackendUniqueCheckReqBackend {
  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("platform")
  private OspDataBackendPlatformInfo platform = null;

  @SerializedName("outside")
  private Boolean outside = null;

  @SerializedName("share_path")
  private String sharePath = null;

  @SerializedName("storage_cluster_id")
  private Long storageClusterId = null;

  @SerializedName("type")
  private OspDataBackendPlatformType type = null;

  @SerializedName("targets")
  private List<OspDataBackendTarget> targets = null;

  @SerializedName("outside_fs_id")
  private String outsideFsId = null;

  public OspDataBackendUniqueCheckReqBackend endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public OspDataBackendUniqueCheckReqBackend name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OspDataBackendUniqueCheckReqBackend region(String region) {
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

  public OspDataBackendUniqueCheckReqBackend platform(OspDataBackendPlatformInfo platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(required = true, description = "")
  public OspDataBackendPlatformInfo getPlatform() {
    return platform;
  }

  public void setPlatform(OspDataBackendPlatformInfo platform) {
    this.platform = platform;
  }

  public OspDataBackendUniqueCheckReqBackend outside(Boolean outside) {
    this.outside = outside;
    return this;
  }

   /**
   * Get outside
   * @return outside
  **/
  @Schema(description = "")
  public Boolean isOutside() {
    return outside;
  }

  public void setOutside(Boolean outside) {
    this.outside = outside;
  }

  public OspDataBackendUniqueCheckReqBackend sharePath(String sharePath) {
    this.sharePath = sharePath;
    return this;
  }

   /**
   * Get sharePath
   * @return sharePath
  **/
  @Schema(description = "")
  public String getSharePath() {
    return sharePath;
  }

  public void setSharePath(String sharePath) {
    this.sharePath = sharePath;
  }

  public OspDataBackendUniqueCheckReqBackend storageClusterId(Long storageClusterId) {
    this.storageClusterId = storageClusterId;
    return this;
  }

   /**
   * Get storageClusterId
   * @return storageClusterId
  **/
  @Schema(description = "")
  public Long getStorageClusterId() {
    return storageClusterId;
  }

  public void setStorageClusterId(Long storageClusterId) {
    this.storageClusterId = storageClusterId;
  }

  public OspDataBackendUniqueCheckReqBackend type(OspDataBackendPlatformType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public OspDataBackendPlatformType getType() {
    return type;
  }

  public void setType(OspDataBackendPlatformType type) {
    this.type = type;
  }

  public OspDataBackendUniqueCheckReqBackend targets(List<OspDataBackendTarget> targets) {
    this.targets = targets;
    return this;
  }

  public OspDataBackendUniqueCheckReqBackend addTargetsItem(OspDataBackendTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<OspDataBackendTarget>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(description = "")
  public List<OspDataBackendTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<OspDataBackendTarget> targets) {
    this.targets = targets;
  }

  public OspDataBackendUniqueCheckReqBackend outsideFsId(String outsideFsId) {
    this.outsideFsId = outsideFsId;
    return this;
  }

   /**
   * Get outsideFsId
   * @return outsideFsId
  **/
  @Schema(description = "")
  public String getOutsideFsId() {
    return outsideFsId;
  }

  public void setOutsideFsId(String outsideFsId) {
    this.outsideFsId = outsideFsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspDataBackendUniqueCheckReqBackend ospDataBackendUniqueCheckReqBackend = (OspDataBackendUniqueCheckReqBackend) o;
    return Objects.equals(this.endpoint, ospDataBackendUniqueCheckReqBackend.endpoint) &&
        Objects.equals(this.name, ospDataBackendUniqueCheckReqBackend.name) &&
        Objects.equals(this.region, ospDataBackendUniqueCheckReqBackend.region) &&
        Objects.equals(this.platform, ospDataBackendUniqueCheckReqBackend.platform) &&
        Objects.equals(this.outside, ospDataBackendUniqueCheckReqBackend.outside) &&
        Objects.equals(this.sharePath, ospDataBackendUniqueCheckReqBackend.sharePath) &&
        Objects.equals(this.storageClusterId, ospDataBackendUniqueCheckReqBackend.storageClusterId) &&
        Objects.equals(this.type, ospDataBackendUniqueCheckReqBackend.type) &&
        Objects.equals(this.targets, ospDataBackendUniqueCheckReqBackend.targets) &&
        Objects.equals(this.outsideFsId, ospDataBackendUniqueCheckReqBackend.outsideFsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, name, region, platform, outside, sharePath, storageClusterId, type, targets, outsideFsId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspDataBackendUniqueCheckReqBackend {\n");
    
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    outside: ").append(toIndentedString(outside)).append("\n");
    sb.append("    sharePath: ").append(toIndentedString(sharePath)).append("\n");
    sb.append("    storageClusterId: ").append(toIndentedString(storageClusterId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    outsideFsId: ").append(toIndentedString(outsideFsId)).append("\n");
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
