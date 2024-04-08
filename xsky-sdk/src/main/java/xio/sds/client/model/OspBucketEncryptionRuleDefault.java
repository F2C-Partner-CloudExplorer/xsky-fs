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
 * OspBucketEncryptionRuleDefault
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketEncryptionRuleDefault {
  @SerializedName("sse_algorithm")
  private String sseAlgorithm = null;

  @SerializedName("kms_master_key_id")
  private String kmsMasterKeyId = null;

  public OspBucketEncryptionRuleDefault sseAlgorithm(String sseAlgorithm) {
    this.sseAlgorithm = sseAlgorithm;
    return this;
  }

   /**
   * Get sseAlgorithm
   * @return sseAlgorithm
  **/
  @Schema(description = "")
  public String getSseAlgorithm() {
    return sseAlgorithm;
  }

  public void setSseAlgorithm(String sseAlgorithm) {
    this.sseAlgorithm = sseAlgorithm;
  }

  public OspBucketEncryptionRuleDefault kmsMasterKeyId(String kmsMasterKeyId) {
    this.kmsMasterKeyId = kmsMasterKeyId;
    return this;
  }

   /**
   * Get kmsMasterKeyId
   * @return kmsMasterKeyId
  **/
  @Schema(description = "")
  public String getKmsMasterKeyId() {
    return kmsMasterKeyId;
  }

  public void setKmsMasterKeyId(String kmsMasterKeyId) {
    this.kmsMasterKeyId = kmsMasterKeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketEncryptionRuleDefault ospBucketEncryptionRuleDefault = (OspBucketEncryptionRuleDefault) o;
    return Objects.equals(this.sseAlgorithm, ospBucketEncryptionRuleDefault.sseAlgorithm) &&
        Objects.equals(this.kmsMasterKeyId, ospBucketEncryptionRuleDefault.kmsMasterKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sseAlgorithm, kmsMasterKeyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketEncryptionRuleDefault {\n");
    
    sb.append("    sseAlgorithm: ").append(toIndentedString(sseAlgorithm)).append("\n");
    sb.append("    kmsMasterKeyId: ").append(toIndentedString(kmsMasterKeyId)).append("\n");
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