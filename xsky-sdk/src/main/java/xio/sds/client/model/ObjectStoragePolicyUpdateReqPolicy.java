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
 * ObjectStoragePolicyUpdateReqPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStoragePolicyUpdateReqPolicy {
  @SerializedName("cache_pool_id")
  private Long cachePoolId = null;

  @SerializedName("compress")
  private Boolean compress = null;

  @SerializedName("crypto")
  private Boolean crypto = null;

  @SerializedName("deduplication")
  private Boolean deduplication = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("shared")
  private Boolean shared = null;

  public ObjectStoragePolicyUpdateReqPolicy cachePoolId(Long cachePoolId) {
    this.cachePoolId = cachePoolId;
    return this;
  }

   /**
   * Get cachePoolId
   * @return cachePoolId
  **/
  @Schema(description = "")
  public Long getCachePoolId() {
    return cachePoolId;
  }

  public void setCachePoolId(Long cachePoolId) {
    this.cachePoolId = cachePoolId;
  }

  public ObjectStoragePolicyUpdateReqPolicy compress(Boolean compress) {
    this.compress = compress;
    return this;
  }

   /**
   * Get compress
   * @return compress
  **/
  @Schema(description = "")
  public Boolean isCompress() {
    return compress;
  }

  public void setCompress(Boolean compress) {
    this.compress = compress;
  }

  public ObjectStoragePolicyUpdateReqPolicy crypto(Boolean crypto) {
    this.crypto = crypto;
    return this;
  }

   /**
   * Get crypto
   * @return crypto
  **/
  @Schema(description = "")
  public Boolean isCrypto() {
    return crypto;
  }

  public void setCrypto(Boolean crypto) {
    this.crypto = crypto;
  }

  public ObjectStoragePolicyUpdateReqPolicy deduplication(Boolean deduplication) {
    this.deduplication = deduplication;
    return this;
  }

   /**
   * Get deduplication
   * @return deduplication
  **/
  @Schema(description = "")
  public Boolean isDeduplication() {
    return deduplication;
  }

  public void setDeduplication(Boolean deduplication) {
    this.deduplication = deduplication;
  }

  public ObjectStoragePolicyUpdateReqPolicy _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public ObjectStoragePolicyUpdateReqPolicy description(String description) {
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

  public ObjectStoragePolicyUpdateReqPolicy shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @Schema(description = "")
  public Boolean isShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStoragePolicyUpdateReqPolicy objectStoragePolicyUpdateReqPolicy = (ObjectStoragePolicyUpdateReqPolicy) o;
    return Objects.equals(this.cachePoolId, objectStoragePolicyUpdateReqPolicy.cachePoolId) &&
        Objects.equals(this.compress, objectStoragePolicyUpdateReqPolicy.compress) &&
        Objects.equals(this.crypto, objectStoragePolicyUpdateReqPolicy.crypto) &&
        Objects.equals(this.deduplication, objectStoragePolicyUpdateReqPolicy.deduplication) &&
        Objects.equals(this._default, objectStoragePolicyUpdateReqPolicy._default) &&
        Objects.equals(this.description, objectStoragePolicyUpdateReqPolicy.description) &&
        Objects.equals(this.shared, objectStoragePolicyUpdateReqPolicy.shared);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachePoolId, compress, crypto, deduplication, _default, description, shared);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStoragePolicyUpdateReqPolicy {\n");
    
    sb.append("    cachePoolId: ").append(toIndentedString(cachePoolId)).append("\n");
    sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
    sb.append("    crypto: ").append(toIndentedString(crypto)).append("\n");
    sb.append("    deduplication: ").append(toIndentedString(deduplication)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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