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
 * ClusterSetAccessInfoReqCluster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ClusterSetAccessInfoReqCluster {
  @SerializedName("access_token_id")
  private Long accessTokenId = null;

  @SerializedName("access_url")
  private String accessUrl = null;

  public ClusterSetAccessInfoReqCluster accessTokenId(Long accessTokenId) {
    this.accessTokenId = accessTokenId;
    return this;
  }

   /**
   * access token
   * @return accessTokenId
  **/
  @Schema(required = true, description = "access token")
  public Long getAccessTokenId() {
    return accessTokenId;
  }

  public void setAccessTokenId(Long accessTokenId) {
    this.accessTokenId = accessTokenId;
  }

  public ClusterSetAccessInfoReqCluster accessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
    return this;
  }

   /**
   * access url
   * @return accessUrl
  **/
  @Schema(required = true, description = "access url")
  public String getAccessUrl() {
    return accessUrl;
  }

  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterSetAccessInfoReqCluster clusterSetAccessInfoReqCluster = (ClusterSetAccessInfoReqCluster) o;
    return Objects.equals(this.accessTokenId, clusterSetAccessInfoReqCluster.accessTokenId) &&
        Objects.equals(this.accessUrl, clusterSetAccessInfoReqCluster.accessUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenId, accessUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterSetAccessInfoReqCluster {\n");
    
    sb.append("    accessTokenId: ").append(toIndentedString(accessTokenId)).append("\n");
    sb.append("    accessUrl: ").append(toIndentedString(accessUrl)).append("\n");
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
