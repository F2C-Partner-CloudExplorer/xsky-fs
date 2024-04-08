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
/**
 * DfsQosPolicyCreateReqQosPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsQosPolicyCreateReqQosPolicy {
  @SerializedName("description")
  private String description = null;

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

  @SerializedName("write_bandwidth")
  private Long writeBandwidth = null;

  @SerializedName("write_object")
  private Long writeObject = null;

  public DfsQosPolicyCreateReqQosPolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description if dfs qos policy
   * @return description
  **/
  @Schema(description = "description if dfs qos policy")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DfsQosPolicyCreateReqQosPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of dfs qos policy
   * @return name
  **/
  @Schema(required = true, description = "name of dfs qos policy")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DfsQosPolicyCreateReqQosPolicy readBandwidth(Long readBandwidth) {
    this.readBandwidth = readBandwidth;
    return this;
  }

   /**
   * read bandwidth limitation
   * @return readBandwidth
  **/
  @Schema(description = "read bandwidth limitation")
  public Long getReadBandwidth() {
    return readBandwidth;
  }

  public void setReadBandwidth(Long readBandwidth) {
    this.readBandwidth = readBandwidth;
  }

  public DfsQosPolicyCreateReqQosPolicy readObject(Long readObject) {
    this.readObject = readObject;
    return this;
  }

   /**
   * read objects limitation
   * @return readObject
  **/
  @Schema(description = "read objects limitation")
  public Long getReadObject() {
    return readObject;
  }

  public void setReadObject(Long readObject) {
    this.readObject = readObject;
  }

  public DfsQosPolicyCreateReqQosPolicy totalBandwidth(Long totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
    return this;
  }

   /**
   * total bandwidth limitation
   * @return totalBandwidth
  **/
  @Schema(description = "total bandwidth limitation")
  public Long getTotalBandwidth() {
    return totalBandwidth;
  }

  public void setTotalBandwidth(Long totalBandwidth) {
    this.totalBandwidth = totalBandwidth;
  }

  public DfsQosPolicyCreateReqQosPolicy totalObject(Long totalObject) {
    this.totalObject = totalObject;
    return this;
  }

   /**
   * total objects limitation
   * @return totalObject
  **/
  @Schema(description = "total objects limitation")
  public Long getTotalObject() {
    return totalObject;
  }

  public void setTotalObject(Long totalObject) {
    this.totalObject = totalObject;
  }

  public DfsQosPolicyCreateReqQosPolicy writeBandwidth(Long writeBandwidth) {
    this.writeBandwidth = writeBandwidth;
    return this;
  }

   /**
   * write bandwidth limitation
   * @return writeBandwidth
  **/
  @Schema(description = "write bandwidth limitation")
  public Long getWriteBandwidth() {
    return writeBandwidth;
  }

  public void setWriteBandwidth(Long writeBandwidth) {
    this.writeBandwidth = writeBandwidth;
  }

  public DfsQosPolicyCreateReqQosPolicy writeObject(Long writeObject) {
    this.writeObject = writeObject;
    return this;
  }

   /**
   * write objects limitation
   * @return writeObject
  **/
  @Schema(description = "write objects limitation")
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
    DfsQosPolicyCreateReqQosPolicy dfsQosPolicyCreateReqQosPolicy = (DfsQosPolicyCreateReqQosPolicy) o;
    return Objects.equals(this.description, dfsQosPolicyCreateReqQosPolicy.description) &&
        Objects.equals(this.name, dfsQosPolicyCreateReqQosPolicy.name) &&
        Objects.equals(this.readBandwidth, dfsQosPolicyCreateReqQosPolicy.readBandwidth) &&
        Objects.equals(this.readObject, dfsQosPolicyCreateReqQosPolicy.readObject) &&
        Objects.equals(this.totalBandwidth, dfsQosPolicyCreateReqQosPolicy.totalBandwidth) &&
        Objects.equals(this.totalObject, dfsQosPolicyCreateReqQosPolicy.totalObject) &&
        Objects.equals(this.writeBandwidth, dfsQosPolicyCreateReqQosPolicy.writeBandwidth) &&
        Objects.equals(this.writeObject, dfsQosPolicyCreateReqQosPolicy.writeObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, readBandwidth, readObject, totalBandwidth, totalObject, writeBandwidth, writeObject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsQosPolicyCreateReqQosPolicy {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readBandwidth: ").append(toIndentedString(readBandwidth)).append("\n");
    sb.append("    readObject: ").append(toIndentedString(readObject)).append("\n");
    sb.append("    totalBandwidth: ").append(toIndentedString(totalBandwidth)).append("\n");
    sb.append("    totalObject: ").append(toIndentedString(totalObject)).append("\n");
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
