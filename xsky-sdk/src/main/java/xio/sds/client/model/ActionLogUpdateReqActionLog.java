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
import org.threeten.bp.OffsetDateTime;
/**
 * ActionLogUpdateReqActionLog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ActionLogUpdateReqActionLog {
  @SerializedName("finish")
  private OffsetDateTime finish = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("new_data")
  private String newData = null;

  @SerializedName("status")
  private String status = null;

  public ActionLogUpdateReqActionLog finish(OffsetDateTime finish) {
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @Schema(description = "")
  public OffsetDateTime getFinish() {
    return finish;
  }

  public void setFinish(OffsetDateTime finish) {
    this.finish = finish;
  }

  public ActionLogUpdateReqActionLog message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ActionLogUpdateReqActionLog newData(String newData) {
    this.newData = newData;
    return this;
  }

   /**
   * Get newData
   * @return newData
  **/
  @Schema(description = "")
  public String getNewData() {
    return newData;
  }

  public void setNewData(String newData) {
    this.newData = newData;
  }

  public ActionLogUpdateReqActionLog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionLogUpdateReqActionLog actionLogUpdateReqActionLog = (ActionLogUpdateReqActionLog) o;
    return Objects.equals(this.finish, actionLogUpdateReqActionLog.finish) &&
        Objects.equals(this.message, actionLogUpdateReqActionLog.message) &&
        Objects.equals(this.newData, actionLogUpdateReqActionLog.newData) &&
        Objects.equals(this.status, actionLogUpdateReqActionLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finish, message, newData, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionLogUpdateReqActionLog {\n");
    
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    newData: ").append(toIndentedString(newData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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