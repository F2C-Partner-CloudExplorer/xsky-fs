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
import xio.sds.client.model.SnapshotCreateReqSnapshot;
/**
 * SnapshotCreateReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SnapshotCreateReq {
  @SerializedName("block_snapshot")
  private SnapshotCreateReqSnapshot blockSnapshot = null;

  public SnapshotCreateReq blockSnapshot(SnapshotCreateReqSnapshot blockSnapshot) {
    this.blockSnapshot = blockSnapshot;
    return this;
  }

   /**
   * Get blockSnapshot
   * @return blockSnapshot
  **/
  @Schema(required = true, description = "")
  public SnapshotCreateReqSnapshot getBlockSnapshot() {
    return blockSnapshot;
  }

  public void setBlockSnapshot(SnapshotCreateReqSnapshot blockSnapshot) {
    this.blockSnapshot = blockSnapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotCreateReq snapshotCreateReq = (SnapshotCreateReq) o;
    return Objects.equals(this.blockSnapshot, snapshotCreateReq.blockSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotCreateReq {\n");
    
    sb.append("    blockSnapshot: ").append(toIndentedString(blockSnapshot)).append("\n");
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
