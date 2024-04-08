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
 * AlertDingDingConfigUpdateReqAlertDingDingConfig
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertDingDingConfigUpdateReqAlertDingDingConfig {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("rsa_key_id")
  private String rsaKeyId = null;

  @SerializedName("webhook_url")
  private String webhookUrl = null;

  public AlertDingDingConfigUpdateReqAlertDingDingConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AlertDingDingConfigUpdateReqAlertDingDingConfig password(String password) {
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

  public AlertDingDingConfigUpdateReqAlertDingDingConfig rsaKeyId(String rsaKeyId) {
    this.rsaKeyId = rsaKeyId;
    return this;
  }

   /**
   * Get rsaKeyId
   * @return rsaKeyId
  **/
  @Schema(description = "")
  public String getRsaKeyId() {
    return rsaKeyId;
  }

  public void setRsaKeyId(String rsaKeyId) {
    this.rsaKeyId = rsaKeyId;
  }

  public AlertDingDingConfigUpdateReqAlertDingDingConfig webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @Schema(description = "")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertDingDingConfigUpdateReqAlertDingDingConfig alertDingDingConfigUpdateReqAlertDingDingConfig = (AlertDingDingConfigUpdateReqAlertDingDingConfig) o;
    return Objects.equals(this.enabled, alertDingDingConfigUpdateReqAlertDingDingConfig.enabled) &&
        Objects.equals(this.password, alertDingDingConfigUpdateReqAlertDingDingConfig.password) &&
        Objects.equals(this.rsaKeyId, alertDingDingConfigUpdateReqAlertDingDingConfig.rsaKeyId) &&
        Objects.equals(this.webhookUrl, alertDingDingConfigUpdateReqAlertDingDingConfig.webhookUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, password, rsaKeyId, webhookUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertDingDingConfigUpdateReqAlertDingDingConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rsaKeyId: ").append(toIndentedString(rsaKeyId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
