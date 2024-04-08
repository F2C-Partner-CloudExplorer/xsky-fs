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
 * AccessPathUpdateReqAccessPath
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AccessPathUpdateReqAccessPath {
  @SerializedName("chap")
  private Boolean chap = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tname")
  private String tname = null;

  @SerializedName("tsecret")
  private String tsecret = null;

  public AccessPathUpdateReqAccessPath chap(Boolean chap) {
    this.chap = chap;
    return this;
  }

   /**
   * Get chap
   * @return chap
  **/
  @Schema(description = "")
  public Boolean isChap() {
    return chap;
  }

  public void setChap(Boolean chap) {
    this.chap = chap;
  }

  public AccessPathUpdateReqAccessPath description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccessPathUpdateReqAccessPath name(String name) {
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

  public AccessPathUpdateReqAccessPath tname(String tname) {
    this.tname = tname;
    return this;
  }

   /**
   * Get tname
   * @return tname
  **/
  @Schema(description = "")
  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public AccessPathUpdateReqAccessPath tsecret(String tsecret) {
    this.tsecret = tsecret;
    return this;
  }

   /**
   * Get tsecret
   * @return tsecret
  **/
  @Schema(description = "")
  public String getTsecret() {
    return tsecret;
  }

  public void setTsecret(String tsecret) {
    this.tsecret = tsecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPathUpdateReqAccessPath accessPathUpdateReqAccessPath = (AccessPathUpdateReqAccessPath) o;
    return Objects.equals(this.chap, accessPathUpdateReqAccessPath.chap) &&
        Objects.equals(this.description, accessPathUpdateReqAccessPath.description) &&
        Objects.equals(this.name, accessPathUpdateReqAccessPath.name) &&
        Objects.equals(this.tname, accessPathUpdateReqAccessPath.tname) &&
        Objects.equals(this.tsecret, accessPathUpdateReqAccessPath.tsecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chap, description, name, tname, tsecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPathUpdateReqAccessPath {\n");
    
    sb.append("    chap: ").append(toIndentedString(chap)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tname: ").append(toIndentedString(tname)).append("\n");
    sb.append("    tsecret: ").append(toIndentedString(tsecret)).append("\n");
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