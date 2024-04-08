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
import xio.sds.client.model.DfsTrash;
/**
 * DfsTrashResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsTrashResp {
  @SerializedName("dfs_trash")
  private DfsTrash dfsTrash = null;

  public DfsTrashResp dfsTrash(DfsTrash dfsTrash) {
    this.dfsTrash = dfsTrash;
    return this;
  }

   /**
   * Get dfsTrash
   * @return dfsTrash
  **/
  @Schema(required = true, description = "")
  public DfsTrash getDfsTrash() {
    return dfsTrash;
  }

  public void setDfsTrash(DfsTrash dfsTrash) {
    this.dfsTrash = dfsTrash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsTrashResp dfsTrashResp = (DfsTrashResp) o;
    return Objects.equals(this.dfsTrash, dfsTrashResp.dfsTrash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsTrash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsTrashResp {\n");
    
    sb.append("    dfsTrash: ").append(toIndentedString(dfsTrash)).append("\n");
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
