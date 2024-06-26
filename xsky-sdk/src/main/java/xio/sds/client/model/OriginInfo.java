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
 * OriginInfo defines os origin info
 */
@Schema(description = "OriginInfo defines os origin info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OriginInfo {
  @SerializedName("access_key")
  private String accessKey = null;

  @SerializedName("authentication")
  private String authentication = null;

  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("directory")
  private String directory = null;

  @SerializedName("endpoint")
  private String endpoint = null;

  @SerializedName("host_style")
  private String hostStyle = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("platform_type")
  private String platformType = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("secret_key")
  private String secretKey = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user_name")
  private String userName = null;

  public OriginInfo accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Get accessKey
   * @return accessKey
  **/
  @Schema(description = "")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public OriginInfo authentication(String authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @Schema(description = "")
  public String getAuthentication() {
    return authentication;
  }

  public void setAuthentication(String authentication) {
    this.authentication = authentication;
  }

  public OriginInfo bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @Schema(description = "")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public OriginInfo directory(String directory) {
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @Schema(description = "")
  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  public OriginInfo endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @Schema(description = "")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public OriginInfo hostStyle(String hostStyle) {
    this.hostStyle = hostStyle;
    return this;
  }

   /**
   * Get hostStyle
   * @return hostStyle
  **/
  @Schema(description = "")
  public String getHostStyle() {
    return hostStyle;
  }

  public void setHostStyle(String hostStyle) {
    this.hostStyle = hostStyle;
  }

  public OriginInfo password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public OriginInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public OriginInfo platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public OriginInfo platformType(String platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  @Schema(description = "")
  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }

  public OriginInfo prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public OriginInfo region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public OriginInfo secretKey(String secretKey) {
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Get secretKey
   * @return secretKey
  **/
  @Schema(description = "")
  public String getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }

  public OriginInfo type(String type) {
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

  public OriginInfo userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginInfo originInfo = (OriginInfo) o;
    return Objects.equals(this.accessKey, originInfo.accessKey) &&
        Objects.equals(this.authentication, originInfo.authentication) &&
        Objects.equals(this.bucket, originInfo.bucket) &&
        Objects.equals(this.directory, originInfo.directory) &&
        Objects.equals(this.endpoint, originInfo.endpoint) &&
        Objects.equals(this.hostStyle, originInfo.hostStyle) &&
        Objects.equals(this.password, originInfo.password) &&
        Objects.equals(this.path, originInfo.path) &&
        Objects.equals(this.platform, originInfo.platform) &&
        Objects.equals(this.platformType, originInfo.platformType) &&
        Objects.equals(this.prefix, originInfo.prefix) &&
        Objects.equals(this.region, originInfo.region) &&
        Objects.equals(this.secretKey, originInfo.secretKey) &&
        Objects.equals(this.type, originInfo.type) &&
        Objects.equals(this.userName, originInfo.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, authentication, bucket, directory, endpoint, hostStyle, password, path, platform, platformType, prefix, region, secretKey, type, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginInfo {\n");
    
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    hostStyle: ").append(toIndentedString(hostStyle)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
