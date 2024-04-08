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
 * VolumePairInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumePairInfo {
  @SerializedName("dest_pool_id")
  private Long destPoolId = null;

  @SerializedName("dest_pool_name")
  private String destPoolName = null;

  @SerializedName("dest_volume_name")
  private String destVolumeName = null;

  @SerializedName("src_volume_id")
  private Long srcVolumeId = null;

  public VolumePairInfo destPoolId(Long destPoolId) {
    this.destPoolId = destPoolId;
    return this;
  }

   /**
   * destination pool id
   * @return destPoolId
  **/
  @Schema(required = true, description = "destination pool id")
  public Long getDestPoolId() {
    return destPoolId;
  }

  public void setDestPoolId(Long destPoolId) {
    this.destPoolId = destPoolId;
  }

  public VolumePairInfo destPoolName(String destPoolName) {
    this.destPoolName = destPoolName;
    return this;
  }

   /**
   * destination pool name
   * @return destPoolName
  **/
  @Schema(required = true, description = "destination pool name")
  public String getDestPoolName() {
    return destPoolName;
  }

  public void setDestPoolName(String destPoolName) {
    this.destPoolName = destPoolName;
  }

  public VolumePairInfo destVolumeName(String destVolumeName) {
    this.destVolumeName = destVolumeName;
    return this;
  }

   /**
   * destination volume name
   * @return destVolumeName
  **/
  @Schema(required = true, description = "destination volume name")
  public String getDestVolumeName() {
    return destVolumeName;
  }

  public void setDestVolumeName(String destVolumeName) {
    this.destVolumeName = destVolumeName;
  }

  public VolumePairInfo srcVolumeId(Long srcVolumeId) {
    this.srcVolumeId = srcVolumeId;
    return this;
  }

   /**
   * source volume id
   * @return srcVolumeId
  **/
  @Schema(required = true, description = "source volume id")
  public Long getSrcVolumeId() {
    return srcVolumeId;
  }

  public void setSrcVolumeId(Long srcVolumeId) {
    this.srcVolumeId = srcVolumeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePairInfo volumePairInfo = (VolumePairInfo) o;
    return Objects.equals(this.destPoolId, volumePairInfo.destPoolId) &&
        Objects.equals(this.destPoolName, volumePairInfo.destPoolName) &&
        Objects.equals(this.destVolumeName, volumePairInfo.destVolumeName) &&
        Objects.equals(this.srcVolumeId, volumePairInfo.srcVolumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destPoolId, destPoolName, destVolumeName, srcVolumeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePairInfo {\n");
    
    sb.append("    destPoolId: ").append(toIndentedString(destPoolId)).append("\n");
    sb.append("    destPoolName: ").append(toIndentedString(destPoolName)).append("\n");
    sb.append("    destVolumeName: ").append(toIndentedString(destVolumeName)).append("\n");
    sb.append("    srcVolumeId: ").append(toIndentedString(srcVolumeId)).append("\n");
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
