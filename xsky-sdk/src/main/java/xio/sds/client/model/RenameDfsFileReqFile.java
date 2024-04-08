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
 * RenameDfsFileReqFile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RenameDfsFileReqFile {
  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("dst_path")
  private String dstPath = null;

  @SerializedName("src_path")
  private String srcPath = null;

  public RenameDfsFileReqFile dfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
    return this;
  }

   /**
   * dfs rootfs id
   * @return dfsRootfsId
  **/
  @Schema(required = true, description = "dfs rootfs id")
  public Long getDfsRootfsId() {
    return dfsRootfsId;
  }

  public void setDfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
  }

  public RenameDfsFileReqFile dstPath(String dstPath) {
    this.dstPath = dstPath;
    return this;
  }

   /**
   * dst path
   * @return dstPath
  **/
  @Schema(required = true, description = "dst path")
  public String getDstPath() {
    return dstPath;
  }

  public void setDstPath(String dstPath) {
    this.dstPath = dstPath;
  }

  public RenameDfsFileReqFile srcPath(String srcPath) {
    this.srcPath = srcPath;
    return this;
  }

   /**
   * src path
   * @return srcPath
  **/
  @Schema(required = true, description = "src path")
  public String getSrcPath() {
    return srcPath;
  }

  public void setSrcPath(String srcPath) {
    this.srcPath = srcPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameDfsFileReqFile renameDfsFileReqFile = (RenameDfsFileReqFile) o;
    return Objects.equals(this.dfsRootfsId, renameDfsFileReqFile.dfsRootfsId) &&
        Objects.equals(this.dstPath, renameDfsFileReqFile.dstPath) &&
        Objects.equals(this.srcPath, renameDfsFileReqFile.srcPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsRootfsId, dstPath, srcPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenameDfsFileReqFile {\n");
    
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    dstPath: ").append(toIndentedString(dstPath)).append("\n");
    sb.append("    srcPath: ").append(toIndentedString(srcPath)).append("\n");
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
