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
import xio.sds.client.model.ClusterNestview;
/**
 * ObjectStorageLifecycle is the model of object_storage_lifecycle +X:model:generate; +X:benchmark:
 */
@Schema(description = "ObjectStorageLifecycle is the model of object_storage_lifecycle +X:model:generate; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageLifecycle {
  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("rules")
  private List<Object> rules = null;

  @SerializedName("status")
  private String status = null;

  public ObjectStorageLifecycle cluster(ClusterNestview cluster) {
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

  public ObjectStorageLifecycle id(Long id) {
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

  public ObjectStorageLifecycle rules(List<Object> rules) {
    this.rules = rules;
    return this;
  }

  public ObjectStorageLifecycle addRulesItem(Object rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Object>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<Object> getRules() {
    return rules;
  }

  public void setRules(List<Object> rules) {
    this.rules = rules;
  }

  public ObjectStorageLifecycle status(String status) {
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
    ObjectStorageLifecycle objectStorageLifecycle = (ObjectStorageLifecycle) o;
    return Objects.equals(this.cluster, objectStorageLifecycle.cluster) &&
        Objects.equals(this.id, objectStorageLifecycle.id) &&
        Objects.equals(this.rules, objectStorageLifecycle.rules) &&
        Objects.equals(this.status, objectStorageLifecycle.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cluster, id, rules, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageLifecycle {\n");
    
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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