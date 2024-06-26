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
import xio.sds.client.model.OspBucketEncryptionRule;
/**
 * OspBucketSetEncryptionDefaultReqInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketSetEncryptionDefaultReqInfo {
  @SerializedName("rules")
  private List<OspBucketEncryptionRule> rules = null;

  @SerializedName("encryption_type")
  private String encryptionType = null;

  @SerializedName("sse_kms_key")
  private String sseKmsKey = null;

  @SerializedName("encryption_default")
  private Boolean encryptionDefault = null;

  public OspBucketSetEncryptionDefaultReqInfo rules(List<OspBucketEncryptionRule> rules) {
    this.rules = rules;
    return this;
  }

  public OspBucketSetEncryptionDefaultReqInfo addRulesItem(OspBucketEncryptionRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<OspBucketEncryptionRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @Schema(description = "")
  public List<OspBucketEncryptionRule> getRules() {
    return rules;
  }

  public void setRules(List<OspBucketEncryptionRule> rules) {
    this.rules = rules;
  }

  public OspBucketSetEncryptionDefaultReqInfo encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * Get encryptionType
   * @return encryptionType
  **/
  @Schema(description = "")
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }

  public OspBucketSetEncryptionDefaultReqInfo sseKmsKey(String sseKmsKey) {
    this.sseKmsKey = sseKmsKey;
    return this;
  }

   /**
   * Get sseKmsKey
   * @return sseKmsKey
  **/
  @Schema(description = "")
  public String getSseKmsKey() {
    return sseKmsKey;
  }

  public void setSseKmsKey(String sseKmsKey) {
    this.sseKmsKey = sseKmsKey;
  }

  public OspBucketSetEncryptionDefaultReqInfo encryptionDefault(Boolean encryptionDefault) {
    this.encryptionDefault = encryptionDefault;
    return this;
  }

   /**
   * Get encryptionDefault
   * @return encryptionDefault
  **/
  @Schema(description = "")
  public Boolean isEncryptionDefault() {
    return encryptionDefault;
  }

  public void setEncryptionDefault(Boolean encryptionDefault) {
    this.encryptionDefault = encryptionDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketSetEncryptionDefaultReqInfo ospBucketSetEncryptionDefaultReqInfo = (OspBucketSetEncryptionDefaultReqInfo) o;
    return Objects.equals(this.rules, ospBucketSetEncryptionDefaultReqInfo.rules) &&
        Objects.equals(this.encryptionType, ospBucketSetEncryptionDefaultReqInfo.encryptionType) &&
        Objects.equals(this.sseKmsKey, ospBucketSetEncryptionDefaultReqInfo.sseKmsKey) &&
        Objects.equals(this.encryptionDefault, ospBucketSetEncryptionDefaultReqInfo.encryptionDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules, encryptionType, sseKmsKey, encryptionDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketSetEncryptionDefaultReqInfo {\n");
    
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    sseKmsKey: ").append(toIndentedString(sseKmsKey)).append("\n");
    sb.append("    encryptionDefault: ").append(toIndentedString(encryptionDefault)).append("\n");
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
