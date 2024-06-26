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
 * OriginConf defines some others origin configuration
 */
@Schema(description = "OriginConf defines some others origin configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OriginConf {
  @SerializedName("class_id")
  private String classId = null;

  @SerializedName("class_name")
  private String className = null;

  @SerializedName("delete_origin")
  private Boolean deleteOrigin = null;

  @SerializedName("expiration_days")
  private Long expirationDays = null;

  @SerializedName("follow_redirect")
  private Boolean followRedirect = null;

  @SerializedName("policy_id")
  private Long policyId = null;

  @SerializedName("redirect_code")
  private Long redirectCode = null;

  public OriginConf classId(String classId) {
    this.classId = classId;
    return this;
  }

   /**
   * Get classId
   * @return classId
  **/
  @Schema(description = "")
  public String getClassId() {
    return classId;
  }

  public void setClassId(String classId) {
    this.classId = classId;
  }

  public OriginConf className(String className) {
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @Schema(description = "")
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public OriginConf deleteOrigin(Boolean deleteOrigin) {
    this.deleteOrigin = deleteOrigin;
    return this;
  }

   /**
   * Get deleteOrigin
   * @return deleteOrigin
  **/
  @Schema(description = "")
  public Boolean isDeleteOrigin() {
    return deleteOrigin;
  }

  public void setDeleteOrigin(Boolean deleteOrigin) {
    this.deleteOrigin = deleteOrigin;
  }

  public OriginConf expirationDays(Long expirationDays) {
    this.expirationDays = expirationDays;
    return this;
  }

   /**
   * Get expirationDays
   * @return expirationDays
  **/
  @Schema(description = "")
  public Long getExpirationDays() {
    return expirationDays;
  }

  public void setExpirationDays(Long expirationDays) {
    this.expirationDays = expirationDays;
  }

  public OriginConf followRedirect(Boolean followRedirect) {
    this.followRedirect = followRedirect;
    return this;
  }

   /**
   * Get followRedirect
   * @return followRedirect
  **/
  @Schema(description = "")
  public Boolean isFollowRedirect() {
    return followRedirect;
  }

  public void setFollowRedirect(Boolean followRedirect) {
    this.followRedirect = followRedirect;
  }

  public OriginConf policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @Schema(description = "")
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public OriginConf redirectCode(Long redirectCode) {
    this.redirectCode = redirectCode;
    return this;
  }

   /**
   * Get redirectCode
   * @return redirectCode
  **/
  @Schema(description = "")
  public Long getRedirectCode() {
    return redirectCode;
  }

  public void setRedirectCode(Long redirectCode) {
    this.redirectCode = redirectCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginConf originConf = (OriginConf) o;
    return Objects.equals(this.classId, originConf.classId) &&
        Objects.equals(this.className, originConf.className) &&
        Objects.equals(this.deleteOrigin, originConf.deleteOrigin) &&
        Objects.equals(this.expirationDays, originConf.expirationDays) &&
        Objects.equals(this.followRedirect, originConf.followRedirect) &&
        Objects.equals(this.policyId, originConf.policyId) &&
        Objects.equals(this.redirectCode, originConf.redirectCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classId, className, deleteOrigin, expirationDays, followRedirect, policyId, redirectCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginConf {\n");
    
    sb.append("    classId: ").append(toIndentedString(classId)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    deleteOrigin: ").append(toIndentedString(deleteOrigin)).append("\n");
    sb.append("    expirationDays: ").append(toIndentedString(expirationDays)).append("\n");
    sb.append("    followRedirect: ").append(toIndentedString(followRedirect)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    redirectCode: ").append(toIndentedString(redirectCode)).append("\n");
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
