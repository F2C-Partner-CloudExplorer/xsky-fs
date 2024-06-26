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
 * VolumeGroupSnapshotCreateReqVolumeGroupSnapshot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeGroupSnapshotCreateReqVolumeGroupSnapshot {
  @SerializedName("block_volume_group_id")
  private Long blockVolumeGroupId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public VolumeGroupSnapshotCreateReqVolumeGroupSnapshot blockVolumeGroupId(Long blockVolumeGroupId) {
    this.blockVolumeGroupId = blockVolumeGroupId;
    return this;
  }

   /**
   * Get blockVolumeGroupId
   * @return blockVolumeGroupId
  **/
  @Schema(required = true, description = "")
  public Long getBlockVolumeGroupId() {
    return blockVolumeGroupId;
  }

  public void setBlockVolumeGroupId(Long blockVolumeGroupId) {
    this.blockVolumeGroupId = blockVolumeGroupId;
  }

  public VolumeGroupSnapshotCreateReqVolumeGroupSnapshot description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VolumeGroupSnapshotCreateReqVolumeGroupSnapshot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
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
    VolumeGroupSnapshotCreateReqVolumeGroupSnapshot volumeGroupSnapshotCreateReqVolumeGroupSnapshot = (VolumeGroupSnapshotCreateReqVolumeGroupSnapshot) o;
    return Objects.equals(this.blockVolumeGroupId, volumeGroupSnapshotCreateReqVolumeGroupSnapshot.blockVolumeGroupId) &&
        Objects.equals(this.description, volumeGroupSnapshotCreateReqVolumeGroupSnapshot.description) &&
        Objects.equals(this.name, volumeGroupSnapshotCreateReqVolumeGroupSnapshot.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVolumeGroupId, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeGroupSnapshotCreateReqVolumeGroupSnapshot {\n");
    
    sb.append("    blockVolumeGroupId: ").append(toIndentedString(blockVolumeGroupId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
