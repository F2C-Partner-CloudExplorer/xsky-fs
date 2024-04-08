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
import xio.sds.client.model.TrashResource;
/**
 * TrashResourceResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class TrashResourceResp {
  @SerializedName("trash_resource")
  private TrashResource trashResource = null;

  public TrashResourceResp trashResource(TrashResource trashResource) {
    this.trashResource = trashResource;
    return this;
  }

   /**
   * Get trashResource
   * @return trashResource
  **/
  @Schema(required = true, description = "")
  public TrashResource getTrashResource() {
    return trashResource;
  }

  public void setTrashResource(TrashResource trashResource) {
    this.trashResource = trashResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrashResourceResp trashResourceResp = (TrashResourceResp) o;
    return Objects.equals(this.trashResource, trashResourceResp.trashResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trashResource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrashResourceResp {\n");
    
    sb.append("    trashResource: ").append(toIndentedString(trashResource)).append("\n");
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
