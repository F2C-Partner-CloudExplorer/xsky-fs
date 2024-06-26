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
import java.util.ArrayList;
import java.util.List;
import xio.sds.client.model.ObjectStorageUserRecord;
/**
 * ObjectStorageUsersResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorageUsersResp {
  @SerializedName("os_users")
  private List<ObjectStorageUserRecord> osUsers = new ArrayList<ObjectStorageUserRecord>();

  public ObjectStorageUsersResp osUsers(List<ObjectStorageUserRecord> osUsers) {
    this.osUsers = osUsers;
    return this;
  }

  public ObjectStorageUsersResp addOsUsersItem(ObjectStorageUserRecord osUsersItem) {
    this.osUsers.add(osUsersItem);
    return this;
  }

   /**
   * object storage users
   * @return osUsers
  **/
  @Schema(required = true, description = "object storage users")
  public List<ObjectStorageUserRecord> getOsUsers() {
    return osUsers;
  }

  public void setOsUsers(List<ObjectStorageUserRecord> osUsers) {
    this.osUsers = osUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorageUsersResp objectStorageUsersResp = (ObjectStorageUsersResp) o;
    return Objects.equals(this.osUsers, objectStorageUsersResp.osUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorageUsersResp {\n");
    
    sb.append("    osUsers: ").append(toIndentedString(osUsers)).append("\n");
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
