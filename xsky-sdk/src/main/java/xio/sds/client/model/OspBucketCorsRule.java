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
/**
 * OspBucketCorsRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketCorsRule {
  @SerializedName("allowed_methods")
  private List<String> allowedMethods = null;

  @SerializedName("max_age_seconds")
  private Long maxAgeSeconds = null;

  @SerializedName("allowed_headers")
  private List<String> allowedHeaders = null;

  @SerializedName("expose_headers")
  private List<String> exposeHeaders = null;

  @SerializedName("allowed_origins")
  private List<String> allowedOrigins = null;

  @SerializedName("id")
  private String id = null;

  public OspBucketCorsRule allowedMethods(List<String> allowedMethods) {
    this.allowedMethods = allowedMethods;
    return this;
  }

  public OspBucketCorsRule addAllowedMethodsItem(String allowedMethodsItem) {
    if (this.allowedMethods == null) {
      this.allowedMethods = new ArrayList<String>();
    }
    this.allowedMethods.add(allowedMethodsItem);
    return this;
  }

   /**
   * Get allowedMethods
   * @return allowedMethods
  **/
  @Schema(description = "")
  public List<String> getAllowedMethods() {
    return allowedMethods;
  }

  public void setAllowedMethods(List<String> allowedMethods) {
    this.allowedMethods = allowedMethods;
  }

  public OspBucketCorsRule maxAgeSeconds(Long maxAgeSeconds) {
    this.maxAgeSeconds = maxAgeSeconds;
    return this;
  }

   /**
   * Get maxAgeSeconds
   * @return maxAgeSeconds
  **/
  @Schema(description = "")
  public Long getMaxAgeSeconds() {
    return maxAgeSeconds;
  }

  public void setMaxAgeSeconds(Long maxAgeSeconds) {
    this.maxAgeSeconds = maxAgeSeconds;
  }

  public OspBucketCorsRule allowedHeaders(List<String> allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
    return this;
  }

  public OspBucketCorsRule addAllowedHeadersItem(String allowedHeadersItem) {
    if (this.allowedHeaders == null) {
      this.allowedHeaders = new ArrayList<String>();
    }
    this.allowedHeaders.add(allowedHeadersItem);
    return this;
  }

   /**
   * Get allowedHeaders
   * @return allowedHeaders
  **/
  @Schema(description = "")
  public List<String> getAllowedHeaders() {
    return allowedHeaders;
  }

  public void setAllowedHeaders(List<String> allowedHeaders) {
    this.allowedHeaders = allowedHeaders;
  }

  public OspBucketCorsRule exposeHeaders(List<String> exposeHeaders) {
    this.exposeHeaders = exposeHeaders;
    return this;
  }

  public OspBucketCorsRule addExposeHeadersItem(String exposeHeadersItem) {
    if (this.exposeHeaders == null) {
      this.exposeHeaders = new ArrayList<String>();
    }
    this.exposeHeaders.add(exposeHeadersItem);
    return this;
  }

   /**
   * Get exposeHeaders
   * @return exposeHeaders
  **/
  @Schema(description = "")
  public List<String> getExposeHeaders() {
    return exposeHeaders;
  }

  public void setExposeHeaders(List<String> exposeHeaders) {
    this.exposeHeaders = exposeHeaders;
  }

  public OspBucketCorsRule allowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
    return this;
  }

  public OspBucketCorsRule addAllowedOriginsItem(String allowedOriginsItem) {
    if (this.allowedOrigins == null) {
      this.allowedOrigins = new ArrayList<String>();
    }
    this.allowedOrigins.add(allowedOriginsItem);
    return this;
  }

   /**
   * Get allowedOrigins
   * @return allowedOrigins
  **/
  @Schema(description = "")
  public List<String> getAllowedOrigins() {
    return allowedOrigins;
  }

  public void setAllowedOrigins(List<String> allowedOrigins) {
    this.allowedOrigins = allowedOrigins;
  }

  public OspBucketCorsRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketCorsRule ospBucketCorsRule = (OspBucketCorsRule) o;
    return Objects.equals(this.allowedMethods, ospBucketCorsRule.allowedMethods) &&
        Objects.equals(this.maxAgeSeconds, ospBucketCorsRule.maxAgeSeconds) &&
        Objects.equals(this.allowedHeaders, ospBucketCorsRule.allowedHeaders) &&
        Objects.equals(this.exposeHeaders, ospBucketCorsRule.exposeHeaders) &&
        Objects.equals(this.allowedOrigins, ospBucketCorsRule.allowedOrigins) &&
        Objects.equals(this.id, ospBucketCorsRule.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedMethods, maxAgeSeconds, allowedHeaders, exposeHeaders, allowedOrigins, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketCorsRule {\n");
    
    sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
    sb.append("    maxAgeSeconds: ").append(toIndentedString(maxAgeSeconds)).append("\n");
    sb.append("    allowedHeaders: ").append(toIndentedString(allowedHeaders)).append("\n");
    sb.append("    exposeHeaders: ").append(toIndentedString(exposeHeaders)).append("\n");
    sb.append("    allowedOrigins: ").append(toIndentedString(allowedOrigins)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
