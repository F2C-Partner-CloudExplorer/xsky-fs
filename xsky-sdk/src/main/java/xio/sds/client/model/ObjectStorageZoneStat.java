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
 * ObjectStorageZoneStat contains info of os zone
 */
@Schema(description = "ObjectStorageZoneStat contains info of os zone")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageZoneStat {
  @SerializedName("bandwidth_kbyte")
  private Double bandwidthKbyte = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("object_kbytes_ps")
  private Double objectKbytesPs = null;

  @SerializedName("objects_pm")
  private Double objectsPm = null;

  @SerializedName("total_bytes")
  private Long totalBytes = null;

  @SerializedName("total_object_bytes")
  private Long totalObjectBytes = null;

  @SerializedName("total_objects")
  private Long totalObjects = null;

  public ObjectStorageZoneStat bandwidthKbyte(Double bandwidthKbyte) {
    this.bandwidthKbyte = bandwidthKbyte;
    return this;
  }

   /**
   * Get bandwidthKbyte
   * @return bandwidthKbyte
  **/
  @Schema(description = "")
  public Double getBandwidthKbyte() {
    return bandwidthKbyte;
  }

  public void setBandwidthKbyte(Double bandwidthKbyte) {
    this.bandwidthKbyte = bandwidthKbyte;
  }

  public ObjectStorageZoneStat create(OffsetDateTime create) {
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

  public ObjectStorageZoneStat objectKbytesPs(Double objectKbytesPs) {
    this.objectKbytesPs = objectKbytesPs;
    return this;
  }

   /**
   * Get objectKbytesPs
   * @return objectKbytesPs
  **/
  @Schema(description = "")
  public Double getObjectKbytesPs() {
    return objectKbytesPs;
  }

  public void setObjectKbytesPs(Double objectKbytesPs) {
    this.objectKbytesPs = objectKbytesPs;
  }

  public ObjectStorageZoneStat objectsPm(Double objectsPm) {
    this.objectsPm = objectsPm;
    return this;
  }

   /**
   * Get objectsPm
   * @return objectsPm
  **/
  @Schema(description = "")
  public Double getObjectsPm() {
    return objectsPm;
  }

  public void setObjectsPm(Double objectsPm) {
    this.objectsPm = objectsPm;
  }

  public ObjectStorageZoneStat totalBytes(Long totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }

   /**
   * Get totalBytes
   * @return totalBytes
  **/
  @Schema(description = "")
  public Long getTotalBytes() {
    return totalBytes;
  }

  public void setTotalBytes(Long totalBytes) {
    this.totalBytes = totalBytes;
  }

  public ObjectStorageZoneStat totalObjectBytes(Long totalObjectBytes) {
    this.totalObjectBytes = totalObjectBytes;
    return this;
  }

   /**
   * Get totalObjectBytes
   * @return totalObjectBytes
  **/
  @Schema(description = "")
  public Long getTotalObjectBytes() {
    return totalObjectBytes;
  }

  public void setTotalObjectBytes(Long totalObjectBytes) {
    this.totalObjectBytes = totalObjectBytes;
  }

  public ObjectStorageZoneStat totalObjects(Long totalObjects) {
    this.totalObjects = totalObjects;
    return this;
  }

   /**
   * Get totalObjects
   * @return totalObjects
  **/
  @Schema(description = "")
  public Long getTotalObjects() {
    return totalObjects;
  }

  public void setTotalObjects(Long totalObjects) {
    this.totalObjects = totalObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageZoneStat objectStorageZoneStat = (ObjectStorageZoneStat) o;
    return Objects.equals(this.bandwidthKbyte, objectStorageZoneStat.bandwidthKbyte) &&
        Objects.equals(this.create, objectStorageZoneStat.create) &&
        Objects.equals(this.objectKbytesPs, objectStorageZoneStat.objectKbytesPs) &&
        Objects.equals(this.objectsPm, objectStorageZoneStat.objectsPm) &&
        Objects.equals(this.totalBytes, objectStorageZoneStat.totalBytes) &&
        Objects.equals(this.totalObjectBytes, objectStorageZoneStat.totalObjectBytes) &&
        Objects.equals(this.totalObjects, objectStorageZoneStat.totalObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthKbyte, create, objectKbytesPs, objectsPm, totalBytes, totalObjectBytes, totalObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageZoneStat {\n");
    
    sb.append("    bandwidthKbyte: ").append(toIndentedString(bandwidthKbyte)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    objectKbytesPs: ").append(toIndentedString(objectKbytesPs)).append("\n");
    sb.append("    objectsPm: ").append(toIndentedString(objectsPm)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
    sb.append("    totalObjectBytes: ").append(toIndentedString(totalObjectBytes)).append("\n");
    sb.append("    totalObjects: ").append(toIndentedString(totalObjects)).append("\n");
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
