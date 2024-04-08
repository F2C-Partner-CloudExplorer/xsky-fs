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
import xio.sds.client.model.DfsFile;
/**
 * DfsDirectoryResultResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsDirectoryResultResp {
  @SerializedName("directory")
  private DfsFile directory = null;

  @SerializedName("result")
  private String result = null;

  public DfsDirectoryResultResp directory(DfsFile directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @Schema(required = true, description = "")
  public DfsFile getDirectory() {
    return directory;
  }

  public void setDirectory(DfsFile directory) {
    this.directory = directory;
  }

  public DfsDirectoryResultResp result(String result) {
    this.result = result;
    return this;
  }

   /**
   * operation result
   * @return result
  **/
  @Schema(required = true, description = "operation result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsDirectoryResultResp dfsDirectoryResultResp = (DfsDirectoryResultResp) o;
    return Objects.equals(this.directory, dfsDirectoryResultResp.directory) &&
        Objects.equals(this.result, dfsDirectoryResultResp.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsDirectoryResultResp {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
