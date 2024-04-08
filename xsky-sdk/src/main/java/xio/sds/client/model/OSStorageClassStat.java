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
 * OSStorageClassStat define the os storage class or os external storage class statistics of a user or bucket
 */
@Schema(description = "OSStorageClassStat define the os storage class or os external storage class statistics of a user or bucket")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSStorageClassStat {
  @SerializedName("allocated_objects")
  private Long allocatedObjects = null;

  @SerializedName("allocated_size")
  private Long allocatedSize = null;

  @SerializedName("cache_allocated_objects")
  private Long cacheAllocatedObjects = null;

  @SerializedName("cache_allocated_size")
  private Long cacheAllocatedSize = null;

  @SerializedName("class_name")
  private String className = null;

  public OSStorageClassStat allocatedObjects(Long allocatedObjects) {
    this.allocatedObjects = allocatedObjects;
    return this;
  }

   /**
   * Get allocatedObjects
   * @return allocatedObjects
  **/
  @Schema(description = "")
  public Long getAllocatedObjects() {
    return allocatedObjects;
  }

  public void setAllocatedObjects(Long allocatedObjects) {
    this.allocatedObjects = allocatedObjects;
  }

  public OSStorageClassStat allocatedSize(Long allocatedSize) {
    this.allocatedSize = allocatedSize;
    return this;
  }

   /**
   * Get allocatedSize
   * @return allocatedSize
  **/
  @Schema(description = "")
  public Long getAllocatedSize() {
    return allocatedSize;
  }

  public void setAllocatedSize(Long allocatedSize) {
    this.allocatedSize = allocatedSize;
  }

  public OSStorageClassStat cacheAllocatedObjects(Long cacheAllocatedObjects) {
    this.cacheAllocatedObjects = cacheAllocatedObjects;
    return this;
  }

   /**
   * Get cacheAllocatedObjects
   * @return cacheAllocatedObjects
  **/
  @Schema(description = "")
  public Long getCacheAllocatedObjects() {
    return cacheAllocatedObjects;
  }

  public void setCacheAllocatedObjects(Long cacheAllocatedObjects) {
    this.cacheAllocatedObjects = cacheAllocatedObjects;
  }

  public OSStorageClassStat cacheAllocatedSize(Long cacheAllocatedSize) {
    this.cacheAllocatedSize = cacheAllocatedSize;
    return this;
  }

   /**
   * Get cacheAllocatedSize
   * @return cacheAllocatedSize
  **/
  @Schema(description = "")
  public Long getCacheAllocatedSize() {
    return cacheAllocatedSize;
  }

  public void setCacheAllocatedSize(Long cacheAllocatedSize) {
    this.cacheAllocatedSize = cacheAllocatedSize;
  }

  public OSStorageClassStat className(String className) {
    this.className = className;
    return this;
  }

   /**
   * ClassName used in GetObjectStorageUserSamples
   * @return className
  **/
  @Schema(description = "ClassName used in GetObjectStorageUserSamples")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSStorageClassStat osStorageClassStat = (OSStorageClassStat) o;
    return Objects.equals(this.allocatedObjects, osStorageClassStat.allocatedObjects) &&
        Objects.equals(this.allocatedSize, osStorageClassStat.allocatedSize) &&
        Objects.equals(this.cacheAllocatedObjects, osStorageClassStat.cacheAllocatedObjects) &&
        Objects.equals(this.cacheAllocatedSize, osStorageClassStat.cacheAllocatedSize) &&
        Objects.equals(this.className, osStorageClassStat.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedObjects, allocatedSize, cacheAllocatedObjects, cacheAllocatedSize, className);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSStorageClassStat {\n");
    
    sb.append("    allocatedObjects: ").append(toIndentedString(allocatedObjects)).append("\n");
    sb.append("    allocatedSize: ").append(toIndentedString(allocatedSize)).append("\n");
    sb.append("    cacheAllocatedObjects: ").append(toIndentedString(cacheAllocatedObjects)).append("\n");
    sb.append("    cacheAllocatedSize: ").append(toIndentedString(cacheAllocatedSize)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
