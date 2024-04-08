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
import xio.sds.client.model.ObjectStorageBucketNestviewLifecycle;
/**
 * ObjectStorageBucketNestview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageBucketNestview {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("lifecycle")
  private ObjectStorageBucketNestviewLifecycle lifecycle = null;

  @SerializedName("name")
  private String name = null;

  public ObjectStorageBucketNestview id(Long id) {
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

  public ObjectStorageBucketNestview lifecycle(ObjectStorageBucketNestviewLifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @Schema(description = "")
  public ObjectStorageBucketNestviewLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(ObjectStorageBucketNestviewLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public ObjectStorageBucketNestview name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageBucketNestview objectStorageBucketNestview = (ObjectStorageBucketNestview) o;
    return Objects.equals(this.id, objectStorageBucketNestview.id) &&
        Objects.equals(this.lifecycle, objectStorageBucketNestview.lifecycle) &&
        Objects.equals(this.name, objectStorageBucketNestview.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lifecycle, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageBucketNestview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
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
