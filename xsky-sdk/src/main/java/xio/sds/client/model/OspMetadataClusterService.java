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
 * OspMetadataClusterService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspMetadataClusterService {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("log_service_num")
  private Long logServiceNum = null;

  @SerializedName("metadata_service_num")
  private Long metadataServiceNum = null;

  public OspMetadataClusterService id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OspMetadataClusterService logServiceNum(Long logServiceNum) {
    this.logServiceNum = logServiceNum;
    return this;
  }

   /**
   * Get logServiceNum
   * @return logServiceNum
  **/
  @Schema(description = "")
  public Long getLogServiceNum() {
    return logServiceNum;
  }

  public void setLogServiceNum(Long logServiceNum) {
    this.logServiceNum = logServiceNum;
  }

  public OspMetadataClusterService metadataServiceNum(Long metadataServiceNum) {
    this.metadataServiceNum = metadataServiceNum;
    return this;
  }

   /**
   * Get metadataServiceNum
   * @return metadataServiceNum
  **/
  @Schema(description = "")
  public Long getMetadataServiceNum() {
    return metadataServiceNum;
  }

  public void setMetadataServiceNum(Long metadataServiceNum) {
    this.metadataServiceNum = metadataServiceNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspMetadataClusterService ospMetadataClusterService = (OspMetadataClusterService) o;
    return Objects.equals(this.id, ospMetadataClusterService.id) &&
        Objects.equals(this.logServiceNum, ospMetadataClusterService.logServiceNum) &&
        Objects.equals(this.metadataServiceNum, ospMetadataClusterService.metadataServiceNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, logServiceNum, metadataServiceNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspMetadataClusterService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logServiceNum: ").append(toIndentedString(logServiceNum)).append("\n");
    sb.append("    metadataServiceNum: ").append(toIndentedString(metadataServiceNum)).append("\n");
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
