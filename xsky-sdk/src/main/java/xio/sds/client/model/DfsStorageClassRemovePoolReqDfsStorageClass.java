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
 * DfsStorageClassRemovePoolReqDfsStorageClass
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsStorageClassRemovePoolReqDfsStorageClass {
  @SerializedName("pool_ids")
  private List<Long> poolIds = new ArrayList<Long>();

  @SerializedName("to_default")
  private Boolean toDefault = null;

  public DfsStorageClassRemovePoolReqDfsStorageClass poolIds(List<Long> poolIds) {
    this.poolIds = poolIds;
    return this;
  }

  public DfsStorageClassRemovePoolReqDfsStorageClass addPoolIdsItem(Long poolIdsItem) {
    this.poolIds.add(poolIdsItem);
    return this;
  }

   /**
   * pool ids to remove
   * @return poolIds
  **/
  @Schema(required = true, description = "pool ids to remove")
  public List<Long> getPoolIds() {
    return poolIds;
  }

  public void setPoolIds(List<Long> poolIds) {
    this.poolIds = poolIds;
  }

  public DfsStorageClassRemovePoolReqDfsStorageClass toDefault(Boolean toDefault) {
    this.toDefault = toDefault;
    return this;
  }

   /**
   * whether to move the pool to the default class after it is removed
   * @return toDefault
  **/
  @Schema(required = true, description = "whether to move the pool to the default class after it is removed")
  public Boolean isToDefault() {
    return toDefault;
  }

  public void setToDefault(Boolean toDefault) {
    this.toDefault = toDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsStorageClassRemovePoolReqDfsStorageClass dfsStorageClassRemovePoolReqDfsStorageClass = (DfsStorageClassRemovePoolReqDfsStorageClass) o;
    return Objects.equals(this.poolIds, dfsStorageClassRemovePoolReqDfsStorageClass.poolIds) &&
        Objects.equals(this.toDefault, dfsStorageClassRemovePoolReqDfsStorageClass.toDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolIds, toDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsStorageClassRemovePoolReqDfsStorageClass {\n");
    
    sb.append("    poolIds: ").append(toIndentedString(poolIds)).append("\n");
    sb.append("    toDefault: ").append(toIndentedString(toDefault)).append("\n");
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
