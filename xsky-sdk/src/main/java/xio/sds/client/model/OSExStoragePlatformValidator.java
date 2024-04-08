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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
/**
 * OSExStoragePlatformValidator is the model of os external storage platform valdator +X:model:generate;check_get +X:benchmark:
 */
@Schema(description = "OSExStoragePlatformValidator is the model of os external storage platform valdator +X:model:generate;check_get +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSExStoragePlatformValidator {
  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("platform_info")
  private Object platformInfo = null;

  @SerializedName("results")
  private List<Object> results = null;

  @SerializedName("status")
  private String status = null;

  public OSExStoragePlatformValidator cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public OSExStoragePlatformValidator create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public OSExStoragePlatformValidator id(Long id) {
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

  public OSExStoragePlatformValidator platformInfo(Object platformInfo) {
    this.platformInfo = platformInfo;
    return this;
  }

   /**
   * Get platformInfo
   * @return platformInfo
  **/
  @Schema(description = "")
  public Object getPlatformInfo() {
    return platformInfo;
  }

  public void setPlatformInfo(Object platformInfo) {
    this.platformInfo = platformInfo;
  }

  public OSExStoragePlatformValidator results(List<Object> results) {
    this.results = results;
    return this;
  }

  public OSExStoragePlatformValidator addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Object>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @Schema(description = "")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }

  public OSExStoragePlatformValidator status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSExStoragePlatformValidator osExStoragePlatformValidator = (OSExStoragePlatformValidator) o;
    return Objects.equals(this.cluster, osExStoragePlatformValidator.cluster) &&
        Objects.equals(this.create, osExStoragePlatformValidator.create) &&
        Objects.equals(this.id, osExStoragePlatformValidator.id) &&
        Objects.equals(this.platformInfo, osExStoragePlatformValidator.platformInfo) &&
        Objects.equals(this.results, osExStoragePlatformValidator.results) &&
        Objects.equals(this.status, osExStoragePlatformValidator.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, create, id, platformInfo, results, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSExStoragePlatformValidator {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platformInfo: ").append(toIndentedString(platformInfo)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
