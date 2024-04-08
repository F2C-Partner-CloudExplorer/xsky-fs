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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
/**
 * DfsQosPolicy defines model of dfs qos policy +X:model:generate;order_by&#x3D;-ID;plur&#x3D;DfsQosPolicies;check_get&#x3D;i18n;detailed;etcd_lock&#x3D;with_get;with_detailed; +X:benchmark:
 */
@Schema(description = "DfsQosPolicy defines model of dfs qos policy +X:model:generate;order_by=-ID;plur=DfsQosPolicies;check_get=i18n;detailed;etcd_lock=with_get;with_detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsQosPolicy {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dir_num")
  private Long dirNum = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("read_bandwidth")
  private Long readBandwidth = null;

  @SerializedName("read_object")
  private Long readObject = null;

  @SerializedName("total_bandwidth")
  private Long totalBandwidth = null;

  @SerializedName("total_object")
  private Long totalObject = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("write_bandwidth")
  private Long writeBandwidth = null;

  @SerializedName("write_object")
  private Long writeObject = null;

  public DfsQosPolicy actionStatus(String actionStatus) {
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

  public DfsQosPolicy cluster(ClusterNestview cluster) {
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

  public DfsQosPolicy create(OffsetDateTime create) {
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

  public DfsQosPolicy description(String description) {
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

  public DfsQosPolicy dirNum(Long dirNum) {
    this.dirNum = dirNum;
    return this;
  }

   /**
   * Get dirNum
   * @return dirNum
  **/
  @Schema(description = "")
  public Long getDirNum() {
    return dirNum;
  }

  public void setDirNum(Long dirNum) {
    this.dirNum = dirNum;
  }

  public DfsQosPolicy id(Long id) {
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

  public DfsQosPolicy name(String name) {
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

  public DfsQosPolicy readBandwidth(Long readBandwidth) {
    this.readBandwidth = readBandwidth;
    return this;
  }

   /**
   * Get readBandwidth
   * @return readBandwidth
  **/
  @Schema(description = "")
  public Long getReadBandwidth() {
    return readBandwidth;
  }

  public void setReadBandwidth(Long readBandwidth) {
    this.readBandwidth = readBandwidth;
  }

  public DfsQosPolicy readObject(Long readObject) {
    this.readObject = readObject;
    return this;
  }

   /**
   * Get readObject
   * @return readObject
  **/
  @Schema(description = "")
  public Long getReadObject() {
    return readObject;
  }

  public void setReadObject(Long readObject) {
    this.readObject = readObject;
  }

  public DfsQosPolicy totalBandwidth(Long totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
    return this;
  }

   /**
   * Get totalBandwidth
   * @return totalBandwidth
  **/
  @Schema(description = "")
  public Long getTotalBandwidth() {
    return totalBandwidth;
  }

  public void setTotalBandwidth(Long totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
  }

  public DfsQosPolicy totalObject(Long totalObject) {
    this.totalObject = totalObject;
    return this;
  }

   /**
   * Get totalObject
   * @return totalObject
  **/
  @Schema(description = "")
  public Long getTotalObject() {
    return totalObject;
  }

  public void setTotalObject(Long totalObject) {
    this.totalObject = totalObject;
  }

  public DfsQosPolicy update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public DfsQosPolicy writeBandwidth(Long writeBandwidth) {
    this.writeBandwidth = writeBandwidth;
    return this;
  }

   /**
   * Get writeBandwidth
   * @return writeBandwidth
  **/
  @Schema(description = "")
  public Long getWriteBandwidth() {
    return writeBandwidth;
  }

  public void setWriteBandwidth(Long writeBandwidth) {
    this.writeBandwidth = writeBandwidth;
  }

  public DfsQosPolicy writeObject(Long writeObject) {
    this.writeObject = writeObject;
    return this;
  }

   /**
   * Get writeObject
   * @return writeObject
  **/
  @Schema(description = "")
  public Long getWriteObject() {
    return writeObject;
  }

  public void setWriteObject(Long writeObject) {
    this.writeObject = writeObject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsQosPolicy dfsQosPolicy = (DfsQosPolicy) o;
    return Objects.equals(this.actionStatus, dfsQosPolicy.actionStatus) &&
        Objects.equals(this.cluster, dfsQosPolicy.cluster) &&
        Objects.equals(this.create, dfsQosPolicy.create) &&
        Objects.equals(this.description, dfsQosPolicy.description) &&
        Objects.equals(this.dirNum, dfsQosPolicy.dirNum) &&
        Objects.equals(this.id, dfsQosPolicy.id) &&
        Objects.equals(this.name, dfsQosPolicy.name) &&
        Objects.equals(this.readBandwidth, dfsQosPolicy.readBandwidth) &&
        Objects.equals(this.readObject, dfsQosPolicy.readObject) &&
        Objects.equals(this.totalBandwidth, dfsQosPolicy.totalBandwidth) &&
        Objects.equals(this.totalObject, dfsQosPolicy.totalObject) &&
        Objects.equals(this.update, dfsQosPolicy.update) &&
        Objects.equals(this.writeBandwidth, dfsQosPolicy.writeBandwidth) &&
        Objects.equals(this.writeObject, dfsQosPolicy.writeObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, create, description, dirNum, id, name, readBandwidth, readObject, totalBandwidth, totalObject, update, writeBandwidth, writeObject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsQosPolicy {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dirNum: ").append(toIndentedString(dirNum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readBandwidth: ").append(toIndentedString(readBandwidth)).append("\n");
    sb.append("    readObject: ").append(toIndentedString(readObject)).append("\n");
    sb.append("    totalBandwidth: ").append(toIndentedString(totalBandwidth)).append("\n");
    sb.append("    totalObject: ").append(toIndentedString(totalObject)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    writeBandwidth: ").append(toIndentedString(writeBandwidth)).append("\n");
    sb.append("    writeObject: ").append(toIndentedString(writeObject)).append("\n");
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
