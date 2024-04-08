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
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.CloudDatacenterNestview;
import xio.sds.client.model.CloudPlatformNestview;
import xio.sds.client.model.VolumeNestview;
/**
 * CloudVolume defines volumes of the cloud platform
 */
@Schema(description = "CloudVolume defines volumes of the cloud platform")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class CloudVolume {
  @SerializedName("block_volume")
  private VolumeNestview blockVolume = null;

  @SerializedName("cloud_datacenter")
  private CloudDatacenterNestview cloudDatacenter = null;

  @SerializedName("cloud_platform")
  private CloudPlatformNestview cloudPlatform = null;

  @SerializedName("cloud_volume_id")
  private String cloudVolumeId = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("multi_attach")
  private Boolean multiAttach = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public CloudVolume blockVolume(VolumeNestview blockVolume) {
    this.blockVolume = blockVolume;
    return this;
  }

   /**
   * Get blockVolume
   * @return blockVolume
  **/
  @Schema(description = "")
  public VolumeNestview getBlockVolume() {
    return blockVolume;
  }

  public void setBlockVolume(VolumeNestview blockVolume) {
    this.blockVolume = blockVolume;
  }

  public CloudVolume cloudDatacenter(CloudDatacenterNestview cloudDatacenter) {
    this.cloudDatacenter = cloudDatacenter;
    return this;
  }

   /**
   * Get cloudDatacenter
   * @return cloudDatacenter
  **/
  @Schema(description = "")
  public CloudDatacenterNestview getCloudDatacenter() {
    return cloudDatacenter;
  }

  public void setCloudDatacenter(CloudDatacenterNestview cloudDatacenter) {
    this.cloudDatacenter = cloudDatacenter;
  }

  public CloudVolume cloudPlatform(CloudPlatformNestview cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
    return this;
  }

   /**
   * Get cloudPlatform
   * @return cloudPlatform
  **/
  @Schema(description = "")
  public CloudPlatformNestview getCloudPlatform() {
    return cloudPlatform;
  }

  public void setCloudPlatform(CloudPlatformNestview cloudPlatform) {
    this.cloudPlatform = cloudPlatform;
  }

  public CloudVolume cloudVolumeId(String cloudVolumeId) {
    this.cloudVolumeId = cloudVolumeId;
    return this;
  }

   /**
   * Get cloudVolumeId
   * @return cloudVolumeId
  **/
  @Schema(description = "")
  public String getCloudVolumeId() {
    return cloudVolumeId;
  }

  public void setCloudVolumeId(String cloudVolumeId) {
    this.cloudVolumeId = cloudVolumeId;
  }

  public CloudVolume create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public CloudVolume id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CloudVolume multiAttach(Boolean multiAttach) {
    this.multiAttach = multiAttach;
    return this;
  }

   /**
   * Get multiAttach
   * @return multiAttach
  **/
  @Schema(description = "")
  public Boolean isMultiAttach() {
    return multiAttach;
  }

  public void setMultiAttach(Boolean multiAttach) {
    this.multiAttach = multiAttach;
  }

  public CloudVolume name(String name) {
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

  public CloudVolume type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CloudVolume update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudVolume cloudVolume = (CloudVolume) o;
    return Objects.equals(this.blockVolume, cloudVolume.blockVolume) &&
        Objects.equals(this.cloudDatacenter, cloudVolume.cloudDatacenter) &&
        Objects.equals(this.cloudPlatform, cloudVolume.cloudPlatform) &&
        Objects.equals(this.cloudVolumeId, cloudVolume.cloudVolumeId) &&
        Objects.equals(this.create, cloudVolume.create) &&
        Objects.equals(this.id, cloudVolume.id) &&
        Objects.equals(this.multiAttach, cloudVolume.multiAttach) &&
        Objects.equals(this.name, cloudVolume.name) &&
        Objects.equals(this.type, cloudVolume.type) &&
        Objects.equals(this.update, cloudVolume.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockVolume, cloudDatacenter, cloudPlatform, cloudVolumeId, create, id, multiAttach, name, type, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudVolume {\n");
    
    sb.append("    blockVolume: ").append(toIndentedString(blockVolume)).append("\n");
    sb.append("    cloudDatacenter: ").append(toIndentedString(cloudDatacenter)).append("\n");
    sb.append("    cloudPlatform: ").append(toIndentedString(cloudPlatform)).append("\n");
    sb.append("    cloudVolumeId: ").append(toIndentedString(cloudVolumeId)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    multiAttach: ").append(toIndentedString(multiAttach)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
