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
 * DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("ips")
  private String ips = null;

  @SerializedName("permission")
  private String permission = null;

  public DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ip white list id
   * @return id
  **/
  @Schema(required = true, description = "ip white list id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt ips(String ips) {
    this.ips = ips;
    return this;
  }

   /**
   * allow ips in hdfs
   * @return ips
  **/
  @Schema(required = true, description = "allow ips in hdfs")
  public String getIps() {
    return ips;
  }

  public void setIps(String ips) {
    this.ips = ips;
  }

  public DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * permission
   * @return permission
  **/
  @Schema(required = true, description = "permission")
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
    DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt dfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt = (DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt) o;
    return Objects.equals(this.id, dfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt.id) &&
        Objects.equals(this.ips, dfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt.ips) &&
        Objects.equals(this.permission, dfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ips, permission);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsHdfsUpdateIPWhiteListsReqHdfsIPWhiteListsElt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
