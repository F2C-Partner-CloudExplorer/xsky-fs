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
 * OspBucketLoggingGrant
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketLoggingGrant {
  @SerializedName("user_name")
  private String userName = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("user_email")
  private String userEmail = null;

  @SerializedName("permission")
  private String permission = null;

  public OspBucketLoggingGrant userName(String userName) {
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

  public OspBucketLoggingGrant uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public OspBucketLoggingGrant userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Get userEmail
   * @return userEmail
  **/
  @Schema(description = "")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public OspBucketLoggingGrant permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @Schema(description = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketLoggingGrant ospBucketLoggingGrant = (OspBucketLoggingGrant) o;
    return Objects.equals(this.userName, ospBucketLoggingGrant.userName) &&
        Objects.equals(this.uri, ospBucketLoggingGrant.uri) &&
        Objects.equals(this.userEmail, ospBucketLoggingGrant.userEmail) &&
        Objects.equals(this.permission, ospBucketLoggingGrant.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, uri, userEmail, permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketLoggingGrant {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
