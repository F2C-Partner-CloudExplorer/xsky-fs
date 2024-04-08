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
/**
 * DpBackupBlockSnapshot is a block snapshot stored on a site
 */
@Schema(description = "DpBackupBlockSnapshot is a block snapshot stored on a site")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBackupBlockSnapshot {
  @SerializedName("backup_type")
  private String backupType = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("volume_size")
  private Long volumeSize = null;

  public DpBackupBlockSnapshot backupType(String backupType) {
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @Schema(description = "")
  public String getBackupType() {
    return backupType;
  }

  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }

  public DpBackupBlockSnapshot create(OffsetDateTime create) {
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

  public DpBackupBlockSnapshot size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DpBackupBlockSnapshot volumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @Schema(description = "")
  public Long getVolumeSize() {
    return volumeSize;
  }

  public void setVolumeSize(Long volumeSize) {
    this.volumeSize = volumeSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpBackupBlockSnapshot dpBackupBlockSnapshot = (DpBackupBlockSnapshot) o;
    return Objects.equals(this.backupType, dpBackupBlockSnapshot.backupType) &&
        Objects.equals(this.create, dpBackupBlockSnapshot.create) &&
        Objects.equals(this.size, dpBackupBlockSnapshot.size) &&
        Objects.equals(this.volumeSize, dpBackupBlockSnapshot.volumeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupType, create, size, volumeSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBackupBlockSnapshot {\n");
    
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
