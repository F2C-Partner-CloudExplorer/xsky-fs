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
 * ErrorRecordCreateReqErrorRecord
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ErrorRecordCreateReqErrorRecord {
  @SerializedName("action_log_id")
  private Long actionLogId = null;

  @SerializedName("alert_id")
  private Long alertId = null;

  @SerializedName("host_id")
  private Long hostId = null;

  @SerializedName("message")
  private String message = null;

  public ErrorRecordCreateReqErrorRecord actionLogId(Long actionLogId) {
    this.actionLogId = actionLogId;
    return this;
  }

   /**
   * Get actionLogId
   * @return actionLogId
  **/
  @Schema(description = "")
  public Long getActionLogId() {
    return actionLogId;
  }

  public void setActionLogId(Long actionLogId) {
    this.actionLogId = actionLogId;
  }

  public ErrorRecordCreateReqErrorRecord alertId(Long alertId) {
    this.alertId = alertId;
    return this;
  }

   /**
   * Get alertId
   * @return alertId
  **/
  @Schema(description = "")
  public Long getAlertId() {
    return alertId;
  }

  public void setAlertId(Long alertId) {
    this.alertId = alertId;
  }

  public ErrorRecordCreateReqErrorRecord hostId(Long hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * Get hostId
   * @return hostId
  **/
  @Schema(description = "")
  public Long getHostId() {
    return hostId;
  }

  public void setHostId(Long hostId) {
    this.hostId = hostId;
  }

  public ErrorRecordCreateReqErrorRecord message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(required = true, description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorRecordCreateReqErrorRecord errorRecordCreateReqErrorRecord = (ErrorRecordCreateReqErrorRecord) o;
    return Objects.equals(this.actionLogId, errorRecordCreateReqErrorRecord.actionLogId) &&
        Objects.equals(this.alertId, errorRecordCreateReqErrorRecord.alertId) &&
        Objects.equals(this.hostId, errorRecordCreateReqErrorRecord.hostId) &&
        Objects.equals(this.message, errorRecordCreateReqErrorRecord.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionLogId, alertId, hostId, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRecordCreateReqErrorRecord {\n");
    
    sb.append("    actionLogId: ").append(toIndentedString(actionLogId)).append("\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
