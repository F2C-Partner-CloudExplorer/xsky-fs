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
import xio.sds.client.model.OspDataBackendStatus;
import xio.sds.client.model.OspParamMap;
import xio.sds.client.model.OspVersioningStatus;
/**
 * OspDataBackendTarget
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspDataBackendTarget {
  @SerializedName("err_cause")
  private String errCause = null;

  @SerializedName("max_objects")
  private Long maxObjects = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private OspDataBackendStatus status = null;

  @SerializedName("pool_id")
  private Long poolId = null;

  @SerializedName("resource_status")
  private String resourceStatus = null;

  @SerializedName("compatible")
  private String compatible = null;

  @SerializedName("snapshot_enable")
  private String snapshotEnable = null;

  @SerializedName("connected")
  private Boolean connected = null;

  @SerializedName("versioning_status")
  private OspVersioningStatus versioningStatus = null;

  @SerializedName("params")
  private OspParamMap params = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("max_size")
  private Long maxSize = null;

  @SerializedName("target")
  private String target = null;

  public OspDataBackendTarget errCause(String errCause) {
    this.errCause = errCause;
    return this;
  }

   /**
   * Get errCause
   * @return errCause
  **/
  @Schema(description = "")
  public String getErrCause() {
    return errCause;
  }

  public void setErrCause(String errCause) {
    this.errCause = errCause;
  }

  public OspDataBackendTarget maxObjects(Long maxObjects) {
    this.maxObjects = maxObjects;
    return this;
  }

   /**
   * Get maxObjects
   * @return maxObjects
  **/
  @Schema(description = "")
  public Long getMaxObjects() {
    return maxObjects;
  }

  public void setMaxObjects(Long maxObjects) {
    this.maxObjects = maxObjects;
  }

  public OspDataBackendTarget description(String description) {
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

  public OspDataBackendTarget status(OspDataBackendStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public OspDataBackendStatus getStatus() {
    return status;
  }

  public void setStatus(OspDataBackendStatus status) {
    this.status = status;
  }

  public OspDataBackendTarget poolId(Long poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * Get poolId
   * @return poolId
  **/
  @Schema(description = "")
  public Long getPoolId() {
    return poolId;
  }

  public void setPoolId(Long poolId) {
    this.poolId = poolId;
  }

  public OspDataBackendTarget resourceStatus(String resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

   /**
   * Get resourceStatus
   * @return resourceStatus
  **/
  @Schema(description = "")
  public String getResourceStatus() {
    return resourceStatus;
  }

  public void setResourceStatus(String resourceStatus) {
    this.resourceStatus = resourceStatus;
  }

  public OspDataBackendTarget compatible(String compatible) {
    this.compatible = compatible;
    return this;
  }

   /**
   * Get compatible
   * @return compatible
  **/
  @Schema(description = "")
  public String getCompatible() {
    return compatible;
  }

  public void setCompatible(String compatible) {
    this.compatible = compatible;
  }

  public OspDataBackendTarget snapshotEnable(String snapshotEnable) {
    this.snapshotEnable = snapshotEnable;
    return this;
  }

   /**
   * Get snapshotEnable
   * @return snapshotEnable
  **/
  @Schema(description = "")
  public String getSnapshotEnable() {
    return snapshotEnable;
  }

  public void setSnapshotEnable(String snapshotEnable) {
    this.snapshotEnable = snapshotEnable;
  }

  public OspDataBackendTarget connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @Schema(description = "")
  public Boolean isConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public OspDataBackendTarget versioningStatus(OspVersioningStatus versioningStatus) {
    this.versioningStatus = versioningStatus;
    return this;
  }

   /**
   * Get versioningStatus
   * @return versioningStatus
  **/
  @Schema(description = "")
  public OspVersioningStatus getVersioningStatus() {
    return versioningStatus;
  }

  public void setVersioningStatus(OspVersioningStatus versioningStatus) {
    this.versioningStatus = versioningStatus;
  }

  public OspDataBackendTarget params(OspParamMap params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @Schema(description = "")
  public OspParamMap getParams() {
    return params;
  }

  public void setParams(OspParamMap params) {
    this.params = params;
  }

  public OspDataBackendTarget id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OspDataBackendTarget maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Get maxSize
   * @return maxSize
  **/
  @Schema(description = "")
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public OspDataBackendTarget target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @Schema(description = "")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspDataBackendTarget ospDataBackendTarget = (OspDataBackendTarget) o;
    return Objects.equals(this.errCause, ospDataBackendTarget.errCause) &&
        Objects.equals(this.maxObjects, ospDataBackendTarget.maxObjects) &&
        Objects.equals(this.description, ospDataBackendTarget.description) &&
        Objects.equals(this.status, ospDataBackendTarget.status) &&
        Objects.equals(this.poolId, ospDataBackendTarget.poolId) &&
        Objects.equals(this.resourceStatus, ospDataBackendTarget.resourceStatus) &&
        Objects.equals(this.compatible, ospDataBackendTarget.compatible) &&
        Objects.equals(this.snapshotEnable, ospDataBackendTarget.snapshotEnable) &&
        Objects.equals(this.connected, ospDataBackendTarget.connected) &&
        Objects.equals(this.versioningStatus, ospDataBackendTarget.versioningStatus) &&
        Objects.equals(this.params, ospDataBackendTarget.params) &&
        Objects.equals(this.id, ospDataBackendTarget.id) &&
        Objects.equals(this.maxSize, ospDataBackendTarget.maxSize) &&
        Objects.equals(this.target, ospDataBackendTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errCause, maxObjects, description, status, poolId, resourceStatus, compatible, snapshotEnable, connected, versioningStatus, params, id, maxSize, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspDataBackendTarget {\n");
    
    sb.append("    errCause: ").append(toIndentedString(errCause)).append("\n");
    sb.append("    maxObjects: ").append(toIndentedString(maxObjects)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    resourceStatus: ").append(toIndentedString(resourceStatus)).append("\n");
    sb.append("    compatible: ").append(toIndentedString(compatible)).append("\n");
    sb.append("    snapshotEnable: ").append(toIndentedString(snapshotEnable)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    versioningStatus: ").append(toIndentedString(versioningStatus)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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