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
import xio.sds.client.model.OspNestedDatacenter;
import xio.sds.client.model.OspZoneStat;
/**
 * OspZoneRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspZoneRecord {
  @SerializedName("status")
  private String status = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("create")
  private String create = null;

  @SerializedName("update")
  private String update = null;

  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("system_access_key")
  private String systemAccessKey = null;

  @SerializedName("system_secret_key")
  private String systemSecretKey = null;

  @SerializedName("samples")
  private List<OspZoneStat> samples = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("datacenters")
  private List<OspNestedDatacenter> datacenters = null;

  @SerializedName("endpoints")
  private List<String> endpoints = null;

  @SerializedName("id")
  private Long id = null;

  public OspZoneRecord status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OspZoneRecord name(String name) {
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

  public OspZoneRecord create(String create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public String getCreate() {
    return create;
  }

  public void setCreate(String create) {
    this.create = create;
  }

  public OspZoneRecord update(String update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public String getUpdate() {
    return update;
  }

  public void setUpdate(String update) {
    this.update = update;
  }

  public OspZoneRecord actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public OspZoneRecord systemAccessKey(String systemAccessKey) {
    this.systemAccessKey = systemAccessKey;
    return this;
  }

   /**
   * Get systemAccessKey
   * @return systemAccessKey
  **/
  @Schema(description = "")
  public String getSystemAccessKey() {
    return systemAccessKey;
  }

  public void setSystemAccessKey(String systemAccessKey) {
    this.systemAccessKey = systemAccessKey;
  }

  public OspZoneRecord systemSecretKey(String systemSecretKey) {
    this.systemSecretKey = systemSecretKey;
    return this;
  }

   /**
   * Get systemSecretKey
   * @return systemSecretKey
  **/
  @Schema(description = "")
  public String getSystemSecretKey() {
    return systemSecretKey;
  }

  public void setSystemSecretKey(String systemSecretKey) {
    this.systemSecretKey = systemSecretKey;
  }

  public OspZoneRecord samples(List<OspZoneStat> samples) {
    this.samples = samples;
    return this;
  }

  public OspZoneRecord addSamplesItem(OspZoneStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<OspZoneStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<OspZoneStat> getSamples() {
    return samples;
  }

  public void setSamples(List<OspZoneStat> samples) {
    this.samples = samples;
  }

  public OspZoneRecord region(String region) {
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

  public OspZoneRecord datacenters(List<OspNestedDatacenter> datacenters) {
    this.datacenters = datacenters;
    return this;
  }

  public OspZoneRecord addDatacentersItem(OspNestedDatacenter datacentersItem) {
    if (this.datacenters == null) {
      this.datacenters = new ArrayList<OspNestedDatacenter>();
    }
    this.datacenters.add(datacentersItem);
    return this;
  }

   /**
   * Get datacenters
   * @return datacenters
  **/
  @Schema(description = "")
  public List<OspNestedDatacenter> getDatacenters() {
    return datacenters;
  }

  public void setDatacenters(List<OspNestedDatacenter> datacenters) {
    this.datacenters = datacenters;
  }

  public OspZoneRecord endpoints(List<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public OspZoneRecord addEndpointsItem(String endpointsItem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<String>();
    }
    this.endpoints.add(endpointsItem);
    return this;
  }

   /**
   * Get endpoints
   * @return endpoints
  **/
  @Schema(description = "")
  public List<String> getEndpoints() {
    return endpoints;
  }

  public void setEndpoints(List<String> endpoints) {
    this.endpoints = endpoints;
  }

  public OspZoneRecord id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspZoneRecord ospZoneRecord = (OspZoneRecord) o;
    return Objects.equals(this.status, ospZoneRecord.status) &&
        Objects.equals(this.name, ospZoneRecord.name) &&
        Objects.equals(this.create, ospZoneRecord.create) &&
        Objects.equals(this.update, ospZoneRecord.update) &&
        Objects.equals(this.actionStatus, ospZoneRecord.actionStatus) &&
        Objects.equals(this.systemAccessKey, ospZoneRecord.systemAccessKey) &&
        Objects.equals(this.systemSecretKey, ospZoneRecord.systemSecretKey) &&
        Objects.equals(this.samples, ospZoneRecord.samples) &&
        Objects.equals(this.region, ospZoneRecord.region) &&
        Objects.equals(this.datacenters, ospZoneRecord.datacenters) &&
        Objects.equals(this.endpoints, ospZoneRecord.endpoints) &&
        Objects.equals(this.id, ospZoneRecord.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, name, create, update, actionStatus, systemAccessKey, systemSecretKey, samples, region, datacenters, endpoints, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspZoneRecord {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    systemAccessKey: ").append(toIndentedString(systemAccessKey)).append("\n");
    sb.append("    systemSecretKey: ").append(toIndentedString(systemSecretKey)).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
