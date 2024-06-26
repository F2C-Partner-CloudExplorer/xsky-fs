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
 * RemoteClusterNestview
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RemoteClusterNestview {
  @SerializedName("fs_id")
  private String fsId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("remote_cluster_id")
  private Long remoteClusterId = null;

  @SerializedName("url")
  private String url = null;

  public RemoteClusterNestview fsId(String fsId) {
    this.fsId = fsId;
    return this;
  }

   /**
   * Get fsId
   * @return fsId
  **/
  @Schema(description = "")
  public String getFsId() {
    return fsId;
  }

  public void setFsId(String fsId) {
    this.fsId = fsId;
  }

  public RemoteClusterNestview id(Long id) {
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

  public RemoteClusterNestview name(String name) {
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

  public RemoteClusterNestview remoteClusterId(Long remoteClusterId) {
    this.remoteClusterId = remoteClusterId;
    return this;
  }

   /**
   * Get remoteClusterId
   * @return remoteClusterId
  **/
  @Schema(description = "")
  public Long getRemoteClusterId() {
    return remoteClusterId;
  }

  public void setRemoteClusterId(Long remoteClusterId) {
    this.remoteClusterId = remoteClusterId;
  }

  public RemoteClusterNestview url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteClusterNestview remoteClusterNestview = (RemoteClusterNestview) o;
    return Objects.equals(this.fsId, remoteClusterNestview.fsId) &&
        Objects.equals(this.id, remoteClusterNestview.id) &&
        Objects.equals(this.name, remoteClusterNestview.name) &&
        Objects.equals(this.remoteClusterId, remoteClusterNestview.remoteClusterId) &&
        Objects.equals(this.url, remoteClusterNestview.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsId, id, name, remoteClusterId, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteClusterNestview {\n");
    
    sb.append("    fsId: ").append(toIndentedString(fsId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteClusterId: ").append(toIndentedString(remoteClusterId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
