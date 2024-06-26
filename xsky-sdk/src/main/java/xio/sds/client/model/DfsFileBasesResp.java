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
import xio.sds.client.model.DfsFileBase;
/**
 * DfsFileBasesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsFileBasesResp {
  @SerializedName("dfs_files")
  private List<DfsFileBase> dfsFiles = null;

  @SerializedName("eof")
  private Boolean eof = null;

  public DfsFileBasesResp dfsFiles(List<DfsFileBase> dfsFiles) {
    this.dfsFiles = dfsFiles;
    return this;
  }

  public DfsFileBasesResp addDfsFilesItem(DfsFileBase dfsFilesItem) {
    if (this.dfsFiles == null) {
      this.dfsFiles = new ArrayList<DfsFileBase>();
    }
    this.dfsFiles.add(dfsFilesItem);
    return this;
  }

   /**
   * dfs file list
   * @return dfsFiles
  **/
  @Schema(description = "dfs file list")
  public List<DfsFileBase> getDfsFiles() {
    return dfsFiles;
  }

  public void setDfsFiles(List<DfsFileBase> dfsFiles) {
    this.dfsFiles = dfsFiles;
  }

  public DfsFileBasesResp eof(Boolean eof) {
    this.eof = eof;
    return this;
  }

   /**
   * for ls directory, set to true when reach end
   * @return eof
  **/
  @Schema(description = "for ls directory, set to true when reach end")
  public Boolean isEof() {
    return eof;
  }

  public void setEof(Boolean eof) {
    this.eof = eof;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsFileBasesResp dfsFileBasesResp = (DfsFileBasesResp) o;
    return Objects.equals(this.dfsFiles, dfsFileBasesResp.dfsFiles) &&
        Objects.equals(this.eof, dfsFileBasesResp.eof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsFiles, eof);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsFileBasesResp {\n");
    
    sb.append("    dfsFiles: ").append(toIndentedString(dfsFiles)).append("\n");
    sb.append("    eof: ").append(toIndentedString(eof)).append("\n");
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
