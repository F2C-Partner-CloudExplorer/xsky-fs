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
 * OSStorageClassUpdateReqStorageClass
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSStorageClassUpdateReqStorageClass {
  @SerializedName("active_pool_ids")
  private List<Long> activePoolIds = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("inactive_pool_ids")
  private List<Long> inactivePoolIds = null;

  @SerializedName("name")
  private String name = null;

  public OSStorageClassUpdateReqStorageClass activePoolIds(List<Long> activePoolIds) {
    this.activePoolIds = activePoolIds;
    return this;
  }

  public OSStorageClassUpdateReqStorageClass addActivePoolIdsItem(Long activePoolIdsItem) {
    if (this.activePoolIds == null) {
      this.activePoolIds = new ArrayList<Long>();
    }
    this.activePoolIds.add(activePoolIdsItem);
    return this;
  }

   /**
   * Get activePoolIds
   * @return activePoolIds
  **/
  @Schema(description = "")
  public List<Long> getActivePoolIds() {
    return activePoolIds;
  }

  public void setActivePoolIds(List<Long> activePoolIds) {
    this.activePoolIds = activePoolIds;
  }

  public OSStorageClassUpdateReqStorageClass description(String description) {
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

  public OSStorageClassUpdateReqStorageClass inactivePoolIds(List<Long> inactivePoolIds) {
    this.inactivePoolIds = inactivePoolIds;
    return this;
  }

  public OSStorageClassUpdateReqStorageClass addInactivePoolIdsItem(Long inactivePoolIdsItem) {
    if (this.inactivePoolIds == null) {
      this.inactivePoolIds = new ArrayList<Long>();
    }
    this.inactivePoolIds.add(inactivePoolIdsItem);
    return this;
  }

   /**
   * Get inactivePoolIds
   * @return inactivePoolIds
  **/
  @Schema(description = "")
  public List<Long> getInactivePoolIds() {
    return inactivePoolIds;
  }

  public void setInactivePoolIds(List<Long> inactivePoolIds) {
    this.inactivePoolIds = inactivePoolIds;
  }

  public OSStorageClassUpdateReqStorageClass name(String name) {
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
    OSStorageClassUpdateReqStorageClass osStorageClassUpdateReqStorageClass = (OSStorageClassUpdateReqStorageClass) o;
    return Objects.equals(this.activePoolIds, osStorageClassUpdateReqStorageClass.activePoolIds) &&
        Objects.equals(this.description, osStorageClassUpdateReqStorageClass.description) &&
        Objects.equals(this.inactivePoolIds, osStorageClassUpdateReqStorageClass.inactivePoolIds) &&
        Objects.equals(this.name, osStorageClassUpdateReqStorageClass.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activePoolIds, description, inactivePoolIds, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSStorageClassUpdateReqStorageClass {\n");
    
    sb.append("    activePoolIds: ").append(toIndentedString(activePoolIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inactivePoolIds: ").append(toIndentedString(inactivePoolIds)).append("\n");
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