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
import xio.sds.client.model.AccessPathNestview;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.VolumeNestview;
/**
 * Lun defines lun id +X:model:generate +X:benchmark:
 */
@Schema(description = "Lun defines lun id +X:model:generate +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class Lun {
  @SerializedName("access_path")
  private AccessPathNestview accessPath = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("lun_id")
  private Long lunId = null;

  @SerializedName("volume")
  private VolumeNestview volume = null;

  public Lun accessPath(AccessPathNestview accessPath) {
    this.accessPath = accessPath;
    return this;
  }

   /**
   * Get accessPath
   * @return accessPath
  **/
  @Schema(description = "")
  public AccessPathNestview getAccessPath() {
    return accessPath;
  }

  public void setAccessPath(AccessPathNestview accessPath) {
    this.accessPath = accessPath;
  }

  public Lun cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public Lun create(OffsetDateTime create) {
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

  public Lun id(Long id) {
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

  public Lun lunId(Long lunId) {
    this.lunId = lunId;
    return this;
  }

   /**
   * Get lunId
   * @return lunId
  **/
  @Schema(description = "")
  public Long getLunId() {
    return lunId;
  }

  public void setLunId(Long lunId) {
    this.lunId = lunId;
  }

  public Lun volume(VolumeNestview volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @Schema(description = "")
  public VolumeNestview getVolume() {
    return volume;
  }

  public void setVolume(VolumeNestview volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lun lun = (Lun) o;
    return Objects.equals(this.accessPath, lun.accessPath) &&
        Objects.equals(this.cluster, lun.cluster) &&
        Objects.equals(this.create, lun.create) &&
        Objects.equals(this.id, lun.id) &&
        Objects.equals(this.lunId, lun.lunId) &&
        Objects.equals(this.volume, lun.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessPath, cluster, create, id, lunId, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lun {\n");
    
    sb.append("    accessPath: ").append(toIndentedString(accessPath)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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