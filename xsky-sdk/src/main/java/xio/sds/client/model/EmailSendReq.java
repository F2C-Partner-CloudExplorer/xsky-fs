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
import xio.sds.client.model.EmailConfig;
import xio.sds.client.model.EmailSendReqEmail;
/**
 * EmailSendReq defines the data of email sending
 */
@Schema(description = "EmailSendReq defines the data of email sending")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class EmailSendReq {
  @SerializedName("email")
  private EmailSendReqEmail email = null;

  @SerializedName("email_config")
  private EmailConfig emailConfig = null;

  public EmailSendReq email(EmailSendReqEmail email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public EmailSendReqEmail getEmail() {
    return email;
  }

  public void setEmail(EmailSendReqEmail email) {
    this.email = email;
  }

  public EmailSendReq emailConfig(EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
    return this;
  }

   /**
   * Get emailConfig
   * @return emailConfig
  **/
  @Schema(description = "")
  public EmailConfig getEmailConfig() {
    return emailConfig;
  }

  public void setEmailConfig(EmailConfig emailConfig) {
    this.emailConfig = emailConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSendReq emailSendReq = (EmailSendReq) o;
    return Objects.equals(this.email, emailSendReq.email) &&
        Objects.equals(this.emailConfig, emailSendReq.emailConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, emailConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSendReq {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailConfig: ").append(toIndentedString(emailConfig)).append("\n");
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
