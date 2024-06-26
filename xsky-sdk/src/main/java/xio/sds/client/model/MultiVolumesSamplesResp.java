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
import xio.sds.client.model.VolumeSamplesElem;
/**
 * MultiVolumesSamplesResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class MultiVolumesSamplesResp {
  @SerializedName("block_volumes_samples")
  private List<VolumeSamplesElem> blockVolumesSamples = null;

  public MultiVolumesSamplesResp blockVolumesSamples(List<VolumeSamplesElem> blockVolumesSamples) {
    this.blockVolumesSamples = blockVolumesSamples;
    return this;
  }

  public MultiVolumesSamplesResp addBlockVolumesSamplesItem(VolumeSamplesElem blockVolumesSamplesItem) {
    if (this.blockVolumesSamples == null) {
      this.blockVolumesSamples = new ArrayList<VolumeSamplesElem>();
    }
    this.blockVolumesSamples.add(blockVolumesSamplesItem);
    return this;
  }

   /**
   * Get blockVolumesSamples
   * @return blockVolumesSamples
  **/
  @Schema(description = "")
  public List<VolumeSamplesElem> getBlockVolumesSamples() {
    return blockVolumesSamples;
  }

  public void setBlockVolumesSamples(List<VolumeSamplesElem> blockVolumesSamples) {
    this.blockVolumesSamples = blockVolumesSamples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiVolumesSamplesResp multiVolumesSamplesResp = (MultiVolumesSamplesResp) o;
    return Objects.equals(this.blockVolumesSamples, multiVolumesSamplesResp.blockVolumesSamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVolumesSamples);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiVolumesSamplesResp {\n");
    
    sb.append("    blockVolumesSamples: ").append(toIndentedString(blockVolumesSamples)).append("\n");
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
