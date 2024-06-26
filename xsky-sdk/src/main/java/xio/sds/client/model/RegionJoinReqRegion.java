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
 * RegionJoinReqRegion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RegionJoinReqRegion {
  @SerializedName("access_token")
  private String accessToken = null;

  @SerializedName("access_url")
  private String accessUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uuid")
  private String uuid = null;

  public RegionJoinReqRegion accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * AccessToken token of remote region
   * @return accessToken
  **/
  @Schema(required = true, description = "AccessToken token of remote region")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public RegionJoinReqRegion accessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
    return this;
  }

   /**
   * AccessURL URL of remote region
   * @return accessUrl
  **/
  @Schema(required = true, description = "AccessURL URL of remote region")
  public String getAccessUrl() {
    return accessUrl;
  }

  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }

  public RegionJoinReqRegion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of remote region
   * @return name
  **/
  @Schema(required = true, description = "Name of remote region")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionJoinReqRegion uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of remote region
   * @return uuid
  **/
  @Schema(required = true, description = "UUID of remote region")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionJoinReqRegion regionJoinReqRegion = (RegionJoinReqRegion) o;
    return Objects.equals(this.accessToken, regionJoinReqRegion.accessToken) &&
        Objects.equals(this.accessUrl, regionJoinReqRegion.accessUrl) &&
        Objects.equals(this.name, regionJoinReqRegion.name) &&
        Objects.equals(this.uuid, regionJoinReqRegion.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, accessUrl, name, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionJoinReqRegion {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accessUrl: ").append(toIndentedString(accessUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
