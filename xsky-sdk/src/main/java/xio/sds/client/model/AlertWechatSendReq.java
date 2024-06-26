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
import xio.sds.client.model.AlertWechatSendReqAlertWechatConfig;
import xio.sds.client.model.AlertWechatSendReqAlertWechatSend;
/**
 * AlertWechatSendReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertWechatSendReq {
  @SerializedName("alert_wechat_config")
  private AlertWechatSendReqAlertWechatConfig alertWechatConfig = null;

  @SerializedName("alert_wechat_send")
  private AlertWechatSendReqAlertWechatSend alertWechatSend = null;

  public AlertWechatSendReq alertWechatConfig(AlertWechatSendReqAlertWechatConfig alertWechatConfig) {
    this.alertWechatConfig = alertWechatConfig;
    return this;
  }

   /**
   * Get alertWechatConfig
   * @return alertWechatConfig
  **/
  @Schema(description = "")
  public AlertWechatSendReqAlertWechatConfig getAlertWechatConfig() {
    return alertWechatConfig;
  }

  public void setAlertWechatConfig(AlertWechatSendReqAlertWechatConfig alertWechatConfig) {
    this.alertWechatConfig = alertWechatConfig;
  }

  public AlertWechatSendReq alertWechatSend(AlertWechatSendReqAlertWechatSend alertWechatSend) {
    this.alertWechatSend = alertWechatSend;
    return this;
  }

   /**
   * Get alertWechatSend
   * @return alertWechatSend
  **/
  @Schema(required = true, description = "")
  public AlertWechatSendReqAlertWechatSend getAlertWechatSend() {
    return alertWechatSend;
  }

  public void setAlertWechatSend(AlertWechatSendReqAlertWechatSend alertWechatSend) {
    this.alertWechatSend = alertWechatSend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertWechatSendReq alertWechatSendReq = (AlertWechatSendReq) o;
    return Objects.equals(this.alertWechatConfig, alertWechatSendReq.alertWechatConfig) &&
        Objects.equals(this.alertWechatSend, alertWechatSendReq.alertWechatSend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertWechatConfig, alertWechatSend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertWechatSendReq {\n");
    
    sb.append("    alertWechatConfig: ").append(toIndentedString(alertWechatConfig)).append("\n");
    sb.append("    alertWechatSend: ").append(toIndentedString(alertWechatSend)).append("\n");
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
