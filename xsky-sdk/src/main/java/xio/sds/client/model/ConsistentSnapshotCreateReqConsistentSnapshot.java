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
 * ConsistentSnapshotCreateReqConsistentSnapshot
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ConsistentSnapshotCreateReqConsistentSnapshot {
  @SerializedName("block_volume_ids")
  private List<Long> blockVolumeIds = new ArrayList<Long>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("snap_uids")
  private List<String> snapUids = null;

  public ConsistentSnapshotCreateReqConsistentSnapshot blockVolumeIds(List<Long> blockVolumeIds) {
    this.blockVolumeIds = blockVolumeIds;
    return this;
  }

  public ConsistentSnapshotCreateReqConsistentSnapshot addBlockVolumeIdsItem(Long blockVolumeIdsItem) {
    this.blockVolumeIds.add(blockVolumeIdsItem);
    return this;
  }

   /**
   * Get blockVolumeIds
   * @return blockVolumeIds
  **/
  @Schema(required = true, description = "")
  public List<Long> getBlockVolumeIds() {
    return blockVolumeIds;
  }

  public void setBlockVolumeIds(List<Long> blockVolumeIds) {
    this.blockVolumeIds = blockVolumeIds;
  }

  public ConsistentSnapshotCreateReqConsistentSnapshot description(String description) {
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

  public ConsistentSnapshotCreateReqConsistentSnapshot name(String name) {
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

  public ConsistentSnapshotCreateReqConsistentSnapshot snapUids(List<String> snapUids) {
    this.snapUids = snapUids;
    return this;
  }

  public ConsistentSnapshotCreateReqConsistentSnapshot addSnapUidsItem(String snapUidsItem) {
    if (this.snapUids == null) {
      this.snapUids = new ArrayList<String>();
    }
    this.snapUids.add(snapUidsItem);
    return this;
  }

   /**
   * Get snapUids
   * @return snapUids
  **/
  @Schema(description = "")
  public List<String> getSnapUids() {
    return snapUids;
  }

  public void setSnapUids(List<String> snapUids) {
    this.snapUids = snapUids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsistentSnapshotCreateReqConsistentSnapshot consistentSnapshotCreateReqConsistentSnapshot = (ConsistentSnapshotCreateReqConsistentSnapshot) o;
    return Objects.equals(this.blockVolumeIds, consistentSnapshotCreateReqConsistentSnapshot.blockVolumeIds) &&
        Objects.equals(this.description, consistentSnapshotCreateReqConsistentSnapshot.description) &&
        Objects.equals(this.name, consistentSnapshotCreateReqConsistentSnapshot.name) &&
        Objects.equals(this.snapUids, consistentSnapshotCreateReqConsistentSnapshot.snapUids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVolumeIds, description, name, snapUids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsistentSnapshotCreateReqConsistentSnapshot {\n");
    
    sb.append("    blockVolumeIds: ").append(toIndentedString(blockVolumeIds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snapUids: ").append(toIndentedString(snapUids)).append("\n");
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
