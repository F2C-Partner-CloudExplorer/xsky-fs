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
/**
 * DfsGatewayGroupNestview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsGatewayGroupNestview {
  @SerializedName("hdfs_securities")
  private List<String> hdfsSecurities = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public DfsGatewayGroupNestview hdfsSecurities(List<String> hdfsSecurities) {
    this.hdfsSecurities = hdfsSecurities;
    return this;
  }

  public DfsGatewayGroupNestview addHdfsSecuritiesItem(String hdfsSecuritiesItem) {
    if (this.hdfsSecurities == null) {
      this.hdfsSecurities = new ArrayList<String>();
    }
    this.hdfsSecurities.add(hdfsSecuritiesItem);
    return this;
  }

   /**
   * hdfs domain auth type
   * @return hdfsSecurities
  **/
  @Schema(description = "hdfs domain auth type")
  public List<String> getHdfsSecurities() {
    return hdfsSecurities;
  }

  public void setHdfsSecurities(List<String> hdfsSecurities) {
    this.hdfsSecurities = hdfsSecurities;
  }

  public DfsGatewayGroupNestview id(Long id) {
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

  public DfsGatewayGroupNestview name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsGatewayGroupNestview dfsGatewayGroupNestview = (DfsGatewayGroupNestview) o;
    return Objects.equals(this.hdfsSecurities, dfsGatewayGroupNestview.hdfsSecurities) &&
        Objects.equals(this.id, dfsGatewayGroupNestview.id) &&
        Objects.equals(this.name, dfsGatewayGroupNestview.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hdfsSecurities, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsGatewayGroupNestview {\n");
    
    sb.append("    hdfsSecurities: ").append(toIndentedString(hdfsSecurities)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
